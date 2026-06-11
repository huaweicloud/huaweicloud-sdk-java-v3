package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetSwitchoverRatioInfo
 */
public class SetSwitchoverRatioInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchover_ratio")

    private Integer switchoverRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_delay")

    private Long syncDelay;

    public SetSwitchoverRatioInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释：** 实例ID，可以调用“查询实例列表”接口获取。如果未申请实例，可以调用“创建实例”接口创建。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SetSwitchoverRatioInfo withSwitchoverRatio(Integer switchoverRatio) {
        this.switchoverRatio = switchoverRatio;
        return this;
    }

    /**
     * **参数解释：** 容灾切换的故障节点比例。 **约束限制**： 下限是50，步长是10，最大是100。 **取值范围：** - 50 - 60 - 70 - 80 - 90 - 100 **默认取值：** 100。
     * @return switchoverRatio
     */
    public Integer getSwitchoverRatio() {
        return switchoverRatio;
    }

    public void setSwitchoverRatio(Integer switchoverRatio) {
        this.switchoverRatio = switchoverRatio;
    }

    public SetSwitchoverRatioInfo withSyncDelay(Long syncDelay) {
        this.syncDelay = syncDelay;
        return this;
    }

    /**
     * **参数解释：** 容灾实例数据同步时延，单位s。备实例和主实例同步时延超过该值时，不进行容灾倒换。默认不判断时延。 **约束限制：** 若需指定此参数，最小为10s。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return syncDelay
     */
    public Long getSyncDelay() {
        return syncDelay;
    }

    public void setSyncDelay(Long syncDelay) {
        this.syncDelay = syncDelay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetSwitchoverRatioInfo that = (SetSwitchoverRatioInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.switchoverRatio, that.switchoverRatio)
            && Objects.equals(this.syncDelay, that.syncDelay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, switchoverRatio, syncDelay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetSwitchoverRatioInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    switchoverRatio: ").append(toIndentedString(switchoverRatio)).append("\n");
        sb.append("    syncDelay: ").append(toIndentedString(syncDelay)).append("\n");
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
