package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateScalingConfigOption
 */
public class UpdateScalingConfigOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_config")

    private UpdateInstanceConfig instanceConfig;

    public UpdateScalingConfigOption withInstanceConfig(UpdateInstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
        return this;
    }

    public UpdateScalingConfigOption withInstanceConfig(Consumer<UpdateInstanceConfig> instanceConfigSetter) {
        if (this.instanceConfig == null) {
            this.instanceConfig = new UpdateInstanceConfig();
            instanceConfigSetter.accept(this.instanceConfig);
        }

        return this;
    }

    /**
     * Get instanceConfig
     * @return instanceConfig
     */
    public UpdateInstanceConfig getInstanceConfig() {
        return instanceConfig;
    }

    public void setInstanceConfig(UpdateInstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScalingConfigOption that = (UpdateScalingConfigOption) obj;
        return Objects.equals(this.instanceConfig, that.instanceConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScalingConfigOption {\n");
        sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
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
