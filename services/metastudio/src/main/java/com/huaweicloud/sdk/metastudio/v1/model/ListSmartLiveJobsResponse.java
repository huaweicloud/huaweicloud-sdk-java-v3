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
public class ListSmartLiveJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smart_live_jobs")

    private List<SmartLiveJob> smartLiveJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSmartLiveJobsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数字人直播任务总数。
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

    public ListSmartLiveJobsResponse withSmartLiveJobs(List<SmartLiveJob> smartLiveJobs) {
        this.smartLiveJobs = smartLiveJobs;
        return this;
    }

    public ListSmartLiveJobsResponse addSmartLiveJobsItem(SmartLiveJob smartLiveJobsItem) {
        if (this.smartLiveJobs == null) {
            this.smartLiveJobs = new ArrayList<>();
        }
        this.smartLiveJobs.add(smartLiveJobsItem);
        return this;
    }

    public ListSmartLiveJobsResponse withSmartLiveJobs(Consumer<List<SmartLiveJob>> smartLiveJobsSetter) {
        if (this.smartLiveJobs == null) {
            this.smartLiveJobs = new ArrayList<>();
        }
        smartLiveJobsSetter.accept(this.smartLiveJobs);
        return this;
    }

    /**
     * 数字人直播任务列表。
     * @return smartLiveJobs
     */
    public List<SmartLiveJob> getSmartLiveJobs() {
        return smartLiveJobs;
    }

    public void setSmartLiveJobs(List<SmartLiveJob> smartLiveJobs) {
        this.smartLiveJobs = smartLiveJobs;
    }

    public ListSmartLiveJobsResponse withXRequestId(String xRequestId) {
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
        ListSmartLiveJobsResponse that = (ListSmartLiveJobsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.smartLiveJobs, that.smartLiveJobs)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, smartLiveJobs, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmartLiveJobsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    smartLiveJobs: ").append(toIndentedString(smartLiveJobs)).append("\n");
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
