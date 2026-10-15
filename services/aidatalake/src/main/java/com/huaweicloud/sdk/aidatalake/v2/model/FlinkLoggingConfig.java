package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Flink作业日志配置，可设置根目录日志级别和自定义日志类级别。 **约束限制**：不涉及。
 */
public class FlinkLoggingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_logger_level")

    private FlinkLoggerLevel rootLoggerLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log4j_loggers")

    private List<FlinkLog4jLoggers> log4jLoggers = null;

    public FlinkLoggingConfig withRootLoggerLevel(FlinkLoggerLevel rootLoggerLevel) {
        this.rootLoggerLevel = rootLoggerLevel;
        return this;
    }

    /**
     * Get rootLoggerLevel
     * @return rootLoggerLevel
     */
    public FlinkLoggerLevel getRootLoggerLevel() {
        return rootLoggerLevel;
    }

    public void setRootLoggerLevel(FlinkLoggerLevel rootLoggerLevel) {
        this.rootLoggerLevel = rootLoggerLevel;
    }

    public FlinkLoggingConfig withLog4jLoggers(List<FlinkLog4jLoggers> log4jLoggers) {
        this.log4jLoggers = log4jLoggers;
        return this;
    }

    public FlinkLoggingConfig addLog4jLoggersItem(FlinkLog4jLoggers log4jLoggersItem) {
        if (this.log4jLoggers == null) {
            this.log4jLoggers = new ArrayList<>();
        }
        this.log4jLoggers.add(log4jLoggersItem);
        return this;
    }

    public FlinkLoggingConfig withLog4jLoggers(Consumer<List<FlinkLog4jLoggers>> log4jLoggersSetter) {
        if (this.log4jLoggers == null) {
            this.log4jLoggers = new ArrayList<>();
        }
        log4jLoggersSetter.accept(this.log4jLoggers);
        return this;
    }

    /**
     * **参数解释**：输出日志类的名称和对应的日志级别配置，用于为指定类设置特定的日志级别。 **约束限制**：配置项数量不能超过20个。
     * @return log4jLoggers
     */
    public List<FlinkLog4jLoggers> getLog4jLoggers() {
        return log4jLoggers;
    }

    public void setLog4jLoggers(List<FlinkLog4jLoggers> log4jLoggers) {
        this.log4jLoggers = log4jLoggers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkLoggingConfig that = (FlinkLoggingConfig) obj;
        return Objects.equals(this.rootLoggerLevel, that.rootLoggerLevel)
            && Objects.equals(this.log4jLoggers, that.log4jLoggers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rootLoggerLevel, log4jLoggers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkLoggingConfig {\n");
        sb.append("    rootLoggerLevel: ").append(toIndentedString(rootLoggerLevel)).append("\n");
        sb.append("    log4jLoggers: ").append(toIndentedString(log4jLoggers)).append("\n");
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
