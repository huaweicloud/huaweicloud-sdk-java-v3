package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SyncStatusStatisticVO
 */
public class SyncStatusStatisticVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private String success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private String failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running")

    private String running;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private String other;

    public SyncStatusStatisticVO withSuccess(String success) {
        this.success = success;
        return this;
    }

    /**
     * 成功数，ID字符串。
     * @return success
     */
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public SyncStatusStatisticVO withFailed(String failed) {
        this.failed = failed;
        return this;
    }

    /**
     * 失败数，ID字符串。
     * @return failed
     */
    public String getFailed() {
        return failed;
    }

    public void setFailed(String failed) {
        this.failed = failed;
    }

    public SyncStatusStatisticVO withRunning(String running) {
        this.running = running;
        return this;
    }

    /**
     * 同步中，ID字符串。
     * @return running
     */
    public String getRunning() {
        return running;
    }

    public void setRunning(String running) {
        this.running = running;
    }

    public SyncStatusStatisticVO withOther(String other) {
        this.other = other;
        return this;
    }

    /**
     * 未同步数，ID字符串。
     * @return other
     */
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncStatusStatisticVO that = (SyncStatusStatisticVO) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.failed, that.failed)
            && Objects.equals(this.running, that.running) && Objects.equals(this.other, that.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failed, running, other);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncStatusStatisticVO {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
