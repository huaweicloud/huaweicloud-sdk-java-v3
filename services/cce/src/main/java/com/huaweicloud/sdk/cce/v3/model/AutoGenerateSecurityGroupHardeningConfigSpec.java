package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AutoGenerateSecurityGroupHardeningConfigSpec
 */
public class AutoGenerateSecurityGroupHardeningConfigSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portsToDisable")

    private List<String> portsToDisable = null;

    public AutoGenerateSecurityGroupHardeningConfigSpec withPortsToDisable(List<String> portsToDisable) {
        this.portsToDisable = portsToDisable;
        return this;
    }

    public AutoGenerateSecurityGroupHardeningConfigSpec addPortsToDisableItem(String portsToDisableItem) {
        if (this.portsToDisable == null) {
            this.portsToDisable = new ArrayList<>();
        }
        this.portsToDisable.add(portsToDisableItem);
        return this;
    }

    public AutoGenerateSecurityGroupHardeningConfigSpec withPortsToDisable(
        Consumer<List<String>> portsToDisableSetter) {
        if (this.portsToDisable == null) {
            this.portsToDisable = new ArrayList<>();
        }
        portsToDisableSetter.accept(this.portsToDisable);
        return this;
    }

    /**
     * **参数解释：** 自动创建安全组时可选择不开放node节点相关端口，支持单端口和端口段两种形式。示例如下： ``` \"portsToDisable\": [\"22\", \"4090-4099\"] ``` **约束限制：** 若指定了节点安全组SecurityGroup，该配置项将被忽略。 只针对CCE Standard和Turbo集群的node安全组生效，不支持master安全组，不支持eni安全组。 **取值范围：** 端口号仅支持整数，范围[1-65535] **默认取值：** 不涉及 
     * @return portsToDisable
     */
    public List<String> getPortsToDisable() {
        return portsToDisable;
    }

    public void setPortsToDisable(List<String> portsToDisable) {
        this.portsToDisable = portsToDisable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoGenerateSecurityGroupHardeningConfigSpec that = (AutoGenerateSecurityGroupHardeningConfigSpec) obj;
        return Objects.equals(this.portsToDisable, that.portsToDisable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portsToDisable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoGenerateSecurityGroupHardeningConfigSpec {\n");
        sb.append("    portsToDisable: ").append(toIndentedString(portsToDisable)).append("\n");
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
