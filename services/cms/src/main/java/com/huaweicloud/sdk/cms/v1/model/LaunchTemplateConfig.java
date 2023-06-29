package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 启动模板相关配置
 */
public class LaunchTemplateConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_template")

    private LaunchTemplateInfo launchTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overrides")

    private List<OverrideInfo> overrides = null;

    public LaunchTemplateConfig withLaunchTemplate(LaunchTemplateInfo launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    public LaunchTemplateConfig withLaunchTemplate(Consumer<LaunchTemplateInfo> launchTemplateSetter) {
        if (this.launchTemplate == null) {
            this.launchTemplate = new LaunchTemplateInfo();
            launchTemplateSetter.accept(this.launchTemplate);
        }

        return this;
    }

    /**
     * Get launchTemplate
     * @return launchTemplate
     */
    public LaunchTemplateInfo getLaunchTemplate() {
        return launchTemplate;
    }

    public void setLaunchTemplate(LaunchTemplateInfo launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public LaunchTemplateConfig withOverrides(List<OverrideInfo> overrides) {
        this.overrides = overrides;
        return this;
    }

    public LaunchTemplateConfig addOverridesItem(OverrideInfo overridesItem) {
        if (this.overrides == null) {
            this.overrides = new ArrayList<>();
        }
        this.overrides.add(overridesItem);
        return this;
    }

    public LaunchTemplateConfig withOverrides(Consumer<List<OverrideInfo>> overridesSetter) {
        if (this.overrides == null) {
            this.overrides = new ArrayList<>();
        }
        overridesSetter.accept(this.overrides);
        return this;
    }

    /**
     * 实例的详细信息
     * @return overrides
     */
    public List<OverrideInfo> getOverrides() {
        return overrides;
    }

    public void setOverrides(List<OverrideInfo> overrides) {
        this.overrides = overrides;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaunchTemplateConfig that = (LaunchTemplateConfig) obj;
        return Objects.equals(this.launchTemplate, that.launchTemplate)
            && Objects.equals(this.overrides, that.overrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(launchTemplate, overrides);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchTemplateConfig {\n");
        sb.append("    launchTemplate: ").append(toIndentedString(launchTemplate)).append("\n");
        sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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
