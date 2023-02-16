package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecommendWord
 */
public class RecommendWord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_word_id")

    private String recommendWordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_word_name")

    private String recommendWordName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level_value")

    private Integer levelValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_value")

    private Integer sortValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "theme_id")

    private String themeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "theme_name")

    private String themeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer_info")

    private AnswerInfo answerInfo;

    public RecommendWord withRecommendWordId(String recommendWordId) {
        this.recommendWordId = recommendWordId;
        return this;
    }

    /**
     * 推荐词Id
     * @return recommendWordId
     */
    public String getRecommendWordId() {
        return recommendWordId;
    }

    public void setRecommendWordId(String recommendWordId) {
        this.recommendWordId = recommendWordId;
    }

    public RecommendWord withRecommendWordName(String recommendWordName) {
        this.recommendWordName = recommendWordName;
        return this;
    }

    /**
     * 推荐词
     * @return recommendWordName
     */
    public String getRecommendWordName() {
        return recommendWordName;
    }

    public void setRecommendWordName(String recommendWordName) {
        this.recommendWordName = recommendWordName;
    }

    public RecommendWord withLevelValue(Integer levelValue) {
        this.levelValue = levelValue;
        return this;
    }

    /**
     * 推荐词层级
     * minimum: 1
     * maximum: 3
     * @return levelValue
     */
    public Integer getLevelValue() {
        return levelValue;
    }

    public void setLevelValue(Integer levelValue) {
        this.levelValue = levelValue;
    }

    public RecommendWord withSortValue(Integer sortValue) {
        this.sortValue = sortValue;
        return this;
    }

    /**
     * 推荐词排序，序号越小越靠前
     * minimum: 0
     * maximum: 2147483647
     * @return sortValue
     */
    public Integer getSortValue() {
        return sortValue;
    }

    public void setSortValue(Integer sortValue) {
        this.sortValue = sortValue;
    }

    public RecommendWord withThemeId(String themeId) {
        this.themeId = themeId;
        return this;
    }

    /**
     * 主题Id
     * @return themeId
     */
    public String getThemeId() {
        return themeId;
    }

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    public RecommendWord withThemeName(String themeName) {
        this.themeName = themeName;
        return this;
    }

    /**
     * 主题名称
     * @return themeName
     */
    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public RecommendWord withAnswerInfo(AnswerInfo answerInfo) {
        this.answerInfo = answerInfo;
        return this;
    }

    public RecommendWord withAnswerInfo(Consumer<AnswerInfo> answerInfoSetter) {
        if (this.answerInfo == null) {
            this.answerInfo = new AnswerInfo();
            answerInfoSetter.accept(this.answerInfo);
        }

        return this;
    }

    /**
     * Get answerInfo
     * @return answerInfo
     */
    public AnswerInfo getAnswerInfo() {
        return answerInfo;
    }

    public void setAnswerInfo(AnswerInfo answerInfo) {
        this.answerInfo = answerInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecommendWord recommendWord = (RecommendWord) o;
        return Objects.equals(this.recommendWordId, recommendWord.recommendWordId)
            && Objects.equals(this.recommendWordName, recommendWord.recommendWordName)
            && Objects.equals(this.levelValue, recommendWord.levelValue)
            && Objects.equals(this.sortValue, recommendWord.sortValue)
            && Objects.equals(this.themeId, recommendWord.themeId)
            && Objects.equals(this.themeName, recommendWord.themeName)
            && Objects.equals(this.answerInfo, recommendWord.answerInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendWordId, recommendWordName, levelValue, sortValue, themeId, themeName, answerInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecommendWord {\n");
        sb.append("    recommendWordId: ").append(toIndentedString(recommendWordId)).append("\n");
        sb.append("    recommendWordName: ").append(toIndentedString(recommendWordName)).append("\n");
        sb.append("    levelValue: ").append(toIndentedString(levelValue)).append("\n");
        sb.append("    sortValue: ").append(toIndentedString(sortValue)).append("\n");
        sb.append("    themeId: ").append(toIndentedString(themeId)).append("\n");
        sb.append("    themeName: ").append(toIndentedString(themeName)).append("\n");
        sb.append("    answerInfo: ").append(toIndentedString(answerInfo)).append("\n");
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
