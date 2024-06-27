package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * MsgInfoVo
 */
public class MsgInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_channels")

    private String alertChannels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_groups")

    private String alertGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_level")

    private Integer alertLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_num")

    private Integer alertNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_time")

    private OffsetDateTime alertTime;

    /**
     * 告警类型
     */
    public static final class AlertTypeEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final AlertTypeEnum _1 = new AlertTypeEnum("1");

        /**
         * Enum _10 for value: "10"
         */
        public static final AlertTypeEnum _10 = new AlertTypeEnum("10");

        /**
         * Enum _11 for value: "11"
         */
        public static final AlertTypeEnum _11 = new AlertTypeEnum("11");

        /**
         * Enum _12 for value: "12"
         */
        public static final AlertTypeEnum _12 = new AlertTypeEnum("12");

        /**
         * Enum _14 for value: "14"
         */
        public static final AlertTypeEnum _14 = new AlertTypeEnum("14");

        /**
         * Enum _16 for value: "16"
         */
        public static final AlertTypeEnum _16 = new AlertTypeEnum("16");

        /**
         * Enum _2 for value: "2"
         */
        public static final AlertTypeEnum _2 = new AlertTypeEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final AlertTypeEnum _3 = new AlertTypeEnum("3");

        /**
         * Enum _4 for value: "4"
         */
        public static final AlertTypeEnum _4 = new AlertTypeEnum("4");

        /**
         * Enum _5 for value: "5"
         */
        public static final AlertTypeEnum _5 = new AlertTypeEnum("5");

        /**
         * Enum _6 for value: "6"
         */
        public static final AlertTypeEnum _6 = new AlertTypeEnum("6");

        /**
         * Enum _7 for value: "7"
         */
        public static final AlertTypeEnum _7 = new AlertTypeEnum("7");

        /**
         * Enum _9 for value: "9"
         */
        public static final AlertTypeEnum _9 = new AlertTypeEnum("9");

        private static final Map<String, AlertTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlertTypeEnum> createStaticFields() {
            Map<String, AlertTypeEnum> map = new HashMap<>();
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

        AlertTypeEnum(String value) {
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
        public static AlertTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlertTypeEnum(value));
        }

        public static AlertTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlertTypeEnum) {
                return this.value.equals(((AlertTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_type")

    private AlertTypeEnum alertType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_names")

    private String locationNames;

    /**
     * 发送告警类型
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
    @JsonProperty(value = "sub_task_case_id")

    private String subTaskCaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_case_start_time")

    private OffsetDateTime subTaskCaseStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_id")

    private String subTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_start_time")

    private OffsetDateTime subTaskStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_id")

    private String testCaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_name")

    private String testCaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_type")

    private Integer testSuiteType;

    public MsgInfoVo withAlertChannels(String alertChannels) {
        this.alertChannels = alertChannels;
        return this;
    }

    /**
     * 告警渠道
     * @return alertChannels
     */
    public String getAlertChannels() {
        return alertChannels;
    }

    public void setAlertChannels(String alertChannels) {
        this.alertChannels = alertChannels;
    }

    public MsgInfoVo withAlertGroups(String alertGroups) {
        this.alertGroups = alertGroups;
        return this;
    }

    /**
     * 告警分组
     * @return alertGroups
     */
    public String getAlertGroups() {
        return alertGroups;
    }

    public void setAlertGroups(String alertGroups) {
        this.alertGroups = alertGroups;
    }

    public MsgInfoVo withAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }

    /**
     * 告警级别
     * @return alertLevel
     */
    public Integer getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
    }

    public MsgInfoVo withAlertNum(Integer alertNum) {
        this.alertNum = alertNum;
        return this;
    }

    /**
     * 总告警次数
     * @return alertNum
     */
    public Integer getAlertNum() {
        return alertNum;
    }

    public void setAlertNum(Integer alertNum) {
        this.alertNum = alertNum;
    }

    public MsgInfoVo withAlertTime(OffsetDateTime alertTime) {
        this.alertTime = alertTime;
        return this;
    }

    /**
     * 告警时间
     * @return alertTime
     */
    public OffsetDateTime getAlertTime() {
        return alertTime;
    }

    public void setAlertTime(OffsetDateTime alertTime) {
        this.alertTime = alertTime;
    }

    public MsgInfoVo withAlertType(AlertTypeEnum alertType) {
        this.alertType = alertType;
        return this;
    }

    /**
     * 告警类型
     * @return alertType
     */
    public AlertTypeEnum getAlertType() {
        return alertType;
    }

    public void setAlertType(AlertTypeEnum alertType) {
        this.alertType = alertType;
    }

    public MsgInfoVo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 告警内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MsgInfoVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * MsgInfo的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MsgInfoVo withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 链接
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public MsgInfoVo withLocationNames(String locationNames) {
        this.locationNames = locationNames;
        return this;
    }

    /**
     * 执行机区域
     * @return locationNames
     */
    public String getLocationNames() {
        return locationNames;
    }

    public void setLocationNames(String locationNames) {
        this.locationNames = locationNames;
    }

    public MsgInfoVo withSendAlertType(SendAlertTypeEnum sendAlertType) {
        this.sendAlertType = sendAlertType;
        return this;
    }

    /**
     * 发送告警类型
     * @return sendAlertType
     */
    public SendAlertTypeEnum getSendAlertType() {
        return sendAlertType;
    }

    public void setSendAlertType(SendAlertTypeEnum sendAlertType) {
        this.sendAlertType = sendAlertType;
    }

    public MsgInfoVo withSubTaskCaseId(String subTaskCaseId) {
        this.subTaskCaseId = subTaskCaseId;
        return this;
    }

    /**
     * 子任务用例id
     * @return subTaskCaseId
     */
    public String getSubTaskCaseId() {
        return subTaskCaseId;
    }

    public void setSubTaskCaseId(String subTaskCaseId) {
        this.subTaskCaseId = subTaskCaseId;
    }

    public MsgInfoVo withSubTaskCaseStartTime(OffsetDateTime subTaskCaseStartTime) {
        this.subTaskCaseStartTime = subTaskCaseStartTime;
        return this;
    }

    /**
     * 子任务用例开始时间
     * @return subTaskCaseStartTime
     */
    public OffsetDateTime getSubTaskCaseStartTime() {
        return subTaskCaseStartTime;
    }

    public void setSubTaskCaseStartTime(OffsetDateTime subTaskCaseStartTime) {
        this.subTaskCaseStartTime = subTaskCaseStartTime;
    }

    public MsgInfoVo withSubTaskId(String subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }

    /**
     * 子任务id
     * @return subTaskId
     */
    public String getSubTaskId() {
        return subTaskId;
    }

    public void setSubTaskId(String subTaskId) {
        this.subTaskId = subTaskId;
    }

    public MsgInfoVo withSubTaskStartTime(OffsetDateTime subTaskStartTime) {
        this.subTaskStartTime = subTaskStartTime;
        return this;
    }

    /**
     * 子任务开始时间
     * @return subTaskStartTime
     */
    public OffsetDateTime getSubTaskStartTime() {
        return subTaskStartTime;
    }

    public void setSubTaskStartTime(OffsetDateTime subTaskStartTime) {
        this.subTaskStartTime = subTaskStartTime;
    }

    public MsgInfoVo withTaskId(String taskId) {
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

    public MsgInfoVo withTaskName(String taskName) {
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

    public MsgInfoVo withTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
        return this;
    }

    /**
     * 用例id
     * @return testCaseId
     */
    public String getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public MsgInfoVo withTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
        return this;
    }

    /**
     * 用例名称
     * @return testCaseName
     */
    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public MsgInfoVo withTestSuiteType(Integer testSuiteType) {
        this.testSuiteType = testSuiteType;
        return this;
    }

    /**
     * 测试套类型
     * @return testSuiteType
     */
    public Integer getTestSuiteType() {
        return testSuiteType;
    }

    public void setTestSuiteType(Integer testSuiteType) {
        this.testSuiteType = testSuiteType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MsgInfoVo that = (MsgInfoVo) obj;
        return Objects.equals(this.alertChannels, that.alertChannels)
            && Objects.equals(this.alertGroups, that.alertGroups) && Objects.equals(this.alertLevel, that.alertLevel)
            && Objects.equals(this.alertNum, that.alertNum) && Objects.equals(this.alertTime, that.alertTime)
            && Objects.equals(this.alertType, that.alertType) && Objects.equals(this.content, that.content)
            && Objects.equals(this.id, that.id) && Objects.equals(this.link, that.link)
            && Objects.equals(this.locationNames, that.locationNames)
            && Objects.equals(this.sendAlertType, that.sendAlertType)
            && Objects.equals(this.subTaskCaseId, that.subTaskCaseId)
            && Objects.equals(this.subTaskCaseStartTime, that.subTaskCaseStartTime)
            && Objects.equals(this.subTaskId, that.subTaskId)
            && Objects.equals(this.subTaskStartTime, that.subTaskStartTime) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.testCaseId, that.testCaseId)
            && Objects.equals(this.testCaseName, that.testCaseName)
            && Objects.equals(this.testSuiteType, that.testSuiteType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertChannels,
            alertGroups,
            alertLevel,
            alertNum,
            alertTime,
            alertType,
            content,
            id,
            link,
            locationNames,
            sendAlertType,
            subTaskCaseId,
            subTaskCaseStartTime,
            subTaskId,
            subTaskStartTime,
            taskId,
            taskName,
            testCaseId,
            testCaseName,
            testSuiteType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MsgInfoVo {\n");
        sb.append("    alertChannels: ").append(toIndentedString(alertChannels)).append("\n");
        sb.append("    alertGroups: ").append(toIndentedString(alertGroups)).append("\n");
        sb.append("    alertLevel: ").append(toIndentedString(alertLevel)).append("\n");
        sb.append("    alertNum: ").append(toIndentedString(alertNum)).append("\n");
        sb.append("    alertTime: ").append(toIndentedString(alertTime)).append("\n");
        sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    locationNames: ").append(toIndentedString(locationNames)).append("\n");
        sb.append("    sendAlertType: ").append(toIndentedString(sendAlertType)).append("\n");
        sb.append("    subTaskCaseId: ").append(toIndentedString(subTaskCaseId)).append("\n");
        sb.append("    subTaskCaseStartTime: ").append(toIndentedString(subTaskCaseStartTime)).append("\n");
        sb.append("    subTaskId: ").append(toIndentedString(subTaskId)).append("\n");
        sb.append("    subTaskStartTime: ").append(toIndentedString(subTaskStartTime)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    testCaseId: ").append(toIndentedString(testCaseId)).append("\n");
        sb.append("    testCaseName: ").append(toIndentedString(testCaseName)).append("\n");
        sb.append("    testSuiteType: ").append(toIndentedString(testSuiteType)).append("\n");
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
