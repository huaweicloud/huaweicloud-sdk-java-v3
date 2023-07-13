package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PutVideoInfo
 */
public class PutVideoInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tts_config")

    private TtsConfig ttsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private VideoConfig videoConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_config")

    private CharacterConfig characterConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_config")

    private ReadConfig readConfig;

    public PutVideoInfo withTtsConfig(TtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }

    public PutVideoInfo withTtsConfig(Consumer<TtsConfig> ttsConfigSetter) {
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

    public PutVideoInfo withVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public PutVideoInfo withVideoConfig(Consumer<VideoConfig> videoConfigSetter) {
        if (this.videoConfig == null) {
            this.videoConfig = new VideoConfig();
            videoConfigSetter.accept(this.videoConfig);
        }

        return this;
    }

    /**
     * Get videoConfig
     * @return videoConfig
     */
    public VideoConfig getVideoConfig() {
        return videoConfig;
    }

    public void setVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
    }

    public PutVideoInfo withCharacterConfig(CharacterConfig characterConfig) {
        this.characterConfig = characterConfig;
        return this;
    }

    public PutVideoInfo withCharacterConfig(Consumer<CharacterConfig> characterConfigSetter) {
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

    public PutVideoInfo withReadConfig(ReadConfig readConfig) {
        this.readConfig = readConfig;
        return this;
    }

    public PutVideoInfo withReadConfig(Consumer<ReadConfig> readConfigSetter) {
        if (this.readConfig == null) {
            this.readConfig = new ReadConfig();
            readConfigSetter.accept(this.readConfig);
        }

        return this;
    }

    /**
     * Get readConfig
     * @return readConfig
     */
    public ReadConfig getReadConfig() {
        return readConfig;
    }

    public void setReadConfig(ReadConfig readConfig) {
        this.readConfig = readConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutVideoInfo that = (PutVideoInfo) obj;
        return Objects.equals(this.ttsConfig, that.ttsConfig) && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.characterConfig, that.characterConfig)
            && Objects.equals(this.readConfig, that.readConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ttsConfig, videoConfig, characterConfig, readConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutVideoInfo {\n");
        sb.append("    ttsConfig: ").append(toIndentedString(ttsConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    characterConfig: ").append(toIndentedString(characterConfig)).append("\n");
        sb.append("    readConfig: ").append(toIndentedString(readConfig)).append("\n");
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
