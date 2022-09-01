package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 选看消息体。
 */
public class RestChairViewReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "viewType")

    @JacksonXmlProperty(localName = "viewType")

    private Integer viewType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    @JacksonXmlProperty(localName = "participantID")

    private String participantID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchTime")

    @JacksonXmlProperty(localName = "switchTime")

    private Integer switchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    public RestChairViewReqBody withViewType(Integer viewType) {
        this.viewType = viewType;
        return this;
    }

    /**
     * 主持人观看的画面类型。 - 0: 主持人轮询。 - 1: 主持人观看多画面。 - 2: 主持人选看会场。
     * @return viewType
     */
    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public RestChairViewReqBody withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 被主持人选看的会场。 当为主持人选看会场时为必填参数。
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public RestChairViewReqBody withSwitchTime(Integer switchTime) {
        this.switchTime = switchTime;
        return this;
    }

    /**
     * 主持人轮询时，必填字段。 表示轮询间隔，单位：秒。 范围:[10-120]，默认值：30
     * @return switchTime
     */
    public Integer getSwitchTime() {
        return switchTime;
    }

    public void setSwitchTime(Integer switchTime) {
        this.switchTime = switchTime;
    }

    public RestChairViewReqBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 主持人轮询时，必填字段。 - 0: 停止轮询。 - 1: 启动轮询。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestChairViewReqBody restChairViewReqBody = (RestChairViewReqBody) o;
        return Objects.equals(this.viewType, restChairViewReqBody.viewType)
            && Objects.equals(this.participantID, restChairViewReqBody.participantID)
            && Objects.equals(this.switchTime, restChairViewReqBody.switchTime)
            && Objects.equals(this.status, restChairViewReqBody.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(viewType, participantID, switchTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestChairViewReqBody {\n");
        sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    switchTime: ").append(toIndentedString(switchTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
