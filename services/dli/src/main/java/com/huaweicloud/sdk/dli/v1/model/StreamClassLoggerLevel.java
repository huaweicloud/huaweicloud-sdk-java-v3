package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 输出日志的类名称对应的日志级别配置。
 */
public class StreamClassLoggerLevel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_name")

    private String loggerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_level")

    private String loggerLevel;

    public StreamClassLoggerLevel withLoggerName(String loggerName) {
        this.loggerName = loggerName;
        return this;
    }

    /**
     * 输出日志的类的名称。
     * @return loggerName
     */
    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public StreamClassLoggerLevel withLoggerLevel(String loggerLevel) {
        this.loggerLevel = loggerLevel;
        return this;
    }

    /**
     * 输出日志的级别，DEBUG\\TRACE\\WARNNING\\INFO\\ERROR。
     * @return loggerLevel
     */
    public String getLoggerLevel() {
        return loggerLevel;
    }

    public void setLoggerLevel(String loggerLevel) {
        this.loggerLevel = loggerLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamClassLoggerLevel that = (StreamClassLoggerLevel) obj;
        return Objects.equals(this.loggerName, that.loggerName) && Objects.equals(this.loggerLevel, that.loggerLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggerName, loggerLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamClassLoggerLevel {\n");
        sb.append("    loggerName: ").append(toIndentedString(loggerName)).append("\n");
        sb.append("    loggerLevel: ").append(toIndentedString(loggerLevel)).append("\n");
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
