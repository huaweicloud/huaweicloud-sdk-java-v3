package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Ray日志配置
 */
public class LogConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_lts_log")

    private Boolean enableLtsLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_obs_log")

    private Boolean enableObsLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    public LogConfig withEnableLtsLog(Boolean enableLtsLog) {
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

    public LogConfig withEnableObsLog(Boolean enableObsLog) {
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

    public LogConfig withObsPath(String obsPath) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogConfig that = (LogConfig) obj;
        return Objects.equals(this.enableLtsLog, that.enableLtsLog)
            && Objects.equals(this.enableObsLog, that.enableObsLog) && Objects.equals(this.obsPath, that.obsPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableLtsLog, enableObsLog, obsPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogConfig {\n");
        sb.append("    enableLtsLog: ").append(toIndentedString(enableLtsLog)).append("\n");
        sb.append("    enableObsLog: ").append(toIndentedString(enableObsLog)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
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
