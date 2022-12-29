package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateDeploymentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Expired-Time")

    private Integer xExpiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeploymentCreateRequest body;

    public CreateDeploymentRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 平台提供者，分别为hilens及ief。当为hilens时，请求部署在hilens平台的相关数据
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CreateDeploymentRequest withXExpiredTime(Integer xExpiredTime) {
        this.xExpiredTime = xExpiredTime;
        return this;
    }

    /**
     * 离线场景超期时间，单位分钟，范围在1-86400
     * @return xExpiredTime
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Expired-Time")
    public Integer getXExpiredTime() {
        return xExpiredTime;
    }

    public void setXExpiredTime(Integer xExpiredTime) {
        this.xExpiredTime = xExpiredTime;
    }

    public CreateDeploymentRequest withBody(DeploymentCreateRequest body) {
        this.body = body;
        return this;
    }

    public CreateDeploymentRequest withBody(Consumer<DeploymentCreateRequest> bodySetter) {
        if (this.body == null) {
            this.body = new DeploymentCreateRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeploymentCreateRequest getBody() {
        return body;
    }

    public void setBody(DeploymentCreateRequest body) {
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
        CreateDeploymentRequest createDeploymentRequest = (CreateDeploymentRequest) o;
        return Objects.equals(this.provider, createDeploymentRequest.provider)
            && Objects.equals(this.xExpiredTime, createDeploymentRequest.xExpiredTime)
            && Objects.equals(this.body, createDeploymentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, xExpiredTime, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentRequest {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    xExpiredTime: ").append(toIndentedString(xExpiredTime)).append("\n");
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
