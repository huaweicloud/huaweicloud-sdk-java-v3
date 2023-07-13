package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RtcHistoryScaleTimeValue
 */
public class RtcHistoryScaleTimeValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_count")

    private Long userCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_count")

    private Long sessionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_count")

    private Long roomCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_online_user_count")

    private Long maxOnlineUserCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_online_room_count")

    private Long maxOnlineRoomCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "communication_duration")

    private Long communicationDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_communication_duration")

    private Long videoCommunicationDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_communication_duration")

    private Long audioCommunicationDuration;

    public RtcHistoryScaleTimeValue withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 采样时间。日期格式按照ISO8601表示法，并使用UTC时间。格式为YYYY-MM-DD
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RtcHistoryScaleTimeValue withUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }

    /**
     * 通话人数，指总的uid个数
     * minimum: 0
     * maximum: 1844674407
     * @return userCount
     */
    public Long getUserCount() {
        return userCount;
    }

    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }

    public RtcHistoryScaleTimeValue withSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    /**
     * 通话人次，指总的session个数
     * minimum: 0
     * maximum: 1844674407
     * @return sessionCount
     */
    public Long getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
    }

    public RtcHistoryScaleTimeValue withRoomCount(Long roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    /**
     * 房间数
     * minimum: 0
     * maximum: 1844674407
     * @return roomCount
     */
    public Long getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Long roomCount) {
        this.roomCount = roomCount;
    }

    public RtcHistoryScaleTimeValue withMaxOnlineUserCount(Long maxOnlineUserCount) {
        this.maxOnlineUserCount = maxOnlineUserCount;
        return this;
    }

    /**
     * 最大同时在线人数
     * minimum: 0
     * maximum: 1844674407
     * @return maxOnlineUserCount
     */
    public Long getMaxOnlineUserCount() {
        return maxOnlineUserCount;
    }

    public void setMaxOnlineUserCount(Long maxOnlineUserCount) {
        this.maxOnlineUserCount = maxOnlineUserCount;
    }

    public RtcHistoryScaleTimeValue withMaxOnlineRoomCount(Long maxOnlineRoomCount) {
        this.maxOnlineRoomCount = maxOnlineRoomCount;
        return this;
    }

    /**
     * 最大同时在线房间数
     * minimum: 0
     * maximum: 1844674407
     * @return maxOnlineRoomCount
     */
    public Long getMaxOnlineRoomCount() {
        return maxOnlineRoomCount;
    }

    public void setMaxOnlineRoomCount(Long maxOnlineRoomCount) {
        this.maxOnlineRoomCount = maxOnlineRoomCount;
    }

    public RtcHistoryScaleTimeValue withCommunicationDuration(Long communicationDuration) {
        this.communicationDuration = communicationDuration;
        return this;
    }

    /**
     * 音视频通话总时长，单位秒
     * minimum: 0
     * maximum: 1844674407
     * @return communicationDuration
     */
    public Long getCommunicationDuration() {
        return communicationDuration;
    }

    public void setCommunicationDuration(Long communicationDuration) {
        this.communicationDuration = communicationDuration;
    }

    public RtcHistoryScaleTimeValue withVideoCommunicationDuration(Long videoCommunicationDuration) {
        this.videoCommunicationDuration = videoCommunicationDuration;
        return this;
    }

    /**
     * 视频通话总时长，单位秒
     * minimum: 0
     * maximum: 1844674407
     * @return videoCommunicationDuration
     */
    public Long getVideoCommunicationDuration() {
        return videoCommunicationDuration;
    }

    public void setVideoCommunicationDuration(Long videoCommunicationDuration) {
        this.videoCommunicationDuration = videoCommunicationDuration;
    }

    public RtcHistoryScaleTimeValue withAudioCommunicationDuration(Long audioCommunicationDuration) {
        this.audioCommunicationDuration = audioCommunicationDuration;
        return this;
    }

    /**
     * 音频通话总时长，单位秒
     * minimum: 0
     * maximum: 1844674407
     * @return audioCommunicationDuration
     */
    public Long getAudioCommunicationDuration() {
        return audioCommunicationDuration;
    }

    public void setAudioCommunicationDuration(Long audioCommunicationDuration) {
        this.audioCommunicationDuration = audioCommunicationDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RtcHistoryScaleTimeValue that = (RtcHistoryScaleTimeValue) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.userCount, that.userCount)
            && Objects.equals(this.sessionCount, that.sessionCount) && Objects.equals(this.roomCount, that.roomCount)
            && Objects.equals(this.maxOnlineUserCount, that.maxOnlineUserCount)
            && Objects.equals(this.maxOnlineRoomCount, that.maxOnlineRoomCount)
            && Objects.equals(this.communicationDuration, that.communicationDuration)
            && Objects.equals(this.videoCommunicationDuration, that.videoCommunicationDuration)
            && Objects.equals(this.audioCommunicationDuration, that.audioCommunicationDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date,
            userCount,
            sessionCount,
            roomCount,
            maxOnlineUserCount,
            maxOnlineRoomCount,
            communicationDuration,
            videoCommunicationDuration,
            audioCommunicationDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RtcHistoryScaleTimeValue {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
        sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
        sb.append("    roomCount: ").append(toIndentedString(roomCount)).append("\n");
        sb.append("    maxOnlineUserCount: ").append(toIndentedString(maxOnlineUserCount)).append("\n");
        sb.append("    maxOnlineRoomCount: ").append(toIndentedString(maxOnlineRoomCount)).append("\n");
        sb.append("    communicationDuration: ").append(toIndentedString(communicationDuration)).append("\n");
        sb.append("    videoCommunicationDuration: ").append(toIndentedString(videoCommunicationDuration)).append("\n");
        sb.append("    audioCommunicationDuration: ").append(toIndentedString(audioCommunicationDuration)).append("\n");
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
