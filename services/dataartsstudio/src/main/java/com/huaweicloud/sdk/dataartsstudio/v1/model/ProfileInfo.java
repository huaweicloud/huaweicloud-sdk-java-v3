package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 概要信息
 */
public class ProfileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel")

    private Boolean cancel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_size")

    private BigDecimal tableSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_common_config")

    private String obsCommonConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_row_count")

    private String totalRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields_name")

    private List<String> fieldsName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample")

    private String sample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_date")

    private String updateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_count")

    private BigDecimal rowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_count")

    private BigDecimal columnCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique")

    private Boolean unique;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_stop")

    private Boolean autoStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_profile")

    private Boolean timeProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "colunms_metric")

    private Object colunmsMetric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns_list")

    private List<ColumnInfo> columnsList = null;

    public ProfileInfo withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据库类型
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public ProfileInfo withCancel(Boolean cancel) {
        this.cancel = cancel;
        return this;
    }

    /**
     * 是否取消
     * @return cancel
     */
    public Boolean getCancel() {
        return cancel;
    }

    public void setCancel(Boolean cancel) {
        this.cancel = cancel;
    }

    public ProfileInfo withTableSize(BigDecimal tableSize) {
        this.tableSize = tableSize;
        return this;
    }

    /**
     * 表大小
     * @return tableSize
     */
    public BigDecimal getTableSize() {
        return tableSize;
    }

    public void setTableSize(BigDecimal tableSize) {
        this.tableSize = tableSize;
    }

    public ProfileInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ProfileInfo withObsCommonConfig(String obsCommonConfig) {
        this.obsCommonConfig = obsCommonConfig;
        return this;
    }

    /**
     * obs公共配置
     * @return obsCommonConfig
     */
    public String getObsCommonConfig() {
        return obsCommonConfig;
    }

    public void setObsCommonConfig(String obsCommonConfig) {
        this.obsCommonConfig = obsCommonConfig;
    }

    public ProfileInfo withTotalRowCount(String totalRowCount) {
        this.totalRowCount = totalRowCount;
        return this;
    }

    /**
     * 总行数
     * @return totalRowCount
     */
    public String getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(String totalRowCount) {
        this.totalRowCount = totalRowCount;
    }

    public ProfileInfo withFieldsName(List<String> fieldsName) {
        this.fieldsName = fieldsName;
        return this;
    }

    public ProfileInfo addFieldsNameItem(String fieldsNameItem) {
        if (this.fieldsName == null) {
            this.fieldsName = new ArrayList<>();
        }
        this.fieldsName.add(fieldsNameItem);
        return this;
    }

    public ProfileInfo withFieldsName(Consumer<List<String>> fieldsNameSetter) {
        if (this.fieldsName == null) {
            this.fieldsName = new ArrayList<>();
        }
        fieldsNameSetter.accept(this.fieldsName);
        return this;
    }

    /**
     * 文件列表
     * @return fieldsName
     */
    public List<String> getFieldsName() {
        return fieldsName;
    }

    public void setFieldsName(List<String> fieldsName) {
        this.fieldsName = fieldsName;
    }

    public ProfileInfo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ProfileInfo withSample(String sample) {
        this.sample = sample;
        return this;
    }

    /**
     * 样本
     * @return sample
     */
    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public ProfileInfo withUpdateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * 修改时间
     * @return updateDate
     */
    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public ProfileInfo withRowCount(BigDecimal rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /**
     * 采样行数
     * @return rowCount
     */
    public BigDecimal getRowCount() {
        return rowCount;
    }

    public void setRowCount(BigDecimal rowCount) {
        this.rowCount = rowCount;
    }

    public ProfileInfo withColumnCount(BigDecimal columnCount) {
        this.columnCount = columnCount;
        return this;
    }

    /**
     * 列数
     * @return columnCount
     */
    public BigDecimal getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(BigDecimal columnCount) {
        this.columnCount = columnCount;
    }

    public ProfileInfo withUnique(Boolean unique) {
        this.unique = unique;
        return this;
    }

    /**
     * 是否唯一
     * @return unique
     */
    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public ProfileInfo withAutoStop(Boolean autoStop) {
        this.autoStop = autoStop;
        return this;
    }

    /**
     * 自动停止
     * @return autoStop
     */
    public Boolean getAutoStop() {
        return autoStop;
    }

    public void setAutoStop(Boolean autoStop) {
        this.autoStop = autoStop;
    }

    public ProfileInfo withTimeProfile(Boolean timeProfile) {
        this.timeProfile = timeProfile;
        return this;
    }

    /**
     * 时间档案
     * @return timeProfile
     */
    public Boolean getTimeProfile() {
        return timeProfile;
    }

    public void setTimeProfile(Boolean timeProfile) {
        this.timeProfile = timeProfile;
    }

    public ProfileInfo withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * duilie
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public ProfileInfo withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 连接id
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public ProfileInfo withColunmsMetric(Object colunmsMetric) {
        this.colunmsMetric = colunmsMetric;
        return this;
    }

    /**
     * 列概要信息
     * @return colunmsMetric
     */
    public Object getColunmsMetric() {
        return colunmsMetric;
    }

    public void setColunmsMetric(Object colunmsMetric) {
        this.colunmsMetric = colunmsMetric;
    }

    public ProfileInfo withColumnsList(List<ColumnInfo> columnsList) {
        this.columnsList = columnsList;
        return this;
    }

    public ProfileInfo addColumnsListItem(ColumnInfo columnsListItem) {
        if (this.columnsList == null) {
            this.columnsList = new ArrayList<>();
        }
        this.columnsList.add(columnsListItem);
        return this;
    }

    public ProfileInfo withColumnsList(Consumer<List<ColumnInfo>> columnsListSetter) {
        if (this.columnsList == null) {
            this.columnsList = new ArrayList<>();
        }
        columnsListSetter.accept(this.columnsList);
        return this;
    }

    /**
     * 列信息
     * @return columnsList
     */
    public List<ColumnInfo> getColumnsList() {
        return columnsList;
    }

    public void setColumnsList(List<ColumnInfo> columnsList) {
        this.columnsList = columnsList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfileInfo profileInfo = (ProfileInfo) o;
        return Objects.equals(this.dbType, profileInfo.dbType) && Objects.equals(this.cancel, profileInfo.cancel)
            && Objects.equals(this.tableSize, profileInfo.tableSize)
            && Objects.equals(this.databaseName, profileInfo.databaseName)
            && Objects.equals(this.obsCommonConfig, profileInfo.obsCommonConfig)
            && Objects.equals(this.totalRowCount, profileInfo.totalRowCount)
            && Objects.equals(this.fieldsName, profileInfo.fieldsName)
            && Objects.equals(this.tableName, profileInfo.tableName) && Objects.equals(this.sample, profileInfo.sample)
            && Objects.equals(this.updateDate, profileInfo.updateDate)
            && Objects.equals(this.rowCount, profileInfo.rowCount)
            && Objects.equals(this.columnCount, profileInfo.columnCount)
            && Objects.equals(this.unique, profileInfo.unique) && Objects.equals(this.autoStop, profileInfo.autoStop)
            && Objects.equals(this.timeProfile, profileInfo.timeProfile)
            && Objects.equals(this.queue, profileInfo.queue) && Objects.equals(this.dwId, profileInfo.dwId)
            && Objects.equals(this.colunmsMetric, profileInfo.colunmsMetric)
            && Objects.equals(this.columnsList, profileInfo.columnsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbType,
            cancel,
            tableSize,
            databaseName,
            obsCommonConfig,
            totalRowCount,
            fieldsName,
            tableName,
            sample,
            updateDate,
            rowCount,
            columnCount,
            unique,
            autoStop,
            timeProfile,
            queue,
            dwId,
            colunmsMetric,
            columnsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileInfo {\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
        sb.append("    tableSize: ").append(toIndentedString(tableSize)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    obsCommonConfig: ").append(toIndentedString(obsCommonConfig)).append("\n");
        sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
        sb.append("    fieldsName: ").append(toIndentedString(fieldsName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
        sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
        sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
        sb.append("    autoStop: ").append(toIndentedString(autoStop)).append("\n");
        sb.append("    timeProfile: ").append(toIndentedString(timeProfile)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    colunmsMetric: ").append(toIndentedString(colunmsMetric)).append("\n");
        sb.append("    columnsList: ").append(toIndentedString(columnsList)).append("\n");
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
