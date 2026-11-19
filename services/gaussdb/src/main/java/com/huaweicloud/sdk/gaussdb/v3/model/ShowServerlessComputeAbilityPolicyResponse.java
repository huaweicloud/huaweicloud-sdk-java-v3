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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_to_zero")

    private Boolean scaleToZero;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_duration_seconds")

    private Integer idleDurationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_to_zero_status")

    private String scaleToZeroStatus;

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

    public ShowServerlessComputeAbilityPolicyResponse withScaleToZero(Boolean scaleToZero) {
        this.scaleToZero = scaleToZero;
        return this;
    }

    /**
     * **参数解释**：  Scale to Zero开关。  **取值范围**： - true: 开启Scale to Zero。 - false: 关闭Scale to Zero。
     * @return scaleToZero
     */
    public Boolean getScaleToZero() {
        return scaleToZero;
    }

    public void setScaleToZero(Boolean scaleToZero) {
        this.scaleToZero = scaleToZero;
    }

    public ShowServerlessComputeAbilityPolicyResponse withIdleDurationSeconds(Integer idleDurationSeconds) {
        this.idleDurationSeconds = idleDurationSeconds;
        return this;
    }

    /**
     * **参数解释**：  空闲持续时长阈值，单位是秒。  所有节点活跃连接数为0且持续达到该阈值时触发Scale to Zero（停止计算计费）。  **取值范围**：  300-3600。
     * @return idleDurationSeconds
     */
    public Integer getIdleDurationSeconds() {
        return idleDurationSeconds;
    }

    public void setIdleDurationSeconds(Integer idleDurationSeconds) {
        this.idleDurationSeconds = idleDurationSeconds;
    }

    public ShowServerlessComputeAbilityPolicyResponse withScaleToZeroStatus(String scaleToZeroStatus) {
        this.scaleToZeroStatus = scaleToZeroStatus;
        return this;
    }

    /**
     * **参数解释**：  Scale to Zero开启后实例的运行状态。  **取值范围**： - ACTIVE：实例已唤醒，正常计费。 - SCALED_TO_ZERO：计算资源停止计费。
     * @return scaleToZeroStatus
     */
    public String getScaleToZeroStatus() {
        return scaleToZeroStatus;
    }

    public void setScaleToZeroStatus(String scaleToZeroStatus) {
        this.scaleToZeroStatus = scaleToZeroStatus;
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
            && Objects.equals(this.minReadonlyNodeCount, that.minReadonlyNodeCount)
            && Objects.equals(this.scaleToZero, that.scaleToZero)
            && Objects.equals(this.idleDurationSeconds, that.idleDurationSeconds)
            && Objects.equals(this.scaleToZeroStatus, that.scaleToZeroStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentVcpus,
            minVcpus,
            maxVcpus,
            scaleOutSwitch,
            maxReadonlyNodeCount,
            minReadonlyNodeCount,
            scaleToZero,
            idleDurationSeconds,
            scaleToZeroStatus);
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
        sb.append("    scaleToZero: ").append(toIndentedString(scaleToZero)).append("\n");
        sb.append("    idleDurationSeconds: ").append(toIndentedString(idleDurationSeconds)).append("\n");
        sb.append("    scaleToZeroStatus: ").append(toIndentedString(scaleToZeroStatus)).append("\n");
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
