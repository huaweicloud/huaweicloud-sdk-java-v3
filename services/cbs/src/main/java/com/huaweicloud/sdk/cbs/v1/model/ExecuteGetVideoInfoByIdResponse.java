package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ExecuteGetVideoInfoByIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_url")

    private String subtitleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_url")

    private String videoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_shot")

    private String videoShot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_config")

    private CharacterConfig characterConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compose_actions")

    private List<Integer> composeActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_config")

    private ReadConfigResp readConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tts_config")

    private TtsConfig ttsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private VideoConfigResp videoConfig;

    public ExecuteGetVideoInfoByIdResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ExecuteGetVideoInfoByIdResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ExecuteGetVideoInfoByIdResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息 如: {\\\"error_code\\\":\\\"0001\\\",\\\"error_msg\\\":\\\"播报内容超过10分钟，请重新调整播报内容。\\\"}
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ExecuteGetVideoInfoByIdResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExecuteGetVideoInfoByIdResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 视频名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExecuteGetVideoInfoByIdResponse withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 视频生成进度 0~100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ExecuteGetVideoInfoByIdResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 0：未初始化 1：生成中 2：生成成功 3：生成失败
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ExecuteGetVideoInfoByIdResponse withSubtitleUrl(String subtitleUrl) {
        this.subtitleUrl = subtitleUrl;
        return this;
    }

    /**
     * 字幕地址
     * @return subtitleUrl
     */
    public String getSubtitleUrl() {
        return subtitleUrl;
    }

    public void setSubtitleUrl(String subtitleUrl) {
        this.subtitleUrl = subtitleUrl;
    }

    public ExecuteGetVideoInfoByIdResponse withVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    /**
     * 视频的obs地址，当视频生成成功时返回
     * @return videoUrl
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public ExecuteGetVideoInfoByIdResponse withVideoShot(String videoShot) {
        this.videoShot = videoShot;
        return this;
    }

    /**
     * 视频截图地址，jpg格式 分辨率480 * 270 当status=2：生成成功时返回
     * @return videoShot
     */
    public String getVideoShot() {
        return videoShot;
    }

    public void setVideoShot(String videoShot) {
        this.videoShot = videoShot;
    }

    public ExecuteGetVideoInfoByIdResponse withCharacterConfig(CharacterConfig characterConfig) {
        this.characterConfig = characterConfig;
        return this;
    }

    public ExecuteGetVideoInfoByIdResponse withCharacterConfig(Consumer<CharacterConfig> characterConfigSetter) {
        if (this.characterConfig == null) {
            this.characterConfig = new CharacterConfig();
            characterConfigSetter.accept(this.characterConfig);
        }

        return this;
    }

    /**
     * Get characterConfig
     * @return characterConfig
     */
    public CharacterConfig getCharacterConfig() {
        return characterConfig;
    }

    public void setCharacterConfig(CharacterConfig characterConfig) {
        this.characterConfig = characterConfig;
    }

    public ExecuteGetVideoInfoByIdResponse withComposeActions(List<Integer> composeActions) {
        this.composeActions = composeActions;
        return this;
    }

    public ExecuteGetVideoInfoByIdResponse addComposeActionsItem(Integer composeActionsItem) {
        if (this.composeActions == null) {
            this.composeActions = new ArrayList<>();
        }
        this.composeActions.add(composeActionsItem);
        return this;
    }

    public ExecuteGetVideoInfoByIdResponse withComposeActions(Consumer<List<Integer>> composeActionsSetter) {
        if (this.composeActions == null) {
            this.composeActions = new ArrayList<>();
        }
        composeActionsSetter.accept(this.composeActions);
        return this;
    }

    /**
     * 合成动作，如果不为空，则表示可以进行合成操作
     * @return composeActions
     */
    public List<Integer> getComposeActions() {
        return composeActions;
    }

    public void setComposeActions(List<Integer> composeActions) {
        this.composeActions = composeActions;
    }

    public ExecuteGetVideoInfoByIdResponse withReadConfig(ReadConfigResp readConfig) {
        this.readConfig = readConfig;
        return this;
    }

    public ExecuteGetVideoInfoByIdResponse withReadConfig(Consumer<ReadConfigResp> readConfigSetter) {
        if (this.readConfig == null) {
            this.readConfig = new ReadConfigResp();
            readConfigSetter.accept(this.readConfig);
        }

        return this;
    }

    /**
     * Get readConfig
     * @return readConfig
     */
    public ReadConfigResp getReadConfig() {
        return readConfig;
    }

    public void setReadConfig(ReadConfigResp readConfig) {
        this.readConfig = readConfig;
    }

    public ExecuteGetVideoInfoByIdResponse withTtsConfig(TtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }

    public ExecuteGetVideoInfoByIdResponse withTtsConfig(Consumer<TtsConfig> ttsConfigSetter) {
        if (this.ttsConfig == null) {
            this.ttsConfig = new TtsConfig();
            ttsConfigSetter.accept(this.ttsConfig);
        }

        return this;
    }

    /**
     * Get ttsConfig
     * @return ttsConfig
     */
    public TtsConfig getTtsConfig() {
        return ttsConfig;
    }

    public void setTtsConfig(TtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
    }

    public ExecuteGetVideoInfoByIdResponse withVideoConfig(VideoConfigResp videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public ExecuteGetVideoInfoByIdResponse withVideoConfig(Consumer<VideoConfigResp> videoConfigSetter) {
        if (this.videoConfig == null) {
            this.videoConfig = new VideoConfigResp();
            videoConfigSetter.accept(this.videoConfig);
        }

        return this;
    }

    /**
     * Get videoConfig
     * @return videoConfig
     */
    public VideoConfigResp getVideoConfig() {
        return videoConfig;
    }

    public void setVideoConfig(VideoConfigResp videoConfig) {
        this.videoConfig = videoConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteGetVideoInfoByIdResponse that = (ExecuteGetVideoInfoByIdResponse) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.status, that.status) && Objects.equals(this.subtitleUrl, that.subtitleUrl)
            && Objects.equals(this.videoUrl, that.videoUrl) && Objects.equals(this.videoShot, that.videoShot)
            && Objects.equals(this.characterConfig, that.characterConfig)
            && Objects.equals(this.composeActions, that.composeActions)
            && Objects.equals(this.readConfig, that.readConfig) && Objects.equals(this.ttsConfig, that.ttsConfig)
            && Objects.equals(this.videoConfig, that.videoConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            updateTime,
            errorMsg,
            id,
            name,
            progress,
            status,
            subtitleUrl,
            videoUrl,
            videoShot,
            characterConfig,
            composeActions,
            readConfig,
            ttsConfig,
            videoConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetVideoInfoByIdResponse {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subtitleUrl: ").append(toIndentedString(subtitleUrl)).append("\n");
        sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
        sb.append("    videoShot: ").append(toIndentedString(videoShot)).append("\n");
        sb.append("    characterConfig: ").append(toIndentedString(characterConfig)).append("\n");
        sb.append("    composeActions: ").append(toIndentedString(composeActions)).append("\n");
        sb.append("    readConfig: ").append(toIndentedString(readConfig)).append("\n");
        sb.append("    ttsConfig: ").append(toIndentedString(ttsConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
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
