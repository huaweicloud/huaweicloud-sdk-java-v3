package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CycleSubConfConfigDTO */
public class CycleSubConfConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callInRestriction")

    private Integer callInRestriction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audienceCallInRestriction")

    private Integer audienceCallInRestriction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowGuestStartConf")

    private Boolean allowGuestStartConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableWaitingRoom")

    private Boolean enableWaitingRoom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ShowAudienceCountInfo")

    private ShowAudienceCountInfo showAudienceCountInfo;

    public CycleSubConfConfigDTO withCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
        return this;
    }

    /** |参数名称：允许呼入的范围| |参数描述：允许呼入的范围。 0: 所有用户 1: 非匿名用户（手机pstn入会视为匿名入会） 2: 企业内用户 3: 被邀请用户| |取值范围：[0,3]| minimum: 0
     * maximum: 3
     * 
     * @return callInRestriction */
    public Integer getCallInRestriction() {
        return callInRestriction;
    }

    public void setCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
    }

    public CycleSubConfConfigDTO withAudienceCallInRestriction(Integer audienceCallInRestriction) {
        this.audienceCallInRestriction = audienceCallInRestriction;
        return this;
    }

    /** |参数名称：网络研讨会观众允许呼入的范围| |参数描述：允许呼入的范围。 0: 所有用户 2: 企业内用户和被邀请用户|
     * 
     * @return audienceCallInRestriction */
    public Integer getAudienceCallInRestriction() {
        return audienceCallInRestriction;
    }

    public void setAudienceCallInRestriction(Integer audienceCallInRestriction) {
        this.audienceCallInRestriction = audienceCallInRestriction;
    }

    public CycleSubConfConfigDTO withAllowGuestStartConf(Boolean allowGuestStartConf) {
        this.allowGuestStartConf = allowGuestStartConf;
        return this;
    }

    /** 参数名称：是否允许来宾启动会议(随机会议) false:禁止来宾启动会议 true：允许来宾启动会议
     * 
     * @return allowGuestStartConf */
    public Boolean getAllowGuestStartConf() {
        return allowGuestStartConf;
    }

    public void setAllowGuestStartConf(Boolean allowGuestStartConf) {
        this.allowGuestStartConf = allowGuestStartConf;
    }

    public CycleSubConfConfigDTO withEnableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
        return this;
    }

    /** 是否启用等候室
     * 
     * @return enableWaitingRoom */
    public Boolean getEnableWaitingRoom() {
        return enableWaitingRoom;
    }

    public void setEnableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
    }

    public CycleSubConfConfigDTO withShowAudienceCountInfo(ShowAudienceCountInfo showAudienceCountInfo) {
        this.showAudienceCountInfo = showAudienceCountInfo;
        return this;
    }

    public CycleSubConfConfigDTO withShowAudienceCountInfo(
        Consumer<ShowAudienceCountInfo> showAudienceCountInfoSetter) {
        if (this.showAudienceCountInfo == null) {
            this.showAudienceCountInfo = new ShowAudienceCountInfo();
            showAudienceCountInfoSetter.accept(this.showAudienceCountInfo);
        }

        return this;
    }

    /** Get showAudienceCountInfo
     * 
     * @return showAudienceCountInfo */
    public ShowAudienceCountInfo getShowAudienceCountInfo() {
        return showAudienceCountInfo;
    }

    public void setShowAudienceCountInfo(ShowAudienceCountInfo showAudienceCountInfo) {
        this.showAudienceCountInfo = showAudienceCountInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CycleSubConfConfigDTO cycleSubConfConfigDTO = (CycleSubConfConfigDTO) o;
        return Objects.equals(this.callInRestriction, cycleSubConfConfigDTO.callInRestriction)
            && Objects.equals(this.audienceCallInRestriction, cycleSubConfConfigDTO.audienceCallInRestriction)
            && Objects.equals(this.allowGuestStartConf, cycleSubConfConfigDTO.allowGuestStartConf)
            && Objects.equals(this.enableWaitingRoom, cycleSubConfConfigDTO.enableWaitingRoom)
            && Objects.equals(this.showAudienceCountInfo, cycleSubConfConfigDTO.showAudienceCountInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callInRestriction,
            audienceCallInRestriction,
            allowGuestStartConf,
            enableWaitingRoom,
            showAudienceCountInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CycleSubConfConfigDTO {\n");
        sb.append("    callInRestriction: ").append(toIndentedString(callInRestriction)).append("\n");
        sb.append("    audienceCallInRestriction: ").append(toIndentedString(audienceCallInRestriction)).append("\n");
        sb.append("    allowGuestStartConf: ").append(toIndentedString(allowGuestStartConf)).append("\n");
        sb.append("    enableWaitingRoom: ").append(toIndentedString(enableWaitingRoom)).append("\n");
        sb.append("    showAudienceCountInfo: ").append(toIndentedString(showAudienceCountInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
