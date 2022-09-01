package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchAddDeviceToGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private BatchAddDeviceToGroupRequestBody body;

    public BatchAddDeviceToGroupRequest withInstanceId(String instanceId) {
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

    public BatchAddDeviceToGroupRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 设备分组ID
     * minimum: 0
     * maximum: 200376420520689663
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public BatchAddDeviceToGroupRequest withBody(BatchAddDeviceToGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchAddDeviceToGroupRequest withBody(Consumer<BatchAddDeviceToGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchAddDeviceToGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchAddDeviceToGroupRequestBody getBody() {
        return body;
    }

    public void setBody(BatchAddDeviceToGroupRequestBody body) {
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
        BatchAddDeviceToGroupRequest batchAddDeviceToGroupRequest = (BatchAddDeviceToGroupRequest) o;
        return Objects.equals(this.instanceId, batchAddDeviceToGroupRequest.instanceId)
            && Objects.equals(this.groupId, batchAddDeviceToGroupRequest.groupId)
            && Objects.equals(this.body, batchAddDeviceToGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddDeviceToGroupRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
