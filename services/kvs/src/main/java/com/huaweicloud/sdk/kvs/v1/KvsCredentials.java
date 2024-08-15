package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;

import java.util.function.Function;

public class KvsCredentials extends BasicCredentials {
    private String projectId;

    private boolean enableBodySignature = true;

    public KvsCredentials() {
    }

    @Override
    public KvsCredentials withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public KvsCredentials withEnableBodySignature(Boolean useBodySignature) {
        this.enableBodySignature = useBodySignature;
        return this;
    }

    public void setEnableBodySignature(Boolean enableBodySignature) {
        this.enableBodySignature = enableBodySignature;
    }

    public Boolean isEnableBodySignature() {
        return enableBodySignature;
    }

    @Override
    public HttpRequest syncProcessAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        if (!enableBodySignature) {
            httpRequest = httpRequest.builder().addHeader(Constants.X_SDK_CONTENT_SHA256, Constants.UNSIGNED_PAYLOAD).build();
        }
        return super.syncProcessAuthRequest(httpRequest, httpClient);
    }

    public KvsCredentials withAk(String ak) {
        setAk(ak);
        return this;
    }

    public KvsCredentials withSk(String sk) {
        setSk(sk);
        return this;
    }

    public KvsCredentials withSecurityToken(String securityToken) {
        setSecurityToken(securityToken);
        return this;
    }

    public KvsCredentials withIdpId(String idpId) {
        setIdpId(idpId);
        return this;
    }

    public KvsCredentials withIdTokenFile(String idTokenFile) {
        setIdTokenFile(idTokenFile);
        return this;
    }

    public KvsCredentials withIamEndpoint(String iamEndpoint) {
        setIamEndpoint(iamEndpoint);
        return this;
    }

    public KvsCredentials withDerivedPredicate(Function<HttpRequest, Boolean> derivedPredicate) {
        setDerivedPredicate(derivedPredicate);
        return this;
    }

    @Override
    public KvsCredentials deepClone() {
        KvsCredentials credentials = new KvsCredentials()
                .withProjectId(projectId)
                .withAk(getAk())
                .withSk(getSk())
                .withIdpId(getIdpId())
                .withIdTokenFile(getIdTokenFile())
                .withDerivedPredicate(getDerivedPredicate())
                .withIamEndpoint(getIamEndpoint())
                .withSecurityToken(getSecurityToken());

        credentials.processDerivedAuthParams(derivedAuthServiceName, regionId);
        return credentials;
    }
}
