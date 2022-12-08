package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 位置信息。
 */
public class ImmediateEventPosition3D {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lat")

    private BigDecimal lat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lon")

    private BigDecimal lon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ele")

    private BigDecimal ele;

    public ImmediateEventPosition3D withLat(BigDecimal lat) {
        this.lat = lat;
        return this;
    }

    /**
     * **参数说明**：定义纬度数值，北纬为正，南纬为负，单位°，精度小数点后7位。
     * minimum: -9E+1
     * maximum: 9E+1
     * @return lat
     */
    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public ImmediateEventPosition3D withLon(BigDecimal lon) {
        this.lon = lon;
        return this;
    }

    /**
     * **参数说明**：定义经度数值。东经为正，西经为负，单位°，精度小数点后7位。
     * minimum: -1.8E+2
     * maximum: 1.8E+2
     * @return lon
     */
    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public ImmediateEventPosition3D withEle(BigDecimal ele) {
        this.ele = ele;
        return this;
    }

    /**
     * **参数说明**：定义海拔高程，可选，单位为分米。
     * minimum: -4095
     * maximum: 61439
     * @return ele
     */
    public BigDecimal getEle() {
        return ele;
    }

    public void setEle(BigDecimal ele) {
        this.ele = ele;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImmediateEventPosition3D immediateEventPosition3D = (ImmediateEventPosition3D) o;
        return Objects.equals(this.lat, immediateEventPosition3D.lat)
            && Objects.equals(this.lon, immediateEventPosition3D.lon)
            && Objects.equals(this.ele, immediateEventPosition3D.ele);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon, ele);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImmediateEventPosition3D {\n");
        sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
        sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
        sb.append("    ele: ").append(toIndentedString(ele)).append("\n");
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
