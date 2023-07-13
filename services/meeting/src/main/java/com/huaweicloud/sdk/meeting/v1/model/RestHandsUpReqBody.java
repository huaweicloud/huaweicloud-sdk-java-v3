package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 举手请求。
 */
public class RestHandsUpReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handsState")

    private Integer handsState;

    public RestHandsUpReqBody withHandsState(Integer handsState) {
        this.handsState = handsState;
        return this;
    }

    /**
     * - 0: 放下手 - 1: 举手
     * @return handsState
     */
    public Integer getHandsState() {
        return handsState;
    }

    public void setHandsState(Integer handsState) {
        this.handsState = handsState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestHandsUpReqBody that = (RestHandsUpReqBody) obj;
        return Objects.equals(this.handsState, that.handsState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(handsState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestHandsUpReqBody {\n");
        sb.append("    handsState: ").append(toIndentedString(handsState)).append("\n");
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
