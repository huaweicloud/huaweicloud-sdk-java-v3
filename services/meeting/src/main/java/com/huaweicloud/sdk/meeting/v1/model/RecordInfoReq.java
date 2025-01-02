package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 录制会议文件信息请求体
 */
public class RecordInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUID")

    private String confUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentOffset")

    private Integer segmentOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentLimit")

    private Integer segmentLimit;

    public RecordInfoReq withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    /**
     * 会议uuid
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    public RecordInfoReq withSegmentOffset(Integer segmentOffset) {
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

    public RecordInfoReq withSegmentLimit(Integer segmentLimit) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordInfoReq that = (RecordInfoReq) obj;
        return Objects.equals(this.confUUID, that.confUUID) && Objects.equals(this.segmentOffset, that.segmentOffset)
            && Objects.equals(this.segmentLimit, that.segmentLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confUUID, segmentOffset, segmentLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordInfoReq {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    segmentOffset: ").append(toIndentedString(segmentOffset)).append("\n");
        sb.append("    segmentLimit: ").append(toIndentedString(segmentLimit)).append("\n");
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
