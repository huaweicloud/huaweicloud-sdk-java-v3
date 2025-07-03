package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * rest设置MMR录播启停请求体
 */
public class RestSetMmrRecordReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordType")

    private Integer recordType;

    public RestSetMmrRecordReqBody withRecordType(Integer recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 0：暂停MMR会议录制 1：启动MMR会议录制 2：停止MMR会议录制
     * @return recordType
     */
    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestSetMmrRecordReqBody that = (RestSetMmrRecordReqBody) obj;
        return Objects.equals(this.recordType, that.recordType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSetMmrRecordReqBody {\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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
