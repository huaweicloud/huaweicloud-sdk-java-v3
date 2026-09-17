package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项流程流转请求参数。
 */
public class WorkItemFlowVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_category")

    private String issueCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_code")

    private String flowCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_ids")

    private List<String> issueIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_context")

    private Map<String, Object> processContext = null;

    public WorkItemFlowVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 工作项唯一ID。可以通过[查询工作项列表](ListIpdProjectIssues.xml)或者[查询树状工作项](ShowIpdIssueTree.xml)接口获取，响应消息体中的**id**字段的值就是工作项ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkItemFlowVO withIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }

    /**
     * **参数解释**： 工作项类型。 **约束限制**： 不涉及。 **取值范围**： RR、IR、AR、SR、Bug、FE、Task、US、Epic、SF **默认取值**： 不涉及。
     * @return issueCategory
     */
    public String getIssueCategory() {
        return issueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
    }

    public WorkItemFlowVO withFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }

    /**
     * **参数解释**： 工作项流转code。可以通过[查询工作项流程信息](ShowIssueWorkItemFlowDetail.xml)接口获取。 响应消息体中的**next_flow**数组为工作流流转线，根据**from_code**当前状态和**to_code**目标状态找到匹配的流转线，流转线的**code**字段的值就是工作项流转code。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return flowCode
     */
    public String getFlowCode() {
        return flowCode;
    }

    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode;
    }

    public WorkItemFlowVO withIssueIds(List<String> issueIds) {
        this.issueIds = issueIds;
        return this;
    }

    public WorkItemFlowVO addIssueIdsItem(String issueIdsItem) {
        if (this.issueIds == null) {
            this.issueIds = new ArrayList<>();
        }
        this.issueIds.add(issueIdsItem);
        return this;
    }

    public WorkItemFlowVO withIssueIds(Consumer<List<String>> issueIdsSetter) {
        if (this.issueIds == null) {
            this.issueIds = new ArrayList<>();
        }
        issueIdsSetter.accept(this.issueIds);
        return this;
    }

    /**
     * **参数解释**： 工作项唯一Id数组。可以通过[查询工作项列表](ListIpdProjectIssues.xml)或者[查询树状工作项](ShowIpdIssueTree.xml)接口获取，响应消息体中的**id**字段的值就是工作项ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return issueIds
     */
    public List<String> getIssueIds() {
        return issueIds;
    }

    public void setIssueIds(List<String> issueIds) {
        this.issueIds = issueIds;
    }

    public WorkItemFlowVO withProcessContext(Map<String, Object> processContext) {
        this.processContext = processContext;
        return this;
    }

    public WorkItemFlowVO putProcessContextItem(String key, Object processContextItem) {
        if (this.processContext == null) {
            this.processContext = new HashMap<>();
        }
        this.processContext.put(key, processContextItem);
        return this;
    }

    public WorkItemFlowVO withProcessContext(Consumer<Map<String, Object>> processContextSetter) {
        if (this.processContext == null) {
            this.processContext = new HashMap<>();
        }
        processContextSetter.accept(this.processContext);
        return this;
    }

    /**
     * **参数解释**： 流转中配置上下文信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return processContext
     */
    public Map<String, Object> getProcessContext() {
        return processContext;
    }

    public void setProcessContext(Map<String, Object> processContext) {
        this.processContext = processContext;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemFlowVO that = (WorkItemFlowVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.issueCategory, that.issueCategory)
            && Objects.equals(this.flowCode, that.flowCode) && Objects.equals(this.issueIds, that.issueIds)
            && Objects.equals(this.processContext, that.processContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, issueCategory, flowCode, issueIds, processContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemFlowVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueCategory: ").append(toIndentedString(issueCategory)).append("\n");
        sb.append("    flowCode: ").append(toIndentedString(flowCode)).append("\n");
        sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
        sb.append("    processContext: ").append(toIndentedString(processContext)).append("\n");
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
