package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 配置 */
public class AudioServiceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private AudioServiceConfigCommon common;

    public AudioServiceConfig withCommon(AudioServiceConfigCommon common) {
        this.common = common;
        return this;
    }

    public AudioServiceConfig withCommon(Consumer<AudioServiceConfigCommon> commonSetter) {
        if (this.common == null) {
            this.common = new AudioServiceConfigCommon();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /** Get common
     * 
     * @return common */
    public AudioServiceConfigCommon getCommon() {
        return common;
    }

    public void setCommon(AudioServiceConfigCommon common) {
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
        AudioServiceConfig audioServiceConfig = (AudioServiceConfig) o;
        return Objects.equals(this.common, audioServiceConfig.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioServiceConfig {\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
