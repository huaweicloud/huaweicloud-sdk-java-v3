package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改文档分段信息请求。
 */
public class UpdateDocumentSegmentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_id")

    private String documentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_index")

    private Integer textIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    public UpdateDocumentSegmentReq withDocumentId(String documentId) {
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

    public UpdateDocumentSegmentReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 文档分段文本ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateDocumentSegmentReq withTextIndex(Integer textIndex) {
        this.textIndex = textIndex;
        return this;
    }

    /**
     * 分段序号
     * minimum: 0
     * maximum: 65536
     * @return textIndex
     */
    public Integer getTextIndex() {
        return textIndex;
    }

    public void setTextIndex(Integer textIndex) {
        this.textIndex = textIndex;
    }

    public UpdateDocumentSegmentReq withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 文档分段文本。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDocumentSegmentReq that = (UpdateDocumentSegmentReq) obj;
        return Objects.equals(this.documentId, that.documentId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.textIndex, that.textIndex) && Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, id, textIndex, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDocumentSegmentReq {\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    textIndex: ").append(toIndentedString(textIndex)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
