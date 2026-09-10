package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OpsAnalysisTaskInstanceListInfo
 */
public class OpsAnalysisTaskInstanceListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * **参数解释：** 分析任务具体执行instance的状态。  **取值范围：** scheduled: 待运行，running：运行中，skipped：跳过，success：成功完成，fail：运行失败，stopped：已停止。
     */
    public static final class StatusEnum {

        /**
         * Enum SCHEDULED for value: "scheduled"
         */
        public static final StatusEnum SCHEDULED = new StatusEnum("scheduled");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum SKIPPED for value: "skipped"
         */
        public static final StatusEnum SKIPPED = new StatusEnum("skipped");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final StatusEnum STOPPED = new StatusEnum("stopped");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("scheduled", SCHEDULED);
            map.put("running", RUNNING);
            map.put("skipped", SKIPPED);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("stopped", STOPPED);
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
    @JsonProperty(value = "planned_start_time")

    private Long plannedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_start_time")

    private Long instanceStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_end_time")

    private Long instanceEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_start_time")

    private Long dataStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_end_time")

    private Long dataEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public OpsAnalysisTaskInstanceListInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 分析任务具体执行instance的ID。  **取值范围：** UUID格式字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsAnalysisTaskInstanceListInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 分析任务具体执行instance的状态。  **取值范围：** scheduled: 待运行，running：运行中，skipped：跳过，success：成功完成，fail：运行失败，stopped：已停止。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OpsAnalysisTaskInstanceListInfo withPlannedStartTime(Long plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }

    /**
     * **参数解释：** 分析任务具体执行instance的计划执行时间，单位：毫秒（13位时间戳）。  **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return plannedStartTime
     */
    public Long getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(Long plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public OpsAnalysisTaskInstanceListInfo withInstanceStartTime(Long instanceStartTime) {
        this.instanceStartTime = instanceStartTime;
        return this;
    }

    /**
     * **参数解释：** 分析任务具体执行instance的实际开始执行时间，单位：毫秒（13位时间戳）。instance 尚未被认领执行时为 null。  **取值范围：** 13位毫秒级时间戳或 null。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return instanceStartTime
     */
    public Long getInstanceStartTime() {
        return instanceStartTime;
    }

    public void setInstanceStartTime(Long instanceStartTime) {
        this.instanceStartTime = instanceStartTime;
    }

    public OpsAnalysisTaskInstanceListInfo withInstanceEndTime(Long instanceEndTime) {
        this.instanceEndTime = instanceEndTime;
        return this;
    }

    /**
     * **参数解释：** 分析任务具体执行instance的实际完成时间，单位：毫秒（13位时间戳）。instance 尚未完成时为 null。  **取值范围：** 13位毫秒级时间戳或 null。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return instanceEndTime
     */
    public Long getInstanceEndTime() {
        return instanceEndTime;
    }

    public void setInstanceEndTime(Long instanceEndTime) {
        this.instanceEndTime = instanceEndTime;
    }

    public OpsAnalysisTaskInstanceListInfo withDataStartTime(Long dataStartTime) {
        this.dataStartTime = dataStartTime;
        return this;
    }

    /**
     * **参数解释：** 分析任务具体执行instance所分析的链路数据的起始时间，单位：毫秒（13位时间戳）。 **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return dataStartTime
     */
    public Long getDataStartTime() {
        return dataStartTime;
    }

    public void setDataStartTime(Long dataStartTime) {
        this.dataStartTime = dataStartTime;
    }

    public OpsAnalysisTaskInstanceListInfo withDataEndTime(Long dataEndTime) {
        this.dataEndTime = dataEndTime;
        return this;
    }

    /**
     * **参数解释：** 分析任务具体执行instance所分析的链路数据的截止时间，单位：毫秒（13位时间戳）。  **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return dataEndTime
     */
    public Long getDataEndTime() {
        return dataEndTime;
    }

    public void setDataEndTime(Long dataEndTime) {
        this.dataEndTime = dataEndTime;
    }

    public OpsAnalysisTaskInstanceListInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释：** instance失败或跳过的原因。success 时为 null。  **取值范围：** 不涉及
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsAnalysisTaskInstanceListInfo that = (OpsAnalysisTaskInstanceListInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.plannedStartTime, that.plannedStartTime)
            && Objects.equals(this.instanceStartTime, that.instanceStartTime)
            && Objects.equals(this.instanceEndTime, that.instanceEndTime)
            && Objects.equals(this.dataStartTime, that.dataStartTime)
            && Objects.equals(this.dataEndTime, that.dataEndTime) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, status, plannedStartTime, instanceStartTime, instanceEndTime, dataStartTime, dataEndTime, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsAnalysisTaskInstanceListInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    plannedStartTime: ").append(toIndentedString(plannedStartTime)).append("\n");
        sb.append("    instanceStartTime: ").append(toIndentedString(instanceStartTime)).append("\n");
        sb.append("    instanceEndTime: ").append(toIndentedString(instanceEndTime)).append("\n");
        sb.append("    dataStartTime: ").append(toIndentedString(dataStartTime)).append("\n");
        sb.append("    dataEndTime: ").append(toIndentedString(dataEndTime)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
