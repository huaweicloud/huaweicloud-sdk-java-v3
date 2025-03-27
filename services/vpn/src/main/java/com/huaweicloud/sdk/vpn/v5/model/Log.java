package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Log
 */
public class Log {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_message")

    private String rawMessage;

    public Log withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 时间戳
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Log withRawMessage(String rawMessage) {
        this.rawMessage = rawMessage;
        return this;
    }

    /**
     * 日志信息
     * @return rawMessage
     */
    public String getRawMessage() {
        return rawMessage;
    }

    public void setRawMessage(String rawMessage) {
        this.rawMessage = rawMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Log that = (Log) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.rawMessage, that.rawMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, rawMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Log {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    rawMessage: ").append(toIndentedString(rawMessage)).append("\n");
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
