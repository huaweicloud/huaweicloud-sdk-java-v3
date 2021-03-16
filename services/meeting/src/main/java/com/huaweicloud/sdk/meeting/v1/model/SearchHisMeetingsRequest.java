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
public class SearchHisMeetingsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userUUID")
    
    private String userUUID;


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
    @JsonProperty(value="queryAll")
    
    private Boolean queryAll;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startDate")
    
    private Long startDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endDate")
    
    private Long endDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sortType")
    
    private String sortType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Authorization-Type")
    
    private String xAuthorizationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site-Id")
    
    private String xSiteId;

    public SearchHisMeetingsRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    


    /**
     * Get userUUID
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    

    public SearchHisMeetingsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public SearchHisMeetingsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public SearchHisMeetingsRequest withSearchKey(String searchKey) {
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

    

    public SearchHisMeetingsRequest withQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }

    


    /**
     * Get queryAll
     * @return queryAll
     */
    public Boolean getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
    }

    

    public SearchHisMeetingsRequest withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    


    /**
     * Get startDate
     * @return startDate
     */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    

    public SearchHisMeetingsRequest withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    


    /**
     * Get endDate
     * @return endDate
     */
    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    

    public SearchHisMeetingsRequest withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    


    /**
     * Get sortType
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    

    public SearchHisMeetingsRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    


    /**
     * Get xAuthorizationType
     * @return xAuthorizationType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Authorization-Type")
    public String getXAuthorizationType() {
        return xAuthorizationType;
    }

    public void setXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
    }

    

    public SearchHisMeetingsRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    


    /**
     * Get xSiteId
     * @return xSiteId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site-Id")
    public String getXSiteId() {
        return xSiteId;
    }

    public void setXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchHisMeetingsRequest searchHisMeetingsRequest = (SearchHisMeetingsRequest) o;
        return Objects.equals(this.userUUID, searchHisMeetingsRequest.userUUID) &&
            Objects.equals(this.offset, searchHisMeetingsRequest.offset) &&
            Objects.equals(this.limit, searchHisMeetingsRequest.limit) &&
            Objects.equals(this.searchKey, searchHisMeetingsRequest.searchKey) &&
            Objects.equals(this.queryAll, searchHisMeetingsRequest.queryAll) &&
            Objects.equals(this.startDate, searchHisMeetingsRequest.startDate) &&
            Objects.equals(this.endDate, searchHisMeetingsRequest.endDate) &&
            Objects.equals(this.sortType, searchHisMeetingsRequest.sortType) &&
            Objects.equals(this.xAuthorizationType, searchHisMeetingsRequest.xAuthorizationType) &&
            Objects.equals(this.xSiteId, searchHisMeetingsRequest.xSiteId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userUUID, offset, limit, searchKey, queryAll, startDate, endDate, sortType, xAuthorizationType, xSiteId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchHisMeetingsRequest {\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    queryAll: ").append(toIndentedString(queryAll)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
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

