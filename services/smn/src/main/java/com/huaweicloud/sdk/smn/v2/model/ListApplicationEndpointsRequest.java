package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListApplicationEndpointsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_urn")
    
    private String applicationUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private String enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String token;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;

    public ListApplicationEndpointsRequest withApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
        return this;
    }

    


    /**
     * Get applicationUrn
     * @return applicationUrn
     */
    public String getApplicationUrn() {
        return applicationUrn;
    }

    public void setApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
    }

    

    public ListApplicationEndpointsRequest withOffset(Integer offset) {
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

    

    public ListApplicationEndpointsRequest withLimit(Integer limit) {
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

    

    public ListApplicationEndpointsRequest withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * Get enabled
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    

    public ListApplicationEndpointsRequest withToken(String token) {
        this.token = token;
        return this;
    }

    


    /**
     * Get token
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    

    public ListApplicationEndpointsRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * Get userData
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApplicationEndpointsRequest listApplicationEndpointsRequest = (ListApplicationEndpointsRequest) o;
        return Objects.equals(this.applicationUrn, listApplicationEndpointsRequest.applicationUrn) &&
            Objects.equals(this.offset, listApplicationEndpointsRequest.offset) &&
            Objects.equals(this.limit, listApplicationEndpointsRequest.limit) &&
            Objects.equals(this.enabled, listApplicationEndpointsRequest.enabled) &&
            Objects.equals(this.token, listApplicationEndpointsRequest.token) &&
            Objects.equals(this.userData, listApplicationEndpointsRequest.userData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationUrn, offset, limit, enabled, token, userData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationEndpointsRequest {\n");
        sb.append("    applicationUrn: ").append(toIndentedString(applicationUrn)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    token: ").append(toIndentedString("******")).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

