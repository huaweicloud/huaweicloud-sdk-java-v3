package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * COEntity
 */
public class COEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_change")

    private String afterChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_complete_time")

    private String reviewCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_phase_result")

    private String reviewPhaseResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_time")

    private String reviewTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_change")

    private String beforeChange;

    /**
     * 变更对象工作项类型，此处固定为CO。
     */
    public static final class CategoryEnum {

        /**
         * Enum CO for value: "CO"
         */
        public static final CategoryEnum CO = new CategoryEnum("CO");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("CO", CO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccb_info")

    private CcbEntity ccbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccbs")

    private List<UserEntity> ccbs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private String changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "co2review")

    private String co2review;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_number")

    private String issueNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_category")

    private String issueCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinions")

    private List<UserEntity> opinions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinion_comments")

    private List<ReviewOpinionEntity> opinionComments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_comments")

    private List<ReviewCommentEntity> reviewComments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_comments")

    private List<ReviewCommentEntity> approvalComments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private List<String> reviewer = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private List<String> approver = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public COEntity withAfterChange(String afterChange) {
        this.afterChange = afterChange;
        return this;
    }

    /**
     * 变更对象修改后内容。
     * @return afterChange
     */
    public String getAfterChange() {
        return afterChange;
    }

    public void setAfterChange(String afterChange) {
        this.afterChange = afterChange;
    }

    public COEntity withReviewCompleteTime(String reviewCompleteTime) {
        this.reviewCompleteTime = reviewCompleteTime;
        return this;
    }

    /**
     * 变更对象评审完成时间。
     * @return reviewCompleteTime
     */
    public String getReviewCompleteTime() {
        return reviewCompleteTime;
    }

    public void setReviewCompleteTime(String reviewCompleteTime) {
        this.reviewCompleteTime = reviewCompleteTime;
    }

    public COEntity withReviewPhaseResult(String reviewPhaseResult) {
        this.reviewPhaseResult = reviewPhaseResult;
        return this;
    }

    /**
     * 变更对象评审阶段结果。
     * @return reviewPhaseResult
     */
    public String getReviewPhaseResult() {
        return reviewPhaseResult;
    }

    public void setReviewPhaseResult(String reviewPhaseResult) {
        this.reviewPhaseResult = reviewPhaseResult;
    }

    public COEntity withReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
        return this;
    }

    /**
     * 变更对象评审时间。
     * @return reviewTime
     */
    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
    }

    public COEntity withBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange;
        return this;
    }

    /**
     * 变更对象工作项修改前内容。
     * @return beforeChange
     */
    public String getBeforeChange() {
        return beforeChange;
    }

    public void setBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange;
    }

    public COEntity withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 变更对象工作项类型，此处固定为CO。
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public COEntity withCcbInfo(CcbEntity ccbInfo) {
        this.ccbInfo = ccbInfo;
        return this;
    }

    public COEntity withCcbInfo(Consumer<CcbEntity> ccbInfoSetter) {
        if (this.ccbInfo == null) {
            this.ccbInfo = new CcbEntity();
            ccbInfoSetter.accept(this.ccbInfo);
        }

        return this;
    }

    /**
     * Get ccbInfo
     * @return ccbInfo
     */
    public CcbEntity getCcbInfo() {
        return ccbInfo;
    }

    public void setCcbInfo(CcbEntity ccbInfo) {
        this.ccbInfo = ccbInfo;
    }

    public COEntity withCcbs(List<UserEntity> ccbs) {
        this.ccbs = ccbs;
        return this;
    }

    public COEntity addCcbsItem(UserEntity ccbsItem) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        this.ccbs.add(ccbsItem);
        return this;
    }

    public COEntity withCcbs(Consumer<List<UserEntity>> ccbsSetter) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        ccbsSetter.accept(this.ccbs);
        return this;
    }

    /**
     * 变更对象决策人列表，列表中只有一个元素。
     * @return ccbs
     */
    public List<UserEntity> getCcbs() {
        return ccbs;
    }

    public void setCcbs(List<UserEntity> ccbs) {
        this.ccbs = ccbs;
    }

    public COEntity withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 变更类型。
     * @return changeType
     */
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public COEntity withCo2review(String co2review) {
        this.co2review = co2review;
        return this;
    }

    /**
     * 变更对象关联的评审单ID。
     * @return co2review
     */
    public String getCo2review() {
        return co2review;
    }

    public void setCo2review(String co2review) {
        this.co2review = co2review;
    }

    public COEntity withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 变更对象的创建人ID。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public COEntity withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 变更对象创建时间。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public COEntity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 变更对象描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public COEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 变更对象ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public COEntity withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 变更对象关联的工作项ID。
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public COEntity withIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
        return this;
    }

    /**
     * 变更对象关联的工作项编号。
     * @return issueNumber
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public COEntity withIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }

    /**
     * 变更对象关联的工作项类型。
     * @return issueCategory
     */
    public String getIssueCategory() {
        return issueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
    }

    public COEntity withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 变更对象最后修改人ID。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public COEntity withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 变更对象最后修改时间。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public COEntity withOpinions(List<UserEntity> opinions) {
        this.opinions = opinions;
        return this;
    }

    public COEntity addOpinionsItem(UserEntity opinionsItem) {
        if (this.opinions == null) {
            this.opinions = new ArrayList<>();
        }
        this.opinions.add(opinionsItem);
        return this;
    }

    public COEntity withOpinions(Consumer<List<UserEntity>> opinionsSetter) {
        if (this.opinions == null) {
            this.opinions = new ArrayList<>();
        }
        opinionsSetter.accept(this.opinions);
        return this;
    }

    /**
     * 变更对象评审专家Id列表（创建变更评审时使用）。
     * @return opinions
     */
    public List<UserEntity> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<UserEntity> opinions) {
        this.opinions = opinions;
    }

    public COEntity withOpinionComments(List<ReviewOpinionEntity> opinionComments) {
        this.opinionComments = opinionComments;
        return this;
    }

    public COEntity addOpinionCommentsItem(ReviewOpinionEntity opinionCommentsItem) {
        if (this.opinionComments == null) {
            this.opinionComments = new ArrayList<>();
        }
        this.opinionComments.add(opinionCommentsItem);
        return this;
    }

    public COEntity withOpinionComments(Consumer<List<ReviewOpinionEntity>> opinionCommentsSetter) {
        if (this.opinionComments == null) {
            this.opinionComments = new ArrayList<>();
        }
        opinionCommentsSetter.accept(this.opinionComments);
        return this;
    }

    /**
     * 变更对象评审意见。
     * @return opinionComments
     */
    public List<ReviewOpinionEntity> getOpinionComments() {
        return opinionComments;
    }

    public void setOpinionComments(List<ReviewOpinionEntity> opinionComments) {
        this.opinionComments = opinionComments;
    }

    public COEntity withReviewComments(List<ReviewCommentEntity> reviewComments) {
        this.reviewComments = reviewComments;
        return this;
    }

    public COEntity addReviewCommentsItem(ReviewCommentEntity reviewCommentsItem) {
        if (this.reviewComments == null) {
            this.reviewComments = new ArrayList<>();
        }
        this.reviewComments.add(reviewCommentsItem);
        return this;
    }

    public COEntity withReviewComments(Consumer<List<ReviewCommentEntity>> reviewCommentsSetter) {
        if (this.reviewComments == null) {
            this.reviewComments = new ArrayList<>();
        }
        reviewCommentsSetter.accept(this.reviewComments);
        return this;
    }

    /**
     * 变更对象评审意见（评审更新时使用）。
     * @return reviewComments
     */
    public List<ReviewCommentEntity> getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(List<ReviewCommentEntity> reviewComments) {
        this.reviewComments = reviewComments;
    }

    public COEntity withApprovalComments(List<ReviewCommentEntity> approvalComments) {
        this.approvalComments = approvalComments;
        return this;
    }

    public COEntity addApprovalCommentsItem(ReviewCommentEntity approvalCommentsItem) {
        if (this.approvalComments == null) {
            this.approvalComments = new ArrayList<>();
        }
        this.approvalComments.add(approvalCommentsItem);
        return this;
    }

    public COEntity withApprovalComments(Consumer<List<ReviewCommentEntity>> approvalCommentsSetter) {
        if (this.approvalComments == null) {
            this.approvalComments = new ArrayList<>();
        }
        approvalCommentsSetter.accept(this.approvalComments);
        return this;
    }

    /**
     * 变更对象决策意见（决策更新时使用）。
     * @return approvalComments
     */
    public List<ReviewCommentEntity> getApprovalComments() {
        return approvalComments;
    }

    public void setApprovalComments(List<ReviewCommentEntity> approvalComments) {
        this.approvalComments = approvalComments;
    }

    public COEntity withReviewer(List<String> reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    public COEntity addReviewerItem(String reviewerItem) {
        if (this.reviewer == null) {
            this.reviewer = new ArrayList<>();
        }
        this.reviewer.add(reviewerItem);
        return this;
    }

    public COEntity withReviewer(Consumer<List<String>> reviewerSetter) {
        if (this.reviewer == null) {
            this.reviewer = new ArrayList<>();
        }
        reviewerSetter.accept(this.reviewer);
        return this;
    }

    /**
     * 变更对象评审专家Id列表。
     * @return reviewer
     */
    public List<String> getReviewer() {
        return reviewer;
    }

    public void setReviewer(List<String> reviewer) {
        this.reviewer = reviewer;
    }

    public COEntity withApprover(List<String> approver) {
        this.approver = approver;
        return this;
    }

    public COEntity addApproverItem(String approverItem) {
        if (this.approver == null) {
            this.approver = new ArrayList<>();
        }
        this.approver.add(approverItem);
        return this;
    }

    public COEntity withApprover(Consumer<List<String>> approverSetter) {
        if (this.approver == null) {
            this.approver = new ArrayList<>();
        }
        approverSetter.accept(this.approver);
        return this;
    }

    /**
     * 变更对象决策人ID数组。
     * @return approver
     */
    public List<String> getApprover() {
        return approver;
    }

    public void setApprover(List<String> approver) {
        this.approver = approver;
    }

    public COEntity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 变更对象状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        COEntity that = (COEntity) obj;
        return Objects.equals(this.afterChange, that.afterChange)
            && Objects.equals(this.reviewCompleteTime, that.reviewCompleteTime)
            && Objects.equals(this.reviewPhaseResult, that.reviewPhaseResult)
            && Objects.equals(this.reviewTime, that.reviewTime) && Objects.equals(this.beforeChange, that.beforeChange)
            && Objects.equals(this.category, that.category) && Objects.equals(this.ccbInfo, that.ccbInfo)
            && Objects.equals(this.ccbs, that.ccbs) && Objects.equals(this.changeType, that.changeType)
            && Objects.equals(this.co2review, that.co2review) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdDate, that.createdDate) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.issueNumber, that.issueNumber)
            && Objects.equals(this.issueCategory, that.issueCategory)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.modifiedDate, that.modifiedDate)
            && Objects.equals(this.opinions, that.opinions)
            && Objects.equals(this.opinionComments, that.opinionComments)
            && Objects.equals(this.reviewComments, that.reviewComments)
            && Objects.equals(this.approvalComments, that.approvalComments)
            && Objects.equals(this.reviewer, that.reviewer) && Objects.equals(this.approver, that.approver)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(afterChange,
            reviewCompleteTime,
            reviewPhaseResult,
            reviewTime,
            beforeChange,
            category,
            ccbInfo,
            ccbs,
            changeType,
            co2review,
            createdBy,
            createdDate,
            description,
            id,
            issueId,
            issueNumber,
            issueCategory,
            modifiedBy,
            modifiedDate,
            opinions,
            opinionComments,
            reviewComments,
            approvalComments,
            reviewer,
            approver,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class COEntity {\n");
        sb.append("    afterChange: ").append(toIndentedString(afterChange)).append("\n");
        sb.append("    reviewCompleteTime: ").append(toIndentedString(reviewCompleteTime)).append("\n");
        sb.append("    reviewPhaseResult: ").append(toIndentedString(reviewPhaseResult)).append("\n");
        sb.append("    reviewTime: ").append(toIndentedString(reviewTime)).append("\n");
        sb.append("    beforeChange: ").append(toIndentedString(beforeChange)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    ccbInfo: ").append(toIndentedString(ccbInfo)).append("\n");
        sb.append("    ccbs: ").append(toIndentedString(ccbs)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    co2review: ").append(toIndentedString(co2review)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
        sb.append("    issueCategory: ").append(toIndentedString(issueCategory)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    opinions: ").append(toIndentedString(opinions)).append("\n");
        sb.append("    opinionComments: ").append(toIndentedString(opinionComments)).append("\n");
        sb.append("    reviewComments: ").append(toIndentedString(reviewComments)).append("\n");
        sb.append("    approvalComments: ").append(toIndentedString(approvalComments)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
