package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 安全报告的页边距
 */
public class MarginInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left")

    private Integer left;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bottom")

    private Integer bottom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "right")

    private Integer right;

    public MarginInfo withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * 安全报告的上边距
     * minimum: 0
     * maximum: 3344
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public MarginInfo withLeft(Integer left) {
        this.left = left;
        return this;
    }

    /**
     * 安全报告的左边距
     * minimum: 1
     * maximum: 3344
     * @return left
     */
    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public MarginInfo withBottom(Integer bottom) {
        this.bottom = bottom;
        return this;
    }

    /**
     * 安全报告的下边距
     * minimum: 0
     * maximum: 3344
     * @return bottom
     */
    public Integer getBottom() {
        return bottom;
    }

    public void setBottom(Integer bottom) {
        this.bottom = bottom;
    }

    public MarginInfo withRight(Integer right) {
        this.right = right;
        return this;
    }

    /**
     * 安全报告的右边距
     * minimum: 1
     * maximum: 3344
     * @return right
     */
    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarginInfo that = (MarginInfo) obj;
        return Objects.equals(this.top, that.top) && Objects.equals(this.left, that.left)
            && Objects.equals(this.bottom, that.bottom) && Objects.equals(this.right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, left, bottom, right);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarginInfo {\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    left: ").append(toIndentedString(left)).append("\n");
        sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
        sb.append("    right: ").append(toIndentedString(right)).append("\n");
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
