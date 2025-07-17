package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 热词表基本信息。
 */
public class AsrVocabularyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asr_vocabulary_id")

    private String asrVocabularyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vocabulary_type")

    private AsrVocabularyTypeEnum vocabularyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public AsrVocabularyInfo withAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
        return this;
    }

    /**
     * 热词表ID。
     * @return asrVocabularyId
     */
    public String getAsrVocabularyId() {
        return asrVocabularyId;
    }

    public void setAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
    }

    public AsrVocabularyInfo withVocabularyType(AsrVocabularyTypeEnum vocabularyType) {
        this.vocabularyType = vocabularyType;
        return this;
    }

    /**
     * Get vocabularyType
     * @return vocabularyType
     */
    public AsrVocabularyTypeEnum getVocabularyType() {
        return vocabularyType;
    }

    public void setVocabularyType(AsrVocabularyTypeEnum vocabularyType) {
        this.vocabularyType = vocabularyType;
    }

    public AsrVocabularyInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 奇妙问热词表名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AsrVocabularyInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 词表内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AsrVocabularyInfo withLanguage(LanguageEnum language) {
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

    public AsrVocabularyInfo withCreateTime(String createTime) {
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

    public AsrVocabularyInfo withUpdateTime(String updateTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsrVocabularyInfo that = (AsrVocabularyInfo) obj;
        return Objects.equals(this.asrVocabularyId, that.asrVocabularyId)
            && Objects.equals(this.vocabularyType, that.vocabularyType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.content, that.content) && Objects.equals(this.language, that.language)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asrVocabularyId, vocabularyType, name, content, language, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsrVocabularyInfo {\n");
        sb.append("    asrVocabularyId: ").append(toIndentedString(asrVocabularyId)).append("\n");
        sb.append("    vocabularyType: ").append(toIndentedString(vocabularyType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
