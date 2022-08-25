package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Job
 */
public class Job {

    /**
     * 作业类型： - NORMAL_JOB：表/文件迁移。 - BATCH_JOB：整库迁移。 - SCENARIO_JOB：场景迁移。
     */
    public static final class JobTypeEnum {

        /**
         * Enum NORMAL_JOB for value: "NORMAL_JOB"
         */
        public static final JobTypeEnum NORMAL_JOB = new JobTypeEnum("NORMAL_JOB");

        /**
         * Enum BATCH_JOB for value: "BATCH_JOB"
         */
        public static final JobTypeEnum BATCH_JOB = new JobTypeEnum("BATCH_JOB");

        /**
         * Enum SCENARIO_JOB for value: "SCENARIO_JOB"
         */
        public static final JobTypeEnum SCENARIO_JOB = new JobTypeEnum("SCENARIO_JOB");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("NORMAL_JOB", NORMAL_JOB);
            map.put("BATCH_JOB", BATCH_JOB);
            map.put("SCENARIO_JOB", SCENARIO_JOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            JobTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobTypeEnum(value);
            }
            return result;
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            JobTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from-connector-name")

    private String fromConnectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to-config-values")

    private ConfigValues toConfigValues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to-link-name")

    private String toLinkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver-config-values")

    private ConfigValues driverConfigValues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from-config-values")

    private ConfigValues fromConfigValues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to-connector-name")

    private String toConnectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from-link-name")

    private String fromLinkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation-user")

    private String creationUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation-date")

    private Long creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update-date")

    private Long updateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_incre_job")

    private Boolean isIncreJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Integer flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files_read")

    private Integer filesRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update-user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_id")

    private String externalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_start_date")

    private Long executeStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_rows")

    private Integer deleteRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes_written")

    private Long bytesWritten;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_use_sql")

    private Boolean isUseSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_rows")

    private Integer updateRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes_read")

    private Long bytesRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_update_date")

    private Long executeUpdateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_rows")

    private Integer writeRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_written")

    private Integer rowsWritten;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_read")

    private Long rowsRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files_written")

    private Integer filesWritten;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_incrementing")

    private Boolean isIncrementing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_create_date")

    private Long executeCreateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public Job withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型： - NORMAL_JOB：表/文件迁移。 - BATCH_JOB：整库迁移。 - SCENARIO_JOB：场景迁移。
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public Job withFromConnectorName(String fromConnectorName) {
        this.fromConnectorName = fromConnectorName;
        return this;
    }

    /**
     * 源端连接类型
     * @return fromConnectorName
     */
    public String getFromConnectorName() {
        return fromConnectorName;
    }

    public void setFromConnectorName(String fromConnectorName) {
        this.fromConnectorName = fromConnectorName;
    }

    public Job withToConfigValues(ConfigValues toConfigValues) {
        this.toConfigValues = toConfigValues;
        return this;
    }

    public Job withToConfigValues(Consumer<ConfigValues> toConfigValuesSetter) {
        if (this.toConfigValues == null) {
            this.toConfigValues = new ConfigValues();
            toConfigValuesSetter.accept(this.toConfigValues);
        }

        return this;
    }

    /**
     * Get toConfigValues
     * @return toConfigValues
     */
    public ConfigValues getToConfigValues() {
        return toConfigValues;
    }

    public void setToConfigValues(ConfigValues toConfigValues) {
        this.toConfigValues = toConfigValues;
    }

    public Job withToLinkName(String toLinkName) {
        this.toLinkName = toLinkName;
        return this;
    }

    /**
     * 目的端连接名称
     * @return toLinkName
     */
    public String getToLinkName() {
        return toLinkName;
    }

    public void setToLinkName(String toLinkName) {
        this.toLinkName = toLinkName;
    }

    public Job withDriverConfigValues(ConfigValues driverConfigValues) {
        this.driverConfigValues = driverConfigValues;
        return this;
    }

    public Job withDriverConfigValues(Consumer<ConfigValues> driverConfigValuesSetter) {
        if (this.driverConfigValues == null) {
            this.driverConfigValues = new ConfigValues();
            driverConfigValuesSetter.accept(this.driverConfigValues);
        }

        return this;
    }

