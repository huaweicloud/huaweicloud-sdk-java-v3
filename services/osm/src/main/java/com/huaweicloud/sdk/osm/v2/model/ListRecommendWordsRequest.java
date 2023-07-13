package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRecommendWordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")

    private String xServiceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")

    private String xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_word_id")

    private String recommendWordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level_value")

    private Integer levelValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "theme_name")

    private String themeName;

    public ListRecommendWordsRequest withXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
        return this;
    }

    /**
     * 调用智能客服服务标志。
     * @return xServiceKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")
    public String getXServiceKey() {
        return xServiceKey;
    }

    public void setXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
    }

    public ListRecommendWordsRequest withXSite(String xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 站点标记，0-中国站  1-国际站
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")
    public String getXSite() {
        return xSite;
    }

    public void setXSite(String xSite) {
        this.xSite = xSite;
    }

    public ListRecommendWordsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 区域语言简写，en-us  zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListRecommendWordsRequest withRecommendWordId(String recommendWordId) {
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

    public ListRecommendWordsRequest withLevelValue(Integer levelValue) {
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

    public ListRecommendWordsRequest withThemeName(String themeName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRecommendWordsRequest that = (ListRecommendWordsRequest) obj;
        return Objects.equals(this.xServiceKey, that.xServiceKey) && Objects.equals(this.xSite, that.xSite)
            && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.recommendWordId, that.recommendWordId)
            && Objects.equals(this.levelValue, that.levelValue) && Objects.equals(this.themeName, that.themeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xServiceKey, xSite, xLanguage, recommendWordId, levelValue, themeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecommendWordsRequest {\n");
        sb.append("    xServiceKey: ").append(toIndentedString(xServiceKey)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    recommendWordId: ").append(toIndentedString(recommendWordId)).append("\n");
        sb.append("    levelValue: ").append(toIndentedString(levelValue)).append("\n");
        sb.append("    themeName: ").append(toIndentedString(themeName)).append("\n");
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
