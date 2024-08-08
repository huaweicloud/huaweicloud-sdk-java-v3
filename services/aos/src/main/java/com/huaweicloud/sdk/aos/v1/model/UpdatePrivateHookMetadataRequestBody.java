package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdatePrivateHookMetadataRequestBody
 */
public class UpdatePrivateHookMetadataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_description")

    private String hookDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private String hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_version")

    private String defaultVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private ConfigurationPrimitiveTypeHolderConfiguration _configuration;

    public UpdatePrivateHookMetadataRequestBody withHookDescription(String hookDescription) {
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

    public UpdatePrivateHookMetadataRequestBody withHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }

    /**
     * 私有hook（private-hook）的唯一Id。  此Id由资源编排服务在生成私有hook的时候生成，为UUID。  由于私有hook名称仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的私有hook，删除，再重新创建一个同名私有hook。  对于团队并行开发，用户可能希望确保，当前我操作的私有hook就是我认为的那个，而不是其他队友删除后创建的同名私有hook。因此，使用Id就可以做到强匹配。  资源编排服务保证每次创建的私有hook所对应的Id都不相同，更新不会影响Id。如果给与的hook_id和当前hook的Id不一致，则返回400。
     * @return hookId
     */
    public String getHookId() {
        return hookId;
    }

    public void setHookId(String hookId) {
        this.hookId = hookId;
    }

    public UpdatePrivateHookMetadataRequestBody withDefaultVersion(String defaultVersion) {
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

    public UpdatePrivateHookMetadataRequestBody withConfiguration(
        ConfigurationPrimitiveTypeHolderConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public UpdatePrivateHookMetadataRequestBody withConfiguration(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePrivateHookMetadataRequestBody that = (UpdatePrivateHookMetadataRequestBody) obj;
        return Objects.equals(this.hookDescription, that.hookDescription) && Objects.equals(this.hookId, that.hookId)
            && Objects.equals(this.defaultVersion, that.defaultVersion)
            && Objects.equals(this._configuration, that._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookDescription, hookId, defaultVersion, _configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateHookMetadataRequestBody {\n");
        sb.append("    hookDescription: ").append(toIndentedString(hookDescription)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    defaultVersion: ").append(toIndentedString(defaultVersion)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
