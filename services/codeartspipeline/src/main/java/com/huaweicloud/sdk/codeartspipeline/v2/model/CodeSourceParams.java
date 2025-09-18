package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 流水线源参数，包含流水线源的详细信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
 */
public class CodeSourceParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_type")

    private String gitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_id")

    private String codehubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_branch")

    private String defaultBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_git_url")

    private String sshGitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    public CodeSourceParams withGitType(String gitType) {
        this.gitType = gitType;
        return this;
    }

    /**
     * **参数解释**： 代码仓类型。 **约束限制**： 不涉及。 **取值范围**： - codehub。 - gitee。 - github。 - gitcode。 - gitlab。 **默认取值**： 不涉及。 
     * @return gitType
     */
    public String getGitType() {
        return gitType;
    }

    public void setGitType(String gitType) {
        this.gitType = gitType;
    }

    public CodeSourceParams withCodehubId(String codehubId) {
        this.codehubId = codehubId;
        return this;
    }

    /**
     * **参数解释**： CodeArts Repo代码仓ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return codehubId
     */
    public String getCodehubId() {
        return codehubId;
    }

    public void setCodehubId(String codehubId) {
        this.codehubId = codehubId;
    }

    public CodeSourceParams withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**： 代码源扩展点ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public CodeSourceParams withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * **参数解释**： 默认分支。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public CodeSourceParams withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释**： Git仓库https地址，例如https://example.com/CloudPipelinezycs00001/2000.git。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public CodeSourceParams withSshGitUrl(String sshGitUrl) {
        this.sshGitUrl = sshGitUrl;
        return this;
    }

    /**
     * **参数解释**： ssh_git链接地址，例如https://example.com/CloudPipelinezycs00001/2000.git。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return sshGitUrl
     */
    public String getSshGitUrl() {
        return sshGitUrl;
    }

    public void setSshGitUrl(String sshGitUrl) {
        this.sshGitUrl = sshGitUrl;
    }

    public CodeSourceParams withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * **参数解释**： 网页url。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public CodeSourceParams withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * **参数解释**： 流水线源名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public CodeSourceParams withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * **参数解释**： 代码仓别名。 **约束限制**： 不涉及。 **取值范围**： 仅支持输入大小写英文字母、数字、“_”，至多128个字符。 **默认取值**： 不涉及。 
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeSourceParams that = (CodeSourceParams) obj;
        return Objects.equals(this.gitType, that.gitType) && Objects.equals(this.codehubId, that.codehubId)
            && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.defaultBranch, that.defaultBranch) && Objects.equals(this.gitUrl, that.gitUrl)
            && Objects.equals(this.sshGitUrl, that.sshGitUrl) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.repoName, that.repoName) && Objects.equals(this.alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gitType, codehubId, endpointId, defaultBranch, gitUrl, sshGitUrl, webUrl, repoName, alias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSourceParams {\n");
        sb.append("    gitType: ").append(toIndentedString(gitType)).append("\n");
        sb.append("    codehubId: ").append(toIndentedString(codehubId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    sshGitUrl: ").append(toIndentedString(sshGitUrl)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
