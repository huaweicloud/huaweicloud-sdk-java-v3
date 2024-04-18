package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRobotResponse extends SdkResponse {

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
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowRobotResponse withRobotId(String robotId) {
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

    public ShowRobotResponse withName(String name) {
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

    public ShowRobotResponse withRoomId(String roomId) {
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

    public ShowRobotResponse withAppId(String appId) {
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

    public ShowRobotResponse withAppType(Integer appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 对接第三方应用厂商类型。 > 0：科大讯飞AIUI；1：华为云CBS；2：科大讯飞星火交互认知大模型；5：第三方驱动；6：第三方语言模型
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

    public ShowRobotResponse withLanguage(LanguageEnum language) {
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

    public ShowRobotResponse withCreateTime(String createTime) {
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

    public ShowRobotResponse withUpdateTime(String updateTime) {
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

    public ShowRobotResponse withRegion(Integer region) {
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

    public ShowRobotResponse withCbsProjectId(String cbsProjectId) {
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

    public ShowRobotResponse withLlmUrl(String llmUrl) {
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

    public ShowRobotResponse withIsStream(Boolean isStream) {
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

    public ShowRobotResponse withChatRounds(Integer chatRounds) {
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

    public ShowRobotResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRobotResponse that = (ShowRobotResponse) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.roomId, that.roomId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.appType, that.appType) && Objects.equals(this.language, that.language)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.region, that.region) && Objects.equals(this.cbsProjectId, that.cbsProjectId)
            && Objects.equals(this.llmUrl, that.llmUrl) && Objects.equals(this.isStream, that.isStream)
            && Objects.equals(this.chatRounds, that.chatRounds) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId,
            name,
            roomId,
            appId,
            appType,
            language,
            createTime,
            updateTime,
            region,
            cbsProjectId,
            llmUrl,
            isStream,
            chatRounds,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRobotResponse {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    cbsProjectId: ").append(toIndentedString(cbsProjectId)).append("\n");
        sb.append("    llmUrl: ").append(toIndentedString(llmUrl)).append("\n");
        sb.append("    isStream: ").append(toIndentedString(isStream)).append("\n");
        sb.append("    chatRounds: ").append(toIndentedString(chatRounds)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
