package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * smn 消息通知结果
 */
public class SmnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_result")

    @JacksonXmlProperty(localName = "notify_result")

    private Boolean notifyResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_error_message")

    @JacksonXmlProperty(localName = "notify_error_message")

    private String notifyErrorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    @JacksonXmlProperty(localName = "topic_name")

    private String topicName;

    public SmnInfo withNotifyResult(Boolean notifyResult) {
        this.notifyResult = notifyResult;
        return this;
    }

    /**
     * 记录迁移任务执行完毕后SMN消息是否发送成功。
     * @return notifyResult
     */
    public Boolean getNotifyResult() {
        return notifyResult;
    }

    public void setNotifyResult(Boolean notifyResult) {
        this.notifyResult = notifyResult;
    }

    public SmnInfo withNotifyErrorMessage(String notifyErrorMessage) {
        this.notifyErrorMessage = notifyErrorMessage;
        return this;
    }

    /**
     * 记录SMN消息发送失败原因的错误码（迁移任务成功时为空）。
     * @return notifyErrorMessage
     */
    public String getNotifyErrorMessage() {
        return notifyErrorMessage;
    }

    public void setNotifyErrorMessage(String notifyErrorMessage) {
        this.notifyErrorMessage = notifyErrorMessage;
    }

    public SmnInfo withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * SMN Topic的名称（SMN消息发送成功时为空）。
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmnInfo smnInfo = (SmnInfo) o;
        return Objects.equals(this.notifyResult, smnInfo.notifyResult)
            && Objects.equals(this.notifyErrorMessage, smnInfo.notifyErrorMessage)
            && Objects.equals(this.topicName, smnInfo.topicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifyResult, notifyErrorMessage, topicName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnInfo {\n");
        sb.append("    notifyResult: ").append(toIndentedString(notifyResult)).append("\n");
        sb.append("    notifyErrorMessage: ").append(toIndentedString(notifyErrorMessage)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
