package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPluginInstallScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_host")

    private Boolean outsideHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_install")

    private Boolean batchInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin")

    private String plugin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    public ListPluginInstallScriptRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListPluginInstallScriptRequest withOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
        return this;
    }

    /**
     * **参数解释**： 是否非华为云 **约束限制**： 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**： false 
     * @return outsideHost
     */
    public Boolean getOutsideHost() {
        return outsideHost;
    }

    public void setOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
    }

    public ListPluginInstallScriptRequest withBatchInstall(Boolean batchInstall) {
        this.batchInstall = batchInstall;
        return this;
    }

    /**
     * **参数解释**： 是否批量安装 **约束限制**： 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**： true 
     * @return batchInstall
     */
    public Boolean getBatchInstall() {
        return batchInstall;
    }

    public void setBatchInstall(Boolean batchInstall) {
        this.batchInstall = batchInstall;
    }

    public ListPluginInstallScriptRequest withPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }

    /**
     * **参数解释**： 插件类型 **约束限制**： 不涉及 **取值范围**： - opa-docker-authz：docker插件。  **默认取值**： opa-docker-authz 
     * @return plugin
     */
    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public ListPluginInstallScriptRequest withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * **参数解释**： 操作类型 **约束限制**： 不涉及 **取值范围**： - install：安装。 - upgrade：升级。 - uninstall：卸载。  **默认取值**： install 
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPluginInstallScriptRequest that = (ListPluginInstallScriptRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.outsideHost, that.outsideHost)
            && Objects.equals(this.batchInstall, that.batchInstall) && Objects.equals(this.plugin, that.plugin)
            && Objects.equals(this.operateType, that.operateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, outsideHost, batchInstall, plugin, operateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginInstallScriptRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    outsideHost: ").append(toIndentedString(outsideHost)).append("\n");
        sb.append("    batchInstall: ").append(toIndentedString(batchInstall)).append("\n");
        sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
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
