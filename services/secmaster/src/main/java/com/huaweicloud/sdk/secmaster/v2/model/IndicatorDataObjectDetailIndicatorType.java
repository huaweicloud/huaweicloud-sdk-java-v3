package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 情报类型对象
 */
public class IndicatorDataObjectDetailIndicatorType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_type")

    private String indicatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    public IndicatorDataObjectDetailIndicatorType withIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
        return this;
    }

    /**
     * 情报类型
     * @return indicatorType
     */
    public String getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
    }

    public IndicatorDataObjectDetailIndicatorType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 情报类型ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IndicatorDataObjectDetailIndicatorType withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 目录
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public IndicatorDataObjectDetailIndicatorType withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * 布局ID
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndicatorDataObjectDetailIndicatorType that = (IndicatorDataObjectDetailIndicatorType) obj;
        return Objects.equals(this.indicatorType, that.indicatorType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.category, that.category) && Objects.equals(this.layoutId, that.layoutId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indicatorType, id, category, layoutId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicatorDataObjectDetailIndicatorType {\n");
        sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
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
