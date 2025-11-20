package com.huaweicloud.sdk.live.v2.model;

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
public class ListTranscodeTaskDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode_detail_list")

    private List<TranscodeDetailInfo> transcodeDetailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListTranscodeTaskDetailResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListTranscodeTaskDetailResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 采样开始时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTranscodeTaskDetailResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 采样结束时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListTranscodeTaskDetailResponse withTranscodeDetailList(List<TranscodeDetailInfo> transcodeDetailList) {
        this.transcodeDetailList = transcodeDetailList;
        return this;
    }

    public ListTranscodeTaskDetailResponse addTranscodeDetailListItem(TranscodeDetailInfo transcodeDetailListItem) {
        if (this.transcodeDetailList == null) {
            this.transcodeDetailList = new ArrayList<>();
        }
        this.transcodeDetailList.add(transcodeDetailListItem);
        return this;
    }

    public ListTranscodeTaskDetailResponse withTranscodeDetailList(
        Consumer<List<TranscodeDetailInfo>> transcodeDetailListSetter) {
        if (this.transcodeDetailList == null) {
            this.transcodeDetailList = new ArrayList<>();
        }
        transcodeDetailListSetter.accept(this.transcodeDetailList);
        return this;
    }

    /**
     * 流粒度转码明细
     * @return transcodeDetailList
     */
    public List<TranscodeDetailInfo> getTranscodeDetailList() {
        return transcodeDetailList;
    }

    public void setTranscodeDetailList(List<TranscodeDetailInfo> transcodeDetailList) {
        this.transcodeDetailList = transcodeDetailList;
    }

    public ListTranscodeTaskDetailResponse withXRequestId(String xRequestId) {
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
        ListTranscodeTaskDetailResponse that = (ListTranscodeTaskDetailResponse) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.transcodeDetailList, that.transcodeDetailList)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, startTime, endTime, transcodeDetailList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeTaskDetailResponse {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    transcodeDetailList: ").append(toIndentedString(transcodeDetailList)).append("\n");
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
