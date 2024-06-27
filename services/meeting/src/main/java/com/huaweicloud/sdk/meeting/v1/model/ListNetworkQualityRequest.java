package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListNetworkQualityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceid")

    private String conferenceid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confToken")

    private String confToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appid")

    private String appid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confuuid")

    private String confuuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RestQosRequestDTO body;

    public ListNetworkQualityRequest withConferenceid(String conferenceid) {
        this.conferenceid = conferenceid;
        return this;
    }

    /**
     * 会议id
     * @return conferenceid
     */
    public String getConferenceid() {
        return conferenceid;
    }

    public void setConferenceid(String conferenceid) {
        this.conferenceid = conferenceid;
    }

    public ListNetworkQualityRequest withConfToken(String confToken) {
        this.confToken = confToken;
        return this;
    }

    /**
     * 会控Token，通过[[获取会控token](https://support.huaweicloud.com/api-meeting/meeting_21_0027.html)](tag:hws)[[获取会控token](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0027.html)](tag:hk)接口获得。
     * @return confToken
     */
    public String getConfToken() {
        return confToken;
    }

    public void setConfToken(String confToken) {
        this.confToken = confToken;
    }

    public ListNetworkQualityRequest withAppid(String appid) {
        this.appid = appid;
        return this;
    }

    /**
     * 会议的appId
     * @return appid
     */
    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public ListNetworkQualityRequest withConfuuid(String confuuid) {
        this.confuuid = confuuid;
        return this;
    }

    /**
     * 会议UUID，MMR房间ID
     * @return confuuid
     */
    public String getConfuuid() {
        return confuuid;
    }

    public void setConfuuid(String confuuid) {
        this.confuuid = confuuid;
    }

    public ListNetworkQualityRequest withBody(RestQosRequestDTO body) {
        this.body = body;
        return this;
    }

    public ListNetworkQualityRequest withBody(Consumer<RestQosRequestDTO> bodySetter) {
        if (this.body == null) {
            this.body = new RestQosRequestDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RestQosRequestDTO getBody() {
        return body;
    }

    public void setBody(RestQosRequestDTO body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNetworkQualityRequest that = (ListNetworkQualityRequest) obj;
        return Objects.equals(this.conferenceid, that.conferenceid) && Objects.equals(this.confToken, that.confToken)
            && Objects.equals(this.appid, that.appid) && Objects.equals(this.confuuid, that.confuuid)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceid, confToken, appid, confuuid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkQualityRequest {\n");
        sb.append("    conferenceid: ").append(toIndentedString(conferenceid)).append("\n");
        sb.append("    confToken: ").append(toIndentedString(confToken)).append("\n");
        sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
        sb.append("    confuuid: ").append(toIndentedString(confuuid)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
