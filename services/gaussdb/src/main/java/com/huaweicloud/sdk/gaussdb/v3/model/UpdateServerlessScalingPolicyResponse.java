package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateServerlessScalingPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enlarge_step_size")

    private String enlargeStepSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_scaling_config")

    private CustomScalingConfig customScalingConfig;

    public UpdateServerlessScalingPolicyResponse withEnlargeStepSize(String enlargeStepSize) {
        this.enlargeStepSize = enlargeStepSize;
        return this;
    }

    /**
     * **参数描述**：  自定义扩容步长。  **约束限制**：  不涉及。  **取值范围**：  2-算力上限的一半。  **默认取值**：  不涉及。
     * @return enlargeStepSize
     */
    public String getEnlargeStepSize() {
        return enlargeStepSize;
    }

    public void setEnlargeStepSize(String enlargeStepSize) {
        this.enlargeStepSize = enlargeStepSize;
    }

    public UpdateServerlessScalingPolicyResponse withCustomScalingConfig(CustomScalingConfig customScalingConfig) {
        this.customScalingConfig = customScalingConfig;
        return this;
    }

    public UpdateServerlessScalingPolicyResponse withCustomScalingConfig(
        Consumer<CustomScalingConfig> customScalingConfigSetter) {
        if (this.customScalingConfig == null) {
            this.customScalingConfig = new CustomScalingConfig();
            customScalingConfigSetter.accept(this.customScalingConfig);
        }

        return this;
    }

    /**
     * Get customScalingConfig
     * @return customScalingConfig
     */
    public CustomScalingConfig getCustomScalingConfig() {
        return customScalingConfig;
    }

    public void setCustomScalingConfig(CustomScalingConfig customScalingConfig) {
        this.customScalingConfig = customScalingConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServerlessScalingPolicyResponse that = (UpdateServerlessScalingPolicyResponse) obj;
        return Objects.equals(this.enlargeStepSize, that.enlargeStepSize)
            && Objects.equals(this.customScalingConfig, that.customScalingConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enlargeStepSize, customScalingConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerlessScalingPolicyResponse {\n");
        sb.append("    enlargeStepSize: ").append(toIndentedString(enlargeStepSize)).append("\n");
        sb.append("    customScalingConfig: ").append(toIndentedString(customScalingConfig)).append("\n");
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
