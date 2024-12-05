package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SwitchoverRatioInfo
 */
public class SwitchoverRatioInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchover_ratio")

    private Integer switchoverRatio;

    public SwitchoverRatioInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SwitchoverRatioInfo withSwitchoverRatio(Integer switchoverRatio) {
        this.switchoverRatio = switchoverRatio;
        return this;
    }

    /**
     * 容灾切换的故障节点比例，下限是50，步长是10，最大是100，默认为100。
     * @return switchoverRatio
     */
    public Integer getSwitchoverRatio() {
        return switchoverRatio;
    }

    public void setSwitchoverRatio(Integer switchoverRatio) {
        this.switchoverRatio = switchoverRatio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchoverRatioInfo that = (SwitchoverRatioInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.switchoverRatio, that.switchoverRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, switchoverRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchoverRatioInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    switchoverRatio: ").append(toIndentedString(switchoverRatio)).append("\n");
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
