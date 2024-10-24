package com.huaweicloud.sdk.aom.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AgentBatchImportParamNew
 */
public class AgentBatchImportParamNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_import_param_list")

    private List<AgentImportParamNew> agentImportParamList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_region_id")

    private Integer proxyRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installer_agent_id")

    private String installerAgentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icagent_install_flag")

    private Boolean icagentInstallFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_install_base_param")

    private PluginInstallBasicParam pluginInstallBaseParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_net_flag")

    private Boolean publicNetFlag;

    public AgentBatchImportParamNew withAgentImportParamList(List<AgentImportParamNew> agentImportParamList) {
        this.agentImportParamList = agentImportParamList;
        return this;
    }

    public AgentBatchImportParamNew addAgentImportParamListItem(AgentImportParamNew agentImportParamListItem) {
        if (this.agentImportParamList == null) {
            this.agentImportParamList = new ArrayList<>();
        }
        this.agentImportParamList.add(agentImportParamListItem);
        return this;
    }

    public AgentBatchImportParamNew withAgentImportParamList(
        Consumer<List<AgentImportParamNew>> agentImportParamListSetter) {
        if (this.agentImportParamList == null) {
            this.agentImportParamList = new ArrayList<>();
        }
        agentImportParamListSetter.accept(this.agentImportParamList);
        return this;
    }

    /**
     * 导入待安装UniAgent的机器参数列表。
     * @return agentImportParamList
     */
    public List<AgentImportParamNew> getAgentImportParamList() {
        return agentImportParamList;
    }

    public void setAgentImportParamList(List<AgentImportParamNew> agentImportParamList) {
        this.agentImportParamList = agentImportParamList;
    }

    public AgentBatchImportParamNew withProxyRegionId(Integer proxyRegionId) {
        this.proxyRegionId = proxyRegionId;
        return this;
    }

    /**
     * 代理区域ID： - 直连接入填0。 - 代理接入填实际代理区域ID。
     * @return proxyRegionId
     */
    public Integer getProxyRegionId() {
        return proxyRegionId;
    }

    public void setProxyRegionId(Integer proxyRegionId) {
        this.proxyRegionId = proxyRegionId;
    }

    public AgentBatchImportParamNew withInstallerAgentId(String installerAgentId) {
        this.installerAgentId = installerAgentId;
        return this;
    }

    /**
     * 安装机（代理机）的agent ID。
     * @return installerAgentId
     */
    public String getInstallerAgentId() {
        return installerAgentId;
    }

    public void setInstallerAgentId(String installerAgentId) {
        this.installerAgentId = installerAgentId;
    }

    public AgentBatchImportParamNew withIcagentInstallFlag(Boolean icagentInstallFlag) {
        this.icagentInstallFlag = icagentInstallFlag;
        return this;
    }

    /**
     * 是否需要安装ICAgent插件： - true：安装ICAgent插件。默认安装最新版本的ICAgent插件。 - false：不安装ICAgent插件。
     * @return icagentInstallFlag
     */
    public Boolean getIcagentInstallFlag() {
        return icagentInstallFlag;
    }

    public void setIcagentInstallFlag(Boolean icagentInstallFlag) {
        this.icagentInstallFlag = icagentInstallFlag;
    }

    public AgentBatchImportParamNew withPluginInstallBaseParam(PluginInstallBasicParam pluginInstallBaseParam) {
        this.pluginInstallBaseParam = pluginInstallBaseParam;
        return this;
    }

    public AgentBatchImportParamNew withPluginInstallBaseParam(
        Consumer<PluginInstallBasicParam> pluginInstallBaseParamSetter) {
        if (this.pluginInstallBaseParam == null) {
            this.pluginInstallBaseParam = new PluginInstallBasicParam();
            pluginInstallBaseParamSetter.accept(this.pluginInstallBaseParam);
        }

        return this;
    }

    /**
     * Get pluginInstallBaseParam
     * @return pluginInstallBaseParam
     */
    public PluginInstallBasicParam getPluginInstallBaseParam() {
        return pluginInstallBaseParam;
    }

    public void setPluginInstallBaseParam(PluginInstallBasicParam pluginInstallBaseParam) {
        this.pluginInstallBaseParam = pluginInstallBaseParam;
    }

    public AgentBatchImportParamNew withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 待安装的UniAgent版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AgentBatchImportParamNew withPublicNetFlag(Boolean publicNetFlag) {
        this.publicNetFlag = publicNetFlag;
        return this;
    }

    /**
     * 是否公网接入： - true：公网接入设置。 - false：代理接入设置。
     * @return publicNetFlag
     */
    public Boolean getPublicNetFlag() {
        return publicNetFlag;
    }

    public void setPublicNetFlag(Boolean publicNetFlag) {
        this.publicNetFlag = publicNetFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentBatchImportParamNew that = (AgentBatchImportParamNew) obj;
        return Objects.equals(this.agentImportParamList, that.agentImportParamList)
            && Objects.equals(this.proxyRegionId, that.proxyRegionId)
            && Objects.equals(this.installerAgentId, that.installerAgentId)
            && Objects.equals(this.icagentInstallFlag, that.icagentInstallFlag)
            && Objects.equals(this.pluginInstallBaseParam, that.pluginInstallBaseParam)
            && Objects.equals(this.version, that.version) && Objects.equals(this.publicNetFlag, that.publicNetFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentImportParamList,
            proxyRegionId,
            installerAgentId,
            icagentInstallFlag,
            pluginInstallBaseParam,
            version,
            publicNetFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentBatchImportParamNew {\n");
        sb.append("    agentImportParamList: ").append(toIndentedString(agentImportParamList)).append("\n");
        sb.append("    proxyRegionId: ").append(toIndentedString(proxyRegionId)).append("\n");
        sb.append("    installerAgentId: ").append(toIndentedString(installerAgentId)).append("\n");
        sb.append("    icagentInstallFlag: ").append(toIndentedString(icagentInstallFlag)).append("\n");
        sb.append("    pluginInstallBaseParam: ").append(toIndentedString(pluginInstallBaseParam)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    publicNetFlag: ").append(toIndentedString(publicNetFlag)).append("\n");
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
