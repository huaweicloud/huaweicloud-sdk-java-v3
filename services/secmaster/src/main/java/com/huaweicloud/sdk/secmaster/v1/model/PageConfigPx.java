package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 安全报告的页边距
 */
public class PageConfigPx {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "margin")

    private MarginInfo margin;

    public PageConfigPx withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 安全报告的宽度
     * minimum: 1
     * maximum: 3344
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public PageConfigPx withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 安全报告的高度
     * minimum: 1
     * maximum: 3344
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public PageConfigPx withMargin(MarginInfo margin) {
        this.margin = margin;
        return this;
    }

    public PageConfigPx withMargin(Consumer<MarginInfo> marginSetter) {
        if (this.margin == null) {
            this.margin = new MarginInfo();
            marginSetter.accept(this.margin);
        }

        return this;
    }

    /**
     * Get margin
     * @return margin
     */
    public MarginInfo getMargin() {
        return margin;
    }

    public void setMargin(MarginInfo margin) {
        this.margin = margin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageConfigPx that = (PageConfigPx) obj;
        return Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.margin, that.margin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, margin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageConfigPx {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
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
