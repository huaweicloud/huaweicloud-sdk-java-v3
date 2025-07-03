package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * rest设置Mmr直播请求体
 */
public class RestSetMmrLiveReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveState")

    private Integer liveState;

    public RestSetMmrLiveReqBody withLiveState(Integer liveState) {
        this.liveState = liveState;
        return this;
    }

    /**
     * 0：停止Mmr会议直播 1：启动Mmr会议直播
     * @return liveState
     */
    public Integer getLiveState() {
        return liveState;
    }

    public void setLiveState(Integer liveState) {
        this.liveState = liveState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestSetMmrLiveReqBody that = (RestSetMmrLiveReqBody) obj;
        return Objects.equals(this.liveState, that.liveState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSetMmrLiveReqBody {\n");
        sb.append("    liveState: ").append(toIndentedString(liveState)).append("\n");
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
