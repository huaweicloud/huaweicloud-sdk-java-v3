package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Point */
public class Point {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private Double x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private Double y;

    public Point withX(Double x) {
        this.x = x;
        return this;
    }

    /** 坐标横轴数值。
     * 
     * @return x */
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Point withY(Double y) {
        this.y = y;
        return this;
    }

    /** 坐标纵轴数值。
     * 
     * @return y */
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Objects.equals(this.x, point.x) && Objects.equals(this.y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Point {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
