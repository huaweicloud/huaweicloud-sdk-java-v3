package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PrivateHookSummary
 */
public class PrivateHookSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_name")

    private String hookName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private String hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_description")

    private String hookDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_version")

    private String defaultVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private ConfigurationPrimitiveTypeHolderConfiguration _configuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public PrivateHookSummary withHookName(String hookName) {
        this.hookName = hookName;
        return this;
    }

    /**
     * 私有hook的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。  推荐用户使用三段命名空间：{自定义hook名称}-{hook应用场景}-hook。
     * @return hookName
     */
    public String getHookName() {
        return hookName;
    }

    public void setHookName(String hookName) {
        this.hookName = hookName;
    }

    public PrivateHookSummary withHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }

    /**
     * 私有hook（private-hook）的唯一Id。  此Id由资源编排服务在生成私有hook的时候生成，为UUID。  由于私有hook名称仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的私有hook，删除，再重新创建一个同名私有hook。  对于团队并行开发，用户可能希望确保，当前我操作的私有hook就是我认为的那个，而不是其他队友删除后创建的同名私有hook。因此，使用Id就可以做到强匹配。  资源编排服务保证每次创建的私有hook所对应的Id都不相同，更新不会影响Id。如果给予的hook_id和当前hook的Id不一致，则返回400。
     * @return hookId
     */
    public String getHookId() {
        return hookId;
    }

    public void setHookId(String hookId) {
        this.hookId = hookId;
    }

    public PrivateHookSummary withHookDescription(String hookDescription) {
        this.hookDescription = hookDescription;
        return this;
    }

    /**
     * 私有hook的描述。可用于客户识别创建的私有hook。可通过UpdatePrivateHook API更新私有hook的描述。
     * @return hookDescription
     */
    public String getHookDescription() {
        return hookDescription;
    }

    public void setHookDescription(String hookDescription) {
        this.hookDescription = hookDescription;
    }

    public PrivateHookSummary withDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

    /**
     * 私有hook的默认版本号。版本号必须遵循语义化版本号（Semantic Version），为用户自定义。
     * @return defaultVersion
     */
    public String getDefaultVersion() {
        return defaultVersion;
    }

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public PrivateHookSummary withConfiguration(ConfigurationPrimitiveTypeHolderConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public PrivateHookSummary withConfiguration(
        Consumer<ConfigurationPrimitiveTypeHolderConfiguration> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new ConfigurationPrimitiveTypeHolderConfiguration();
            _configurationSetter.accept(this._configuration);
        }

        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    public ConfigurationPrimitiveTypeHolderConfiguration getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(ConfigurationPrimitiveTypeHolderConfiguration _configuration) {
        this._configuration = _configuration;
    }

    public PrivateHookSummary withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 私有Hook（private-hook）的生成时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PrivateHookSummary withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 私有Hook（private-hook）的更新时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateHookSummary that = (PrivateHookSummary) obj;
        return Objects.equals(this.hookName, that.hookName) && Objects.equals(this.hookId, that.hookId)
            && Objects.equals(this.hookDescription, that.hookDescription)
            && Objects.equals(this.defaultVersion, that.defaultVersion)
            && Objects.equals(this._configuration, that._configuration)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookName, hookId, hookDescription, defaultVersion, _configuration, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateHookSummary {\n");
        sb.append("    hookName: ").append(toIndentedString(hookName)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    hookDescription: ").append(toIndentedString(hookDescription)).append("\n");
        sb.append("    defaultVersion: ").append(toIndentedString(defaultVersion)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
