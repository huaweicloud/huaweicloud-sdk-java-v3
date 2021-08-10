package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class SearchAttendanceRecordsOfHisMeetingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ConfAttendeeRecordInfo> data = null;

    public SearchAttendanceRecordsOfHisMeetingResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 第几条。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchAttendanceRecordsOfHisMeetingResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页的记录数。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchAttendanceRecordsOfHisMeetingResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 总记录数。
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SearchAttendanceRecordsOfHisMeetingResponse withData(List<ConfAttendeeRecordInfo> data) {
        this.data = data;
        return this;
    }

    public SearchAttendanceRecordsOfHisMeetingResponse addDataItem(ConfAttendeeRecordInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public SearchAttendanceRecordsOfHisMeetingResponse withData(Consumer<List<ConfAttendeeRecordInfo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /** 与会者列表。
     * 
     * @return data */
    public List<ConfAttendeeRecordInfo> getData() {
        return data;
    }

    public void setData(List<ConfAttendeeRecordInfo> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchAttendanceRecordsOfHisMeetingResponse searchAttendanceRecordsOfHisMeetingResponse =
            (SearchAttendanceRecordsOfHisMeetingResponse) o;
        return Objects.equals(this.offset, searchAttendanceRecordsOfHisMeetingResponse.offset)
            && Objects.equals(this.limit, searchAttendanceRecordsOfHisMeetingResponse.limit)
            && Objects.equals(this.count, searchAttendanceRecordsOfHisMeetingResponse.count)
            && Objects.equals(this.data, searchAttendanceRecordsOfHisMeetingResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, count, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchAttendanceRecordsOfHisMeetingResponse {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
