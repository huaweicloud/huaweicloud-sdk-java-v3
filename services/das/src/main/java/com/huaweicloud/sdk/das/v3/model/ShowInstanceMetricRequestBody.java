package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询实例指标请求体
 */
public class ShowInstanceMetricRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infos")

    private List<InstanceInfoForMetric> infos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_names")

    private List<String> metricNames = null;

    public ShowInstanceMetricRequestBody withEngineType(String engineType) {
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

    public ShowInstanceMetricRequestBody withInfos(List<InstanceInfoForMetric> infos) {
        this.infos = infos;
        return this;
    }

    public ShowInstanceMetricRequestBody addInfosItem(InstanceInfoForMetric infosItem) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        this.infos.add(infosItem);
        return this;
    }

    public ShowInstanceMetricRequestBody withInfos(Consumer<List<InstanceInfoForMetric>> infosSetter) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        infosSetter.accept(this.infos);
        return this;
    }

    /**
     * 实例信息列表
     * @return infos
     */
    public List<InstanceInfoForMetric> getInfos() {
        return infos;
    }

    public void setInfos(List<InstanceInfoForMetric> infos) {
        this.infos = infos;
    }

    public ShowInstanceMetricRequestBody withMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public ShowInstanceMetricRequestBody addMetricNamesItem(String metricNamesItem) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        this.metricNames.add(metricNamesItem);
        return this;
    }

    public ShowInstanceMetricRequestBody withMetricNames(Consumer<List<String>> metricNamesSetter) {
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
        ShowInstanceMetricRequestBody that = (ShowInstanceMetricRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.infos, that.infos)
            && Objects.equals(this.metricNames, that.metricNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, infos, metricNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMetricRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
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
