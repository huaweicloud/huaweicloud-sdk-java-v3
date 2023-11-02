package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SpurPredictDetail
 */
public class SpurPredictDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageCode")

    private String imageCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageUrl")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pointWidth")

    private Double pointWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pointHeight")

    private Double pointHeight;

    public SpurPredictDetail withImageCode(String imageCode) {
        this.imageCode = imageCode;
        return this;
    }

    /**
     * 图像ID。
     * @return imageCode
     */
    public String getImageCode() {
        return imageCode;
    }

    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    public SpurPredictDetail withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 图片下载链接。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public SpurPredictDetail withPointWidth(Double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    /**
     * 刺点在图片中的横向像素值。
     * @return pointWidth
     */
    public Double getPointWidth() {
        return pointWidth;
    }

    public void setPointWidth(Double pointWidth) {
        this.pointWidth = pointWidth;
    }

    public SpurPredictDetail withPointHeight(Double pointHeight) {
        this.pointHeight = pointHeight;
        return this;
    }

    /**
     * 刺点在图片中的纵向像素值。
     * @return pointHeight
     */
    public Double getPointHeight() {
        return pointHeight;
    }

    public void setPointHeight(Double pointHeight) {
        this.pointHeight = pointHeight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpurPredictDetail that = (SpurPredictDetail) obj;
        return Objects.equals(this.imageCode, that.imageCode) && Objects.equals(this.imageUrl, that.imageUrl)
            && Objects.equals(this.pointWidth, that.pointWidth) && Objects.equals(this.pointHeight, that.pointHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCode, imageUrl, pointWidth, pointHeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpurPredictDetail {\n");
        sb.append("    imageCode: ").append(toIndentedString(imageCode)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    pointWidth: ").append(toIndentedString(pointWidth)).append("\n");
        sb.append("    pointHeight: ").append(toIndentedString(pointHeight)).append("\n");
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
