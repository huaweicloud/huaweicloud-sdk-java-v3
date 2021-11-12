package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 会议配置信息 */
public class RestConfConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSendNotify")

    private Boolean isSendNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSendSms")

    private Boolean isSendSms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSendCalendar")

    private Boolean isSendCalendar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoMute")

    private Boolean isAutoMute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isHardTerminalAutoMute")

    private Boolean isHardTerminalAutoMute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isGuestFreePwd")

    private Boolean isGuestFreePwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callInRestriction")

    private Integer callInRestriction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowGuestStartConf")

    private Boolean allowGuestStartConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guestPwd")

    private String guestPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrIDType")

    private Integer vmrIDType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prolongLength")

    private Integer prolongLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableWaitingRoom")

    private Boolean enableWaitingRoom;

    public RestConfConfigDTO withIsSendNotify(Boolean isSendNotify) {
        this.isSendNotify = isSendNotify;
        return this;
    }

    /** 是否需要发送会议邮件通知。默认值由企业级配置决定。 - True: 需要。 - False: 不需要。
     * 
     * @return isSendNotify */
    public Boolean getIsSendNotify() {
        return isSendNotify;
    }

    public void setIsSendNotify(Boolean isSendNotify) {
        this.isSendNotify = isSendNotify;
    }

    public RestConfConfigDTO withIsSendSms(Boolean isSendSms) {
        this.isSendSms = isSendSms;
        return this;
    }

    /** 是否需要发送会议短信通知。默认值由企业级配置决定。 - True: 需要。 - False: 不需要。
     * 
     * @return isSendSms */
    public Boolean getIsSendSms() {
        return isSendSms;
    }

    public void setIsSendSms(Boolean isSendSms) {
        this.isSendSms = isSendSms;
    }

    public RestConfConfigDTO withIsSendCalendar(Boolean isSendCalendar) {
        this.isSendCalendar = isSendCalendar;
        return this;
    }

    /** 是否需要发送会议通知。默认值由企业级配置决定。 - True: 需要。 - False: 不需要。
     * 
     * @return isSendCalendar */
    public Boolean getIsSendCalendar() {
        return isSendCalendar;
    }

    public void setIsSendCalendar(Boolean isSendCalendar) {
        this.isSendCalendar = isSendCalendar;
    }

    public RestConfConfigDTO withIsAutoMute(Boolean isAutoMute) {
        this.isAutoMute = isAutoMute;
        return this;
    }

    /** 来宾入会,软终端是否自动静音。默认值由企业级配置决定。 - True: 自动静音。 - False: 不自动静音。
     * 
     * @return isAutoMute */
    public Boolean getIsAutoMute() {
        return isAutoMute;
    }

    public void setIsAutoMute(Boolean isAutoMute) {
        this.isAutoMute = isAutoMute;
    }

    public RestConfConfigDTO withIsHardTerminalAutoMute(Boolean isHardTerminalAutoMute) {
        this.isHardTerminalAutoMute = isHardTerminalAutoMute;
        return this;
    }

    /** 来宾入会,硬终端是否自动静音。默认值由企业级配置决定。 - True: 自动静音。 - False: 不自动静音。
     * 
     * @return isHardTerminalAutoMute */
    public Boolean getIsHardTerminalAutoMute() {
        return isHardTerminalAutoMute;
    }

    public void setIsHardTerminalAutoMute(Boolean isHardTerminalAutoMute) {
        this.isHardTerminalAutoMute = isHardTerminalAutoMute;
    }

    public RestConfConfigDTO withIsGuestFreePwd(Boolean isGuestFreePwd) {
        this.isGuestFreePwd = isGuestFreePwd;
        return this;
    }

    /** 是否来宾免密（仅随机会议有效）。 - True: 免密。 - False: 需要密码。
     * 
     * @return isGuestFreePwd */
    public Boolean getIsGuestFreePwd() {
        return isGuestFreePwd;
    }

    public void setIsGuestFreePwd(Boolean isGuestFreePwd) {
        this.isGuestFreePwd = isGuestFreePwd;
    }

    public RestConfConfigDTO withCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
        return this;
    }

    /** 允许呼入的范围。 - 0: 所有用户。 - 2: 企业内用户。 - 3: 被邀请用户。
     * 
     * @return callInRestriction */
    public Integer getCallInRestriction() {
        return callInRestriction;
    }

    public void setCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
    }

    public RestConfConfigDTO withAllowGuestStartConf(Boolean allowGuestStartConf) {
        this.allowGuestStartConf = allowGuestStartConf;
        return this;
    }

    /** 是否允许来宾启动会议(随机会议)。 - True: 允许来宾启动会议。 - False: 禁止来宾启动会议。
     * 
     * @return allowGuestStartConf */
    public Boolean getAllowGuestStartConf() {
        return allowGuestStartConf;
    }

    public void setAllowGuestStartConf(Boolean allowGuestStartConf) {
        this.allowGuestStartConf = allowGuestStartConf;
    }

    public RestConfConfigDTO withGuestPwd(String guestPwd) {
        this.guestPwd = guestPwd;
        return this;
    }

    /** 来宾密码
     * 
     * @return guestPwd */
    public String getGuestPwd() {
        return guestPwd;
    }

    public void setGuestPwd(String guestPwd) {
        this.guestPwd = guestPwd;
    }

    public RestConfConfigDTO withVmrIDType(Integer vmrIDType) {
        this.vmrIDType = vmrIDType;
        return this;
    }

    /** |参数名称：专用VMR会议ID类型 |参数描述：专用VMR会议ID类型 0: 固定ID 1: 随机ID |取值范围：[0,1]| minimum: 0 maximum: 1
     * 
     * @return vmrIDType */
    public Integer getVmrIDType() {
        return vmrIDType;
    }

    public void setVmrIDType(Integer vmrIDType) {
        this.vmrIDType = vmrIDType;
    }

    public RestConfConfigDTO withProlongLength(Integer prolongLength) {
        this.prolongLength = prolongLength;
        return this;
    }

    /** |参数名称：自动延长会议时长，0表示会议不延长 |建议取值范围：[0,60]|
     * 
     * @return prolongLength */
    public Integer getProlongLength() {
        return prolongLength;
    }

    public void setProlongLength(Integer prolongLength) {
        this.prolongLength = prolongLength;
    }

    public RestConfConfigDTO withEnableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
        return this;
    }

    /** 开启或者关闭等候室
     * 
     * @return enableWaitingRoom */
    public Boolean getEnableWaitingRoom() {
        return enableWaitingRoom;
    }

    public void setEnableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestConfConfigDTO restConfConfigDTO = (RestConfConfigDTO) o;
        return Objects.equals(this.isSendNotify, restConfConfigDTO.isSendNotify)
            && Objects.equals(this.isSendSms, restConfConfigDTO.isSendSms)
            && Objects.equals(this.isSendCalendar, restConfConfigDTO.isSendCalendar)
            && Objects.equals(this.isAutoMute, restConfConfigDTO.isAutoMute)
            && Objects.equals(this.isHardTerminalAutoMute, restConfConfigDTO.isHardTerminalAutoMute)
            && Objects.equals(this.isGuestFreePwd, restConfConfigDTO.isGuestFreePwd)
            && Objects.equals(this.callInRestriction, restConfConfigDTO.callInRestriction)
            && Objects.equals(this.allowGuestStartConf, restConfConfigDTO.allowGuestStartConf)
            && Objects.equals(this.guestPwd, restConfConfigDTO.guestPwd)
            && Objects.equals(this.vmrIDType, restConfConfigDTO.vmrIDType)
            && Objects.equals(this.prolongLength, restConfConfigDTO.prolongLength)
            && Objects.equals(this.enableWaitingRoom, restConfConfigDTO.enableWaitingRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSendNotify,
            isSendSms,
            isSendCalendar,
            isAutoMute,
            isHardTerminalAutoMute,
            isGuestFreePwd,
            callInRestriction,
            allowGuestStartConf,
            guestPwd,
            vmrIDType,
            prolongLength,
            enableWaitingRoom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestConfConfigDTO {\n");
        sb.append("    isSendNotify: ").append(toIndentedString(isSendNotify)).append("\n");
        sb.append("    isSendSms: ").append(toIndentedString(isSendSms)).append("\n");
        sb.append("    isSendCalendar: ").append(toIndentedString(isSendCalendar)).append("\n");
        sb.append("    isAutoMute: ").append(toIndentedString(isAutoMute)).append("\n");
        sb.append("    isHardTerminalAutoMute: ").append(toIndentedString(isHardTerminalAutoMute)).append("\n");
        sb.append("    isGuestFreePwd: ").append(toIndentedString(isGuestFreePwd)).append("\n");
        sb.append("    callInRestriction: ").append(toIndentedString(callInRestriction)).append("\n");
        sb.append("    allowGuestStartConf: ").append(toIndentedString(allowGuestStartConf)).append("\n");
        sb.append("    guestPwd: ").append(toIndentedString(guestPwd)).append("\n");
        sb.append("    vmrIDType: ").append(toIndentedString(vmrIDType)).append("\n");
        sb.append("    prolongLength: ").append(toIndentedString(prolongLength)).append("\n");
        sb.append("    enableWaitingRoom: ").append(toIndentedString(enableWaitingRoom)).append("\n");
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
