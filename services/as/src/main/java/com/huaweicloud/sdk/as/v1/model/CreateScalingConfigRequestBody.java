package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.InstanceConfig;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 创建伸缩配置请求
 */
public class CreateScalingConfigRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_name")
    
    private String scalingConfigurationName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_config")
    
    private InstanceConfig instanceConfig = null;

    public CreateScalingConfigRequestBody withScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }

    


    /**
     * 伸缩配置名称(1-64个字符)，只能包含中文、字母、数字、下划线或中划线。
     * @return scalingConfigurationName
     */
    public String getScalingConfigurationName() {
        return scalingConfigurationName;
    }

    public void setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
    }

    public CreateScalingConfigRequestBody withInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
        return this;
    }

    public CreateScalingConfigRequestBody withInstanceConfig(Consumer<InstanceConfig> instanceConfigSetter) {
        if(this.instanceConfig == null ){
            this.instanceConfig = new InstanceConfig();
        }
        instanceConfigSetter.accept(this.instanceConfig);
        return this;
    }


    /**
     * Get instanceConfig
     * @return instanceConfig
     */
    public InstanceConfig getInstanceConfig() {
        return instanceConfig;
    }

    public void setInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateScalingConfigRequestBody createScalingConfigRequestBody = (CreateScalingConfigRequestBody) o;
        return Objects.equals(this.scalingConfigurationName, createScalingConfigRequestBody.scalingConfigurationName) &&
            Objects.equals(this.instanceConfig, createScalingConfigRequestBody.instanceConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingConfigurationName, instanceConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScalingConfigRequestBody {\n");
            sb.append("    scalingConfigurationName: ").append(toIndentedString(scalingConfigurationName)).append("\n");
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

