package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UploadBasicPluginRequestBody
 */
public class UploadBasicPluginRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "upload_file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart uploadFile;

    public UploadBasicPluginRequestBody withUploadFile(FormDataFilePart uploadFile) {
        this.uploadFile = uploadFile;
        return this;
    }

    /**
     * Get uploadFile
     * @return uploadFile
     */
    public FormDataFilePart getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(FormDataFilePart uploadFile) {
        this.uploadFile = uploadFile;
    }

    public UploadBasicPluginRequestBody withUploadFile(InputStream inputStream, String fileName, String contentType) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UploadBasicPluginRequestBody withUploadFile(InputStream inputStream, String fileName) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UploadBasicPluginRequestBody withUploadFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("upload_file", uploadFile);
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
        UploadBasicPluginRequestBody that = (UploadBasicPluginRequestBody) obj;
        return Objects.equals(this.uploadFile, that.uploadFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadBasicPluginRequestBody {\n");
        sb.append("    uploadFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
