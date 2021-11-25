package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CollectTranscriberJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    private List<Segment> segments = null;

    public CollectTranscriberJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 当前识别状态。具体状态如下所示： WAITING 等待识别。 FINISHED 识别已经完成。 ERROR 识别过程中发生错误。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CollectTranscriberJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 任务创建时间, 遵循 RFC 3339格式。 格式示例：2018-12-04T13:10:29.310Z。
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CollectTranscriberJobResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 开始识别时间, 遵循 RFC 3339格式。 当status为FINISHED或ERROR时存在。 格式示例：2018-12-04T13:10:29.310Z。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CollectTranscriberJobResponse withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /** 识别完成时间, 遵循 RFC 3339格式。 当status为FINISHED或ERROR时存在。 格式示例：2018-12-04T13:10:29.310Z。
     * 
     * @return finishTime */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public CollectTranscriberJobResponse withSegments(List<Segment> segments) {
        this.segments = segments;
        return this;
    }

    public CollectTranscriberJobResponse addSegmentsItem(Segment segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public CollectTranscriberJobResponse withSegments(Consumer<List<Segment>> segmentsSetter) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        segmentsSetter.accept(this.segments);
        return this;
    }

    /** 转写结果, 多句结果的数组。
     * 
     * @return segments */
    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectTranscriberJobResponse collectTranscriberJobResponse = (CollectTranscriberJobResponse) o;
        return Objects.equals(this.status, collectTranscriberJobResponse.status)
            && Objects.equals(this.createTime, collectTranscriberJobResponse.createTime)
            && Objects.equals(this.startTime, collectTranscriberJobResponse.startTime)
            && Objects.equals(this.finishTime, collectTranscriberJobResponse.finishTime)
            && Objects.equals(this.segments, collectTranscriberJobResponse.segments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, createTime, startTime, finishTime, segments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectTranscriberJobResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
