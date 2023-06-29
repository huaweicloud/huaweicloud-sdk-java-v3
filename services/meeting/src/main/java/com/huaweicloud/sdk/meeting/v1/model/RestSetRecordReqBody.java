package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 启停会议录制请求。
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
     * 录制启停开关。默认值为0。 - 0: 停止会议录制 - 1: 启动会议录制
     * @return isRecord
     */
    public Integer getIsRecord() {
        return isRecord;
    }

    public void setIsRecord(Integer isRecord) {
        this.isRecord = isRecord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestSetRecordReqBody that = (RestSetRecordReqBody) obj;
        return Objects.equals(this.isRecord, that.isRecord);
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
