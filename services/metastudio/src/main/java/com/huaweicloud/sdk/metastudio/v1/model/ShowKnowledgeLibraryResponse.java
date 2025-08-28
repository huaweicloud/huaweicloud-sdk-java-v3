package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowKnowledgeLibraryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_id")

    private String knowledgeLibraryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_type")

    private KnowledgeTypeEnum knowledgeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_size")

    private Integer knowledgeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topk")

    private Integer topk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowKnowledgeLibraryResponse withKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
        return this;
    }

    /**
     * 知识库ID。
     * @return knowledgeLibraryId
     */
    public String getKnowledgeLibraryId() {
        return knowledgeLibraryId;
    }

    public void setKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
    }

    public ShowKnowledgeLibraryResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 知识库名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowKnowledgeLibraryResponse withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public ShowKnowledgeLibraryResponse withKnowledgeType(KnowledgeTypeEnum knowledgeType) {
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

    public ShowKnowledgeLibraryResponse withKnowledgeSize(Integer knowledgeSize) {
        this.knowledgeSize = knowledgeSize;
        return this;
    }

    /**
     * 知识库大小(文档库为文档数量)
     * minimum: 0
     * maximum: 64
     * @return knowledgeSize
     */
    public Integer getKnowledgeSize() {
        return knowledgeSize;
    }

    public void setKnowledgeSize(Integer knowledgeSize) {
        this.knowledgeSize = knowledgeSize;
    }

    public ShowKnowledgeLibraryResponse withTopk(Integer topk) {
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

    public ShowKnowledgeLibraryResponse withScore(Double score) {
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

    public ShowKnowledgeLibraryResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowKnowledgeLibraryResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowKnowledgeLibraryResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKnowledgeLibraryResponse that = (ShowKnowledgeLibraryResponse) obj;
        return Objects.equals(this.knowledgeLibraryId, that.knowledgeLibraryId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.language, that.language) && Objects.equals(this.knowledgeType, that.knowledgeType)
            && Objects.equals(this.knowledgeSize, that.knowledgeSize) && Objects.equals(this.topk, that.topk)
            && Objects.equals(this.score, that.score) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(knowledgeLibraryId,
            name,
            language,
            knowledgeType,
            knowledgeSize,
            topk,
            score,
            createTime,
            updateTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKnowledgeLibraryResponse {\n");
        sb.append("    knowledgeLibraryId: ").append(toIndentedString(knowledgeLibraryId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    knowledgeType: ").append(toIndentedString(knowledgeType)).append("\n");
        sb.append("    knowledgeSize: ").append(toIndentedString(knowledgeSize)).append("\n");
        sb.append("    topk: ").append(toIndentedString(topk)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
