package com.huaweicloud.sdk.aidatalake.v2.model;

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
 * Request Object
 */
public class ListFlinkJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_after")

    private Long createTimeAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_before")

    private Long createTimeBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<FlinkJobState> state = null;

    /**
     * **参数解释**：作业类型，用于按作业类型筛选列表。 **约束限制**：不涉及。 **取值范围**：   - FLINK_SQL_JOB：SQL作业。   - FLINK_JAR_JOB：JAR作业。 **默认取值**：不涉及。
     */
    public static final class JobTypeEnum {

        /**
         * Enum FLINK_SQL_JOB for value: "FLINK_SQL_JOB"
         */
        public static final JobTypeEnum FLINK_SQL_JOB = new JobTypeEnum("FLINK_SQL_JOB");

        /**
         * Enum FLINK_JAR_JOB for value: "FLINK_JAR_JOB"
         */
        public static final JobTypeEnum FLINK_JAR_JOB = new JobTypeEnum("FLINK_JAR_JOB");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("FLINK_SQL_JOB", FLINK_SQL_JOB);
            map.put("FLINK_JAR_JOB", FLINK_JAR_JOB);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypeEnum(value));
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * **参数解释**：执行模式，用于按执行模式筛选作业列表。 **约束限制**：不涉及。 **取值范围**：   - STREAMING：流模式。   - BATCH：批模式。 **默认取值**：不涉及。
     */
    public static final class ExecutionModeEnum {

        /**
         * Enum STREAMING for value: "STREAMING"
         */
        public static final ExecutionModeEnum STREAMING = new ExecutionModeEnum("STREAMING");

        /**
         * Enum BATCH for value: "BATCH"
         */
        public static final ExecutionModeEnum BATCH = new ExecutionModeEnum("BATCH");

        private static final Map<String, ExecutionModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExecutionModeEnum> createStaticFields() {
            Map<String, ExecutionModeEnum> map = new HashMap<>();
            map.put("STREAMING", STREAMING);
            map.put("BATCH", BATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExecutionModeEnum(String value) {
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
        public static ExecutionModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExecutionModeEnum(value));
        }

        public static ExecutionModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExecutionModeEnum) {
                return this.value.equals(((ExecutionModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_mode")

    private ExecutionModeEnum executionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    public ListFlinkJobsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间的ID。 **约束限制**：不涉及。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListFlinkJobsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释**：上一页中最后一条记录id，查询第一页时传空值。 **约束限制**：不涉及。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFlinkJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：1~100。 **默认取值**：10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFlinkJobsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * **参数解释**：分页查询方向，用于控制翻页方向。 **约束限制**：与marker参数配合使用。当page_reverse=true时，必须传入marker参数，否则返回400错误。 **取值范围**：   - true：向前翻页（查询marker之前的数据）。   - false：向后翻页（查询marker之后的数据）。 **默认取值**：false。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListFlinkJobsRequest withCreateTimeAfter(Long createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
        return this;
    }

    /**
     * **参数解释**：用于查询创建时间在该时间点之后的作业。unix时间戳，单位：毫秒。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * minimum: 1764061598000
     * maximum: 253402271999000
     * @return createTimeAfter
     */
    public Long getCreateTimeAfter() {
        return createTimeAfter;
    }

    public void setCreateTimeAfter(Long createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
    }

    public ListFlinkJobsRequest withCreateTimeBefore(Long createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
        return this;
    }

    /**
     * **参数解释**：用于查询创建时间在该时间点之前的作业。unix时间戳，单位：毫秒。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * minimum: 1764061598000
     * maximum: 253402271999000
     * @return createTimeBefore
     */
    public Long getCreateTimeBefore() {
        return createTimeBefore;
    }

    public void setCreateTimeBefore(Long createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
    }

    public ListFlinkJobsRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**：作业运行的端点ID，用于按端点筛选作业。 **约束限制**：不涉及。 **取值范围**：采用UUID格式，固定36个字符。 **默认取值**：不涉及。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public ListFlinkJobsRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：通过端点名称检索的参数。 **约束限制**：不涉及。 **取值范围**：长度为1~64的中文、英文字母、数字、下划线、中划线、点号、空格的组合。 **默认取值**：不涉及。 
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public ListFlinkJobsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业名称，用于按作业名称模糊筛选。 **约束限制**：不涉及。 **取值范围**：长度为1~128个字符，以字母或数字开头和结尾，中间可包含字母、数字、下划线和中划线。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListFlinkJobsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：Flink作业ID，用于按作业ID筛选，可通过[创建Flink作业](RunFlinkJob.xml)接口返回值获取。 **约束限制**：不涉及。 **取值范围**：采用UUIDv7格式，固定36个字符。 **默认取值**：不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListFlinkJobsRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * **参数解释**：已部署作业ID，用于按部署ID筛选作业。 **约束限制**：不涉及。 **取值范围**：长度为1~64个字符，只能由英文字母、数字、下划线和中划线组成。 **默认取值**：不涉及。
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public ListFlinkJobsRequest withState(List<FlinkJobState> state) {
        this.state = state;
        return this;
    }

    public ListFlinkJobsRequest addStateItem(FlinkJobState stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListFlinkJobsRequest withState(Consumer<List<FlinkJobState>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    /**
     * **参数解释**：Flink作业状态，用于按状态筛选作业列表。数组元素为FlinkJobState枚举，取值如下：   - CREATED：已创建。   - STARTING：启动中。   - RUNNING：运行中。   - CANCELLING：停止中。   - FAILED：已失败。   - CANCELLED：已停止。   - FINISHED：已完成。 **约束限制**：不涉及。
     * @return state
     */
    public List<FlinkJobState> getState() {
        return state;
    }

    public void setState(List<FlinkJobState> state) {
        this.state = state;
    }

    public ListFlinkJobsRequest withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * **参数解释**：作业类型，用于按作业类型筛选列表。 **约束限制**：不涉及。 **取值范围**：   - FLINK_SQL_JOB：SQL作业。   - FLINK_JAR_JOB：JAR作业。 **默认取值**：不涉及。
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public ListFlinkJobsRequest withExecutionMode(ExecutionModeEnum executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * **参数解释**：执行模式，用于按执行模式筛选作业列表。 **约束限制**：不涉及。 **取值范围**：   - STREAMING：流模式。   - BATCH：批模式。 **默认取值**：不涉及。
     * @return executionMode
     */
    public ExecutionModeEnum getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(ExecutionModeEnum executionMode) {
        this.executionMode = executionMode;
    }

    public ListFlinkJobsRequest withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * **参数解释**：创建者用户ID（即IAM用户ID），用于按创建者筛选作业，获取方法请参见[获取账号ID](aidatalake_02_0030.xml)。 **约束限制**：不涉及。 **取值范围**：长度为1~256个字符，只能由英文字母和数字组成。 **默认取值**：不涉及。
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public ListFlinkJobsRequest withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ListFlinkJobsRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ListFlinkJobsRequest withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：标签过滤条件，用于按标签筛选作业。格式为key=value，支持多个标签。 **约束限制**：最多10个标签。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlinkJobsRequest that = (ListFlinkJobsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.createTimeAfter, that.createTimeAfter)
            && Objects.equals(this.createTimeBefore, that.createTimeBefore)
            && Objects.equals(this.endpointId, that.endpointId) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.deploymentId, that.deploymentId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.executionMode, that.executionMode)
            && Objects.equals(this.createUserId, that.createUserId) && Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            marker,
            limit,
            pageReverse,
            createTimeAfter,
            createTimeBefore,
            endpointId,
            endpointName,
            name,
            jobId,
            deploymentId,
            state,
            jobType,
            executionMode,
            createUserId,
            labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkJobsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    createTimeAfter: ").append(toIndentedString(createTimeAfter)).append("\n");
        sb.append("    createTimeBefore: ").append(toIndentedString(createTimeBefore)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
