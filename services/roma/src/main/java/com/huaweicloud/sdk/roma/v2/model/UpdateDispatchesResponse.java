package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateDispatchesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dispatch_id")

    private String dispatchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_datetime")

    private Long startDatetime;

    /**
     * 调度计划执行周期的时间单位，当使用cron表达式时，为空 - MIN (分钟) - HOUR (小时) - DAY (日) - WEEK (周) - MON (月)
     */
    public static final class PeriodEnum {

        /**
         * Enum MIN for value: "MIN"
         */
        public static final PeriodEnum MIN = new PeriodEnum("MIN");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final PeriodEnum HOUR = new PeriodEnum("HOUR");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final PeriodEnum DAY = new PeriodEnum("DAY");

        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final PeriodEnum WEEK = new PeriodEnum("WEEK");

        /**
         * Enum MON for value: "MON"
         */
        public static final PeriodEnum MON = new PeriodEnum("MON");

        private static final Map<String, PeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodEnum> createStaticFields() {
            Map<String, PeriodEnum> map = new HashMap<>();
            map.put("MIN", MIN);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MON", MON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodEnum(String value) {
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
        public static PeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodEnum(value);
            }
            return result;
        }

        public static PeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodEnum) {
                return this.value.equals(((PeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private PeriodEnum period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dispatch_interval")

    private Long dispatchInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private Long createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_date")

    private Long lastModifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_quartz_cron")

    private Boolean useQuartzCron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private String cron;

    public UpdateDispatchesResponse withDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
        return this;
    }

    /**
     * 调度计划ID
     * @return dispatchId
     */
    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    public UpdateDispatchesResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 调度计划关联的任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public UpdateDispatchesResponse withStartDatetime(Long startDatetime) {
        this.startDatetime = startDatetime;
        return this;
    }

    /**
     * 调度计划的执行开始时间
     * minimum: 0
     * maximum: 99999999999999999
     * @return startDatetime
     */
    public Long getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Long startDatetime) {
        this.startDatetime = startDatetime;
    }

    public UpdateDispatchesResponse withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /**
     * 调度计划执行周期的时间单位，当使用cron表达式时，为空 - MIN (分钟) - HOUR (小时) - DAY (日) - WEEK (周) - MON (月)
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    public UpdateDispatchesResponse withDispatchInterval(Long dispatchInterval) {
        this.dispatchInterval = dispatchInterval;
        return this;
    }

    /**
     * 调度计划的执行间隔时间周期
     * minimum: 1
     * maximum: 59
     * @return dispatchInterval
     */
    public Long getDispatchInterval() {
        return dispatchInterval;
    }

    public void setDispatchInterval(Long dispatchInterval) {
        this.dispatchInterval = dispatchInterval;
    }

    public UpdateDispatchesResponse withCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 调度计划的创建时间
     * minimum: 1
     * maximum: 99999999999999999
     * @return createdDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public UpdateDispatchesResponse withLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * 调度计划最近一次的修改时间
     * minimum: 1
     * maximum: 99999999999999999
     * @return lastModifiedDate
     */
    public Long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public UpdateDispatchesResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 调度计划的备注信息
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UpdateDispatchesResponse withUseQuartzCron(Boolean useQuartzCron) {
        this.useQuartzCron = useQuartzCron;
        return this;
    }

    /**
     * 调度计划是否使用cron表达式，允许如下值： - true (使用cron表达式) - false (不使用cron表达式)
     * @return useQuartzCron
     */
    public Boolean getUseQuartzCron() {
        return useQuartzCron;
    }

    public void setUseQuartzCron(Boolean useQuartzCron) {
        this.useQuartzCron = useQuartzCron;
    }

    public UpdateDispatchesResponse withCron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
     * 调度计划的cron表达式
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDispatchesResponse updateDispatchesResponse = (UpdateDispatchesResponse) o;
        return Objects.equals(this.dispatchId, updateDispatchesResponse.dispatchId)
            && Objects.equals(this.taskId, updateDispatchesResponse.taskId)
            && Objects.equals(this.startDatetime, updateDispatchesResponse.startDatetime)
            && Objects.equals(this.period, updateDispatchesResponse.period)
            && Objects.equals(this.dispatchInterval, updateDispatchesResponse.dispatchInterval)
            && Objects.equals(this.createdDate, updateDispatchesResponse.createdDate)
            && Objects.equals(this.lastModifiedDate, updateDispatchesResponse.lastModifiedDate)
            && Objects.equals(this.remark, updateDispatchesResponse.remark)
            && Objects.equals(this.useQuartzCron, updateDispatchesResponse.useQuartzCron)
            && Objects.equals(this.cron, updateDispatchesResponse.cron);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dispatchId,
            taskId,
            startDatetime,
            period,
            dispatchInterval,
            createdDate,
            lastModifiedDate,
            remark,
            useQuartzCron,
            cron);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDispatchesResponse {\n");
        sb.append("    dispatchId: ").append(toIndentedString(dispatchId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    startDatetime: ").append(toIndentedString(startDatetime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    dispatchInterval: ").append(toIndentedString(dispatchInterval)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    useQuartzCron: ").append(toIndentedString(useQuartzCron)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
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
