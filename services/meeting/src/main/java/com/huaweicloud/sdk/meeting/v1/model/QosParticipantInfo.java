package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 与会者信息。
 */
public class QosParticipantInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUID")

    @JacksonXmlProperty(localName = "confUUID")

    private String confUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    @JacksonXmlProperty(localName = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    @JacksonXmlProperty(localName = "participantID")

    private String participantID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    @JacksonXmlProperty(localName = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    @JacksonXmlProperty(localName = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    @JacksonXmlProperty(localName = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminalType")

    @JacksonXmlProperty(localName = "terminalType")

    private String terminalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    @JacksonXmlProperty(localName = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipAddress")

    @JacksonXmlProperty(localName = "ipAddress")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    @JacksonXmlProperty(localName = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    @JacksonXmlProperty(localName = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    @JacksonXmlProperty(localName = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appVersion")

    @JacksonXmlProperty(localName = "appVersion")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "joinTime")

    @JacksonXmlProperty(localName = "joinTime")

    private Long joinTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leftTime")

    @JacksonXmlProperty(localName = "leftTime")

    private Long leftTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemInfo")

    @JacksonXmlProperty(localName = "systemInfo")

    private String systemInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkType")

    @JacksonXmlProperty(localName = "networkType")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm")

    @JacksonXmlProperty(localName = "alarm")

    private String alarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audioAlarmSend")

    @JacksonXmlProperty(localName = "audioAlarmSend")

    private String audioAlarmSend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videoAlarmSend")

    @JacksonXmlProperty(localName = "videoAlarmSend")

    private String videoAlarmSend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screenAlarmSend")

    @JacksonXmlProperty(localName = "screenAlarmSend")

    private String screenAlarmSend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audioAlarmRec")

    @JacksonXmlProperty(localName = "audioAlarmRec")

    private String audioAlarmRec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videoAlarmRec")

    @JacksonXmlProperty(localName = "videoAlarmRec")

    private String videoAlarmRec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screenAlarmRec")

    @JacksonXmlProperty(localName = "screenAlarmRec")

    private String screenAlarmRec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuAlarm")

    @JacksonXmlProperty(localName = "cpuAlarm")

    private String cpuAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microphoneInfo")

    @JacksonXmlProperty(localName = "microphoneInfo")

    private String microphoneInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speakerInfo")

    @JacksonXmlProperty(localName = "speakerInfo")

    private String speakerInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cameraInfo")

    @JacksonXmlProperty(localName = "cameraInfo")

    private String cameraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataCenter")

    @JacksonXmlProperty(localName = "dataCenter")

    private String dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leftReason")

    @JacksonXmlProperty(localName = "leftReason")

    private Integer leftReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existQos")

    @JacksonXmlProperty(localName = "existQos")

    private Boolean existQos;

    public QosParticipantInfo withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    /**
     * 会议的UUID。
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    public QosParticipantInfo withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议ID。
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public QosParticipantInfo withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 入会UUID。
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public QosParticipantInfo withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 用户UUID。
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public QosParticipantInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 与会者的名称（昵称）。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public QosParticipantInfo withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public QosParticipantInfo withTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }

    /**
     * 入会终端类型。 - PC: PC机。 - MOBILE: 手机。 - PAD：PAD设备。 - MAC：MAC设备。 - WEB：WEB方式入会，如通过WebRTC入会。 - ROOM: 会议室。 - 硬件终端：显示具体的硬件设备类型，如TE50, HUAWEI IDEAHUB, CISCO等。 - OTHER: 其他设备。
     * @return terminalType
     */
    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public QosParticipantInfo withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 与会者角色。 - host：主持人。 - guest：来宾。 - audience：观众。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public QosParticipantInfo withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 与会者的IP地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public QosParticipantInfo withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 国家。
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public QosParticipantInfo withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 省市（仅限中国）。
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public QosParticipantInfo withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 城市（仅限中国）。
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public QosParticipantInfo withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * 华为云会议APP版本。
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public QosParticipantInfo withJoinTime(Long joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    /**
     * 入会时间(UTC时间), Unix时间戳（单位毫秒）。
     * @return joinTime
     */
    public Long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Long joinTime) {
        this.joinTime = joinTime;
    }

    public QosParticipantInfo withLeftTime(Long leftTime) {
        this.leftTime = leftTime;
        return this;
    }

    /**
     * 离会时间(UTC时间), Unix时间戳（单位毫秒）。 说明： * 与会者未离会：leftTime = 0。 * 与会者已离会：leftTime = 实际离会时间。
     * @return leftTime
     */
    public Long getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(Long leftTime) {
        this.leftTime = leftTime;
    }

    public QosParticipantInfo withSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }

    /**
     * 系统信息。
     * @return systemInfo
     */
    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
    }

    public QosParticipantInfo withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 网络类型。
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public QosParticipantInfo withAlarm(String alarm) {
        this.alarm = alarm;
        return this;
    }

    /**
     * 总体告警 YES/NO。 说明： * 音频（发送/接收），视频（发送/接收），屏幕共享（发送/接收），CPU任一项产生告警，总体告警状态即为 YES。
     * @return alarm
     */
    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }

    public QosParticipantInfo withAudioAlarmSend(String audioAlarmSend) {
        this.audioAlarmSend = audioAlarmSend;
        return this;
    }

    /**
     * 音频发送告警 YES / NO。 说明： * 发送音频的抖动，时延，丢包率任一项产生阈值告警，则音频发送告警状态为YES。
     * @return audioAlarmSend
     */
    public String getAudioAlarmSend() {
        return audioAlarmSend;
    }

    public void setAudioAlarmSend(String audioAlarmSend) {
        this.audioAlarmSend = audioAlarmSend;
    }

    public QosParticipantInfo withVideoAlarmSend(String videoAlarmSend) {
        this.videoAlarmSend = videoAlarmSend;
        return this;
    }

    /**
     * 视频发送告警 YES / NO。 说明： * 发送视频的抖动，时延，丢包率，分辨率任一项产生阈值告警，则视频发送告警状态为YES。
     * @return videoAlarmSend
     */
    public String getVideoAlarmSend() {
        return videoAlarmSend;
    }

    public void setVideoAlarmSend(String videoAlarmSend) {
        this.videoAlarmSend = videoAlarmSend;
    }

    public QosParticipantInfo withScreenAlarmSend(String screenAlarmSend) {
        this.screenAlarmSend = screenAlarmSend;
        return this;
    }

    /**
     * 屏幕共享发送告警 YES / NO。 说明： * 发送屏幕共享的抖动，时延，丢包率任一项产生阈值告警，则屏幕共享发送告警状态为YES。
     * @return screenAlarmSend
     */
    public String getScreenAlarmSend() {
        return screenAlarmSend;
    }

    public void setScreenAlarmSend(String screenAlarmSend) {
        this.screenAlarmSend = screenAlarmSend;
    }

    public QosParticipantInfo withAudioAlarmRec(String audioAlarmRec) {
        this.audioAlarmRec = audioAlarmRec;
        return this;
    }

    /**
     * 音频接收告警 YES / NO。 说明： * 接收音频的抖动，时延，丢包率任一项产生阈值告警，则音频接收告警状态为YES。
     * @return audioAlarmRec
     */
    public String getAudioAlarmRec() {
        return audioAlarmRec;
    }

    public void setAudioAlarmRec(String audioAlarmRec) {
        this.audioAlarmRec = audioAlarmRec;
    }

    public QosParticipantInfo withVideoAlarmRec(String videoAlarmRec) {
        this.videoAlarmRec = videoAlarmRec;
        return this;
    }

    /**
     * 视频接收告警 YES / NO。 说明： * 接收视频的抖动，时延，丢包率任一项产生阈值告警，则视频接收告警状态为YES。
     * @return videoAlarmRec
     */
    public String getVideoAlarmRec() {
        return videoAlarmRec;
    }

    public void setVideoAlarmRec(String videoAlarmRec) {
        this.videoAlarmRec = videoAlarmRec;
    }

    public QosParticipantInfo withScreenAlarmRec(String screenAlarmRec) {
        this.screenAlarmRec = screenAlarmRec;
        return this;
    }

    /**
     * 屏幕共享接收告警 YES / NO。 说明： * 接收屏幕共享的抖动，时延，丢包率任一项产生阈值告警，则屏幕共享接收告警状态为YES。
     * @return screenAlarmRec
     */
    public String getScreenAlarmRec() {
        return screenAlarmRec;
    }

    public void setScreenAlarmRec(String screenAlarmRec) {
        this.screenAlarmRec = screenAlarmRec;
    }

    public QosParticipantInfo withCpuAlarm(String cpuAlarm) {
        this.cpuAlarm = cpuAlarm;
        return this;
    }

    /**
     * CPU告警 YES / NO。 说明： * 端侧的APP最大CPU使用率或系统最大CPU使用率任一项产生阈值告警，则CPU告警状态为YES。
     * @return cpuAlarm
     */
    public String getCpuAlarm() {
        return cpuAlarm;
    }

    public void setCpuAlarm(String cpuAlarm) {
        this.cpuAlarm = cpuAlarm;
    }

    public QosParticipantInfo withMicrophoneInfo(String microphoneInfo) {
        this.microphoneInfo = microphoneInfo;
        return this;
    }

    /**
     * 麦克风。
     * @return microphoneInfo
     */
    public String getMicrophoneInfo() {
        return microphoneInfo;
    }

    public void setMicrophoneInfo(String microphoneInfo) {
        this.microphoneInfo = microphoneInfo;
    }

    public QosParticipantInfo withSpeakerInfo(String speakerInfo) {
        this.speakerInfo = speakerInfo;
        return this;
    }

    /**
     * 扬声器。
     * @return speakerInfo
     */
    public String getSpeakerInfo() {
        return speakerInfo;
    }

    public void setSpeakerInfo(String speakerInfo) {
        this.speakerInfo = speakerInfo;
    }

    public QosParticipantInfo withCameraInfo(String cameraInfo) {
        this.cameraInfo = cameraInfo;
        return this;
    }

    /**
     * 摄像头。
     * @return cameraInfo
     */
    public String getCameraInfo() {
        return cameraInfo;
    }

    public void setCameraInfo(String cameraInfo) {
        this.cameraInfo = cameraInfo;
    }

    public QosParticipantInfo withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * 数据中心。
     * @return dataCenter
     */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public QosParticipantInfo withLeftReason(Integer leftReason) {
        this.leftReason = leftReason;
        return this;
    }

    /**
     * 离会原因。此字段仅标识离会原因，不做为是否已离会的判断依据。正在与会人员的离会原因初始值 = 0。 说明： * 0：正常离会。 * 1：网络异常离会。
     * @return leftReason
     */
    public Integer getLeftReason() {
        return leftReason;
    }

    public void setLeftReason(Integer leftReason) {
        this.leftReason = leftReason;
    }

    public QosParticipantInfo withExistQos(Boolean existQos) {
        this.existQos = existQos;
        return this;
    }

    /**
     * 与会者是否存在QoS数据。 true：存在QoS数据。 false：不存在QoS数据。
     * @return existQos
     */
    public Boolean getExistQos() {
        return existQos;
    }

    public void setExistQos(Boolean existQos) {
        this.existQos = existQos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QosParticipantInfo qosParticipantInfo = (QosParticipantInfo) o;
        return Objects.equals(this.confUUID, qosParticipantInfo.confUUID)
            && Objects.equals(this.conferenceID, qosParticipantInfo.conferenceID)
            && Objects.equals(this.participantID, qosParticipantInfo.participantID)
            && Objects.equals(this.userUUID, qosParticipantInfo.userUUID)
            && Objects.equals(this.displayName, qosParticipantInfo.displayName)
            && Objects.equals(this.deptName, qosParticipantInfo.deptName)
            && Objects.equals(this.terminalType, qosParticipantInfo.terminalType)
            && Objects.equals(this.role, qosParticipantInfo.role)
            && Objects.equals(this.ipAddress, qosParticipantInfo.ipAddress)
            && Objects.equals(this.country, qosParticipantInfo.country)
            && Objects.equals(this.province, qosParticipantInfo.province)
            && Objects.equals(this.city, qosParticipantInfo.city)
            && Objects.equals(this.appVersion, qosParticipantInfo.appVersion)
            && Objects.equals(this.joinTime, qosParticipantInfo.joinTime)
            && Objects.equals(this.leftTime, qosParticipantInfo.leftTime)
            && Objects.equals(this.systemInfo, qosParticipantInfo.systemInfo)
            && Objects.equals(this.networkType, qosParticipantInfo.networkType)
            && Objects.equals(this.alarm, qosParticipantInfo.alarm)
            && Objects.equals(this.audioAlarmSend, qosParticipantInfo.audioAlarmSend)
            && Objects.equals(this.videoAlarmSend, qosParticipantInfo.videoAlarmSend)
            && Objects.equals(this.screenAlarmSend, qosParticipantInfo.screenAlarmSend)
            && Objects.equals(this.audioAlarmRec, qosParticipantInfo.audioAlarmRec)
            && Objects.equals(this.videoAlarmRec, qosParticipantInfo.videoAlarmRec)
            && Objects.equals(this.screenAlarmRec, qosParticipantInfo.screenAlarmRec)
            && Objects.equals(this.cpuAlarm, qosParticipantInfo.cpuAlarm)
            && Objects.equals(this.microphoneInfo, qosParticipantInfo.microphoneInfo)
            && Objects.equals(this.speakerInfo, qosParticipantInfo.speakerInfo)
            && Objects.equals(this.cameraInfo, qosParticipantInfo.cameraInfo)
            && Objects.equals(this.dataCenter, qosParticipantInfo.dataCenter)
            && Objects.equals(this.leftReason, qosParticipantInfo.leftReason)
            && Objects.equals(this.existQos, qosParticipantInfo.existQos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confUUID,
            conferenceID,
            participantID,
            userUUID,
            displayName,
            deptName,
            terminalType,
            role,
            ipAddress,
            country,
            province,
            city,
            appVersion,
            joinTime,
            leftTime,
            systemInfo,
            networkType,
            alarm,
            audioAlarmSend,
            videoAlarmSend,
            screenAlarmSend,
            audioAlarmRec,
            videoAlarmRec,
            screenAlarmRec,
            cpuAlarm,
            microphoneInfo,
            speakerInfo,
            cameraInfo,
            dataCenter,
            leftReason,
            existQos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QosParticipantInfo {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
        sb.append("    leftTime: ").append(toIndentedString(leftTime)).append("\n");
        sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
        sb.append("    audioAlarmSend: ").append(toIndentedString(audioAlarmSend)).append("\n");
        sb.append("    videoAlarmSend: ").append(toIndentedString(videoAlarmSend)).append("\n");
        sb.append("    screenAlarmSend: ").append(toIndentedString(screenAlarmSend)).append("\n");
        sb.append("    audioAlarmRec: ").append(toIndentedString(audioAlarmRec)).append("\n");
        sb.append("    videoAlarmRec: ").append(toIndentedString(videoAlarmRec)).append("\n");
        sb.append("    screenAlarmRec: ").append(toIndentedString(screenAlarmRec)).append("\n");
        sb.append("    cpuAlarm: ").append(toIndentedString(cpuAlarm)).append("\n");
        sb.append("    microphoneInfo: ").append(toIndentedString(microphoneInfo)).append("\n");
        sb.append("    speakerInfo: ").append(toIndentedString(speakerInfo)).append("\n");
        sb.append("    cameraInfo: ").append(toIndentedString(cameraInfo)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    leftReason: ").append(toIndentedString(leftReason)).append("\n");
        sb.append("    existQos: ").append(toIndentedString(existQos)).append("\n");
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
