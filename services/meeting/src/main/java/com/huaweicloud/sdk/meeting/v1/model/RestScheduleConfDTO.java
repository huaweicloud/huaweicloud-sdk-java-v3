package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会议信息。
 */
public class RestScheduleConfDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    private Integer length;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mediaTypes")

    private String mediaTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupuri")

    private String groupuri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attendees")

    private List<RestAttendeeDTO> attendees = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRecord")

    private Integer isAutoRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryptMode")

    private Integer encryptMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeZoneID")

    private String timeZoneID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordType")

    private Integer recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveAddress")

    private String liveAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auxAddress")

    private String auxAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordAuxStream")

    private Integer recordAuxStream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confConfigInfo")

    private RestConfConfigDTO confConfigInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordAuthType")

    private Integer recordAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrFlag")

    private Integer vmrFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycleParams")

    private CycleParams cycleParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrID")

    private String vmrID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrentParticipants")

    private Integer concurrentParticipants;

    public RestScheduleConfDTO withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 会议开始时间（UTC时间）。格式：yyyy-MM-dd HH:mm。 > * 创建预约会议时，如果没有指定开始时间或填空串，则表示会议马上开始 > * 时间是UTC时间，即0时区的时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public RestScheduleConfDTO withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * 会议持续时长，单位分钟。默认30分钟。最大1440分钟（24小时），最小15分钟。
     * minimum: 15
     * maximum: 1440
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public RestScheduleConfDTO withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 会议主题。最多128个字符。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public RestScheduleConfDTO withMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
        return this;
    }

    /**
     * 会议的媒体类型。 - Voice: 语音会议 - HDVideo: 视频会议
     * @return mediaTypes
     */
    public String getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public RestScheduleConfDTO withGroupuri(String groupuri) {
        this.groupuri = groupuri;
        return this;
    }

    /**
     * 软终端创建即时会议时在当前字段带临时群组ID，由服务器在邀请其他与会者时在或者conference-info头域中携带。长度限制为31个字符。
     * @return groupuri
     */
    public String getGroupuri() {
        return groupuri;
    }

    public void setGroupuri(String groupuri) {
        this.groupuri = groupuri;
    }

    public RestScheduleConfDTO withAttendees(List<RestAttendeeDTO> attendees) {
        this.attendees = attendees;
        return this;
    }

    public RestScheduleConfDTO addAttendeesItem(RestAttendeeDTO attendeesItem) {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }
        this.attendees.add(attendeesItem);
        return this;
    }

    public RestScheduleConfDTO withAttendees(Consumer<List<RestAttendeeDTO>> attendeesSetter) {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }
        attendeesSetter.accept(this.attendees);
        return this;
    }

    /**
     * 与会者列表。
     * @return attendees
     */
    public List<RestAttendeeDTO> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<RestAttendeeDTO> attendees) {
        this.attendees = attendees;
    }

    public RestScheduleConfDTO withIsAutoRecord(Integer isAutoRecord) {
        this.isAutoRecord = isAutoRecord;
        return this;
    }

    /**
     * 会议是否自动启动录制，在录播类型为:录播、直播+录播时有效。默认为不自动启动。 - 0: 不自动启动录制 - 1: 自动启动录制
     * minimum: 0
     * maximum: 1
     * @return isAutoRecord
     */
    public Integer getIsAutoRecord() {
        return isAutoRecord;
    }

    public void setIsAutoRecord(Integer isAutoRecord) {
        this.isAutoRecord = isAutoRecord;
    }

    public RestScheduleConfDTO withEncryptMode(Integer encryptMode) {
        this.encryptMode = encryptMode;
        return this;
    }

    /**
     * 会议媒体加密模式。默认值由企业级的配置填充。 - 0: 自适应加密 - 1: 强制加密 - 2: 不加密
     * minimum: 0
     * maximum: 2
     * @return encryptMode
     */
    public Integer getEncryptMode() {
        return encryptMode;
    }

    public void setEncryptMode(Integer encryptMode) {
        this.encryptMode = encryptMode;
    }

    public RestScheduleConfDTO withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 会议通知短信或邮件的语言。默认中文。 - zh-CN: 简体中文 - en-US: 美国英文
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public RestScheduleConfDTO withTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
        return this;
    }

    /**
     * 会议通知中会议时间的时区信息。时区信息，参考[[时区映射关系](https://support.huaweicloud.com/api-meeting/meeting_21_0110.html#ZH-CN_TOPIC_0212714472__table137407441463)](tag:hws)[[时区映射关系](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0110.html#ZH-CN_TOPIC_0212714472__table137407441463)](tag:hk)。 > * 举例：“timeZoneID”:\"26\"，则通过华为云会议发送的会议通知中的时间将会标记为如“2021/11/11 星期四 00:00 - 02:00 (GMT) 格林威治标准时间:都柏林, 爱丁堡, 里斯本, 伦敦”。 > * 非周期会议，如果会议通知是通过第三方系统发送，则这个字段不用填写。
     * @return timeZoneID
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    public void setTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    public RestScheduleConfDTO withRecordType(Integer recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 录播类型。默认为禁用。 - 0: 禁用 - 1: 直播 - 2: 录播 - 3: 直播+录播
     * minimum: 0
     * maximum: 3
     * @return recordType
     */
    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public RestScheduleConfDTO withLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
        return this;
    }

    /**
     * 主流直播推流地址，在录播类型为 :直播、直播+录播时有效。最大不超过255个字符。
     * @return liveAddress
     */
    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public RestScheduleConfDTO withAuxAddress(String auxAddress) {
        this.auxAddress = auxAddress;
        return this;
    }

    /**
     * 辅流直播推流地址，在录播类型为 :直播、直播+录播时有效。最大不超过255个字符。
     * @return auxAddress
     */
    public String getAuxAddress() {
        return auxAddress;
    }

    public void setAuxAddress(String auxAddress) {
        this.auxAddress = auxAddress;
    }

    public RestScheduleConfDTO withRecordAuxStream(Integer recordAuxStream) {
        this.recordAuxStream = recordAuxStream;
        return this;
    }

    /**
     * 是否录制辅流，在录播类型为：录播、录播+直播时有效。默认只录制视频主流，不录制辅流。  - 0: 不录制  - 1: 录制
     * minimum: 0
     * maximum: 1
     * @return recordAuxStream
     */
    public Integer getRecordAuxStream() {
        return recordAuxStream;
    }

    public void setRecordAuxStream(Integer recordAuxStream) {
        this.recordAuxStream = recordAuxStream;
    }

    public RestScheduleConfDTO withConfConfigInfo(RestConfConfigDTO confConfigInfo) {
        this.confConfigInfo = confConfigInfo;
        return this;
    }

    public RestScheduleConfDTO withConfConfigInfo(Consumer<RestConfConfigDTO> confConfigInfoSetter) {
        if (this.confConfigInfo == null) {
            this.confConfigInfo = new RestConfConfigDTO();
            confConfigInfoSetter.accept(this.confConfigInfo);
        }

        return this;
    }

    /**
     * Get confConfigInfo
     * @return confConfigInfo
     */
    public RestConfConfigDTO getConfConfigInfo() {
        return confConfigInfo;
    }

    public void setConfConfigInfo(RestConfConfigDTO confConfigInfo) {
        this.confConfigInfo = confConfigInfo;
    }

    public RestScheduleConfDTO withRecordAuthType(Integer recordAuthType) {
        this.recordAuthType = recordAuthType;
        return this;
    }

    /**
     * 录播观看鉴权方式，在录播类型为:录播、直播+录播时有效。 - 0: 可通过链接观看/下载 - 1: 企业用户可观看/下载 - 2: 与会者可观看/下载
     * minimum: 0
     * maximum: 2
     * @return recordAuthType
     */
    public Integer getRecordAuthType() {
        return recordAuthType;
    }

    public void setRecordAuthType(Integer recordAuthType) {
        this.recordAuthType = recordAuthType;
    }

    public RestScheduleConfDTO withVmrFlag(Integer vmrFlag) {
        this.vmrFlag = vmrFlag;
        return this;
    }

    /**
     * 是否使用云会议室或者个人会议ID召开预约会议。默认0。 - 0: 不使用云会议室或者个人会议ID - 1: 使用云会议室或者个人会议ID
     * minimum: 0
     * maximum: 1
     * @return vmrFlag
     */
    public Integer getVmrFlag() {
        return vmrFlag;
    }

    public void setVmrFlag(Integer vmrFlag) {
        this.vmrFlag = vmrFlag;
    }

    public RestScheduleConfDTO withCycleParams(CycleParams cycleParams) {
        this.cycleParams = cycleParams;
        return this;
    }

    public RestScheduleConfDTO withCycleParams(Consumer<CycleParams> cycleParamsSetter) {
        if (this.cycleParams == null) {
            this.cycleParams = new CycleParams();
            cycleParamsSetter.accept(this.cycleParams);
        }

        return this;
    }

    /**
     * Get cycleParams
     * @return cycleParams
     */
    public CycleParams getCycleParams() {
        return cycleParams;
    }

    public void setCycleParams(CycleParams cycleParams) {
        this.cycleParams = cycleParams;
    }

    public RestScheduleConfDTO withVmrID(String vmrID) {
        this.vmrID = vmrID;
        return this;
    }

    /**
     * 绑定给当前创会帐号的VMR ID。通过[[查询云会议室及个人会议ID](https://support.huaweicloud.com/api-meeting/meeting_21_1106.html)](tag:hws)[[查询云会议室及个人会议ID](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_1106.html)](tag:hk)接口获取。 > * vmrID取上述查询接口中返回的id，不是vmrId > * 创建个人会议ID的会议时，使用vmrMode=0的VMR；创建云会议室的会议时，使用vmrMode=1的VMR
     * @return vmrID
     */
    public String getVmrID() {
        return vmrID;
    }

    public void setVmrID(String vmrID) {
        this.vmrID = vmrID;
    }

    public RestScheduleConfDTO withConcurrentParticipants(Integer concurrentParticipants) {
        this.concurrentParticipants = concurrentParticipants;
        return this;
    }

    /**
     * 会议最大与会人数。默认值0。 * 0：无限制 * 大于0：会议最大与会人数 
     * @return concurrentParticipants
     */
    public Integer getConcurrentParticipants() {
        return concurrentParticipants;
    }

    public void setConcurrentParticipants(Integer concurrentParticipants) {
        this.concurrentParticipants = concurrentParticipants;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestScheduleConfDTO that = (RestScheduleConfDTO) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.length, that.length)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.mediaTypes, that.mediaTypes)
            && Objects.equals(this.groupuri, that.groupuri) && Objects.equals(this.attendees, that.attendees)
            && Objects.equals(this.isAutoRecord, that.isAutoRecord)
            && Objects.equals(this.encryptMode, that.encryptMode) && Objects.equals(this.language, that.language)
            && Objects.equals(this.timeZoneID, that.timeZoneID) && Objects.equals(this.recordType, that.recordType)
            && Objects.equals(this.liveAddress, that.liveAddress) && Objects.equals(this.auxAddress, that.auxAddress)
            && Objects.equals(this.recordAuxStream, that.recordAuxStream)
            && Objects.equals(this.confConfigInfo, that.confConfigInfo)
            && Objects.equals(this.recordAuthType, that.recordAuthType) && Objects.equals(this.vmrFlag, that.vmrFlag)
            && Objects.equals(this.cycleParams, that.cycleParams) && Objects.equals(this.vmrID, that.vmrID)
            && Objects.equals(this.concurrentParticipants, that.concurrentParticipants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            length,
            subject,
            mediaTypes,
            groupuri,
            attendees,
            isAutoRecord,
            encryptMode,
            language,
            timeZoneID,
            recordType,
            liveAddress,
            auxAddress,
            recordAuxStream,
            confConfigInfo,
            recordAuthType,
            vmrFlag,
            cycleParams,
            vmrID,
            concurrentParticipants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestScheduleConfDTO {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
        sb.append("    groupuri: ").append(toIndentedString(groupuri)).append("\n");
        sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
        sb.append("    isAutoRecord: ").append(toIndentedString(isAutoRecord)).append("\n");
        sb.append("    encryptMode: ").append(toIndentedString(encryptMode)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    timeZoneID: ").append(toIndentedString(timeZoneID)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    liveAddress: ").append(toIndentedString(liveAddress)).append("\n");
        sb.append("    auxAddress: ").append(toIndentedString(auxAddress)).append("\n");
        sb.append("    recordAuxStream: ").append(toIndentedString(recordAuxStream)).append("\n");
        sb.append("    confConfigInfo: ").append(toIndentedString(confConfigInfo)).append("\n");
        sb.append("    recordAuthType: ").append(toIndentedString(recordAuthType)).append("\n");
        sb.append("    vmrFlag: ").append(toIndentedString(vmrFlag)).append("\n");
        sb.append("    cycleParams: ").append(toIndentedString(cycleParams)).append("\n");
        sb.append("    vmrID: ").append(toIndentedString(vmrID)).append("\n");
        sb.append("    concurrentParticipants: ").append(toIndentedString(concurrentParticipants)).append("\n");
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
