package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TrendQueryDataResp
 */
public class TrendQueryDataResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time")

    private Long queryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_name")

    private String indicatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_object_id")

    private String subObjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_points")

    private List<TrendQueryData> dataPoints = null;

    public TrendQueryDataResp withQueryTime(Long queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    /**
     * 查询时间。
     * @return queryTime
     */
    public Long getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Long queryTime) {
        this.queryTime = queryTime;
    }

    public TrendQueryDataResp withIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
        return this;
    }

    /**
     * 监控指标名称。
     * @return indicatorName
     */
    public String getIndicatorName() {
        return indicatorName;
    }

    public void setIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
    }

    public TrendQueryDataResp withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 监控对象id。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public TrendQueryDataResp withUnit(String unit) {
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

    public TrendQueryDataResp withSubObjectId(String subObjectId) {
        this.subObjectId = subObjectId;
        return this;
    }

    /**
     * 次级监控id。
     * @return subObjectId
     */
    public String getSubObjectId() {
        return subObjectId;
    }

    public void setSubObjectId(String subObjectId) {
        this.subObjectId = subObjectId;
    }

    public TrendQueryDataResp withDataPoints(List<TrendQueryData> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public TrendQueryDataResp addDataPointsItem(TrendQueryData dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public TrendQueryDataResp withDataPoints(Consumer<List<TrendQueryData>> dataPointsSetter) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 节点数据。
     * @return dataPoints
     */
    public List<TrendQueryData> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<TrendQueryData> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrendQueryDataResp that = (TrendQueryDataResp) obj;
        return Objects.equals(this.queryTime, that.queryTime) && Objects.equals(this.indicatorName, that.indicatorName)
            && Objects.equals(this.objectId, that.objectId) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.subObjectId, that.subObjectId) && Objects.equals(this.dataPoints, that.dataPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryTime, indicatorName, objectId, unit, subObjectId, dataPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendQueryDataResp {\n");
        sb.append("    queryTime: ").append(toIndentedString(queryTime)).append("\n");
        sb.append("    indicatorName: ").append(toIndentedString(indicatorName)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    subObjectId: ").append(toIndentedString(subObjectId)).append("\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
