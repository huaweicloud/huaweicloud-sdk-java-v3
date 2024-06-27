package com.huaweicloud.sdk.cloudtest.v1.model;

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
 * MsgInfoQuery
 */
public class MsgInfoQuery {

    /**
     * Gets or Sets alertTypes
     */
    public static final class AlertTypesEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final AlertTypesEnum _1 = new AlertTypesEnum("1");

        /**
         * Enum _10 for value: "10"
         */
        public static final AlertTypesEnum _10 = new AlertTypesEnum("10");

        /**
         * Enum _11 for value: "11"
         */
        public static final AlertTypesEnum _11 = new AlertTypesEnum("11");

        /**
         * Enum _12 for value: "12"
         */
        public static final AlertTypesEnum _12 = new AlertTypesEnum("12");

        /**
         * Enum _14 for value: "14"
         */
        public static final AlertTypesEnum _14 = new AlertTypesEnum("14");

        /**
         * Enum _16 for value: "16"
         */
        public static final AlertTypesEnum _16 = new AlertTypesEnum("16");

        /**
         * Enum _2 for value: "2"
         */
        public static final AlertTypesEnum _2 = new AlertTypesEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final AlertTypesEnum _3 = new AlertTypesEnum("3");

        /**
         * Enum _4 for value: "4"
         */
        public static final AlertTypesEnum _4 = new AlertTypesEnum("4");

        /**
         * Enum _5 for value: "5"
         */
        public static final AlertTypesEnum _5 = new AlertTypesEnum("5");

        /**
         * Enum _6 for value: "6"
         */
        public static final AlertTypesEnum _6 = new AlertTypesEnum("6");

        /**
         * Enum _7 for value: "7"
         */
        public static final AlertTypesEnum _7 = new AlertTypesEnum("7");

        /**
         * Enum _9 for value: "9"
         */
        public static final AlertTypesEnum _9 = new AlertTypesEnum("9");

        private static final Map<String, AlertTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlertTypesEnum> createStaticFields() {
            Map<String, AlertTypesEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("10", _10);
            map.put("11", _11);
            map.put("12", _12);
            map.put("14", _14);
            map.put("16", _16);
            map.put("2", _2);
            map.put("3", _3);
            map.put("4", _4);
            map.put("5", _5);
            map.put("6", _6);
            map.put("7", _7);
            map.put("9", _9);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlertTypesEnum(String value) {
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
        public static AlertTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlertTypesEnum(value));
        }

        public static AlertTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlertTypesEnum) {
                return this.value.equals(((AlertTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_types")

    private List<AlertTypesEnum> alertTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private String caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_name")

    private String caseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    /**
     * 发送类型
     */
    public static final class SendAlertTypeEnum {

        /**
         * Enum LEVEL_ALERT for value: "LEVEL_ALERT"
         */
        public static final SendAlertTypeEnum LEVEL_ALERT = new SendAlertTypeEnum("LEVEL_ALERT");

        /**
         * Enum OPERATION_NOTICE for value: "OPERATION_NOTICE"
         */
        public static final SendAlertTypeEnum OPERATION_NOTICE = new SendAlertTypeEnum("OPERATION_NOTICE");

        /**
         * Enum RECOVER_ALERT for value: "RECOVER_ALERT"
         */
        public static final SendAlertTypeEnum RECOVER_ALERT = new SendAlertTypeEnum("RECOVER_ALERT");

        /**
         * Enum RESTRAINING for value: "RESTRAINING"
         */
        public static final SendAlertTypeEnum RESTRAINING = new SendAlertTypeEnum("RESTRAINING");

        /**
         * Enum RESTRAIN_ALERT for value: "RESTRAIN_ALERT"
         */
        public static final SendAlertTypeEnum RESTRAIN_ALERT = new SendAlertTypeEnum("RESTRAIN_ALERT");

        private static final Map<String, SendAlertTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SendAlertTypeEnum> createStaticFields() {
            Map<String, SendAlertTypeEnum> map = new HashMap<>();
            map.put("LEVEL_ALERT", LEVEL_ALERT);
            map.put("OPERATION_NOTICE", OPERATION_NOTICE);
            map.put("RECOVER_ALERT", RECOVER_ALERT);
            map.put("RESTRAINING", RESTRAINING);
            map.put("RESTRAIN_ALERT", RESTRAIN_ALERT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SendAlertTypeEnum(String value) {
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
        public static SendAlertTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SendAlertTypeEnum(value));
        }

        public static SendAlertTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SendAlertTypeEnum) {
                return this.value.equals(((SendAlertTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_alert_type")

    private SendAlertTypeEnum sendAlertType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    public MsgInfoQuery withAlertTypes(List<AlertTypesEnum> alertTypes) {
        this.alertTypes = alertTypes;
        return this;
    }

    public MsgInfoQuery addAlertTypesItem(AlertTypesEnum alertTypesItem) {
        if (this.alertTypes == null) {
            this.alertTypes = new ArrayList<>();
        }
        this.alertTypes.add(alertTypesItem);
        return this;
    }

    public MsgInfoQuery withAlertTypes(Consumer<List<AlertTypesEnum>> alertTypesSetter) {
        if (this.alertTypes == null) {
            this.alertTypes = new ArrayList<>();
        }
        alertTypesSetter.accept(this.alertTypes);
        return this;
    }

    /**
     * 告警类型
     * @return alertTypes
     */
    public List<AlertTypesEnum> getAlertTypes() {
        return alertTypes;
    }

    public void setAlertTypes(List<AlertTypesEnum> alertTypes) {
        this.alertTypes = alertTypes;
    }

    public MsgInfoQuery withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 用例id
     * @return caseId
     */
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public MsgInfoQuery withCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }

    /**
     * 用例名
     * @return caseName
     */
    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public MsgInfoQuery withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public MsgInfoQuery withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页码
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public MsgInfoQuery withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public MsgInfoQuery withSendAlertType(SendAlertTypeEnum sendAlertType) {
        this.sendAlertType = sendAlertType;
        return this;
    }

    /**
     * 发送类型
     * @return sendAlertType
     */
    public SendAlertTypeEnum getSendAlertType() {
        return sendAlertType;
    }

    public void setSendAlertType(SendAlertTypeEnum sendAlertType) {
        this.sendAlertType = sendAlertType;
    }

    public MsgInfoQuery withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public MsgInfoQuery withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MsgInfoQuery withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MsgInfoQuery that = (MsgInfoQuery) obj;
        return Objects.equals(this.alertTypes, that.alertTypes) && Objects.equals(this.caseId, that.caseId)
            && Objects.equals(this.caseName, that.caseName) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.sendAlertType, that.sendAlertType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(alertTypes, caseId, caseName, endTime, pageNum, pageSize, sendAlertType, startTime, taskId, taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MsgInfoQuery {\n");
        sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    caseName: ").append(toIndentedString(caseName)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    sendAlertType: ").append(toIndentedString(sendAlertType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
