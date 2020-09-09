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
public class ShowMeetingDetailRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceID")
    
    private String conferenceID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 20;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="searchKey")
    
    private String searchKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userUUID")
    
    private String userUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Type")
    
    private String xType = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Query-Type")
    
    private String xQueryType = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Authorization-Type")
    
    private String xAuthorizationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site-Id")
    
    private String xSiteId;

    public ShowMeetingDetailRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    


    /**
     * Get conferenceID
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public ShowMeetingDetailRequest withOffset(Integer offset) {
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

    public ShowMeetingDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowMeetingDetailRequest withSearchKey(String searchKey) {
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

    public ShowMeetingDetailRequest withUserUUID(String userUUID) {
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

    public ShowMeetingDetailRequest withXType(String xType) {
        this.xType = xType;
        return this;
    }

    


    /**
     * Get xType
     * @return xType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXType() {
        return xType;
    }

    public void setXType(String xType) {
        this.xType = xType;
    }

    public ShowMeetingDetailRequest withXQueryType(String xQueryType) {
        this.xQueryType = xQueryType;
        return this;
    }

    


    /**
     * Get xQueryType
     * @return xQueryType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXQueryType() {
        return xQueryType;
    }

    public void setXQueryType(String xQueryType) {
        this.xQueryType = xQueryType;
    }

    public ShowMeetingDetailRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    


    /**
     * Get xAuthorizationType
     * @return xAuthorizationType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXAuthorizationType() {
        return xAuthorizationType;
    }

    public void setXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
    }

    public ShowMeetingDetailRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    


    /**
     * Get xSiteId
     * @return xSiteId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
        ShowMeetingDetailRequest showMeetingDetailRequest = (ShowMeetingDetailRequest) o;
        return Objects.equals(this.conferenceID, showMeetingDetailRequest.conferenceID) &&
            Objects.equals(this.offset, showMeetingDetailRequest.offset) &&
            Objects.equals(this.limit, showMeetingDetailRequest.limit) &&
            Objects.equals(this.searchKey, showMeetingDetailRequest.searchKey) &&
            Objects.equals(this.userUUID, showMeetingDetailRequest.userUUID) &&
            Objects.equals(this.xType, showMeetingDetailRequest.xType) &&
            Objects.equals(this.xQueryType, showMeetingDetailRequest.xQueryType) &&
            Objects.equals(this.xAuthorizationType, showMeetingDetailRequest.xAuthorizationType) &&
            Objects.equals(this.xSiteId, showMeetingDetailRequest.xSiteId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, offset, limit, searchKey, userUUID, xType, xQueryType, xAuthorizationType, xSiteId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMeetingDetailRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    xType: ").append(toIndentedString(xType)).append("\n");
        sb.append("    xQueryType: ").append(toIndentedString(xQueryType)).append("\n");
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

