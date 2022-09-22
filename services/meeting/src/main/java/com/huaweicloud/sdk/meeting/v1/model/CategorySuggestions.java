package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 各项内容审核结果。
 */
public class CategorySuggestions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "politics")

    private String politics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terrorism")

    private String terrorism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "porn")

    private String porn;

    public CategorySuggestions withPolitics(String politics) {
        this.politics = politics;
        return this;
    }

    /**
     * 政治人物审核。
     * @return politics
     */
    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public CategorySuggestions withTerrorism(String terrorism) {
        this.terrorism = terrorism;
        return this;
    }

    /**
     * 暴恐内容审核。
     * @return terrorism
     */
    public String getTerrorism() {
        return terrorism;
    }

    public void setTerrorism(String terrorism) {
        this.terrorism = terrorism;
    }

    public CategorySuggestions withPorn(String porn) {
        this.porn = porn;
        return this;
    }

    /**
     * 情色内容审核。
     * @return porn
     */
    public String getPorn() {
        return porn;
    }

    public void setPorn(String porn) {
        this.porn = porn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CategorySuggestions categorySuggestions = (CategorySuggestions) o;
        return Objects.equals(this.politics, categorySuggestions.politics)
            && Objects.equals(this.terrorism, categorySuggestions.terrorism)
            && Objects.equals(this.porn, categorySuggestions.porn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(politics, terrorism, porn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategorySuggestions {\n");
        sb.append("    politics: ").append(toIndentedString(politics)).append("\n");
        sb.append("    terrorism: ").append(toIndentedString(terrorism)).append("\n");
        sb.append("    porn: ").append(toIndentedString(porn)).append("\n");
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
