package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoTaggingTaskConfig
 */
public class VideoTaggingTaskConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private VideoTaggingTaskConfigCommon common;

    public VideoTaggingTaskConfig withCommon(VideoTaggingTaskConfigCommon common) {
        this.common = common;
        return this;
    }

    public VideoTaggingTaskConfig withCommon(Consumer<VideoTaggingTaskConfigCommon> commonSetter) {
        if (this.common == null) {
            this.common = new VideoTaggingTaskConfigCommon();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /**
     * Get common
     * @return common
     */
    public VideoTaggingTaskConfigCommon getCommon() {
        return common;
    }

    public void setCommon(VideoTaggingTaskConfigCommon common) {
        this.common = common;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoTaggingTaskConfig that = (VideoTaggingTaskConfig) obj;
        return Objects.equals(this.common, that.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTaggingTaskConfig {\n");
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
