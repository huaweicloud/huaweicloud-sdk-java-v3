package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QRLocationDetail
 */
public class QRLocationDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_left_x")

    private Integer topLeftX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_left_y")

    private Integer topLeftY;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bottom_right_x")

    private Integer bottomRightX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bottom_right_y")

    private Integer bottomRightY;

    public QRLocationDetail withTopLeftX(Integer topLeftX) {
        this.topLeftX = topLeftX;
        return this;
    }

    /**
     * 检测出的二维码左上角横坐标。
     * @return topLeftX
     */
    public Integer getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(Integer topLeftX) {
        this.topLeftX = topLeftX;
    }

    public QRLocationDetail withTopLeftY(Integer topLeftY) {
        this.topLeftY = topLeftY;
        return this;
    }

    /**
     * 检测出的二维码左上角纵坐标。
     * @return topLeftY
     */
    public Integer getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(Integer topLeftY) {
        this.topLeftY = topLeftY;
    }

    public QRLocationDetail withBottomRightX(Integer bottomRightX) {
        this.bottomRightX = bottomRightX;
        return this;
    }

    /**
     * 检测出的二维码右下角横坐标。
     * @return bottomRightX
     */
    public Integer getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(Integer bottomRightX) {
        this.bottomRightX = bottomRightX;
    }

    public QRLocationDetail withBottomRightY(Integer bottomRightY) {
        this.bottomRightY = bottomRightY;
        return this;
    }

    /**
     * 检测出的二维码右下角纵坐标。
     * @return bottomRightY
     */
    public Integer getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(Integer bottomRightY) {
        this.bottomRightY = bottomRightY;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QRLocationDetail qrLocationDetail = (QRLocationDetail) o;
        return Objects.equals(this.topLeftX, qrLocationDetail.topLeftX)
            && Objects.equals(this.topLeftY, qrLocationDetail.topLeftY)
            && Objects.equals(this.bottomRightX, qrLocationDetail.bottomRightX)
            && Objects.equals(this.bottomRightY, qrLocationDetail.bottomRightY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeftX, topLeftY, bottomRightX, bottomRightY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QRLocationDetail {\n");
        sb.append("    topLeftX: ").append(toIndentedString(topLeftX)).append("\n");
        sb.append("    topLeftY: ").append(toIndentedString(topLeftY)).append("\n");
        sb.append("    bottomRightX: ").append(toIndentedString(bottomRightX)).append("\n");
        sb.append("    bottomRightY: ").append(toIndentedString(bottomRightY)).append("\n");
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
