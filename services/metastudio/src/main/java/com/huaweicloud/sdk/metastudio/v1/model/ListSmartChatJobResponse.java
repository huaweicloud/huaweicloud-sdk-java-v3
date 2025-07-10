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
public class ListSmartChatJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smart_chat_jobs")

    private List<SmartChatJobBaseInfo> smartChatJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSmartChatJobResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数字人智能交互对话任务总数。
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

    public ListSmartChatJobResponse withSmartChatJobs(List<SmartChatJobBaseInfo> smartChatJobs) {
        this.smartChatJobs = smartChatJobs;
        return this;
    }

    public ListSmartChatJobResponse addSmartChatJobsItem(SmartChatJobBaseInfo smartChatJobsItem) {
        if (this.smartChatJobs == null) {
            this.smartChatJobs = new ArrayList<>();
        }
        this.smartChatJobs.add(smartChatJobsItem);
        return this;
    }

    public ListSmartChatJobResponse withSmartChatJobs(Consumer<List<SmartChatJobBaseInfo>> smartChatJobsSetter) {
        if (this.smartChatJobs == null) {
            this.smartChatJobs = new ArrayList<>();
        }
        smartChatJobsSetter.accept(this.smartChatJobs);
        return this;
    }

    /**
     * 数字人智能交互对话任务列表。
     * @return smartChatJobs
     */
    public List<SmartChatJobBaseInfo> getSmartChatJobs() {
        return smartChatJobs;
    }

    public void setSmartChatJobs(List<SmartChatJobBaseInfo> smartChatJobs) {
        this.smartChatJobs = smartChatJobs;
    }

    public ListSmartChatJobResponse withXRequestId(String xRequestId) {
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
        ListSmartChatJobResponse that = (ListSmartChatJobResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.smartChatJobs, that.smartChatJobs)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, smartChatJobs, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmartChatJobResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    smartChatJobs: ").append(toIndentedString(smartChatJobs)).append("\n");
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