    /**
     * Get driverConfigValues
     * @return driverConfigValues
     */
    public ConfigValues getDriverConfigValues() {
        return driverConfigValues;
    }

    public void setDriverConfigValues(ConfigValues driverConfigValues) {
        this.driverConfigValues = driverConfigValues;
    }

    public Job withFromConfigValues(ConfigValues fromConfigValues) {
        this.fromConfigValues = fromConfigValues;
        return this;
    }

    public Job withFromConfigValues(Consumer<ConfigValues> fromConfigValuesSetter) {
        if (this.fromConfigValues == null) {
            this.fromConfigValues = new ConfigValues();
            fromConfigValuesSetter.accept(this.fromConfigValues);
        }

        return this;
    }

    /**
     * Get fromConfigValues
     * @return fromConfigValues
     */
    public ConfigValues getFromConfigValues() {
        return fromConfigValues;
    }

    public void setFromConfigValues(ConfigValues fromConfigValues) {
        this.fromConfigValues = fromConfigValues;
    }

    public Job withToConnectorName(String toConnectorName) {
        this.toConnectorName = toConnectorName;
        return this;
    }

    /**
     * 目的端连接类型
     * @return toConnectorName
     */
    public String getToConnectorName() {
        return toConnectorName;
    }

    public void setToConnectorName(String toConnectorName) {
        this.toConnectorName = toConnectorName;
    }

    public Job withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称，长度在1到240个字符之间
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job withFromLinkName(String fromLinkName) {
        this.fromLinkName = fromLinkName;
        return this;
    }

    /**
     * 源连接名称
     * @return fromLinkName
     */
    public String getFromLinkName() {
        return fromLinkName;
    }

    public void setFromLinkName(String fromLinkName) {
        this.fromLinkName = fromLinkName;
    }

    public Job withCreationUser(String creationUser) {
        this.creationUser = creationUser;
        return this;
    }

    /**
     * 创建的用户。
     * @return creationUser
     */
    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

    public Job withCreationDate(Long creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 作业创建的时间，单位：毫秒。
     * @return creationDate
     */
    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public Job withUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * 作业最后更新的时间，单位：毫秒。
     * @return updateDate
     */
    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public Job withIsIncreJob(Boolean isIncreJob) {
        this.isIncreJob = isIncreJob;
        return this;
    }

    /**
     * 是否增量
     * @return isIncreJob
     */
    public Boolean getIsIncreJob() {
        return isIncreJob;
    }

    public void setIsIncreJob(Boolean isIncreJob) {
        this.isIncreJob = isIncreJob;
    }

    public Job withFlag(Integer flag) {
        this.flag = flag;
        return this;
    }

    /**
     * 标记
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Job withFilesRead(Integer filesRead) {
        this.filesRead = filesRead;
        return this;
    }

    /**
     * 已读文件数
     * @return filesRead
     */
    public Integer getFilesRead() {
        return filesRead;
    }

    public void setFilesRead(Integer filesRead) {
        this.filesRead = filesRead;
    }

    public Job withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 作业最后更新的用户。
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Job withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * 外部ID。
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Job withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 作业类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Job withExecuteStartDate(Long executeStartDate) {
        this.executeStartDate = executeStartDate;
        return this;
    }

    /**
     * 执行_开始_日期。
     * @return executeStartDate
     */
    public Long getExecuteStartDate() {
        return executeStartDate;
    }

    public void setExecuteStartDate(Long executeStartDate) {
        this.executeStartDate = executeStartDate;
    }

    public Job withDeleteRows(Integer deleteRows) {
        this.deleteRows = deleteRows;
        return this;
    }

    /**
     * 删除行数
     * @return deleteRows
     */
    public Integer getDeleteRows() {
        return deleteRows;
    }

    public void setDeleteRows(Integer deleteRows) {
        this.deleteRows = deleteRows;
    }

    public Job withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否激活连接
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Job withBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
        return this;
    }

    /**
     * 写入字节
     * @return bytesWritten
     */
    public Long getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public Job withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 作业ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Job withIsUseSql(Boolean isUseSql) {
        this.isUseSql = isUseSql;
        return this;
    }

