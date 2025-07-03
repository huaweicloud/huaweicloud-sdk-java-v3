package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateExternalCocAttachmentRequestBody
 */
public class CreateExternalCocAttachmentRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    public CreateExternalCocAttachmentRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * 需要上传的文件，以表单的形式上传，内容为二进制binary文本。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M。
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public CreateExternalCocAttachmentRequestBody withFile(InputStream inputStream, String fileName,
        String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CreateExternalCocAttachmentRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CreateExternalCocAttachmentRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("file", file);
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
        CreateExternalCocAttachmentRequestBody that = (CreateExternalCocAttachmentRequestBody) obj;
        return Objects.equals(this.file, that.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExternalCocAttachmentRequestBody {\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
