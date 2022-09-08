package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会议信息
 */
public class ConferenceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeZoneID")

    private String timeZoneID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mediaTypes")

    private String mediaTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceState")

    private String conferenceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessNumber")

    private String accessNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passwordEntry")

    private List<PasswordEntry> passwordEntry = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduserName")

    private String scheduserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceType")

    private Integer conferenceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confType")

    private String confType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycleParams")

    private CycleParams cycleParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoMute")

    private Integer isAutoMute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRecord")

    private Integer isAutoRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chairJoinUri")

    private String chairJoinUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guestJoinUri")

    private String guestJoinUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audienceJoinUri")

    private String audienceJoinUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordType")

    private Integer recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auxAddress")

    private String auxAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveAddress")

    private String liveAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordAuxStream")

    private Integer recordAuxStream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordAuthType")

    private Integer recordAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveUrl")

    private String liveUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confConfigInfo")

    private RestConfConfigDTO confConfigInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrFlag")

    private Integer vmrFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isHasRecordFile")

    private Boolean isHasRecordFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrConferenceID")

    private String vmrConferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUID")

    private String confUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partAttendeeInfo")

    private List<PartAttendee> partAttendeeInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminlCount")

    private Integer terminlCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normalCount")

    private Integer normalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrID")

    private String vmrID;

    /**
     * 会议角色
     */
    public static final class RoleEnum {

        /**
         * Enum CHAIR for value: "chair"
         */
        public static final RoleEnum CHAIR = new RoleEnum("chair");

        /**
         * Enum GENERAL for value: "general"
         */
        public static final RoleEnum GENERAL = new RoleEnum("general");

        /**
         * Enum AUDIENCE for value: "audience"
         */
        public static final RoleEnum AUDIENCE = new RoleEnum("audience");

        private static final Map<String, RoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleEnum> createStaticFields() {
            Map<String, RoleEnum> map = new HashMap<>();
            map.put("chair", CHAIR);
            map.put("general", GENERAL);
            map.put("audience", AUDIENCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RoleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RoleEnum(value);
            }
            return result;
        }

        public static RoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RoleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleEnum) {
                return this.value.equals(((RoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private RoleEnum role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webinar")

    private Boolean webinar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiStreamFlag")

    private Integer multiStreamFlag;

    /**
     * 会议类型
     */
    public static final class ConfModeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final ConfModeEnum COMMON = new ConfModeEnum("COMMON");

        /**
         * Enum RTC for value: "RTC"
         */
        public static final ConfModeEnum RTC = new ConfModeEnum("RTC");

        private static final Map<String, ConfModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfModeEnum> createStaticFields() {
            Map<String, ConfModeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("RTC", RTC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConfModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConfModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConfModeEnum(value);
            }
            return result;
        }

        public static ConfModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConfModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfModeEnum) {
                return this.value.equals(((ConfModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confMode")

    private ConfModeEnum confMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduleVmr")

    private Boolean scheduleVmr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrentParticipants")

    private Integer concurrentParticipants;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picDisplay")

    private MultiPicDisplayDO picDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subConfs")

    private List<CycleSubConf> subConfs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycleSubConfID")

    private String cycleSubConfID;

    public ConferenceInfo withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议ID。长度限制为32个字符。
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public ConferenceInfo withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 会议主题。长度限制为128个字符。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ConferenceInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 会议方数。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ConferenceInfo withTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
        return this;
    }

    /**
     * 时区参考。
     * @return timeZoneID
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    public void setTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    public ConferenceInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 会议起始时间 (YYYY-MM-DD HH:MM )。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ConferenceInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 会议结束时间 (YYYY-MM-DD HH:MM )。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ConferenceInfo withMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
        return this;
    }

    /**
     * 会议的媒体类型。 由1个或多个枚举String组成，多个枚举时，每个枚举值之间通过”,”逗号分隔。 - Voice: 语音。 - Video: 标清视频。 - HDVideo: 高清视频（与Video互斥，如果同时选择Video、HDVideo，则系统默认选择Video）。 - Telepresence: 智真(与HDVideo、Video互斥，如果同时选择，系统使用Telepresence)。（预留字段） - Data: 多媒体。
     * @return mediaTypes
     */
    public String getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public ConferenceInfo withConferenceState(String conferenceState) {
        this.conferenceState = conferenceState;
        return this;
    }

    /**
     * 目前只会返回Created和Schedule状态， 如果会议已经召开返回Created状态，否则返回Schedule状态。 - Schedule: 预定状态。 - Creating: 正在创建状态。 - Created: 会议已经被创建，并正在召开。 - Destroyed: 会议已经关闭。
     * @return conferenceState
     */
    public String getConferenceState() {
        return conferenceState;
    }

    public void setConferenceState(String conferenceState) {
        this.conferenceState = conferenceState;
    }

    public ConferenceInfo withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 会议语言。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ConferenceInfo withAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
        return this;
    }

    /**
     * 会议接入码。
     * @return accessNumber
     */
    public String getAccessNumber() {
        return accessNumber;
    }

    public void setAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
    }

    public ConferenceInfo withPasswordEntry(List<PasswordEntry> passwordEntry) {
        this.passwordEntry = passwordEntry;
        return this;
    }

    public ConferenceInfo addPasswordEntryItem(PasswordEntry passwordEntryItem) {
        if (this.passwordEntry == null) {
            this.passwordEntry = new ArrayList<>();
        }
        this.passwordEntry.add(passwordEntryItem);
        return this;
    }

    public ConferenceInfo withPasswordEntry(Consumer<List<PasswordEntry>> passwordEntrySetter) {
        if (this.passwordEntry == null) {
            this.passwordEntry = new ArrayList<>();
        }
        passwordEntrySetter.accept(this.passwordEntry);
        return this;
    }

    /**
     * 会议密码条目。预订者返回主持人密码和来宾密码。 - 主持人查询时返回主持人密码。 - 来宾查询时返回来宾密码。
     * @return passwordEntry
     */
    public List<PasswordEntry> getPasswordEntry() {
        return passwordEntry;
    }

    public void setPasswordEntry(List<PasswordEntry> passwordEntry) {
        this.passwordEntry = passwordEntry;
    }

    public ConferenceInfo withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 会议预订者UUID。
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public ConferenceInfo withScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
        return this;
    }

    /**
     * 会议预订者帐号名称。长度最大限制为96个字符。
     * @return scheduserName
     */
    public String getScheduserName() {
        return scheduserName;
    }

    public void setScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
    }

    public ConferenceInfo withConferenceType(Integer conferenceType) {
        this.conferenceType = conferenceType;
        return this;
    }

    /**
     * - 0: 普通会议。 - 2: 周期性会议。
     * @return conferenceType
     */
    public Integer getConferenceType() {
        return conferenceType;
    }

    public void setConferenceType(Integer conferenceType) {
        this.conferenceType = conferenceType;
    }

    public ConferenceInfo withConfType(String confType) {
        this.confType = confType;
        return this;
    }

    /**
     * 会议类型。 - FUTURE - IMMEDIATELY - CYCLE
     * @return confType
     */
    public String getConfType() {
        return confType;
    }

    public void setConfType(String confType) {
        this.confType = confType;
    }

    public ConferenceInfo withCycleParams(CycleParams cycleParams) {
        this.cycleParams = cycleParams;
        return this;
    }

    public ConferenceInfo withCycleParams(Consumer<CycleParams> cycleParamsSetter) {
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

    public ConferenceInfo withIsAutoMute(Integer isAutoMute) {
        this.isAutoMute = isAutoMute;
        return this;
    }

    /**
     * 是否入会自动静音。 - 0: 不自动静音 - 1: 自动静音
     * @return isAutoMute
     */
    public Integer getIsAutoMute() {
        return isAutoMute;
    }

    public void setIsAutoMute(Integer isAutoMute) {
        this.isAutoMute = isAutoMute;
    }

    public ConferenceInfo withIsAutoRecord(Integer isAutoRecord) {
        this.isAutoRecord = isAutoRecord;
        return this;
    }

    /**
     * 是否自动开启录音。 - 0: 不自动启动。 - 1: 自动启动。
     * @return isAutoRecord
     */
    public Integer getIsAutoRecord() {
        return isAutoRecord;
    }

    public void setIsAutoRecord(Integer isAutoRecord) {
        this.isAutoRecord = isAutoRecord;
    }

    public ConferenceInfo withChairJoinUri(String chairJoinUri) {
        this.chairJoinUri = chairJoinUri;
        return this;
    }

    /**
     * 主持人会议链接地址。
     * @return chairJoinUri
     */
    public String getChairJoinUri() {
        return chairJoinUri;
    }

    public void setChairJoinUri(String chairJoinUri) {
        this.chairJoinUri = chairJoinUri;
    }

    public ConferenceInfo withGuestJoinUri(String guestJoinUri) {
        this.guestJoinUri = guestJoinUri;
        return this;
    }

    /**
     * 普通与会者会议链接地址。最大长度1024。
     * @return guestJoinUri
     */
    public String getGuestJoinUri() {
        return guestJoinUri;
    }

    public void setGuestJoinUri(String guestJoinUri) {
        this.guestJoinUri = guestJoinUri;
    }

    public ConferenceInfo withAudienceJoinUri(String audienceJoinUri) {
        this.audienceJoinUri = audienceJoinUri;
        return this;
    }

    /**
     * 旁听者会议链接地址。最大长度1024。（预留字段）
     * @return audienceJoinUri
     */
    public String getAudienceJoinUri() {
        return audienceJoinUri;
    }

    public void setAudienceJoinUri(String audienceJoinUri) {
        this.audienceJoinUri = audienceJoinUri;
    }

    public ConferenceInfo withRecordType(Integer recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 录播类型。 - 0: 禁用 。 - 1: 直播 。 - 2: 录播 。 - 3: 直播+录播。
     * @return recordType
     */
    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public ConferenceInfo withAuxAddress(String auxAddress) {
        this.auxAddress = auxAddress;
        return this;
    }

    /**
     * 辅流直播地址。
     * @return auxAddress
     */
    public String getAuxAddress() {
        return auxAddress;
    }

    public void setAuxAddress(String auxAddress) {
        this.auxAddress = auxAddress;
    }

    public ConferenceInfo withLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
        return this;
    }

    /**
     * 主流直播地址。
     * @return liveAddress
     */
    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public ConferenceInfo withRecordAuxStream(Integer recordAuxStream) {
        this.recordAuxStream = recordAuxStream;
        return this;
    }

    /**
     * 是否录制辅流。  - 0: 否。  - 1: 是。
     * @return recordAuxStream
     */
    public Integer getRecordAuxStream() {
        return recordAuxStream;
    }

    public void setRecordAuxStream(Integer recordAuxStream) {
        this.recordAuxStream = recordAuxStream;
    }

    public ConferenceInfo withRecordAuthType(Integer recordAuthType) {
        this.recordAuthType = recordAuthType;
        return this;
    }

    /**
     * 录播鉴权方式。录播类型为:录播、直播+录播时有效。  - 0: 老的鉴权方式，url中携带token鉴权。  - 1: 企业内会议用户鉴权。  - 2: 会议内会议用户鉴权。
     * @return recordAuthType
     */
    public Integer getRecordAuthType() {
        return recordAuthType;
    }

    public void setRecordAuthType(Integer recordAuthType) {
        this.recordAuthType = recordAuthType;
    }

    public ConferenceInfo withLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
        return this;
    }

    /**
     * 直播地址。（配置直播房间时会返回）
     * @return liveUrl
     */
    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }

    public ConferenceInfo withConfConfigInfo(RestConfConfigDTO confConfigInfo) {
        this.confConfigInfo = confConfigInfo;
        return this;
    }

    public ConferenceInfo withConfConfigInfo(Consumer<RestConfConfigDTO> confConfigInfoSetter) {
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

    public ConferenceInfo withVmrFlag(Integer vmrFlag) {
        this.vmrFlag = vmrFlag;
        return this;
    }

    /**
     * 是否使用云会议室召开预约会议。 - 0: 不使用云会议室; - 1: 使用云会议室。 界面显示会议ID需要使用vmrConferenceID作为会议ID；查询会议详情、登录会控、一键入会等会议业务操作依然使用conferenceID字段。
     * @return vmrFlag
     */
    public Integer getVmrFlag() {
        return vmrFlag;
    }

    public void setVmrFlag(Integer vmrFlag) {
        this.vmrFlag = vmrFlag;
    }

    public ConferenceInfo withIsHasRecordFile(Boolean isHasRecordFile) {
        this.isHasRecordFile = isHasRecordFile;
        return this;
    }

    /**
     * 仅历史会议返回值有效。默认没有录制文件。 - True: 有录制文件。 - False: 没有录制文件。
     * @return isHasRecordFile
     */
    public Boolean getIsHasRecordFile() {
        return isHasRecordFile;
    }

    public void setIsHasRecordFile(Boolean isHasRecordFile) {
        this.isHasRecordFile = isHasRecordFile;
    }

    public ConferenceInfo withVmrConferenceID(String vmrConferenceID) {
        this.vmrConferenceID = vmrConferenceID;
        return this;
    }

    /**
     * 云会议室id，如果vmrFlag为1，则该字段不为空。
     * @return vmrConferenceID
     */
    public String getVmrConferenceID() {
        return vmrConferenceID;
    }

    public void setVmrConferenceID(String vmrConferenceID) {
        this.vmrConferenceID = vmrConferenceID;
    }

    public ConferenceInfo withConfUUID(String confUUID) {
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

    public ConferenceInfo withPartAttendeeInfo(List<PartAttendee> partAttendeeInfo) {
        this.partAttendeeInfo = partAttendeeInfo;
        return this;
    }

    public ConferenceInfo addPartAttendeeInfoItem(PartAttendee partAttendeeInfoItem) {
        if (this.partAttendeeInfo == null) {
            this.partAttendeeInfo = new ArrayList<>();
        }
        this.partAttendeeInfo.add(partAttendeeInfoItem);
        return this;
    }

    public ConferenceInfo withPartAttendeeInfo(Consumer<List<PartAttendee>> partAttendeeInfoSetter) {
        if (this.partAttendeeInfo == null) {
            this.partAttendeeInfo = new ArrayList<>();
        }
        partAttendeeInfoSetter.accept(this.partAttendeeInfo);
        return this;
    }

    /**
     * 与会方信息。硬件终端/与会人最多各显示20条记录。
     * @return partAttendeeInfo
     */
    public List<PartAttendee> getPartAttendeeInfo() {
        return partAttendeeInfo;
    }

    public void setPartAttendeeInfo(List<PartAttendee> partAttendeeInfo) {
        this.partAttendeeInfo = partAttendeeInfo;
    }

    public ConferenceInfo withTerminlCount(Integer terminlCount) {
        this.terminlCount = terminlCount;
        return this;
    }

    /**
     * 硬终端个数。
     * @return terminlCount
     */
    public Integer getTerminlCount() {
        return terminlCount;
    }

    public void setTerminlCount(Integer terminlCount) {
        this.terminlCount = terminlCount;
    }

    public ConferenceInfo withNormalCount(Integer normalCount) {
        this.normalCount = normalCount;
        return this;
    }

    /**
     * 普通终端个数。
     * @return normalCount
     */
    public Integer getNormalCount() {
        return normalCount;
    }

    public void setNormalCount(Integer normalCount) {
        this.normalCount = normalCount;
    }

    public ConferenceInfo withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 会议预定者的企业名称。最大长度96。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ConferenceInfo withVmrID(String vmrID) {
        this.vmrID = vmrID;
        return this;
    }

    /**
     * 云会议室的ID。
     * @return vmrID
     */
    public String getVmrID() {
        return vmrID;
    }

    public void setVmrID(String vmrID) {
        this.vmrID = vmrID;
    }

    public ConferenceInfo withRole(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * 会议角色
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public ConferenceInfo withWebinar(Boolean webinar) {
        this.webinar = webinar;
        return this;
    }

    /**
     * 是否网络研讨会
     * @return webinar
     */
    public Boolean getWebinar() {
        return webinar;
    }

    public void setWebinar(Boolean webinar) {
        this.webinar = webinar;
    }

    public ConferenceInfo withMultiStreamFlag(Integer multiStreamFlag) {
        this.multiStreamFlag = multiStreamFlag;
        return this;
    }

    /**
     * 标识是否为多流视频会议。 枚举值如下 1：多流会议
     * minimum: 1
     * maximum: 1
     * @return multiStreamFlag
     */
    public Integer getMultiStreamFlag() {
        return multiStreamFlag;
    }

    public void setMultiStreamFlag(Integer multiStreamFlag) {
        this.multiStreamFlag = multiStreamFlag;
    }

    public ConferenceInfo withConfMode(ConfModeEnum confMode) {
        this.confMode = confMode;
        return this;
    }

    /**
     * 会议类型
     * @return confMode
     */
    public ConfModeEnum getConfMode() {
        return confMode;
    }

    public void setConfMode(ConfModeEnum confMode) {
        this.confMode = confMode;
    }

    public ConferenceInfo withScheduleVmr(Boolean scheduleVmr) {
        this.scheduleVmr = scheduleVmr;
        return this;
    }

    /**
     * True: VMR预约记录（如果为true则该记录不支持根据会议ID查询会议详情） False：普通会议
     * @return scheduleVmr
     */
    public Boolean getScheduleVmr() {
        return scheduleVmr;
    }

    public void setScheduleVmr(Boolean scheduleVmr) {
        this.scheduleVmr = scheduleVmr;
    }

    public ConferenceInfo withConcurrentParticipants(Integer concurrentParticipants) {
        this.concurrentParticipants = concurrentParticipants;
        return this;
    }

    /**
     * 会议方数，会议最大与会人数限制
     * @return concurrentParticipants
     */
    public Integer getConcurrentParticipants() {
        return concurrentParticipants;
    }

    public void setConcurrentParticipants(Integer concurrentParticipants) {
        this.concurrentParticipants = concurrentParticipants;
    }

    public ConferenceInfo withPicDisplay(MultiPicDisplayDO picDisplay) {
        this.picDisplay = picDisplay;
        return this;
    }

    public ConferenceInfo withPicDisplay(Consumer<MultiPicDisplayDO> picDisplaySetter) {
        if (this.picDisplay == null) {
            this.picDisplay = new MultiPicDisplayDO();
            picDisplaySetter.accept(this.picDisplay);
        }

        return this;
    }

    /**
     * Get picDisplay
     * @return picDisplay
     */
    public MultiPicDisplayDO getPicDisplay() {
        return picDisplay;
    }

    public void setPicDisplay(MultiPicDisplayDO picDisplay) {
        this.picDisplay = picDisplay;
    }

    public ConferenceInfo withSubConfs(List<CycleSubConf> subConfs) {
        this.subConfs = subConfs;
        return this;
    }

    public ConferenceInfo addSubConfsItem(CycleSubConf subConfsItem) {
        if (this.subConfs == null) {
            this.subConfs = new ArrayList<>();
        }
        this.subConfs.add(subConfsItem);
        return this;
    }

    public ConferenceInfo withSubConfs(Consumer<List<CycleSubConf>> subConfsSetter) {
        if (this.subConfs == null) {
            this.subConfs = new ArrayList<>();
        }
        subConfsSetter.accept(this.subConfs);
        return this;
    }

    /**
     * 周期子会议列表
     * @return subConfs
     */
    public List<CycleSubConf> getSubConfs() {
        return subConfs;
    }

    public void setSubConfs(List<CycleSubConf> subConfs) {
        this.subConfs = subConfs;
    }

    public ConferenceInfo withCycleSubConfID(String cycleSubConfID) {
        this.cycleSubConfID = cycleSubConfID;
        return this;
    }

    /**
     * 周期子会议UUID, 用于查询在线会议和历史会议详情时标识
     * @return cycleSubConfID
     */
    public String getCycleSubConfID() {
        return cycleSubConfID;
    }

    public void setCycleSubConfID(String cycleSubConfID) {
        this.cycleSubConfID = cycleSubConfID;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConferenceInfo conferenceInfo = (ConferenceInfo) o;
        return Objects.equals(this.conferenceID, conferenceInfo.conferenceID)
            && Objects.equals(this.subject, conferenceInfo.subject) && Objects.equals(this.size, conferenceInfo.size)
            && Objects.equals(this.timeZoneID, conferenceInfo.timeZoneID)
            && Objects.equals(this.startTime, conferenceInfo.startTime)
            && Objects.equals(this.endTime, conferenceInfo.endTime)
            && Objects.equals(this.mediaTypes, conferenceInfo.mediaTypes)
            && Objects.equals(this.conferenceState, conferenceInfo.conferenceState)
            && Objects.equals(this.language, conferenceInfo.language)
            && Objects.equals(this.accessNumber, conferenceInfo.accessNumber)
            && Objects.equals(this.passwordEntry, conferenceInfo.passwordEntry)
            && Objects.equals(this.userUUID, conferenceInfo.userUUID)
            && Objects.equals(this.scheduserName, conferenceInfo.scheduserName)
            && Objects.equals(this.conferenceType, conferenceInfo.conferenceType)
            && Objects.equals(this.confType, conferenceInfo.confType)
            && Objects.equals(this.cycleParams, conferenceInfo.cycleParams)
            && Objects.equals(this.isAutoMute, conferenceInfo.isAutoMute)
            && Objects.equals(this.isAutoRecord, conferenceInfo.isAutoRecord)
            && Objects.equals(this.chairJoinUri, conferenceInfo.chairJoinUri)
            && Objects.equals(this.guestJoinUri, conferenceInfo.guestJoinUri)
            && Objects.equals(this.audienceJoinUri, conferenceInfo.audienceJoinUri)
            && Objects.equals(this.recordType, conferenceInfo.recordType)
            && Objects.equals(this.auxAddress, conferenceInfo.auxAddress)
            && Objects.equals(this.liveAddress, conferenceInfo.liveAddress)
            && Objects.equals(this.recordAuxStream, conferenceInfo.recordAuxStream)
            && Objects.equals(this.recordAuthType, conferenceInfo.recordAuthType)
            && Objects.equals(this.liveUrl, conferenceInfo.liveUrl)
            && Objects.equals(this.confConfigInfo, conferenceInfo.confConfigInfo)
            && Objects.equals(this.vmrFlag, conferenceInfo.vmrFlag)
            && Objects.equals(this.isHasRecordFile, conferenceInfo.isHasRecordFile)
            && Objects.equals(this.vmrConferenceID, conferenceInfo.vmrConferenceID)
            && Objects.equals(this.confUUID, conferenceInfo.confUUID)
            && Objects.equals(this.partAttendeeInfo, conferenceInfo.partAttendeeInfo)
            && Objects.equals(this.terminlCount, conferenceInfo.terminlCount)
            && Objects.equals(this.normalCount, conferenceInfo.normalCount)
            && Objects.equals(this.deptName, conferenceInfo.deptName)
            && Objects.equals(this.vmrID, conferenceInfo.vmrID) && Objects.equals(this.role, conferenceInfo.role)
            && Objects.equals(this.webinar, conferenceInfo.webinar)
            && Objects.equals(this.multiStreamFlag, conferenceInfo.multiStreamFlag)
            && Objects.equals(this.confMode, conferenceInfo.confMode)
            && Objects.equals(this.scheduleVmr, conferenceInfo.scheduleVmr)
            && Objects.equals(this.concurrentParticipants, conferenceInfo.concurrentParticipants)
            && Objects.equals(this.picDisplay, conferenceInfo.picDisplay)
            && Objects.equals(this.subConfs, conferenceInfo.subConfs)
            && Objects.equals(this.cycleSubConfID, conferenceInfo.cycleSubConfID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceID,
            subject,
            size,
            timeZoneID,
            startTime,
            endTime,
            mediaTypes,
            conferenceState,
            language,
            accessNumber,
            passwordEntry,
            userUUID,
            scheduserName,
            conferenceType,
            confType,
            cycleParams,
            isAutoMute,
            isAutoRecord,
            chairJoinUri,
            guestJoinUri,
            audienceJoinUri,
            recordType,
            auxAddress,
            liveAddress,
            recordAuxStream,
            recordAuthType,
            liveUrl,
            confConfigInfo,
            vmrFlag,
            isHasRecordFile,
            vmrConferenceID,
            confUUID,
            partAttendeeInfo,
            terminlCount,
            normalCount,
            deptName,
            vmrID,
            role,
            webinar,
            multiStreamFlag,
            confMode,
            scheduleVmr,
            concurrentParticipants,
            picDisplay,
            subConfs,
            cycleSubConfID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConferenceInfo {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    timeZoneID: ").append(toIndentedString(timeZoneID)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
        sb.append("    conferenceState: ").append(toIndentedString(conferenceState)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    accessNumber: ").append(toIndentedString(accessNumber)).append("\n");
        sb.append("    passwordEntry: ").append(toIndentedString(passwordEntry)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    scheduserName: ").append(toIndentedString(scheduserName)).append("\n");
        sb.append("    conferenceType: ").append(toIndentedString(conferenceType)).append("\n");
        sb.append("    confType: ").append(toIndentedString(confType)).append("\n");
        sb.append("    cycleParams: ").append(toIndentedString(cycleParams)).append("\n");
        sb.append("    isAutoMute: ").append(toIndentedString(isAutoMute)).append("\n");
        sb.append("    isAutoRecord: ").append(toIndentedString(isAutoRecord)).append("\n");
        sb.append("    chairJoinUri: ").append(toIndentedString(chairJoinUri)).append("\n");
        sb.append("    guestJoinUri: ").append(toIndentedString(guestJoinUri)).append("\n");
        sb.append("    audienceJoinUri: ").append(toIndentedString(audienceJoinUri)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    auxAddress: ").append(toIndentedString(auxAddress)).append("\n");
        sb.append("    liveAddress: ").append(toIndentedString(liveAddress)).append("\n");
        sb.append("    recordAuxStream: ").append(toIndentedString(recordAuxStream)).append("\n");
        sb.append("    recordAuthType: ").append(toIndentedString(recordAuthType)).append("\n");
        sb.append("    liveUrl: ").append(toIndentedString(liveUrl)).append("\n");
        sb.append("    confConfigInfo: ").append(toIndentedString(confConfigInfo)).append("\n");
        sb.append("    vmrFlag: ").append(toIndentedString(vmrFlag)).append("\n");
        sb.append("    isHasRecordFile: ").append(toIndentedString(isHasRecordFile)).append("\n");
        sb.append("    vmrConferenceID: ").append(toIndentedString(vmrConferenceID)).append("\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    partAttendeeInfo: ").append(toIndentedString(partAttendeeInfo)).append("\n");
        sb.append("    terminlCount: ").append(toIndentedString(terminlCount)).append("\n");
        sb.append("    normalCount: ").append(toIndentedString(normalCount)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    vmrID: ").append(toIndentedString(vmrID)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    webinar: ").append(toIndentedString(webinar)).append("\n");
        sb.append("    multiStreamFlag: ").append(toIndentedString(multiStreamFlag)).append("\n");
        sb.append("    confMode: ").append(toIndentedString(confMode)).append("\n");
        sb.append("    scheduleVmr: ").append(toIndentedString(scheduleVmr)).append("\n");
        sb.append("    concurrentParticipants: ").append(toIndentedString(concurrentParticipants)).append("\n");
        sb.append("    picDisplay: ").append(toIndentedString(picDisplay)).append("\n");
        sb.append("    subConfs: ").append(toIndentedString(subConfs)).append("\n");
        sb.append("    cycleSubConfID: ").append(toIndentedString(cycleSubConfID)).append("\n");
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
