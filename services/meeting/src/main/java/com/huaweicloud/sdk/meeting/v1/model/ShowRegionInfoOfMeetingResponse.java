package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowRegionInfoOfMeetingResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regionIP")
    
    private String regionIP;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regionUrl")
    
    private String regionUrl;

    public ShowRegionInfoOfMeetingResponse withRegionIP(String regionIP) {
        this.regionIP = regionIP;
        return this;
    }

    


    /**
     * 会议所在区域的公网IP地址。
     * @return regionIP
     */
    public String getRegionIP() {
        return regionIP;
    }

    public void setRegionIP(String regionIP) {
        this.regionIP = regionIP;
    }

    

    public ShowRegionInfoOfMeetingResponse withRegionUrl(String regionUrl) {
        this.regionUrl = regionUrl;
        return this;
    }

    


    /**
     * 会议所在区域的公网域名。
     * @return regionUrl
     */
    public String getRegionUrl() {
        return regionUrl;
    }

    public void setRegionUrl(String regionUrl) {
        this.regionUrl = regionUrl;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRegionInfoOfMeetingResponse showRegionInfoOfMeetingResponse = (ShowRegionInfoOfMeetingResponse) o;
        return Objects.equals(this.regionIP, showRegionInfoOfMeetingResponse.regionIP) &&
            Objects.equals(this.regionUrl, showRegionInfoOfMeetingResponse.regionUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(regionIP, regionUrl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRegionInfoOfMeetingResponse {\n");
        sb.append("    regionIP: ").append(toIndentedString(regionIP)).append("\n");
        sb.append("    regionUrl: ").append(toIndentedString(regionUrl)).append("\n");
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

