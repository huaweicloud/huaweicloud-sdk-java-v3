package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组织合规规则包请求体。
 */
public class OrgConformancePackRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excluded_accounts")

    private List<String> excludedAccounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_key")

    private String templateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_body")

    private String templateBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_uri")

    private String templateUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_structure")

    private List<VarsStructure> varsStructure = null;

    public OrgConformancePackRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组织合规规则包名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgConformancePackRequestBody withExcludedAccounts(List<String> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
        return this;
    }

    public OrgConformancePackRequestBody addExcludedAccountsItem(String excludedAccountsItem) {
        if (this.excludedAccounts == null) {
            this.excludedAccounts = new ArrayList<>();
        }
        this.excludedAccounts.add(excludedAccountsItem);
        return this;
    }

    public OrgConformancePackRequestBody withExcludedAccounts(Consumer<List<String>> excludedAccountsSetter) {
        if (this.excludedAccounts == null) {
            this.excludedAccounts = new ArrayList<>();
        }
        excludedAccountsSetter.accept(this.excludedAccounts);
        return this;
    }

    /**
     * 排除配置合规包的帐号。
     * @return excludedAccounts
     */
    public List<String> getExcludedAccounts() {
        return excludedAccounts;
    }

    public void setExcludedAccounts(List<String> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
    }

    public OrgConformancePackRequestBody withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }

    /**
     * 预定义合规规则包模板名称。
     * @return templateKey
     */
    public String getTemplateKey() {
        return templateKey;
    }

    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    public OrgConformancePackRequestBody withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * 自定义合规规则包内容。
     * @return templateBody
     */
    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    public OrgConformancePackRequestBody withTemplateUri(String templateUri) {
        this.templateUri = templateUri;
        return this;
    }

    /**
     * 合规规则包模板OBS地址。
     * @return templateUri
     */
    public String getTemplateUri() {
        return templateUri;
    }

    public void setTemplateUri(String templateUri) {
        this.templateUri = templateUri;
    }

    public OrgConformancePackRequestBody withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    public OrgConformancePackRequestBody addVarsStructureItem(VarsStructure varsStructureItem) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public OrgConformancePackRequestBody withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * 合规规则包参数。
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrgConformancePackRequestBody that = (OrgConformancePackRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.excludedAccounts, that.excludedAccounts)
            && Objects.equals(this.templateKey, that.templateKey)
            && Objects.equals(this.templateBody, that.templateBody)
            && Objects.equals(this.templateUri, that.templateUri)
            && Objects.equals(this.varsStructure, that.varsStructure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, excludedAccounts, templateKey, templateBody, templateUri, varsStructure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgConformancePackRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    excludedAccounts: ").append(toIndentedString(excludedAccounts)).append("\n");
        sb.append("    templateKey: ").append(toIndentedString(templateKey)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
        sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
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
