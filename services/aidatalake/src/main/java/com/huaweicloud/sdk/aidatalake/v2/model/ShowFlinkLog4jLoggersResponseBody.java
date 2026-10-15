package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：类日志级别配置，包含指定类的日志级别配置。
 */
public class ShowFlinkLog4jLoggersResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_name")

    private String loggerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_level")

    private FlinkLoggerLevel loggerLevel;

    public ShowFlinkLog4jLoggersResponseBody withLoggerName(String loggerName) {
        this.loggerName = loggerName;
        return this;
    }

    /**
     * **参数解释**：日志类名称。 **取值范围**：1~256个字符。 
     * @return loggerName
     */
    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public ShowFlinkLog4jLoggersResponseBody withLoggerLevel(FlinkLoggerLevel loggerLevel) {
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
        ShowFlinkLog4jLoggersResponseBody that = (ShowFlinkLog4jLoggersResponseBody) obj;
        return Objects.equals(this.loggerName, that.loggerName) && Objects.equals(this.loggerLevel, that.loggerLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggerName, loggerLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkLog4jLoggersResponseBody {\n");
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
