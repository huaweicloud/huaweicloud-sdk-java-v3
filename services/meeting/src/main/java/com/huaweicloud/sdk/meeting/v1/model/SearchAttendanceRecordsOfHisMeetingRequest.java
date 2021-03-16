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
public class SearchAttendanceRecordsOfHisMeetingRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confUUID")
    
    private String confUUID;


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
    @JsonProperty(value="userUUID")
    
    private String userUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Authorization-Type")
    
    private String xAuthorizationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site-Id")
    
    private String xSiteId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;

    public SearchAttendanceRecordsOfHisMeetingRequest withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    


    /**
     * Get confUUID
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    

    public SearchAttendanceRecordsOfHisMeetingRequest withOffset(Integer offset) {
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

    

    public SearchAttendanceRecordsOfHisMeetingRequest withLimit(Integer limit) {
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

    

    public SearchAttendanceRecordsOfHisMeetingRequest withSearchKey(String searchKey) {
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

    

    public SearchAttendanceRecordsOfHisMeetingRequest withUserUUID(String userUUID) {
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

    

    public SearchAttendanceRecordsOfHisMeetingRequest withXAuthorizationType(String xAuthorizationType) {
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

    

    public SearchAttendanceRecordsOfHisMeetingRequest withXSiteId(String xSiteId) {
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

    

    public SearchAttendanceRecordsOfHisMeetingRequest withAcceptLanguage(String acceptLanguage) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchAttendanceRecordsOfHisMeetingRequest searchAttendanceRecordsOfHisMeetingRequest = (SearchAttendanceRecordsOfHisMeetingRequest) o;
        return Objects.equals(this.confUUID, searchAttendanceRecordsOfHisMeetingRequest.confUUID) &&
            Objects.equals(this.offset, searchAttendanceRecordsOfHisMeetingRequest.offset) &&
            Objects.equals(this.limit, searchAttendanceRecordsOfHisMeetingRequest.limit) &&
            Objects.equals(this.searchKey, searchAttendanceRecordsOfHisMeetingRequest.searchKey) &&
            Objects.equals(this.userUUID, searchAttendanceRecordsOfHisMeetingRequest.userUUID) &&
            Objects.equals(this.xAuthorizationType, searchAttendanceRecordsOfHisMeetingRequest.xAuthorizationType) &&
            Objects.equals(this.xSiteId, searchAttendanceRecordsOfHisMeetingRequest.xSiteId) &&
            Objects.equals(this.acceptLanguage, searchAttendanceRecordsOfHisMeetingRequest.acceptLanguage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confUUID, offset, limit, searchKey, userUUID, xAuthorizationType, xSiteId, acceptLanguage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchAttendanceRecordsOfHisMeetingRequest {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
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

