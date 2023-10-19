package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NAVIServiceRespPath
 */
public class NAVIServiceRespPath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linkID")

    private String linkID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private Float x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private Float y;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "z")

    private Float z;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floor")

    private String floor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "building")

    private String building;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public NAVIServiceRespPath withLinkID(String linkID) {
        this.linkID = linkID;
        return this;
    }

    /**
     * 路段ID。
     * @return linkID
     */
    public String getLinkID() {
        return linkID;
    }

    public void setLinkID(String linkID) {
        this.linkID = linkID;
    }

    public NAVIServiceRespPath withX(Float x) {
        this.x = x;
        return this;
    }

    /**
     * X坐标。
     * @return x
     */
    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public NAVIServiceRespPath withY(Float y) {
        this.y = y;
        return this;
    }

    /**
     * Y坐标。
     * @return y
     */
    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public NAVIServiceRespPath withZ(Float z) {
        this.z = z;
        return this;
    }

    /**
     * Z坐标。
     * @return z
     */
    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    public NAVIServiceRespPath withFloor(String floor) {
        this.floor = floor;
        return this;
    }

    /**
     * 楼层信息。
     * @return floor
     */
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public NAVIServiceRespPath withBuilding(String building) {
        this.building = building;
        return this;
    }

    /**
     * 楼层的描述。
     * @return building
     */
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public NAVIServiceRespPath withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 路段状态。 -  0：未经计算 -  1：直行 -  2：左转 -  3：左前方 -  4：左后方 -  5：右转 -  6：右前方 -  7：右后方 -  8：直梯 -  9：终止点 -  10：扶梯 -  11：楼梯 -  12：途经点
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NAVIServiceRespPath that = (NAVIServiceRespPath) obj;
        return Objects.equals(this.linkID, that.linkID) && Objects.equals(this.x, that.x)
            && Objects.equals(this.y, that.y) && Objects.equals(this.z, that.z)
            && Objects.equals(this.floor, that.floor) && Objects.equals(this.building, that.building)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkID, x, y, z, floor, building, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NAVIServiceRespPath {\n");
        sb.append("    linkID: ").append(toIndentedString(linkID)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    z: ").append(toIndentedString(z)).append("\n");
        sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
        sb.append("    building: ").append(toIndentedString(building)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
