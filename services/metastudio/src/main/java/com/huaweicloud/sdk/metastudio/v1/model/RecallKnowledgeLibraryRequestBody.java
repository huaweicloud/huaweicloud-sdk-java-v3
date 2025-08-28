package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 知识库召回测试请求。
 */
public class RecallKnowledgeLibraryRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_id")

    private String knowledgeLibraryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_type")

    private KnowledgeTypeEnum knowledgeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topk")

    private Integer topk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    public RecallKnowledgeLibraryRequestBody withKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
        return this;
    }

    /**
     * 知识库名称。
     * @return knowledgeLibraryId
     */
    public String getKnowledgeLibraryId() {
        return knowledgeLibraryId;
    }

    public void setKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
    }

    public RecallKnowledgeLibraryRequestBody withKnowledgeType(KnowledgeTypeEnum knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }

    /**
     * Get knowledgeType
     * @return knowledgeType
     */
    public KnowledgeTypeEnum getKnowledgeType() {
        return knowledgeType;
    }

    public void setKnowledgeType(KnowledgeTypeEnum knowledgeType) {
        this.knowledgeType = knowledgeType;
    }

    public RecallKnowledgeLibraryRequestBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 知识库召回请求文本
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public RecallKnowledgeLibraryRequestBody withTopk(Integer topk) {
        this.topk = topk;
        return this;
    }

    /**
     * 文档库召回topk
     * minimum: 1
     * maximum: 20
     * @return topk
     */
    public Integer getTopk() {
        return topk;
    }

    public void setTopk(Integer topk) {
        this.topk = topk;
    }

    public RecallKnowledgeLibraryRequestBody withScore(Double score) {
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
        RecallKnowledgeLibraryRequestBody that = (RecallKnowledgeLibraryRequestBody) obj;
        return Objects.equals(this.knowledgeLibraryId, that.knowledgeLibraryId)
            && Objects.equals(this.knowledgeType, that.knowledgeType) && Objects.equals(this.query, that.query)
            && Objects.equals(this.topk, that.topk) && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(knowledgeLibraryId, knowledgeType, query, topk, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecallKnowledgeLibraryRequestBody {\n");
        sb.append("    knowledgeLibraryId: ").append(toIndentedString(knowledgeLibraryId)).append("\n");
        sb.append("    knowledgeType: ").append(toIndentedString(knowledgeType)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    topk: ").append(toIndentedString(topk)).append("\n");
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
