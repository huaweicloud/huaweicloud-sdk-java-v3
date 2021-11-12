package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** DbScanResultInfo */
public class DbScanResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private Integer riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_data_type")

    private List<String> sensitiveDataType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_info")

    private List<DbMatchInfo> matchInfo = null;

    public DbScanResultInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 任务ID
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public DbScanResultInfo withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /** 数据库名称
     * 
     * @return dbName */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DbScanResultInfo withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /** 表ID
     * 
     * @return tableId */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public DbScanResultInfo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /** 表名称
     * 
     * @return tableName */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DbScanResultInfo withRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /** 风险等级
     * 
     * @return riskLevel */
    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public DbScanResultInfo withSensitiveDataType(List<String> sensitiveDataType) {
        this.sensitiveDataType = sensitiveDataType;
        return this;
    }

    public DbScanResultInfo addSensitiveDataTypeItem(String sensitiveDataTypeItem) {
        if (this.sensitiveDataType == null) {
            this.sensitiveDataType = new ArrayList<>();
        }
        this.sensitiveDataType.add(sensitiveDataTypeItem);
        return this;
    }

    public DbScanResultInfo withSensitiveDataType(Consumer<List<String>> sensitiveDataTypeSetter) {
        if (this.sensitiveDataType == null) {
            this.sensitiveDataType = new ArrayList<>();
        }
        sensitiveDataTypeSetter.accept(this.sensitiveDataType);
        return this;
    }

    /** 匹配到的规则
     * 
     * @return sensitiveDataType */
    public List<String> getSensitiveDataType() {
        return sensitiveDataType;
    }

    public void setSensitiveDataType(List<String> sensitiveDataType) {
        this.sensitiveDataType = sensitiveDataType;
    }

    public DbScanResultInfo withMatchInfo(List<DbMatchInfo> matchInfo) {
        this.matchInfo = matchInfo;
        return this;
    }

    public DbScanResultInfo addMatchInfoItem(DbMatchInfo matchInfoItem) {
        if (this.matchInfo == null) {
            this.matchInfo = new ArrayList<>();
        }
        this.matchInfo.add(matchInfoItem);
        return this;
    }

    public DbScanResultInfo withMatchInfo(Consumer<List<DbMatchInfo>> matchInfoSetter) {
        if (this.matchInfo == null) {
            this.matchInfo = new ArrayList<>();
        }
        matchInfoSetter.accept(this.matchInfo);
        return this;
    }

    /** 表中各列匹配到的规则
     * 
     * @return matchInfo */
    public List<DbMatchInfo> getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(List<DbMatchInfo> matchInfo) {
        this.matchInfo = matchInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbScanResultInfo dbScanResultInfo = (DbScanResultInfo) o;
        return Objects.equals(this.taskId, dbScanResultInfo.taskId)
            && Objects.equals(this.dbName, dbScanResultInfo.dbName)
            && Objects.equals(this.tableId, dbScanResultInfo.tableId)
            && Objects.equals(this.tableName, dbScanResultInfo.tableName)
            && Objects.equals(this.riskLevel, dbScanResultInfo.riskLevel)
            && Objects.equals(this.sensitiveDataType, dbScanResultInfo.sensitiveDataType)
            && Objects.equals(this.matchInfo, dbScanResultInfo.matchInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, dbName, tableId, tableName, riskLevel, sensitiveDataType, matchInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbScanResultInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    sensitiveDataType: ").append(toIndentedString(sensitiveDataType)).append("\n");
        sb.append("    matchInfo: ").append(toIndentedString(matchInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
