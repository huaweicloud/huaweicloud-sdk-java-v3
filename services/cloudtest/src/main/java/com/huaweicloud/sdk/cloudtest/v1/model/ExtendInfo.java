package com.huaweicloud.sdk.cloudtest.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudtest.v1.model.AssignedUserInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.ExtendAuthorInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.ExternalServiceCaseStep;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用例其他扩展信息
 */
public class ExtendInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="author")
    
    private ExtendAuthorInfo author;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updator")
    
    private ExtendAuthorInfo updator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private AssignedUserInfo domain;


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
    
    private List<AssignedUserInfo> labelList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="defect_list")
    
    private List<AssignedUserInfo> defectList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module")
    
    private AssignedUserInfo module;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue")
    
    private AssignedUserInfo issue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_version_id")
    
    private String testVersionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_version")
    
    private AssignedUserInfo fixedVersion;

    public ExtendInfo withAuthor(ExtendAuthorInfo author) {
        this.author = author;
        return this;
    }

    public ExtendInfo withAuthor(Consumer<ExtendAuthorInfo> authorSetter) {
        if(this.author == null ){
            this.author = new ExtendAuthorInfo();
            authorSetter.accept(this.author);
        }
        
        return this;
    }


    /**
     * Get author
     * @return author
     */
    public ExtendAuthorInfo getAuthor() {
        return author;
    }

    public void setAuthor(ExtendAuthorInfo author) {
        this.author = author;
    }

    

    public ExtendInfo withUpdator(ExtendAuthorInfo updator) {
        this.updator = updator;
        return this;
    }

    public ExtendInfo withUpdator(Consumer<ExtendAuthorInfo> updatorSetter) {
        if(this.updator == null ){
            this.updator = new ExtendAuthorInfo();
            updatorSetter.accept(this.updator);
        }
        
        return this;
    }


    /**
     * Get updator
     * @return updator
     */
    public ExtendAuthorInfo getUpdator() {
        return updator;
    }

    public void setUpdator(ExtendAuthorInfo updator) {
        this.updator = updator;
    }

    

    public ExtendInfo withDomain(AssignedUserInfo domain) {
        this.domain = domain;
        return this;
    }

    public ExtendInfo withDomain(Consumer<AssignedUserInfo> domainSetter) {
        if(this.domain == null ){
            this.domain = new AssignedUserInfo();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public AssignedUserInfo getDomain() {
        return domain;
    }

    public void setDomain(AssignedUserInfo domain) {
        this.domain = domain;
    }

    

    public ExtendInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ExtendInfo withPreparation(String preparation) {
        this.preparation = preparation;
        return this;
    }

    


    /**
     * 前置条件
     * @return preparation
     */
    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    

    public ExtendInfo withSteps(List<ExternalServiceCaseStep> steps) {
        this.steps = steps;
        return this;
    }

    
    public ExtendInfo addStepsItem(ExternalServiceCaseStep stepsItem) {
        this.steps.add(stepsItem);
        return this;
    }

    public ExtendInfo withSteps(Consumer<List<ExternalServiceCaseStep>> stepsSetter) {
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

    

    public ExtendInfo withLabelList(List<AssignedUserInfo> labelList) {
        this.labelList = labelList;
        return this;
    }

    
    public ExtendInfo addLabelListItem(AssignedUserInfo labelListItem) {
        this.labelList.add(labelListItem);
        return this;
    }

    public ExtendInfo withLabelList(Consumer<List<AssignedUserInfo>> labelListSetter) {
        if(this.labelList == null ){
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * 标签信息
     * @return labelList
     */
    public List<AssignedUserInfo> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<AssignedUserInfo> labelList) {
        this.labelList = labelList;
    }

    

    public ExtendInfo withDefectList(List<AssignedUserInfo> defectList) {
        this.defectList = defectList;
        return this;
    }

    
    public ExtendInfo addDefectListItem(AssignedUserInfo defectListItem) {
        this.defectList.add(defectListItem);
        return this;
    }

    public ExtendInfo withDefectList(Consumer<List<AssignedUserInfo>> defectListSetter) {
        if(this.defectList == null ){
            this.defectList = new ArrayList<>();
        }
        defectListSetter.accept(this.defectList);
        return this;
    }

    /**
     * 缺陷信息
     * @return defectList
     */
    public List<AssignedUserInfo> getDefectList() {
        return defectList;
    }

    public void setDefectList(List<AssignedUserInfo> defectList) {
        this.defectList = defectList;
    }

    

    public ExtendInfo withModule(AssignedUserInfo module) {
        this.module = module;
        return this;
    }

    public ExtendInfo withModule(Consumer<AssignedUserInfo> moduleSetter) {
        if(this.module == null ){
            this.module = new AssignedUserInfo();
            moduleSetter.accept(this.module);
        }
        
        return this;
    }


    /**
     * Get module
     * @return module
     */
    public AssignedUserInfo getModule() {
        return module;
    }

    public void setModule(AssignedUserInfo module) {
        this.module = module;
    }

    

    public ExtendInfo withIssue(AssignedUserInfo issue) {
        this.issue = issue;
        return this;
    }

    public ExtendInfo withIssue(Consumer<AssignedUserInfo> issueSetter) {
        if(this.issue == null ){
            this.issue = new AssignedUserInfo();
            issueSetter.accept(this.issue);
        }
        
        return this;
    }


    /**
     * Get issue
     * @return issue
     */
    public AssignedUserInfo getIssue() {
        return issue;
    }

    public void setIssue(AssignedUserInfo issue) {
        this.issue = issue;
    }

    

    public ExtendInfo withTestVersionId(String testVersionId) {
        this.testVersionId = testVersionId;
        return this;
    }

    


    /**
     * 测试版本号
     * @return testVersionId
     */
    public String getTestVersionId() {
        return testVersionId;
    }

    public void setTestVersionId(String testVersionId) {
        this.testVersionId = testVersionId;
    }

    

    public ExtendInfo withFixedVersion(AssignedUserInfo fixedVersion) {
        this.fixedVersion = fixedVersion;
        return this;
    }

    public ExtendInfo withFixedVersion(Consumer<AssignedUserInfo> fixedVersionSetter) {
        if(this.fixedVersion == null ){
            this.fixedVersion = new AssignedUserInfo();
            fixedVersionSetter.accept(this.fixedVersion);
        }
        
        return this;
    }


    /**
     * Get fixedVersion
     * @return fixedVersion
     */
    public AssignedUserInfo getFixedVersion() {
        return fixedVersion;
    }

    public void setFixedVersion(AssignedUserInfo fixedVersion) {
        this.fixedVersion = fixedVersion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendInfo extendInfo = (ExtendInfo) o;
        return Objects.equals(this.author, extendInfo.author) &&
            Objects.equals(this.updator, extendInfo.updator) &&
            Objects.equals(this.domain, extendInfo.domain) &&
            Objects.equals(this.description, extendInfo.description) &&
            Objects.equals(this.preparation, extendInfo.preparation) &&
            Objects.equals(this.steps, extendInfo.steps) &&
            Objects.equals(this.labelList, extendInfo.labelList) &&
            Objects.equals(this.defectList, extendInfo.defectList) &&
            Objects.equals(this.module, extendInfo.module) &&
            Objects.equals(this.issue, extendInfo.issue) &&
            Objects.equals(this.testVersionId, extendInfo.testVersionId) &&
            Objects.equals(this.fixedVersion, extendInfo.fixedVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(author, updator, domain, description, preparation, steps, labelList, defectList, module, issue, testVersionId, fixedVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendInfo {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    updator: ").append(toIndentedString(updator)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    preparation: ").append(toIndentedString(preparation)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    defectList: ").append(toIndentedString(defectList)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
        sb.append("    testVersionId: ").append(toIndentedString(testVersionId)).append("\n");
        sb.append("    fixedVersion: ").append(toIndentedString(fixedVersion)).append("\n");
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

