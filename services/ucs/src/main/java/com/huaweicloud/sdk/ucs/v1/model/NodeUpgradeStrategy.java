package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点更新策略
 */
public class NodeUpgradeStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollingUpdate")

    private RollingUpdateNodeUpgradeStrategy rollingUpdate;

    public NodeUpgradeStrategy withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 策略类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NodeUpgradeStrategy withRollingUpdate(RollingUpdateNodeUpgradeStrategy rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public NodeUpgradeStrategy withRollingUpdate(Consumer<RollingUpdateNodeUpgradeStrategy> rollingUpdateSetter) {
        if (this.rollingUpdate == null) {
            this.rollingUpdate = new RollingUpdateNodeUpgradeStrategy();
            rollingUpdateSetter.accept(this.rollingUpdate);
        }

        return this;
    }

    /**
     * Get rollingUpdate
     * @return rollingUpdate
     */
    public RollingUpdateNodeUpgradeStrategy getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(RollingUpdateNodeUpgradeStrategy rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeUpgradeStrategy that = (NodeUpgradeStrategy) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.rollingUpdate, that.rollingUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, rollingUpdate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeUpgradeStrategy {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
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
