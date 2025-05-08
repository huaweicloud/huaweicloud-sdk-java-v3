package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetDocumentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_id")

    private String documentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_type")

    private String documentType;

    public GetDocumentRequest withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * 作业uuid
     * @return documentId
     */
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public GetDocumentRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 作业版本号，示例值v1、v2，不传默认查询最新版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public GetDocumentRequest withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * 执行的作业类型 枚举：PUBLIC/PRIVATE 默认PRIVATE
     * @return documentType
     */
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetDocumentRequest that = (GetDocumentRequest) obj;
        return Objects.equals(this.documentId, that.documentId) && Objects.equals(this.version, that.version)
            && Objects.equals(this.documentType, that.documentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, version, documentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDocumentRequest {\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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
