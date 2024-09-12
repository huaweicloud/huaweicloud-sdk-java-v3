package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 直播话术配置。
 */
public class LiveShootScriptItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_no")

    private Integer sequenceNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_config")

    private TextConfig textConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_config")

    private LiveAudioConfig audioConfig;

    public LiveShootScriptItem withSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
        return this;
    }

    /**
     * **参数解释**： 剧本序号。 **约束限制**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return sequenceNo
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public LiveShootScriptItem withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**： 段落标题。 **约束限制**： 不涉及 **取值范围**： 字符长度0-256位。 **默认取值**： 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LiveShootScriptItem withTextConfig(TextConfig textConfig) {
        this.textConfig = textConfig;
        return this;
    }

    public LiveShootScriptItem withTextConfig(Consumer<TextConfig> textConfigSetter) {
        if (this.textConfig == null) {
            this.textConfig = new TextConfig();
            textConfigSetter.accept(this.textConfig);
        }

        return this;
    }

    /**
     * Get textConfig
     * @return textConfig
     */
    public TextConfig getTextConfig() {
        return textConfig;
    }

    public void setTextConfig(TextConfig textConfig) {
        this.textConfig = textConfig;
    }

    public LiveShootScriptItem withAudioConfig(LiveAudioConfig audioConfig) {
        this.audioConfig = audioConfig;
        return this;
    }

    public LiveShootScriptItem withAudioConfig(Consumer<LiveAudioConfig> audioConfigSetter) {
        if (this.audioConfig == null) {
            this.audioConfig = new LiveAudioConfig();
            audioConfigSetter.accept(this.audioConfig);
        }

        return this;
    }

    /**
     * Get audioConfig
     * @return audioConfig
     */
    public LiveAudioConfig getAudioConfig() {
        return audioConfig;
    }

    public void setAudioConfig(LiveAudioConfig audioConfig) {
        this.audioConfig = audioConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveShootScriptItem that = (LiveShootScriptItem) obj;
        return Objects.equals(this.sequenceNo, that.sequenceNo) && Objects.equals(this.title, that.title)
            && Objects.equals(this.textConfig, that.textConfig) && Objects.equals(this.audioConfig, that.audioConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequenceNo, title, textConfig, audioConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveShootScriptItem {\n");
        sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    textConfig: ").append(toIndentedString(textConfig)).append("\n");
        sb.append("    audioConfig: ").append(toIndentedString(audioConfig)).append("\n");
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
