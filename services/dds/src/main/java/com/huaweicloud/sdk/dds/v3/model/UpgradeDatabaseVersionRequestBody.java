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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delayed")

    private Boolean isDelayed;

    public UpgradeDatabaseVersionRequestBody withUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * **参数解释：** 升级模式。 **约束限制：** 不涉及。 **取值范围：** - minimized_interrupt_time：表示中断时间最短优先模式：升级过程对业务影响相对较小的升级方式。 - minimized_upgrade_time：表示升级时长最短优先模式：升级过程时长相对较快的升级方式。 **默认取值：** minimized_interrupt_time。
     * @return upgradeMode
     */
    public String getUpgradeMode() {
        return upgradeMode;
    }

    public void setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
    }

    public UpgradeDatabaseVersionRequestBody withIsDelayed(Boolean isDelayed) {
        this.isDelayed = isDelayed;
        return this;
    }

    /**
     * **参数解释：** 实例是否在可维护时间窗内自动升级。 **约束限制：** 不涉及。 **取值范围：** - true：表示延迟升级，实例将在可维护时间窗内自动升级。 - false：表示立即升级。 **默认取值：** false。
     * @return isDelayed
     */
    public Boolean getIsDelayed() {
        return isDelayed;
    }

    public void setIsDelayed(Boolean isDelayed) {
        this.isDelayed = isDelayed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeDatabaseVersionRequestBody that = (UpgradeDatabaseVersionRequestBody) obj;
        return Objects.equals(this.upgradeMode, that.upgradeMode) && Objects.equals(this.isDelayed, that.isDelayed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeMode, isDelayed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeDatabaseVersionRequestBody {\n");
        sb.append("    upgradeMode: ").append(toIndentedString(upgradeMode)).append("\n");
        sb.append("    isDelayed: ").append(toIndentedString(isDelayed)).append("\n");
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
