package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量举手请求。
 */
public class RestBatchHandsUpReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handsState")

    private Integer handsState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pids")

    private List<String> pids = null;

    public RestBatchHandsUpReqBody withHandsState(Integer handsState) {
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

    public RestBatchHandsUpReqBody withPids(List<String> pids) {
        this.pids = pids;
        return this;
    }

    public RestBatchHandsUpReqBody addPidsItem(String pidsItem) {
        if (this.pids == null) {
            this.pids = new ArrayList<>();
        }
        this.pids.add(pidsItem);
        return this;
    }

    public RestBatchHandsUpReqBody withPids(Consumer<List<String>> pidsSetter) {
        if (this.pids == null) {
            this.pids = new ArrayList<>();
        }
        pidsSetter.accept(this.pids);
        return this;
    }

    /**
     * 与会者标识列表。
     * @return pids
     */
    public List<String> getPids() {
        return pids;
    }

    public void setPids(List<String> pids) {
        this.pids = pids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestBatchHandsUpReqBody that = (RestBatchHandsUpReqBody) obj;
        return Objects.equals(this.handsState, that.handsState) && Objects.equals(this.pids, that.pids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(handsState, pids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestBatchHandsUpReqBody {\n");
        sb.append("    handsState: ").append(toIndentedString(handsState)).append("\n");
        sb.append("    pids: ").append(toIndentedString(pids)).append("\n");
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
