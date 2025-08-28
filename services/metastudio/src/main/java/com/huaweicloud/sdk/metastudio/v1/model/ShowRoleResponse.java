package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowRoleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_business_list")

    private List<RoleBusinessInfo> roleBusinessList = null;

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
    @JsonProperty(value = "mcp_server_info_list")

    private List<McpServerBaseInfo> mcpServerInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instruction_library_id")

    private String instructionLibraryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowRoleResponse withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色ID。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public ShowRoleResponse withName(String name) {
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

    public ShowRoleResponse withDescription(String description) {
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

    public ShowRoleResponse withRoleBusinessList(List<RoleBusinessInfo> roleBusinessList) {
        this.roleBusinessList = roleBusinessList;
        return this;
    }

    public ShowRoleResponse addRoleBusinessListItem(RoleBusinessInfo roleBusinessListItem) {
        if (this.roleBusinessList == null) {
            this.roleBusinessList = new ArrayList<>();
        }
        this.roleBusinessList.add(roleBusinessListItem);
        return this;
    }

    public ShowRoleResponse withRoleBusinessList(Consumer<List<RoleBusinessInfo>> roleBusinessListSetter) {
        if (this.roleBusinessList == null) {
            this.roleBusinessList = new ArrayList<>();
        }
        roleBusinessListSetter.accept(this.roleBusinessList);
        return this;
    }

    /**
     * 角色业务配置列表。
     * @return roleBusinessList
     */
    public List<RoleBusinessInfo> getRoleBusinessList() {
        return roleBusinessList;
    }

    public void setRoleBusinessList(List<RoleBusinessInfo> roleBusinessList) {
        this.roleBusinessList = roleBusinessList;
    }

    public ShowRoleResponse withLlmSource(LlmSourceEnum llmSource) {
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

    public ShowRoleResponse withLlmConfigId(String llmConfigId) {
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

    public ShowRoleResponse withPluginConfigList(List<RolePluginConfigInfo> pluginConfigList) {
        this.pluginConfigList = pluginConfigList;
        return this;
    }

    public ShowRoleResponse addPluginConfigListItem(RolePluginConfigInfo pluginConfigListItem) {
        if (this.pluginConfigList == null) {
            this.pluginConfigList = new ArrayList<>();
        }
        this.pluginConfigList.add(pluginConfigListItem);
        return this;
    }

    public ShowRoleResponse withPluginConfigList(Consumer<List<RolePluginConfigInfo>> pluginConfigListSetter) {
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

    public ShowRoleResponse withMcpServerInfoList(List<McpServerBaseInfo> mcpServerInfoList) {
        this.mcpServerInfoList = mcpServerInfoList;
        return this;
    }

    public ShowRoleResponse addMcpServerInfoListItem(McpServerBaseInfo mcpServerInfoListItem) {
        if (this.mcpServerInfoList == null) {
            this.mcpServerInfoList = new ArrayList<>();
        }
        this.mcpServerInfoList.add(mcpServerInfoListItem);
        return this;
    }

    public ShowRoleResponse withMcpServerInfoList(Consumer<List<McpServerBaseInfo>> mcpServerInfoListSetter) {
        if (this.mcpServerInfoList == null) {
            this.mcpServerInfoList = new ArrayList<>();
        }
        mcpServerInfoListSetter.accept(this.mcpServerInfoList);
        return this;
    }

    /**
     * MCP服务端对接配置信息列表
     * @return mcpServerInfoList
     */
    public List<McpServerBaseInfo> getMcpServerInfoList() {
        return mcpServerInfoList;
    }

    public void setMcpServerInfoList(List<McpServerBaseInfo> mcpServerInfoList) {
        this.mcpServerInfoList = mcpServerInfoList;
    }

    public ShowRoleResponse withInstructionLibraryId(String instructionLibraryId) {
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

    public ShowRoleResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowRoleResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowRoleResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRoleResponse that = (ShowRoleResponse) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.roleBusinessList, that.roleBusinessList)
            && Objects.equals(this.llmSource, that.llmSource) && Objects.equals(this.llmConfigId, that.llmConfigId)
            && Objects.equals(this.pluginConfigList, that.pluginConfigList)
            && Objects.equals(this.mcpServerInfoList, that.mcpServerInfoList)
            && Objects.equals(this.instructionLibraryId, that.instructionLibraryId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId,
            name,
            description,
            roleBusinessList,
            llmSource,
            llmConfigId,
            pluginConfigList,
            mcpServerInfoList,
            instructionLibraryId,
            createTime,
            updateTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRoleResponse {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    roleBusinessList: ").append(toIndentedString(roleBusinessList)).append("\n");
        sb.append("    llmSource: ").append(toIndentedString(llmSource)).append("\n");
        sb.append("    llmConfigId: ").append(toIndentedString(llmConfigId)).append("\n");
        sb.append("    pluginConfigList: ").append(toIndentedString(pluginConfigList)).append("\n");
        sb.append("    mcpServerInfoList: ").append(toIndentedString(mcpServerInfoList)).append("\n");
        sb.append("    instructionLibraryId: ").append(toIndentedString(instructionLibraryId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
