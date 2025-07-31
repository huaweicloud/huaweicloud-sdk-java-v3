package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检测特性规则
 */
public class ChkFeatureInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_feature_id")

    private Integer chkFeatureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protective_action")

    private Integer protectiveAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Integer enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_configure")

    private String featureConfigure;

    public ChkFeatureInfo withChkFeatureId(Integer chkFeatureId) {
        this.chkFeatureId = chkFeatureId;
        return this;
    }

    /**
     * 检测特性规则ID
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

    public ChkFeatureInfo withProtectiveAction(Integer protectiveAction) {
        this.protectiveAction = protectiveAction;
        return this;
    }

    /**
     * 防护动作 1 检测  2 检测并阻断/拦截
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

    public ChkFeatureInfo withEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 开启状态 0 关闭 1 开启
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

    public ChkFeatureInfo withFeatureConfigure(String featureConfigure) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChkFeatureInfo that = (ChkFeatureInfo) obj;
        return Objects.equals(this.chkFeatureId, that.chkFeatureId)
            && Objects.equals(this.protectiveAction, that.protectiveAction)
            && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.featureConfigure, that.featureConfigure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chkFeatureId, protectiveAction, enabled, featureConfigure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChkFeatureInfo {\n");
        sb.append("    chkFeatureId: ").append(toIndentedString(chkFeatureId)).append("\n");
        sb.append("    protectiveAction: ").append(toIndentedString(protectiveAction)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    featureConfigure: ").append(toIndentedString(featureConfigure)).append("\n");
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
