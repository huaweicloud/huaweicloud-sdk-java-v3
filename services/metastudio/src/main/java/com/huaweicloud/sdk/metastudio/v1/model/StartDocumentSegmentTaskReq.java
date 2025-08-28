package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开始分段任务请求信息。
 */
public class StartDocumentSegmentTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_id")

    private String documentId;

    public StartDocumentSegmentTaskReq withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * 文档ID。
     * @return documentId
     */
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartDocumentSegmentTaskReq that = (StartDocumentSegmentTaskReq) obj;
        return Objects.equals(this.documentId, that.documentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartDocumentSegmentTaskReq {\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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
