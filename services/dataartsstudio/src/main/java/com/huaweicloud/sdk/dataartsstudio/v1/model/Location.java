package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点在作业画布上的位置
 */
public class Location {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private String x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private String y;

    public Location withX(String x) {
        this.x = x;
        return this;
    }

    /**
     * 节点在作业画布上的横轴位置
     * @return x
     */
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public Location withY(String y) {
        this.y = y;
        return this;
    }

    /**
     * 节点在作业画布上的纵轴位置
     * @return y
     */
    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location that = (Location) obj;
        return Objects.equals(this.x, that.x) && Objects.equals(this.y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Location {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
