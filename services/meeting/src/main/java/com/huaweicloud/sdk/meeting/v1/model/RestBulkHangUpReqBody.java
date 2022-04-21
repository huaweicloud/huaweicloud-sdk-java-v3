package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量挂断会场消息体。
 */
public class RestBulkHangUpReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bulkHangUpParticipants")

    private List<String> bulkHangUpParticipants = null;

    public RestBulkHangUpReqBody withBulkHangUpParticipants(List<String> bulkHangUpParticipants) {
        this.bulkHangUpParticipants = bulkHangUpParticipants;
        return this;
    }

    public RestBulkHangUpReqBody addBulkHangUpParticipantsItem(String bulkHangUpParticipantsItem) {
        if (this.bulkHangUpParticipants == null) {
            this.bulkHangUpParticipants = new ArrayList<>();
        }
        this.bulkHangUpParticipants.add(bulkHangUpParticipantsItem);
        return this;
    }

    public RestBulkHangUpReqBody withBulkHangUpParticipants(Consumer<List<String>> bulkHangUpParticipantsSetter) {
        if (this.bulkHangUpParticipants == null) {
            this.bulkHangUpParticipants = new ArrayList<>();
        }
        bulkHangUpParticipantsSetter.accept(this.bulkHangUpParticipants);
        return this;
    }

    /**
     * 批量挂断会场列表，列表元素为与会者标识。
     * @return bulkHangUpParticipants
     */
    public List<String> getBulkHangUpParticipants() {
        return bulkHangUpParticipants;
    }

    public void setBulkHangUpParticipants(List<String> bulkHangUpParticipants) {
        this.bulkHangUpParticipants = bulkHangUpParticipants;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestBulkHangUpReqBody restBulkHangUpReqBody = (RestBulkHangUpReqBody) o;
        return Objects.equals(this.bulkHangUpParticipants, restBulkHangUpReqBody.bulkHangUpParticipants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkHangUpParticipants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestBulkHangUpReqBody {\n");
        sb.append("    bulkHangUpParticipants: ").append(toIndentedString(bulkHangUpParticipants)).append("\n");
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
