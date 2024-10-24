package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 日志配置的详细信息
 */
public class LogConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_lts_log")

    private Boolean enableLtsLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_obs_log")

    private Boolean enableObsLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_streams")

    private List<LogStream> logStreams = null;

    public LogConfigInfo withEnableLtsLog(Boolean enableLtsLog) {
        this.enableLtsLog = enableLtsLog;
        return this;
    }

    /**
     * 是否开启日志并记录到LTS,默认不开启
     * @return enableLtsLog
     */
    public Boolean getEnableLtsLog() {
        return enableLtsLog;
    }

    public void setEnableLtsLog(Boolean enableLtsLog) {
        this.enableLtsLog = enableLtsLog;
    }

    public LogConfigInfo withEnableObsLog(Boolean enableObsLog) {
        this.enableObsLog = enableObsLog;
        return this;
    }

    /**
     * 是否开启日志转储到OBS，默认不开启 开启的时候需要先开启日志记录到LTS，否则无法开启。
     * @return enableObsLog
     */
    public Boolean getEnableObsLog() {
        return enableObsLog;
    }

    public void setEnableObsLog(Boolean enableObsLog) {
        this.enableObsLog = enableObsLog;
    }

    public LogConfigInfo withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * 日志存储的OBS路径
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public LogConfigInfo withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public LogConfigInfo withLogStreams(List<LogStream> logStreams) {
        this.logStreams = logStreams;
        return this;
    }

    public LogConfigInfo addLogStreamsItem(LogStream logStreamsItem) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        this.logStreams.add(logStreamsItem);
        return this;
    }

    public LogConfigInfo withLogStreams(Consumer<List<LogStream>> logStreamsSetter) {
        if (this.logStreams == null) {
            this.logStreams = new ArrayList<>();
        }
        logStreamsSetter.accept(this.logStreams);
        return this;
    }

    /**
     * 日志流ID集合
     * @return logStreams
     */
    public List<LogStream> getLogStreams() {
        return logStreams;
    }

    public void setLogStreams(List<LogStream> logStreams) {
        this.logStreams = logStreams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogConfigInfo that = (LogConfigInfo) obj;
        return Objects.equals(this.enableLtsLog, that.enableLtsLog)
            && Objects.equals(this.enableObsLog, that.enableObsLog) && Objects.equals(this.obsPath, that.obsPath)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logStreams, that.logStreams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableLtsLog, enableObsLog, obsPath, logGroupId, logStreams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogConfigInfo {\n");
        sb.append("    enableLtsLog: ").append(toIndentedString(enableLtsLog)).append("\n");
        sb.append("    enableObsLog: ").append(toIndentedString(enableObsLog)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreams: ").append(toIndentedString(logStreams)).append("\n");
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
