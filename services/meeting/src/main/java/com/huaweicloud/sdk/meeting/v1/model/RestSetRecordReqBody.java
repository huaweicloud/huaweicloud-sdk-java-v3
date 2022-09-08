package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 启停录制消息体。
 */
public class RestSetRecordReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isRecord")

    private Integer isRecord;

    public RestSetRecordReqBody withIsRecord(Integer isRecord) {
        this.isRecord = isRecord;
        return this;
    }

    /**
     * 默认值为0。 - 0: 停止会议录制。 - 1: 启动会议录制。
     * @return isRecord
     */
    public Integer getIsRecord() {
        return isRecord;
    }

    public void setIsRecord(Integer isRecord) {
        this.isRecord = isRecord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestSetRecordReqBody restSetRecordReqBody = (RestSetRecordReqBody) o;
        return Objects.equals(this.isRecord, restSetRecordReqBody.isRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSetRecordReqBody {\n");
        sb.append("    isRecord: ").append(toIndentedString(isRecord)).append("\n");
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
