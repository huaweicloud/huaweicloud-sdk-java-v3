package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流日志配置。
 */
public class StreamLoggingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_enabled")

    private Boolean logEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_logger_level")

    private String rootLoggerLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loggers_level_of_class")

    private List<StreamClassLoggerLevel> loggersLevelOfClass = null;

    public StreamLoggingConfig withLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
        return this;
    }

    /**
     * 是否开启作业的日志上传到用户的 OBS 功能。默认为 false。
     * @return logEnabled
     */
    public Boolean getLogEnabled() {
        return logEnabled;
    }

    public void setLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
    }

    public StreamLoggingConfig withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * 用户授权保存作业日志的 OBS 桶名。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public StreamLoggingConfig withRootLoggerLevel(String rootLoggerLevel) {
        this.rootLoggerLevel = rootLoggerLevel;
        return this;
    }

    /**
     * 根目录日志级别配置，DEBUG\\TRACE\\WARNNING\\INFO\\ERROR
     * @return rootLoggerLevel
     */
    public String getRootLoggerLevel() {
        return rootLoggerLevel;
    }

    public void setRootLoggerLevel(String rootLoggerLevel) {
        this.rootLoggerLevel = rootLoggerLevel;
    }

    public StreamLoggingConfig withLoggersLevelOfClass(List<StreamClassLoggerLevel> loggersLevelOfClass) {
        this.loggersLevelOfClass = loggersLevelOfClass;
        return this;
    }

    public StreamLoggingConfig addLoggersLevelOfClassItem(StreamClassLoggerLevel loggersLevelOfClassItem) {
        if (this.loggersLevelOfClass == null) {
            this.loggersLevelOfClass = new ArrayList<>();
        }
        this.loggersLevelOfClass.add(loggersLevelOfClassItem);
        return this;
    }

    public StreamLoggingConfig withLoggersLevelOfClass(
        Consumer<List<StreamClassLoggerLevel>> loggersLevelOfClassSetter) {
        if (this.loggersLevelOfClass == null) {
            this.loggersLevelOfClass = new ArrayList<>();
        }
        loggersLevelOfClassSetter.accept(this.loggersLevelOfClass);
        return this;
    }

    /**
     * 输出日志的类名称对应的日志级别配置。
     * @return loggersLevelOfClass
     */
    public List<StreamClassLoggerLevel> getLoggersLevelOfClass() {
        return loggersLevelOfClass;
    }

    public void setLoggersLevelOfClass(List<StreamClassLoggerLevel> loggersLevelOfClass) {
        this.loggersLevelOfClass = loggersLevelOfClass;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamLoggingConfig that = (StreamLoggingConfig) obj;
        return Objects.equals(this.logEnabled, that.logEnabled) && Objects.equals(this.obsBucket, that.obsBucket)
            && Objects.equals(this.rootLoggerLevel, that.rootLoggerLevel)
            && Objects.equals(this.loggersLevelOfClass, that.loggersLevelOfClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logEnabled, obsBucket, rootLoggerLevel, loggersLevelOfClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamLoggingConfig {\n");
        sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    rootLoggerLevel: ").append(toIndentedString(rootLoggerLevel)).append("\n");
        sb.append("    loggersLevelOfClass: ").append(toIndentedString(loggersLevelOfClass)).append("\n");
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
