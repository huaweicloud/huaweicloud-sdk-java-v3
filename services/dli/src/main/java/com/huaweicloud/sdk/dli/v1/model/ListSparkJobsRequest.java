package com.huaweicloud.sdk.dli.v1.model;

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
public class ListSparkJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Long end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Integer from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job-id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    /**
     * 参数解释:   批处理作业的状态 示例: success 约束限制:  无 取值范围: starting（批处理作业正在启动） running（批处理作业正在执行任务） dead（批处理作业已退出） success（批处理作业执行成功） recovering（批处理作业正在恢复） 默认取值: 无
     */
    public static final class StateEnum {

        /**
         * Enum STARTING for value: "starting"
         */
        public static final StateEnum STARTING = new StateEnum("starting");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StateEnum RUNNING = new StateEnum("running");

        /**
         * Enum DEAD for value: "dead"
         */
        public static final StateEnum DEAD = new StateEnum("dead");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StateEnum SUCCESS = new StateEnum("success");

        /**
         * Enum RECOVERING for value: "recovering"
         */
        public static final StateEnum RECOVERING = new StateEnum("recovering");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("starting", STARTING);
            map.put("running", RUNNING);
            map.put("dead", DEAD);
            map.put("success", SUCCESS);
            map.put("recovering", RECOVERING);
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

    public ListSparkJobsRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 参数解释:   DLI队列名称，不填写则获取当前Project下所有批处理作业(不推荐使用) 示例: cluster1 约束限制:  匹配正则表达式'^(?!_)(?![0-9]+$)[A-Za-z0-9_]*$'的字符串 取值范围: 无 默认取值: 无
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListSparkJobsRequest withEnd(Long end) {
        this.end = end;
        return this;
    }

    /**
     * 参数解释:   用于查询开始时间在该时间点之前的作业。时间格式为unix时间戳，单位：毫秒 示例: 156789546456 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return end
     */
    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public ListSparkJobsRequest withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * 参数解释:   起始批处理作业的索引号，默认从0开始 示例: 0 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return from
     */
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public ListSparkJobsRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 参数解释:   批处理作业的名称 示例: dli_test 约束限制:  无 取值范围: 无 默认取值: 无
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListSparkJobsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 参数解释:   批处理作业的ID 示例: 03923a72-5ace-466a-a573-e8c7b08b8cf3 约束限制:  匹配正则表达式'^[A-Fa-f0-9_-]*$'的字符串 取值范围: 无 默认取值: 无
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListSparkJobsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 参数解释:   指定作业排序方式 示例: DURATION_DESC 约束限制:  无 取值范围: DURATION_DESC（作业运行时长降序） DURATION_ASC（作业运行时长升序） CREATE_TIME_DESC（作业提交时间降序） CREATE_TIME_ASC（作业提交时间升序） 默认取值: 无
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListSparkJobsRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 参数解释:   队列名称 示例: 03923a72-5ace-466a-a573-e8c7b08b8cf3 约束限制:  匹配正则表达式'^[A-Fa-f0-9_-]*$'的字符串 取值范围: 无 默认取值: 无
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ListSparkJobsRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 参数解释:   查询批处理作业的数量 示例: 1 约束限制:  无 取值范围: 无 默认取值: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListSparkJobsRequest withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 参数解释:   用于查询开始时间在该时间点之后的作业。时间格式为unix时间戳，单位：毫秒 示例: 156456784655 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public ListSparkJobsRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 参数解释:   批处理作业的状态 示例: success 约束限制:  无 取值范围: starting（批处理作业正在启动） running（批处理作业正在执行任务） dead（批处理作业已退出） success（批处理作业执行成功） recovering（批处理作业正在恢复） 默认取值: 无
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
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
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.end, that.end)
            && Objects.equals(this.from, that.from) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.order, that.order)
            && Objects.equals(this.queueName, that.queueName) && Objects.equals(this.size, that.size)
            && Objects.equals(this.start, that.start) && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName, end, from, jobName, jobId, order, queueName, size, start, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSparkJobsRequest {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
