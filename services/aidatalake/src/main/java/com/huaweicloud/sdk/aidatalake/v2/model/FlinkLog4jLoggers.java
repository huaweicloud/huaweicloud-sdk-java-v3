package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：类日志级别配置，用于为指定类设置特定的日志级别。 **约束限制**：不涉及。 
 */
public class FlinkLog4jLoggers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_name")

    private String loggerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_level")

    private FlinkLoggerLevel loggerLevel;

    public FlinkLog4jLoggers withLoggerName(String loggerName) {
        this.loggerName = loggerName;
        return this;
    }

    /**
     * **参数解释**：输出日志类的名称，用于指定需要配置日志级别的类。 **约束限制**：不涉及。 **取值范围**：1~256个字符，字符组成不限制。 **默认取值**：不涉及。 
     * @return loggerName
     */
    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public FlinkLog4jLoggers withLoggerLevel(FlinkLoggerLevel loggerLevel) {
        this.loggerLevel = loggerLevel;
        return this;
    }

    /**
     * Get loggerLevel
     * @return loggerLevel
     */
    public FlinkLoggerLevel getLoggerLevel() {
        return loggerLevel;
    }

    public void setLoggerLevel(FlinkLoggerLevel loggerLevel) {
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
        FlinkLog4jLoggers that = (FlinkLog4jLoggers) obj;
        return Objects.equals(this.loggerName, that.loggerName) && Objects.equals(this.loggerLevel, that.loggerLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggerName, loggerLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkLog4jLoggers {\n");
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
