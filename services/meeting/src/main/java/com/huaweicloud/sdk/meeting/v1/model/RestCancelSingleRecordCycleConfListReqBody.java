package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestCancelSingleRecordCycleConfListReqBody
 */
public class RestCancelSingleRecordCycleConfListReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycleSubConfIDs")

    private List<String> cycleSubConfIDs = null;

    public RestCancelSingleRecordCycleConfListReqBody withCycleSubConfIDs(List<String> cycleSubConfIDs) {
        this.cycleSubConfIDs = cycleSubConfIDs;
        return this;
    }

    public RestCancelSingleRecordCycleConfListReqBody addCycleSubConfIDsItem(String cycleSubConfIDsItem) {
        if (this.cycleSubConfIDs == null) {
            this.cycleSubConfIDs = new ArrayList<>();
        }
        this.cycleSubConfIDs.add(cycleSubConfIDsItem);
        return this;
    }

    public RestCancelSingleRecordCycleConfListReqBody withCycleSubConfIDs(
        Consumer<List<String>> cycleSubConfIDsSetter) {
        if (this.cycleSubConfIDs == null) {
            this.cycleSubConfIDs = new ArrayList<>();
        }
        cycleSubConfIDsSetter.accept(this.cycleSubConfIDs);
        return this;
    }

    /**
     * 待删除的子会议UUID列表。
     * @return cycleSubConfIDs
     */
    public List<String> getCycleSubConfIDs() {
        return cycleSubConfIDs;
    }

    public void setCycleSubConfIDs(List<String> cycleSubConfIDs) {
        this.cycleSubConfIDs = cycleSubConfIDs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestCancelSingleRecordCycleConfListReqBody that = (RestCancelSingleRecordCycleConfListReqBody) obj;
        return Objects.equals(this.cycleSubConfIDs, that.cycleSubConfIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycleSubConfIDs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestCancelSingleRecordCycleConfListReqBody {\n");
        sb.append("    cycleSubConfIDs: ").append(toIndentedString(cycleSubConfIDs)).append("\n");
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
