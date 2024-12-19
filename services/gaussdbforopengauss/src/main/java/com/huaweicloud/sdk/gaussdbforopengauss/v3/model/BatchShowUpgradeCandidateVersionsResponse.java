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
public class BatchShowUpgradeCandidateVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_type_list")

    private List<UpgradeTypeInfo> upgradeTypeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_candidate_versions")

    private List<String> upgradeCandidateVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_upgrade_infos")

    private List<HotfixInfoResult> hotfixUpgradeInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_rollback_infos")

    private List<HotfixInfoResult> hotfixRollbackInfos = null;

    public BatchShowUpgradeCandidateVersionsResponse withUpgradeTypeList(List<UpgradeTypeInfo> upgradeTypeList) {
        this.upgradeTypeList = upgradeTypeList;
        return this;
    }

    public BatchShowUpgradeCandidateVersionsResponse addUpgradeTypeListItem(UpgradeTypeInfo upgradeTypeListItem) {
        if (this.upgradeTypeList == null) {
            this.upgradeTypeList = new ArrayList<>();
        }
        this.upgradeTypeList.add(upgradeTypeListItem);
        return this;
    }

    public BatchShowUpgradeCandidateVersionsResponse withUpgradeTypeList(
        Consumer<List<UpgradeTypeInfo>> upgradeTypeListSetter) {
        if (this.upgradeTypeList == null) {
            this.upgradeTypeList = new ArrayList<>();
        }
        upgradeTypeListSetter.accept(this.upgradeTypeList);
        return this;
    }

    /**
     * 升级类型信息列表。
     * @return upgradeTypeList
     */
    public List<UpgradeTypeInfo> getUpgradeTypeList() {
        return upgradeTypeList;
    }

    public void setUpgradeTypeList(List<UpgradeTypeInfo> upgradeTypeList) {
        this.upgradeTypeList = upgradeTypeList;
    }

    public BatchShowUpgradeCandidateVersionsResponse withTargetVersion(String targetVersion) {
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

    public BatchShowUpgradeCandidateVersionsResponse withUpgradeCandidateVersions(
        List<String> upgradeCandidateVersions) {
        this.upgradeCandidateVersions = upgradeCandidateVersions;
        return this;
    }

    public BatchShowUpgradeCandidateVersionsResponse addUpgradeCandidateVersionsItem(
        String upgradeCandidateVersionsItem) {
        if (this.upgradeCandidateVersions == null) {
            this.upgradeCandidateVersions = new ArrayList<>();
        }
        this.upgradeCandidateVersions.add(upgradeCandidateVersionsItem);
        return this;
    }

    public BatchShowUpgradeCandidateVersionsResponse withUpgradeCandidateVersions(
        Consumer<List<String>> upgradeCandidateVersionsSetter) {
        if (this.upgradeCandidateVersions == null) {
            this.upgradeCandidateVersions = new ArrayList<>();
        }
        upgradeCandidateVersionsSetter.accept(this.upgradeCandidateVersions);
        return this;
    }

    /**
     * 可以升级的版本，包括大小版本。
     * @return upgradeCandidateVersions
     */
    public List<String> getUpgradeCandidateVersions() {
        return upgradeCandidateVersions;
    }

    public void setUpgradeCandidateVersions(List<String> upgradeCandidateVersions) {
        this.upgradeCandidateVersions = upgradeCandidateVersions;
    }

    public BatchShowUpgradeCandidateVersionsResponse withHotfixUpgradeInfos(List<HotfixInfoResult> hotfixUpgradeInfos) {
        this.hotfixUpgradeInfos = hotfixUpgradeInfos;
        return this;
    }

    public BatchShowUpgradeCandidateVersionsResponse addHotfixUpgradeInfosItem(
        HotfixInfoResult hotfixUpgradeInfosItem) {
        if (this.hotfixUpgradeInfos == null) {
            this.hotfixUpgradeInfos = new ArrayList<>();
        }
        this.hotfixUpgradeInfos.add(hotfixUpgradeInfosItem);
        return this;
    }

    public BatchShowUpgradeCandidateVersionsResponse withHotfixUpgradeInfos(
        Consumer<List<HotfixInfoResult>> hotfixUpgradeInfosSetter) {
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
    public List<HotfixInfoResult> getHotfixUpgradeInfos() {
        return hotfixUpgradeInfos;
    }

    public void setHotfixUpgradeInfos(List<HotfixInfoResult> hotfixUpgradeInfos) {
        this.hotfixUpgradeInfos = hotfixUpgradeInfos;
    }

    public BatchShowUpgradeCandidateVersionsResponse withHotfixRollbackInfos(
        List<HotfixInfoResult> hotfixRollbackInfos) {
        this.hotfixRollbackInfos = hotfixRollbackInfos;
        return this;
    }

    public BatchShowUpgradeCandidateVersionsResponse addHotfixRollbackInfosItem(
        HotfixInfoResult hotfixRollbackInfosItem) {
        if (this.hotfixRollbackInfos == null) {
            this.hotfixRollbackInfos = new ArrayList<>();
        }
        this.hotfixRollbackInfos.add(hotfixRollbackInfosItem);
        return this;
    }

    public BatchShowUpgradeCandidateVersionsResponse withHotfixRollbackInfos(
        Consumer<List<HotfixInfoResult>> hotfixRollbackInfosSetter) {
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
    public List<HotfixInfoResult> getHotfixRollbackInfos() {
        return hotfixRollbackInfos;
    }

    public void setHotfixRollbackInfos(List<HotfixInfoResult> hotfixRollbackInfos) {
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
        BatchShowUpgradeCandidateVersionsResponse that = (BatchShowUpgradeCandidateVersionsResponse) obj;
        return Objects.equals(this.upgradeTypeList, that.upgradeTypeList)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.upgradeCandidateVersions, that.upgradeCandidateVersions)
            && Objects.equals(this.hotfixUpgradeInfos, that.hotfixUpgradeInfos)
            && Objects.equals(this.hotfixRollbackInfos, that.hotfixRollbackInfos);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(upgradeTypeList, targetVersion, upgradeCandidateVersions, hotfixUpgradeInfos, hotfixRollbackInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowUpgradeCandidateVersionsResponse {\n");
        sb.append("    upgradeTypeList: ").append(toIndentedString(upgradeTypeList)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    upgradeCandidateVersions: ").append(toIndentedString(upgradeCandidateVersions)).append("\n");
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
