package com.huaweicloud.sdk.idme.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeployApplicationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeployApplicationRequestBody body;

    public DeployApplicationRequest withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 运行服务ID。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public DeployApplicationRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 待部署应用的ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public DeployApplicationRequest withBody(DeployApplicationRequestBody body) {
        this.body = body;
        return this;
    }

    public DeployApplicationRequest withBody(Consumer<DeployApplicationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DeployApplicationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeployApplicationRequestBody getBody() {
        return body;
    }

    public void setBody(DeployApplicationRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployApplicationRequest deployApplicationRequest = (DeployApplicationRequest) o;
        return Objects.equals(this.envId, deployApplicationRequest.envId)
            && Objects.equals(this.appId, deployApplicationRequest.appId)
            && Objects.equals(this.body, deployApplicationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envId, appId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployApplicationRequest {\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
