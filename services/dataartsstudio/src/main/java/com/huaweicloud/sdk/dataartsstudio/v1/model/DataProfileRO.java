package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新概要请求体
 */
public class DataProfileRO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    /**
     * 数据源类型
     */
    public static final class DbTypeEnum {

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DbTypeEnum DWS = new DbTypeEnum("DWS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final DbTypeEnum DLI = new DbTypeEnum("DLI");

        private static final Map<String, DbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbTypeEnum> createStaticFields() {
            Map<String, DbTypeEnum> map = new HashMap<>();
            map.put("DWS", DWS);
            map.put("DLI", DLI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DbTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DbTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DbTypeEnum(value));
        }

        public static DbTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DbTypeEnum) {
                return this.value.equals(((DbTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private DbTypeEnum dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_names")

    private List<TableColumnDTO> columnNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields_name")

    private List<String> fieldsName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique")

    private Boolean unique;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_profile")

    private Boolean timeProfile;

    /**
     * 数据采样方式
     */
    public static final class SampleEnum {

        /**
         * Enum _N_0_UNDEFINED for value: "基于采样数据，采样数量为N条：非0整数，默认值undefined"
         */
        public static final SampleEnum _N_0_UNDEFINED = new SampleEnum("基于采样数据，采样数量为N条：非0整数，默认值undefined");

        private static final Map<String, SampleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SampleEnum> createStaticFields() {
            Map<String, SampleEnum> map = new HashMap<>();
            map.put("基于采样数据，采样数量为N条：非0整数，默认值undefined", _N_0_UNDEFINED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SampleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SampleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SampleEnum(value));
        }

        public static SampleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SampleEnum) {
                return this.value.equals(((SampleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample")

    private SampleEnum sample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel")

    private Boolean cancel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_stop")

    private Boolean autoStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obsconfig")

    private Object obsconfig;

    public DataProfileRO withDwId(String dwId) {
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

    public DataProfileRO withDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据源类型
     * @return dbType
     */
    public DbTypeEnum getDbType() {
        return dbType;
    }

    public void setDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
    }

    public DataProfileRO withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DataProfileRO withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DataProfileRO withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表ID
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public DataProfileRO withColumnNames(List<TableColumnDTO> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    public DataProfileRO addColumnNamesItem(TableColumnDTO columnNamesItem) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        this.columnNames.add(columnNamesItem);
        return this;
    }

    public DataProfileRO withColumnNames(Consumer<List<TableColumnDTO>> columnNamesSetter) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        columnNamesSetter.accept(this.columnNames);
        return this;
    }

    /**
     * 待更新概要字段列表
     * @return columnNames
     */
    public List<TableColumnDTO> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<TableColumnDTO> columnNames) {
        this.columnNames = columnNames;
    }

    public DataProfileRO withFieldsName(List<String> fieldsName) {
        this.fieldsName = fieldsName;
        return this;
    }

    public DataProfileRO addFieldsNameItem(String fieldsNameItem) {
        if (this.fieldsName == null) {
            this.fieldsName = new ArrayList<>();
        }
        this.fieldsName.add(fieldsNameItem);
        return this;
    }

    public DataProfileRO withFieldsName(Consumer<List<String>> fieldsNameSetter) {
        if (this.fieldsName == null) {
            this.fieldsName = new ArrayList<>();
        }
        fieldsNameSetter.accept(this.fieldsName);
        return this;
    }

    /**
     * 字段名称列表
     * @return fieldsName
     */
    public List<String> getFieldsName() {
        return fieldsName;
    }

    public void setFieldsName(List<String> fieldsName) {
        this.fieldsName = fieldsName;
    }

    public DataProfileRO withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 执行更新语句队列
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public DataProfileRO withUnique(Boolean unique) {
        this.unique = unique;
        return this;
    }

    /**
     * 是否采集唯一值
     * @return unique
     */
    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public DataProfileRO withTimeProfile(Boolean timeProfile) {
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

    public DataProfileRO withSample(SampleEnum sample) {
        this.sample = sample;
        return this;
    }

    /**
     * 数据采样方式
     * @return sample
     */
    public SampleEnum getSample() {
        return sample;
    }

    public void setSample(SampleEnum sample) {
        this.sample = sample;
    }

    public DataProfileRO withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DataProfileRO withCancel(Boolean cancel) {
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

    public DataProfileRO withAutoStop(Boolean autoStop) {
        this.autoStop = autoStop;
        return this;
    }

    /**
     * 是否自动停止
     * @return autoStop
     */
    public Boolean getAutoStop() {
        return autoStop;
    }

    public void setAutoStop(Boolean autoStop) {
        this.autoStop = autoStop;
    }

    public DataProfileRO withObsconfig(Object obsconfig) {
        this.obsconfig = obsconfig;
        return this;
    }

    /**
     * obs配置，概要采集不涉及
     * @return obsconfig
     */
    public Object getObsconfig() {
        return obsconfig;
    }

    public void setObsconfig(Object obsconfig) {
        this.obsconfig = obsconfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataProfileRO that = (DataProfileRO) obj;
        return Objects.equals(this.dwId, that.dwId) && Objects.equals(this.dbType, that.dbType)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.tableId, that.tableId) && Objects.equals(this.columnNames, that.columnNames)
            && Objects.equals(this.fieldsName, that.fieldsName) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.unique, that.unique) && Objects.equals(this.timeProfile, that.timeProfile)
            && Objects.equals(this.sample, that.sample) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.cancel, that.cancel) && Objects.equals(this.autoStop, that.autoStop)
            && Objects.equals(this.obsconfig, that.obsconfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwId,
            dbType,
            databaseName,
            tableName,
            tableId,
            columnNames,
            fieldsName,
            queue,
            unique,
            timeProfile,
            sample,
            jobId,
            cancel,
            autoStop,
            obsconfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataProfileRO {\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
        sb.append("    fieldsName: ").append(toIndentedString(fieldsName)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
        sb.append("    timeProfile: ").append(toIndentedString(timeProfile)).append("\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
        sb.append("    autoStop: ").append(toIndentedString(autoStop)).append("\n");
        sb.append("    obsconfig: ").append(toIndentedString(obsconfig)).append("\n");
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
