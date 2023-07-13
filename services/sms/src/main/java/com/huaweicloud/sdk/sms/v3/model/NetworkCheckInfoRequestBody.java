package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetworkCheckInfoRequestBody
 */
public class NetworkCheckInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_delay")

    private Double networkDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_jitter")

    private Double networkJitter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_speed")

    private Double migrationSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loss_percentage")

    private Double lossPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private Double cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_usage")

    private Double memUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_result")

    private String evaluationResult;

    public NetworkCheckInfoRequestBody withNetworkDelay(Double networkDelay) {
        this.networkDelay = networkDelay;
        return this;
    }

    /**
     * 网络时延
     * minimum: 0
     * maximum: 1E+4
     * @return networkDelay
     */
    public Double getNetworkDelay() {
        return networkDelay;
    }

    public void setNetworkDelay(Double networkDelay) {
        this.networkDelay = networkDelay;
    }

    public NetworkCheckInfoRequestBody withNetworkJitter(Double networkJitter) {
        this.networkJitter = networkJitter;
        return this;
    }

    /**
     * 网络抖动
     * minimum: 0
     * maximum: 1E+4
     * @return networkJitter
     */
    public Double getNetworkJitter() {
        return networkJitter;
    }

    public void setNetworkJitter(Double networkJitter) {
        this.networkJitter = networkJitter;
    }

    public NetworkCheckInfoRequestBody withMigrationSpeed(Double migrationSpeed) {
        this.migrationSpeed = migrationSpeed;
        return this;
    }

    /**
     * 带宽
     * minimum: 0
     * maximum: 1E+4
     * @return migrationSpeed
     */
    public Double getMigrationSpeed() {
        return migrationSpeed;
    }

    public void setMigrationSpeed(Double migrationSpeed) {
        this.migrationSpeed = migrationSpeed;
    }

    public NetworkCheckInfoRequestBody withLossPercentage(Double lossPercentage) {
        this.lossPercentage = lossPercentage;
        return this;
    }

    /**
     * 丢包
     * minimum: 0
     * maximum: 1E+2
     * @return lossPercentage
     */
    public Double getLossPercentage() {
        return lossPercentage;
    }

    public void setLossPercentage(Double lossPercentage) {
        this.lossPercentage = lossPercentage;
    }

    public NetworkCheckInfoRequestBody withCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * CPU占用
     * minimum: 0
     * maximum: 1E+2
     * @return cpuUsage
     */
    public Double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public NetworkCheckInfoRequestBody withMemUsage(Double memUsage) {
        this.memUsage = memUsage;
        return this;
    }

    /**
     * 内存占用
     * minimum: 0
     * maximum: 1E+2
     * @return memUsage
     */
    public Double getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(Double memUsage) {
        this.memUsage = memUsage;
    }

    public NetworkCheckInfoRequestBody withEvaluationResult(String evaluationResult) {
        this.evaluationResult = evaluationResult;
        return this;
    }

    /**
     * 评估结果
     * @return evaluationResult
     */
    public String getEvaluationResult() {
        return evaluationResult;
    }

    public void setEvaluationResult(String evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkCheckInfoRequestBody that = (NetworkCheckInfoRequestBody) obj;
        return Objects.equals(this.networkDelay, that.networkDelay)
            && Objects.equals(this.networkJitter, that.networkJitter)
            && Objects.equals(this.migrationSpeed, that.migrationSpeed)
            && Objects.equals(this.lossPercentage, that.lossPercentage) && Objects.equals(this.cpuUsage, that.cpuUsage)
            && Objects.equals(this.memUsage, that.memUsage)
            && Objects.equals(this.evaluationResult, that.evaluationResult);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(networkDelay, networkJitter, migrationSpeed, lossPercentage, cpuUsage, memUsage, evaluationResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkCheckInfoRequestBody {\n");
        sb.append("    networkDelay: ").append(toIndentedString(networkDelay)).append("\n");
        sb.append("    networkJitter: ").append(toIndentedString(networkJitter)).append("\n");
        sb.append("    migrationSpeed: ").append(toIndentedString(migrationSpeed)).append("\n");
        sb.append("    lossPercentage: ").append(toIndentedString(lossPercentage)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    memUsage: ").append(toIndentedString(memUsage)).append("\n");
        sb.append("    evaluationResult: ").append(toIndentedString(evaluationResult)).append("\n");
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
