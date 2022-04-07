package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DownUpTimeForSimCardReq */
public class DownUpTimeForSimCardReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "down_up_switch")

    private Integer downUpSwitch;

    public DownUpTimeForSimCardReq withDownUpSwitch(Integer downUpSwitch) {
        this.downUpSwitch = downUpSwitch;
        return this;
    }

    /** 启用停用开关 minimum: 0 maximum: 2147483647
     * 
     * @return downUpSwitch */
    public Integer getDownUpSwitch() {
        return downUpSwitch;
    }

    public void setDownUpSwitch(Integer downUpSwitch) {
        this.downUpSwitch = downUpSwitch;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownUpTimeForSimCardReq downUpTimeForSimCardReq = (DownUpTimeForSimCardReq) o;
        return Objects.equals(this.downUpSwitch, downUpTimeForSimCardReq.downUpSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downUpSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownUpTimeForSimCardReq {\n");
        sb.append("    downUpSwitch: ").append(toIndentedString(downUpSwitch)).append("\n");
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
