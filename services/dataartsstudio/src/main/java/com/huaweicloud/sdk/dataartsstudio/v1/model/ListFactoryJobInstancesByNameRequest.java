package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListFactoryJobInstancesByNameRequest {

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
    @JsonProperty(value = "min_plan_time")

    private Long minPlanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_plan_time")

    private Long maxPlanTime;

    /**
     * 实例运行状态: - waiting：等待运行 - running：运行中 - success：运行成功 - fail： 运行失败 - running-exception：运行异常 - pause： 暂停 - manual-stop：取消 - skip-by-depend：跳过 - freeze：冻结 默认查全部
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

        /**
         * Enum SKIP_BY_DEPEND for value: "skip-by-depend"
         */
        public static final StatusEnum SKIP_BY_DEPEND = new StatusEnum("skip-by-depend");

        /**
         * Enum FREEZE for value: "freeze"
         */
        public static final StatusEnum FREEZE = new StatusEnum("freeze");

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
            map.put("skip-by-depend", SKIP_BY_DEPEND);
            map.put("freeze", FREEZE);
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
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_success")

    private Boolean forceSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_success")

    private Boolean ignoreSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    public ListFactoryJobInstancesByNameRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListFactoryJobInstancesByNameRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页返回结果，指定每页最大记录数。 范围[1,1000] 默认值：10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFactoryJobInstancesByNameRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页的起始页，默认值为0。取值范围大于等于0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFactoryJobInstancesByNameRequest withMinPlanTime(Long minPlanTime) {
        this.minPlanTime = minPlanTime;
        return this;
    }

    /**
     * 返回作业实例开始时间大于min_plain_time的作业实例，单位为毫秒ms，默认设置为查询当天0点，最大可支持查询一个月。
     * @return minPlanTime
     */
    public Long getMinPlanTime() {
        return minPlanTime;
    }

    public void setMinPlanTime(Long minPlanTime) {
        this.minPlanTime = minPlanTime;
    }

    public ListFactoryJobInstancesByNameRequest withMaxPlanTime(Long maxPlanTime) {
        this.maxPlanTime = maxPlanTime;
        return this;
    }

    /**
     * 返回作业实例开始时间小于max_plain_time的作业实例，单位为毫秒ms，默认设置为当前时间。
     * @return maxPlanTime
     */
    public Long getMaxPlanTime() {
        return maxPlanTime;
    }

    public void setMaxPlanTime(Long maxPlanTime) {
        this.maxPlanTime = maxPlanTime;
    }

    public ListFactoryJobInstancesByNameRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例运行状态: - waiting：等待运行 - running：运行中 - success：运行成功 - fail： 运行失败 - running-exception：运行异常 - pause： 暂停 - manual-stop：取消 - skip-by-depend：跳过 - freeze：冻结 默认查全部
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListFactoryJobInstancesByNameRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListFactoryJobInstancesByNameRequest withForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
        return this;
    }

    /**
     * status为success的时候使用，true则筛选出强制成功的作业实例默认值：false
     * @return forceSuccess
     */
    public Boolean getForceSuccess() {
        return forceSuccess;
    }

    public void setForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
    }

    public ListFactoryJobInstancesByNameRequest withIgnoreSuccess(Boolean ignoreSuccess) {
        this.ignoreSuccess = ignoreSuccess;
        return this;
    }

    /**
     * status为success的时候使用，true则筛选出忽略失败的作业实例默认值：false
     * @return ignoreSuccess
     */
    public Boolean getIgnoreSuccess() {
        return ignoreSuccess;
    }

    public void setIgnoreSuccess(Boolean ignoreSuccess) {
        this.ignoreSuccess = ignoreSuccess;
    }

    public ListFactoryJobInstancesByNameRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 作业调度方式: -0:正常调度 -2:手工调度 -5:补数据 -6:子作业调度 -7:单次调度
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
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
        ListFactoryJobInstancesByNameRequest that = (ListFactoryJobInstancesByNameRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.minPlanTime, that.minPlanTime)
            && Objects.equals(this.maxPlanTime, that.maxPlanTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.forceSuccess, that.forceSuccess)
            && Objects.equals(this.ignoreSuccess, that.ignoreSuccess)
            && Objects.equals(this.instanceType, that.instanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            limit,
            offset,
            minPlanTime,
            maxPlanTime,
            status,
            jobName,
            forceSuccess,
            ignoreSuccess,
            instanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryJobInstancesByNameRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    minPlanTime: ").append(toIndentedString(minPlanTime)).append("\n");
        sb.append("    maxPlanTime: ").append(toIndentedString(maxPlanTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    forceSuccess: ").append(toIndentedString(forceSuccess)).append("\n");
        sb.append("    ignoreSuccess: ").append(toIndentedString(ignoreSuccess)).append("\n");
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
