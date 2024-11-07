package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.kvs.v1.config.KvsSdkConfig;
import com.huaweicloud.sdk.kvs.v1.model.Credential;
import com.huaweicloud.sdk.kvs.v1.model.Endpoint;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

public class ManagedKvsClient {
    private final Endpoint endpoint;

    private final Credential credential;

    private final Boolean isAsyncClient;

    private KvsAsyncClient kvsAsyncClient;

    private KvsClient kvsClient;

    private final AtomicBoolean isUsable = new AtomicBoolean(true);

    public ManagedKvsClient(Endpoint endpoint, KvsSdkConfig config) {
        this.endpoint = endpoint;
        this.credential = new Credential().withAk(config.getAK())
            .withSk(config.getSK())
            .withStsToken(config.getStsToken());
        this.isAsyncClient = config.isAsyncClient();
        BasicCredentials credentials = new BasicCredentials()
            .withAk(credential.getAk())
            .withSk(credential.getSk())
            .withProjectId(config.getProjectId());
        if (credential.getStsToken() != null && !credential.getStsToken().isEmpty()) {
            credentials.withSecurityToken(credential.getStsToken());
        }

        Region region = new Region(config.getRegionId(),
            "https://" + endpoint.getName() + "." + config.getRegionId() + ".myhuaweicloud.com");

        HttpConfig httpConfig = config.getCustomizeHttpConfig();
        if (httpConfig == null) {
            httpConfig = getHttpConfigBySdkConfig(config);
        }

        if (isAsyncClient) {
            kvsAsyncClient = KvsAsyncClient.newBuilder()
                .withCredential(credentials)
                .withRegion(region)
                .withHttpConfig(httpConfig)
                .build();
        } else {
            kvsClient = KvsClient.newBuilder()
                .withCredential(credentials)
                .withRegion(region)
                .withHttpConfig(httpConfig)
                .build();
        }

    }

    private HttpConfig getHttpConfigBySdkConfig(KvsSdkConfig config) {
        HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig();
        if (config.getCaCertificatePath() != null && !config.getCaCertificatePath().isEmpty()) {
            SSLContext sslContext = getSslContext(config.getCaCertificatePath());
            httpConfig.withSSLSocketFactory(sslContext.getSocketFactory());
        } else {
            httpConfig.withIgnoreSSLVerification(true);
        }
        httpConfig.withConnectionPool(
            new ConnectionPool(config.getConnectionPoolSize(), config.getConnectionPoolKeepAliveDuration(),
                TimeUnit.MINUTES));

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(config.getDispatcherMaxRequests());
        dispatcher.setMaxRequestsPerHost(config.getDispatcherMaxRequestsPerHost());
        httpConfig.setDispatcher(dispatcher);

        httpConfig.setConnectionTimeout(config.getConnectionTimeout());
        httpConfig.setReadTimeout(config.getReadTimeout());

        if (config.getExecutorThreadPoolSize() != 0) {
            httpConfig.setExecutorService(Executors.newFixedThreadPool(config.getExecutorThreadPoolSize()));
        }
        return httpConfig;
    }

    private SSLContext getSslContext(String truststorePath) {
        try (InputStream is = Files.newInputStream(Paths.get(truststorePath))) {
            SSLContext sc = SSLContext.getInstance("TLSv1.2");
            CertificateFactory cf = CertificateFactory.getInstance("X.509");

            // 实例化密钥库
            KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
            // 获得密钥库文件流
            keystore.load(null);
            keystore.setCertificateEntry("ca-certificate", cf.generateCertificate(is));

            TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            factory.init(keystore);

            SecureRandom secureRandom = SecureRandom.getInstanceStrong();
            sc.init(null, factory.getTrustManagers(), secureRandom);
            return sc;
        } catch (CertificateException | NoSuchAlgorithmException | KeyStoreException | IOException |
                 KeyManagementException e) {
            throw new SdkException(e);
        }
    }

    public Boolean isAsyncClient() {
        return this.isAsyncClient;
    }

    public KvsAsyncClient getKvsAsyncClient() {
        return kvsAsyncClient;
    }

    public KvsClient getKvsClient() {
        return kvsClient;
    }

    public String getEndpointName() {
        return endpoint.getName();
    }

    public Integer getEndPointWeight() {
        return endpoint.getWeight();
    }

    public Boolean isUsable() {
        return isUsable.get();
    }

    public void setIsUsable(Boolean isUsable) {
        this.isUsable.set(isUsable);
    }

    public Credential getAksk() {
        return this.credential;
    }
}
