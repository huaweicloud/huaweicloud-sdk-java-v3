package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 虚拟补丁信息
 */
public class RaspPatchInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_feature_id")

    private Long chkFeatureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_name")

    private String patchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_list")

    private List<RaspCveInfo> cveList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact")

    private String artifact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_version")

    private String vulnVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_protective_action")

    private Integer optionalProtectiveAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protective_action")

    private Integer protectiveAction;

    public RaspPatchInfo withChkFeatureId(Long chkFeatureId) {
        this.chkFeatureId = chkFeatureId;
        return this;
    }

    /**
     * **参数解释**: 特征检查项ID **取值范围**: 最小值0，最大值2097152 
     * minimum: 0
     * maximum: 2097152
     * @return chkFeatureId
     */
    public Long getChkFeatureId() {
        return chkFeatureId;
    }

    public void setChkFeatureId(Long chkFeatureId) {
        this.chkFeatureId = chkFeatureId;
    }

    public RaspPatchInfo withPatchName(String patchName) {
        this.patchName = patchName;
        return this;
    }

    /**
     * **参数解释**: 补丁名称 **取值范围**: 字符长度0-128位 
     * @return patchName
     */
    public String getPatchName() {
        return patchName;
    }

    public void setPatchName(String patchName) {
        this.patchName = patchName;
    }

    public RaspPatchInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**: 漏洞ID **取值范围**: 字符长度0-64位 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public RaspPatchInfo withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**: 漏洞名称 **取值范围**: 字符长度0-512位 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public RaspPatchInfo withCveList(List<RaspCveInfo> cveList) {
        this.cveList = cveList;
        return this;
    }

    public RaspPatchInfo addCveListItem(RaspCveInfo cveListItem) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        this.cveList.add(cveListItem);
        return this;
    }

    public RaspPatchInfo withCveList(Consumer<List<RaspCveInfo>> cveListSetter) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        cveListSetter.accept(this.cveList);
        return this;
    }

    /**
     * **参数解释**: CVE列表 **取值范围**: 0-128个RaspCveInfo对象 
     * @return cveList
     */
    public List<RaspCveInfo> getCveList() {
        return cveList;
    }

    public void setCveList(List<RaspCveInfo> cveList) {
        this.cveList = cveList;
    }

    public RaspPatchInfo withArtifact(String artifact) {
        this.artifact = artifact;
        return this;
    }

    /**
     * **参数解释**: 目标组件 **取值范围**: 字符长度0-128位 
     * @return artifact
     */
    public String getArtifact() {
        return artifact;
    }

    public void setArtifact(String artifact) {
        this.artifact = artifact;
    }

    public RaspPatchInfo withVulnVersion(String vulnVersion) {
        this.vulnVersion = vulnVersion;
        return this;
    }

    /**
     * **参数解释**: 影响版本 **取值范围**: 字符长度0-128位 
     * @return vulnVersion
     */
    public String getVulnVersion() {
        return vulnVersion;
    }

    public void setVulnVersion(String vulnVersion) {
        this.vulnVersion = vulnVersion;
    }

    public RaspPatchInfo withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * **参数解释**: 补丁版本 **取值范围**: 字符长度0-64位 
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public RaspPatchInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 漏洞说明 **取值范围**: 字符长度0-512位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RaspPatchInfo withOptionalProtectiveAction(Integer optionalProtectiveAction) {
        this.optionalProtectiveAction = optionalProtectiveAction;
        return this;
    }

    /**
     * **参数解释**: 可选防护动作 **取值范围**: 最小值1，最大值3 
     * minimum: 1
     * maximum: 3
     * @return optionalProtectiveAction
     */
    public Integer getOptionalProtectiveAction() {
        return optionalProtectiveAction;
    }

    public void setOptionalProtectiveAction(Integer optionalProtectiveAction) {
        this.optionalProtectiveAction = optionalProtectiveAction;
    }

    public RaspPatchInfo withProtectiveAction(Integer protectiveAction) {
        this.protectiveAction = protectiveAction;
        return this;
    }

    /**
     * **参数解释**: 防护动作 **取值范围**: 最小值1，最大值2 
     * minimum: 1
     * maximum: 2
     * @return protectiveAction
     */
    public Integer getProtectiveAction() {
        return protectiveAction;
    }

    public void setProtectiveAction(Integer protectiveAction) {
        this.protectiveAction = protectiveAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RaspPatchInfo that = (RaspPatchInfo) obj;
        return Objects.equals(this.chkFeatureId, that.chkFeatureId) && Objects.equals(this.patchName, that.patchName)
            && Objects.equals(this.vulId, that.vulId) && Objects.equals(this.vulName, that.vulName)
            && Objects.equals(this.cveList, that.cveList) && Objects.equals(this.artifact, that.artifact)
            && Objects.equals(this.vulnVersion, that.vulnVersion)
            && Objects.equals(this.pluginVersion, that.pluginVersion)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.optionalProtectiveAction, that.optionalProtectiveAction)
            && Objects.equals(this.protectiveAction, that.protectiveAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chkFeatureId,
            patchName,
            vulId,
            vulName,
            cveList,
            artifact,
            vulnVersion,
            pluginVersion,
            description,
            optionalProtectiveAction,
            protectiveAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RaspPatchInfo {\n");
        sb.append("    chkFeatureId: ").append(toIndentedString(chkFeatureId)).append("\n");
        sb.append("    patchName: ").append(toIndentedString(patchName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    cveList: ").append(toIndentedString(cveList)).append("\n");
        sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
        sb.append("    vulnVersion: ").append(toIndentedString(vulnVersion)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    optionalProtectiveAction: ").append(toIndentedString(optionalProtectiveAction)).append("\n");
        sb.append("    protectiveAction: ").append(toIndentedString(protectiveAction)).append("\n");
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
