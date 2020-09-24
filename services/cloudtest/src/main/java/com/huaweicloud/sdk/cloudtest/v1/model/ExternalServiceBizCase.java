package com.huaweicloud.sdk.cloudtest.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudtest.v1.model.ExternalServiceCaseStep;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 测试用例其他扩展信息
 */
public class ExternalServiceBizCase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preparation")
    
    private String preparation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="steps")
    
    private List<ExternalServiceCaseStep> steps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label_list")
    
    private List<String> labelList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_id")
    
    private String moduleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_version_id")
    
    private String testVersionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fix_version_id")
    
    private String fixVersionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assigned_id")
    
    private String assignedId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_id")
    
    private String issueId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_id")
    
    private String statusId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="defect_id_list")
    
    private List<String> defectIdList = null;
    
    public ExternalServiceBizCase withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 测试用例描述信息，长度为[0-500]位字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalServiceBizCase withPreparation(String preparation) {
        this.preparation = preparation;
        return this;
    }

    


    /**
     * 执行该测试用例时需要满足的前置条件，长度为[0-500]位字符
     * @return preparation
     */
    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public ExternalServiceBizCase withSteps(List<ExternalServiceCaseStep> steps) {
        this.steps = steps;
        return this;
    }

    
    public ExternalServiceBizCase addStepsItem(ExternalServiceCaseStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public ExternalServiceBizCase withSteps(Consumer<List<ExternalServiceCaseStep>> stepsSetter) {
        if(this.steps == null ){
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 测试步骤，数组长度小于10
     * @return steps
     */
    public List<ExternalServiceCaseStep> getSteps() {
        return steps;
    }

    public void setSteps(List<ExternalServiceCaseStep> steps) {
        this.steps = steps;
    }

    public ExternalServiceBizCase withLabelList(List<String> labelList) {
        this.labelList = labelList;
        return this;
    }

    
    public ExternalServiceBizCase addLabelListItem(String labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public ExternalServiceBizCase withLabelList(Consumer<List<String>> labelListSetter) {
        if(this.labelList == null ){
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * 标签名称列表，数组长度小于25
     * @return labelList
     */
    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public ExternalServiceBizCase withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    


    /**
     * 模块号，长度为[0-32]位字符
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public ExternalServiceBizCase withTestVersionId(String testVersionId) {
        this.testVersionId = testVersionId;
        return this;
    }

    


    /**
     * 测试版本号，长度为[0-10]位字符
     * @return testVersionId
     */
    public String getTestVersionId() {
        return testVersionId;
    }

    public void setTestVersionId(String testVersionId) {
        this.testVersionId = testVersionId;
    }

    public ExternalServiceBizCase withFixVersionId(String fixVersionId) {
        this.fixVersionId = fixVersionId;
        return this;
    }

    


    /**
     * 迭代号，长度为[0-32]位字符
     * @return fixVersionId
     */
    public String getFixVersionId() {
        return fixVersionId;
    }

    public void setFixVersionId(String fixVersionId) {
        this.fixVersionId = fixVersionId;
    }

    public ExternalServiceBizCase withAssignedId(String assignedId) {
        this.assignedId = assignedId;
        return this;
    }

    


    /**
     * 处理者id信息，固定长度32位字符
     * @return assignedId
     */
    public String getAssignedId() {
        return assignedId;
    }

    public void setAssignedId(String assignedId) {
        this.assignedId = assignedId;
    }

    public ExternalServiceBizCase withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    


    /**
     * 用例关联的需求id信息，长度为[0-32]位字符
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public ExternalServiceBizCase withStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    


    /**
     * 测试用例状态信息，（0-新建，5-设计中，6-测试中，7-完成）
     * @return statusId
     */
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public ExternalServiceBizCase withDefectIdList(List<String> defectIdList) {
        this.defectIdList = defectIdList;
        return this;
    }

    
    public ExternalServiceBizCase addDefectIdListItem(String defectIdListItem) {
        if (this.defectIdList == null) {
            this.defectIdList = new ArrayList<>();
        }
        this.defectIdList.add(defectIdListItem);
        return this;
    }

    public ExternalServiceBizCase withDefectIdList(Consumer<List<String>> defectIdListSetter) {
        if(this.defectIdList == null ){
            this.defectIdList = new ArrayList<>();
        }
        defectIdListSetter.accept(this.defectIdList);
        return this;
    }

    /**
     * 缺陷id信息，数组长度小于50个
     * @return defectIdList
     */
    public List<String> getDefectIdList() {
        return defectIdList;
    }

    public void setDefectIdList(List<String> defectIdList) {
        this.defectIdList = defectIdList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalServiceBizCase externalServiceBizCase = (ExternalServiceBizCase) o;
        return Objects.equals(this.description, externalServiceBizCase.description) &&
            Objects.equals(this.preparation, externalServiceBizCase.preparation) &&
            Objects.equals(this.steps, externalServiceBizCase.steps) &&
            Objects.equals(this.labelList, externalServiceBizCase.labelList) &&
            Objects.equals(this.moduleId, externalServiceBizCase.moduleId) &&
            Objects.equals(this.testVersionId, externalServiceBizCase.testVersionId) &&
            Objects.equals(this.fixVersionId, externalServiceBizCase.fixVersionId) &&
            Objects.equals(this.assignedId, externalServiceBizCase.assignedId) &&
            Objects.equals(this.issueId, externalServiceBizCase.issueId) &&
            Objects.equals(this.statusId, externalServiceBizCase.statusId) &&
            Objects.equals(this.defectIdList, externalServiceBizCase.defectIdList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, preparation, steps, labelList, moduleId, testVersionId, fixVersionId, assignedId, issueId, statusId, defectIdList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalServiceBizCase {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    preparation: ").append(toIndentedString(preparation)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    testVersionId: ").append(toIndentedString(testVersionId)).append("\n");
        sb.append("    fixVersionId: ").append(toIndentedString(fixVersionId)).append("\n");
        sb.append("    assignedId: ").append(toIndentedString(assignedId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    defectIdList: ").append(toIndentedString(defectIdList)).append("\n");
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

