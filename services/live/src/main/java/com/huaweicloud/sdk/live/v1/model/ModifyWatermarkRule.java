package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyWatermarkRule
 */
public class ModifyWatermarkRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private WatermarkLocation location;

    public ModifyWatermarkRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 水印规则名称，如果不填说明不修改。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ModifyWatermarkRule withLocation(WatermarkLocation location) {
        this.location = location;
        return this;
    }

    public ModifyWatermarkRule withLocation(Consumer<WatermarkLocation> locationSetter) {
        if (this.location == null) {
            this.location = new WatermarkLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public WatermarkLocation getLocation() {
        return location;
    }

    public void setLocation(WatermarkLocation location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyWatermarkRule that = (ModifyWatermarkRule) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyWatermarkRule {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
