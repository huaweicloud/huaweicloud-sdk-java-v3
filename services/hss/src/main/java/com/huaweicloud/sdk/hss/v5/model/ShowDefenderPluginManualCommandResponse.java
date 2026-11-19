package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDefenderPluginManualCommandResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt")

    private String opt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "claw_plugin_command")

    private String clawPluginCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_url")

    private String scriptUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_key")

    private String installKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_pkg_url")

    private String pluginPkgUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_result_cmd")

    private String queryResultCmd;

    public ShowDefenderPluginManualCommandResponse withOpt(String opt) {
        this.opt = opt;
        return this;
    }

    /**
     * **参数解释**： 操作类型，回显请求的opt值 **取值范围**： - install：安装 - uninstall：卸载 
     * @return opt
     */
    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }

    public ShowDefenderPluginManualCommandResponse withClawPluginCommand(String clawPluginCommand) {
        this.clawPluginCommand = clawPluginCommand;
        return this;
    }

    /**
     * **参数解释**： 完整的手动操作命令，可直接复制到终端执行 **取值范围**： 字符长度为1-4096位 
     * @return clawPluginCommand
     */
    public String getClawPluginCommand() {
        return clawPluginCommand;
    }

    public void setClawPluginCommand(String clawPluginCommand) {
        this.clawPluginCommand = clawPluginCommand;
    }

    public ShowDefenderPluginManualCommandResponse withScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
        return this;
    }

    /**
     * **参数解释**： 脚本下载地址 **取值范围**： 字符长度为1-512位 
     * @return scriptUrl
     */
    public String getScriptUrl() {
        return scriptUrl;
    }

    public void setScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
    }

    public ShowDefenderPluginManualCommandResponse withInstallKey(String installKey) {
        this.installKey = installKey;
        return this;
    }

    /**
     * **参数解释**： 安装凭证 **取值范围**： 字符长度为1-256位 
     * @return installKey
     */
    public String getInstallKey() {
        return installKey;
    }

    public void setInstallKey(String installKey) {
        this.installKey = installKey;
    }

    public ShowDefenderPluginManualCommandResponse withPluginPkgUrl(String pluginPkgUrl) {
        this.pluginPkgUrl = pluginPkgUrl;
        return this;
    }

    /**
     * **参数解释**： 插件包下载地址 **取值范围**： 字符长度为1-512位 
     * @return pluginPkgUrl
     */
    public String getPluginPkgUrl() {
        return pluginPkgUrl;
    }

    public void setPluginPkgUrl(String pluginPkgUrl) {
        this.pluginPkgUrl = pluginPkgUrl;
    }

    public ShowDefenderPluginManualCommandResponse withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * **参数解释**： AI Defender服务端地址 **取值范围**： 字符长度为1-512位 
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ShowDefenderPluginManualCommandResponse withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * **参数解释**： 安装凭证过期时间，毫秒时间戳，过期后需重新获取 **取值范围**： 最小值0，最大值9223372036854775807 
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public ShowDefenderPluginManualCommandResponse withQueryResultCmd(String queryResultCmd) {
        this.queryResultCmd = queryResultCmd;
        return this;
    }

    /**
     * **参数解释**： 查询安装结果命令 **取值范围**： \"openclaw plugins info AgentDR_OpenClaw\" 
     * @return queryResultCmd
     */
    public String getQueryResultCmd() {
        return queryResultCmd;
    }

    public void setQueryResultCmd(String queryResultCmd) {
        this.queryResultCmd = queryResultCmd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDefenderPluginManualCommandResponse that = (ShowDefenderPluginManualCommandResponse) obj;
        return Objects.equals(this.opt, that.opt) && Objects.equals(this.clawPluginCommand, that.clawPluginCommand)
            && Objects.equals(this.scriptUrl, that.scriptUrl) && Objects.equals(this.installKey, that.installKey)
            && Objects.equals(this.pluginPkgUrl, that.pluginPkgUrl) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.queryResultCmd, that.queryResultCmd);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(opt, clawPluginCommand, scriptUrl, installKey, pluginPkgUrl, endpoint, expireTime, queryResultCmd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDefenderPluginManualCommandResponse {\n");
        sb.append("    opt: ").append(toIndentedString(opt)).append("\n");
        sb.append("    clawPluginCommand: ").append(toIndentedString(clawPluginCommand)).append("\n");
        sb.append("    scriptUrl: ").append(toIndentedString(scriptUrl)).append("\n");
        sb.append("    installKey: ").append(toIndentedString(installKey)).append("\n");
        sb.append("    pluginPkgUrl: ").append(toIndentedString(pluginPkgUrl)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    queryResultCmd: ").append(toIndentedString(queryResultCmd)).append("\n");
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
