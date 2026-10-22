package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserTagDTO
 */
public class UserTagDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_field")

    private String matchField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_field_index")

    private String matchFieldIndex;

    public UserTagDTO withMatchField(String matchField) {
        this.matchField = matchField;
        return this;
    }

    /**
     * Get matchField
     * @return matchField
     */
    public String getMatchField() {
        return matchField;
    }

    public void setMatchField(String matchField) {
        this.matchField = matchField;
    }

    public UserTagDTO withMatchFieldIndex(String matchFieldIndex) {
        this.matchFieldIndex = matchFieldIndex;
        return this;
    }

    /**
     * Get matchFieldIndex
     * @return matchFieldIndex
     */
    public String getMatchFieldIndex() {
        return matchFieldIndex;
    }

    public void setMatchFieldIndex(String matchFieldIndex) {
        this.matchFieldIndex = matchFieldIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserTagDTO that = (UserTagDTO) obj;
        return Objects.equals(this.matchField, that.matchField)
            && Objects.equals(this.matchFieldIndex, that.matchFieldIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchField, matchFieldIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserTagDTO {\n");
        sb.append("    matchField: ").append(toIndentedString(matchField)).append("\n");
        sb.append("    matchFieldIndex: ").append(toIndentedString(matchFieldIndex)).append("\n");
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
