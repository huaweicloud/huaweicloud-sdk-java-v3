package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProcessInstanceResponseResultOpinions
 */
public class ProcessInstanceResponseResultOpinions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rounds")

    private String rounds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinion")

    private String opinion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private ProcessInstanceResponseResultCreatedBy1 createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_category")

    private String issueCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curr_owner")

    private ProcessInstanceResponseResultCurrOwner currOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "co_id")

    private String coId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinion_issue_id")

    private String opinionIssueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinion_issue_category")

    private String opinionIssueCategory;

    public ProcessInstanceResponseResultOpinions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessInstanceResponseResultOpinions withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProcessInstanceResponseResultOpinions withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ProcessInstanceResponseResultOpinions withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProcessInstanceResponseResultOpinions withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ProcessInstanceResponseResultOpinions withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类型
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProcessInstanceResponseResultOpinions withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProcessInstanceResponseResultOpinions withRounds(String rounds) {
        this.rounds = rounds;
        return this;
    }

    /**
     * 范围
     * @return rounds
     */
    public String getRounds() {
        return rounds;
    }

    public void setRounds(String rounds) {
        this.rounds = rounds;
    }

    public ProcessInstanceResponseResultOpinions withOpinion(String opinion) {
        this.opinion = opinion;
        return this;
    }

    /**
     * 观察者
     * @return opinion
     */
    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public ProcessInstanceResponseResultOpinions withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProcessInstanceResponseResultOpinions withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 修改人
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ProcessInstanceResponseResultOpinions withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 修改时间
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ProcessInstanceResponseResultOpinions withCreatedBy(ProcessInstanceResponseResultCreatedBy1 createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProcessInstanceResponseResultOpinions withCreatedBy(
        Consumer<ProcessInstanceResponseResultCreatedBy1> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new ProcessInstanceResponseResultCreatedBy1();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public ProcessInstanceResponseResultCreatedBy1 getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(ProcessInstanceResponseResultCreatedBy1 createdBy) {
        this.createdBy = createdBy;
    }

    public ProcessInstanceResponseResultOpinions withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 创建时间
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public ProcessInstanceResponseResultOpinions withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ProcessInstanceResponseResultOpinions withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 项目ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ProcessInstanceResponseResultOpinions withIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }

    /**
     * 工作项类型
     * @return issueCategory
     */
    public String getIssueCategory() {
        return issueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
    }

    public ProcessInstanceResponseResultOpinions withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作项ID
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public ProcessInstanceResponseResultOpinions withCurrOwner(ProcessInstanceResponseResultCurrOwner currOwner) {
        this.currOwner = currOwner;
        return this;
    }

    public ProcessInstanceResponseResultOpinions withCurrOwner(
        Consumer<ProcessInstanceResponseResultCurrOwner> currOwnerSetter) {
        if (this.currOwner == null) {
            this.currOwner = new ProcessInstanceResponseResultCurrOwner();
            currOwnerSetter.accept(this.currOwner);
        }

        return this;
    }

    /**
     * Get currOwner
     * @return currOwner
     */
    public ProcessInstanceResponseResultCurrOwner getCurrOwner() {
        return currOwner;
    }

    public void setCurrOwner(ProcessInstanceResponseResultCurrOwner currOwner) {
        this.currOwner = currOwner;
    }

    public ProcessInstanceResponseResultOpinions withCoId(String coId) {
        this.coId = coId;
        return this;
    }

    /**
     * 变更对象id
     * @return coId
     */
    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId;
    }

    public ProcessInstanceResponseResultOpinions withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ProcessInstanceResponseResultOpinions withOpinionIssueId(String opinionIssueId) {
        this.opinionIssueId = opinionIssueId;
        return this;
    }

    /**
     * 评审工作项ID
     * @return opinionIssueId
     */
    public String getOpinionIssueId() {
        return opinionIssueId;
    }

    public void setOpinionIssueId(String opinionIssueId) {
        this.opinionIssueId = opinionIssueId;
    }

    public ProcessInstanceResponseResultOpinions withOpinionIssueCategory(String opinionIssueCategory) {
        this.opinionIssueCategory = opinionIssueCategory;
        return this;
    }

    /**
     * 评审工作项类型
     * @return opinionIssueCategory
     */
    public String getOpinionIssueCategory() {
        return opinionIssueCategory;
    }

    public void setOpinionIssueCategory(String opinionIssueCategory) {
        this.opinionIssueCategory = opinionIssueCategory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInstanceResponseResultOpinions that = (ProcessInstanceResponseResultOpinions) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.state, that.state) && Objects.equals(this.status, that.status)
            && Objects.equals(this.region, that.region) && Objects.equals(this.category, that.category)
            && Objects.equals(this.title, that.title) && Objects.equals(this.rounds, that.rounds)
            && Objects.equals(this.opinion, that.opinion) && Objects.equals(this.description, that.description)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.modifiedDate, that.modifiedDate)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.issueCategory, that.issueCategory) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.currOwner, that.currOwner) && Objects.equals(this.coId, that.coId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.opinionIssueId, that.opinionIssueId)
            && Objects.equals(this.opinionIssueCategory, that.opinionIssueCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            type,
            state,
            status,
            region,
            category,
            title,
            rounds,
            opinion,
            description,
            modifiedBy,
            modifiedDate,
            createdBy,
            createdDate,
            tenantId,
            domainId,
            issueCategory,
            issueId,
            currOwner,
            coId,
            userId,
            opinionIssueId,
            opinionIssueCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceResponseResultOpinions {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    rounds: ").append(toIndentedString(rounds)).append("\n");
        sb.append("    opinion: ").append(toIndentedString(opinion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    issueCategory: ").append(toIndentedString(issueCategory)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    currOwner: ").append(toIndentedString(currOwner)).append("\n");
        sb.append("    coId: ").append(toIndentedString(coId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    opinionIssueId: ").append(toIndentedString(opinionIssueId)).append("\n");
        sb.append("    opinionIssueCategory: ").append(toIndentedString(opinionIssueCategory)).append("\n");
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
