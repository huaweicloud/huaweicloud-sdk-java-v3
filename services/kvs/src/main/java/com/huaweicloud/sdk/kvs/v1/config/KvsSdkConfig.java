package com.huaweicloud.sdk.kvs.v1.config;

import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.kvs.v1.model.Endpoint;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class KvsSdkConfig {
    private static final Logger LOG = LoggerFactory.getLogger(KvsSdkConfig.class);

    private final PropertiesConfiguration config;

    private HttpConfig customizeHttpConfig;

    private Boolean isAsyncClient = false;

    public KvsSdkConfig(PropertiesConfiguration config) {
        this.config = config;
    }

    public KvsSdkConfig(PropertiesConfiguration config, Boolean isAsyncClient) {
        this.config = config;
        this.isAsyncClient = isAsyncClient;
    }

    public Boolean isAsyncClient() {
        return this.isAsyncClient;
    }

    public void setCustomizeHttpConfig(HttpConfig httpConfig) {
        this.customizeHttpConfig = httpConfig;
    }

    public HttpConfig getCustomizeHttpConfig() {
        return customizeHttpConfig;
    }

    public Integer getHeartbeatInterval() {
        return config.getInt("kvs.sdk.heartbeat.interval", 5);
    }

    public Integer getHeartbeatThreadPoolSize() {
        return config.getInt("kvs.sdk.heartbeat.threadPool.size", 5);
    }

    public Integer getReloadInterval() {
        return config.getInt("kvs.sdk.config.reloadInterval", 1);
    }

    public Integer getApiRetryCount() {
        return config.getInt("kvs.sdk.api.retryCount", 3);
    }

    public List<String> getEndpointNameList() {
        return config.getList(String.class, "kvs.sdk.endpoints.name");
    }

    public List<Integer> getEndpointWeightList() {
        return config.getList(Integer.class, "kvs.sdk.endpoints.weight");
    }

    public List<Endpoint> loadEndPointList() {
        List<Endpoint> endpointList = new ArrayList<>();
        List<String> endpointNameList = getEndpointNameList();
        List<Integer> endpointWeightList = getEndpointWeightList();

        for (int num = 0; num < endpointNameList.size(); num++) {
            Endpoint endpoint = new Endpoint();
            endpoint.setName(endpointNameList.get(num));
            if (num >= endpointWeightList.size()) {
                LOG.error("endpointWeightList size and endpointNameList size is not equal !");
                break;
            }
            endpoint.setWeight(endpointWeightList.get(num));
            endpointList.add(endpoint);
        }
        return endpointList;
    }

    public String getAK() {
        return config.getString("kvs.sdk.ak");
    }

    public String getSK() {
        return config.getString("kvs.sdk.sk");
    }

    public String getStsToken() {
        return config.getString("kvs.sdk.stsToken");
    }

    public String getRegionId() {
        return config.getString("kvs.sdk.regionId");
    }

    public String getCaCertificatePath() {
        return config.getString("kvs.sdk.ca-certificate-path");
    }

    public String getProjectId() {
        return config.getString("kvs.sdk.projectId");
    }

    public Integer getConnectionPoolSize() {
        return config.getInt("kvs.sdk.connectionPool.size", 5);
    }

    public Integer getConnectionPoolKeepAliveDuration() {
        return config.getInt("kvs.sdk.connectionPool.keepAliveDuration", 5);
    }

    public Integer getConnectionTimeout() {
        return config.getInt("kvs.sdk.connection.timeout", 60);
    }

    public Integer getReadTimeout() {
        return config.getInt("kvs.sdk.read.timeout", 120);
    }

    public Integer getExecutorThreadPoolSize() {
        return config.getInt("kvs.sdk.executorService.threadPool.size");
    }

    public Integer getDispatcherMaxRequests() {
        return config.getInt("kvs.sdk.dispatcher.maxRequests", 64);
    }

    public Integer getDispatcherMaxRequestsPerHost() {
        return config.getInt("kvs.sdk.dispatcher.maxRequestsPerHost", 5);
    }
}
