package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练作业日志输出信息。
 */
public class LogExportPathResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_url")

    private String obsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_path")

    private String hostPath;

    public LogExportPathResp withObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
        return this;
    }

    /**
     * **参数解释**：训练作业日志保存的OBS地址，如：“obs://example/path”。 **取值范围**：不涉及。
     * @return obsUrl
     */
    public String getObsUrl() {
        return obsUrl;
    }

    public void setObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
    }

    public LogExportPathResp withHostPath(String hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * **参数解释**：训练作业日志保存的宿主机的路径，如：“/example/path”。 **取值范围**：不涉及。
     * @return hostPath
     */
    public String getHostPath() {
        return hostPath;
    }

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogExportPathResp that = (LogExportPathResp) obj;
        return Objects.equals(this.obsUrl, that.obsUrl) && Objects.equals(this.hostPath, that.hostPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsUrl, hostPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogExportPathResp {\n");
        sb.append("    obsUrl: ").append(toIndentedString(obsUrl)).append("\n");
        sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
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
