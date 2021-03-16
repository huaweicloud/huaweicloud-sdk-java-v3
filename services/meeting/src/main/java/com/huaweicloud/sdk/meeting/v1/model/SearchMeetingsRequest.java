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
public class SearchMeetingsRequest  {



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
    @JsonProperty(value="queryAll")
    
    private Boolean queryAll;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="searchKey")
    
    private String searchKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queryConfMode")
    
    private String queryConfMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sortType")
    
    private String sortType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Authorization-Type")
    
    private String xAuthorizationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site-Id")
    
    private String xSiteId;

    public SearchMeetingsRequest withUserUUID(String userUUID) {
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

    

    public SearchMeetingsRequest withOffset(Integer offset) {
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

    

    public SearchMeetingsRequest withLimit(Integer limit) {
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

    

    public SearchMeetingsRequest withQueryAll(Boolean queryAll) {
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

    

    public SearchMeetingsRequest withSearchKey(String searchKey) {
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

    

    public SearchMeetingsRequest withQueryConfMode(String queryConfMode) {
        this.queryConfMode = queryConfMode;
        return this;
    }

    


    /**
     * Get queryConfMode
     * @return queryConfMode
     */
    public String getQueryConfMode() {
        return queryConfMode;
    }

    public void setQueryConfMode(String queryConfMode) {
        this.queryConfMode = queryConfMode;
    }

    

    public SearchMeetingsRequest withSortType(String sortType) {
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

    

    public SearchMeetingsRequest withXAuthorizationType(String xAuthorizationType) {
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

    

    public SearchMeetingsRequest withXSiteId(String xSiteId) {
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
        SearchMeetingsRequest searchMeetingsRequest = (SearchMeetingsRequest) o;
        return Objects.equals(this.userUUID, searchMeetingsRequest.userUUID) &&
            Objects.equals(this.offset, searchMeetingsRequest.offset) &&
            Objects.equals(this.limit, searchMeetingsRequest.limit) &&
            Objects.equals(this.queryAll, searchMeetingsRequest.queryAll) &&
            Objects.equals(this.searchKey, searchMeetingsRequest.searchKey) &&
            Objects.equals(this.queryConfMode, searchMeetingsRequest.queryConfMode) &&
            Objects.equals(this.sortType, searchMeetingsRequest.sortType) &&
            Objects.equals(this.xAuthorizationType, searchMeetingsRequest.xAuthorizationType) &&
            Objects.equals(this.xSiteId, searchMeetingsRequest.xSiteId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userUUID, offset, limit, queryAll, searchKey, queryConfMode, sortType, xAuthorizationType, xSiteId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchMeetingsRequest {\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    queryAll: ").append(toIndentedString(queryAll)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    queryConfMode: ").append(toIndentedString(queryConfMode)).append("\n");
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

