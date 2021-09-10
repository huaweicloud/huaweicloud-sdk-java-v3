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

/** Job */
public class Job {

    /** 作业类型： - NORMAL_JOB：表/文件迁移。 - BATCH_JOB：整库迁移。 - SCENARIO_JOB：场景迁移。 */
    public static final class JobTypeEnum {

        /** Enum NORMAL_JOB for value: "NORMAL_JOB" */
        public static final JobTypeEnum NORMAL_JOB = new JobTypeEnum("NORMAL_JOB");

        /** Enum BATCH_JOB for value: "BATCH_JOB" */
        public static final JobTypeEnum BATCH_JOB = new JobTypeEnum("BATCH_JOB");

        /** Enum SCENARIO_JOB for value: "SCENARIO_JOB" */
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
    @JsonProperty(value = "update-user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public Job withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /** 作业类型： - NORMAL_JOB：表/文件迁移。 - BATCH_JOB：整库迁移。 - SCENARIO_JOB：场景迁移。
     * 
     * @return jobType */
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

    /** 源端连接类型
     * 
     * @return fromConnectorName */
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

    /** Get toConfigValues
     * 
     * @return toConfigValues */
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

    /** 目的端连接名称
     * 
     * @return toLinkName */
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

    /** Get driverConfigValues
     * 
     * @return driverConfigValues */
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

    /** Get fromConfigValues
     * 
     * @return fromConfigValues */
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

    /** 目的端连接类型
     * 
     * @return toConnectorName */
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

    /** 作业名称，长度在1到240个字符之间
     * 
     * @return name */
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

    /** 源连接名称
     * 
     * @return fromLinkName */
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

    /** 创建的用户。
     * 
     * @return creationUser */
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

    /** 作业创建的时间，单位：毫秒。
     * 
     * @return creationDate */
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

    /** 作业最后更新的时间，单位：毫秒。
     * 
     * @return updateDate */
    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public Job withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /** 作业最后更新的用户。
     * 
     * @return updateUser */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Job withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 作业最后的执行状态： - BOOTING：启动中。 - RUNNING：运行中。 - SUCCEEDED：成功。 - FAILED：失败。 - NEW：未被执行。
     * 
     * @return status */
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
            && Objects.equals(this.updateUser, job.updateUser) && Objects.equals(this.status, job.status);
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
            updateUser,
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
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
