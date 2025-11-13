package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowUsageDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_list")

    private List<TimeResourceUsageInfo> timeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowUsageDataResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 资源总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowUsageDataResponse withTimeList(List<TimeResourceUsageInfo> timeList) {
        this.timeList = timeList;
        return this;
    }

    public ShowUsageDataResponse addTimeListItem(TimeResourceUsageInfo timeListItem) {
        if (this.timeList == null) {
            this.timeList = new ArrayList<>();
        }
        this.timeList.add(timeListItem);
        return this;
    }

    public ShowUsageDataResponse withTimeList(Consumer<List<TimeResourceUsageInfo>> timeListSetter) {
        if (this.timeList == null) {
            this.timeList = new ArrayList<>();
        }
        timeListSetter.accept(this.timeList);
        return this;
    }

    /**
     * 资源用量列表
     * @return timeList
     */
    public List<TimeResourceUsageInfo> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<TimeResourceUsageInfo> timeList) {
        this.timeList = timeList;
    }

    public ShowUsageDataResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUsageDataResponse that = (ShowUsageDataResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.timeList, that.timeList)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, timeList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUsageDataResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    timeList: ").append(toIndentedString(timeList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
