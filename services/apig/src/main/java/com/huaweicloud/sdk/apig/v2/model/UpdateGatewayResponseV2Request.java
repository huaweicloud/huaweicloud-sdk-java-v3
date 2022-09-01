package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGatewayResponseV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_id")

    @JacksonXmlProperty(localName = "response_id")

    private String responseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ResponsesCreate body;

    public UpdateGatewayResponseV2Request withInstanceId(String instanceId) {
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

    public UpdateGatewayResponseV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组的编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateGatewayResponseV2Request withResponseId(String responseId) {
        this.responseId = responseId;
        return this;
    }

    /**
     * 响应编号
     * @return responseId
     */
    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public UpdateGatewayResponseV2Request withBody(ResponsesCreate body) {
        this.body = body;
        return this;
    }

    public UpdateGatewayResponseV2Request withBody(Consumer<ResponsesCreate> bodySetter) {
        if (this.body == null) {
            this.body = new ResponsesCreate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResponsesCreate getBody() {
        return body;
    }

    public void setBody(ResponsesCreate body) {
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
        UpdateGatewayResponseV2Request updateGatewayResponseV2Request = (UpdateGatewayResponseV2Request) o;
        return Objects.equals(this.instanceId, updateGatewayResponseV2Request.instanceId)
            && Objects.equals(this.groupId, updateGatewayResponseV2Request.groupId)
            && Objects.equals(this.responseId, updateGatewayResponseV2Request.responseId)
            && Objects.equals(this.body, updateGatewayResponseV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, responseId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGatewayResponseV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
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
