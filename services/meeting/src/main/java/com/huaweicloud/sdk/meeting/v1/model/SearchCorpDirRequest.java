package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SearchCorpDirRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    
    private String xRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="searchKey")
    
    private String searchKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptCode")
    
    private String deptCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="querySubDept")
    
    private Boolean querySubDept;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="searchScope")
    
    private String searchScope;

    public SearchCorpDirRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
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

    


    /**
     * Get acceptLanguage
     * @return acceptLanguage
     */
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

    


    /**
     * Get offset
     * minimum: 0
     * @return offset
     */
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

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 500
     * @return limit
     */
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

    


    /**
     * Get searchKey
     * @return searchKey
     */
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

    


    /**
     * Get deptCode
     * @return deptCode
     */
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

    


    /**
     * Get querySubDept
     * @return querySubDept
     */
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

    


    /**
     * Get searchScope
     * @return searchScope
     */
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
        return Objects.equals(this.xRequestId, searchCorpDirRequest.xRequestId) &&
            Objects.equals(this.acceptLanguage, searchCorpDirRequest.acceptLanguage) &&
            Objects.equals(this.offset, searchCorpDirRequest.offset) &&
            Objects.equals(this.limit, searchCorpDirRequest.limit) &&
            Objects.equals(this.searchKey, searchCorpDirRequest.searchKey) &&
            Objects.equals(this.deptCode, searchCorpDirRequest.deptCode) &&
            Objects.equals(this.querySubDept, searchCorpDirRequest.querySubDept) &&
            Objects.equals(this.searchScope, searchCorpDirRequest.searchScope);
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

