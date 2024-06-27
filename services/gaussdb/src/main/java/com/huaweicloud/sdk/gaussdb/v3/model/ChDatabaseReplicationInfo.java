package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClickHouse同步信息。
 */
public class ChDatabaseReplicationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database")

    private String sourceDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database")

    private String targetDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    private String percentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catchup_stage")

    private String catchupStage;

    public ChDatabaseReplicationInfo withSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
        return this;
    }

    /**
     * 源数据库。
     * @return sourceDatabase
     */
    public String getSourceDatabase() {
        return sourceDatabase;
    }

    public void setSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
    }

    public ChDatabaseReplicationInfo withTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }

    /**
     * 目标数据库。
     * @return targetDatabase
     */
    public String getTargetDatabase() {
        return targetDatabase;
    }

    public void setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
    }

    public ChDatabaseReplicationInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 当前状态。 取值范围： - normal：正常 - abnormal：异常
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ChDatabaseReplicationInfo withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 同步阶段。 取值范围： - wait：等待同步 - failed：同步失败 - incremental：增量同步 - full：全量同步 - other：其他
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public ChDatabaseReplicationInfo withPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 进度百分比。
     * @return percentage
     */
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public ChDatabaseReplicationInfo withCatchupStage(String catchupStage) {
        this.catchupStage = catchupStage;
        return this;
    }

    /**
     * 追赶阶段。 取值范围： - wait：等待同步 - failed：同步失败 - incremental：增量同步 - full：全量同步 - other：其他
     * @return catchupStage
     */
    public String getCatchupStage() {
        return catchupStage;
    }

    public void setCatchupStage(String catchupStage) {
        this.catchupStage = catchupStage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChDatabaseReplicationInfo that = (ChDatabaseReplicationInfo) obj;
        return Objects.equals(this.sourceDatabase, that.sourceDatabase)
            && Objects.equals(this.targetDatabase, that.targetDatabase) && Objects.equals(this.status, that.status)
            && Objects.equals(this.stage, that.stage) && Objects.equals(this.percentage, that.percentage)
            && Objects.equals(this.catchupStage, that.catchupStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDatabase, targetDatabase, status, stage, percentage, catchupStage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChDatabaseReplicationInfo {\n");
        sb.append("    sourceDatabase: ").append(toIndentedString(sourceDatabase)).append("\n");
        sb.append("    targetDatabase: ").append(toIndentedString(targetDatabase)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    catchupStage: ").append(toIndentedString(catchupStage)).append("\n");
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
