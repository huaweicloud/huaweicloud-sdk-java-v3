package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 丢包率阈值设置请求体。
 */
public class SetPacketThresholdData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiving")

    private Integer receiving;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sending")

    private Integer sending;

    public SetPacketThresholdData withReceiving(Integer receiving) {
        this.receiving = receiving;
        return this;
    }

    /**
     * 接收方向阈值设定值，单位为百分比(%)。 取值范围：0 - 100。
     * minimum: 0
     * maximum: 100
     * @return receiving
     */
    public Integer getReceiving() {
        return receiving;
    }

    public void setReceiving(Integer receiving) {
        this.receiving = receiving;
    }

    public SetPacketThresholdData withSending(Integer sending) {
        this.sending = sending;
        return this;
    }

    /**
     * 发送方向阈值设定值，单位为百分比(%)。 取值范围：0 - 100。
     * minimum: 0
     * maximum: 100
     * @return sending
     */
    public Integer getSending() {
        return sending;
    }

    public void setSending(Integer sending) {
        this.sending = sending;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetPacketThresholdData that = (SetPacketThresholdData) obj;
        return Objects.equals(this.receiving, that.receiving) && Objects.equals(this.sending, that.sending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiving, sending);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetPacketThresholdData {\n");
        sb.append("    receiving: ").append(toIndentedString(receiving)).append("\n");
        sb.append("    sending: ").append(toIndentedString(sending)).append("\n");
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
