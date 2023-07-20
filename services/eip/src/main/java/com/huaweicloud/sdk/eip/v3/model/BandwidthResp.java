package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 弹性公网IP中的bandwidth对象，存储公网IP绑定的带宽信息
 */
public class BandwidthResp {

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

    public BandwidthResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * - 功能说明：带宽ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BandwidthResp withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * - 功能说明：带宽大小
     * minimum: 0
     * maximum: 2000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BandwidthResp withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    /**
     * - 功能说明：类型  \"WHOLE\"为共享带宽，\"PER\"为独占带宽
     * @return shareType
     */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public BandwidthResp withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * - 功能说明：带宽计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public BandwidthResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 功能说明：带宽名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BandwidthResp withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * - 功能说明：带宽的订单信息
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandwidthResp that = (BandwidthResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.size, that.size)
            && Objects.equals(this.shareType, that.shareType) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.name, that.name) && Objects.equals(this.billingInfo, that.billingInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size, shareType, chargeMode, name, billingInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
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
