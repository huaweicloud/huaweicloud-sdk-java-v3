package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPluginInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_arch")

    private String pluginArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_os_type")

    private String pluginOsType;

    public ListPluginInfoRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListPluginInfoRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPluginInfoRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPluginInfoRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 插件编码 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListPluginInfoRequest withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * **参数解释**： 插件版本 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public ListPluginInfoRequest withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * **参数解释**： agent版本 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public ListPluginInfoRequest withPluginArch(String pluginArch) {
        this.pluginArch = pluginArch;
        return this;
    }

    /**
     * **参数解释**： 插件架构 **约束限制**: 不涉及 **取值范围**: - x86_64：X86架构 - arm：ARM架构  **默认取值**: 不涉及 
     * @return pluginArch
     */
    public String getPluginArch() {
        return pluginArch;
    }

    public void setPluginArch(String pluginArch) {
        this.pluginArch = pluginArch;
    }

    public ListPluginInfoRequest withPluginOsType(String pluginOsType) {
        this.pluginOsType = pluginOsType;
        return this;
    }

    /**
     * **参数解释**： 插件支持的操作系统类型 **约束限制**: 不涉及 **取值范围**: - Linux：Linux操作系统 - Windows：Windows操作系统  **默认取值**: 不涉及  | 
     * @return pluginOsType
     */
    public String getPluginOsType() {
        return pluginOsType;
    }

    public void setPluginOsType(String pluginOsType) {
        this.pluginOsType = pluginOsType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPluginInfoRequest that = (ListPluginInfoRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.code, that.code) && Objects.equals(this.pluginVersion, that.pluginVersion)
            && Objects.equals(this.agentVersion, that.agentVersion) && Objects.equals(this.pluginArch, that.pluginArch)
            && Objects.equals(this.pluginOsType, that.pluginOsType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enterpriseProjectId, offset, limit, code, pluginVersion, agentVersion, pluginArch, pluginOsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginInfoRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    pluginArch: ").append(toIndentedString(pluginArch)).append("\n");
        sb.append("    pluginOsType: ").append(toIndentedString(pluginOsType)).append("\n");
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
