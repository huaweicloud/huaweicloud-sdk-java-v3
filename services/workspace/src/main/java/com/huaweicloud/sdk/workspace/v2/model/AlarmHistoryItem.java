package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmHistoryItem
 */
public class AlarmHistoryItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private AlarmMetric metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private AlarmCondition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_info")

    private AdditionalInfo additionalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_points")

    private List<DataPointInfo> dataPoints = null;

    public AlarmHistoryItem withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 告警记录。
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public AlarmHistoryItem withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警规则ID。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public AlarmHistoryItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 告警规则的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlarmHistoryItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 告警记录的状态，取值为ok，alarm，invalid； ok为正常，alarm为告警，invalid为已失效。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AlarmHistoryItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 告警规则类型 | ALL_INSTANCE为全部资源指标告警， RESOURCE_GROUP为资源分组指标告警， MULTI_INSTANCE为指定资源指标告警， EVENT.SYS为系统事件告警， EVENT.CUSTOM自定义事件告警， DNSHealthCheck为健康检查告警。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AlarmHistoryItem withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 告警记录的告警级别，值为1,2,3,4；1为紧急，2为重要，3为次要，4为提示。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public AlarmHistoryItem withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 产生时间,UTC时间。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public AlarmHistoryItem withMetric(AlarmMetric metric) {
        this.metric = metric;
        return this;
    }

    public AlarmHistoryItem withMetric(Consumer<AlarmMetric> metricSetter) {
        if (this.metric == null) {
            this.metric = new AlarmMetric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public AlarmMetric getMetric() {
        return metric;
    }

    public void setMetric(AlarmMetric metric) {
        this.metric = metric;
    }

    public AlarmHistoryItem withCondition(AlarmCondition condition) {
        this.condition = condition;
        return this;
    }

    public AlarmHistoryItem withCondition(Consumer<AlarmCondition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new AlarmCondition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public AlarmCondition getCondition() {
        return condition;
    }

    public void setCondition(AlarmCondition condition) {
        this.condition = condition;
    }

    public AlarmHistoryItem withAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public AlarmHistoryItem withAdditionalInfo(Consumer<AdditionalInfo> additionalInfoSetter) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new AdditionalInfo();
            additionalInfoSetter.accept(this.additionalInfo);
        }

        return this;
    }

    /**
     * Get additionalInfo
     * @return additionalInfo
     */
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public AlarmHistoryItem withDataPoints(List<DataPointInfo> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public AlarmHistoryItem addDataPointsItem(DataPointInfo dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public AlarmHistoryItem withDataPoints(Consumer<List<DataPointInfo>> dataPointsSetter) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 计算出该条告警记录的资源监控数据上报时间和监控数值。
     * @return dataPoints
     */
    public List<DataPointInfo> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<DataPointInfo> dataPoints) {
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
        AlarmHistoryItem that = (AlarmHistoryItem) obj;
        return Objects.equals(this.recordId, that.recordId) && Objects.equals(this.alarmId, that.alarmId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type) && Objects.equals(this.level, that.level)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.additionalInfo, that.additionalInfo)
            && Objects.equals(this.dataPoints, that.dataPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId,
            alarmId,
            name,
            status,
            type,
            level,
            beginTime,
            metric,
            condition,
            additionalInfo,
            dataPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmHistoryItem {\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
