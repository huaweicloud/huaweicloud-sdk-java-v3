package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TacticsConfig
 */
public class TacticsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron_configs")

    private List<CronConfig> cronConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_configs")

    private List<MetricConfig> metricConfigs = null;

    public TacticsConfig withCronConfigs(List<CronConfig> cronConfigs) {
        this.cronConfigs = cronConfigs;
        return this;
    }

    public TacticsConfig addCronConfigsItem(CronConfig cronConfigsItem) {
        if (this.cronConfigs == null) {
            this.cronConfigs = new ArrayList<>();
        }
        this.cronConfigs.add(cronConfigsItem);
        return this;
    }

    public TacticsConfig withCronConfigs(Consumer<List<CronConfig>> cronConfigsSetter) {
        if (this.cronConfigs == null) {
            this.cronConfigs = new ArrayList<>();
        }
        cronConfigsSetter.accept(this.cronConfigs);
        return this;
    }

    /**
     * 定时配置列表
     * @return cronConfigs
     */
    public List<CronConfig> getCronConfigs() {
        return cronConfigs;
    }

    public void setCronConfigs(List<CronConfig> cronConfigs) {
        this.cronConfigs = cronConfigs;
    }

    public TacticsConfig withMetricConfigs(List<MetricConfig> metricConfigs) {
        this.metricConfigs = metricConfigs;
        return this;
    }

    public TacticsConfig addMetricConfigsItem(MetricConfig metricConfigsItem) {
        if (this.metricConfigs == null) {
            this.metricConfigs = new ArrayList<>();
        }
        this.metricConfigs.add(metricConfigsItem);
        return this;
    }

    public TacticsConfig withMetricConfigs(Consumer<List<MetricConfig>> metricConfigsSetter) {
        if (this.metricConfigs == null) {
            this.metricConfigs = new ArrayList<>();
        }
        metricConfigsSetter.accept(this.metricConfigs);
        return this;
    }

    /**
     * 流量配置列表
     * @return metricConfigs
     */
    public List<MetricConfig> getMetricConfigs() {
        return metricConfigs;
    }

    public void setMetricConfigs(List<MetricConfig> metricConfigs) {
        this.metricConfigs = metricConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TacticsConfig that = (TacticsConfig) obj;
        return Objects.equals(this.cronConfigs, that.cronConfigs)
            && Objects.equals(this.metricConfigs, that.metricConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cronConfigs, metricConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TacticsConfig {\n");
        sb.append("    cronConfigs: ").append(toIndentedString(cronConfigs)).append("\n");
        sb.append("    metricConfigs: ").append(toIndentedString(metricConfigs)).append("\n");
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
