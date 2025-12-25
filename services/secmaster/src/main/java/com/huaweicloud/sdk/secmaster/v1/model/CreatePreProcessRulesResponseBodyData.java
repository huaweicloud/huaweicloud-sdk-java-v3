package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据
 */
public class CreatePreProcessRulesResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_id")

    private String mappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preprocess_rules")

    private List<CreatePreProcessRulesResponseBodyDataPreprocessRules> preprocessRules = null;

    public CreatePreProcessRulesResponseBodyData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 映射id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreatePreProcessRulesResponseBodyData withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 映射id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreatePreProcessRulesResponseBodyData withMappingId(String mappingId) {
        this.mappingId = mappingId;
        return this;
    }

    /**
     * 映射id
     * @return mappingId
     */
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public CreatePreProcessRulesResponseBodyData withPreprocessRules(
        List<CreatePreProcessRulesResponseBodyDataPreprocessRules> preprocessRules) {
        this.preprocessRules = preprocessRules;
        return this;
    }

    public CreatePreProcessRulesResponseBodyData addPreprocessRulesItem(
        CreatePreProcessRulesResponseBodyDataPreprocessRules preprocessRulesItem) {
        if (this.preprocessRules == null) {
            this.preprocessRules = new ArrayList<>();
        }
        this.preprocessRules.add(preprocessRulesItem);
        return this;
    }

    public CreatePreProcessRulesResponseBodyData withPreprocessRules(
        Consumer<List<CreatePreProcessRulesResponseBodyDataPreprocessRules>> preprocessRulesSetter) {
        if (this.preprocessRules == null) {
            this.preprocessRules = new ArrayList<>();
        }
        preprocessRulesSetter.accept(this.preprocessRules);
        return this;
    }

    /**
     * 预处理规则列表
     * @return preprocessRules
     */
    public List<CreatePreProcessRulesResponseBodyDataPreprocessRules> getPreprocessRules() {
        return preprocessRules;
    }

    public void setPreprocessRules(List<CreatePreProcessRulesResponseBodyDataPreprocessRules> preprocessRules) {
        this.preprocessRules = preprocessRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePreProcessRulesResponseBodyData that = (CreatePreProcessRulesResponseBodyData) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.mappingId, that.mappingId)
            && Objects.equals(this.preprocessRules, that.preprocessRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, workspaceId, mappingId, preprocessRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePreProcessRulesResponseBodyData {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
        sb.append("    preprocessRules: ").append(toIndentedString(preprocessRules)).append("\n");
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
