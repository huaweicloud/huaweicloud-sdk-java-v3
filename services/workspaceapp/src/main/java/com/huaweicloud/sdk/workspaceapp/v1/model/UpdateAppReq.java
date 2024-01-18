package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改应用属性(注意非空字段的限制,操作时会使用入参的字段直接覆盖已有字段的值)。
 */
public class UpdateAppReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_path")

    private String executePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_path")

    private String workPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_param")

    private String commandParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private AppStateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sandbox_enable")

    private Boolean sandboxEnable;

    public UpdateAppReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称,名称需满足如下规则: 1. 名称允许可见字符或空格，不可为全空格。 2. 长度1~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAppReq withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateAppReq withExecutePath(String executePath) {
        this.executePath = executePath;
        return this;
    }

    /**
     * 执行路径。
     * @return executePath
     */
    public String getExecutePath() {
        return executePath;
    }

    public void setExecutePath(String executePath) {
        this.executePath = executePath;
    }

    public UpdateAppReq withWorkPath(String workPath) {
        this.workPath = workPath;
        return this;
    }

    /**
     * 应用工作目录。
     * @return workPath
     */
    public String getWorkPath() {
        return workPath;
    }

    public void setWorkPath(String workPath) {
        this.workPath = workPath;
    }

    public UpdateAppReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAppReq withCommandParam(String commandParam) {
        this.commandParam = commandParam;
        return this;
    }

    /**
     * 启动命令行参数。
     * @return commandParam
     */
    public String getCommandParam() {
        return commandParam;
    }

    public void setCommandParam(String commandParam) {
        this.commandParam = commandParam;
    }

    public UpdateAppReq withState(AppStateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public AppStateEnum getState() {
        return state;
    }

    public void setState(AppStateEnum state) {
        this.state = state;
    }

    public UpdateAppReq withSandboxEnable(Boolean sandboxEnable) {
        this.sandboxEnable = sandboxEnable;
        return this;
    }

    /**
     * 是否使用沙箱模式运行，取值为： - false: 表示不以沙箱模式运行 - true: 表示以沙箱模式运行
     * @return sandboxEnable
     */
    public Boolean getSandboxEnable() {
        return sandboxEnable;
    }

    public void setSandboxEnable(Boolean sandboxEnable) {
        this.sandboxEnable = sandboxEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAppReq that = (UpdateAppReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.executePath, that.executePath) && Objects.equals(this.workPath, that.workPath)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.commandParam, that.commandParam) && Objects.equals(this.state, that.state)
            && Objects.equals(this.sandboxEnable, that.sandboxEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, executePath, workPath, description, commandParam, state, sandboxEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    executePath: ").append(toIndentedString(executePath)).append("\n");
        sb.append("    workPath: ").append(toIndentedString(workPath)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    commandParam: ").append(toIndentedString(commandParam)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sandboxEnable: ").append(toIndentedString(sandboxEnable)).append("\n");
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
