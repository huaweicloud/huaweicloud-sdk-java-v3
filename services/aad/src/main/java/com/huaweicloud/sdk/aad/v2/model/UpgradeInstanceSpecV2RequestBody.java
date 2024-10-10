package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpgradeInstanceSpecV2RequestBody
 */
public class UpgradeInstanceSpecV2RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_data")

    private UpgradeInstanceData upgradeData;

    public UpgradeInstanceSpecV2RequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpgradeInstanceSpecV2RequestBody withUpgradeData(UpgradeInstanceData upgradeData) {
        this.upgradeData = upgradeData;
        return this;
    }

    public UpgradeInstanceSpecV2RequestBody withUpgradeData(Consumer<UpgradeInstanceData> upgradeDataSetter) {
        if (this.upgradeData == null) {
            this.upgradeData = new UpgradeInstanceData();
            upgradeDataSetter.accept(this.upgradeData);
        }

        return this;
    }

    /**
     * Get upgradeData
     * @return upgradeData
     */
    public UpgradeInstanceData getUpgradeData() {
        return upgradeData;
    }

    public void setUpgradeData(UpgradeInstanceData upgradeData) {
        this.upgradeData = upgradeData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeInstanceSpecV2RequestBody that = (UpgradeInstanceSpecV2RequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.upgradeData, that.upgradeData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, upgradeData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeInstanceSpecV2RequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    upgradeData: ").append(toIndentedString(upgradeData)).append("\n");
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
