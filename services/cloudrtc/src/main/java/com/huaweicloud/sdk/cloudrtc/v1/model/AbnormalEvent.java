package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * AbnormalEvent
 */
public class AbnormalEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    @JacksonXmlProperty(localName = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    @JacksonXmlProperty(localName = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    @JacksonXmlProperty(localName = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    @JacksonXmlProperty(localName = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_uid")

    @JacksonXmlProperty(localName = "peer_uid")

    private String peerUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_type")

    @JacksonXmlProperty(localName = "abnormal_type")

    private Integer abnormalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_type_desc")

    @JacksonXmlProperty(localName = "abnormal_type_desc")

    private String abnormalTypeDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_factor")

    @JacksonXmlProperty(localName = "abnormal_factor")

    private Integer abnormalFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_factor_desc")

    @JacksonXmlProperty(localName = "abnormal_factor_desc")

    private String abnormalFactorDesc;

    public AbnormalEvent withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 采样时间。日期格式按照ISO8601表示法，并使用UTC时间。格式为YYYY-MM-DDThh:mm:ssZ
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public AbnormalEvent withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 出现异常的用户ID
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public AbnormalEvent withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 出现异常的房间ID
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public AbnormalEvent withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 出现异常的环节 - join_room：加入房间 - communication：通话中 
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public AbnormalEvent withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 事件发生位置 - local：事件发生在客户端本地 - remote：事件发生在远端 
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public AbnormalEvent withPeerUid(String peerUid) {
        this.peerUid = peerUid;
        return this;
    }

    /**
     * 如果根因来自远端用户，则peerid为远端用户的用户ID。如果根因来自自身，则peerid为空字符串
     * @return peerUid
     */
    public String getPeerUid() {
        return peerUid;
    }

    public void setPeerUid(String peerUid) {
        this.peerUid = peerUid;
    }

    public AbnormalEvent withAbnormalType(Integer abnormalType) {
        this.abnormalType = abnormalType;
        return this;
    }

    /**
     * 异常类型： - 1：进房慢(5s加入房间失败) - 2：视频卡顿 - 3：音频卡顿 
     * minimum: 0
     * maximum: 15
     * @return abnormalType
     */
    public Integer getAbnormalType() {
        return abnormalType;
    }

    public void setAbnormalType(Integer abnormalType) {
        this.abnormalType = abnormalType;
    }

    public AbnormalEvent withAbnormalTypeDesc(String abnormalTypeDesc) {
        this.abnormalTypeDesc = abnormalTypeDesc;
        return this;
    }

    /**
     * 异常类型描述与异常类型对应，支持国际化，取值范围为： - 进房慢(5s加入房间失败) - 视频卡顿 - 音频卡顿 
     * @return abnormalTypeDesc
     */
    public String getAbnormalTypeDesc() {
        return abnormalTypeDesc;
    }

    public void setAbnormalTypeDesc(String abnormalTypeDesc) {
        this.abnormalTypeDesc = abnormalTypeDesc;
    }

    public AbnormalEvent withAbnormalFactor(Integer abnormalFactor) {
        this.abnormalFactor = abnormalFactor;
        return this;
    }

    /**
     * 异常因素 当异常类型为1时，异常因素取值范围为： - 1：建链失败 - 2：房间非空闲 - 3：服务器异常 - 4：服务器反馈503 - 5：鉴权失败 - 6：鉴权重试 - 7：时钟同步失败 - 8：url错误 - 9：终端内部异常 - 90000004：SDK发出的加入房间信令响应超时 - 90100009：web侧没有收到MSP下发的配置信息 - 90100008：websocket链路建链失败 - 10000001：服务侧返回的异常信息 - 31000003：服务侧返回的异常信息 - 32000030：服务侧返回的异常信息 - 15：浏览器设置sdp异常 当异常类型为2或者3时，异常因素取值范围为： - 1：系统CPU占用高 - 2：App CPU占用高 - 3：音频上行网络延时 - 4：音频上行网络抖动 - 5：视频上行网络延时 - 6：视频上行网络抖动 - 7：音频下行网络延时 - 8：音频下行网络抖动 - 9：视频下行网络延时 - 10：视频下行网络抖动 - 11：上行音频丢包 - 12：上行视频丢包 - 13：下行音频丢包 - 14：下行视频丢包 - 15：下行音频无声音 - 16：其他 - 17：对端用户离线 - 18：对端用户无码流 - 19：对端用户无帧率 - 20：本端服务器下行无码流 - 21：本端服务器下行无帧率 
     * minimum: 0
     * maximum: 15
     * @return abnormalFactor
     */
    public Integer getAbnormalFactor() {
        return abnormalFactor;
    }

    public void setAbnormalFactor(Integer abnormalFactor) {
        this.abnormalFactor = abnormalFactor;
    }

    public AbnormalEvent withAbnormalFactorDesc(String abnormalFactorDesc) {
        this.abnormalFactorDesc = abnormalFactorDesc;
        return this;
    }

    /**
     * 异常因素描述，支持国际化 当异常类型为1时，异常因素描述与异常因素对应，取值范围为： - 建链失败 - 房间非空闲 - 服务器异常 - 服务器反馈503 - 鉴权失败 - 鉴权重试 - 时钟同步失败 - url错误 - 终端内部异常 - SDK发出的加入房间信令响应超时 - web侧没有收到MSP下发的配置信息 - websocket链路建链失败 - 服务侧返回的异常信息 - 服务侧返回的异常信息 - 服务侧返回的异常信息 - 浏览器设置sdp异常 当异常类型为2或者3时，异常因素描述与异常因素对应，取值范围为： - 系统CPU占用高 - App CPU占用高 - 音频上行网络延时 - 音频上行网络抖动 - 视频上行网络延时 - 视频上行网络抖动 - 音频下行网络延时 - 音频下行网络抖动 - 视频下行网络延时 - 视频下行网络抖动 - 上行音频丢包 - 上行视频丢包 - 下行音频丢包 - 下行视频丢包 - 下行音频无声音 - 其他 - 对端用户离线 - 对端用户无码流 - 对端用户无帧率 - 本端服务器下行无码流 - 本端服务器下行无帧率 其他情况，异常因素描述为：其他 
     * @return abnormalFactorDesc
     */
    public String getAbnormalFactorDesc() {
        return abnormalFactorDesc;
    }

    public void setAbnormalFactorDesc(String abnormalFactorDesc) {
        this.abnormalFactorDesc = abnormalFactorDesc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbnormalEvent abnormalEvent = (AbnormalEvent) o;
        return Objects.equals(this.time, abnormalEvent.time) && Objects.equals(this.uid, abnormalEvent.uid)
            && Objects.equals(this.roomId, abnormalEvent.roomId) && Objects.equals(this.stage, abnormalEvent.stage)
            && Objects.equals(this.location, abnormalEvent.location)
            && Objects.equals(this.peerUid, abnormalEvent.peerUid)
            && Objects.equals(this.abnormalType, abnormalEvent.abnormalType)
            && Objects.equals(this.abnormalTypeDesc, abnormalEvent.abnormalTypeDesc)
            && Objects.equals(this.abnormalFactor, abnormalEvent.abnormalFactor)
            && Objects.equals(this.abnormalFactorDesc, abnormalEvent.abnormalFactorDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time,
            uid,
            roomId,
            stage,
            location,
            peerUid,
            abnormalType,
            abnormalTypeDesc,
            abnormalFactor,
            abnormalFactorDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbnormalEvent {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    peerUid: ").append(toIndentedString(peerUid)).append("\n");
        sb.append("    abnormalType: ").append(toIndentedString(abnormalType)).append("\n");
        sb.append("    abnormalTypeDesc: ").append(toIndentedString(abnormalTypeDesc)).append("\n");
        sb.append("    abnormalFactor: ").append(toIndentedString(abnormalFactor)).append("\n");
        sb.append("    abnormalFactorDesc: ").append(toIndentedString(abnormalFactorDesc)).append("\n");
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
