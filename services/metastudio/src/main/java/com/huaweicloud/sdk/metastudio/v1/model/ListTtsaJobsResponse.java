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
public class ListTtsaJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttsa_jobs")

    private List<TTSAJob> ttsaJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListTtsaJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 语音驱动任务总数。
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTtsaJobsResponse withTtsaJobs(List<TTSAJob> ttsaJobs) {
        this.ttsaJobs = ttsaJobs;
        return this;
    }

    public ListTtsaJobsResponse addTtsaJobsItem(TTSAJob ttsaJobsItem) {
        if (this.ttsaJobs == null) {
            this.ttsaJobs = new ArrayList<>();
        }
        this.ttsaJobs.add(ttsaJobsItem);
        return this;
    }

    public ListTtsaJobsResponse withTtsaJobs(Consumer<List<TTSAJob>> ttsaJobsSetter) {
        if (this.ttsaJobs == null) {
            this.ttsaJobs = new ArrayList<>();
        }
        ttsaJobsSetter.accept(this.ttsaJobs);
        return this;
    }

    /**
     * 语音驱动任务列表。
     * @return ttsaJobs
     */
    public List<TTSAJob> getTtsaJobs() {
        return ttsaJobs;
    }

    public void setTtsaJobs(List<TTSAJob> ttsaJobs) {
        this.ttsaJobs = ttsaJobs;
    }

    public ListTtsaJobsResponse withXRequestId(String xRequestId) {
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
        ListTtsaJobsResponse that = (ListTtsaJobsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.ttsaJobs, that.ttsaJobs)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, ttsaJobs, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTtsaJobsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    ttsaJobs: ").append(toIndentedString(ttsaJobs)).append("\n");
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
