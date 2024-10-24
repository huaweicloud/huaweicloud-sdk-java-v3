package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 音频选择器
 */
public class InputAudioSelector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selector_settings")

    private AudioSelectorSettings selectorSettings;

    public InputAudioSelector withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 音频选择器的名称。仅支持大小写字母、数字、中划线和下划线。  同一个频道中每个选择器的名称需要唯一。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputAudioSelector withSelectorSettings(AudioSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
        return this;
    }

    public InputAudioSelector withSelectorSettings(Consumer<AudioSelectorSettings> selectorSettingsSetter) {
        if (this.selectorSettings == null) {
            this.selectorSettings = new AudioSelectorSettings();
            selectorSettingsSetter.accept(this.selectorSettings);
        }

        return this;
    }

    /**
     * Get selectorSettings
     * @return selectorSettings
     */
    public AudioSelectorSettings getSelectorSettings() {
        return selectorSettings;
    }

    public void setSelectorSettings(AudioSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputAudioSelector that = (InputAudioSelector) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.selectorSettings, that.selectorSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, selectorSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputAudioSelector {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    selectorSettings: ").append(toIndentedString(selectorSettings)).append("\n");
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
