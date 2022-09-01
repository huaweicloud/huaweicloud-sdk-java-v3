package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 启停直播消息体。
 */
public class RestSetLiveReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isLive")

    @JacksonXmlProperty(localName = "isLive")

    private Integer isLive;

    public RestSetLiveReqBody withIsLive(Integer isLive) {
        this.isLive = isLive;
        return this;
    }

    /**
     * 默认值为0。 - 0: 停止会议直播。 - 1: 启动会议直播。
     * @return isLive
     */
    public Integer getIsLive() {
        return isLive;
    }

    public void setIsLive(Integer isLive) {
        this.isLive = isLive;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestSetLiveReqBody restSetLiveReqBody = (RestSetLiveReqBody) o;
        return Objects.equals(this.isLive, restSetLiveReqBody.isLive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSetLiveReqBody {\n");
        sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
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
