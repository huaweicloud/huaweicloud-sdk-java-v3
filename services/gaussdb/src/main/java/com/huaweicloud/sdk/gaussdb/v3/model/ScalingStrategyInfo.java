package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动变配策略。
 */
public class ScalingStrategyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_switch")

    private String flavorSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_switch")

    private String readOnlySwitch;

    public ScalingStrategyInfo withFlavorSwitch(String flavorSwitch) {
        this.flavorSwitch = flavorSwitch;
        return this;
    }

    /**
     * 扩缩规格开关。 - ON：开启。 - OFF：关闭。
     * @return flavorSwitch
     */
    public String getFlavorSwitch() {
        return flavorSwitch;
    }

    public void setFlavorSwitch(String flavorSwitch) {
        this.flavorSwitch = flavorSwitch;
    }

    public ScalingStrategyInfo withReadOnlySwitch(String readOnlySwitch) {
        this.readOnlySwitch = readOnlySwitch;
        return this;
    }

    /**
     * 增删只读节点开关。 - ON：开启。 - OFF：关闭。
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
        ScalingStrategyInfo that = (ScalingStrategyInfo) obj;
        return Objects.equals(this.flavorSwitch, that.flavorSwitch)
            && Objects.equals(this.readOnlySwitch, that.readOnlySwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorSwitch, readOnlySwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingStrategyInfo {\n");
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
