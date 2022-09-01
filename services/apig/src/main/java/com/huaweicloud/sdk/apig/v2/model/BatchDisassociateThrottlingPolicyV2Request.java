package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDisassociateThrottlingPolicyV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ThrottleBindingBatchDelete body;

    public BatchDisassociateThrottlingPolicyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchDisassociateThrottlingPolicyV2Request withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 必须为delete
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BatchDisassociateThrottlingPolicyV2Request withBody(ThrottleBindingBatchDelete body) {
        this.body = body;
        return this;
    }

    public BatchDisassociateThrottlingPolicyV2Request withBody(Consumer<ThrottleBindingBatchDelete> bodySetter) {
        if (this.body == null) {
            this.body = new ThrottleBindingBatchDelete();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ThrottleBindingBatchDelete getBody() {
        return body;
    }

    public void setBody(ThrottleBindingBatchDelete body) {
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
        BatchDisassociateThrottlingPolicyV2Request batchDisassociateThrottlingPolicyV2Request =
            (BatchDisassociateThrottlingPolicyV2Request) o;
        return Objects.equals(this.instanceId, batchDisassociateThrottlingPolicyV2Request.instanceId)
            && Objects.equals(this.action, batchDisassociateThrottlingPolicyV2Request.action)
            && Objects.equals(this.body, batchDisassociateThrottlingPolicyV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, action, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDisassociateThrottlingPolicyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
