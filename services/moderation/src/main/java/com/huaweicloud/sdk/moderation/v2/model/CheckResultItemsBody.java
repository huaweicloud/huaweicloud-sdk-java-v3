package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CheckResultItemsBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private ImageDetectionResultDetail detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_suggestions")

    private Map<String, String> categorySuggestions = null;

    public CheckResultItemsBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 图片的URL路径。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CheckResultItemsBody withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 检测结果是否通过。 - block：包含敏感信息，不通过 - pass：不包含敏感信息，通过 - review：需要人工复检 > 当同时检测多个场景时，suggestion的值以最可能包含敏感信息的场景为准。即任一场景出现了block则总的suggestion为block，所有场景都pass时suggestion为pass，这两种情况之外则一定有场景需要review，此时suggestion为review。 
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public CheckResultItemsBody withDetail(ImageDetectionResultDetail detail) {
        this.detail = detail;
        return this;
    }

    public CheckResultItemsBody withDetail(Consumer<ImageDetectionResultDetail> detailSetter) {
        if (this.detail == null) {
            this.detail = new ImageDetectionResultDetail();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public ImageDetectionResultDetail getDetail() {
        return detail;
    }

    public void setDetail(ImageDetectionResultDetail detail) {
        this.detail = detail;
    }

    public CheckResultItemsBody withCategorySuggestions(Map<String, String> categorySuggestions) {
        this.categorySuggestions = categorySuggestions;
        return this;
    }

    public CheckResultItemsBody putCategorySuggestionsItem(String key, String categorySuggestionsItem) {
        if (this.categorySuggestions == null) {
            this.categorySuggestions = new HashMap<>();
        }
        this.categorySuggestions.put(key, categorySuggestionsItem);
        return this;
    }

    public CheckResultItemsBody withCategorySuggestions(Consumer<Map<String, String>> categorySuggestionsSetter) {
        if (this.categorySuggestions == null) {
            this.categorySuggestions = new HashMap<>();
        }
        categorySuggestionsSetter.accept(this.categorySuggestions);
        return this;
    }

    /**
     * 具体每个场景的检测结果。  block：包含敏感信息，不通过  pass：不包含敏感信息，通过  review：需要人工复检 
     * @return categorySuggestions
     */
    public Map<String, String> getCategorySuggestions() {
        return categorySuggestions;
    }

    public void setCategorySuggestions(Map<String, String> categorySuggestions) {
        this.categorySuggestions = categorySuggestions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckResultItemsBody checkResultItemsBody = (CheckResultItemsBody) o;
        return Objects.equals(this.url, checkResultItemsBody.url)
            && Objects.equals(this.suggestion, checkResultItemsBody.suggestion)
            && Objects.equals(this.detail, checkResultItemsBody.detail)
            && Objects.equals(this.categorySuggestions, checkResultItemsBody.categorySuggestions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, suggestion, detail, categorySuggestions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckResultItemsBody {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    categorySuggestions: ").append(toIndentedString(categorySuggestions)).append("\n");
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
