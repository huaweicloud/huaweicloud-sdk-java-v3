package com.huaweicloud.sdk.kvs.v1.config;

import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.kvs.v1.ManagedKvsClient;
import com.huaweicloud.sdk.kvs.v1.model.Credential;
import com.huaweicloud.sdk.kvs.v1.model.Endpoint;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.ConfigurationBuilderEvent;
import org.apache.commons.configuration2.builder.ReloadingFileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.event.Event;
import org.apache.commons.configuration2.event.EventListener;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.reloading.PeriodicReloadingTrigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class KvsSdkConfigManager {
    private static final Logger LOG = LoggerFactory.getLogger(KvsSdkConfigManager.class);

    private final Boolean isAsyncClient;

    ReloadingFileBasedConfigurationBuilder<PropertiesConfiguration> configBuilder;

    private KvsSdkConfig sdkConfig;

    private final Credential credential = new Credential();

    private final ConcurrentLinkedDeque<Endpoint> endpoints = new ConcurrentLinkedDeque<>();

    public KvsSdkConfigManager(String configFilePath, Boolean isAsyncClient,
        ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap,
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ManagedKvsClient>> oldKvsClientMaps,
        HttpConfig customizeHttpConfig)
        throws ConfigurationException {
        this.isAsyncClient = isAsyncClient;
        Parameters params = new Parameters();
        File propertiesFile = new File(configFilePath);
        this.configBuilder = new ReloadingFileBasedConfigurationBuilder<>(PropertiesConfiguration.class).configure(
            params.fileBased().setFile(propertiesFile).setListDelimiterHandler(new DefaultListDelimiterHandler(',')));

        LOG.info("load KVS-SDK config file: " + configFilePath);
        reloadConfig(kvsClientMap, oldKvsClientMaps);

        if (customizeHttpConfig != null) {
            sdkConfig.setCustomizeHttpConfig(customizeHttpConfig);
        }

        configBuilder.addEventListener(ConfigurationBuilderEvent.RESET,
            new EventListener() {
                @Override
                public void onEvent(Event event) {
                    try {
                        LOG.info("load KVS-SDK config file: " + configFilePath);
                        reloadConfig(kvsClientMap, oldKvsClientMaps);
                    } catch (ConfigurationException e) {
                        LOG.error("reload kvs sdk config file throw exception!", e);
                        throw new SdkException(e);
                    }
                }
            });

        PeriodicReloadingTrigger trigger = new PeriodicReloadingTrigger(configBuilder.getReloadingController(),
            null, sdkConfig.getReloadInterval(), TimeUnit.SECONDS);
        trigger.start();
    }

    public KvsSdkConfig getConfig() {
        return this.sdkConfig;
    }

    private void reloadConfig(ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap,
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ManagedKvsClient>> oldKvsClientMaps)
        throws ConfigurationException {
        PropertiesConfiguration config = configBuilder.getConfiguration();
        sdkConfig = new KvsSdkConfig(config, isAsyncClient);
        reloadAKSKConfig(kvsClientMap, oldKvsClientMaps);
        reloadEndPointConfig(kvsClientMap);
    }

    private void reloadAKSKConfig(ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap,
        ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ManagedKvsClient>> oldKvsClientMaps) {
        if (credential.getAk() == null || !credential.getAk().equals(sdkConfig.getAK()) || credential.getSk() == null
            || !credential.getSk()
            .equals(sdkConfig.getSK())) {
            credential.setAk(sdkConfig.getAK());
            credential.setSk(sdkConfig.getSK());
            credential.setStsToken(sdkConfig.getStsToken());

            ConcurrentHashMap<Integer, ManagedKvsClient> newKvsClientMap = new ConcurrentHashMap<>(kvsClientMap);
            endpoints.clear();
            kvsClientMap.clear();
            oldKvsClientMaps.put(System.currentTimeMillis(), newKvsClientMap);
        }
    }

    private void reloadEndPointConfig(ConcurrentHashMap<Integer, ManagedKvsClient> kvsClientMap) {
        for (Endpoint endpoint : getNewEndpoints()) {
            ManagedKvsClient newKvsClient = new ManagedKvsClient(endpoint, sdkConfig);
            endpoints.add(endpoint);
            kvsClientMap.put(kvsClientMap.size() + 1, newKvsClient);
        }
    }

    private List<Endpoint> getNewEndpoints() {
        List<Endpoint> newEndpointList = sdkConfig.loadEndPointList();
        return newEndpointList.stream()
            .filter(newEndpoint -> !endpoints.stream()
                .map(Endpoint::getName)
                .collect(Collectors.toList())
                .contains(newEndpoint.getName()))
            .collect(Collectors.toList());
    }
}
