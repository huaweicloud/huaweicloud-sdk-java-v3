package com.huaweicloud.sdk.dgc.v1.model;

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
public class ListJobInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minPlanTime")

    private Long minPlanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPlanTime")

    private Long maxPlanTime;

    /**
     * 实例运行状态： - waiting：等待运行 - running：运行中 - success：运行成功 - fail： 运行失败 - running-exception：运行异常 - pause： 暂停 - manual-stop：取消
     */
    public static final class StatusEnum {

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StatusEnum WAITING = new StatusEnum("waiting");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum RUNNING_EXCEPTION for value: "running-exception"
         */
        public static final StatusEnum RUNNING_EXCEPTION = new StatusEnum("running-exception");

        /**
         * Enum PAUSE for value: "pause"
         */
        public static final StatusEnum PAUSE = new StatusEnum("pause");

        /**
         * Enum MANUAL_STOP for value: "manual-stop"
         */
        public static final StatusEnum MANUAL_STOP = new StatusEnum("manual-stop");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("waiting", WAITING);
            map.put("running", RUNNING);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("running-exception", RUNNING_EXCEPTION);
            map.put("pause", PAUSE);
            map.put("manual-stop", MANUAL_STOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preciseQuery")

    private Boolean preciseQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobName")

    private String jobName;

    /**
     * 作业调度方式： - 0：正常调度 - 2：手工调度 - 5：补数据 - 6：子作业调度 - 7：单次调度
     */
    public static final class InstanceTypeEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final InstanceTypeEnum _0 = new InstanceTypeEnum("0");

        /**
         * Enum _2 for value: "2"
         */
        public static final InstanceTypeEnum _2 = new InstanceTypeEnum("2");

        /**
         * Enum _5 for value: "5"
         */
        public static final InstanceTypeEnum _5 = new InstanceTypeEnum("5");

        /**
         * Enum _6 for value: "6"
         */
        public static final InstanceTypeEnum _6 = new InstanceTypeEnum("6");

        /**
         * Enum _7 for value: "7"
         */
        public static final InstanceTypeEnum _7 = new InstanceTypeEnum("7");

        private static final Map<String, InstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTypeEnum> createStaticFields() {
            Map<String, InstanceTypeEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("2", _2);
            map.put("5", _5);
            map.put("6", _6);
            map.put("7", _7);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceTypeEnum(String value) {
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
        public static InstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceTypeEnum(value));
        }

        public static InstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceTypeEnum) {
                return this.value.equals(((InstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceType")

    private InstanceTypeEnum instanceType;

    public ListJobInstancesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间id
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListJobInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页参数:每页限定数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListJobInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页参数：页数
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListJobInstancesRequest withMinPlanTime(Long minPlanTime) {
        this.minPlanTime = minPlanTime;
        return this;
    }

    /**
     * 返回作业实际开始时间大于minPlanTime的作业实例，单位为毫秒ms。
     * @return minPlanTime
     */
    public Long getMinPlanTime() {
        return minPlanTime;
    }

    public void setMinPlanTime(Long minPlanTime) {
        this.minPlanTime = minPlanTime;
    }

    public ListJobInstancesRequest withMaxPlanTime(Long maxPlanTime) {
        this.maxPlanTime = maxPlanTime;
        return this;
    }

    /**
     * 返回作业实际开始时间小于maxPlanTime的作业实例，单位为毫秒ms。
     * @return maxPlanTime
     */
    public Long getMaxPlanTime() {
        return maxPlanTime;
    }

    public void setMaxPlanTime(Long maxPlanTime) {
        this.maxPlanTime = maxPlanTime;
    }

    public ListJobInstancesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例运行状态： - waiting：等待运行 - running：运行中 - success：运行成功 - fail： 运行失败 - running-exception：运行异常 - pause： 暂停 - manual-stop：取消
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListJobInstancesRequest withPreciseQuery(Boolean preciseQuery) {
        this.preciseQuery = preciseQuery;
        return this;
    }

    /**
     * 支持通过作业名进行精确查询。
     * @return preciseQuery
     */
    public Boolean getPreciseQuery() {
        return preciseQuery;
    }

    public void setPreciseQuery(Boolean preciseQuery) {
        this.preciseQuery = preciseQuery;
    }

    public ListJobInstancesRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称。如果要查询指定批处理作业的实例列表，jobName就是批处理作业名称；如果要查询实时作业下某个节点关联的子作业，jobName格式为[实时作业名称]_[节点名称]。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListJobInstancesRequest withInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 作业调度方式： - 0：正常调度 - 2：手工调度 - 5：补数据 - 6：子作业调度 - 7：单次调度
     * @return instanceType
     */
    public InstanceTypeEnum getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobInstancesRequest that = (ListJobInstancesRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.minPlanTime, that.minPlanTime)
            && Objects.equals(this.maxPlanTime, that.maxPlanTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.preciseQuery, that.preciseQuery) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.instanceType, that.instanceType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(workspace, limit, offset, minPlanTime, maxPlanTime, status, preciseQuery, jobName, instanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobInstancesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    minPlanTime: ").append(toIndentedString(minPlanTime)).append("\n");
        sb.append("    maxPlanTime: ").append(toIndentedString(maxPlanTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    preciseQuery: ").append(toIndentedString(preciseQuery)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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
