package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：类级别日志配置，用于配置指定类的日志级别。 **约束限制**：不涉及。 
 */
public class SparkClassLoggerLevel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_name")

    private String loggerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_level")

    private LogLevel loggerLevel;

    public SparkClassLoggerLevel withLoggerName(String loggerName) {
        this.loggerName = loggerName;
        return this;
    }

    /**
     * **参数解释**：日志类名称，用于指定需要配置日志级别的类名。 **约束限制**：不涉及。 **取值范围**：长度为1~256个字符。 **默认取值**：不涉及。 
     * @return loggerName
     */
    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public SparkClassLoggerLevel withLoggerLevel(LogLevel loggerLevel) {
        this.loggerLevel = loggerLevel;
        return this;
    }

    /**
     * Get loggerLevel
     * @return loggerLevel
     */
    public LogLevel getLoggerLevel() {
        return loggerLevel;
    }

    public void setLoggerLevel(LogLevel loggerLevel) {
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
        SparkClassLoggerLevel that = (SparkClassLoggerLevel) obj;
        return Objects.equals(this.loggerName, that.loggerName) && Objects.equals(this.loggerLevel, that.loggerLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggerName, loggerLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkClassLoggerLevel {\n");
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
