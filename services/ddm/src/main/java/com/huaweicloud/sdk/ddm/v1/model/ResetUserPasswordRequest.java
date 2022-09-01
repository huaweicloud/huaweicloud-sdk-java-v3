package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResetUserPasswordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    @JacksonXmlProperty(localName = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ResetUserPasswordReq body;

    public ResetUserPasswordRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DDM实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ResetUserPasswordRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 需要修改的DDM帐号名称。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ResetUserPasswordRequest withBody(ResetUserPasswordReq body) {
        this.body = body;
        return this;
    }

    public ResetUserPasswordRequest withBody(Consumer<ResetUserPasswordReq> bodySetter) {
        if (this.body == null) {
            this.body = new ResetUserPasswordReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResetUserPasswordReq getBody() {
        return body;
    }

    public void setBody(ResetUserPasswordReq body) {
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
        ResetUserPasswordRequest resetUserPasswordRequest = (ResetUserPasswordRequest) o;
        return Objects.equals(this.instanceId, resetUserPasswordRequest.instanceId)
            && Objects.equals(this.username, resetUserPasswordRequest.username)
            && Objects.equals(this.body, resetUserPasswordRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, username, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetUserPasswordRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
