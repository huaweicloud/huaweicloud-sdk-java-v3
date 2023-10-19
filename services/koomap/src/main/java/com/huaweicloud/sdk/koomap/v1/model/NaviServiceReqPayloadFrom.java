package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 起始位置。
 */
public class NaviServiceReqPayloadFrom {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private String x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private String y;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "z")

    private String z;

    public NaviServiceReqPayloadFrom withX(String x) {
        this.x = x;
        return this;
    }

    /**
     * X坐标。
     * @return x
     */
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public NaviServiceReqPayloadFrom withY(String y) {
        this.y = y;
        return this;
    }

    /**
     * Y坐标。
     * @return y
     */
    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public NaviServiceReqPayloadFrom withZ(String z) {
        this.z = z;
        return this;
    }

    /**
     * Z坐标。
     * @return z
     */
    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NaviServiceReqPayloadFrom that = (NaviServiceReqPayloadFrom) obj;
        return Objects.equals(this.x, that.x) && Objects.equals(this.y, that.y) && Objects.equals(this.z, that.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NaviServiceReqPayloadFrom {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    z: ").append(toIndentedString(z)).append("\n");
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
