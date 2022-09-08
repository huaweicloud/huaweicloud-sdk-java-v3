package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务详情
 */
public class ParamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_dir")

    private String excludeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode")

    private String encode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compile_config")

    private String compileConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_template")

    private String ruleTemplate;

    public ParamInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 仓库地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ParamInfo withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 仓库分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public ParamInfo withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 仓库语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ParamInfo withExcludeDir(String excludeDir) {
        this.excludeDir = excludeDir;
        return this;
    }

    /**
     * 排除的目录
     * @return excludeDir
     */
    public String getExcludeDir() {
        return excludeDir;
    }

    public void setExcludeDir(String excludeDir) {
        this.excludeDir = excludeDir;
    }

    public ParamInfo withEncode(String encode) {
        this.encode = encode;
        return this;
    }

    /**
     * 编码格式
     * @return encode
     */
    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }

    public ParamInfo withCompileConfig(String compileConfig) {
        this.compileConfig = compileConfig;
        return this;
    }

    /**
     * 编译配置信息
     * @return compileConfig
     */
    public String getCompileConfig() {
        return compileConfig;
    }

    public void setCompileConfig(String compileConfig) {
        this.compileConfig = compileConfig;
    }

    public ParamInfo withRuleTemplate(String ruleTemplate) {
        this.ruleTemplate = ruleTemplate;
        return this;
    }

    /**
     * g规则集名称
     * @return ruleTemplate
     */
    public String getRuleTemplate() {
        return ruleTemplate;
    }

    public void setRuleTemplate(String ruleTemplate) {
        this.ruleTemplate = ruleTemplate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParamInfo paramInfo = (ParamInfo) o;
        return Objects.equals(this.url, paramInfo.url) && Objects.equals(this.branch, paramInfo.branch)
            && Objects.equals(this.language, paramInfo.language)
            && Objects.equals(this.excludeDir, paramInfo.excludeDir) && Objects.equals(this.encode, paramInfo.encode)
            && Objects.equals(this.compileConfig, paramInfo.compileConfig)
            && Objects.equals(this.ruleTemplate, paramInfo.ruleTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, branch, language, excludeDir, encode, compileConfig, ruleTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParamInfo {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    excludeDir: ").append(toIndentedString(excludeDir)).append("\n");
        sb.append("    encode: ").append(toIndentedString(encode)).append("\n");
        sb.append("    compileConfig: ").append(toIndentedString(compileConfig)).append("\n");
        sb.append("    ruleTemplate: ").append(toIndentedString(ruleTemplate)).append("\n");
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
