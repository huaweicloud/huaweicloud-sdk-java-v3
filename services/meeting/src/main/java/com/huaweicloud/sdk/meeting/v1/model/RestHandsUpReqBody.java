package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会场举手请求消息
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
     * - 0: 放下手。 - 1: 举手。
     * @return handsState
     */
    public Integer getHandsState() {
        return handsState;
    }

    public void setHandsState(Integer handsState) {
        this.handsState = handsState;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestHandsUpReqBody restHandsUpReqBody = (RestHandsUpReqBody) o;
        return Objects.equals(this.handsState, restHandsUpReqBody.handsState);
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
