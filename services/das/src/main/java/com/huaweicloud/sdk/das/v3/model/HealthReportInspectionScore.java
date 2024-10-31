package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportInspectionScore
 */
public class HealthReportInspectionScore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    private Integer critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium")

    private Integer medium;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "light")

    private Integer light;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private Double cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_usage")

    private Double memUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_usage")

    private Double spaceUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_rate")

    private Double connectionRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops_usage")

    private Double iopsUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_running")

    private Double threadRunning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_total")

    private Long slowSqlTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lost_points_detail_list")

    private List<HealthReportLostPointsDetail> lostPointsDetailList = null;

    public HealthReportInspectionScore withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 得分。
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public HealthReportInspectionScore withCritical(Integer critical) {
        this.critical = critical;
        return this;
    }

    /**
     * 严重事件。
     * @return critical
     */
    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public HealthReportInspectionScore withMedium(Integer medium) {
        this.medium = medium;
        return this;
    }

    /**
     * 警告事件。
     * @return medium
     */
    public Integer getMedium() {
        return medium;
    }

    public void setMedium(Integer medium) {
        this.medium = medium;
    }

    public HealthReportInspectionScore withLight(Integer light) {
        this.light = light;
        return this;
    }

    /**
     * 优化事件。
     * @return light
     */
    public Integer getLight() {
        return light;
    }

    public void setLight(Integer light) {
        this.light = light;
    }

    public HealthReportInspectionScore withCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * CPU使用率。
     * @return cpuUsage
     */
    public Double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public HealthReportInspectionScore withMemUsage(Double memUsage) {
        this.memUsage = memUsage;
        return this;
    }

    /**
     * 内存使用率。
     * @return memUsage
     */
    public Double getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(Double memUsage) {
        this.memUsage = memUsage;
    }

    public HealthReportInspectionScore withSpaceUsage(Double spaceUsage) {
        this.spaceUsage = spaceUsage;
        return this;
    }

    /**
     * 空间使用率。
     * @return spaceUsage
     */
    public Double getSpaceUsage() {
        return spaceUsage;
    }

    public void setSpaceUsage(Double spaceUsage) {
        this.spaceUsage = spaceUsage;
    }

    public HealthReportInspectionScore withConnectionRate(Double connectionRate) {
        this.connectionRate = connectionRate;
        return this;
    }

    /**
     * 连接使用率。
     * @return connectionRate
     */
    public Double getConnectionRate() {
        return connectionRate;
    }

    public void setConnectionRate(Double connectionRate) {
        this.connectionRate = connectionRate;
    }

    public HealthReportInspectionScore withIopsUsage(Double iopsUsage) {
        this.iopsUsage = iopsUsage;
        return this;
    }

    /**
     * IOPS使用率。
     * @return iopsUsage
     */
    public Double getIopsUsage() {
        return iopsUsage;
    }

    public void setIopsUsage(Double iopsUsage) {
        this.iopsUsage = iopsUsage;
    }

    public HealthReportInspectionScore withThreadRunning(Double threadRunning) {
        this.threadRunning = threadRunning;
        return this;
    }

    /**
     * 活跃会话。
     * @return threadRunning
     */
    public Double getThreadRunning() {
        return threadRunning;
    }

    public void setThreadRunning(Double threadRunning) {
        this.threadRunning = threadRunning;
    }

    public HealthReportInspectionScore withSlowSqlTotal(Long slowSqlTotal) {
        this.slowSqlTotal = slowSqlTotal;
        return this;
    }

    /**
     * 慢SQL数量。
     * @return slowSqlTotal
     */
    public Long getSlowSqlTotal() {
        return slowSqlTotal;
    }

    public void setSlowSqlTotal(Long slowSqlTotal) {
        this.slowSqlTotal = slowSqlTotal;
    }

    public HealthReportInspectionScore withLostPointsDetailList(
        List<HealthReportLostPointsDetail> lostPointsDetailList) {
        this.lostPointsDetailList = lostPointsDetailList;
        return this;
    }

    public HealthReportInspectionScore addLostPointsDetailListItem(
        HealthReportLostPointsDetail lostPointsDetailListItem) {
        if (this.lostPointsDetailList == null) {
            this.lostPointsDetailList = new ArrayList<>();
        }
        this.lostPointsDetailList.add(lostPointsDetailListItem);
        return this;
    }

    public HealthReportInspectionScore withLostPointsDetailList(
        Consumer<List<HealthReportLostPointsDetail>> lostPointsDetailListSetter) {
        if (this.lostPointsDetailList == null) {
            this.lostPointsDetailList = new ArrayList<>();
        }
        lostPointsDetailListSetter.accept(this.lostPointsDetailList);
        return this;
    }

    /**
     * 扣分详情。
     * @return lostPointsDetailList
     */
    public List<HealthReportLostPointsDetail> getLostPointsDetailList() {
        return lostPointsDetailList;
    }

    public void setLostPointsDetailList(List<HealthReportLostPointsDetail> lostPointsDetailList) {
        this.lostPointsDetailList = lostPointsDetailList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportInspectionScore that = (HealthReportInspectionScore) obj;
        return Objects.equals(this.score, that.score) && Objects.equals(this.critical, that.critical)
            && Objects.equals(this.medium, that.medium) && Objects.equals(this.light, that.light)
            && Objects.equals(this.cpuUsage, that.cpuUsage) && Objects.equals(this.memUsage, that.memUsage)
            && Objects.equals(this.spaceUsage, that.spaceUsage)
            && Objects.equals(this.connectionRate, that.connectionRate)
            && Objects.equals(this.iopsUsage, that.iopsUsage) && Objects.equals(this.threadRunning, that.threadRunning)
            && Objects.equals(this.slowSqlTotal, that.slowSqlTotal)
            && Objects.equals(this.lostPointsDetailList, that.lostPointsDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score,
            critical,
            medium,
            light,
            cpuUsage,
            memUsage,
            spaceUsage,
            connectionRate,
            iopsUsage,
            threadRunning,
            slowSqlTotal,
            lostPointsDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportInspectionScore {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
        sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
        sb.append("    light: ").append(toIndentedString(light)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    memUsage: ").append(toIndentedString(memUsage)).append("\n");
        sb.append("    spaceUsage: ").append(toIndentedString(spaceUsage)).append("\n");
        sb.append("    connectionRate: ").append(toIndentedString(connectionRate)).append("\n");
        sb.append("    iopsUsage: ").append(toIndentedString(iopsUsage)).append("\n");
        sb.append("    threadRunning: ").append(toIndentedString(threadRunning)).append("\n");
        sb.append("    slowSqlTotal: ").append(toIndentedString(slowSqlTotal)).append("\n");
        sb.append("    lostPointsDetailList: ").append(toIndentedString(lostPointsDetailList)).append("\n");
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
