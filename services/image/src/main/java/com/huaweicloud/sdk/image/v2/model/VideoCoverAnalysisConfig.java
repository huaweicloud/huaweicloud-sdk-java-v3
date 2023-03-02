package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoCoverAnalysisConfig
 */
public class VideoCoverAnalysisConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private VideoCoverAnalysisConfigCommon common;

    public VideoCoverAnalysisConfig withCommon(VideoCoverAnalysisConfigCommon common) {
        this.common = common;
        return this;
    }

    public VideoCoverAnalysisConfig withCommon(Consumer<VideoCoverAnalysisConfigCommon> commonSetter) {
        if (this.common == null) {
            this.common = new VideoCoverAnalysisConfigCommon();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /**
     * Get common
     * @return common
     */
    public VideoCoverAnalysisConfigCommon getCommon() {
        return common;
    }

    public void setCommon(VideoCoverAnalysisConfigCommon common) {
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
        VideoCoverAnalysisConfig videoCoverAnalysisConfig = (VideoCoverAnalysisConfig) o;
        return Objects.equals(this.common, videoCoverAnalysisConfig.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCoverAnalysisConfig {\n");
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
