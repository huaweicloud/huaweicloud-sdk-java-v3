package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量执行脚本请求体。
 */
public class ExecuteScriptOrCommandReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_count")

    private Integer grayCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_resource_ids")

    private List<String> grayResourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_fail_threshold")

    private Integer grayFailThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_ids")

    private List<String> scriptIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_type")

    private String commandType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_timeout")

    private Integer executionTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_start")

    private String preStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_finish")

    private String postFinish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_group_type")

    private String resourceGroupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_group_id")

    private String resourceGroupId;

    public ExecuteScriptOrCommandReq withGrayCount(Integer grayCount) {
        this.grayCount = grayCount;
        return this;
    }

    /**
     * 灰度资源数量。
     * @return grayCount
     */
    public Integer getGrayCount() {
        return grayCount;
    }

    public void setGrayCount(Integer grayCount) {
        this.grayCount = grayCount;
    }

    public ExecuteScriptOrCommandReq withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，如桌面(DESKTOP)。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ExecuteScriptOrCommandReq withGrayResourceIds(List<String> grayResourceIds) {
        this.grayResourceIds = grayResourceIds;
        return this;
    }

    public ExecuteScriptOrCommandReq addGrayResourceIdsItem(String grayResourceIdsItem) {
        if (this.grayResourceIds == null) {
            this.grayResourceIds = new ArrayList<>();
        }
        this.grayResourceIds.add(grayResourceIdsItem);
        return this;
    }

    public ExecuteScriptOrCommandReq withGrayResourceIds(Consumer<List<String>> grayResourceIdsSetter) {
        if (this.grayResourceIds == null) {
            this.grayResourceIds = new ArrayList<>();
        }
        grayResourceIdsSetter.accept(this.grayResourceIds);
        return this;
    }

    /**
     * 灰度执行脚本的资源列表。
     * @return grayResourceIds
     */
    public List<String> getGrayResourceIds() {
        return grayResourceIds;
    }

    public void setGrayResourceIds(List<String> grayResourceIds) {
        this.grayResourceIds = grayResourceIds;
    }

    public ExecuteScriptOrCommandReq withGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
        return this;
    }

    /**
     * 灰度失败阈值，达到阈值后停止进行下一批资源执行脚本，小于gray_count。
     * @return grayFailThreshold
     */
    public Integer getGrayFailThreshold() {
        return grayFailThreshold;
    }

    public void setGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
    }

    public ExecuteScriptOrCommandReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public ExecuteScriptOrCommandReq addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public ExecuteScriptOrCommandReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 执行脚本的资源列表。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public ExecuteScriptOrCommandReq withScriptIds(List<String> scriptIds) {
        this.scriptIds = scriptIds;
        return this;
    }

    public ExecuteScriptOrCommandReq addScriptIdsItem(String scriptIdsItem) {
        if (this.scriptIds == null) {
            this.scriptIds = new ArrayList<>();
        }
        this.scriptIds.add(scriptIdsItem);
        return this;
    }

    public ExecuteScriptOrCommandReq withScriptIds(Consumer<List<String>> scriptIdsSetter) {
        if (this.scriptIds == null) {
            this.scriptIds = new ArrayList<>();
        }
        scriptIdsSetter.accept(this.scriptIds);
        return this;
    }

    /**
     * 执行的脚本列表。
     * @return scriptIds
     */
    public List<String> getScriptIds() {
        return scriptIds;
    }

    public void setScriptIds(List<String> scriptIds) {
        this.scriptIds = scriptIds;
    }

    public ExecuteScriptOrCommandReq withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 执行的命令行，与scripts二选一。
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ExecuteScriptOrCommandReq withCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }

    /**
     * 命令行的类型（POWERSHELL，BAT，SHELL）。
     * @return commandType
     */
    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    public ExecuteScriptOrCommandReq withExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
        return this;
    }

    /**
     * 执行脚本的超时时间，单位分钟。
     * minimum: 0
     * maximum: 600
     * @return executionTimeout
     */
    public Integer getExecutionTimeout() {
        return executionTimeout;
    }

    public void setExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
    }

    public ExecuteScriptOrCommandReq withPreStart(String preStart) {
        this.preStart = preStart;
        return this;
    }

    /**
     * 执行脚本前置步骤。
     * @return preStart
     */
    public String getPreStart() {
        return preStart;
    }

    public void setPreStart(String preStart) {
        this.preStart = preStart;
    }

    public ExecuteScriptOrCommandReq withPostFinish(String postFinish) {
        this.postFinish = postFinish;
        return this;
    }

    /**
     * 执行脚本后置步骤(STOP,REBOOT)。
     * @return postFinish
     */
    public String getPostFinish() {
        return postFinish;
    }

    public void setPostFinish(String postFinish) {
        this.postFinish = postFinish;
    }

    public ExecuteScriptOrCommandReq withResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
        return this;
    }

    /**
     * 资源组类型，如桌面池(DESKTOP_POOL)。
     * @return resourceGroupType
     */
    public String getResourceGroupType() {
        return resourceGroupType;
    }

    public void setResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
    }

    public ExecuteScriptOrCommandReq withResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    /**
     * 资源组ID。
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteScriptOrCommandReq that = (ExecuteScriptOrCommandReq) obj;
        return Objects.equals(this.grayCount, that.grayCount) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.grayResourceIds, that.grayResourceIds)
            && Objects.equals(this.grayFailThreshold, that.grayFailThreshold)
            && Objects.equals(this.resourceIds, that.resourceIds) && Objects.equals(this.scriptIds, that.scriptIds)
            && Objects.equals(this.command, that.command) && Objects.equals(this.commandType, that.commandType)
            && Objects.equals(this.executionTimeout, that.executionTimeout)
            && Objects.equals(this.preStart, that.preStart) && Objects.equals(this.postFinish, that.postFinish)
            && Objects.equals(this.resourceGroupType, that.resourceGroupType)
            && Objects.equals(this.resourceGroupId, that.resourceGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grayCount,
            resourceType,
            grayResourceIds,
            grayFailThreshold,
            resourceIds,
            scriptIds,
            command,
            commandType,
            executionTimeout,
            preStart,
            postFinish,
            resourceGroupType,
            resourceGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteScriptOrCommandReq {\n");
        sb.append("    grayCount: ").append(toIndentedString(grayCount)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    grayResourceIds: ").append(toIndentedString(grayResourceIds)).append("\n");
        sb.append("    grayFailThreshold: ").append(toIndentedString(grayFailThreshold)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    scriptIds: ").append(toIndentedString(scriptIds)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
        sb.append("    executionTimeout: ").append(toIndentedString(executionTimeout)).append("\n");
        sb.append("    preStart: ").append(toIndentedString(preStart)).append("\n");
        sb.append("    postFinish: ").append(toIndentedString(postFinish)).append("\n");
        sb.append("    resourceGroupType: ").append(toIndentedString(resourceGroupType)).append("\n");
        sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
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
