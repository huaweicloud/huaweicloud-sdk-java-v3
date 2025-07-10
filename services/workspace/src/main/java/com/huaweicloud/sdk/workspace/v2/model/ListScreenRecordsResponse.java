package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListScreenRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screen_records")

    private List<ScreenRecordDetail> screenRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListScreenRecordsResponse withScreenRecords(List<ScreenRecordDetail> screenRecords) {
        this.screenRecords = screenRecords;
        return this;
    }

    public ListScreenRecordsResponse addScreenRecordsItem(ScreenRecordDetail screenRecordsItem) {
        if (this.screenRecords == null) {
            this.screenRecords = new ArrayList<>();
        }
        this.screenRecords.add(screenRecordsItem);
        return this;
    }

    public ListScreenRecordsResponse withScreenRecords(Consumer<List<ScreenRecordDetail>> screenRecordsSetter) {
        if (this.screenRecords == null) {
            this.screenRecords = new ArrayList<>();
        }
        screenRecordsSetter.accept(this.screenRecords);
        return this;
    }

    /**
     * 录屏记录。
     * @return screenRecords
     */
    public List<ScreenRecordDetail> getScreenRecords() {
        return screenRecords;
    }

    public void setScreenRecords(List<ScreenRecordDetail> screenRecords) {
        this.screenRecords = screenRecords;
    }

    public ListScreenRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScreenRecordsResponse that = (ListScreenRecordsResponse) obj;
        return Objects.equals(this.screenRecords, that.screenRecords)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenRecords, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScreenRecordsResponse {\n");
        sb.append("    screenRecords: ").append(toIndentedString(screenRecords)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
