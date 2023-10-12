package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ComponentSnapshotContext
 */
public class ComponentSnapshotContext {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_replica")

    private Integer availableReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    private String build;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_id")

    private String buildId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_log_id")

    private String buildLogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_status")

    private String operationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_limit")

    private String resourceLimit;

    /**
     * 语言/运行时。
     */
    public static final class RuntimeEnum {

        /**
         * Enum DOCKER for value: "Docker"
         */
        public static final RuntimeEnum DOCKER = new RuntimeEnum("Docker");

        /**
         * Enum JAVA8 for value: "Java8"
         */
        public static final RuntimeEnum JAVA8 = new RuntimeEnum("Java8");

        /**
         * Enum JAVA11 for value: "Java11"
         */
        public static final RuntimeEnum JAVA11 = new RuntimeEnum("Java11");

        /**
         * Enum JAVA17 for value: "Java17"
         */
        public static final RuntimeEnum JAVA17 = new RuntimeEnum("Java17");

        /**
         * Enum TOMCAT8 for value: "Tomcat8"
         */
        public static final RuntimeEnum TOMCAT8 = new RuntimeEnum("Tomcat8");

        /**
         * Enum TOMCAT9 for value: "Tomcat9"
         */
        public static final RuntimeEnum TOMCAT9 = new RuntimeEnum("Tomcat9");

        /**
         * Enum PYTHON3 for value: "Python3"
         */
        public static final RuntimeEnum PYTHON3 = new RuntimeEnum("Python3");

        /**
         * Enum NODEJS8 for value: "Nodejs8"
         */
        public static final RuntimeEnum NODEJS8 = new RuntimeEnum("Nodejs8");

        /**
         * Enum NODEJS14 for value: "Nodejs14"
         */
        public static final RuntimeEnum NODEJS14 = new RuntimeEnum("Nodejs14");

        /**
         * Enum NODEJS16 for value: "Nodejs16"
         */
        public static final RuntimeEnum NODEJS16 = new RuntimeEnum("Nodejs16");

        /**
         * Enum PHP7 for value: "Php7"
         */
        public static final RuntimeEnum PHP7 = new RuntimeEnum("Php7");

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("Docker", DOCKER);
            map.put("Java8", JAVA8);
            map.put("Java11", JAVA11);
            map.put("Java17", JAVA17);
            map.put("Tomcat8", TOMCAT8);
            map.put("Tomcat9", TOMCAT9);
            map.put("Python3", PYTHON3);
            map.put("Nodejs8", NODEJS8);
            map.put("Nodejs14", NODEJS14);
            map.put("Nodejs16", NODEJS16);
            map.put("Php7", PHP7);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuntimeEnum(String value) {
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
        public static RuntimeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuntimeEnum(value));
        }

        public static RuntimeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuntimeEnum) {
                return this.value.equals(((RuntimeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private RuntimeEnum runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ComponentSnapshotContext withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ComponentSnapshotContext withAvailableReplica(Integer availableReplica) {
        this.availableReplica = availableReplica;
        return this;
    }

    /**
     * 可用实例个数。
     * @return availableReplica
     */
    public Integer getAvailableReplica() {
        return availableReplica;
    }

    public void setAvailableReplica(Integer availableReplica) {
        this.availableReplica = availableReplica;
    }

    public ComponentSnapshotContext withBuild(String build) {
        this.build = build;
        return this;
    }

    /**
     * 组件构建信息。
     * @return build
     */
    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public ComponentSnapshotContext withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * 构建任务ID。
     * @return buildId
     */
    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public ComponentSnapshotContext withBuildLogId(String buildLogId) {
        this.buildLogId = buildLogId;
        return this;
    }

    /**
     * 构建日志ID。
     * @return buildLogId
     */
    public String getBuildLogId() {
        return buildLogId;
    }

    public void setBuildLogId(String buildLogId) {
        this.buildLogId = buildLogId;
    }

    public ComponentSnapshotContext withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境ID。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ComponentSnapshotContext withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 组件ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComponentSnapshotContext withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 镜像地址。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ComponentSnapshotContext withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ComponentSnapshotContext withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * LTS日志组的ID。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public ComponentSnapshotContext withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * LTS日志流的ID
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public ComponentSnapshotContext withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentSnapshotContext withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 组件操作。
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ComponentSnapshotContext withOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * 组件操作状态。
     * @return operationStatus
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public ComponentSnapshotContext withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * 实例个数。
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public ComponentSnapshotContext withResourceLimit(String resourceLimit) {
        this.resourceLimit = resourceLimit;
        return this;
    }

    /**
     * 组件规格。
     * @return resourceLimit
     */
    public String getResourceLimit() {
        return resourceLimit;
    }

    public void setResourceLimit(String resourceLimit) {
        this.resourceLimit = resourceLimit;
    }

    public ComponentSnapshotContext withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 语言/运行时。
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public ComponentSnapshotContext withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 组件源信息。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ComponentSnapshotContext withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 组件状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComponentSnapshotContext withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 组件版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ComponentSnapshotContext withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ComponentSnapshotContext withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentSnapshotContext that = (ComponentSnapshotContext) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.availableReplica, that.availableReplica)
            && Objects.equals(this.build, that.build) && Objects.equals(this.buildId, that.buildId)
            && Objects.equals(this.buildLogId, that.buildLogId) && Objects.equals(this.envId, that.envId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.imageUrl, that.imageUrl)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.logGroupId, that.logGroupId)
            && Objects.equals(this.logStreamId, that.logStreamId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.operation, that.operation)
            && Objects.equals(this.operationStatus, that.operationStatus) && Objects.equals(this.replica, that.replica)
            && Objects.equals(this.resourceLimit, that.resourceLimit) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.source, that.source) && Objects.equals(this.status, that.status)
            && Objects.equals(this.version, that.version) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId,
            availableReplica,
            build,
            buildId,
            buildLogId,
            envId,
            id,
            imageUrl,
            jobId,
            logGroupId,
            logStreamId,
            name,
            operation,
            operationStatus,
            replica,
            resourceLimit,
            runtime,
            source,
            status,
            version,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentSnapshotContext {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    availableReplica: ").append(toIndentedString(availableReplica)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
        sb.append("    buildLogId: ").append(toIndentedString(buildLogId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    resourceLimit: ").append(toIndentedString(resourceLimit)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
