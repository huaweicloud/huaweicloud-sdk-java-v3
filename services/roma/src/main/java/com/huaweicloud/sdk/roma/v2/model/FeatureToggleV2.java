package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** FeatureToggleV2 */
public class FeatureToggleV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private String config;

    public FeatureToggleV2 withName(String name) {
        this.name = name;
        return this;
    }

    /** 特性名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FeatureToggleV2 withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /** 是否开启特性
     * 
     * @return enable */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public FeatureToggleV2 withConfig(String config) {
        this.config = config;
        return this;
    }

    /** 特性参数配置
     * 
     * @return config */
    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeatureToggleV2 featureToggleV2 = (FeatureToggleV2) o;
        return Objects.equals(this.name, featureToggleV2.name) && Objects.equals(this.enable, featureToggleV2.enable)
            && Objects.equals(this.config, featureToggleV2.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enable, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureToggleV2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
