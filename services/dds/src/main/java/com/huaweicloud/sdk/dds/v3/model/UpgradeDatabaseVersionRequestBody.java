package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradeDatabaseVersionRequestBody
 */
public class UpgradeDatabaseVersionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_mode")

    private String upgradeMode;

    public UpgradeDatabaseVersionRequestBody withUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * 升级模式。  取值为“minimized_interrupt_time”为中断时间最短优先模式：升级过程对业务影响相对较小的升级方式  取值为“minimized_upgrade_time”为升级时长最短优先模式：升级过程时长相对较快的升级方式。  默认取值为“minimized_interrupt_time”。
     * @return upgradeMode
     */
    public String getUpgradeMode() {
        return upgradeMode;
    }

    public void setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpgradeDatabaseVersionRequestBody upgradeDatabaseVersionRequestBody = (UpgradeDatabaseVersionRequestBody) o;
        return Objects.equals(this.upgradeMode, upgradeDatabaseVersionRequestBody.upgradeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeDatabaseVersionRequestBody {\n");
        sb.append("    upgradeMode: ").append(toIndentedString(upgradeMode)).append("\n");
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
