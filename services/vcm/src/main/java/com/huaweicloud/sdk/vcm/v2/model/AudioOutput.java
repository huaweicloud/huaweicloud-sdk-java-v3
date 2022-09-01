package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 音频数据的输出列表
 */
public class AudioOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    @JacksonXmlProperty(localName = "obs")

    private AudioOutputObs obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting")

    @JacksonXmlProperty(localName = "hosting")

    private AudioOutputHosting hosting;

    public AudioOutput withObs(AudioOutputObs obs) {
        this.obs = obs;
        return this;
    }

    public AudioOutput withObs(Consumer<AudioOutputObs> obsSetter) {
        if (this.obs == null) {
            this.obs = new AudioOutputObs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public AudioOutputObs getObs() {
        return obs;
    }

    public void setObs(AudioOutputObs obs) {
        this.obs = obs;
    }

    public AudioOutput withHosting(AudioOutputHosting hosting) {
        this.hosting = hosting;
        return this;
    }

    public AudioOutput withHosting(Consumer<AudioOutputHosting> hostingSetter) {
        if (this.hosting == null) {
            this.hosting = new AudioOutputHosting();
            hostingSetter.accept(this.hosting);
        }

        return this;
    }

    /**
     * Get hosting
     * @return hosting
     */
    public AudioOutputHosting getHosting() {
        return hosting;
    }

    public void setHosting(AudioOutputHosting hosting) {
        this.hosting = hosting;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioOutput audioOutput = (AudioOutput) o;
        return Objects.equals(this.obs, audioOutput.obs) && Objects.equals(this.hosting, audioOutput.hosting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, hosting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioOutput {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    hosting: ").append(toIndentedString(hosting)).append("\n");
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
