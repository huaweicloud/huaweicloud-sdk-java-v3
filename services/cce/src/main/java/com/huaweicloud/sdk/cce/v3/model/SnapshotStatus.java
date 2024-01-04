package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SnapshotStatus
 */
public class SnapshotStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completionTime")

    private String completionTime;

    public SnapshotStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 任务状态
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public SnapshotStatus withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 任务进度
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public SnapshotStatus withCompletionTime(String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * 完成时间
     * @return completionTime
     */
    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotStatus that = (SnapshotStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.completionTime, that.completionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, progress, completionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotStatus {\n");
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
