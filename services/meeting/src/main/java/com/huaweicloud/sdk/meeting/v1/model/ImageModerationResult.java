package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 图片审核结果。
 */
public class ImageModerationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_suggestions")

    private CategorySuggestions categorySuggestions;

    public ImageModerationResult withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 审核情况。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public ImageModerationResult withCategorySuggestions(CategorySuggestions categorySuggestions) {
        this.categorySuggestions = categorySuggestions;
        return this;
    }

    public ImageModerationResult withCategorySuggestions(Consumer<CategorySuggestions> categorySuggestionsSetter) {
        if (this.categorySuggestions == null) {
            this.categorySuggestions = new CategorySuggestions();
            categorySuggestionsSetter.accept(this.categorySuggestions);
        }

        return this;
    }

    /**
     * Get categorySuggestions
     * @return categorySuggestions
     */
    public CategorySuggestions getCategorySuggestions() {
        return categorySuggestions;
    }

    public void setCategorySuggestions(CategorySuggestions categorySuggestions) {
        this.categorySuggestions = categorySuggestions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageModerationResult that = (ImageModerationResult) obj;
        return Objects.equals(this.suggestion, that.suggestion)
            && Objects.equals(this.categorySuggestions, that.categorySuggestions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, categorySuggestions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageModerationResult {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
