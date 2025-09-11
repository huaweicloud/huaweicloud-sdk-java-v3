package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释** 监控视图图表坐标 **约束限制** 不涉及 
 */
public class BaseWidgetInfoLocation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left")

    private Integer left;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    public BaseWidgetInfoLocation withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * **参数解释** 监控视图的上坐标 **约束限制** 不涉及               **取值范围** 最小值为0，最大值为2147483647 **默认取值** 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public BaseWidgetInfoLocation withLeft(Integer left) {
        this.left = left;
        return this;
    }

    /**
     * **参数解释** 监控视图的左坐标 **约束限制** 不涉及               **取值范围** 最小值为0，最大值为9 **默认取值** 不涉及 
     * minimum: 0
     * maximum: 9
     * @return left
     */
    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public BaseWidgetInfoLocation withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * **参数解释** 监控视图图表宽度 **约束限制** 不涉及               **取值范围** 最小值为3，最大值为12 **默认取值** 不涉及 
     * minimum: 3
     * maximum: 12
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public BaseWidgetInfoLocation withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * **参数解释** 监控视图图表高度 **约束限制** 不涉及               **取值范围** 最小值为3，最大值为2147483647 **默认取值** 不涉及 
     * minimum: 3
     * maximum: 2147483647
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseWidgetInfoLocation that = (BaseWidgetInfoLocation) obj;
        return Objects.equals(this.top, that.top) && Objects.equals(this.left, that.left)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, left, width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseWidgetInfoLocation {\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    left: ").append(toIndentedString(left)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
