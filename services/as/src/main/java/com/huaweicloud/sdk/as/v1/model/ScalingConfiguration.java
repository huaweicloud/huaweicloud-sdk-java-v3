package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.InstanceConfigResult;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 伸缩配置详情
 */
public class ScalingConfiguration  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_id")
    
    private String scalingConfigurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant")
    
    private String tenant;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_name")
    
    private String scalingConfigurationName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_config")
    
    private InstanceConfigResult instanceConfig = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;

    public ScalingConfiguration withScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    


    /**
     * 伸缩配置ID，全局唯一。
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    public ScalingConfiguration withTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    


    /**
     * 租户ID。
     * @return tenant
     */
    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public ScalingConfiguration withScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }

    


    /**
     * 伸缩配置名称。
     * @return scalingConfigurationName
     */
    public String getScalingConfigurationName() {
        return scalingConfigurationName;
    }

    public void setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
    }

    public ScalingConfiguration withInstanceConfig(InstanceConfigResult instanceConfig) {
        this.instanceConfig = instanceConfig;
        return this;
    }

    public ScalingConfiguration withInstanceConfig(Consumer<InstanceConfigResult> instanceConfigSetter) {
        if(this.instanceConfig == null ){
            this.instanceConfig = new InstanceConfigResult();
        }
        instanceConfigSetter.accept(this.instanceConfig);
        return this;
    }


    /**
     * Get instanceConfig
     * @return instanceConfig
     */
    public InstanceConfigResult getInstanceConfig() {
        return instanceConfig;
    }

    public void setInstanceConfig(InstanceConfigResult instanceConfig) {
        this.instanceConfig = instanceConfig;
    }

    public ScalingConfiguration withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建伸缩配置的时间，遵循UTC时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingConfiguration scalingConfiguration = (ScalingConfiguration) o;
        return Objects.equals(this.scalingConfigurationId, scalingConfiguration.scalingConfigurationId) &&
            Objects.equals(this.tenant, scalingConfiguration.tenant) &&
            Objects.equals(this.scalingConfigurationName, scalingConfiguration.scalingConfigurationName) &&
            Objects.equals(this.instanceConfig, scalingConfiguration.instanceConfig) &&
            Objects.equals(this.createTime, scalingConfiguration.createTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingConfigurationId, tenant, scalingConfigurationName, instanceConfig, createTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingConfiguration {\n");
            sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
            sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
            sb.append("    scalingConfigurationName: ").append(toIndentedString(scalingConfigurationName)).append("\n");
            sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

