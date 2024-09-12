package com.huaweicloud.sdk.meeting.v1.model;

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
public class ShowRecordInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beginTime")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentOffset")

    private Integer segmentOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentLimit")

    private Integer segmentLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentCount")

    private Integer segmentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentList")

    private List<SegmentDO> segmentList = null;

    public ShowRecordInfoResponse withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * 结果码
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ShowRecordInfoResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 结果描述
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowRecordInfoResponse withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 会议主题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ShowRecordInfoResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 会议录制开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowRecordInfoResponse withSegmentOffset(Integer segmentOffset) {
        this.segmentOffset = segmentOffset;
        return this;
    }

    /**
     * 录制段落查询偏移量
     * @return segmentOffset
     */
    public Integer getSegmentOffset() {
        return segmentOffset;
    }

    public void setSegmentOffset(Integer segmentOffset) {
        this.segmentOffset = segmentOffset;
    }

    public ShowRecordInfoResponse withSegmentLimit(Integer segmentLimit) {
        this.segmentLimit = segmentLimit;
        return this;
    }

    /**
     * 录制段落查询数量
     * @return segmentLimit
     */
    public Integer getSegmentLimit() {
        return segmentLimit;
    }

    public void setSegmentLimit(Integer segmentLimit) {
        this.segmentLimit = segmentLimit;
    }

    public ShowRecordInfoResponse withSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
        return this;
    }

    /**
     * 录制段落总数
     * @return segmentCount
     */
    public Integer getSegmentCount() {
        return segmentCount;
    }

    public void setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
    }

    public ShowRecordInfoResponse withSegmentList(List<SegmentDO> segmentList) {
        this.segmentList = segmentList;
        return this;
    }

    public ShowRecordInfoResponse addSegmentListItem(SegmentDO segmentListItem) {
        if (this.segmentList == null) {
            this.segmentList = new ArrayList<>();
        }
        this.segmentList.add(segmentListItem);
        return this;
    }

    public ShowRecordInfoResponse withSegmentList(Consumer<List<SegmentDO>> segmentListSetter) {
        if (this.segmentList == null) {
            this.segmentList = new ArrayList<>();
        }
        segmentListSetter.accept(this.segmentList);
        return this;
    }

    /**
     * 录制人工启动/停止分段列表
     * @return segmentList
     */
    public List<SegmentDO> getSegmentList() {
        return segmentList;
    }

    public void setSegmentList(List<SegmentDO> segmentList) {
        this.segmentList = segmentList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRecordInfoResponse that = (ShowRecordInfoResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.message, that.message)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.segmentOffset, that.segmentOffset)
            && Objects.equals(this.segmentLimit, that.segmentLimit)
            && Objects.equals(this.segmentCount, that.segmentCount)
            && Objects.equals(this.segmentList, that.segmentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, subject, beginTime, segmentOffset, segmentLimit, segmentCount, segmentList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRecordInfoResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    segmentOffset: ").append(toIndentedString(segmentOffset)).append("\n");
        sb.append("    segmentLimit: ").append(toIndentedString(segmentLimit)).append("\n");
        sb.append("    segmentCount: ").append(toIndentedString(segmentCount)).append("\n");
        sb.append("    segmentList: ").append(toIndentedString(segmentList)).append("\n");
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
