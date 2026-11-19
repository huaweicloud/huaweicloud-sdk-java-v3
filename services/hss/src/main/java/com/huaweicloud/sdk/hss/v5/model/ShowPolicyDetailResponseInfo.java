package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略详情
 */
public class ShowPolicyDetailResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private String supportOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_name")

    private String featureName;

    public ShowPolicyDetailResponseInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 功能类别 **取值范围**： 字符长度1-128位 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowPolicyDetailResponseInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 策略内容 **取值范围**： 字符长度0-4096位 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowPolicyDetailResponseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 策略描述 **取值范围**： 字符长度0-1024位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowPolicyDetailResponseInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**： 策略是否开启 **取值范围**： - true：开启 - false：关闭 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowPolicyDetailResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 策略名 **取值范围**： 字符长度1-256位 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowPolicyDetailResponseInfo withSupportOs(String supportOs) {
        this.supportOs = supportOs;
        return this;
    }

    /**
     * **参数解释**： 策略支持的主机种类 **取值范围**: - Linux：Linux操作系统 - Windows：Windows操作系统 
     * @return supportOs
     */
    public String getSupportOs() {
        return supportOs;
    }

    public void setSupportOs(String supportOs) {
        this.supportOs = supportOs;
    }

    public ShowPolicyDetailResponseInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**： 策略Id **取值范围**： 字符长度1-128位 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ShowPolicyDetailResponseInfo withFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * **参数解释**： 特性名 **取值范围**： 字符长度1-128位 
     * @return featureName
     */
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPolicyDetailResponseInfo that = (ShowPolicyDetailResponseInfo) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.content, that.content)
            && Objects.equals(this.description, that.description) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.name, that.name) && Objects.equals(this.supportOs, that.supportOs)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.featureName, that.featureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, content, description, enabled, name, supportOs, policyId, featureName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPolicyDetailResponseInfo {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
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
