package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckFeatureRuleInfo
 */
public class CheckFeatureRuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_feature_id")

    private Integer chkFeatureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_feature_name")

    private String chkFeatureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_feature_desc")

    private String chkFeatureDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_configure")

    private String featureConfigure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protective_action")

    private Integer protectiveAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_protective_action")

    private Integer optionalProtectiveAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Integer enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editable")

    private Integer editable;

    public CheckFeatureRuleInfo withChkFeatureId(Integer chkFeatureId) {
        this.chkFeatureId = chkFeatureId;
        return this;
    }

    /**
     * 检测规则ID
     * minimum: 0
     * maximum: 2097152
     * @return chkFeatureId
     */
    public Integer getChkFeatureId() {
        return chkFeatureId;
    }

    public void setChkFeatureId(Integer chkFeatureId) {
        this.chkFeatureId = chkFeatureId;
    }

    public CheckFeatureRuleInfo withChkFeatureName(String chkFeatureName) {
        this.chkFeatureName = chkFeatureName;
        return this;
    }

    /**
     * 检测规则标识
     * @return chkFeatureName
     */
    public String getChkFeatureName() {
        return chkFeatureName;
    }

    public void setChkFeatureName(String chkFeatureName) {
        this.chkFeatureName = chkFeatureName;
    }

    public CheckFeatureRuleInfo withChkFeatureDesc(String chkFeatureDesc) {
        this.chkFeatureDesc = chkFeatureDesc;
        return this;
    }

    /**
     * 检测规则描述
     * @return chkFeatureDesc
     */
    public String getChkFeatureDesc() {
        return chkFeatureDesc;
    }

    public void setChkFeatureDesc(String chkFeatureDesc) {
        this.chkFeatureDesc = chkFeatureDesc;
    }

    public CheckFeatureRuleInfo withFeatureConfigure(String featureConfigure) {
        this.featureConfigure = featureConfigure;
        return this;
    }

    /**
     * 检测特性规则配置信息
     * @return featureConfigure
     */
    public String getFeatureConfigure() {
        return featureConfigure;
    }

    public void setFeatureConfigure(String featureConfigure) {
        this.featureConfigure = featureConfigure;
    }

    public CheckFeatureRuleInfo withProtectiveAction(Integer protectiveAction) {
        this.protectiveAction = protectiveAction;
        return this;
    }

    /**
     * 防护动作，包含如下 -1 检测   -2 检测并阻断/拦截
     * minimum: 0
     * maximum: 2097152
     * @return protectiveAction
     */
    public Integer getProtectiveAction() {
        return protectiveAction;
    }

    public void setProtectiveAction(Integer protectiveAction) {
        this.protectiveAction = protectiveAction;
    }

    public CheckFeatureRuleInfo withOptionalProtectiveAction(Integer optionalProtectiveAction) {
        this.optionalProtectiveAction = optionalProtectiveAction;
        return this;
    }

    /**
     * 可选防护动作，包含如下 -1 检测   -2 检测并阻断/拦截   -3 都可以
     * minimum: 0
     * maximum: 2097152
     * @return optionalProtectiveAction
     */
    public Integer getOptionalProtectiveAction() {
        return optionalProtectiveAction;
    }

    public void setOptionalProtectiveAction(Integer optionalProtectiveAction) {
        this.optionalProtectiveAction = optionalProtectiveAction;
    }

    public CheckFeatureRuleInfo withEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 开启状态，包含如下 -0 开启 -1 关闭
     * minimum: 0
     * maximum: 2097152
     * @return enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public CheckFeatureRuleInfo withEditable(Integer editable) {
        this.editable = editable;
        return this;
    }

    /**
     * 是否可编辑配置信息，包含如下 -0 否   -1 是
     * minimum: 0
     * maximum: 2097152
     * @return editable
     */
    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckFeatureRuleInfo that = (CheckFeatureRuleInfo) obj;
        return Objects.equals(this.chkFeatureId, that.chkFeatureId)
            && Objects.equals(this.chkFeatureName, that.chkFeatureName)
            && Objects.equals(this.chkFeatureDesc, that.chkFeatureDesc)
            && Objects.equals(this.featureConfigure, that.featureConfigure)
            && Objects.equals(this.protectiveAction, that.protectiveAction)
            && Objects.equals(this.optionalProtectiveAction, that.optionalProtectiveAction)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.editable, that.editable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chkFeatureId,
            chkFeatureName,
            chkFeatureDesc,
            featureConfigure,
            protectiveAction,
            optionalProtectiveAction,
            enabled,
            editable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckFeatureRuleInfo {\n");
        sb.append("    chkFeatureId: ").append(toIndentedString(chkFeatureId)).append("\n");
        sb.append("    chkFeatureName: ").append(toIndentedString(chkFeatureName)).append("\n");
        sb.append("    chkFeatureDesc: ").append(toIndentedString(chkFeatureDesc)).append("\n");
        sb.append("    featureConfigure: ").append(toIndentedString(featureConfigure)).append("\n");
        sb.append("    protectiveAction: ").append(toIndentedString(protectiveAction)).append("\n");
        sb.append("    optionalProtectiveAction: ").append(toIndentedString(optionalProtectiveAction)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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
