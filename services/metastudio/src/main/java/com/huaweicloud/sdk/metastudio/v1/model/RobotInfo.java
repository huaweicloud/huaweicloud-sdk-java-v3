package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应用基本信息。
 */
public class RobotInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private Integer appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_type")

    private RobotTypeEnum robotType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private Integer region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbs_project_id")

    private String cbsProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_url")

    private String llmUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_stream")

    private Boolean isStream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_rounds")

    private Integer chatRounds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ifly_production")

    private Boolean isIflyProduction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tail_silence_time")

    private Integer tailSilenceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_region")

    private Integer sisRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_project_id")

    private String sisProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hot_words")

    private Boolean enableHotWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_question_audit")

    private Boolean enableQuestionAudit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asr_type")

    private AsrTypeEnum asrType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asr_account")

    private String asrAccount;

    public RobotInfo withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * 应用ID。
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public RobotInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RobotInfo withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 智能交互对话房间ID。
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public RobotInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 第三方应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public RobotInfo withAppType(Integer appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 对接第三方应用厂商类型。 > 0：科大讯飞AIUI；1：华为云CBS；2：科大讯飞星火交互认知大模型；5：第三方驱动；6：第三方语言模型；7：交互助手；8：奇妙问
     * minimum: 0
     * maximum: 32
     * @return appType
     */
    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public RobotInfo withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * 应用的AccessKey或帐号。
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public RobotInfo withRobotType(RobotTypeEnum robotType) {
        this.robotType = robotType;
        return this;
    }

    /**
     * Get robotType
     * @return robotType
     */
    public RobotTypeEnum getRobotType() {
        return robotType;
    }

    public void setRobotType(RobotTypeEnum robotType) {
        this.robotType = robotType;
    }

    public RobotInfo withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public RobotInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public RobotInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public RobotInfo withRegion(Integer region) {
        this.region = region;
        return this;
    }

    /**
     * CBS所在区域
     * minimum: 0
     * maximum: 32
     * @return region
     */
    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public RobotInfo withCbsProjectId(String cbsProjectId) {
        this.cbsProjectId = cbsProjectId;
        return this;
    }

    /**
     * CBS所在区域的projectId
     * @return cbsProjectId
     */
    public String getCbsProjectId() {
        return cbsProjectId;
    }

    public void setCbsProjectId(String cbsProjectId) {
        this.cbsProjectId = cbsProjectId;
    }

    public RobotInfo withLlmUrl(String llmUrl) {
        this.llmUrl = llmUrl;
        return this;
    }

    /**
     * 第三方语言模型地址。
     * @return llmUrl
     */
    public String getLlmUrl() {
        return llmUrl;
    }

    public void setLlmUrl(String llmUrl) {
        this.llmUrl = llmUrl;
    }

    public RobotInfo withIsStream(Boolean isStream) {
        this.isStream = isStream;
        return this;
    }

    /**
     * 是否采用流式响应。
     * @return isStream
     */
    public Boolean getIsStream() {
        return isStream;
    }

    public void setIsStream(Boolean isStream) {
        this.isStream = isStream;
    }

    public RobotInfo withChatRounds(Integer chatRounds) {
        this.chatRounds = chatRounds;
        return this;
    }

    /**
     * 支持的多轮对话数量，取值大于1时，请求第三方语言模型时将携带历史对话信息。
     * minimum: 1
     * maximum: 10
     * @return chatRounds
     */
    public Integer getChatRounds() {
        return chatRounds;
    }

    public void setChatRounds(Integer chatRounds) {
        this.chatRounds = chatRounds;
    }

    public RobotInfo withIsIflyProduction(Boolean isIflyProduction) {
        this.isIflyProduction = isIflyProduction;
        return this;
    }

    /**
     * 是否为正式环境
     * @return isIflyProduction
     */
    public Boolean getIsIflyProduction() {
        return isIflyProduction;
    }

    public void setIsIflyProduction(Boolean isIflyProduction) {
        this.isIflyProduction = isIflyProduction;
    }

    public RobotInfo withTailSilenceTime(Integer tailSilenceTime) {
        this.tailSilenceTime = tailSilenceTime;
        return this;
    }

    /**
     * 语音识别后端点静音时长默认500ms
     * minimum: 0
     * maximum: 3000
     * @return tailSilenceTime
     */
    public Integer getTailSilenceTime() {
        return tailSilenceTime;
    }

    public void setTailSilenceTime(Integer tailSilenceTime) {
        this.tailSilenceTime = tailSilenceTime;
    }

    public RobotInfo withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 奇妙问角色ID。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public RobotInfo withSisRegion(Integer sisRegion) {
        this.sisRegion = sisRegion;
        return this;
    }

    /**
     * SIS所在区域
     * minimum: 0
     * maximum: 32
     * @return sisRegion
     */
    public Integer getSisRegion() {
        return sisRegion;
    }

    public void setSisRegion(Integer sisRegion) {
        this.sisRegion = sisRegion;
    }

    public RobotInfo withSisProjectId(String sisProjectId) {
        this.sisProjectId = sisProjectId;
        return this;
    }

    /**
     * SIS所在区域的projectId
     * @return sisProjectId
     */
    public String getSisProjectId() {
        return sisProjectId;
    }

    public void setSisProjectId(String sisProjectId) {
        this.sisProjectId = sisProjectId;
    }

    public RobotInfo withEnableHotWords(Boolean enableHotWords) {
        this.enableHotWords = enableHotWords;
        return this;
    }

    /**
     * 是否开启热词
     * @return enableHotWords
     */
    public Boolean getEnableHotWords() {
        return enableHotWords;
    }

    public void setEnableHotWords(Boolean enableHotWords) {
        this.enableHotWords = enableHotWords;
    }

    public RobotInfo withEnableQuestionAudit(Boolean enableQuestionAudit) {
        this.enableQuestionAudit = enableQuestionAudit;
        return this;
    }

    /**
     * 是否开启提问文本审核开关
     * @return enableQuestionAudit
     */
    public Boolean getEnableQuestionAudit() {
        return enableQuestionAudit;
    }

    public void setEnableQuestionAudit(Boolean enableQuestionAudit) {
        this.enableQuestionAudit = enableQuestionAudit;
    }

    public RobotInfo withAsrType(AsrTypeEnum asrType) {
        this.asrType = asrType;
        return this;
    }

    /**
     * Get asrType
     * @return asrType
     */
    public AsrTypeEnum getAsrType() {
        return asrType;
    }

    public void setAsrType(AsrTypeEnum asrType) {
        this.asrType = asrType;
    }

    public RobotInfo withAsrAccount(String asrAccount) {
        this.asrAccount = asrAccount;
        return this;
    }

    /**
     * ASR帐号。
     * @return asrAccount
     */
    public String getAsrAccount() {
        return asrAccount;
    }

    public void setAsrAccount(String asrAccount) {
        this.asrAccount = asrAccount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RobotInfo that = (RobotInfo) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.roomId, that.roomId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.appType, that.appType) && Objects.equals(this.appKey, that.appKey)
            && Objects.equals(this.robotType, that.robotType) && Objects.equals(this.language, that.language)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.region, that.region) && Objects.equals(this.cbsProjectId, that.cbsProjectId)
            && Objects.equals(this.llmUrl, that.llmUrl) && Objects.equals(this.isStream, that.isStream)
            && Objects.equals(this.chatRounds, that.chatRounds)
            && Objects.equals(this.isIflyProduction, that.isIflyProduction)
            && Objects.equals(this.tailSilenceTime, that.tailSilenceTime) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.sisRegion, that.sisRegion) && Objects.equals(this.sisProjectId, that.sisProjectId)
            && Objects.equals(this.enableHotWords, that.enableHotWords)
            && Objects.equals(this.enableQuestionAudit, that.enableQuestionAudit)
            && Objects.equals(this.asrType, that.asrType) && Objects.equals(this.asrAccount, that.asrAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId,
            name,
            roomId,
            appId,
            appType,
            appKey,
            robotType,
            language,
            createTime,
            updateTime,
            region,
            cbsProjectId,
            llmUrl,
            isStream,
            chatRounds,
            isIflyProduction,
            tailSilenceTime,
            roleId,
            sisRegion,
            sisProjectId,
            enableHotWords,
            enableQuestionAudit,
            asrType,
            asrAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RobotInfo {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    robotType: ").append(toIndentedString(robotType)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    cbsProjectId: ").append(toIndentedString(cbsProjectId)).append("\n");
        sb.append("    llmUrl: ").append(toIndentedString(llmUrl)).append("\n");
        sb.append("    isStream: ").append(toIndentedString(isStream)).append("\n");
        sb.append("    chatRounds: ").append(toIndentedString(chatRounds)).append("\n");
        sb.append("    isIflyProduction: ").append(toIndentedString(isIflyProduction)).append("\n");
        sb.append("    tailSilenceTime: ").append(toIndentedString(tailSilenceTime)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    sisRegion: ").append(toIndentedString(sisRegion)).append("\n");
        sb.append("    sisProjectId: ").append(toIndentedString(sisProjectId)).append("\n");
        sb.append("    enableHotWords: ").append(toIndentedString(enableHotWords)).append("\n");
        sb.append("    enableQuestionAudit: ").append(toIndentedString(enableQuestionAudit)).append("\n");
        sb.append("    asrType: ").append(toIndentedString(asrType)).append("\n");
        sb.append("    asrAccount: ").append(toIndentedString(asrAccount)).append("\n");
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
