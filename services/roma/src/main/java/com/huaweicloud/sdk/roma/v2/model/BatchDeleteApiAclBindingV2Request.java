package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteApiAclBindingV2Request {

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

    private AclBindingBatchDelete body;

    public BatchDeleteApiAclBindingV2Request withInstanceId(String instanceId) {
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

    public BatchDeleteApiAclBindingV2Request withAction(String action) {
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

    public BatchDeleteApiAclBindingV2Request withBody(AclBindingBatchDelete body) {
        this.body = body;
        return this;
    }

    public BatchDeleteApiAclBindingV2Request withBody(Consumer<AclBindingBatchDelete> bodySetter) {
        if (this.body == null) {
            this.body = new AclBindingBatchDelete();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AclBindingBatchDelete getBody() {
        return body;
    }

    public void setBody(AclBindingBatchDelete body) {
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
        BatchDeleteApiAclBindingV2Request batchDeleteApiAclBindingV2Request = (BatchDeleteApiAclBindingV2Request) o;
        return Objects.equals(this.instanceId, batchDeleteApiAclBindingV2Request.instanceId)
            && Objects.equals(this.action, batchDeleteApiAclBindingV2Request.action)
            && Objects.equals(this.body, batchDeleteApiAclBindingV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, action, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteApiAclBindingV2Request {\n");
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
