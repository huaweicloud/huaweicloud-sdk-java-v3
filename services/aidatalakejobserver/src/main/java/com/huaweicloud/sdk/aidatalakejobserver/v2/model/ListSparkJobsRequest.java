package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

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
public class ListSparkJobsRequest {

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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_after")

    private Long createTimeAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_before")

    private Long createTimeBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private List<String> states = null;

    /**
     * **参数解释**：作业类型，用于过滤查询指定类型的作业。 **约束限制**：不涉及。 **取值范围**： - spark_jar_job：Spark jar作业。 - spark_python_job：Python Spark作业。 - spark_sql_scripting_job：SQL脚本作业（预留类型）。 **默认取值**：不涉及。
     */
    public static final class JobTypeEnum {

        /**
         * Enum SPARK_JAR_JOB for value: "spark_jar_job"
         */
        public static final JobTypeEnum SPARK_JAR_JOB = new JobTypeEnum("spark_jar_job");

        /**
         * Enum SPARK_PYTHON_JOB for value: "spark_python_job"
         */
        public static final JobTypeEnum SPARK_PYTHON_JOB = new JobTypeEnum("spark_python_job");

        /**
         * Enum SPARK_SQL_SCRIPTING_JOB for value: "spark_sql_scripting_job"
         */
        public static final JobTypeEnum SPARK_SQL_SCRIPTING_JOB = new JobTypeEnum("spark_sql_scripting_job");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("spark_jar_job", SPARK_JAR_JOB);
            map.put("spark_python_job", SPARK_PYTHON_JOB);
            map.put("spark_sql_scripting_job", SPARK_SQL_SCRIPTING_JOB);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_name")

    private String createUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    public ListSparkJobsRequest withWorkspaceId(String workspaceId) {
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

    public ListSparkJobsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释**：作业ID游标位置，用于分页查询。 **约束限制**：首次查询可不传或传空字符串，后续查询传入上次返回的next_marker值。 **取值范围**：采用UUID格式，长度为36个字符，只能由英文大写字母、英文小写字母、数字及下划线和横线组成。 **默认取值**：不涉及。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSparkJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：查询记录数，用于分页查询。 **约束限制**：不涉及。 **取值范围**：1~100之间的整数。 **默认取值**：10。
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

    public ListSparkJobsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * **参数解释**：是否反向分页查询。默认为false，表示正向分页查询。 当设置为true时，表示查询上一页数据，需要配合marker参数使用。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListSparkJobsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业名称，用于模糊查询作业。 **约束限制**：不涉及。 **取值范围**：长度为0~128个字符。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSparkJobsRequest withCreateTimeAfter(Long createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
        return this;
    }

    /**
     * **参数解释**：用于查询创建时间在该时间点之后的作业。 **约束限制**：不涉及。 **取值范围**：unix时间戳，单位为毫秒，最小值为1764061598000。 **默认取值**：不涉及。
     * minimum: 1764061598000
     * @return createTimeAfter
     */
    public Long getCreateTimeAfter() {
        return createTimeAfter;
    }

    public void setCreateTimeAfter(Long createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
    }

    public ListSparkJobsRequest withCreateTimeBefore(Long createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
        return this;
    }

    /**
     * **参数解释**：用于查询创建时间在该时间点之前的作业。 **约束限制**：不涉及。 **取值范围**：unix时间戳，单位为毫秒，最小值为1764061598000。 **默认取值**：不涉及。
     * minimum: 1764061598000
     * @return createTimeBefore
     */
    public Long getCreateTimeBefore() {
        return createTimeBefore;
    }

    public void setCreateTimeBefore(Long createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
    }

    public ListSparkJobsRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：端点名称，用于指定Spark作业执行环境。 **约束限制**：不涉及。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。 **默认取值**：不涉及。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public ListSparkJobsRequest withStates(List<String> states) {
        this.states = states;
        return this;
    }

    public ListSparkJobsRequest addStatesItem(String statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public ListSparkJobsRequest withStates(Consumer<List<String>> statesSetter) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * **参数解释**：Spark作业状态列表，用于过滤查询指定状态的作业。 **约束限制**：最多支持查询10种状态。 **取值范围**： - PENDING：启动中。 - QUEUED：排队中。 - RUNNING：运行中。 - CANCELING：取消中。 - CANCELED：已取消。 - FAILED：运行失败。 - SUCCEED：运行成功。 - QUEUED_TIMEOUT：排队超时。 - RUNNING_TIMEOUT：运行超时。
     * @return states
     */
    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public ListSparkJobsRequest withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * **参数解释**：作业类型，用于过滤查询指定类型的作业。 **约束限制**：不涉及。 **取值范围**： - spark_jar_job：Spark jar作业。 - spark_python_job：Python Spark作业。 - spark_sql_scripting_job：SQL脚本作业（预留类型）。 **默认取值**：不涉及。
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public ListSparkJobsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：Spark作业ID，用于精确查询指定作业。 **约束限制**：不涉及。 **取值范围**：只能由英文大写字母、英文小写字母、数字及下划线和横线组成，且长度为1~64个字符。 **默认取值**：不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListSparkJobsRequest withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * **参数解释**：Spark作业创建者ID，用于过滤查询指定用户创建的作业。 **约束限制**：不涉及。 **取值范围**：长度为1~256个字符。 **默认取值**：不涉及。
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public ListSparkJobsRequest withCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    /**
     * **参数解释**：Spark作业创建者名称,用于精确过滤查询指定用户创建的作业。 **约束限制**：不涉及。 **取值范围**：长度为1~256个字符。 
     * @return createUserName
     */
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public ListSparkJobsRequest withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * **参数解释**：作业标签，用于按标签过滤查询作业。支持多标签过滤，格式为“key=value”，多个标签用逗号分隔。 **约束限制**：URL中“=”需要转义为“%3D”。例如：labels=k1%3Dv1，k2%3Dv2。 **取值范围**：长度为1~1024个字符。 **默认取值**：不涉及。
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
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
        ListSparkJobsRequest that = (ListSparkJobsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.name, that.name) && Objects.equals(this.createTimeAfter, that.createTimeAfter)
            && Objects.equals(this.createTimeBefore, that.createTimeBefore)
            && Objects.equals(this.endpointName, that.endpointName) && Objects.equals(this.states, that.states)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.createUserId, that.createUserId)
            && Objects.equals(this.createUserName, that.createUserName) && Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            marker,
            limit,
            pageReverse,
            name,
            createTimeAfter,
            createTimeBefore,
            endpointName,
            states,
            jobType,
            jobId,
            createUserId,
            createUserName,
            labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSparkJobsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createTimeAfter: ").append(toIndentedString(createTimeAfter)).append("\n");
        sb.append("    createTimeBefore: ").append(toIndentedString(createTimeBefore)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
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
