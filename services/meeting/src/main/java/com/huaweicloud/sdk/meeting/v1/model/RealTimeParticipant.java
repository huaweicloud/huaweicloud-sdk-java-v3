package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 在线会场信息。
 */
public class RealTimeParticipant  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pid")
    
    private String pid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private Integer state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video")
    
    private Integer video;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mute")
    
    private Integer mute;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hand")
    
    private Integer hand;

    public RealTimeParticipant withPid(String pid) {
        this.pid = pid;
        return this;
    }

    


    /**
     * 与会者标识。
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public RealTimeParticipant withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 与会者名称或昵称，长度限制为96个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealTimeParticipant withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    


    /**
     * 与会者设备的注册号码（可支持SIP、TEL号码格式）。最大不超过127个字符。。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RealTimeParticipant withState(Integer state) {
        this.state = state;
        return this;
    }

    


    /**
     * 用户状态。若会场未入会或已离会，则不会显示于在线会场列表。 - 0: 会议中。 - 1: 正在呼叫。 - 2: 正在加入会议。
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public RealTimeParticipant withVideo(Integer video) {
        this.video = video;
        return this;
    }

    


    /**
     * 音视频能力。 - 0: 音频。 - 1: 视频。
     * @return video
     */
    public Integer getVideo() {
        return video;
    }

    public void setVideo(Integer video) {
        this.video = video;
    }

    public RealTimeParticipant withMute(Integer mute) {
        this.mute = mute;
        return this;
    }

    


    /**
     * 麦克风状态。 - 0: 麦克风打开。 - 1: 麦克风关闭。
     * @return mute
     */
    public Integer getMute() {
        return mute;
    }

    public void setMute(Integer mute) {
        this.mute = mute;
    }

    public RealTimeParticipant withHand(Integer hand) {
        this.hand = hand;
        return this;
    }

    


    /**
     * 与会者举手状态。 - 0: 未举手。 - 1: 举手。
     * @return hand
     */
    public Integer getHand() {
        return hand;
    }

    public void setHand(Integer hand) {
        this.hand = hand;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RealTimeParticipant realTimeParticipant = (RealTimeParticipant) o;
        return Objects.equals(this.pid, realTimeParticipant.pid) &&
            Objects.equals(this.name, realTimeParticipant.name) &&
            Objects.equals(this.phone, realTimeParticipant.phone) &&
            Objects.equals(this.state, realTimeParticipant.state) &&
            Objects.equals(this.video, realTimeParticipant.video) &&
            Objects.equals(this.mute, realTimeParticipant.mute) &&
            Objects.equals(this.hand, realTimeParticipant.hand);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pid, name, phone, state, video, mute, hand);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeParticipant {\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
        sb.append("    hand: ").append(toIndentedString(hand)).append("\n");
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

