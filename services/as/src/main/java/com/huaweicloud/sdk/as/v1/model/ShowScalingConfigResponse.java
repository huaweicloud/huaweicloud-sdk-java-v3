package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingConfiguration;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowScalingConfigResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration")
    
    private ScalingConfiguration scalingConfiguration = null;

    public ShowScalingConfigResponse withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
        return this;
    }

    public ShowScalingConfigResponse withScalingConfiguration(Consumer<ScalingConfiguration> scalingConfigurationSetter) {
        if(this.scalingConfiguration == null ){
            this.scalingConfiguration = new ScalingConfiguration();
        }
        scalingConfigurationSetter.accept(this.scalingConfiguration);
        return this;
    }


    /**
     * Get scalingConfiguration
     * @return scalingConfiguration
     */
    public ScalingConfiguration getScalingConfiguration() {
        return scalingConfiguration;
    }

    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScalingConfigResponse showScalingConfigResponse = (ShowScalingConfigResponse) o;
        return Objects.equals(this.scalingConfiguration, showScalingConfigResponse.scalingConfiguration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingConfiguration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScalingConfigResponse {\n");
            sb.append("    scalingConfiguration: ").append(toIndentedString(scalingConfiguration)).append("\n");
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

