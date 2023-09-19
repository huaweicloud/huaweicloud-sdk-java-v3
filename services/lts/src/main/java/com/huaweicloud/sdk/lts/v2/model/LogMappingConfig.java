package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LogMappingConfig
 */
public class LogMappingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_log_group_id")

    private String sourceLogGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_group_id")

    private String targetLogGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_group_name")

    private String targetLogGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_config")

    private List<LogMappingStreamInfo> logStreamConfig = null;

    public LogMappingConfig withSourceLogGroupId(String sourceLogGroupId) {
        this.sourceLogGroupId = sourceLogGroupId;
        return this;
    }

    /**
     * 源日志组ID
     * @return sourceLogGroupId
     */
    public String getSourceLogGroupId() {
        return sourceLogGroupId;
    }

    public void setSourceLogGroupId(String sourceLogGroupId) {
        this.sourceLogGroupId = sourceLogGroupId;
    }

    public LogMappingConfig withTargetLogGroupId(String targetLogGroupId) {
        this.targetLogGroupId = targetLogGroupId;
        return this;
    }

    /**
     * 目标日志组ID
     * @return targetLogGroupId
     */
    public String getTargetLogGroupId() {
        return targetLogGroupId;
    }

    public void setTargetLogGroupId(String targetLogGroupId) {
        this.targetLogGroupId = targetLogGroupId;
    }

    public LogMappingConfig withTargetLogGroupName(String targetLogGroupName) {
        this.targetLogGroupName = targetLogGroupName;
        return this;
    }

    /**
     * 目标日志组名称
     * @return targetLogGroupName
     */
    public String getTargetLogGroupName() {
        return targetLogGroupName;
    }

    public void setTargetLogGroupName(String targetLogGroupName) {
        this.targetLogGroupName = targetLogGroupName;
    }

    public LogMappingConfig withLogStreamConfig(List<LogMappingStreamInfo> logStreamConfig) {
        this.logStreamConfig = logStreamConfig;
        return this;
    }

    public LogMappingConfig addLogStreamConfigItem(LogMappingStreamInfo logStreamConfigItem) {
        if (this.logStreamConfig == null) {
            this.logStreamConfig = new ArrayList<>();
        }
        this.logStreamConfig.add(logStreamConfigItem);
        return this;
    }

    public LogMappingConfig withLogStreamConfig(Consumer<List<LogMappingStreamInfo>> logStreamConfigSetter) {
        if (this.logStreamConfig == null) {
            this.logStreamConfig = new ArrayList<>();
        }
        logStreamConfigSetter.accept(this.logStreamConfig);
        return this;
    }

    /**
     * 日志流配置
     * @return logStreamConfig
     */
    public List<LogMappingStreamInfo> getLogStreamConfig() {
        return logStreamConfig;
    }

    public void setLogStreamConfig(List<LogMappingStreamInfo> logStreamConfig) {
        this.logStreamConfig = logStreamConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogMappingConfig that = (LogMappingConfig) obj;
        return Objects.equals(this.sourceLogGroupId, that.sourceLogGroupId)
            && Objects.equals(this.targetLogGroupId, that.targetLogGroupId)
            && Objects.equals(this.targetLogGroupName, that.targetLogGroupName)
            && Objects.equals(this.logStreamConfig, that.logStreamConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceLogGroupId, targetLogGroupId, targetLogGroupName, logStreamConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogMappingConfig {\n");
        sb.append("    sourceLogGroupId: ").append(toIndentedString(sourceLogGroupId)).append("\n");
        sb.append("    targetLogGroupId: ").append(toIndentedString(targetLogGroupId)).append("\n");
        sb.append("    targetLogGroupName: ").append(toIndentedString(targetLogGroupName)).append("\n");
        sb.append("    logStreamConfig: ").append(toIndentedString(logStreamConfig)).append("\n");
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
