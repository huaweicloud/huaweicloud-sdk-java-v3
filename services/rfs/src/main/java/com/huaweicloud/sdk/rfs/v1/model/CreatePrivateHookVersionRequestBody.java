package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePrivateHookVersionRequestBody
 */
public class CreatePrivateHookVersionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private String hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_version")

    private String hookVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_version_description")

    private String hookVersionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_uri")

    private String policyUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_body")

    private String policyBody;

    public CreatePrivateHookVersionRequestBody withHookId(String hookId) {
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

    public CreatePrivateHookVersionRequestBody withHookVersion(String hookVersion) {
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

    public CreatePrivateHookVersionRequestBody withHookVersionDescription(String hookVersionDescription) {
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

    public CreatePrivateHookVersionRequestBody withPolicyUri(String policyUri) {
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

    public CreatePrivateHookVersionRequestBody withPolicyBody(String policyBody) {
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
        CreatePrivateHookVersionRequestBody that = (CreatePrivateHookVersionRequestBody) obj;
        return Objects.equals(this.hookId, that.hookId) && Objects.equals(this.hookVersion, that.hookVersion)
            && Objects.equals(this.hookVersionDescription, that.hookVersionDescription)
            && Objects.equals(this.policyUri, that.policyUri) && Objects.equals(this.policyBody, that.policyBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookId, hookVersion, hookVersionDescription, policyUri, policyBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateHookVersionRequestBody {\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    hookVersion: ").append(toIndentedString(hookVersion)).append("\n");
        sb.append("    hookVersionDescription: ").append(toIndentedString(hookVersionDescription)).append("\n");
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
