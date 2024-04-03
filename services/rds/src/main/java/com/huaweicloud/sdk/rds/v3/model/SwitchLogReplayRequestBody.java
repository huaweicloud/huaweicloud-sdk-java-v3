package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 中止/恢复wal日志回放请求体
 */
public class SwitchLogReplayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pause_log_replay")

    private String pauseLogReplay;

    public SwitchLogReplayRequestBody withPauseLogReplay(String pauseLogReplay) {
        this.pauseLogReplay = pauseLogReplay;
        return this;
    }

    /**
     * “true”表示中止回放，“false”表示恢复回放，其他情况表示不做操作
     * @return pauseLogReplay
     */
    public String getPauseLogReplay() {
        return pauseLogReplay;
    }

    public void setPauseLogReplay(String pauseLogReplay) {
        this.pauseLogReplay = pauseLogReplay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchLogReplayRequestBody that = (SwitchLogReplayRequestBody) obj;
        return Objects.equals(this.pauseLogReplay, that.pauseLogReplay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pauseLogReplay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchLogReplayRequestBody {\n");
        sb.append("    pauseLogReplay: ").append(toIndentedString(pauseLogReplay)).append("\n");
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
