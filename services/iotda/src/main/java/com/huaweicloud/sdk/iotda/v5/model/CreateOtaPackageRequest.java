package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateOtaPackageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Sp-Auth-Token")

    private String spAuthToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateOtaPackage body;

    public CreateOtaPackageRequest withSpAuthToken(String spAuthToken) {
        this.spAuthToken = spAuthToken;
        return this;
    }

    /**
     * Sp用户Token。通过调用IoBPS服务获取SP用户Token
     * @return spAuthToken
     */
    public String getSpAuthToken() {
        return spAuthToken;
    }

    public void setSpAuthToken(String spAuthToken) {
        this.spAuthToken = spAuthToken;
    }

    public CreateOtaPackageRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateOtaPackageRequest withBody(CreateOtaPackage body) {
        this.body = body;
        return this;
    }

    public CreateOtaPackageRequest withBody(Consumer<CreateOtaPackage> bodySetter) {
        if (this.body == null) {
            this.body = new CreateOtaPackage();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateOtaPackage getBody() {
        return body;
    }

    public void setBody(CreateOtaPackage body) {
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
        CreateOtaPackageRequest createOtaPackageRequest = (CreateOtaPackageRequest) o;
        return Objects.equals(this.spAuthToken, createOtaPackageRequest.spAuthToken)
            && Objects.equals(this.instanceId, createOtaPackageRequest.instanceId)
            && Objects.equals(this.body, createOtaPackageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spAuthToken, instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOtaPackageRequest {\n");
        sb.append("    spAuthToken: ").append(toIndentedString(spAuthToken)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
