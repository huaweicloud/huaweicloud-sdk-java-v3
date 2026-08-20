package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：日志配置信息，包含Driver和Executor的日志级别配置。 
 */
public class ShowSparkLoggingConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_root_logger_level")

    private LogLevel driverRootLoggerLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_loggers_level_of_class")

    private List<ShowSparkClassLoggerLevelResponse> driverLoggersLevelOfClass = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_root_logger_level")

    private LogLevel executorRootLoggerLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_loggers_level_of_class")

    private List<ShowSparkClassLoggerLevelResponse> executorLoggersLevelOfClass = null;

    public ShowSparkLoggingConfigResponse withDriverRootLoggerLevel(LogLevel driverRootLoggerLevel) {
        this.driverRootLoggerLevel = driverRootLoggerLevel;
        return this;
    }

    /**
     * Get driverRootLoggerLevel
     * @return driverRootLoggerLevel
     */
    public LogLevel getDriverRootLoggerLevel() {
        return driverRootLoggerLevel;
    }

    public void setDriverRootLoggerLevel(LogLevel driverRootLoggerLevel) {
        this.driverRootLoggerLevel = driverRootLoggerLevel;
    }

    public ShowSparkLoggingConfigResponse withDriverLoggersLevelOfClass(
        List<ShowSparkClassLoggerLevelResponse> driverLoggersLevelOfClass) {
        this.driverLoggersLevelOfClass = driverLoggersLevelOfClass;
        return this;
    }

    public ShowSparkLoggingConfigResponse addDriverLoggersLevelOfClassItem(
        ShowSparkClassLoggerLevelResponse driverLoggersLevelOfClassItem) {
        if (this.driverLoggersLevelOfClass == null) {
            this.driverLoggersLevelOfClass = new ArrayList<>();
        }
        this.driverLoggersLevelOfClass.add(driverLoggersLevelOfClassItem);
        return this;
    }

    public ShowSparkLoggingConfigResponse withDriverLoggersLevelOfClass(
        Consumer<List<ShowSparkClassLoggerLevelResponse>> driverLoggersLevelOfClassSetter) {
        if (this.driverLoggersLevelOfClass == null) {
            this.driverLoggersLevelOfClass = new ArrayList<>();
        }
        driverLoggersLevelOfClassSetter.accept(this.driverLoggersLevelOfClass);
        return this;
    }

    /**
     * **参数解释**：Driver类日志级别配置列表，用于为指定类设置特定的日志级别。 
     * @return driverLoggersLevelOfClass
     */
    public List<ShowSparkClassLoggerLevelResponse> getDriverLoggersLevelOfClass() {
        return driverLoggersLevelOfClass;
    }

    public void setDriverLoggersLevelOfClass(List<ShowSparkClassLoggerLevelResponse> driverLoggersLevelOfClass) {
        this.driverLoggersLevelOfClass = driverLoggersLevelOfClass;
    }

    public ShowSparkLoggingConfigResponse withExecutorRootLoggerLevel(LogLevel executorRootLoggerLevel) {
        this.executorRootLoggerLevel = executorRootLoggerLevel;
        return this;
    }

    /**
     * Get executorRootLoggerLevel
     * @return executorRootLoggerLevel
     */
    public LogLevel getExecutorRootLoggerLevel() {
        return executorRootLoggerLevel;
    }

    public void setExecutorRootLoggerLevel(LogLevel executorRootLoggerLevel) {
        this.executorRootLoggerLevel = executorRootLoggerLevel;
    }

    public ShowSparkLoggingConfigResponse withExecutorLoggersLevelOfClass(
        List<ShowSparkClassLoggerLevelResponse> executorLoggersLevelOfClass) {
        this.executorLoggersLevelOfClass = executorLoggersLevelOfClass;
        return this;
    }

    public ShowSparkLoggingConfigResponse addExecutorLoggersLevelOfClassItem(
        ShowSparkClassLoggerLevelResponse executorLoggersLevelOfClassItem) {
        if (this.executorLoggersLevelOfClass == null) {
            this.executorLoggersLevelOfClass = new ArrayList<>();
        }
        this.executorLoggersLevelOfClass.add(executorLoggersLevelOfClassItem);
        return this;
    }

    public ShowSparkLoggingConfigResponse withExecutorLoggersLevelOfClass(
        Consumer<List<ShowSparkClassLoggerLevelResponse>> executorLoggersLevelOfClassSetter) {
        if (this.executorLoggersLevelOfClass == null) {
            this.executorLoggersLevelOfClass = new ArrayList<>();
        }
        executorLoggersLevelOfClassSetter.accept(this.executorLoggersLevelOfClass);
        return this;
    }

    /**
     * **参数解释**：Executor类日志级别配置列表，用于为指定类设置特定的日志级别。 
     * @return executorLoggersLevelOfClass
     */
    public List<ShowSparkClassLoggerLevelResponse> getExecutorLoggersLevelOfClass() {
        return executorLoggersLevelOfClass;
    }

    public void setExecutorLoggersLevelOfClass(List<ShowSparkClassLoggerLevelResponse> executorLoggersLevelOfClass) {
        this.executorLoggersLevelOfClass = executorLoggersLevelOfClass;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkLoggingConfigResponse that = (ShowSparkLoggingConfigResponse) obj;
        return Objects.equals(this.driverRootLoggerLevel, that.driverRootLoggerLevel)
            && Objects.equals(this.driverLoggersLevelOfClass, that.driverLoggersLevelOfClass)
            && Objects.equals(this.executorRootLoggerLevel, that.executorRootLoggerLevel)
            && Objects.equals(this.executorLoggersLevelOfClass, that.executorLoggersLevelOfClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverRootLoggerLevel,
            driverLoggersLevelOfClass,
            executorRootLoggerLevel,
            executorLoggersLevelOfClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkLoggingConfigResponse {\n");
        sb.append("    driverRootLoggerLevel: ").append(toIndentedString(driverRootLoggerLevel)).append("\n");
        sb.append("    driverLoggersLevelOfClass: ").append(toIndentedString(driverLoggersLevelOfClass)).append("\n");
        sb.append("    executorRootLoggerLevel: ").append(toIndentedString(executorRootLoggerLevel)).append("\n");
        sb.append("    executorLoggersLevelOfClass: ")
            .append(toIndentedString(executorLoggersLevelOfClass))
            .append("\n");
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
