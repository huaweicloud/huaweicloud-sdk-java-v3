package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociatedTestCase
 */
public class AssociatedTestCase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private String caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_num")

    private String caseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_name")

    private String caseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_level")

    private String caseLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusVo status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private SimpleUser creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private SimpleUser owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private SimpleProject project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_base_line")

    private Integer isBaseLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private Long createdTime;

    public AssociatedTestCase withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 用例ID
     * @return caseId
     */
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public AssociatedTestCase withCaseNum(String caseNum) {
        this.caseNum = caseNum;
        return this;
    }

    /**
     * 用例编号
     * @return caseNum
     */
    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public AssociatedTestCase withCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }

    /**
     * 用例名称
     * @return caseName
     */
    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public AssociatedTestCase withCaseLevel(String caseLevel) {
        this.caseLevel = caseLevel;
        return this;
    }

    /**
     * 用例等级
     * @return caseLevel
     */
    public String getCaseLevel() {
        return caseLevel;
    }

    public void setCaseLevel(String caseLevel) {
        this.caseLevel = caseLevel;
    }

    public AssociatedTestCase withStatus(StatusVo status) {
        this.status = status;
        return this;
    }

    public AssociatedTestCase withStatus(Consumer<StatusVo> statusSetter) {
        if (this.status == null) {
            this.status = new StatusVo();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusVo getStatus() {
        return status;
    }

    public void setStatus(StatusVo status) {
        this.status = status;
    }

    public AssociatedTestCase withCreator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }

    public AssociatedTestCase withCreator(Consumer<SimpleUser> creatorSetter) {
        if (this.creator == null) {
            this.creator = new SimpleUser();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public SimpleUser getCreator() {
        return creator;
    }

    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    public AssociatedTestCase withOwner(SimpleUser owner) {
        this.owner = owner;
        return this;
    }

    public AssociatedTestCase withOwner(Consumer<SimpleUser> ownerSetter) {
        if (this.owner == null) {
            this.owner = new SimpleUser();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public SimpleUser getOwner() {
        return owner;
    }

    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    public AssociatedTestCase withProject(SimpleProject project) {
        this.project = project;
        return this;
    }

    public AssociatedTestCase withProject(Consumer<SimpleProject> projectSetter) {
        if (this.project == null) {
            this.project = new SimpleProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public SimpleProject getProject() {
        return project;
    }

    public void setProject(SimpleProject project) {
        this.project = project;
    }

    public AssociatedTestCase withIsBaseLine(Integer isBaseLine) {
        this.isBaseLine = isBaseLine;
        return this;
    }

    /**
     * 是否基线
     * @return isBaseLine
     */
    public Integer getIsBaseLine() {
        return isBaseLine;
    }

    public void setIsBaseLine(Integer isBaseLine) {
        this.isBaseLine = isBaseLine;
    }

    public AssociatedTestCase withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 用例类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AssociatedTestCase withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociatedTestCase that = (AssociatedTestCase) obj;
        return Objects.equals(this.caseId, that.caseId) && Objects.equals(this.caseNum, that.caseNum)
            && Objects.equals(this.caseName, that.caseName) && Objects.equals(this.caseLevel, that.caseLevel)
            && Objects.equals(this.status, that.status) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.project, that.project)
            && Objects.equals(this.isBaseLine, that.isBaseLine) && Objects.equals(this.type, that.type)
            && Objects.equals(this.createdTime, that.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(caseId, caseNum, caseName, caseLevel, status, creator, owner, project, isBaseLine, type, createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatedTestCase {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    caseNum: ").append(toIndentedString(caseNum)).append("\n");
        sb.append("    caseName: ").append(toIndentedString(caseName)).append("\n");
        sb.append("    caseLevel: ").append(toIndentedString(caseLevel)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    isBaseLine: ").append(toIndentedString(isBaseLine)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
