package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ImportCollectorParserRequestBody
 */
public class ImportCollectorParserRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "files", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart files;

    public ImportCollectorParserRequestBody withFiles(FormDataFilePart files) {
        this.files = files;
        return this;
    }

    /**
     * 导入的文件数组
     * @return files
     */
    public FormDataFilePart getFiles() {
        return files;
    }

    public void setFiles(FormDataFilePart files) {
        this.files = files;
    }

    public ImportCollectorParserRequestBody withFiles(InputStream inputStream, String fileName, String contentType) {
        this.files = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ImportCollectorParserRequestBody withFiles(InputStream inputStream, String fileName) {
        this.files = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ImportCollectorParserRequestBody withFiles(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.files = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("files", files);
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
        ImportCollectorParserRequestBody that = (ImportCollectorParserRequestBody) obj;
        return Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportCollectorParserRequestBody {\n");
        sb.append("    files: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
