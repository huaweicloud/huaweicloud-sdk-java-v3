package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePrivateHookRequestBody
 */
public class CreatePrivateHookRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_name")

    private String hookName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_version")

    private String hookVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_description")

    private String hookDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_version_description")

    private String hookVersionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private ConfigurationPrimitiveTypeHolderConfiguration _configuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_uri")

    private String policyUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_body")

    private String policyBody;

    public CreatePrivateHookRequestBody withHookName(String hookName) {
        this.hookName = hookName;
        return this;
    }

    /**
     * 私有hook的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return hookName
     */
    public String getHookName() {
        return hookName;
    }

    public void setHookName(String hookName) {
        this.hookName = hookName;
    }

    public CreatePrivateHookRequestBody withHookVersion(String hookVersion) {
        this.hookVersion = hookVersion;
        return this;
    }

    /**
     * 私有hook的版本号。版本号必须遵循语义化版本号（Semantic Version），为用户自定义。
     * @return hookVersion
     */
    public String getHookVersion() {
        return hookVersion;
    }

    public void setHookVersion(String hookVersion) {
        this.hookVersion = hookVersion;
    }

    public CreatePrivateHookRequestBody withHookDescription(String hookDescription) {
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

    public CreatePrivateHookRequestBody withHookVersionDescription(String hookVersionDescription) {
        this.hookVersionDescription = hookVersionDescription;
        return this;
    }

    /**
     * 私有hook版本的描述。可用于客户识别创建私有hook的版本。注意：hook版本为不可更新（immutable），所以该字段不可更新，如果需要更新，请删除后重建。
     * @return hookVersionDescription
     */
    public String getHookVersionDescription() {
        return hookVersionDescription;
    }

    public void setHookVersionDescription(String hookVersionDescription) {
        this.hookVersionDescription = hookVersionDescription;
    }

    public CreatePrivateHookRequestBody withConfiguration(
        ConfigurationPrimitiveTypeHolderConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public CreatePrivateHookRequestBody withConfiguration(
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

    public CreatePrivateHookRequestBody withPolicyUri(String policyUri) {
        this.policyUri = policyUri;
        return this;
    }

    /**
     * 策略文件的OBS地址。内容仅支持OPA开源引擎识别的，以Rego（https://www.openpolicyagent.org/docs/latest/policy-language/）语言编写的策略模板。  请确保OBS地址所在局点与使用RFS服务局点一致。  策略文件当前支持单文件或zip压缩包，单文件需要以\".rego\"结尾，压缩包当前只支持zip格式，文件需要以`.zip`结尾。  关于策略文件的校验要求如下：   * 文件必须是UTF8编码   * 创建时会对大小、格式、语法等进行校验   * 策略文件必须是UTF-8编码   * 单文件或压缩包解压前后的大小应控制在1MB以内   * 压缩包内的文件数量不能超过100个   * 压缩包内的文件路径最长为2048   * 压缩包内的文件名最长为255个字节  policy_uri和policy_body必须有且只有一个存在
     * @return policyUri
     */
    public String getPolicyUri() {
        return policyUri;
    }

    public void setPolicyUri(String policyUri) {
        this.policyUri = policyUri;
    }

    public CreatePrivateHookRequestBody withPolicyBody(String policyBody) {
        this.policyBody = policyBody;
        return this;
    }

    /**
     * 策略内容。仅支持OPA开源引擎识别的，以Rego（https://www.openpolicyagent.org/docs/latest/policy-language/）语言编写的策略模板。  policy_body和policy_uri 必须有且只有一个存在
     * @return policyBody
     */
    public String getPolicyBody() {
        return policyBody;
    }

    public void setPolicyBody(String policyBody) {
        this.policyBody = policyBody;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePrivateHookRequestBody that = (CreatePrivateHookRequestBody) obj;
        return Objects.equals(this.hookName, that.hookName) && Objects.equals(this.hookVersion, that.hookVersion)
            && Objects.equals(this.hookDescription, that.hookDescription)
            && Objects.equals(this.hookVersionDescription, that.hookVersionDescription)
            && Objects.equals(this._configuration, that._configuration)
            && Objects.equals(this.policyUri, that.policyUri) && Objects.equals(this.policyBody, that.policyBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookName,
            hookVersion,
            hookDescription,
            hookVersionDescription,
            _configuration,
            policyUri,
            policyBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateHookRequestBody {\n");
        sb.append("    hookName: ").append(toIndentedString(hookName)).append("\n");
        sb.append("    hookVersion: ").append(toIndentedString(hookVersion)).append("\n");
        sb.append("    hookDescription: ").append(toIndentedString(hookDescription)).append("\n");
        sb.append("    hookVersionDescription: ").append(toIndentedString(hookVersionDescription)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    policyUri: ").append(toIndentedString(policyUri)).append("\n");
        sb.append("    policyBody: ").append(toIndentedString(policyBody)).append("\n");
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
