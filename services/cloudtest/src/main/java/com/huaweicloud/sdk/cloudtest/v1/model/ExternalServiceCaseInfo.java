package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 测试用例其他扩展信息 */
public class ExternalServiceCaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preparation")

    private String preparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<ExternalServiceCaseStep> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_list")

    private List<String> labelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_version_id")

    private String testVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_version_id")

    private String fixVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_id")

    private String assignedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    public ExternalServiceCaseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 测试用例描述信息，长度为[0-500]位字符
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalServiceCaseInfo withPreparation(String preparation) {
        this.preparation = preparation;
        return this;
    }

    /** 执行该测试用例时需要满足的前置条件，长度为[0-500]位字符
     * 
     * @return preparation */
    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public ExternalServiceCaseInfo withSteps(List<ExternalServiceCaseStep> steps) {
        this.steps = steps;
        return this;
    }

    public ExternalServiceCaseInfo addStepsItem(ExternalServiceCaseStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public ExternalServiceCaseInfo withSteps(Consumer<List<ExternalServiceCaseStep>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /** 测试步骤，数组长度小于10
     * 
     * @return steps */
    public List<ExternalServiceCaseStep> getSteps() {
        return steps;
    }

    public void setSteps(List<ExternalServiceCaseStep> steps) {
        this.steps = steps;
    }

    public ExternalServiceCaseInfo withLabelList(List<String> labelList) {
        this.labelList = labelList;
        return this;
    }

    public ExternalServiceCaseInfo addLabelListItem(String labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public ExternalServiceCaseInfo withLabelList(Consumer<List<String>> labelListSetter) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /** 标签名称列表，数组长度小于25
     * 
     * @return labelList */
    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public ExternalServiceCaseInfo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /** 模块号，长度为[0-32]位字符
     * 
     * @return moduleId */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public ExternalServiceCaseInfo withTestVersionId(String testVersionId) {
        this.testVersionId = testVersionId;
        return this;
    }

    /** 测试版本号，长度为[0-10]位字符
     * 
     * @return testVersionId */
    public String getTestVersionId() {
        return testVersionId;
    }

    public void setTestVersionId(String testVersionId) {
        this.testVersionId = testVersionId;
    }

    public ExternalServiceCaseInfo withFixVersionId(String fixVersionId) {
        this.fixVersionId = fixVersionId;
        return this;
    }

    /** 迭代号，长度为[0-32]位字符
     * 
     * @return fixVersionId */
    public String getFixVersionId() {
        return fixVersionId;
    }

    public void setFixVersionId(String fixVersionId) {
        this.fixVersionId = fixVersionId;
    }

    public ExternalServiceCaseInfo withAssignedId(String assignedId) {
        this.assignedId = assignedId;
        return this;
    }

    /** 处理者id信息，固定长度32位字符
     * 
     * @return assignedId */
    public String getAssignedId() {
        return assignedId;
    }

    public void setAssignedId(String assignedId) {
        this.assignedId = assignedId;
    }

    public ExternalServiceCaseInfo withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /** 用例关联的需求id信息，长度为[0-32]位字符
     * 
     * @return issueId */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalServiceCaseInfo externalServiceCaseInfo = (ExternalServiceCaseInfo) o;
        return Objects.equals(this.description, externalServiceCaseInfo.description)
            && Objects.equals(this.preparation, externalServiceCaseInfo.preparation)
            && Objects.equals(this.steps, externalServiceCaseInfo.steps)
            && Objects.equals(this.labelList, externalServiceCaseInfo.labelList)
            && Objects.equals(this.moduleId, externalServiceCaseInfo.moduleId)
            && Objects.equals(this.testVersionId, externalServiceCaseInfo.testVersionId)
            && Objects.equals(this.fixVersionId, externalServiceCaseInfo.fixVersionId)
            && Objects.equals(this.assignedId, externalServiceCaseInfo.assignedId)
            && Objects.equals(this.issueId, externalServiceCaseInfo.issueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            preparation,
            steps,
            labelList,
            moduleId,
            testVersionId,
            fixVersionId,
            assignedId,
            issueId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalServiceCaseInfo {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    preparation: ").append(toIndentedString(preparation)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    testVersionId: ").append(toIndentedString(testVersionId)).append("\n");
        sb.append("    fixVersionId: ").append(toIndentedString(fixVersionId)).append("\n");
        sb.append("    assignedId: ").append(toIndentedString(assignedId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
