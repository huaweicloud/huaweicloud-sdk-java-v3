package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRealTimeJobDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 作业状态。 - EXCEPTION：异常 - STOPPING：停止中 - SUBMITTING：提交中 - RUNNING：运行中 - STOPPED：已停止 - SUCCESS：成功
     */
    public static final class StateEnum {

        /**
         * Enum EXCEPTION for value: "EXCEPTION"
         */
        public static final StateEnum EXCEPTION = new StateEnum("EXCEPTION");

        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StateEnum STOPPING = new StateEnum("STOPPING");

        /**
         * Enum SUBMITTING for value: "SUBMITTING"
         */
        public static final StateEnum SUBMITTING = new StateEnum("SUBMITTING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StateEnum STOPPED = new StateEnum("STOPPED");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StateEnum SUCCESS = new StateEnum("SUCCESS");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("EXCEPTION", EXCEPTION);
            map.put("STOPPING", STOPPING);
            map.put("SUBMITTING", SUBMITTING);
            map.put("RUNNING", RUNNING);
            map.put("STOPPED", STOPPED);
            map.put("SUCCESS", SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    /**
     * 作业迁移类型。 - INCREMENTAL_DATA：增量数据 - HISTORY_DATA：历史数据
     */
    public static final class MigrationTypeEnum {

        /**
         * Enum INCREMENTAL_DATA for value: "INCREMENTAL_DATA"
         */
        public static final MigrationTypeEnum INCREMENTAL_DATA = new MigrationTypeEnum("INCREMENTAL_DATA");

        /**
         * Enum HISTORY_DATA for value: "HISTORY_DATA"
         */
        public static final MigrationTypeEnum HISTORY_DATA = new MigrationTypeEnum("HISTORY_DATA");

        private static final Map<String, MigrationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationTypeEnum> createStaticFields() {
            Map<String, MigrationTypeEnum> map = new HashMap<>();
            map.put("INCREMENTAL_DATA", INCREMENTAL_DATA);
            map.put("HISTORY_DATA", HISTORY_DATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrationTypeEnum(String value) {
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
        public static MigrationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MigrationTypeEnum(value));
        }

        public static MigrationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrationTypeEnum) {
                return this.value.equals(((MigrationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_type")

    private MigrationTypeEnum migrationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startup_timestamp")

    private String startupTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_engine_version")

    private String jobEngineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_engine_version")

    private String clusterEngineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracking_url")

    private String trackingUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_info")

    private String metricInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_details")

    private List<TaskDetailInfo> taskDetails = null;

    public ShowRealTimeJobDetailsResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowRealTimeJobDetailsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowRealTimeJobDetailsResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowRealTimeJobDetailsResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 作业状态。 - EXCEPTION：异常 - STOPPING：停止中 - SUBMITTING：提交中 - RUNNING：运行中 - STOPPED：已停止 - SUCCESS：成功
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowRealTimeJobDetailsResponse withMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    /**
     * 作业迁移类型。 - INCREMENTAL_DATA：增量数据 - HISTORY_DATA：历史数据
     * @return migrationType
     */
    public MigrationTypeEnum getMigrationType() {
        return migrationType;
    }

    public void setMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
    }

    public ShowRealTimeJobDetailsResponse withStartupTimestamp(String startupTimestamp) {
        this.startupTimestamp = startupTimestamp;
        return this;
    }

    /**
     * INCREMENTAL_DATA作业启动的时间位点。
     * @return startupTimestamp
     */
    public String getStartupTimestamp() {
        return startupTimestamp;
    }

    public void setStartupTimestamp(String startupTimestamp) {
        this.startupTimestamp = startupTimestamp;
    }

    public ShowRealTimeJobDetailsResponse withJobEngineVersion(String jobEngineVersion) {
        this.jobEngineVersion = jobEngineVersion;
        return this;
    }

    /**
     * 运行作业时的引擎版本。
     * @return jobEngineVersion
     */
    public String getJobEngineVersion() {
        return jobEngineVersion;
    }

    public void setJobEngineVersion(String jobEngineVersion) {
        this.jobEngineVersion = jobEngineVersion;
    }

    public ShowRealTimeJobDetailsResponse withClusterEngineVersion(String clusterEngineVersion) {
        this.clusterEngineVersion = clusterEngineVersion;
        return this;
    }

    /**
     * 作业关联资源组的引擎版本。
     * @return clusterEngineVersion
     */
    public String getClusterEngineVersion() {
        return clusterEngineVersion;
    }

    public void setClusterEngineVersion(String clusterEngineVersion) {
        this.clusterEngineVersion = clusterEngineVersion;
    }

    public ShowRealTimeJobDetailsResponse withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 资源组类型。
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ShowRealTimeJobDetailsResponse withTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    /**
     * MRS Flink作业trackingUrl。
     * @return trackingUrl
     */
    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public ShowRealTimeJobDetailsResponse withMetricInfo(String metricInfo) {
        this.metricInfo = metricInfo;
        return this;
    }

    /**
     * 作业指标信息。
     * @return metricInfo
     */
    public String getMetricInfo() {
        return metricInfo;
    }

    public void setMetricInfo(String metricInfo) {
        this.metricInfo = metricInfo;
    }

    public ShowRealTimeJobDetailsResponse withTaskDetails(List<TaskDetailInfo> taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }

    public ShowRealTimeJobDetailsResponse addTaskDetailsItem(TaskDetailInfo taskDetailsItem) {
        if (this.taskDetails == null) {
            this.taskDetails = new ArrayList<>();
        }
        this.taskDetails.add(taskDetailsItem);
        return this;
    }

    public ShowRealTimeJobDetailsResponse withTaskDetails(Consumer<List<TaskDetailInfo>> taskDetailsSetter) {
        if (this.taskDetails == null) {
            this.taskDetails = new ArrayList<>();
        }
        taskDetailsSetter.accept(this.taskDetails);
        return this;
    }

    /**
     * 任务详情列表。
     * @return taskDetails
     */
    public List<TaskDetailInfo> getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(List<TaskDetailInfo> taskDetails) {
        this.taskDetails = taskDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRealTimeJobDetailsResponse that = (ShowRealTimeJobDetailsResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.migrationType, that.migrationType)
            && Objects.equals(this.startupTimestamp, that.startupTimestamp)
            && Objects.equals(this.jobEngineVersion, that.jobEngineVersion)
            && Objects.equals(this.clusterEngineVersion, that.clusterEngineVersion)
            && Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.trackingUrl, that.trackingUrl)
            && Objects.equals(this.metricInfo, that.metricInfo) && Objects.equals(this.taskDetails, that.taskDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess,
            message,
            jobId,
            state,
            migrationType,
            startupTimestamp,
            jobEngineVersion,
            clusterEngineVersion,
            clusterType,
            trackingUrl,
            metricInfo,
            taskDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRealTimeJobDetailsResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
        sb.append("    startupTimestamp: ").append(toIndentedString(startupTimestamp)).append("\n");
        sb.append("    jobEngineVersion: ").append(toIndentedString(jobEngineVersion)).append("\n");
        sb.append("    clusterEngineVersion: ").append(toIndentedString(clusterEngineVersion)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
        sb.append("    metricInfo: ").append(toIndentedString(metricInfo)).append("\n");
        sb.append("    taskDetails: ").append(toIndentedString(taskDetails)).append("\n");
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
