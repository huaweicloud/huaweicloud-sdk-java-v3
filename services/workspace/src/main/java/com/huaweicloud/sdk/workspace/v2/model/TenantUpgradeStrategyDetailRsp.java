package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 升级策略详情响应
 */
public class TenantUpgradeStrategyDetailRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_type")

    private Integer strategyType;

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

    public TenantUpgradeStrategyDetailRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TenantUpgradeStrategyDetailRsp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TenantUpgradeStrategyDetailRsp withStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * 策略类型：0-服务端 1-客户端
     * minimum: 0
     * maximum: 1
     * @return strategyType
     */
    public Integer getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
    }

    public TenantUpgradeStrategyDetailRsp withStrategyName(String strategyName) {
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

    public TenantUpgradeStrategyDetailRsp withIsForceUpgrade(Integer isForceUpgrade) {
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

    public TenantUpgradeStrategyDetailRsp withMinVersion(String minVersion) {
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

    public TenantUpgradeStrategyDetailRsp withTargetVersion(String targetVersion) {
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

    public TenantUpgradeStrategyDetailRsp withStrategyDesc(String strategyDesc) {
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

    public TenantUpgradeStrategyDetailRsp withStrategyPriority(Integer strategyPriority) {
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

    public TenantUpgradeStrategyDetailRsp withStatus(Integer status) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantUpgradeStrategyDetailRsp that = (TenantUpgradeStrategyDetailRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.strategyType, that.strategyType)
            && Objects.equals(this.strategyName, that.strategyName)
            && Objects.equals(this.isForceUpgrade, that.isForceUpgrade)
            && Objects.equals(this.minVersion, that.minVersion)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.strategyDesc, that.strategyDesc)
            && Objects.equals(this.strategyPriority, that.strategyPriority) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            strategyType,
            strategyName,
            isForceUpgrade,
            minVersion,
            targetVersion,
            strategyDesc,
            strategyPriority,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantUpgradeStrategyDetailRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
        sb.append("    strategyName: ").append(toIndentedString(strategyName)).append("\n");
        sb.append("    isForceUpgrade: ").append(toIndentedString(isForceUpgrade)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    strategyDesc: ").append(toIndentedString(strategyDesc)).append("\n");
        sb.append("    strategyPriority: ").append(toIndentedString(strategyPriority)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
