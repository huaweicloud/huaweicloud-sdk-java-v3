package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DownUpTimeForSimCardReq
 */
public class DownUpTimeForSimCardReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "down_up_switch")

    private Integer downUpSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid")

    private String iccid;

    public DownUpTimeForSimCardReq withDownUpSwitch(Integer downUpSwitch) {
        this.downUpSwitch = downUpSwitch;
        return this;
    }

    /**
     * 启用停用开关
     * minimum: 0
     * maximum: 2147483647
     * @return downUpSwitch
     */
    public Integer getDownUpSwitch() {
        return downUpSwitch;
    }

    public void setDownUpSwitch(Integer downUpSwitch) {
        this.downUpSwitch = downUpSwitch;
    }

    public DownUpTimeForSimCardReq withIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }

    /**
     * iccid，传入的sim_card_id为0,则根据iccid进行处理
     * @return iccid
     */
    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownUpTimeForSimCardReq that = (DownUpTimeForSimCardReq) obj;
        return Objects.equals(this.downUpSwitch, that.downUpSwitch) && Objects.equals(this.iccid, that.iccid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downUpSwitch, iccid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownUpTimeForSimCardReq {\n");
        sb.append("    downUpSwitch: ").append(toIndentedString(downUpSwitch)).append("\n");
        sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
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
