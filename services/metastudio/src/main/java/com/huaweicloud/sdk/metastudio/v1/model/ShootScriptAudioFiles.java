package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用于语音驱动的音频文件上传URL列表。
 */
public class ShootScriptAudioFiles {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_url")

    private List<ShootScriptAudioFileItem> audioFileUrl = null;

    public ShootScriptAudioFiles withAudioFileUrl(List<ShootScriptAudioFileItem> audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
        return this;
    }

    public ShootScriptAudioFiles addAudioFileUrlItem(ShootScriptAudioFileItem audioFileUrlItem) {
        if (this.audioFileUrl == null) {
            this.audioFileUrl = new ArrayList<>();
        }
        this.audioFileUrl.add(audioFileUrlItem);
        return this;
    }

    public ShootScriptAudioFiles withAudioFileUrl(Consumer<List<ShootScriptAudioFileItem>> audioFileUrlSetter) {
        if (this.audioFileUrl == null) {
            this.audioFileUrl = new ArrayList<>();
        }
        audioFileUrlSetter.accept(this.audioFileUrl);
        return this;
    }

    /**
     * 用于语音驱动的音频文件上传URL。
     * @return audioFileUrl
     */
    public List<ShootScriptAudioFileItem> getAudioFileUrl() {
        return audioFileUrl;
    }

    public void setAudioFileUrl(List<ShootScriptAudioFileItem> audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShootScriptAudioFiles that = (ShootScriptAudioFiles) obj;
        return Objects.equals(this.audioFileUrl, that.audioFileUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioFileUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShootScriptAudioFiles {\n");
        sb.append("    audioFileUrl: ").append(toIndentedString(audioFileUrl)).append("\n");
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
