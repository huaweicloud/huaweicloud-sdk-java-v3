package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 投递详情
 */
public class DeliverDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverTime")

    private String deliverTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverStatus")

    private String deliverStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverConsuming")

    private String deliverConsuming;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverRspCode")

    private String deliverRspCode;

    public DeliverDetail withDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
        return this;
    }

    /**
     * 投递时间   格式 yyyy/mm/dd xx:yy:zz
     * @return deliverTime
     */
    public String getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    public DeliverDetail withDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus;
        return this;
    }

    /**
     * 投递状态     SUCCESS Or  FAILED
     * @return deliverStatus
     */
    public String getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public DeliverDetail withDeliverConsuming(String deliverConsuming) {
        this.deliverConsuming = deliverConsuming;
        return this;
    }

    /**
     * 投递耗时，单位ms
     * @return deliverConsuming
     */
    public String getDeliverConsuming() {
        return deliverConsuming;
    }

    public void setDeliverConsuming(String deliverConsuming) {
        this.deliverConsuming = deliverConsuming;
    }

    public DeliverDetail withDeliverRspCode(String deliverRspCode) {
        this.deliverRspCode = deliverRspCode;
        return this;
    }

    /**
     * 投递响应码
     * @return deliverRspCode
     */
    public String getDeliverRspCode() {
        return deliverRspCode;
    }

    public void setDeliverRspCode(String deliverRspCode) {
        this.deliverRspCode = deliverRspCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeliverDetail that = (DeliverDetail) obj;
        return Objects.equals(this.deliverTime, that.deliverTime)
            && Objects.equals(this.deliverStatus, that.deliverStatus)
            && Objects.equals(this.deliverConsuming, that.deliverConsuming)
            && Objects.equals(this.deliverRspCode, that.deliverRspCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliverTime, deliverStatus, deliverConsuming, deliverRspCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliverDetail {\n");
        sb.append("    deliverTime: ").append(toIndentedString(deliverTime)).append("\n");
        sb.append("    deliverStatus: ").append(toIndentedString(deliverStatus)).append("\n");
        sb.append("    deliverConsuming: ").append(toIndentedString(deliverConsuming)).append("\n");
        sb.append("    deliverRspCode: ").append(toIndentedString(deliverRspCode)).append("\n");
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
