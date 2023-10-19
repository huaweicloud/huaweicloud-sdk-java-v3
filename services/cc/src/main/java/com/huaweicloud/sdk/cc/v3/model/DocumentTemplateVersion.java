package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文档模板版本。
 */
public class DocumentTemplateVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_template_version")

    private DocumentTemplateVersionEnum documentTemplateVersion;

    public DocumentTemplateVersion withDocumentTemplateVersion(DocumentTemplateVersionEnum documentTemplateVersion) {
        this.documentTemplateVersion = documentTemplateVersion;
        return this;
    }

    /**
     * Get documentTemplateVersion
     * @return documentTemplateVersion
     */
    public DocumentTemplateVersionEnum getDocumentTemplateVersion() {
        return documentTemplateVersion;
    }

    public void setDocumentTemplateVersion(DocumentTemplateVersionEnum documentTemplateVersion) {
        this.documentTemplateVersion = documentTemplateVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentTemplateVersion that = (DocumentTemplateVersion) obj;
        return Objects.equals(this.documentTemplateVersion, that.documentTemplateVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentTemplateVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentTemplateVersion {\n");
        sb.append("    documentTemplateVersion: ").append(toIndentedString(documentTemplateVersion)).append("\n");
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
