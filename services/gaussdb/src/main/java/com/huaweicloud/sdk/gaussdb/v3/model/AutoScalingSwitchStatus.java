package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开关状态。
 */
public class AutoScalingSwitchStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_switch")

    private String scalingSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_switch")

    private String flavorSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_switch")

    private String readOnlySwitch;

    public AutoScalingSwitchStatus withScalingSwitch(String scalingSwitch) {
        this.scalingSwitch = scalingSwitch;
        return this;
    }

    /**
     * 自动变配开关状态。  取值：  - ON：开启。 - OFF：关闭。
     * @return scalingSwitch
     */
    public String getScalingSwitch() {
        return scalingSwitch;
    }

    public void setScalingSwitch(String scalingSwitch) {
        this.scalingSwitch = scalingSwitch;
    }

    public AutoScalingSwitchStatus withFlavorSwitch(String flavorSwitch) {
        this.flavorSwitch = flavorSwitch;
        return this;
    }

    /**
     * 扩缩规格开关状态。  取值：  - ON：开启。 - OFF：关闭。
     * @return flavorSwitch
     */
    public String getFlavorSwitch() {
        return flavorSwitch;
    }

    public void setFlavorSwitch(String flavorSwitch) {
        this.flavorSwitch = flavorSwitch;
    }

    public AutoScalingSwitchStatus withReadOnlySwitch(String readOnlySwitch) {
        this.readOnlySwitch = readOnlySwitch;
        return this;
    }

    /**
     * 增删只读节点开关状态。  取值：  - ON：开启。 - OFF：关闭。
     * @return readOnlySwitch
     */
    public String getReadOnlySwitch() {
        return readOnlySwitch;
    }

    public void setReadOnlySwitch(String readOnlySwitch) {
        this.readOnlySwitch = readOnlySwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoScalingSwitchStatus that = (AutoScalingSwitchStatus) obj;
        return Objects.equals(this.scalingSwitch, that.scalingSwitch)
            && Objects.equals(this.flavorSwitch, that.flavorSwitch)
            && Objects.equals(this.readOnlySwitch, that.readOnlySwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingSwitch, flavorSwitch, readOnlySwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingSwitchStatus {\n");
        sb.append("    scalingSwitch: ").append(toIndentedString(scalingSwitch)).append("\n");
        sb.append("    flavorSwitch: ").append(toIndentedString(flavorSwitch)).append("\n");
        sb.append("    readOnlySwitch: ").append(toIndentedString(readOnlySwitch)).append("\n");
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
