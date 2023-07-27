package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExternalTestCaseVo
 */
public class ExternalTestCaseVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private NameAndIdVo owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private NameAndIdVo status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private NameAndIdVo result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private NameAndIdVo module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private NameAndIdVo iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_id")

    private String rankId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_type")

    private NameAndIdVo executionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_type")

    private IntegerIdAndNameVo testType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_info")

    private CreateInfoVo createInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_info")

    private ExecuteInfoVo executeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_issue_info")

    private AssociateIssueInfoVo associateIssueInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_defect_info")

    private AssociateDefectInfoVo associateDefectInfo;

    public ExternalTestCaseVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExternalTestCaseVo withOwner(NameAndIdVo owner) {
        this.owner = owner;
        return this;
    }

    public ExternalTestCaseVo withOwner(Consumer<NameAndIdVo> ownerSetter) {
        if (this.owner == null) {
            this.owner = new NameAndIdVo();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public NameAndIdVo getOwner() {
        return owner;
    }

    public void setOwner(NameAndIdVo owner) {
        this.owner = owner;
    }

    public ExternalTestCaseVo withStatus(NameAndIdVo status) {
        this.status = status;
        return this;
    }

    public ExternalTestCaseVo withStatus(Consumer<NameAndIdVo> statusSetter) {
        if (this.status == null) {
            this.status = new NameAndIdVo();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public NameAndIdVo getStatus() {
        return status;
    }

    public void setStatus(NameAndIdVo status) {
        this.status = status;
    }

    public ExternalTestCaseVo withResult(NameAndIdVo result) {
        this.result = result;
        return this;
    }

    public ExternalTestCaseVo withResult(Consumer<NameAndIdVo> resultSetter) {
        if (this.result == null) {
            this.result = new NameAndIdVo();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public NameAndIdVo getResult() {
        return result;
    }

    public void setResult(NameAndIdVo result) {
        this.result = result;
    }

    public ExternalTestCaseVo withModule(NameAndIdVo module) {
        this.module = module;
        return this;
    }

    public ExternalTestCaseVo withModule(Consumer<NameAndIdVo> moduleSetter) {
        if (this.module == null) {
            this.module = new NameAndIdVo();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /**
     * Get module
     * @return module
     */
    public NameAndIdVo getModule() {
        return module;
    }

    public void setModule(NameAndIdVo module) {
        this.module = module;
    }

    public ExternalTestCaseVo withIteration(NameAndIdVo iteration) {
        this.iteration = iteration;
        return this;
    }

    public ExternalTestCaseVo withIteration(Consumer<NameAndIdVo> iterationSetter) {
        if (this.iteration == null) {
            this.iteration = new NameAndIdVo();
            iterationSetter.accept(this.iteration);
        }

        return this;
    }

    /**
     * Get iteration
     * @return iteration
     */
    public NameAndIdVo getIteration() {
        return iteration;
    }

    public void setIteration(NameAndIdVo iteration) {
        this.iteration = iteration;
    }

    public ExternalTestCaseVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExternalTestCaseVo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 用例编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ExternalTestCaseVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalTestCaseVo withRankId(String rankId) {
        this.rankId = rankId;
        return this;
    }

    /**
     * 用例等级
     * @return rankId
     */
    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId;
    }

    public ExternalTestCaseVo withProjectId(String projectId) {
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

    public ExternalTestCaseVo withExecutionType(NameAndIdVo executionType) {
        this.executionType = executionType;
        return this;
    }

    public ExternalTestCaseVo withExecutionType(Consumer<NameAndIdVo> executionTypeSetter) {
        if (this.executionType == null) {
            this.executionType = new NameAndIdVo();
            executionTypeSetter.accept(this.executionType);
        }

        return this;
    }

    /**
     * Get executionType
     * @return executionType
     */
    public NameAndIdVo getExecutionType() {
        return executionType;
    }

    public void setExecutionType(NameAndIdVo executionType) {
        this.executionType = executionType;
    }

    public ExternalTestCaseVo withTestType(IntegerIdAndNameVo testType) {
        this.testType = testType;
        return this;
    }

    public ExternalTestCaseVo withTestType(Consumer<IntegerIdAndNameVo> testTypeSetter) {
        if (this.testType == null) {
            this.testType = new IntegerIdAndNameVo();
            testTypeSetter.accept(this.testType);
        }

        return this;
    }

    /**
     * Get testType
     * @return testType
     */
    public IntegerIdAndNameVo getTestType() {
        return testType;
    }

    public void setTestType(IntegerIdAndNameVo testType) {
        this.testType = testType;
    }

    public ExternalTestCaseVo withCreateInfo(CreateInfoVo createInfo) {
        this.createInfo = createInfo;
        return this;
    }

    public ExternalTestCaseVo withCreateInfo(Consumer<CreateInfoVo> createInfoSetter) {
        if (this.createInfo == null) {
            this.createInfo = new CreateInfoVo();
            createInfoSetter.accept(this.createInfo);
        }

        return this;
    }

    /**
     * Get createInfo
     * @return createInfo
     */
    public CreateInfoVo getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(CreateInfoVo createInfo) {
        this.createInfo = createInfo;
    }

    public ExternalTestCaseVo withExecuteInfo(ExecuteInfoVo executeInfo) {
        this.executeInfo = executeInfo;
        return this;
    }

    public ExternalTestCaseVo withExecuteInfo(Consumer<ExecuteInfoVo> executeInfoSetter) {
        if (this.executeInfo == null) {
            this.executeInfo = new ExecuteInfoVo();
            executeInfoSetter.accept(this.executeInfo);
        }

        return this;
    }

    /**
     * Get executeInfo
     * @return executeInfo
     */
    public ExecuteInfoVo getExecuteInfo() {
        return executeInfo;
    }

    public void setExecuteInfo(ExecuteInfoVo executeInfo) {
        this.executeInfo = executeInfo;
    }

    public ExternalTestCaseVo withAssociateIssueInfo(AssociateIssueInfoVo associateIssueInfo) {
        this.associateIssueInfo = associateIssueInfo;
        return this;
    }

    public ExternalTestCaseVo withAssociateIssueInfo(Consumer<AssociateIssueInfoVo> associateIssueInfoSetter) {
        if (this.associateIssueInfo == null) {
            this.associateIssueInfo = new AssociateIssueInfoVo();
            associateIssueInfoSetter.accept(this.associateIssueInfo);
        }

        return this;
    }

    /**
     * Get associateIssueInfo
     * @return associateIssueInfo
     */
    public AssociateIssueInfoVo getAssociateIssueInfo() {
        return associateIssueInfo;
    }

    public void setAssociateIssueInfo(AssociateIssueInfoVo associateIssueInfo) {
        this.associateIssueInfo = associateIssueInfo;
    }

    public ExternalTestCaseVo withAssociateDefectInfo(AssociateDefectInfoVo associateDefectInfo) {
        this.associateDefectInfo = associateDefectInfo;
        return this;
    }

    public ExternalTestCaseVo withAssociateDefectInfo(Consumer<AssociateDefectInfoVo> associateDefectInfoSetter) {
        if (this.associateDefectInfo == null) {
            this.associateDefectInfo = new AssociateDefectInfoVo();
            associateDefectInfoSetter.accept(this.associateDefectInfo);
        }

        return this;
    }

    /**
     * Get associateDefectInfo
     * @return associateDefectInfo
     */
    public AssociateDefectInfoVo getAssociateDefectInfo() {
        return associateDefectInfo;
    }

    public void setAssociateDefectInfo(AssociateDefectInfoVo associateDefectInfo) {
        this.associateDefectInfo = associateDefectInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalTestCaseVo that = (ExternalTestCaseVo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.status, that.status) && Objects.equals(this.result, that.result)
            && Objects.equals(this.module, that.module) && Objects.equals(this.iteration, that.iteration)
            && Objects.equals(this.id, that.id) && Objects.equals(this.number, that.number)
            && Objects.equals(this.description, that.description) && Objects.equals(this.rankId, that.rankId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.executionType, that.executionType)
            && Objects.equals(this.testType, that.testType) && Objects.equals(this.createInfo, that.createInfo)
            && Objects.equals(this.executeInfo, that.executeInfo)
            && Objects.equals(this.associateIssueInfo, that.associateIssueInfo)
            && Objects.equals(this.associateDefectInfo, that.associateDefectInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            owner,
            status,
            result,
            module,
            iteration,
            id,
            number,
            description,
            rankId,
            projectId,
            executionType,
            testType,
            createInfo,
            executeInfo,
            associateIssueInfo,
            associateDefectInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalTestCaseVo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rankId: ").append(toIndentedString(rankId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
        sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
        sb.append("    createInfo: ").append(toIndentedString(createInfo)).append("\n");
        sb.append("    executeInfo: ").append(toIndentedString(executeInfo)).append("\n");
        sb.append("    associateIssueInfo: ").append(toIndentedString(associateIssueInfo)).append("\n");
        sb.append("    associateDefectInfo: ").append(toIndentedString(associateDefectInfo)).append("\n");
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