    /**
     * 用户是否使用sql
     * @return isUseSql
     */
    public Boolean getIsUseSql() {
        return isUseSql;
    }

    public void setIsUseSql(Boolean isUseSql) {
        this.isUseSql = isUseSql;
    }

    public Job withUpdateRows(Integer updateRows) {
        this.updateRows = updateRows;
        return this;
    }

    /**
     * 更新行数
     * @return updateRows
     */
    public Integer getUpdateRows() {
        return updateRows;
    }

    public void setUpdateRows(Integer updateRows) {
        this.updateRows = updateRows;
    }

    public Job withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组_名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Job withBytesRead(Long bytesRead) {
        this.bytesRead = bytesRead;
        return this;
    }

    /**
     * 读取字节
     * @return bytesRead
     */
    public Long getBytesRead() {
        return bytesRead;
    }

    public void setBytesRead(Long bytesRead) {
        this.bytesRead = bytesRead;
    }

    public Job withExecuteUpdateDate(Long executeUpdateDate) {
        this.executeUpdateDate = executeUpdateDate;
        return this;
    }

    /**
     * 执行_更新_日期。
     * @return executeUpdateDate
     */
    public Long getExecuteUpdateDate() {
        return executeUpdateDate;
    }

    public void setExecuteUpdateDate(Long executeUpdateDate) {
        this.executeUpdateDate = executeUpdateDate;
    }

    public Job withWriteRows(Integer writeRows) {
        this.writeRows = writeRows;
        return this;
    }

    /**
     * 写入数据行数
     * @return writeRows
     */
    public Integer getWriteRows() {
        return writeRows;
    }

    public void setWriteRows(Integer writeRows) {
        this.writeRows = writeRows;
    }

    public Job withRowsWritten(Integer rowsWritten) {
        this.rowsWritten = rowsWritten;
        return this;
    }

    /**
     * 写入行数
     * @return rowsWritten
     */
    public Integer getRowsWritten() {
        return rowsWritten;
    }

    public void setRowsWritten(Integer rowsWritten) {
        this.rowsWritten = rowsWritten;
    }

    public Job withRowsRead(Long rowsRead) {
        this.rowsRead = rowsRead;
        return this;
    }

    /**
     * 读取的行数
     * @return rowsRead
     */
    public Long getRowsRead() {
        return rowsRead;
    }

    public void setRowsRead(Long rowsRead) {
        this.rowsRead = rowsRead;
    }

    public Job withFilesWritten(Integer filesWritten) {
        this.filesWritten = filesWritten;
        return this;
    }

    /**
     * 写入文件数
     * @return filesWritten
     */
    public Integer getFilesWritten() {
        return filesWritten;
    }

    public void setFilesWritten(Integer filesWritten) {
        this.filesWritten = filesWritten;
    }

    public Job withIsIncrementing(Boolean isIncrementing) {
        this.isIncrementing = isIncrementing;
        return this;
    }

    /**
     * 是否增量
     * @return isIncrementing
     */
    public Boolean getIsIncrementing() {
        return isIncrementing;
    }

    public void setIsIncrementing(Boolean isIncrementing) {
        this.isIncrementing = isIncrementing;
    }

    public Job withExecuteCreateDate(Long executeCreateDate) {
        this.executeCreateDate = executeCreateDate;
        return this;
    }

    /**
     * 执行_创建_日期
     * @return executeCreateDate
     */
    public Long getExecuteCreateDate() {
        return executeCreateDate;
    }

    public void setExecuteCreateDate(Long executeCreateDate) {
        this.executeCreateDate = executeCreateDate;
    }

