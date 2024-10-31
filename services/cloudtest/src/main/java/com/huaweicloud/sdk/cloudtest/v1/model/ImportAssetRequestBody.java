package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ImportAssetRequestBody
 */
public class ImportAssetRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "excel_file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart excelFile;

    public ImportAssetRequestBody withExcelFile(FormDataFilePart excelFile) {
        this.excelFile = excelFile;
        return this;
    }

    /**
     * 导入文件
     * @return excelFile
     */
    public FormDataFilePart getExcelFile() {
        return excelFile;
    }

    public void setExcelFile(FormDataFilePart excelFile) {
        this.excelFile = excelFile;
    }

    public ImportAssetRequestBody withExcelFile(InputStream inputStream, String fileName, String contentType) {
        this.excelFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ImportAssetRequestBody withExcelFile(InputStream inputStream, String fileName) {
        this.excelFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ImportAssetRequestBody withExcelFile(InputStream inputStream, String fileName, Map<String, String> headers) {
        this.excelFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("excel_file", excelFile);
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
        ImportAssetRequestBody that = (ImportAssetRequestBody) obj;
        return Objects.equals(this.excelFile, that.excelFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excelFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportAssetRequestBody {\n");
        sb.append("    excelFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
