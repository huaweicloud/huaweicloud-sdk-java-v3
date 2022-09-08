package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class StartMeetingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionIP")

    private String regionIP;

    public StartMeetingResponse withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 会议主席鉴权uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public StartMeetingResponse withRegionIP(String regionIP) {
        this.regionIP = regionIP;
        return this;
    }

    /**
     * 区域公网IP地址
     * @return regionIP
     */
    public String getRegionIP() {
        return regionIP;
    }

    public void setRegionIP(String regionIP) {
        this.regionIP = regionIP;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartMeetingResponse startMeetingResponse = (StartMeetingResponse) o;
        return Objects.equals(this.uuid, startMeetingResponse.uuid)
            && Objects.equals(this.regionIP, startMeetingResponse.regionIP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, regionIP);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartMeetingResponse {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    regionIP: ").append(toIndentedString(regionIP)).append("\n");
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
