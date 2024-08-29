package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetworkSwitchReq
 */
public class NetworkSwitchReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "carrier_type")

    private Integer carrierType;

    public NetworkSwitchReq withCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
        return this;
    }

    /**
     * 切换的目标网络
     * @return carrierType
     */
    public Integer getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkSwitchReq that = (NetworkSwitchReq) obj;
        return Objects.equals(this.carrierType, that.carrierType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkSwitchReq {\n");
        sb.append("    carrierType: ").append(toIndentedString(carrierType)).append("\n");
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
