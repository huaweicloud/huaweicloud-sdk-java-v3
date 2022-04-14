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

    /** 该字段内容可填为：“email”、“mobile”或“name”。
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

    /** 手机号、邮箱或登录名称。 手机号需符合正则表达式
     * ^\\d{4}-\\d+$；包括国家码，以00开头，格式：00XX-XXXXXXXX。邮箱需为含有@的正确格式的完整邮箱地址。name：符合正则表达式^([a-zA-Z-]([a-zA-Z0-9_-]){4,31})$，长度5-32；不能以“op_”或“shadow_”开头且不能全为数字，且只能以字母（不区分大小写）或者-开头。
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
