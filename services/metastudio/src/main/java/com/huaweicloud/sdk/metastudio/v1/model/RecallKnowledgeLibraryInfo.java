package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 知识库召回测试响应。
 */
public class RecallKnowledgeLibraryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_id")

    private String documentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question_answer_id")

    private String questionAnswerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    public RecallKnowledgeLibraryInfo withDocumentId(String documentId) {
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

    public RecallKnowledgeLibraryInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文档名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public RecallKnowledgeLibraryInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文档类型。
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public RecallKnowledgeLibraryInfo withQuestionAnswerId(String questionAnswerId) {
        this.questionAnswerId = questionAnswerId;
        return this;
    }

    /**
     * 问答对ID。
     * @return questionAnswerId
     */
    public String getQuestionAnswerId() {
        return questionAnswerId;
    }

    public void setQuestionAnswerId(String questionAnswerId) {
        this.questionAnswerId = questionAnswerId;
    }

    public RecallKnowledgeLibraryInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 召回文本
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RecallKnowledgeLibraryInfo withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 知识库召回得分
     * minimum: 0
     * maximum: 1
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecallKnowledgeLibraryInfo that = (RecallKnowledgeLibraryInfo) obj;
        return Objects.equals(this.documentId, that.documentId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.questionAnswerId, that.questionAnswerId)
            && Objects.equals(this.content, that.content) && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, fileName, fileType, questionAnswerId, content, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecallKnowledgeLibraryInfo {\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    questionAnswerId: ").append(toIndentedString(questionAnswerId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
