package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SearchRequest
 */
public class SearchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private String searchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_value")

    private String searchValue;

    public SearchRequest withSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 过滤类型
     * @return searchType
     */
    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public SearchRequest withSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }

    /**
     * 过滤条件
     * @return searchValue
     */
    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchRequest that = (SearchRequest) obj;
        return Objects.equals(this.searchType, that.searchType) && Objects.equals(this.searchValue, that.searchValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchType, searchValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchRequest {\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    searchValue: ").append(toIndentedString(searchValue)).append("\n");
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