    public Job withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业最后的执行状态： - BOOTING：启动中。 - RUNNING：运行中。 - SUCCEEDED：成功。 - FAILED：失败。 - NEW：未被执行。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return Objects.equals(this.jobType, job.jobType)
            && Objects.equals(this.fromConnectorName, job.fromConnectorName)
            && Objects.equals(this.toConfigValues, job.toConfigValues)
            && Objects.equals(this.toLinkName, job.toLinkName)
            && Objects.equals(this.driverConfigValues, job.driverConfigValues)
            && Objects.equals(this.fromConfigValues, job.fromConfigValues)
            && Objects.equals(this.toConnectorName, job.toConnectorName) && Objects.equals(this.name, job.name)
            && Objects.equals(this.fromLinkName, job.fromLinkName)
            && Objects.equals(this.creationUser, job.creationUser)
            && Objects.equals(this.creationDate, job.creationDate) && Objects.equals(this.updateDate, job.updateDate)
            && Objects.equals(this.isIncreJob, job.isIncreJob) && Objects.equals(this.flag, job.flag)
            && Objects.equals(this.filesRead, job.filesRead) && Objects.equals(this.updateUser, job.updateUser)
            && Objects.equals(this.externalId, job.externalId) && Objects.equals(this.type, job.type)
            && Objects.equals(this.executeStartDate, job.executeStartDate)
            && Objects.equals(this.deleteRows, job.deleteRows) && Objects.equals(this.enabled, job.enabled)
            && Objects.equals(this.bytesWritten, job.bytesWritten) && Objects.equals(this.id, job.id)
            && Objects.equals(this.isUseSql, job.isUseSql) && Objects.equals(this.updateRows, job.updateRows)
            && Objects.equals(this.groupName, job.groupName) && Objects.equals(this.bytesRead, job.bytesRead)
            && Objects.equals(this.executeUpdateDate, job.executeUpdateDate)
            && Objects.equals(this.writeRows, job.writeRows) && Objects.equals(this.rowsWritten, job.rowsWritten)
            && Objects.equals(this.rowsRead, job.rowsRead) && Objects.equals(this.filesWritten, job.filesWritten)
            && Objects.equals(this.isIncrementing, job.isIncrementing)
            && Objects.equals(this.executeCreateDate, job.executeCreateDate) && Objects.equals(this.status, job.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobType,
            fromConnectorName,
            toConfigValues,
            toLinkName,
            driverConfigValues,
            fromConfigValues,
            toConnectorName,
            name,
            fromLinkName,
            creationUser,
            creationDate,
            updateDate,
            isIncreJob,
            flag,
            filesRead,
            updateUser,
            externalId,
            type,
            executeStartDate,
            deleteRows,
            enabled,
            bytesWritten,
            id,
            isUseSql,
            updateRows,
            groupName,
            bytesRead,
            executeUpdateDate,
            writeRows,
            rowsWritten,
            rowsRead,
            filesWritten,
            isIncrementing,
            executeCreateDate,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    fromConnectorName: ").append(toIndentedString(fromConnectorName)).append("\n");
        sb.append("    toConfigValues: ").append(toIndentedString(toConfigValues)).append("\n");
        sb.append("    toLinkName: ").append(toIndentedString(toLinkName)).append("\n");
        sb.append("    driverConfigValues: ").append(toIndentedString(driverConfigValues)).append("\n");
        sb.append("    fromConfigValues: ").append(toIndentedString(fromConfigValues)).append("\n");
        sb.append("    toConnectorName: ").append(toIndentedString(toConnectorName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fromLinkName: ").append(toIndentedString(fromLinkName)).append("\n");
        sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    isIncreJob: ").append(toIndentedString(isIncreJob)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    filesRead: ").append(toIndentedString(filesRead)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    executeStartDate: ").append(toIndentedString(executeStartDate)).append("\n");
        sb.append("    deleteRows: ").append(toIndentedString(deleteRows)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    bytesWritten: ").append(toIndentedString(bytesWritten)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isUseSql: ").append(toIndentedString(isUseSql)).append("\n");
        sb.append("    updateRows: ").append(toIndentedString(updateRows)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    bytesRead: ").append(toIndentedString(bytesRead)).append("\n");
        sb.append("    executeUpdateDate: ").append(toIndentedString(executeUpdateDate)).append("\n");
        sb.append("    writeRows: ").append(toIndentedString(writeRows)).append("\n");
        sb.append("    rowsWritten: ").append(toIndentedString(rowsWritten)).append("\n");
        sb.append("    rowsRead: ").append(toIndentedString(rowsRead)).append("\n");
        sb.append("    filesWritten: ").append(toIndentedString(filesWritten)).append("\n");
        sb.append("    isIncrementing: ").append(toIndentedString(isIncrementing)).append("\n");
        sb.append("    executeCreateDate: ").append(toIndentedString(executeCreateDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
