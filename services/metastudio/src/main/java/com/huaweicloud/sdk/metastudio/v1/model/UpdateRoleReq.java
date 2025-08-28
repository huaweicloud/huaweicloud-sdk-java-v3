package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改角色请求。
 */
public class UpdateRoleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_business_list")

    private List<RoleBusinessReq> roleBusinessList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_source")

    private LlmSourceEnum llmSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_config_id")

    private String llmConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_config_list")

    private List<RolePluginConfigInfo> pluginConfigList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mcp_server_id_list")

    private List<String> mcpServerIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instruction_library_id")

    private String instructionLibraryId;

    public UpdateRoleReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 角色名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRoleReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 角色描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRoleReq withRoleBusinessList(List<RoleBusinessReq> roleBusinessList) {
        this.roleBusinessList = roleBusinessList;
        return this;
    }

    public UpdateRoleReq addRoleBusinessListItem(RoleBusinessReq roleBusinessListItem) {
        if (this.roleBusinessList == null) {
            this.roleBusinessList = new ArrayList<>();
        }
        this.roleBusinessList.add(roleBusinessListItem);
        return this;
    }

    public UpdateRoleReq withRoleBusinessList(Consumer<List<RoleBusinessReq>> roleBusinessListSetter) {
        if (this.roleBusinessList == null) {
            this.roleBusinessList = new ArrayList<>();
        }
        roleBusinessListSetter.accept(this.roleBusinessList);
        return this;
    }

    /**
     * 角色业务配置列表
     * @return roleBusinessList
     */
    public List<RoleBusinessReq> getRoleBusinessList() {
        return roleBusinessList;
    }

    public void setRoleBusinessList(List<RoleBusinessReq> roleBusinessList) {
        this.roleBusinessList = roleBusinessList;
    }

    public UpdateRoleReq withLlmSource(LlmSourceEnum llmSource) {
        this.llmSource = llmSource;
        return this;
    }

    /**
     * Get llmSource
     * @return llmSource
     */
    public LlmSourceEnum getLlmSource() {
        return llmSource;
    }

    public void setLlmSource(LlmSourceEnum llmSource) {
        this.llmSource = llmSource;
    }

    public UpdateRoleReq withLlmConfigId(String llmConfigId) {
        this.llmConfigId = llmConfigId;
        return this;
    }

    /**
     * 大语言模型配置ID。
     * @return llmConfigId
     */
    public String getLlmConfigId() {
        return llmConfigId;
    }

    public void setLlmConfigId(String llmConfigId) {
        this.llmConfigId = llmConfigId;
    }

    public UpdateRoleReq withPluginConfigList(List<RolePluginConfigInfo> pluginConfigList) {
        this.pluginConfigList = pluginConfigList;
        return this;
    }

    public UpdateRoleReq addPluginConfigListItem(RolePluginConfigInfo pluginConfigListItem) {
        if (this.pluginConfigList == null) {
            this.pluginConfigList = new ArrayList<>();
        }
        this.pluginConfigList.add(pluginConfigListItem);
        return this;
    }

    public UpdateRoleReq withPluginConfigList(Consumer<List<RolePluginConfigInfo>> pluginConfigListSetter) {
        if (this.pluginConfigList == null) {
            this.pluginConfigList = new ArrayList<>();
        }
        pluginConfigListSetter.accept(this.pluginConfigList);
        return this;
    }

    /**
     * 插件配置列表
     * @return pluginConfigList
     */
    public List<RolePluginConfigInfo> getPluginConfigList() {
        return pluginConfigList;
    }

    public void setPluginConfigList(List<RolePluginConfigInfo> pluginConfigList) {
        this.pluginConfigList = pluginConfigList;
    }

    public UpdateRoleReq withMcpServerIdList(List<String> mcpServerIdList) {
        this.mcpServerIdList = mcpServerIdList;
        return this;
    }

    public UpdateRoleReq addMcpServerIdListItem(String mcpServerIdListItem) {
        if (this.mcpServerIdList == null) {
            this.mcpServerIdList = new ArrayList<>();
        }
        this.mcpServerIdList.add(mcpServerIdListItem);
        return this;
    }

    public UpdateRoleReq withMcpServerIdList(Consumer<List<String>> mcpServerIdListSetter) {
        if (this.mcpServerIdList == null) {
            this.mcpServerIdList = new ArrayList<>();
        }
        mcpServerIdListSetter.accept(this.mcpServerIdList);
        return this;
    }

    /**
     * MCP服务端对接配置ID列表
     * @return mcpServerIdList
     */
    public List<String> getMcpServerIdList() {
        return mcpServerIdList;
    }

    public void setMcpServerIdList(List<String> mcpServerIdList) {
        this.mcpServerIdList = mcpServerIdList;
    }

    public UpdateRoleReq withInstructionLibraryId(String instructionLibraryId) {
        this.instructionLibraryId = instructionLibraryId;
        return this;
    }

    /**
     * 指令集ID。
     * @return instructionLibraryId
     */
    public String getInstructionLibraryId() {
        return instructionLibraryId;
    }

    public void setInstructionLibraryId(String instructionLibraryId) {
        this.instructionLibraryId = instructionLibraryId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRoleReq that = (UpdateRoleReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.roleBusinessList, that.roleBusinessList)
            && Objects.equals(this.llmSource, that.llmSource) && Objects.equals(this.llmConfigId, that.llmConfigId)
            && Objects.equals(this.pluginConfigList, that.pluginConfigList)
            && Objects.equals(this.mcpServerIdList, that.mcpServerIdList)
            && Objects.equals(this.instructionLibraryId, that.instructionLibraryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            roleBusinessList,
            llmSource,
            llmConfigId,
            pluginConfigList,
            mcpServerIdList,
            instructionLibraryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoleReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    roleBusinessList: ").append(toIndentedString(roleBusinessList)).append("\n");
        sb.append("    llmSource: ").append(toIndentedString(llmSource)).append("\n");
        sb.append("    llmConfigId: ").append(toIndentedString(llmConfigId)).append("\n");
        sb.append("    pluginConfigList: ").append(toIndentedString(pluginConfigList)).append("\n");
        sb.append("    mcpServerIdList: ").append(toIndentedString(mcpServerIdList)).append("\n");
        sb.append("    instructionLibraryId: ").append(toIndentedString(instructionLibraryId)).append("\n");
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
