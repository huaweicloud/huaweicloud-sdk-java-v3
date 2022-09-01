package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListHasVerifiedContactsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_way")

    @JacksonXmlProperty(localName = "contact_way")

    private Integer contactWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    @JacksonXmlProperty(localName = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_id")

    @JacksonXmlProperty(localName = "sub_customer_id")

    private String subCustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    @JacksonXmlProperty(localName = "expired_time")

    private String expiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_id")

    @JacksonXmlProperty(localName = "verified_id")

    private String verifiedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_value")

    @JacksonXmlProperty(localName = "contact_value")

    private String contactValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    @JacksonXmlProperty(localName = "area_code")

    private String areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")

    @JacksonXmlProperty(localName = "X-Site")

    private Integer xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    @JacksonXmlProperty(localName = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")

    @JacksonXmlProperty(localName = "X-Time-Zone")

    private String xTimeZone;

    public ListHasVerifiedContactsRequest withContactWay(Integer contactWay) {
        this.contactWay = contactWay;
        return this;
    }

    /**
     * 联系方式类型
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
     * 客户id
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
     * 子用户id
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
     * 过期时间
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
     * 验证序列号
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
     * 联系方式的值
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
     * 国家码
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
     * 查询偏移量
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
     * 查询数量
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
     * 对接站点信息。  0（中国站） 1（国际站），不填的话默认为0。
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")
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
     * 语言环境，值为通用的语言描述字符串，比如zh-cn等，默认为zh-cn。  会根据语言环境对应展示一些国际化的信息，比如工单类型名称等。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
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
     * 环境时区，值为通用的时区描述字符串，比如GMT+8等，默认为GMT+8。  涉及时间的数据会根据环境时区处理。
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")
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
        return Objects.equals(this.contactWay, listHasVerifiedContactsRequest.contactWay)
            && Objects.equals(this.customerId, listHasVerifiedContactsRequest.customerId)
            && Objects.equals(this.subCustomerId, listHasVerifiedContactsRequest.subCustomerId)
            && Objects.equals(this.expiredTime, listHasVerifiedContactsRequest.expiredTime)
            && Objects.equals(this.verifiedId, listHasVerifiedContactsRequest.verifiedId)
            && Objects.equals(this.contactValue, listHasVerifiedContactsRequest.contactValue)
            && Objects.equals(this.areaCode, listHasVerifiedContactsRequest.areaCode)
            && Objects.equals(this.offset, listHasVerifiedContactsRequest.offset)
            && Objects.equals(this.limit, listHasVerifiedContactsRequest.limit)
            && Objects.equals(this.xSite, listHasVerifiedContactsRequest.xSite)
            && Objects.equals(this.xLanguage, listHasVerifiedContactsRequest.xLanguage)
            && Objects.equals(this.xTimeZone, listHasVerifiedContactsRequest.xTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactWay,
            customerId,
            subCustomerId,
            expiredTime,
            verifiedId,
            contactValue,
            areaCode,
            offset,
            limit,
            xSite,
            xLanguage,
            xTimeZone);
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
