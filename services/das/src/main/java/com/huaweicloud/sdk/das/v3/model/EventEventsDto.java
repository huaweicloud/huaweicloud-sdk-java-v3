package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * binlog事件概览信息
 */
public class EventEventsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_name")

    private String logName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pos")

    private Long pos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_log_pos")

    private Long endLogPos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    public EventEventsDto withLogName(String logName) {
        this.logName = logName;
        return this;
    }

    /**
     * 文件名称
     * @return logName
     */
    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public EventEventsDto withPos(Long pos) {
        this.pos = pos;
        return this;
    }

    /**
     * 位置
     * @return pos
     */
    public Long getPos() {
        return pos;
    }

    public void setPos(Long pos) {
        this.pos = pos;
    }

    public EventEventsDto withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public EventEventsDto withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public EventEventsDto withEndLogPos(Long endLogPos) {
        this.endLogPos = endLogPos;
        return this;
    }

    /**
     * 结束位置
     * @return endLogPos
     */
    public Long getEndLogPos() {
        return endLogPos;
    }

    public void setEndLogPos(Long endLogPos) {
        this.endLogPos = endLogPos;
    }

    public EventEventsDto withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * 信息
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventEventsDto that = (EventEventsDto) obj;
        return Objects.equals(this.logName, that.logName) && Objects.equals(this.pos, that.pos)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.endLogPos, that.endLogPos) && Objects.equals(this.info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logName, pos, eventType, serverId, endLogPos, info);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventEventsDto {\n");
        sb.append("    logName: ").append(toIndentedString(logName)).append("\n");
        sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    endLogPos: ").append(toIndentedString(endLogPos)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
