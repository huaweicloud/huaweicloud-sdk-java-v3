package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 趋势图数据模型。
 */
public class FrontLine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "point_list")

    private List<FrontPoint> pointList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precision")

    private Integer precision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    public FrontLine withPointList(List<FrontPoint> pointList) {
        this.pointList = pointList;
        return this;
    }

    public FrontLine addPointListItem(FrontPoint pointListItem) {
        if (this.pointList == null) {
            this.pointList = new ArrayList<>();
        }
        this.pointList.add(pointListItem);
        return this;
    }

    public FrontLine withPointList(Consumer<List<FrontPoint>> pointListSetter) {
        if (this.pointList == null) {
            this.pointList = new ArrayList<>();
        }
        pointListSetter.accept(this.pointList);
        return this;
    }

    /**
     * 数据点集合。
     * @return pointList
     */
    public List<FrontPoint> getPointList() {
        return pointList;
    }

    public void setPointList(List<FrontPoint> pointList) {
        this.pointList = pointList;
    }

    public FrontLine withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FrontLine withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public FrontLine withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * 百分比。
     * @return precision
     */
    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public FrontLine withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 日期类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public FrontLine withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 是否可见。
     * @return visible
     */
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrontLine that = (FrontLine) obj;
        return Objects.equals(this.pointList, that.pointList) && Objects.equals(this.title, that.title)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.precision, that.precision)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.visible, that.visible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointList, title, unit, precision, dataType, visible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrontLine {\n");
        sb.append("    pointList: ").append(toIndentedString(pointList)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
