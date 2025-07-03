package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 移动到等候室请求类
 */
public class RestBatchMoveToWaitingRoomReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batchParticipants")

    private List<String> batchParticipants = null;

    public RestBatchMoveToWaitingRoomReqBody withBatchParticipants(List<String> batchParticipants) {
        this.batchParticipants = batchParticipants;
        return this;
    }

    public RestBatchMoveToWaitingRoomReqBody addBatchParticipantsItem(String batchParticipantsItem) {
        if (this.batchParticipants == null) {
            this.batchParticipants = new ArrayList<>();
        }
        this.batchParticipants.add(batchParticipantsItem);
        return this;
    }

    public RestBatchMoveToWaitingRoomReqBody withBatchParticipants(Consumer<List<String>> batchParticipantsSetter) {
        if (this.batchParticipants == null) {
            this.batchParticipants = new ArrayList<>();
        }
        batchParticipantsSetter.accept(this.batchParticipants);
        return this;
    }

    /**
     * 需要移入等候室的全部与会者pid
     * @return batchParticipants
     */
    public List<String> getBatchParticipants() {
        return batchParticipants;
    }

    public void setBatchParticipants(List<String> batchParticipants) {
        this.batchParticipants = batchParticipants;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestBatchMoveToWaitingRoomReqBody that = (RestBatchMoveToWaitingRoomReqBody) obj;
        return Objects.equals(this.batchParticipants, that.batchParticipants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchParticipants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestBatchMoveToWaitingRoomReqBody {\n");
        sb.append("    batchParticipants: ").append(toIndentedString(batchParticipants)).append("\n");
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
