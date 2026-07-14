package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 在线服务升级配置。 **约束限制：** 不涉及。
 */
public class UpgradeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolling_update")

    private RollingUpdate rollingUpdate;

    public UpgradeConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 升级类型。 **约束限制：** 不涉及。 **取值范围：** - ROLLING：滚动升级，默认值。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpgradeConfig withRollingUpdate(RollingUpdate rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public UpgradeConfig withRollingUpdate(Consumer<RollingUpdate> rollingUpdateSetter) {
        if (this.rollingUpdate == null) {
            this.rollingUpdate = new RollingUpdate();
            rollingUpdateSetter.accept(this.rollingUpdate);
        }

        return this;
    }

    /**
     * Get rollingUpdate
     * @return rollingUpdate
     */
    public RollingUpdate getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(RollingUpdate rollingUpdate) {
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
        UpgradeConfig that = (UpgradeConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.rollingUpdate, that.rollingUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, rollingUpdate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeConfig {\n");
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
