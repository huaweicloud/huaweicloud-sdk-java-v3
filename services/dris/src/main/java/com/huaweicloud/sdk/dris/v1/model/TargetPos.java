package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目标检测框信息。采用万分比相对坐标：即假定任何图像的宽高均为10000*10000时，其目标框的坐标值。在实际图像中恢复实际像素坐标系的方法：X*1920/10000,Y*1080/10000;
 */
public class TargetPos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left_top_x")

    private Long leftTopX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left_top_y")

    private Long leftTopY;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "right_bottom_x")

    private Long rightBottomX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "right_bottom_y")

    private Long rightBottomY;

    public TargetPos withLeftTopX(Long leftTopX) {
        this.leftTopX = leftTopX;
        return this;
    }

    /**
     * **参数说明**：目标区域框左上X坐标。
     * minimum: 0
     * maximum: 2147483647
     * @return leftTopX
     */
    public Long getLeftTopX() {
        return leftTopX;
    }

    public void setLeftTopX(Long leftTopX) {
        this.leftTopX = leftTopX;
    }

    public TargetPos withLeftTopY(Long leftTopY) {
        this.leftTopY = leftTopY;
        return this;
    }

    /**
     * **参数说明**：目标区域框左上Y坐标。
     * minimum: 0
     * maximum: 2147483647
     * @return leftTopY
     */
    public Long getLeftTopY() {
        return leftTopY;
    }

    public void setLeftTopY(Long leftTopY) {
        this.leftTopY = leftTopY;
    }

    public TargetPos withRightBottomX(Long rightBottomX) {
        this.rightBottomX = rightBottomX;
        return this;
    }

    /**
     * **参数说明**：目标区域框右下X坐标。
     * minimum: 0
     * maximum: 2147483647
     * @return rightBottomX
     */
    public Long getRightBottomX() {
        return rightBottomX;
    }

    public void setRightBottomX(Long rightBottomX) {
        this.rightBottomX = rightBottomX;
    }

    public TargetPos withRightBottomY(Long rightBottomY) {
        this.rightBottomY = rightBottomY;
        return this;
    }

    /**
     * **参数说明**：目标区域框右下Y坐标。
     * minimum: 0
     * maximum: 2147483647
     * @return rightBottomY
     */
    public Long getRightBottomY() {
        return rightBottomY;
    }

    public void setRightBottomY(Long rightBottomY) {
        this.rightBottomY = rightBottomY;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetPos that = (TargetPos) obj;
        return Objects.equals(this.leftTopX, that.leftTopX) && Objects.equals(this.leftTopY, that.leftTopY)
            && Objects.equals(this.rightBottomX, that.rightBottomX)
            && Objects.equals(this.rightBottomY, that.rightBottomY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftTopX, leftTopY, rightBottomX, rightBottomY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetPos {\n");
        sb.append("    leftTopX: ").append(toIndentedString(leftTopX)).append("\n");
        sb.append("    leftTopY: ").append(toIndentedString(leftTopY)).append("\n");
        sb.append("    rightBottomX: ").append(toIndentedString(rightBottomX)).append("\n");
        sb.append("    rightBottomY: ").append(toIndentedString(rightBottomY)).append("\n");
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
