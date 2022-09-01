package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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

    @JsonProperty(value = "ImportAssetRequestBody", access = JsonProperty.Access.WRITE_ONLY)
    @JacksonXmlProperty(localName = "ImportAssetRequestBody")

    private FormDataFilePart importAssetRequestBody;

    public ImportAssetRequestBody withImportAssetRequestBody(FormDataFilePart importAssetRequestBody) {
        this.importAssetRequestBody = importAssetRequestBody;
        return this;
    }

    /**
     * 资产压缩文件
     * @return importAssetRequestBody
     */
    public FormDataFilePart getImportAssetRequestBody() {
        return importAssetRequestBody;
    }

    public void setImportAssetRequestBody(FormDataFilePart importAssetRequestBody) {
        this.importAssetRequestBody = importAssetRequestBody;
    }

    public ImportAssetRequestBody withImportAssetRequestBody(InputStream inputStream, String fileName,
        String contentType) {
        this.importAssetRequestBody = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ImportAssetRequestBody withImportAssetRequestBody(InputStream inputStream, String fileName) {
        this.importAssetRequestBody = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ImportAssetRequestBody withImportAssetRequestBody(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.importAssetRequestBody = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                put("ImportAssetRequestBody", importAssetRequestBody);
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
        ImportAssetRequestBody importAssetRequestBody = (ImportAssetRequestBody) o;
        return Objects.equals(this.importAssetRequestBody, importAssetRequestBody.importAssetRequestBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importAssetRequestBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportAssetRequestBody {\n");
        sb.append("    importAssetRequestBody: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
