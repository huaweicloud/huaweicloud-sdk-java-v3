package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/** ImportMqsInstanceTopicRequestBody */
public class ImportMqsInstanceTopicRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "upload_file_name", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart uploadFileName;

    public ImportMqsInstanceTopicRequestBody withUploadFileName(FormDataFilePart uploadFileName) {
        this.uploadFileName = uploadFileName;
        return this;
    }

    /** 待导入的topic列表文件。
     * 
     * @return uploadFileName */
    public FormDataFilePart getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(FormDataFilePart uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public ImportMqsInstanceTopicRequestBody withUploadFileName(InputStream inputStream, String fileName,
        String contentType) {
        this.uploadFileName = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ImportMqsInstanceTopicRequestBody withUploadFileName(InputStream inputStream, String fileName) {
        this.uploadFileName = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ImportMqsInstanceTopicRequestBody withUploadFileName(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.uploadFileName = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                put("upload_file_name", uploadFileName);
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportMqsInstanceTopicRequestBody importMqsInstanceTopicRequestBody = (ImportMqsInstanceTopicRequestBody) o;
        return Objects.equals(this.uploadFileName, importMqsInstanceTopicRequestBody.uploadFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadFileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportMqsInstanceTopicRequestBody {\n");
        sb.append("    uploadFileName: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
