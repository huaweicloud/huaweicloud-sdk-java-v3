package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SetDefaulTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleset_id")

    @JacksonXmlProperty(localName = "ruleset_id")

    private String rulesetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private String language;

    public SetDefaulTemplateRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SetDefaulTemplateRequest withRulesetId(String rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }

    /**
     * 规则集ID
     * @return rulesetId
     */
    public String getRulesetId() {
        return rulesetId;
    }

    public void setRulesetId(String rulesetId) {
        this.rulesetId = rulesetId;
    }

    public SetDefaulTemplateRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 规则集语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetDefaulTemplateRequest setDefaulTemplateRequest = (SetDefaulTemplateRequest) o;
        return Objects.equals(this.projectId, setDefaulTemplateRequest.projectId)
            && Objects.equals(this.rulesetId, setDefaulTemplateRequest.rulesetId)
            && Objects.equals(this.language, setDefaulTemplateRequest.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, rulesetId, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetDefaulTemplateRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    rulesetId: ").append(toIndentedString(rulesetId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
