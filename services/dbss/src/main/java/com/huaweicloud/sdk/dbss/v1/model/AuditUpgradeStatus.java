package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AuditUpgradeStatus
 */
public class AuditUpgradeStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<AuditUpgradeStep> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_version")

    private String upgradeVersion;

    public AuditUpgradeStatus withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 当前版本
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public AuditUpgradeStatus withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AuditUpgradeStatus withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态  - 0：正在升级  - 1：满足条件未升级  - 2：不满足升级条件
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AuditUpgradeStatus withSteps(List<AuditUpgradeStep> steps) {
        this.steps = steps;
        return this;
    }

    public AuditUpgradeStatus addStepsItem(AuditUpgradeStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public AuditUpgradeStatus withSteps(Consumer<List<AuditUpgradeStep>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 升级步骤
     * @return steps
     */
    public List<AuditUpgradeStep> getSteps() {
        return steps;
    }

    public void setSteps(List<AuditUpgradeStep> steps) {
        this.steps = steps;
    }

    public AuditUpgradeStatus withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public AuditUpgradeStatus withUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
        return this;
    }

    /**
     * 升级版本
     * @return upgradeVersion
     */
    public String getUpgradeVersion() {
        return upgradeVersion;
    }

    public void setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditUpgradeStatus that = (AuditUpgradeStatus) obj;
        return Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.total, that.total)
            && Objects.equals(this.upgradeVersion, that.upgradeVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentVersion, instanceId, status, steps, total, upgradeVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditUpgradeStatus {\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    upgradeVersion: ").append(toIndentedString(upgradeVersion)).append("\n");
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
