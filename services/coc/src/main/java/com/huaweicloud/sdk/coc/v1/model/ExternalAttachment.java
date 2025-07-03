package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 上传成功后的附件信息。
 */
public class ExternalAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_id")

    private String docId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_name")

    private String docName;

    public ExternalAttachment withDocId(String docId) {
        this.docId = docId;
        return this;
    }

    /**
     * 附件唯一id。
     * @return docId
     */
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public ExternalAttachment withDocName(String docName) {
        this.docName = docName;
        return this;
    }

    /**
     * 附件文件名。
     * @return docName
     */
    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalAttachment that = (ExternalAttachment) obj;
        return Objects.equals(this.docId, that.docId) && Objects.equals(this.docName, that.docName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docId, docName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalAttachment {\n");
        sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
        sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
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
