package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IncidentDetailExtInfoV2
 */
public class IncidentDetailExtInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private String areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_mobile")

    private String remindMobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_mail")

    private String remindMail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_type")

    private String contactType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_time")

    private String remindTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc_email")

    private String ccEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commodity_id")

    private String commodityId;

    public IncidentDetailExtInfoV2 withAreaCode(String areaCode) {
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

    public IncidentDetailExtInfoV2 withRemindMobile(String remindMobile) {
        this.remindMobile = remindMobile;
        return this;
    }

    /**
     * 提醒手机
     * @return remindMobile
     */
    public String getRemindMobile() {
        return remindMobile;
    }

    public void setRemindMobile(String remindMobile) {
        this.remindMobile = remindMobile;
    }

    public IncidentDetailExtInfoV2 withRemindMail(String remindMail) {
        this.remindMail = remindMail;
        return this;
    }

    /**
     * 提醒邮箱
     * @return remindMail
     */
    public String getRemindMail() {
        return remindMail;
    }

    public void setRemindMail(String remindMail) {
        this.remindMail = remindMail;
    }

    public IncidentDetailExtInfoV2 withContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }

    /**
     * 联系方式类型
     * @return contactType
     */
    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public IncidentDetailExtInfoV2 withRemindTime(String remindTime) {
        this.remindTime = remindTime;
        return this;
    }

    /**
     * 提醒时间
     * @return remindTime
     */
    public String getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime;
    }

    public IncidentDetailExtInfoV2 withCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
     * 抄送邮箱
     * @return ccEmail
     */
    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }

    public IncidentDetailExtInfoV2 withCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    /**
     * ISV商品id
     * @return commodityId
     */
    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentDetailExtInfoV2 incidentDetailExtInfoV2 = (IncidentDetailExtInfoV2) o;
        return Objects.equals(this.areaCode, incidentDetailExtInfoV2.areaCode)
            && Objects.equals(this.remindMobile, incidentDetailExtInfoV2.remindMobile)
            && Objects.equals(this.remindMail, incidentDetailExtInfoV2.remindMail)
            && Objects.equals(this.contactType, incidentDetailExtInfoV2.contactType)
            && Objects.equals(this.remindTime, incidentDetailExtInfoV2.remindTime)
            && Objects.equals(this.ccEmail, incidentDetailExtInfoV2.ccEmail)
            && Objects.equals(this.commodityId, incidentDetailExtInfoV2.commodityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, remindMobile, remindMail, contactType, remindTime, ccEmail, commodityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentDetailExtInfoV2 {\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    remindMobile: ").append(toIndentedString(remindMobile)).append("\n");
        sb.append("    remindMail: ").append(toIndentedString(remindMail)).append("\n");
        sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
        sb.append("    remindTime: ").append(toIndentedString(remindTime)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        sb.append("    commodityId: ").append(toIndentedString(commodityId)).append("\n");
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
