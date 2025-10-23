package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowTaskTypeSummaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    /**
     * 任务状态，取值范围success,failed,running,skipped,timeout
     */
    public static final class TaskStatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final TaskStatusEnum SUCCESS = new TaskStatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final TaskStatusEnum FAILED = new TaskStatusEnum("failed");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final TaskStatusEnum RUNNING = new TaskStatusEnum("running");

        /**
         * Enum SKIPPED for value: "skipped"
         */
        public static final TaskStatusEnum SKIPPED = new TaskStatusEnum("skipped");

        /**
         * Enum TIMEOUT for value: "timeout"
         */
        public static final TaskStatusEnum TIMEOUT = new TaskStatusEnum("timeout");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            map.put("running", RUNNING);
            map.put("skipped", SKIPPED);
            map.put("timeout", TIMEOUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskStatusEnum(String value) {
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
        public static TaskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskStatusEnum(value));
        }

        public static TaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskStatusEnum) {
                return this.value.equals(((TaskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private TaskStatusEnum taskStatus;

    /**
     * 资源类型，取值范围：Server,Volume,Sfs-Turbo,Workspace,MySQL,PostgreSQL,SQLServer,MariaDB,GaussDB
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum SERVER for value: "Server"
         */
        public static final ResourceTypeEnum SERVER = new ResourceTypeEnum("Server");

        /**
         * Enum VOLUME for value: "Volume"
         */
        public static final ResourceTypeEnum VOLUME = new ResourceTypeEnum("Volume");

        /**
         * Enum SFS_TURBO for value: "Sfs-Turbo"
         */
        public static final ResourceTypeEnum SFS_TURBO = new ResourceTypeEnum("Sfs-Turbo");

        /**
         * Enum WORKSPACE for value: "Workspace"
         */
        public static final ResourceTypeEnum WORKSPACE = new ResourceTypeEnum("Workspace");

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final ResourceTypeEnum MYSQL = new ResourceTypeEnum("MySQL");

        /**
         * Enum POSTGRESQL for value: "PostgreSQL"
         */
        public static final ResourceTypeEnum POSTGRESQL = new ResourceTypeEnum("PostgreSQL");

        /**
         * Enum SQLSERVER for value: "SQLServer"
         */
        public static final ResourceTypeEnum SQLSERVER = new ResourceTypeEnum("SQLServer");

        /**
         * Enum MARIADB for value: "MariaDB"
         */
        public static final ResourceTypeEnum MARIADB = new ResourceTypeEnum("MariaDB");

        /**
         * Enum GAUSSDB for value: "GaussDB"
         */
        public static final ResourceTypeEnum GAUSSDB = new ResourceTypeEnum("GaussDB");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("Server", SERVER);
            map.put("Volume", VOLUME);
            map.put("Sfs-Turbo", SFS_TURBO);
            map.put("Workspace", WORKSPACE);
            map.put("MySQL", MYSQL);
            map.put("PostgreSQL", POSTGRESQL);
            map.put("SQLServer", SQLSERVER);
            map.put("MariaDB", MARIADB);
            map.put("GaussDB", GAUSSDB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowTaskTypeSummaryRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowTaskTypeSummaryRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Region ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowTaskTypeSummaryRequest withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态，取值范围success,failed,running,skipped,timeout
     * @return taskStatus
     */
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowTaskTypeSummaryRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，取值范围：Server,Volume,Sfs-Turbo,Workspace,MySQL,PostgreSQL,SQLServer,MariaDB,GaussDB
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ShowTaskTypeSummaryRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询范围的起始时间，例如：2025-03-20T09:31:45Z。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowTaskTypeSummaryRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询范围的结束时间，例如：2025-03-21T09:31:45Z。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskTypeSummaryRequest that = (ShowTaskTypeSummaryRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, regionId, taskStatus, resourceType, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskTypeSummaryRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
