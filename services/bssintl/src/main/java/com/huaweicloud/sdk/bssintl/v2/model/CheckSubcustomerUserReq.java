package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CheckSubcustomerUserReq */
public class CheckSubcustomerUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private String searchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_value")

    private String searchValue;

    public CheckSubcustomerUserReq withSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

    /** |参数名称：该字段内容可填为：“email”、“mobile”或“name”| |参数的约束及描述：该参数必填，且只允许字符串|
     * 
     * @return searchType */
    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public CheckSubcustomerUserReq withSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }

    /** |参数名称：手机、邮箱或用户名| |参数的约束及描述：该参数必填，且只允许字符串,手机包括国家码，以00开头，格式：00XX-XXXXXXXX。目前手机号仅仅支持以86为国家码|
     * 
     * @return searchValue */
    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckSubcustomerUserReq checkSubcustomerUserReq = (CheckSubcustomerUserReq) o;
        return Objects.equals(this.searchType, checkSubcustomerUserReq.searchType)
            && Objects.equals(this.searchValue, checkSubcustomerUserReq.searchValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchType, searchValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSubcustomerUserReq {\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    searchValue: ").append(toIndentedString(searchValue)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
