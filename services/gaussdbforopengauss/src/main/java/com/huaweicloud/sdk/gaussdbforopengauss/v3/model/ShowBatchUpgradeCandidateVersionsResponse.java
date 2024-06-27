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
public class ShowBatchUpgradeCandidateVersionsResponse extends SdkResponse {

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

    private List<HotfixInfo> hotfixUpgradeInfos = null;

    public ShowBatchUpgradeCandidateVersionsResponse withUpgradeTypeList(List<UpgradeTypeInfo> upgradeTypeList) {
        this.upgradeTypeList = upgradeTypeList;
        return this;
    }

    public ShowBatchUpgradeCandidateVersionsResponse addUpgradeTypeListItem(UpgradeTypeInfo upgradeTypeListItem) {
        if (this.upgradeTypeList == null) {
            this.upgradeTypeList = new ArrayList<>();
        }
        this.upgradeTypeList.add(upgradeTypeListItem);
        return this;
    }

    public ShowBatchUpgradeCandidateVersionsResponse withUpgradeTypeList(
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

    public ShowBatchUpgradeCandidateVersionsResponse withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 升级目标版本，没有在滚动升级中返回null
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public ShowBatchUpgradeCandidateVersionsResponse withUpgradeCandidateVersions(
        List<String> upgradeCandidateVersions) {
        this.upgradeCandidateVersions = upgradeCandidateVersions;
        return this;
    }

    public ShowBatchUpgradeCandidateVersionsResponse addUpgradeCandidateVersionsItem(
        String upgradeCandidateVersionsItem) {
        if (this.upgradeCandidateVersions == null) {
            this.upgradeCandidateVersions = new ArrayList<>();
        }
        this.upgradeCandidateVersions.add(upgradeCandidateVersionsItem);
        return this;
    }

    public ShowBatchUpgradeCandidateVersionsResponse withUpgradeCandidateVersions(
        Consumer<List<String>> upgradeCandidateVersionsSetter) {
        if (this.upgradeCandidateVersions == null) {
            this.upgradeCandidateVersions = new ArrayList<>();
        }
        upgradeCandidateVersionsSetter.accept(this.upgradeCandidateVersions);
        return this;
    }

    /**
     * 可以升级的版本，包括大小版本
     * @return upgradeCandidateVersions
     */
    public List<String> getUpgradeCandidateVersions() {
        return upgradeCandidateVersions;
    }

    public void setUpgradeCandidateVersions(List<String> upgradeCandidateVersions) {
        this.upgradeCandidateVersions = upgradeCandidateVersions;
    }

    public ShowBatchUpgradeCandidateVersionsResponse withHotfixUpgradeInfos(List<HotfixInfo> hotfixUpgradeInfos) {
        this.hotfixUpgradeInfos = hotfixUpgradeInfos;
        return this;
    }

    public ShowBatchUpgradeCandidateVersionsResponse addHotfixUpgradeInfosItem(HotfixInfo hotfixUpgradeInfosItem) {
        if (this.hotfixUpgradeInfos == null) {
            this.hotfixUpgradeInfos = new ArrayList<>();
        }
        this.hotfixUpgradeInfos.add(hotfixUpgradeInfosItem);
        return this;
    }

    public ShowBatchUpgradeCandidateVersionsResponse withHotfixUpgradeInfos(
        Consumer<List<HotfixInfo>> hotfixUpgradeInfosSetter) {
        if (this.hotfixUpgradeInfos == null) {
            this.hotfixUpgradeInfos = new ArrayList<>();
        }
        hotfixUpgradeInfosSetter.accept(this.hotfixUpgradeInfos);
        return this;
    }

    /**
     * 可以升级的热补丁信息
     * @return hotfixUpgradeInfos
     */
    public List<HotfixInfo> getHotfixUpgradeInfos() {
        return hotfixUpgradeInfos;
    }

    public void setHotfixUpgradeInfos(List<HotfixInfo> hotfixUpgradeInfos) {
        this.hotfixUpgradeInfos = hotfixUpgradeInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBatchUpgradeCandidateVersionsResponse that = (ShowBatchUpgradeCandidateVersionsResponse) obj;
        return Objects.equals(this.upgradeTypeList, that.upgradeTypeList)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.upgradeCandidateVersions, that.upgradeCandidateVersions)
            && Objects.equals(this.hotfixUpgradeInfos, that.hotfixUpgradeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeTypeList, targetVersion, upgradeCandidateVersions, hotfixUpgradeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchUpgradeCandidateVersionsResponse {\n");
        sb.append("    upgradeTypeList: ").append(toIndentedString(upgradeTypeList)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    upgradeCandidateVersions: ").append(toIndentedString(upgradeCandidateVersions)).append("\n");
        sb.append("    hotfixUpgradeInfos: ").append(toIndentedString(hotfixUpgradeInfos)).append("\n");
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
