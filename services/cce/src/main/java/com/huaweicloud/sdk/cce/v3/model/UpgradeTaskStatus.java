package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 升级任务状态信息
 */
public class UpgradeTaskStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completionTime")

    private String completionTime;

    public UpgradeTaskStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 升级任务状态. > Init：初始化 > Queuing：等待 > Running：运行中 > Pause：暂停 > Success：成功 > Failed：失败 
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public UpgradeTaskStatus withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 升级任务进度
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public UpgradeTaskStatus withCompletionTime(String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * 升级任务结束时间
     * @return completionTime
     */
    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpgradeTaskStatus upgradeTaskStatus = (UpgradeTaskStatus) o;
        return Objects.equals(this.phase, upgradeTaskStatus.phase)
            && Objects.equals(this.progress, upgradeTaskStatus.progress)
            && Objects.equals(this.completionTime, upgradeTaskStatus.completionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, progress, completionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeTaskStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
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
