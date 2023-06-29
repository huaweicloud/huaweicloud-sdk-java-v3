package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 指标类型统计数据
 */
public class CreateIndicatorDetailIndicatorType {

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
    @JsonProperty(value = "layoutId")

    private String layoutId;

    public CreateIndicatorDetailIndicatorType withIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
        return this;
    }

    /**
     * indicator_type
     * @return indicatorType
     */
    public String getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
    }

    public CreateIndicatorDetailIndicatorType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateIndicatorDetailIndicatorType withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * category
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateIndicatorDetailIndicatorType withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * layoutId
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
        CreateIndicatorDetailIndicatorType that = (CreateIndicatorDetailIndicatorType) obj;
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
        sb.append("class CreateIndicatorDetailIndicatorType {\n");
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
