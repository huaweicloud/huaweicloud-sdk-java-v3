package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ContactV2
 */
public class ContactV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_way")

    private Integer contactWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_value")

    private String contactValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private String areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_id")

    private String verifiedId;

    public ContactV2 withContactWay(Integer contactWay) {
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

    public ContactV2 withContactValue(String contactValue) {
        this.contactValue = contactValue;
        return this;
    }

    /**
     * 联系方式值
     * @return contactValue
     */
    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public ContactV2 withAreaCode(String areaCode) {
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

    public ContactV2 withVerifiedId(String verifiedId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContactV2 that = (ContactV2) obj;
        return Objects.equals(this.contactWay, that.contactWay) && Objects.equals(this.contactValue, that.contactValue)
            && Objects.equals(this.areaCode, that.areaCode) && Objects.equals(this.verifiedId, that.verifiedId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactWay, contactValue, areaCode, verifiedId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactV2 {\n");
        sb.append("    contactWay: ").append(toIndentedString(contactWay)).append("\n");
        sb.append("    contactValue: ").append(toIndentedString(contactValue)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    verifiedId: ").append(toIndentedString(verifiedId)).append("\n");
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
