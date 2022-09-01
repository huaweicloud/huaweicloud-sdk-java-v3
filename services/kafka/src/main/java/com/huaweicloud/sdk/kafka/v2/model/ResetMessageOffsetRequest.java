package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResetMessageOffsetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    @JacksonXmlProperty(localName = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ResetMessageOffsetReq body;

    public ResetMessageOffsetRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ResetMessageOffsetRequest withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 消费组名称。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ResetMessageOffsetRequest withBody(ResetMessageOffsetReq body) {
        this.body = body;
        return this;
    }

    public ResetMessageOffsetRequest withBody(Consumer<ResetMessageOffsetReq> bodySetter) {
        if (this.body == null) {
            this.body = new ResetMessageOffsetReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResetMessageOffsetReq getBody() {
        return body;
    }

    public void setBody(ResetMessageOffsetReq body) {
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
        ResetMessageOffsetRequest resetMessageOffsetRequest = (ResetMessageOffsetRequest) o;
        return Objects.equals(this.instanceId, resetMessageOffsetRequest.instanceId)
            && Objects.equals(this.group, resetMessageOffsetRequest.group)
            && Objects.equals(this.body, resetMessageOffsetRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, group, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetMessageOffsetRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
