package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmnTopicRequest
 */
public class SmnTopicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_method")

    private String notifyMethod;

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
    @JsonProperty(value = "duty_schedule_name")

    private String dutyScheduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_config_name")

    private String smnConfigName;

    public SmnTopicRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主题名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SmnTopicRequest withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * smn urn，可以在SMN服务查看对应主题的urn。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public SmnTopicRequest withNotifyMethod(String notifyMethod) {
        this.notifyMethod = notifyMethod;
        return this;
    }

    /**
     * 告警方式：主题、责任人、值班表和钉钉机器人，取值如下： - SUBJECT: 主题 - OWNER： 责任人 - DUTY_SCHEDULE: 值班表 - DINGDING: 钉钉机器人
     * @return notifyMethod
     */
    public String getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(String notifyMethod) {
        this.notifyMethod = notifyMethod;
    }

    public SmnTopicRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 告警协议：短信、邮件、电话，示例：[\"email\"] \"email\"：邮件传输协议,\"sms\"：短信传输协议,\"callnotify\":语音, \"dingding\":个人钉钉。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public SmnTopicRequest withOtherPersons(String otherPersons) {
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

    public SmnTopicRequest withMaxSendTimes(Integer maxSendTimes) {
        this.maxSendTimes = maxSendTimes;
        return this;
    }

    /**
     * 最大告警次数，取值为 [1, 50]。
     * @return maxSendTimes
     */
    public Integer getMaxSendTimes() {
        return maxSendTimes;
    }

    public void setMaxSendTimes(Integer maxSendTimes) {
        this.maxSendTimes = maxSendTimes;
    }

    public SmnTopicRequest withSendInterval(Integer sendInterval) {
        this.sendInterval = sendInterval;
        return this;
    }

    /**
     * 告警间隔，取值为[5, 60]，单位：分钟。
     * @return sendInterval
     */
    public Integer getSendInterval() {
        return sendInterval;
    }

    public void setSendInterval(Integer sendInterval) {
        this.sendInterval = sendInterval;
    }

    public SmnTopicRequest withDutyScheduleName(String dutyScheduleName) {
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

    public SmnTopicRequest withSmnConfigName(String smnConfigName) {
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
        SmnTopicRequest that = (SmnTopicRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.notifyMethod, that.notifyMethod) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.otherPersons, that.otherPersons)
            && Objects.equals(this.maxSendTimes, that.maxSendTimes)
            && Objects.equals(this.sendInterval, that.sendInterval)
            && Objects.equals(this.dutyScheduleName, that.dutyScheduleName)
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
            dutyScheduleName,
            smnConfigName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnTopicRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    notifyMethod: ").append(toIndentedString(notifyMethod)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    otherPersons: ").append(toIndentedString(otherPersons)).append("\n");
        sb.append("    maxSendTimes: ").append(toIndentedString(maxSendTimes)).append("\n");
        sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
        sb.append("    dutyScheduleName: ").append(toIndentedString(dutyScheduleName)).append("\n");
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
