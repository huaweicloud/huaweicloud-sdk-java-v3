package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FlowAnalysisVO
 */
public class FlowAnalysisVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_count")

    private Long appCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes")

    private Double bytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip_count")

    private Long dstIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port_count")

    private Long dstPortCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<SessionVO> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_byte")

    private Double requestByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_byte")

    private Double responseByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessions")

    private Long sessions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip_count")

    private Long srcIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    public FlowAnalysisVO withAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }

    /**
     * **参数解释**： 应用统计 **取值范围**： 不涉及
     * @return appCount
     */
    public Long getAppCount() {
        return appCount;
    }

    public void setAppCount(Long appCount) {
        this.appCount = appCount;
    }

    public FlowAnalysisVO withBytes(Double bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * **参数解释**： 字节数 **取值范围**： 不涉及
     * @return bytes
     */
    public Double getBytes() {
        return bytes;
    }

    public void setBytes(Double bytes) {
        this.bytes = bytes;
    }

    public FlowAnalysisVO withDstIpCount(Long dstIpCount) {
        this.dstIpCount = dstIpCount;
        return this;
    }

    /**
     * **参数解释**： 目的IP计数 **取值范围**： 不涉及
     * @return dstIpCount
     */
    public Long getDstIpCount() {
        return dstIpCount;
    }

    public void setDstIpCount(Long dstIpCount) {
        this.dstIpCount = dstIpCount;
    }

    public FlowAnalysisVO withDstPortCount(Long dstPortCount) {
        this.dstPortCount = dstPortCount;
        return this;
    }

    /**
     * **参数**： 目的端口计数 **取值范围**： 不涉及
     * @return dstPortCount
     */
    public Long getDstPortCount() {
        return dstPortCount;
    }

    public void setDstPortCount(Long dstPortCount) {
        this.dstPortCount = dstPortCount;
    }

    public FlowAnalysisVO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间 **取值范围**： 不涉及
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public FlowAnalysisVO withRecords(List<SessionVO> records) {
        this.records = records;
        return this;
    }

    public FlowAnalysisVO addRecordsItem(SessionVO recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public FlowAnalysisVO withRecords(Consumer<List<SessionVO>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释**： TOP会话详情 **取值范围**： 不涉及
     * @return records
     */
    public List<SessionVO> getRecords() {
        return records;
    }

    public void setRecords(List<SessionVO> records) {
        this.records = records;
    }

    public FlowAnalysisVO withRequestByte(Double requestByte) {
        this.requestByte = requestByte;
        return this;
    }

    /**
     * **参数解释**： 请求字节数 **取值范围**： 不涉及
     * @return requestByte
     */
    public Double getRequestByte() {
        return requestByte;
    }

    public void setRequestByte(Double requestByte) {
        this.requestByte = requestByte;
    }

    public FlowAnalysisVO withResponseByte(Double responseByte) {
        this.responseByte = responseByte;
        return this;
    }

    /**
     * **参数解释**： 响应字节数 **取值范围**： 不涉及
     * @return responseByte
     */
    public Double getResponseByte() {
        return responseByte;
    }

    public void setResponseByte(Double responseByte) {
        this.responseByte = responseByte;
    }

    public FlowAnalysisVO withSessions(Long sessions) {
        this.sessions = sessions;
        return this;
    }

    /**
     * **参数解释**： 会话次数 **取值范围**： 不涉及
     * @return sessions
     */
    public Long getSessions() {
        return sessions;
    }

    public void setSessions(Long sessions) {
        this.sessions = sessions;
    }

    public FlowAnalysisVO withSrcIpCount(Long srcIpCount) {
        this.srcIpCount = srcIpCount;
        return this;
    }

    /**
     * **参数解释**： 源IP计数 **取值范围**： 不涉及
     * @return srcIpCount
     */
    public Long getSrcIpCount() {
        return srcIpCount;
    }

    public void setSrcIpCount(Long srcIpCount) {
        this.srcIpCount = srcIpCount;
    }

    public FlowAnalysisVO withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间 **取值范围**： 不涉及
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowAnalysisVO that = (FlowAnalysisVO) obj;
        return Objects.equals(this.appCount, that.appCount) && Objects.equals(this.bytes, that.bytes)
            && Objects.equals(this.dstIpCount, that.dstIpCount) && Objects.equals(this.dstPortCount, that.dstPortCount)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.records, that.records)
            && Objects.equals(this.requestByte, that.requestByte)
            && Objects.equals(this.responseByte, that.responseByte) && Objects.equals(this.sessions, that.sessions)
            && Objects.equals(this.srcIpCount, that.srcIpCount) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appCount,
            bytes,
            dstIpCount,
            dstPortCount,
            endTime,
            records,
            requestByte,
            responseByte,
            sessions,
            srcIpCount,
            startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowAnalysisVO {\n");
        sb.append("    appCount: ").append(toIndentedString(appCount)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    dstIpCount: ").append(toIndentedString(dstIpCount)).append("\n");
        sb.append("    dstPortCount: ").append(toIndentedString(dstPortCount)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    requestByte: ").append(toIndentedString(requestByte)).append("\n");
        sb.append("    responseByte: ").append(toIndentedString(responseByte)).append("\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
        sb.append("    srcIpCount: ").append(toIndentedString(srcIpCount)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
