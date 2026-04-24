package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * The value or values to match for.
 */
public class ClaimMatchValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_value_string")

    private String matchValueString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_value_string_list")

    private List<String> matchValueStringList = null;

    public ClaimMatchValue withMatchValueString(String matchValueString) {
        this.matchValueString = matchValueString;
        return this;
    }

    /**
     * The string value to match for.
     * @return matchValueString
     */
    public String getMatchValueString() {
        return matchValueString;
    }

    public void setMatchValueString(String matchValueString) {
        this.matchValueString = matchValueString;
    }

    public ClaimMatchValue withMatchValueStringList(List<String> matchValueStringList) {
        this.matchValueStringList = matchValueStringList;
        return this;
    }

    public ClaimMatchValue addMatchValueStringListItem(String matchValueStringListItem) {
        if (this.matchValueStringList == null) {
            this.matchValueStringList = new ArrayList<>();
        }
        this.matchValueStringList.add(matchValueStringListItem);
        return this;
    }

    public ClaimMatchValue withMatchValueStringList(Consumer<List<String>> matchValueStringListSetter) {
        if (this.matchValueStringList == null) {
            this.matchValueStringList = new ArrayList<>();
        }
        matchValueStringListSetter.accept(this.matchValueStringList);
        return this;
    }

    /**
     * Get matchValueStringList
     * @return matchValueStringList
     */
    public List<String> getMatchValueStringList() {
        return matchValueStringList;
    }

    public void setMatchValueStringList(List<String> matchValueStringList) {
        this.matchValueStringList = matchValueStringList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClaimMatchValue that = (ClaimMatchValue) obj;
        return Objects.equals(this.matchValueString, that.matchValueString)
            && Objects.equals(this.matchValueStringList, that.matchValueStringList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchValueString, matchValueStringList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClaimMatchValue {\n");
        sb.append("    matchValueString: ").append(toIndentedString(matchValueString)).append("\n");
        sb.append("    matchValueStringList: ").append(toIndentedString(matchValueStringList)).append("\n");
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
