package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoTranslateConfig
 */
public class VideoTranslateConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private VideoTranslateConfigCommon common;

    public VideoTranslateConfig withCommon(VideoTranslateConfigCommon common) {
        this.common = common;
        return this;
    }

    public VideoTranslateConfig withCommon(Consumer<VideoTranslateConfigCommon> commonSetter) {
        if (this.common == null) {
            this.common = new VideoTranslateConfigCommon();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /**
     * Get common
     * @return common
     */
    public VideoTranslateConfigCommon getCommon() {
        return common;
    }

    public void setCommon(VideoTranslateConfigCommon common) {
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
        VideoTranslateConfig videoTranslateConfig = (VideoTranslateConfig) o;
        return Objects.equals(this.common, videoTranslateConfig.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTranslateConfig {\n");
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
