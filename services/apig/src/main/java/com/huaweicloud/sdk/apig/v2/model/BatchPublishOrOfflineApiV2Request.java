package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchPublishOrOfflineApiV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ApiBatchPublish body;

    public BatchPublishOrOfflineApiV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchPublishOrOfflineApiV2Request withAction(String action) {
        this.action = action;
        return this;
    }

    /** - online：发布 - offline：下线
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BatchPublishOrOfflineApiV2Request withBody(ApiBatchPublish body) {
        this.body = body;
        return this;
    }

    public BatchPublishOrOfflineApiV2Request withBody(Consumer<ApiBatchPublish> bodySetter) {
        if (this.body == null) {
            this.body = new ApiBatchPublish();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ApiBatchPublish getBody() {
        return body;
    }

    public void setBody(ApiBatchPublish body) {
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
        BatchPublishOrOfflineApiV2Request batchPublishOrOfflineApiV2Request = (BatchPublishOrOfflineApiV2Request) o;
        return Objects.equals(this.instanceId, batchPublishOrOfflineApiV2Request.instanceId)
            && Objects.equals(this.action, batchPublishOrOfflineApiV2Request.action)
            && Objects.equals(this.body, batchPublishOrOfflineApiV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, action, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchPublishOrOfflineApiV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
