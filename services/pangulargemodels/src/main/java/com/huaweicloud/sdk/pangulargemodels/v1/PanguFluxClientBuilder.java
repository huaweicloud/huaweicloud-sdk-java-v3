package com.huaweicloud.sdk.pangulargemodels.v1;

import org.springframework.http.HttpHeaders;

import java.util.function.Consumer;

public class PanguFluxClientBuilder {
    private String panguEndpoint;

    private String projectId;

    private String deploymentId;

    private Consumer<HttpHeaders> headersConsumer;

    public PanguFluxClientBuilder withPanguEndpoint(String panguEndpoint) {
        this.panguEndpoint = panguEndpoint;
        return this;
    }

    public PanguFluxClientBuilder withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public PanguFluxClientBuilder withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    public PanguFluxClientBuilder withAuthToken(String authToken) {
        this.headersConsumer = httpHeaders -> {
            httpHeaders.set("x-auth-token", authToken);
            httpHeaders.set("Inference-Type", "stream");
        };
        return this;
    }

    public PanguLargeModelsFluxClient build() {
        return new PanguLargeModelsFluxClient(panguEndpoint, projectId, deploymentId, headersConsumer);
    }
}
