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
public class ShowHisMeetingDetailRequest  {



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
    @JsonProperty(value="X-Type")
    
    private Integer xType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Query-Type")
    
    private Integer xQueryType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Authorization-Type")
    
    private String xAuthorizationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site-Id")
    
    private String xSiteId;

    public ShowHisMeetingDetailRequest withConfUUID(String confUUID) {
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

    

    public ShowHisMeetingDetailRequest withOffset(Integer offset) {
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

    

    public ShowHisMeetingDetailRequest withLimit(Integer limit) {
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

    

    public ShowHisMeetingDetailRequest withSearchKey(String searchKey) {
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

    

    public ShowHisMeetingDetailRequest withUserUUID(String userUUID) {
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

    

    public ShowHisMeetingDetailRequest withXType(Integer xType) {
        this.xType = xType;
        return this;
    }

    


    /**
     * Get xType
     * @return xType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Type")
    public Integer getXType() {
        return xType;
    }

    public void setXType(Integer xType) {
        this.xType = xType;
    }

    

    public ShowHisMeetingDetailRequest withXQueryType(Integer xQueryType) {
        this.xQueryType = xQueryType;
        return this;
    }

    


    /**
     * Get xQueryType
     * @return xQueryType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Query-Type")
    public Integer getXQueryType() {
        return xQueryType;
    }

    public void setXQueryType(Integer xQueryType) {
        this.xQueryType = xQueryType;
    }

    

    public ShowHisMeetingDetailRequest withXAuthorizationType(String xAuthorizationType) {
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

    

    public ShowHisMeetingDetailRequest withXSiteId(String xSiteId) {
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
        ShowHisMeetingDetailRequest showHisMeetingDetailRequest = (ShowHisMeetingDetailRequest) o;
        return Objects.equals(this.confUUID, showHisMeetingDetailRequest.confUUID) &&
            Objects.equals(this.offset, showHisMeetingDetailRequest.offset) &&
            Objects.equals(this.limit, showHisMeetingDetailRequest.limit) &&
            Objects.equals(this.searchKey, showHisMeetingDetailRequest.searchKey) &&
            Objects.equals(this.userUUID, showHisMeetingDetailRequest.userUUID) &&
            Objects.equals(this.xType, showHisMeetingDetailRequest.xType) &&
            Objects.equals(this.xQueryType, showHisMeetingDetailRequest.xQueryType) &&
            Objects.equals(this.xAuthorizationType, showHisMeetingDetailRequest.xAuthorizationType) &&
            Objects.equals(this.xSiteId, showHisMeetingDetailRequest.xSiteId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confUUID, offset, limit, searchKey, userUUID, xType, xQueryType, xAuthorizationType, xSiteId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHisMeetingDetailRequest {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
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

