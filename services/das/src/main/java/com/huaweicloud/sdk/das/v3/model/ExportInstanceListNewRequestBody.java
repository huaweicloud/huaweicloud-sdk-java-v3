package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出实例列表请求体
 */
public class ExportInstanceListNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_group")

    private String engineGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_value")

    private String orderValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_names")

    private List<String> metricNames = null;

    public ExportInstanceListNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ExportInstanceListNewRequestBody withEngineGroup(String engineGroup) {
        this.engineGroup = engineGroup;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineGroup
     */
    public String getEngineGroup() {
        return engineGroup;
    }

    public void setEngineGroup(String engineGroup) {
        this.engineGroup = engineGroup;
    }

    public ExportInstanceListNewRequestBody withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 实例状态，取值范围：normal（正常）、abnormal（异常）、metricAbnormal（指标异常）、dataDiskFull（磁盘不足）、all（所有）
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public ExportInstanceListNewRequestBody withOrderValue(String orderValue) {
        this.orderValue = orderValue;
        return this;
    }

    /**
     * 排序条件
     * @return orderValue
     */
    public String getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(String orderValue) {
        this.orderValue = orderValue;
    }

    public ExportInstanceListNewRequestBody withMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public ExportInstanceListNewRequestBody addMetricNamesItem(String metricNamesItem) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        this.metricNames.add(metricNamesItem);
        return this;
    }

    public ExportInstanceListNewRequestBody withMetricNames(Consumer<List<String>> metricNamesSetter) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        metricNamesSetter.accept(this.metricNames);
        return this;
    }

    /**
     * 指标名称
     * @return metricNames
     */
    public List<String> getMetricNames() {
        return metricNames;
    }

    public void setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportInstanceListNewRequestBody that = (ExportInstanceListNewRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.engineGroup, that.engineGroup)
            && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.orderValue, that.orderValue) && Objects.equals(this.metricNames, that.metricNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, engineGroup, instanceStatus, orderValue, metricNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportInstanceListNewRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    engineGroup: ").append(toIndentedString(engineGroup)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    orderValue: ").append(toIndentedString(orderValue)).append("\n");
        sb.append("    metricNames: ").append(toIndentedString(metricNames)).append("\n");
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
