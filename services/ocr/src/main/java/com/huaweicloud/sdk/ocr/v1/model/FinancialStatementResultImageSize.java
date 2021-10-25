package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** FinancialStatementResultImageSize */
public class FinancialStatementResultImageSize {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    public FinancialStatementResultImageSize withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /** 矫正后图像的高。
     * 
     * @return height */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public FinancialStatementResultImageSize withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /** 矫正后图像的宽。
     * 
     * @return width */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FinancialStatementResultImageSize financialStatementResultImageSize = (FinancialStatementResultImageSize) o;
        return Objects.equals(this.height, financialStatementResultImageSize.height)
            && Objects.equals(this.width, financialStatementResultImageSize.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FinancialStatementResultImageSize {\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
