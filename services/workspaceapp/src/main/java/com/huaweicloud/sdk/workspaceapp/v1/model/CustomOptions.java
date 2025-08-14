package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义策略设置项。
 */
public class CustomOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_configuration1_rule")

    private String customConfiguration1Rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rail_transparent_config")

    private RailTransparentConfig railTransparentConfig;

    public CustomOptions withCustomConfiguration1Rule(String customConfiguration1Rule) {
        this.customConfiguration1Rule = customConfiguration1Rule;
        return this;
    }

    /**
     * 配置项1内容。
     * @return customConfiguration1Rule
     */
    public String getCustomConfiguration1Rule() {
        return customConfiguration1Rule;
    }

    public void setCustomConfiguration1Rule(String customConfiguration1Rule) {
        this.customConfiguration1Rule = customConfiguration1Rule;
    }

    public CustomOptions withRailTransparentConfig(RailTransparentConfig railTransparentConfig) {
        this.railTransparentConfig = railTransparentConfig;
        return this;
    }

    public CustomOptions withRailTransparentConfig(Consumer<RailTransparentConfig> railTransparentConfigSetter) {
        if (this.railTransparentConfig == null) {
            this.railTransparentConfig = new RailTransparentConfig();
            railTransparentConfigSetter.accept(this.railTransparentConfig);
        }

        return this;
    }

    /**
     * Get railTransparentConfig
     * @return railTransparentConfig
     */
    public RailTransparentConfig getRailTransparentConfig() {
        return railTransparentConfig;
    }

    public void setRailTransparentConfig(RailTransparentConfig railTransparentConfig) {
        this.railTransparentConfig = railTransparentConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomOptions that = (CustomOptions) obj;
        return Objects.equals(this.customConfiguration1Rule, that.customConfiguration1Rule)
            && Objects.equals(this.railTransparentConfig, that.railTransparentConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customConfiguration1Rule, railTransparentConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomOptions {\n");
        sb.append("    customConfiguration1Rule: ").append(toIndentedString(customConfiguration1Rule)).append("\n");
        sb.append("    railTransparentConfig: ").append(toIndentedString(railTransparentConfig)).append("\n");
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
