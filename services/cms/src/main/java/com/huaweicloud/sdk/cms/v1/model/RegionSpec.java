package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 一个Region内的资源需求描述
 */
public class RegionSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_target_capacity")

    private Integer expectTargetCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_stable_capacity")

    private Integer expectStableCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_template_config")

    private LaunchTemplateConfig launchTemplateConfig;

    public RegionSpec withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region的id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public RegionSpec withExpectTargetCapacity(Integer expectTargetCapacity) {
        this.expectTargetCapacity = expectTargetCapacity;
        return this;
    }

    /**
     * Region内期望的总算力容量
     * @return expectTargetCapacity
     */
    public Integer getExpectTargetCapacity() {
        return expectTargetCapacity;
    }

    public void setExpectTargetCapacity(Integer expectTargetCapacity) {
        this.expectTargetCapacity = expectTargetCapacity;
    }

    public RegionSpec withExpectStableCapacity(Integer expectStableCapacity) {
        this.expectStableCapacity = expectStableCapacity;
        return this;
    }

    /**
     * Region内期望的稳定算力总量
     * @return expectStableCapacity
     */
    public Integer getExpectStableCapacity() {
        return expectStableCapacity;
    }

    public void setExpectStableCapacity(Integer expectStableCapacity) {
        this.expectStableCapacity = expectStableCapacity;
    }

    public RegionSpec withLaunchTemplateConfig(LaunchTemplateConfig launchTemplateConfig) {
        this.launchTemplateConfig = launchTemplateConfig;
        return this;
    }

    public RegionSpec withLaunchTemplateConfig(Consumer<LaunchTemplateConfig> launchTemplateConfigSetter) {
        if (this.launchTemplateConfig == null) {
            this.launchTemplateConfig = new LaunchTemplateConfig();
            launchTemplateConfigSetter.accept(this.launchTemplateConfig);
        }

        return this;
    }

    /**
     * Get launchTemplateConfig
     * @return launchTemplateConfig
     */
    public LaunchTemplateConfig getLaunchTemplateConfig() {
        return launchTemplateConfig;
    }

    public void setLaunchTemplateConfig(LaunchTemplateConfig launchTemplateConfig) {
        this.launchTemplateConfig = launchTemplateConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegionSpec regionSpec = (RegionSpec) o;
        return Objects.equals(this.regionId, regionSpec.regionId)
            && Objects.equals(this.expectTargetCapacity, regionSpec.expectTargetCapacity)
            && Objects.equals(this.expectStableCapacity, regionSpec.expectStableCapacity)
            && Objects.equals(this.launchTemplateConfig, regionSpec.launchTemplateConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, expectTargetCapacity, expectStableCapacity, launchTemplateConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionSpec {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    expectTargetCapacity: ").append(toIndentedString(expectTargetCapacity)).append("\n");
        sb.append("    expectStableCapacity: ").append(toIndentedString(expectStableCapacity)).append("\n");
        sb.append("    launchTemplateConfig: ").append(toIndentedString(launchTemplateConfig)).append("\n");
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
