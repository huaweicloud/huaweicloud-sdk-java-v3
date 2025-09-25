package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SwitchDecoyPortAutoBindRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_policy_id")

    private String linuxPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_policy_id")

    private String windowsPolicyId;

    public SwitchDecoyPortAutoBindRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SwitchDecoyPortAutoBindRequest withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**: 是否启用 **约束限制**: 不涉及 **取值范围**: -true：是。 -false：否。 **默认取值**: false 
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public SwitchDecoyPortAutoBindRequest withLinuxPolicyId(String linuxPolicyId) {
        this.linuxPolicyId = linuxPolicyId;
        return this;
    }

    /**
     * **参数解释**: linux策略id **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return linuxPolicyId
     */
    public String getLinuxPolicyId() {
        return linuxPolicyId;
    }

    public void setLinuxPolicyId(String linuxPolicyId) {
        this.linuxPolicyId = linuxPolicyId;
    }

    public SwitchDecoyPortAutoBindRequest withWindowsPolicyId(String windowsPolicyId) {
        this.windowsPolicyId = windowsPolicyId;
        return this;
    }

    /**
     * **参数解释**: windows策略id **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return windowsPolicyId
     */
    public String getWindowsPolicyId() {
        return windowsPolicyId;
    }

    public void setWindowsPolicyId(String windowsPolicyId) {
        this.windowsPolicyId = windowsPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchDecoyPortAutoBindRequest that = (SwitchDecoyPortAutoBindRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.linuxPolicyId, that.linuxPolicyId)
            && Objects.equals(this.windowsPolicyId, that.windowsPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, enable, linuxPolicyId, windowsPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchDecoyPortAutoBindRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    linuxPolicyId: ").append(toIndentedString(linuxPolicyId)).append("\n");
        sb.append("    windowsPolicyId: ").append(toIndentedString(windowsPolicyId)).append("\n");
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
