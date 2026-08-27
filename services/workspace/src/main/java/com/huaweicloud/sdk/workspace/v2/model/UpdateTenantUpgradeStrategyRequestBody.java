package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新升级策略请求
 */
public class UpdateTenantUpgradeStrategyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_name")

    private String strategyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force_upgrade")

    private Integer isForceUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_version")

    private String minVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_desc")

    private String strategyDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_priority")

    private Integer strategyPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_objects")

    private List<ApplyObjectInfo> applyObjects = null;

    public UpdateTenantUpgradeStrategyRequestBody withStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }

    /**
     * 策略名称
     * @return strategyName
     */
    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public UpdateTenantUpgradeStrategyRequestBody withIsForceUpgrade(Integer isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
        return this;
    }

    /**
     * 是否强制升级：0-否 1-是
     * minimum: 0
     * maximum: 1
     * @return isForceUpgrade
     */
    public Integer getIsForceUpgrade() {
        return isForceUpgrade;
    }

    public void setIsForceUpgrade(Integer isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
    }

    public UpdateTenantUpgradeStrategyRequestBody withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * 低于此版本升级
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public UpdateTenantUpgradeStrategyRequestBody withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 升级目标版本
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public UpdateTenantUpgradeStrategyRequestBody withStrategyDesc(String strategyDesc) {
        this.strategyDesc = strategyDesc;
        return this;
    }

    /**
     * 策略描述
     * @return strategyDesc
     */
    public String getStrategyDesc() {
        return strategyDesc;
    }

    public void setStrategyDesc(String strategyDesc) {
        this.strategyDesc = strategyDesc;
    }

    public UpdateTenantUpgradeStrategyRequestBody withStrategyPriority(Integer strategyPriority) {
        this.strategyPriority = strategyPriority;
        return this;
    }

    /**
     * 优先级（数值越小优先级越高）
     * minimum: 0
     * maximum: 2147483647
     * @return strategyPriority
     */
    public Integer getStrategyPriority() {
        return strategyPriority;
    }

    public void setStrategyPriority(Integer strategyPriority) {
        this.strategyPriority = strategyPriority;
    }

    public UpdateTenantUpgradeStrategyRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态：0-禁用 1-启用
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateTenantUpgradeStrategyRequestBody withApplyObjects(List<ApplyObjectInfo> applyObjects) {
        this.applyObjects = applyObjects;
        return this;
    }

    public UpdateTenantUpgradeStrategyRequestBody addApplyObjectsItem(ApplyObjectInfo applyObjectsItem) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        this.applyObjects.add(applyObjectsItem);
        return this;
    }

    public UpdateTenantUpgradeStrategyRequestBody withApplyObjects(Consumer<List<ApplyObjectInfo>> applyObjectsSetter) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        applyObjectsSetter.accept(this.applyObjects);
        return this;
    }

    /**
     * 应用对象列表
     * @return applyObjects
     */
    public List<ApplyObjectInfo> getApplyObjects() {
        return applyObjects;
    }

    public void setApplyObjects(List<ApplyObjectInfo> applyObjects) {
        this.applyObjects = applyObjects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTenantUpgradeStrategyRequestBody that = (UpdateTenantUpgradeStrategyRequestBody) obj;
        return Objects.equals(this.strategyName, that.strategyName)
            && Objects.equals(this.isForceUpgrade, that.isForceUpgrade)
            && Objects.equals(this.minVersion, that.minVersion)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.strategyDesc, that.strategyDesc)
            && Objects.equals(this.strategyPriority, that.strategyPriority) && Objects.equals(this.status, that.status)
            && Objects.equals(this.applyObjects, that.applyObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategyName,
            isForceUpgrade,
            minVersion,
            targetVersion,
            strategyDesc,
            strategyPriority,
            status,
            applyObjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantUpgradeStrategyRequestBody {\n");
        sb.append("    strategyName: ").append(toIndentedString(strategyName)).append("\n");
        sb.append("    isForceUpgrade: ").append(toIndentedString(isForceUpgrade)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    strategyDesc: ").append(toIndentedString(strategyDesc)).append("\n");
        sb.append("    strategyPriority: ").append(toIndentedString(strategyPriority)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    applyObjects: ").append(toIndentedString(applyObjects)).append("\n");
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
