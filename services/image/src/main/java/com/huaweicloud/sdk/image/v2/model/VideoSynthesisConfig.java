package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoSynthesisConfig
 */
public class VideoSynthesisConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private VideoSynthesisConfigCommon common;

    public VideoSynthesisConfig withCommon(VideoSynthesisConfigCommon common) {
        this.common = common;
        return this;
    }

    public VideoSynthesisConfig withCommon(Consumer<VideoSynthesisConfigCommon> commonSetter) {
        if (this.common == null) {
            this.common = new VideoSynthesisConfigCommon();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /**
     * Get common
     * @return common
     */
    public VideoSynthesisConfigCommon getCommon() {
        return common;
    }

    public void setCommon(VideoSynthesisConfigCommon common) {
        this.common = common;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSynthesisConfig videoSynthesisConfig = (VideoSynthesisConfig) o;
        return Objects.equals(this.common, videoSynthesisConfig.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSynthesisConfig {\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
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
