package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class AttachProtectedInstanceReplicationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance_id")

    private String protectedInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ProtectedInstanceAttachReplicationRequestBody body;

    public AttachProtectedInstanceReplicationRequest withProtectedInstanceId(String protectedInstanceId) {
        this.protectedInstanceId = protectedInstanceId;
        return this;
    }

    /** 保护实例的ID。
     * 
     * @return protectedInstanceId */
    public String getProtectedInstanceId() {
        return protectedInstanceId;
    }

    public void setProtectedInstanceId(String protectedInstanceId) {
        this.protectedInstanceId = protectedInstanceId;
    }

    public AttachProtectedInstanceReplicationRequest withBody(ProtectedInstanceAttachReplicationRequestBody body) {
        this.body = body;
        return this;
    }

    public AttachProtectedInstanceReplicationRequest withBody(
        Consumer<ProtectedInstanceAttachReplicationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ProtectedInstanceAttachReplicationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ProtectedInstanceAttachReplicationRequestBody getBody() {
        return body;
    }

    public void setBody(ProtectedInstanceAttachReplicationRequestBody body) {
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
        AttachProtectedInstanceReplicationRequest attachProtectedInstanceReplicationRequest =
            (AttachProtectedInstanceReplicationRequest) o;
        return Objects.equals(this.protectedInstanceId, attachProtectedInstanceReplicationRequest.protectedInstanceId)
            && Objects.equals(this.body, attachProtectedInstanceReplicationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachProtectedInstanceReplicationRequest {\n");
        sb.append("    protectedInstanceId: ").append(toIndentedString(protectedInstanceId)).append("\n");
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
