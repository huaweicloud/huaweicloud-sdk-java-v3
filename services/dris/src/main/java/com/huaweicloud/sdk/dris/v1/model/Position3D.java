package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 位置信息。
 */
public class Position3D {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lat")

    private Object lat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lon")

    private Object lon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ele")

    private Object ele;

    public Position3D withLat(Object lat) {
        this.lat = lat;
        return this;
    }

    /**
     * **参数说明**：定义纬度数值，北纬为正，南纬为负，单位°，精度小数点后7位。
     * @return lat
     */
    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public Position3D withLon(Object lon) {
        this.lon = lon;
        return this;
    }

    /**
     * **参数说明**：定义经度数值。东经为正，西经为负，单位°，精度小数点后7位。
     * @return lon
     */
    public Object getLon() {
        return lon;
    }

    public void setLon(Object lon) {
        this.lon = lon;
    }

    public Position3D withEle(Object ele) {
        this.ele = ele;
        return this;
    }

    /**
     * **参数说明**：定义海拔高程，可选，单位为分米。
     * @return ele
     */
    public Object getEle() {
        return ele;
    }

    public void setEle(Object ele) {
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
        Position3D position3D = (Position3D) o;
        return Objects.equals(this.lat, position3D.lat) && Objects.equals(this.lon, position3D.lon)
            && Objects.equals(this.ele, position3D.ele);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon, ele);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Position3D {\n");
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
