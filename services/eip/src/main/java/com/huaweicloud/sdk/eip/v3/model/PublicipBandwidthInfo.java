package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 公网IP绑定的带宽信息 */
public class PublicipBandwidthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_type")

    private String shareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    public PublicipBandwidthInfo withId(String id) {
        this.id = id;
        return this;
    }

    /** 带宽ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicipBandwidthInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 功能描述：带宽大小 取值范围：默认5Mbit/s~2000Mbit/s minimum: 0 maximum: 99999
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PublicipBandwidthInfo withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    /** 功能说明：带宽类型,标识是否是共享带宽 取值范围：PER，WHOLE。 PER：独享带宽 WHOLE：共享带宽 约束：其中IPv6暂不支持WHOLE类型带宽。
     * 
     * @return shareType */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public PublicipBandwidthInfo withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /** 功能说明：按流量计费还是按带宽计费 取值范围： bandwidth：按带宽计费 traffic：按流量计费 95peak_plus：按增强型95计费
     * 
     * @return chargeMode */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public PublicipBandwidthInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** 功能说明：带宽名称 取值范围：1-64个字符,支持数字、字母、中文、_(下划线)、-(中划线)、.(点)
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublicipBandwidthInfo withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /** 功能说明：账单信息。如果billinginfo不为空，说明是包周期的带宽
     * 
     * @return billingInfo */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicipBandwidthInfo publicipBandwidthInfo = (PublicipBandwidthInfo) o;
        return Objects.equals(this.id, publicipBandwidthInfo.id)
            && Objects.equals(this.size, publicipBandwidthInfo.size)
            && Objects.equals(this.shareType, publicipBandwidthInfo.shareType)
            && Objects.equals(this.chargeMode, publicipBandwidthInfo.chargeMode)
            && Objects.equals(this.name, publicipBandwidthInfo.name)
            && Objects.equals(this.billingInfo, publicipBandwidthInfo.billingInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size, shareType, chargeMode, name, billingInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicipBandwidthInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
