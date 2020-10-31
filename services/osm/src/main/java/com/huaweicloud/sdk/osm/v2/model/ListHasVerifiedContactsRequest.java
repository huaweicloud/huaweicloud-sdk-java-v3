package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListHasVerifiedContactsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contact_way")
    
    private Integer contactWay;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_customer_id")
    
    private String subCustomerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expired_time")
    
    private String expiredTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verified_id")
    
    private String verifiedId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contact_value")
    
    private String contactValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="area_code")
    
    private String areaCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public ListHasVerifiedContactsRequest withContactWay(Integer contactWay) {
        this.contactWay = contactWay;
        return this;
    }

    


    /**
     * Get contactWay
     * minimum: 0
     * maximum: 1
     * @return contactWay
     */
    public Integer getContactWay() {
        return contactWay;
    }

    public void setContactWay(Integer contactWay) {
        this.contactWay = contactWay;
    }

    public ListHasVerifiedContactsRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * Get customerId
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ListHasVerifiedContactsRequest withSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
        return this;
    }

    


    /**
     * Get subCustomerId
     * @return subCustomerId
     */
    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public ListHasVerifiedContactsRequest withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    


    /**
     * Get expiredTime
     * @return expiredTime
     */
    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public ListHasVerifiedContactsRequest withVerifiedId(String verifiedId) {
        this.verifiedId = verifiedId;
        return this;
    }

    


    /**
     * Get verifiedId
     * @return verifiedId
     */
    public String getVerifiedId() {
        return verifiedId;
    }

    public void setVerifiedId(String verifiedId) {
        this.verifiedId = verifiedId;
    }

    public ListHasVerifiedContactsRequest withContactValue(String contactValue) {
        this.contactValue = contactValue;
        return this;
    }

    


    /**
     * Get contactValue
     * @return contactValue
     */
    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public ListHasVerifiedContactsRequest withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    


    /**
     * Get areaCode
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public ListHasVerifiedContactsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 65535
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListHasVerifiedContactsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListHasVerifiedContactsRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    


    /**
     * Get xSite
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public ListHasVerifiedContactsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListHasVerifiedContactsRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    


    /**
     * Get xTimeZone
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHasVerifiedContactsRequest listHasVerifiedContactsRequest = (ListHasVerifiedContactsRequest) o;
        return Objects.equals(this.contactWay, listHasVerifiedContactsRequest.contactWay) &&
            Objects.equals(this.customerId, listHasVerifiedContactsRequest.customerId) &&
            Objects.equals(this.subCustomerId, listHasVerifiedContactsRequest.subCustomerId) &&
            Objects.equals(this.expiredTime, listHasVerifiedContactsRequest.expiredTime) &&
            Objects.equals(this.verifiedId, listHasVerifiedContactsRequest.verifiedId) &&
            Objects.equals(this.contactValue, listHasVerifiedContactsRequest.contactValue) &&
            Objects.equals(this.areaCode, listHasVerifiedContactsRequest.areaCode) &&
            Objects.equals(this.offset, listHasVerifiedContactsRequest.offset) &&
            Objects.equals(this.limit, listHasVerifiedContactsRequest.limit) &&
            Objects.equals(this.xSite, listHasVerifiedContactsRequest.xSite) &&
            Objects.equals(this.xLanguage, listHasVerifiedContactsRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, listHasVerifiedContactsRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(contactWay, customerId, subCustomerId, expiredTime, verifiedId, contactValue, areaCode, offset, limit, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHasVerifiedContactsRequest {\n");
        sb.append("    contactWay: ").append(toIndentedString(contactWay)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
        sb.append("    verifiedId: ").append(toIndentedString(verifiedId)).append("\n");
        sb.append("    contactValue: ").append(toIndentedString(contactValue)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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

