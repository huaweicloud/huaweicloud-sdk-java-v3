package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 允许客户端录制请求。
 */
public class RestAllowClientRecordReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowClientRecord")

    private Integer allowClientRecord;

    public RestAllowClientRecordReqBody withAllowClientRecord(Integer allowClientRecord) {
        this.allowClientRecord = allowClientRecord;
        return this;
    }

    /**
     * * 0：取消与会者客户端录制权限 * 1：允许与会者客户端录制 
     * minimum: 0
     * maximum: 1
     * @return allowClientRecord
     */
    public Integer getAllowClientRecord() {
        return allowClientRecord;
    }

    public void setAllowClientRecord(Integer allowClientRecord) {
        this.allowClientRecord = allowClientRecord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestAllowClientRecordReqBody restAllowClientRecordReqBody = (RestAllowClientRecordReqBody) o;
        return Objects.equals(this.allowClientRecord, restAllowClientRecordReqBody.allowClientRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowClientRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestAllowClientRecordReqBody {\n");
        sb.append("    allowClientRecord: ").append(toIndentedString(allowClientRecord)).append("\n");
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
