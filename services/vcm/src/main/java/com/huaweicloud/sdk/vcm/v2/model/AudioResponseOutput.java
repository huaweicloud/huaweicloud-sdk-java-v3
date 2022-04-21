package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 音频数据的输出列表
 */
public class AudioResponseOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private AudioOutputObs obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting")

    private AudioResponseOutputHosting hosting;

    public AudioResponseOutput withObs(AudioOutputObs obs) {
        this.obs = obs;
        return this;
    }

    public AudioResponseOutput withObs(Consumer<AudioOutputObs> obsSetter) {
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

    public AudioResponseOutput withHosting(AudioResponseOutputHosting hosting) {
        this.hosting = hosting;
        return this;
    }

    public AudioResponseOutput withHosting(Consumer<AudioResponseOutputHosting> hostingSetter) {
        if (this.hosting == null) {
            this.hosting = new AudioResponseOutputHosting();
            hostingSetter.accept(this.hosting);
        }

        return this;
    }

    /**
     * Get hosting
     * @return hosting
     */
    public AudioResponseOutputHosting getHosting() {
        return hosting;
    }

    public void setHosting(AudioResponseOutputHosting hosting) {
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
        AudioResponseOutput audioResponseOutput = (AudioResponseOutput) o;
        return Objects.equals(this.obs, audioResponseOutput.obs)
            && Objects.equals(this.hosting, audioResponseOutput.hosting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, hosting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioResponseOutput {\n");
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
