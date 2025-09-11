package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateIpdProjectIssueAttachmentRequestBody
 */
public class CreateIpdProjectIssueAttachmentRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "attachment", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart attachment;

    public CreateIpdProjectIssueAttachmentRequestBody withAttachment(FormDataFilePart attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * 附件文件， 最大上传大小为200M
     * @return attachment
     */
    public FormDataFilePart getAttachment() {
        return attachment;
    }

    public void setAttachment(FormDataFilePart attachment) {
        this.attachment = attachment;
    }

    public CreateIpdProjectIssueAttachmentRequestBody withAttachment(InputStream inputStream, String fileName,
        String contentType) {
        this.attachment = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CreateIpdProjectIssueAttachmentRequestBody withAttachment(InputStream inputStream, String fileName) {
        this.attachment = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CreateIpdProjectIssueAttachmentRequestBody withAttachment(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.attachment = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("attachment", attachment);
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIpdProjectIssueAttachmentRequestBody that = (CreateIpdProjectIssueAttachmentRequestBody) obj;
        return Objects.equals(this.attachment, that.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIpdProjectIssueAttachmentRequestBody {\n");
        sb.append("    attachment: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
