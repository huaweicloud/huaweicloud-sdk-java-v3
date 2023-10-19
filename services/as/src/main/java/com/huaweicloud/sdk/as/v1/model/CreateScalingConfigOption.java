package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建伸缩配置请求
 */
public class CreateScalingConfigOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_configuration_name")

    private String scalingConfigurationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_config")

    private InstanceConfig instanceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_scaling_configuration_id")

    private String sourceScalingConfigurationId;

    public CreateScalingConfigOption withScalingConfigurationName(String scalingConfigurationName) {
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

    public CreateScalingConfigOption withInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
        return this;
    }

    public CreateScalingConfigOption withInstanceConfig(Consumer<InstanceConfig> instanceConfigSetter) {
        if (this.instanceConfig == null) {
            this.instanceConfig = new InstanceConfig();
            instanceConfigSetter.accept(this.instanceConfig);
        }

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

    public CreateScalingConfigOption withSourceScalingConfigurationId(String sourceScalingConfigurationId) {
        this.sourceScalingConfigurationId = sourceScalingConfigurationId;
        return this;
    }

    /**
     * 源伸缩配置ID，通过该ID查询已有伸缩配置信息与instance_config中参数进行结合，创建新的伸缩配置。 说明：  - 若传入instance_config中的instance_id，则优先使用instance_id相关实例配置创建新的伸缩配置，source_scaling_configuration_id参数不生效。  - 若未传入instance_config中的instance_id，则使用source_scaling_configuration_id与instance_config中的参数相结合创建伸缩配置。         - 若instance_config中的参数值为null，则创建新伸缩配置时该字段不产生修改。         - 若instance_config中的参数值不为null，则创建新伸缩配置时该字段将覆盖原有值，其中值为空时，该字段会被清空。  - 若不指定source_scaling_configuration_id创建伸缩配置，则scaling_configuration_name和instance_config为必选。
     * @return sourceScalingConfigurationId
     */
    public String getSourceScalingConfigurationId() {
        return sourceScalingConfigurationId;
    }

    public void setSourceScalingConfigurationId(String sourceScalingConfigurationId) {
        this.sourceScalingConfigurationId = sourceScalingConfigurationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateScalingConfigOption that = (CreateScalingConfigOption) obj;
        return Objects.equals(this.scalingConfigurationName, that.scalingConfigurationName)
            && Objects.equals(this.instanceConfig, that.instanceConfig)
            && Objects.equals(this.sourceScalingConfigurationId, that.sourceScalingConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingConfigurationName, instanceConfig, sourceScalingConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScalingConfigOption {\n");
        sb.append("    scalingConfigurationName: ").append(toIndentedString(scalingConfigurationName)).append("\n");
        sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
        sb.append("    sourceScalingConfigurationId: ")
            .append(toIndentedString(sourceScalingConfigurationId))
            .append("\n");
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
