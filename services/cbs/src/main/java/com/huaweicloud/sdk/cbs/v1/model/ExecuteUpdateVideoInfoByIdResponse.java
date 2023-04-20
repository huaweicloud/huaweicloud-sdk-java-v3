package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.CharacterConfig;
import com.huaweicloud.sdk.cbs.v1.model.ReadConfigResp;
import com.huaweicloud.sdk.cbs.v1.model.TtsConfig;
import com.huaweicloud.sdk.cbs.v1.model.Video;
import com.huaweicloud.sdk.cbs.v1.model.VideoConfigResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteUpdateVideoInfoByIdResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="progress")
    

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtitle_url")
    

    private String subtitleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_url")
    

    private String videoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_shot")
    

    private String videoShot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="character_config")
    

    private CharacterConfig characterConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compose_actions")
    
    private List<Integer> composeActions = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="read_config")
    

    private ReadConfigResp readConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tts_config")
    

    private TtsConfig ttsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_config")
    

    private VideoConfigResp videoConfig;

    public ExecuteUpdateVideoInfoByIdResponse withCreateTime(String createTime) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withUpdateTime(String updateTime) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withErrorMsg(String errorMsg) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withId(String id) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withName(String name) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withProgress(Integer progress) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withStatus(Integer status) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withSubtitleUrl(String subtitleUrl) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withVideoUrl(String videoUrl) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withVideoShot(String videoShot) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withCharacterConfig(CharacterConfig characterConfig) {
        this.characterConfig = characterConfig;
        return this;
    }

    public ExecuteUpdateVideoInfoByIdResponse withCharacterConfig(Consumer<CharacterConfig> characterConfigSetter) {
        if(this.characterConfig == null ){
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

    

    public ExecuteUpdateVideoInfoByIdResponse withComposeActions(List<Integer> composeActions) {
        this.composeActions = composeActions;
        return this;
    }

    
    public ExecuteUpdateVideoInfoByIdResponse addComposeActionsItem(Integer composeActionsItem) {
        if(this.composeActions == null) {
            this.composeActions = new ArrayList<>();
        }
        this.composeActions.add(composeActionsItem);
        return this;
    }

    public ExecuteUpdateVideoInfoByIdResponse withComposeActions(Consumer<List<Integer>> composeActionsSetter) {
        if(this.composeActions == null) {
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

    

    public ExecuteUpdateVideoInfoByIdResponse withReadConfig(ReadConfigResp readConfig) {
        this.readConfig = readConfig;
        return this;
    }

    public ExecuteUpdateVideoInfoByIdResponse withReadConfig(Consumer<ReadConfigResp> readConfigSetter) {
        if(this.readConfig == null ){
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

    

    public ExecuteUpdateVideoInfoByIdResponse withTtsConfig(TtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }

    public ExecuteUpdateVideoInfoByIdResponse withTtsConfig(Consumer<TtsConfig> ttsConfigSetter) {
        if(this.ttsConfig == null ){
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

    

    public ExecuteUpdateVideoInfoByIdResponse withVideoConfig(VideoConfigResp videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public ExecuteUpdateVideoInfoByIdResponse withVideoConfig(Consumer<VideoConfigResp> videoConfigSetter) {
        if(this.videoConfig == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteUpdateVideoInfoByIdResponse executeUpdateVideoInfoByIdResponse = (ExecuteUpdateVideoInfoByIdResponse) o;
        return Objects.equals(this.createTime, executeUpdateVideoInfoByIdResponse.createTime) &&
            Objects.equals(this.updateTime, executeUpdateVideoInfoByIdResponse.updateTime) &&
            Objects.equals(this.errorMsg, executeUpdateVideoInfoByIdResponse.errorMsg) &&
            Objects.equals(this.id, executeUpdateVideoInfoByIdResponse.id) &&
            Objects.equals(this.name, executeUpdateVideoInfoByIdResponse.name) &&
            Objects.equals(this.progress, executeUpdateVideoInfoByIdResponse.progress) &&
            Objects.equals(this.status, executeUpdateVideoInfoByIdResponse.status) &&
            Objects.equals(this.subtitleUrl, executeUpdateVideoInfoByIdResponse.subtitleUrl) &&
            Objects.equals(this.videoUrl, executeUpdateVideoInfoByIdResponse.videoUrl) &&
            Objects.equals(this.videoShot, executeUpdateVideoInfoByIdResponse.videoShot) &&
            Objects.equals(this.characterConfig, executeUpdateVideoInfoByIdResponse.characterConfig) &&
            Objects.equals(this.composeActions, executeUpdateVideoInfoByIdResponse.composeActions) &&
            Objects.equals(this.readConfig, executeUpdateVideoInfoByIdResponse.readConfig) &&
            Objects.equals(this.ttsConfig, executeUpdateVideoInfoByIdResponse.ttsConfig) &&
            Objects.equals(this.videoConfig, executeUpdateVideoInfoByIdResponse.videoConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createTime, updateTime, errorMsg, id, name, progress, status, subtitleUrl, videoUrl, videoShot, characterConfig, composeActions, readConfig, ttsConfig, videoConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteUpdateVideoInfoByIdResponse {\n");
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

