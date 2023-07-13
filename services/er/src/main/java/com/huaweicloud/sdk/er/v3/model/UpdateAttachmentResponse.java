package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAttachmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    private AttachmentResponse attachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public UpdateAttachmentResponse withAttachment(AttachmentResponse attachment) {
        this.attachment = attachment;
        return this;
    }

    public UpdateAttachmentResponse withAttachment(Consumer<AttachmentResponse> attachmentSetter) {
        if (this.attachment == null) {
            this.attachment = new AttachmentResponse();
            attachmentSetter.accept(this.attachment);
        }

        return this;
    }

    /**
     * Get attachment
     * @return attachment
     */
    public AttachmentResponse getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentResponse attachment) {
        this.attachment = attachment;
    }

    public UpdateAttachmentResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAttachmentResponse that = (UpdateAttachmentResponse) obj;
        return Objects.equals(this.attachment, that.attachment) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachment, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAttachmentResponse {\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
