package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubTemplateResBody
 */
public class SubTemplateResBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_type")

    private String subType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendType")

    private String sendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public SubTemplateResBody withSubType(String subType) {
        this.subType = subType;
        return this;
    }

    /**
     * **参数解释：**  消息模板的通知渠道。 **取值范围：**  - sms - dingding - wechat - webhook - email - voice - feishu - welink
     * @return subType
     */
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public SubTemplateResBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释：**  对应通知渠道的消息模板正文，$符号后所跟变量仅支持以下变量，根据不同告警类型（关键词告警和sql告警），所支持的变量亦不相同。目前两种告警类型有共同变量如下： 告警级别：${event_severity}; 发生时间：${starts_at}; 告警源：$event.metadata.resource_provider; 资源类型：$event.metadata.resource_type; 资源标识：${resources}; 统计类型：关键词统计; 表达式：$event.annotations.condition_expression; 当前值: $event.annotations.current_value; 统计周期：$event.annotations.frequency; 关键词告警特有变量： 查询时间：$event.annotations.results[0].time; 查询日志：$event.annotations.results[0].raw_results; sql告警特有变量： 日志组/流名称：$event.annotations.results[0].resource_id; 查询语句：$event.annotations.results[0].sql; 查询时间：$event.annotations.results[0].time; 查询URL：$event.annotations.results[0].url; 查询日志：$event.annotations.results[0].raw_results;  告警级别：${event_severity}; 发生时间：${starts_at}; 告警源：$event.metadata.resource_provider; 资源类型：$event.metadata.resource_type; 资源标识：${resources}; 统计类型：关键词统计; 表达式：$event.annotations.condition_expression; 当前值: $event.annotations.current_value; 统计周期：$event.annotations.frequency; 关键词告警特有变量： 查询时间：$event.annotations.results[0].time; 查询日志：$event.annotations.results[0].raw_results; sql告警特有变量： 日志组/流名称：$event.annotations.results[0].resource_id; 查询语句：$event.annotations.results[0].sql; 查询时间：$event.annotations.results[0].time; 查询URL：$event.annotations.results[0].url; 查询日志：$event.annotations.results[0].raw_results;   >变量后面的分号\";\"为英文符号，必须添加，否则模板会出现替换失败的情况。  **取值范围：**  不涉及。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public SubTemplateResBody withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释：**  邮件主题。通知渠道为邮件时生效，即sub_type=email。 **取值范围：**  不涉及。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SubTemplateResBody withSendType(String sendType) {
        this.sendType = sendType;
        return this;
    }

    /**
     * **参数解释：**  当消息模板类型为webhook时生效，决定该消息的渲染方式。 **取值范围：**  - HTML - JSON
     * @return sendType
     */
    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public SubTemplateResBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：**  消息模板的适用版本。 **取值范围：**   v1：标识为LTS的消息模板。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTemplateResBody that = (SubTemplateResBody) obj;
        return Objects.equals(this.subType, that.subType) && Objects.equals(this.content, that.content)
            && Objects.equals(this.topic, that.topic) && Objects.equals(this.sendType, that.sendType)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subType, content, topic, sendType, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTemplateResBody {\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    sendType: ").append(toIndentedString(sendType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
