package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListL7rulesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policy_id")
    
    private String l7policyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compare_type")
    
    private String compareType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invert")
    
    private Boolean invert;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;

    public ListL7rulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 9223372036854775807
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListL7rulesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListL7rulesRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    


    /**
     * Get pageReverse
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    

    public ListL7rulesRequest withL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
        return this;
    }

    


    /**
     * Get l7policyId
     * @return l7policyId
     */
    public String getL7policyId() {
        return l7policyId;
    }

    public void setL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
    }

    

    public ListL7rulesRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListL7rulesRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * Get adminStateUp
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    public ListL7rulesRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListL7rulesRequest withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    


    /**
     * Get compareType
     * @return compareType
     */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    

    public ListL7rulesRequest withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    


    /**
     * Get invert
     * @return invert
     */
    public Boolean getInvert() {
        return invert;
    }

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    

    public ListL7rulesRequest withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * Get key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public ListL7rulesRequest withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    public ListL7rulesRequest withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * Get provisioningStatus
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListL7rulesRequest listL7rulesRequest = (ListL7rulesRequest) o;
        return Objects.equals(this.limit, listL7rulesRequest.limit) &&
            Objects.equals(this.marker, listL7rulesRequest.marker) &&
            Objects.equals(this.pageReverse, listL7rulesRequest.pageReverse) &&
            Objects.equals(this.l7policyId, listL7rulesRequest.l7policyId) &&
            Objects.equals(this.id, listL7rulesRequest.id) &&
            Objects.equals(this.adminStateUp, listL7rulesRequest.adminStateUp) &&
            Objects.equals(this.type, listL7rulesRequest.type) &&
            Objects.equals(this.compareType, listL7rulesRequest.compareType) &&
            Objects.equals(this.invert, listL7rulesRequest.invert) &&
            Objects.equals(this.key, listL7rulesRequest.key) &&
            Objects.equals(this.value, listL7rulesRequest.value) &&
            Objects.equals(this.provisioningStatus, listL7rulesRequest.provisioningStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, l7policyId, id, adminStateUp, type, compareType, invert, key, value, provisioningStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListL7rulesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    l7policyId: ").append(toIndentedString(l7policyId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    invert: ").append(toIndentedString(invert)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
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

