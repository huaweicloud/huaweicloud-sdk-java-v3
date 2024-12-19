package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUpgradeCandidateVersionsDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_type_list")

    private List<UpgradeTypeInfo> upgradeTypeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_enabled")

    private Boolean rollbackEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_version")

    private String sourceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roll_upgrade_progress")

    private RollUpgradeProgress rollUpgradeProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_candidate_versions")

    private List<String> upgradeCandidateVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_upgrade_candidate_versions")

    private List<String> hotfixUpgradeCandidateVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_rollback_candidate_versions")

    private List<String> hotfixRollbackCandidateVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_upgrade_infos")

    private List<CanBeUpgradedHotfixDetail> hotfixUpgradeInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_rollback_infos")

    private List<CanBeRollbackedHotfixDetail> hotfixRollbackInfos = null;

    public ShowUpgradeCandidateVersionsDetailsResponse withUpgradeTypeList(List<UpgradeTypeInfo> upgradeTypeList) {
        this.upgradeTypeList = upgradeTypeList;
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse addUpgradeTypeListItem(UpgradeTypeInfo upgradeTypeListItem) {
        if (this.upgradeTypeList == null) {
            this.upgradeTypeList = new ArrayList<>();
        }
        this.upgradeTypeList.add(upgradeTypeListItem);
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withUpgradeTypeList(
        Consumer<List<UpgradeTypeInfo>> upgradeTypeListSetter) {
        if (this.upgradeTypeList == null) {
            this.upgradeTypeList = new ArrayList<>();
        }
        upgradeTypeListSetter.accept(this.upgradeTypeList);
        return this;
    }

    /**
     * 升级类型信息列表
     * @return upgradeTypeList
     */
    public List<UpgradeTypeInfo> getUpgradeTypeList() {
        return upgradeTypeList;
    }

    public void setUpgradeTypeList(List<UpgradeTypeInfo> upgradeTypeList) {
        this.upgradeTypeList = upgradeTypeList;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withRollbackEnabled(Boolean rollbackEnabled) {
        this.rollbackEnabled = rollbackEnabled;
        return this;
    }

    /**
     * 是否可以回滚，true可以回滚，false不可以回滚。
     * @return rollbackEnabled
     */
    public Boolean getRollbackEnabled() {
        return rollbackEnabled;
    }

    public void setRollbackEnabled(Boolean rollbackEnabled) {
        this.rollbackEnabled = rollbackEnabled;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }

    /**
     * 原版本
     * @return sourceVersion
     */
    public String getSourceVersion() {
        return sourceVersion;
    }

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 升级目标版本，没有在滚动升级中返回null。
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withRollUpgradeProgress(
        RollUpgradeProgress rollUpgradeProgress) {
        this.rollUpgradeProgress = rollUpgradeProgress;
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withRollUpgradeProgress(
        Consumer<RollUpgradeProgress> rollUpgradeProgressSetter) {
        if (this.rollUpgradeProgress == null) {
            this.rollUpgradeProgress = new RollUpgradeProgress();
            rollUpgradeProgressSetter.accept(this.rollUpgradeProgress);
        }

        return this;
    }

    /**
     * Get rollUpgradeProgress
     * @return rollUpgradeProgress
     */
    public RollUpgradeProgress getRollUpgradeProgress() {
        return rollUpgradeProgress;
    }

    public void setRollUpgradeProgress(RollUpgradeProgress rollUpgradeProgress) {
        this.rollUpgradeProgress = rollUpgradeProgress;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withUpgradeCandidateVersions(
        List<String> upgradeCandidateVersions) {
        this.upgradeCandidateVersions = upgradeCandidateVersions;
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse addUpgradeCandidateVersionsItem(
        String upgradeCandidateVersionsItem) {
        if (this.upgradeCandidateVersions == null) {
            this.upgradeCandidateVersions = new ArrayList<>();
        }
        this.upgradeCandidateVersions.add(upgradeCandidateVersionsItem);
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withUpgradeCandidateVersions(
        Consumer<List<String>> upgradeCandidateVersionsSetter) {
        if (this.upgradeCandidateVersions == null) {
            this.upgradeCandidateVersions = new ArrayList<>();
        }
        upgradeCandidateVersionsSetter.accept(this.upgradeCandidateVersions);
        return this;
    }

    /**
     * 可以升级的版本，包括大小版本，滚动升级中返回空数组。
     * @return upgradeCandidateVersions
     */
    public List<String> getUpgradeCandidateVersions() {
        return upgradeCandidateVersions;
    }

    public void setUpgradeCandidateVersions(List<String> upgradeCandidateVersions) {
        this.upgradeCandidateVersions = upgradeCandidateVersions;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withHotfixUpgradeCandidateVersions(
        List<String> hotfixUpgradeCandidateVersions) {
        this.hotfixUpgradeCandidateVersions = hotfixUpgradeCandidateVersions;
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse addHotfixUpgradeCandidateVersionsItem(
        String hotfixUpgradeCandidateVersionsItem) {
        if (this.hotfixUpgradeCandidateVersions == null) {
            this.hotfixUpgradeCandidateVersions = new ArrayList<>();
        }
        this.hotfixUpgradeCandidateVersions.add(hotfixUpgradeCandidateVersionsItem);
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withHotfixUpgradeCandidateVersions(
        Consumer<List<String>> hotfixUpgradeCandidateVersionsSetter) {
        if (this.hotfixUpgradeCandidateVersions == null) {
            this.hotfixUpgradeCandidateVersions = new ArrayList<>();
        }
        hotfixUpgradeCandidateVersionsSetter.accept(this.hotfixUpgradeCandidateVersions);
        return this;
    }

    /**
     * 可以升级的热补丁版本，滚动升级中返回空数组。
     * @return hotfixUpgradeCandidateVersions
     */
    public List<String> getHotfixUpgradeCandidateVersions() {
        return hotfixUpgradeCandidateVersions;
    }

    public void setHotfixUpgradeCandidateVersions(List<String> hotfixUpgradeCandidateVersions) {
        this.hotfixUpgradeCandidateVersions = hotfixUpgradeCandidateVersions;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withHotfixRollbackCandidateVersions(
        List<String> hotfixRollbackCandidateVersions) {
        this.hotfixRollbackCandidateVersions = hotfixRollbackCandidateVersions;
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse addHotfixRollbackCandidateVersionsItem(
        String hotfixRollbackCandidateVersionsItem) {
        if (this.hotfixRollbackCandidateVersions == null) {
            this.hotfixRollbackCandidateVersions = new ArrayList<>();
        }
        this.hotfixRollbackCandidateVersions.add(hotfixRollbackCandidateVersionsItem);
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withHotfixRollbackCandidateVersions(
        Consumer<List<String>> hotfixRollbackCandidateVersionsSetter) {
        if (this.hotfixRollbackCandidateVersions == null) {
            this.hotfixRollbackCandidateVersions = new ArrayList<>();
        }
        hotfixRollbackCandidateVersionsSetter.accept(this.hotfixRollbackCandidateVersions);
        return this;
    }

    /**
     * 可以回滚的热补丁版本，滚动升级中返回空数组。
     * @return hotfixRollbackCandidateVersions
     */
    public List<String> getHotfixRollbackCandidateVersions() {
        return hotfixRollbackCandidateVersions;
    }

    public void setHotfixRollbackCandidateVersions(List<String> hotfixRollbackCandidateVersions) {
        this.hotfixRollbackCandidateVersions = hotfixRollbackCandidateVersions;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withHotfixUpgradeInfos(
        List<CanBeUpgradedHotfixDetail> hotfixUpgradeInfos) {
        this.hotfixUpgradeInfos = hotfixUpgradeInfos;
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse addHotfixUpgradeInfosItem(
        CanBeUpgradedHotfixDetail hotfixUpgradeInfosItem) {
        if (this.hotfixUpgradeInfos == null) {
            this.hotfixUpgradeInfos = new ArrayList<>();
        }
        this.hotfixUpgradeInfos.add(hotfixUpgradeInfosItem);
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withHotfixUpgradeInfos(
        Consumer<List<CanBeUpgradedHotfixDetail>> hotfixUpgradeInfosSetter) {
        if (this.hotfixUpgradeInfos == null) {
            this.hotfixUpgradeInfos = new ArrayList<>();
        }
        hotfixUpgradeInfosSetter.accept(this.hotfixUpgradeInfos);
        return this;
    }

    /**
     * 可以升级的热补丁信息。
     * @return hotfixUpgradeInfos
     */
    public List<CanBeUpgradedHotfixDetail> getHotfixUpgradeInfos() {
        return hotfixUpgradeInfos;
    }

    public void setHotfixUpgradeInfos(List<CanBeUpgradedHotfixDetail> hotfixUpgradeInfos) {
        this.hotfixUpgradeInfos = hotfixUpgradeInfos;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withHotfixRollbackInfos(
        List<CanBeRollbackedHotfixDetail> hotfixRollbackInfos) {
        this.hotfixRollbackInfos = hotfixRollbackInfos;
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse addHotfixRollbackInfosItem(
        CanBeRollbackedHotfixDetail hotfixRollbackInfosItem) {
        if (this.hotfixRollbackInfos == null) {
            this.hotfixRollbackInfos = new ArrayList<>();
        }
        this.hotfixRollbackInfos.add(hotfixRollbackInfosItem);
        return this;
    }

    public ShowUpgradeCandidateVersionsDetailsResponse withHotfixRollbackInfos(
        Consumer<List<CanBeRollbackedHotfixDetail>> hotfixRollbackInfosSetter) {
        if (this.hotfixRollbackInfos == null) {
            this.hotfixRollbackInfos = new ArrayList<>();
        }
        hotfixRollbackInfosSetter.accept(this.hotfixRollbackInfos);
        return this;
    }

    /**
     * 可以回滚的热补丁信息。
     * @return hotfixRollbackInfos
     */
    public List<CanBeRollbackedHotfixDetail> getHotfixRollbackInfos() {
        return hotfixRollbackInfos;
    }

    public void setHotfixRollbackInfos(List<CanBeRollbackedHotfixDetail> hotfixRollbackInfos) {
        this.hotfixRollbackInfos = hotfixRollbackInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUpgradeCandidateVersionsDetailsResponse that = (ShowUpgradeCandidateVersionsDetailsResponse) obj;
        return Objects.equals(this.upgradeTypeList, that.upgradeTypeList)
            && Objects.equals(this.rollbackEnabled, that.rollbackEnabled)
            && Objects.equals(this.sourceVersion, that.sourceVersion)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.rollUpgradeProgress, that.rollUpgradeProgress)
            && Objects.equals(this.upgradeCandidateVersions, that.upgradeCandidateVersions)
            && Objects.equals(this.hotfixUpgradeCandidateVersions, that.hotfixUpgradeCandidateVersions)
            && Objects.equals(this.hotfixRollbackCandidateVersions, that.hotfixRollbackCandidateVersions)
            && Objects.equals(this.hotfixUpgradeInfos, that.hotfixUpgradeInfos)
            && Objects.equals(this.hotfixRollbackInfos, that.hotfixRollbackInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeTypeList,
            rollbackEnabled,
            sourceVersion,
            targetVersion,
            rollUpgradeProgress,
            upgradeCandidateVersions,
            hotfixUpgradeCandidateVersions,
            hotfixRollbackCandidateVersions,
            hotfixUpgradeInfos,
            hotfixRollbackInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUpgradeCandidateVersionsDetailsResponse {\n");
        sb.append("    upgradeTypeList: ").append(toIndentedString(upgradeTypeList)).append("\n");
        sb.append("    rollbackEnabled: ").append(toIndentedString(rollbackEnabled)).append("\n");
        sb.append("    sourceVersion: ").append(toIndentedString(sourceVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    rollUpgradeProgress: ").append(toIndentedString(rollUpgradeProgress)).append("\n");
        sb.append("    upgradeCandidateVersions: ").append(toIndentedString(upgradeCandidateVersions)).append("\n");
        sb.append("    hotfixUpgradeCandidateVersions: ")
            .append(toIndentedString(hotfixUpgradeCandidateVersions))
            .append("\n");
        sb.append("    hotfixRollbackCandidateVersions: ")
            .append(toIndentedString(hotfixRollbackCandidateVersions))
            .append("\n");
        sb.append("    hotfixUpgradeInfos: ").append(toIndentedString(hotfixUpgradeInfos)).append("\n");
        sb.append("    hotfixRollbackInfos: ").append(toIndentedString(hotfixRollbackInfos)).append("\n");
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
