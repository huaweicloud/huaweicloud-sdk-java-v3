package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetSpeedValueReq
 */
public class SetSpeedValueReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_value")

    private Integer speedValue;

    public SetSpeedValueReq withSpeedValue(Integer speedValue) {
        this.speedValue = speedValue;
        return this;
    }

    /**
     * 限制带宽速率，单位 Kbps，-1表示不限速,1Mbps=1024Kbps。正整数表示限制到当前速率，电信支持限制速率:1Kbps,64 Kbps,256 Kbps,512Kbps,1Mbs，3Mbs,5Mbs,7Mbs,10Mbs,20Mbs,30Mbs,40Mbs,50Mbs,60Mbs,70Mbs,80Mbs,90Mbs,100Mbs,110Mbs,120Mbs,130Mbs,140Mbs,150Mbs。联通支持限制速率:256Kbps,512Kbps,1Mbps,2Mbps,7.25Mbps。
     * minimum: -1
     * @return speedValue
     */
    public Integer getSpeedValue() {
        return speedValue;
    }

    public void setSpeedValue(Integer speedValue) {
        this.speedValue = speedValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetSpeedValueReq that = (SetSpeedValueReq) obj;
        return Objects.equals(this.speedValue, that.speedValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetSpeedValueReq {\n");
        sb.append("    speedValue: ").append(toIndentedString(speedValue)).append("\n");
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
