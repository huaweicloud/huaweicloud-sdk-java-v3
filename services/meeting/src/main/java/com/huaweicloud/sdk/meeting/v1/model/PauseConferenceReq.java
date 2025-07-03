package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 主持人暂停/取消暂停会议请求消息体
 */
public class PauseConferenceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pause")

    private Integer pause;

    public PauseConferenceReq withPause(Integer pause) {
        this.pause = pause;
        return this;
    }

    /**
     * 主持人暂停/取消暂停会议 0：会议正常 1：会议暂停
     * @return pause
     */
    public Integer getPause() {
        return pause;
    }

    public void setPause(Integer pause) {
        this.pause = pause;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PauseConferenceReq that = (PauseConferenceReq) obj;
        return Objects.equals(this.pause, that.pause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pause);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PauseConferenceReq {\n");
        sb.append("    pause: ").append(toIndentedString(pause)).append("\n");
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
