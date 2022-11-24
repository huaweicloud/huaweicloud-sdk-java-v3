package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAttachmentRequestBody
 */
public class UpdateAttachmentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    private UpdateAttachmentBody attachment;

    public UpdateAttachmentRequestBody withAttachment(UpdateAttachmentBody attachment) {
        this.attachment = attachment;
        return this;
    }

    public UpdateAttachmentRequestBody withAttachment(Consumer<UpdateAttachmentBody> attachmentSetter) {
        if (this.attachment == null) {
            this.attachment = new UpdateAttachmentBody();
            attachmentSetter.accept(this.attachment);
        }

        return this;
    }

    /**
     * Get attachment
     * @return attachment
     */
    public UpdateAttachmentBody getAttachment() {
        return attachment;
    }

    public void setAttachment(UpdateAttachmentBody attachment) {
        this.attachment = attachment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAttachmentRequestBody updateAttachmentRequestBody = (UpdateAttachmentRequestBody) o;
        return Objects.equals(this.attachment, updateAttachmentRequestBody.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAttachmentRequestBody {\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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
