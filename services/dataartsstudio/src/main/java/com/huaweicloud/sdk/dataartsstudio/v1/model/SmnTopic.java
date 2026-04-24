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
 * SmnTopic
 */
public class SmnTopic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    /**
     * 告警方式：主题、责任人，值班表和钉钉机器人。
     */
    public static final class NotifyMethodEnum {

        /**
         * Enum SUBJECT for value: "SUBJECT"
         */
        public static final NotifyMethodEnum SUBJECT = new NotifyMethodEnum("SUBJECT");

        /**
         * Enum OWNER for value: "OWNER"
         */
        public static final NotifyMethodEnum OWNER = new NotifyMethodEnum("OWNER");

        /**
         * Enum DUTY_SCHEDULE for value: "DUTY_SCHEDULE"
         */
        public static final NotifyMethodEnum DUTY_SCHEDULE = new NotifyMethodEnum("DUTY_SCHEDULE");

        /**
         * Enum SUBJECT_OWNER for value: "SUBJECT_OWNER"
         */
        public static final NotifyMethodEnum SUBJECT_OWNER = new NotifyMethodEnum("SUBJECT_OWNER");

        /**
         * Enum SUBJECT_DUTY for value: "SUBJECT_DUTY"
         */
        public static final NotifyMethodEnum SUBJECT_DUTY = new NotifyMethodEnum("SUBJECT_DUTY");

        /**
         * Enum DINGDING for value: "DINGDING"
         */
        public static final NotifyMethodEnum DINGDING = new NotifyMethodEnum("DINGDING");

        private static final Map<String, NotifyMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotifyMethodEnum> createStaticFields() {
            Map<String, NotifyMethodEnum> map = new HashMap<>();
            map.put("SUBJECT", SUBJECT);
            map.put("OWNER", OWNER);
            map.put("DUTY_SCHEDULE", DUTY_SCHEDULE);
            map.put("SUBJECT_OWNER", SUBJECT_OWNER);
            map.put("SUBJECT_DUTY", SUBJECT_DUTY);
            map.put("DINGDING", DINGDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotifyMethodEnum(String value) {
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
        public static NotifyMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotifyMethodEnum(value));
        }

        public static NotifyMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotifyMethodEnum) {
                return this.value.equals(((NotifyMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_method")

    private NotifyMethodEnum notifyMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_persons")

    private String otherPersons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_send_times")

    private Integer maxSendTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_interval")

    private Integer sendInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duty_schedule_id")

    private Long dutyScheduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duty_schedule_name")

    private String dutyScheduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_config_id")

    private String smnConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_config_name")

    private String smnConfigName;

    public SmnTopic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SmnTopic withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * smn urn。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public SmnTopic withNotifyMethod(NotifyMethodEnum notifyMethod) {
        this.notifyMethod = notifyMethod;
        return this;
    }

    /**
     * 告警方式：主题、责任人，值班表和钉钉机器人。
     * @return notifyMethod
     */
    public NotifyMethodEnum getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(NotifyMethodEnum notifyMethod) {
        this.notifyMethod = notifyMethod;
    }

    public SmnTopic withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 告警协议：短信、邮件、电话，示例：[\"email\"]  \"email\"：邮件传输协议,\"sms\"：短信传输协议,\"callnotify\":语音, \"dingding\":个人钉钉。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public SmnTopic withOtherPersons(String otherPersons) {
        this.otherPersons = otherPersons;
        return this;
    }

    /**
     * 抄送人，示例：[\"lin\",\"hua\"]。
     * @return otherPersons
     */
    public String getOtherPersons() {
        return otherPersons;
    }

    public void setOtherPersons(String otherPersons) {
        this.otherPersons = otherPersons;
    }

    public SmnTopic withMaxSendTimes(Integer maxSendTimes) {
        this.maxSendTimes = maxSendTimes;
        return this;
    }

    /**
     * 最大告警次数。
     * @return maxSendTimes
     */
    public Integer getMaxSendTimes() {
        return maxSendTimes;
    }

    public void setMaxSendTimes(Integer maxSendTimes) {
        this.maxSendTimes = maxSendTimes;
    }

    public SmnTopic withSendInterval(Integer sendInterval) {
        this.sendInterval = sendInterval;
        return this;
    }

    /**
     * 告警间隔。
     * @return sendInterval
     */
    public Integer getSendInterval() {
        return sendInterval;
    }

    public void setSendInterval(Integer sendInterval) {
        this.sendInterval = sendInterval;
    }

    public SmnTopic withDutyScheduleId(Long dutyScheduleId) {
        this.dutyScheduleId = dutyScheduleId;
        return this;
    }

    /**
     * 值班表id。
     * @return dutyScheduleId
     */
    public Long getDutyScheduleId() {
        return dutyScheduleId;
    }

    public void setDutyScheduleId(Long dutyScheduleId) {
        this.dutyScheduleId = dutyScheduleId;
    }

    public SmnTopic withDutyScheduleName(String dutyScheduleName) {
        this.dutyScheduleName = dutyScheduleName;
        return this;
    }

    /**
     * 值班表名称。
     * @return dutyScheduleName
     */
    public String getDutyScheduleName() {
        return dutyScheduleName;
    }

    public void setDutyScheduleName(String dutyScheduleName) {
        this.dutyScheduleName = dutyScheduleName;
    }

    public SmnTopic withSmnConfigId(String smnConfigId) {
        this.smnConfigId = smnConfigId;
        return this;
    }

    /**
     * 机器人id。
     * @return smnConfigId
     */
    public String getSmnConfigId() {
        return smnConfigId;
    }

    public void setSmnConfigId(String smnConfigId) {
        this.smnConfigId = smnConfigId;
    }

    public SmnTopic withSmnConfigName(String smnConfigName) {
        this.smnConfigName = smnConfigName;
        return this;
    }

    /**
     * 机器人名称。
     * @return smnConfigName
     */
    public String getSmnConfigName() {
        return smnConfigName;
    }

    public void setSmnConfigName(String smnConfigName) {
        this.smnConfigName = smnConfigName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmnTopic that = (SmnTopic) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.notifyMethod, that.notifyMethod) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.otherPersons, that.otherPersons)
            && Objects.equals(this.maxSendTimes, that.maxSendTimes)
            && Objects.equals(this.sendInterval, that.sendInterval)
            && Objects.equals(this.dutyScheduleId, that.dutyScheduleId)
            && Objects.equals(this.dutyScheduleName, that.dutyScheduleName)
            && Objects.equals(this.smnConfigId, that.smnConfigId)
            && Objects.equals(this.smnConfigName, that.smnConfigName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            urn,
            notifyMethod,
            protocol,
            otherPersons,
            maxSendTimes,
            sendInterval,
            dutyScheduleId,
            dutyScheduleName,
            smnConfigId,
            smnConfigName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnTopic {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    notifyMethod: ").append(toIndentedString(notifyMethod)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    otherPersons: ").append(toIndentedString(otherPersons)).append("\n");
        sb.append("    maxSendTimes: ").append(toIndentedString(maxSendTimes)).append("\n");
        sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
        sb.append("    dutyScheduleId: ").append(toIndentedString(dutyScheduleId)).append("\n");
        sb.append("    dutyScheduleName: ").append(toIndentedString(dutyScheduleName)).append("\n");
        sb.append("    smnConfigId: ").append(toIndentedString(smnConfigId)).append("\n");
        sb.append("    smnConfigName: ").append(toIndentedString(smnConfigName)).append("\n");
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
