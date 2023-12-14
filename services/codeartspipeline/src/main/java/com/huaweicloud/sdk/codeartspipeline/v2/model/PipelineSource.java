package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 源码仓库参数
 */
public class PipelineSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scmType")

    private String scmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hookFlag")

    private String hookFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultBranch")

    private String defaultBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private String trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoName")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoId")

    private String repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoOwner")

    private String repoOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gitUrl")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webUrl")

    private String webUrl;

    public PipelineSource withScmType(String scmType) {
        this.scmType = scmType;
        return this;
    }

    /**
     * 源码仓类型
     * @return scmType
     */
    public String getScmType() {
        return scmType;
    }

    public void setScmType(String scmType) {
        this.scmType = scmType;
    }

    public PipelineSource withHookFlag(String hookFlag) {
        this.hookFlag = hookFlag;
        return this;
    }

    /**
     * 是否配置Webhook
     * @return hookFlag
     */
    public String getHookFlag() {
        return hookFlag;
    }

    public void setHookFlag(String hookFlag) {
        this.hookFlag = hookFlag;
    }

    public PipelineSource withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * 默认分支
     * @return defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public PipelineSource withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * webhook配置数据
     * @return trigger
     */
    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public PipelineSource withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 代码仓别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public PipelineSource withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 代码仓显示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PipelineSource withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 源码仓名称
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public PipelineSource withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 代码仓ID
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public PipelineSource withRepoOwner(String repoOwner) {
        this.repoOwner = repoOwner;
        return this;
    }

    /**
     * 代码仓所有者
     * @return repoOwner
     */
    public String getRepoOwner() {
        return repoOwner;
    }

    public void setRepoOwner(String repoOwner) {
        this.repoOwner = repoOwner;
    }

    public PipelineSource withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * 代码仓访问地址
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public PipelineSource withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 代码仓Web页面地址
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineSource that = (PipelineSource) obj;
        return Objects.equals(this.scmType, that.scmType) && Objects.equals(this.hookFlag, that.hookFlag)
            && Objects.equals(this.defaultBranch, that.defaultBranch) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.repoName, that.repoName) && Objects.equals(this.repoId, that.repoId)
            && Objects.equals(this.repoOwner, that.repoOwner) && Objects.equals(this.gitUrl, that.gitUrl)
            && Objects.equals(this.webUrl, that.webUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scmType,
            hookFlag,
            defaultBranch,
            trigger,
            alias,
            displayName,
            repoName,
            repoId,
            repoOwner,
            gitUrl,
            webUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineSource {\n");
        sb.append("    scmType: ").append(toIndentedString(scmType)).append("\n");
        sb.append("    hookFlag: ").append(toIndentedString(hookFlag)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    repoOwner: ").append(toIndentedString(repoOwner)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
