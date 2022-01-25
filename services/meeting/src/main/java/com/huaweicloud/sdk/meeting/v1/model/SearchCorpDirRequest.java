package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class SearchCorpDirRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept-Language")

    private String acceptLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchKey")

    private String searchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "querySubDept")

    private Boolean querySubDept;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchScope")

    private String searchScope;

    public SearchCorpDirRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * 
     * @return xRequestId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public SearchCorpDirRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** 语言参数，默认为中文zh-CN, 英文为en-US
     * 
     * @return acceptLanguage */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public SearchCorpDirRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 查询偏移量,若超过最大数量，则返回最后一页的数据 默认值：0 minimum: 0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchCorpDirRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 查询数量 默认值：0 minimum: 1 maximum: 500
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchCorpDirRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /** 搜索条件。支持账号、姓名、手机、邮箱模糊搜索
     * 
     * @return searchKey */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public SearchCorpDirRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /** 部门编码 maxLength：32 minLength：0
     * 
     * @return deptCode */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public SearchCorpDirRequest withQuerySubDept(Boolean querySubDept) {
        this.querySubDept = querySubDept;
        return this;
    }

    /** 是否查询子部门下的用户 默认值：true
     * 
     * @return querySubDept */
    public Boolean getQuerySubDept() {
        return querySubDept;
    }

    public void setQuerySubDept(Boolean querySubDept) {
        this.querySubDept = querySubDept;
    }

    public SearchCorpDirRequest withSearchScope(String searchScope) {
        this.searchScope = searchScope;
        return this;
    }

    /** * 搜索范围 * NORMAL_USER表示查询普通用户。返回普通用户（响应中isHardTerminal=false，type=NORMAL_USER） *
     * HARD_TERMINAL表示查询硬终端用户。返回大屏用户（响应中isHardTerminal=false，type=WHITE_BOARD）和硬终端用户（响应中isHardTerminal=true，type=HARD_TERMINAL）
     * * ALL表示查询所有用户。 * 默认值为ALL
     * 
     * @return searchScope */
    public String getSearchScope() {
        return searchScope;
    }

    public void setSearchScope(String searchScope) {
        this.searchScope = searchScope;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchCorpDirRequest searchCorpDirRequest = (SearchCorpDirRequest) o;
        return Objects.equals(this.xRequestId, searchCorpDirRequest.xRequestId)
            && Objects.equals(this.acceptLanguage, searchCorpDirRequest.acceptLanguage)
            && Objects.equals(this.offset, searchCorpDirRequest.offset)
            && Objects.equals(this.limit, searchCorpDirRequest.limit)
            && Objects.equals(this.searchKey, searchCorpDirRequest.searchKey)
            && Objects.equals(this.deptCode, searchCorpDirRequest.deptCode)
            && Objects.equals(this.querySubDept, searchCorpDirRequest.querySubDept)
            && Objects.equals(this.searchScope, searchCorpDirRequest.searchScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, offset, limit, searchKey, deptCode, querySubDept, searchScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCorpDirRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    querySubDept: ").append(toIndentedString(querySubDept)).append("\n");
        sb.append("    searchScope: ").append(toIndentedString(searchScope)).append("\n");
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
