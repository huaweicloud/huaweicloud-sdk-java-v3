package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SwitchSlowlogDesensitizationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SwitchSlowlogDesensitizationRequestBody body;

    public SwitchSlowlogDesensitizationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，可以调用5.3.3 查询实例列表和详情接口获取。如果未申请实例，可以调用5.3.1 创建实例接口创建。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SwitchSlowlogDesensitizationRequest withBody(SwitchSlowlogDesensitizationRequestBody body) {
        this.body = body;
        return this;
    }

    public SwitchSlowlogDesensitizationRequest withBody(Consumer<SwitchSlowlogDesensitizationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SwitchSlowlogDesensitizationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SwitchSlowlogDesensitizationRequestBody getBody() {
        return body;
    }

    public void setBody(SwitchSlowlogDesensitizationRequestBody body) {
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
        SwitchSlowlogDesensitizationRequest switchSlowlogDesensitizationRequest =
            (SwitchSlowlogDesensitizationRequest) o;
        return Objects.equals(this.instanceId, switchSlowlogDesensitizationRequest.instanceId)
            && Objects.equals(this.body, switchSlowlogDesensitizationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchSlowlogDesensitizationRequest {\n");
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
