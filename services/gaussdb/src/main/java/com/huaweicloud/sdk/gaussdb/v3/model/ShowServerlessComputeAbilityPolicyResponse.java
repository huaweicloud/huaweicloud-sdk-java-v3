package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowServerlessComputeAbilityPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_vcpus")

    private String currentVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_vcpus")

    private String minVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_vcpus")

    private String maxVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_out_switch")

    private Boolean scaleOutSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_readonly_node_count")

    private Integer maxReadonlyNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_readonly_node_count")

    private Integer minReadonlyNodeCount;

    public ShowServerlessComputeAbilityPolicyResponse withCurrentVcpus(String currentVcpus) {
        this.currentVcpus = currentVcpus;
        return this;
    }

    /**
     * **参数描述**：  当前算力。  **取值范围**：  介于最大算力和最小算力之间。
     * @return currentVcpus
     */
    public String getCurrentVcpus() {
        return currentVcpus;
    }

    public void setCurrentVcpus(String currentVcpus) {
        this.currentVcpus = currentVcpus;
    }

    public ShowServerlessComputeAbilityPolicyResponse withMinVcpus(String minVcpus) {
        this.minVcpus = minVcpus;
        return this;
    }

    /**
     * **参数解释**：  最小算力。  **取值范围**：  ≥0.5。
     * @return minVcpus
     */
    public String getMinVcpus() {
        return minVcpus;
    }

    public void setMinVcpus(String minVcpus) {
        this.minVcpus = minVcpus;
    }

    public ShowServerlessComputeAbilityPolicyResponse withMaxVcpus(String maxVcpus) {
        this.maxVcpus = maxVcpus;
        return this;
    }

    /**
     * **参数解释**：  最大算力。  **取值范围**：  ≥4。
     * @return maxVcpus
     */
    public String getMaxVcpus() {
        return maxVcpus;
    }

    public void setMaxVcpus(String maxVcpus) {
        this.maxVcpus = maxVcpus;
    }

    public ShowServerlessComputeAbilityPolicyResponse withScaleOutSwitch(Boolean scaleOutSwitch) {
        this.scaleOutSwitch = scaleOutSwitch;
        return this;
    }

    /**
     * **参数解释**:  增删只读节点开关。  **取值范围**： - true: 开启增删只读节点。 - false: 关闭增删只读节点。
     * @return scaleOutSwitch
     */
    public Boolean getScaleOutSwitch() {
        return scaleOutSwitch;
    }

    public void setScaleOutSwitch(Boolean scaleOutSwitch) {
        this.scaleOutSwitch = scaleOutSwitch;
    }

    public ShowServerlessComputeAbilityPolicyResponse withMaxReadonlyNodeCount(Integer maxReadonlyNodeCount) {
        this.maxReadonlyNodeCount = maxReadonlyNodeCount;
        return this;
    }

    /**
     * **参数解释**：  最大只读节点个数。  **取值范围**：  ≥2。
     * @return maxReadonlyNodeCount
     */
    public Integer getMaxReadonlyNodeCount() {
        return maxReadonlyNodeCount;
    }

    public void setMaxReadonlyNodeCount(Integer maxReadonlyNodeCount) {
        this.maxReadonlyNodeCount = maxReadonlyNodeCount;
    }

    public ShowServerlessComputeAbilityPolicyResponse withMinReadonlyNodeCount(Integer minReadonlyNodeCount) {
        this.minReadonlyNodeCount = minReadonlyNodeCount;
        return this;
    }

    /**
     * **参数解释**：  最小只读节点个数。  **取值范围**：  ≥1。    
     * @return minReadonlyNodeCount
     */
    public Integer getMinReadonlyNodeCount() {
        return minReadonlyNodeCount;
    }

    public void setMinReadonlyNodeCount(Integer minReadonlyNodeCount) {
        this.minReadonlyNodeCount = minReadonlyNodeCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerlessComputeAbilityPolicyResponse that = (ShowServerlessComputeAbilityPolicyResponse) obj;
        return Objects.equals(this.currentVcpus, that.currentVcpus) && Objects.equals(this.minVcpus, that.minVcpus)
            && Objects.equals(this.maxVcpus, that.maxVcpus) && Objects.equals(this.scaleOutSwitch, that.scaleOutSwitch)
            && Objects.equals(this.maxReadonlyNodeCount, that.maxReadonlyNodeCount)
            && Objects.equals(this.minReadonlyNodeCount, that.minReadonlyNodeCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(currentVcpus, minVcpus, maxVcpus, scaleOutSwitch, maxReadonlyNodeCount, minReadonlyNodeCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerlessComputeAbilityPolicyResponse {\n");
        sb.append("    currentVcpus: ").append(toIndentedString(currentVcpus)).append("\n");
        sb.append("    minVcpus: ").append(toIndentedString(minVcpus)).append("\n");
        sb.append("    maxVcpus: ").append(toIndentedString(maxVcpus)).append("\n");
        sb.append("    scaleOutSwitch: ").append(toIndentedString(scaleOutSwitch)).append("\n");
        sb.append("    maxReadonlyNodeCount: ").append(toIndentedString(maxReadonlyNodeCount)).append("\n");
        sb.append("    minReadonlyNodeCount: ").append(toIndentedString(minReadonlyNodeCount)).append("\n");
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
