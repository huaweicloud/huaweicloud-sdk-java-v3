package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 删除会场消息体。 */
public class RestBulkDelAttendReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bulkDelAttendInfo")

    private List<DelAttendInfo> bulkDelAttendInfo = null;

    public RestBulkDelAttendReqBody withBulkDelAttendInfo(List<DelAttendInfo> bulkDelAttendInfo) {
        this.bulkDelAttendInfo = bulkDelAttendInfo;
        return this;
    }

    public RestBulkDelAttendReqBody addBulkDelAttendInfoItem(DelAttendInfo bulkDelAttendInfoItem) {
        if (this.bulkDelAttendInfo == null) {
            this.bulkDelAttendInfo = new ArrayList<>();
        }
        this.bulkDelAttendInfo.add(bulkDelAttendInfoItem);
        return this;
    }

    public RestBulkDelAttendReqBody withBulkDelAttendInfo(Consumer<List<DelAttendInfo>> bulkDelAttendInfoSetter) {
        if (this.bulkDelAttendInfo == null) {
            this.bulkDelAttendInfo = new ArrayList<>();
        }
        bulkDelAttendInfoSetter.accept(this.bulkDelAttendInfo);
        return this;
    }

    /** 待删除列表
     * 
     * @return bulkDelAttendInfo */
    public List<DelAttendInfo> getBulkDelAttendInfo() {
        return bulkDelAttendInfo;
    }

    public void setBulkDelAttendInfo(List<DelAttendInfo> bulkDelAttendInfo) {
        this.bulkDelAttendInfo = bulkDelAttendInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestBulkDelAttendReqBody restBulkDelAttendReqBody = (RestBulkDelAttendReqBody) o;
        return Objects.equals(this.bulkDelAttendInfo, restBulkDelAttendReqBody.bulkDelAttendInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkDelAttendInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestBulkDelAttendReqBody {\n");
        sb.append("    bulkDelAttendInfo: ").append(toIndentedString(bulkDelAttendInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
