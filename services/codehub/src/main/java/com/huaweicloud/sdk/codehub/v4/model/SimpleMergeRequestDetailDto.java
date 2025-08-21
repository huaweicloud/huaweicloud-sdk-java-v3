package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimpleMergeRequestDetailDto
 */
public class SimpleMergeRequestDetailDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iid")

    private Integer iid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_mode")

    private String reviewMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserBasicDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_type")

    private String mergeRequestType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_result")

    private Boolean moderationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_time")

    private Long moderationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_status")

    private Integer moderationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_use_temp_branch")

    private Boolean isUseTempBranch;

    public SimpleMergeRequestDetailDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 合并请求id。 **取值范围：** 不涉及。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SimpleMergeRequestDetailDto withIid(Integer iid) {
        this.iid = iid;
        return this;
    }

    /**
     * **参数解释：** 合并请求iid。 **取值范围：** 不涉及。
     * @return iid
     */
    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public SimpleMergeRequestDetailDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 标题。 **取值范围：** 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SimpleMergeRequestDetailDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。 **取值范围：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SimpleMergeRequestDetailDto withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * **参数解释：** 源分支。 **取值范围：** 不涉及。
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public SimpleMergeRequestDetailDto withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 目标分支。 **取值范围：** 不涉及。
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public SimpleMergeRequestDetailDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 状态。 **取值范围：** 不涉及。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SimpleMergeRequestDetailDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SimpleMergeRequestDetailDto withReviewMode(String reviewMode) {
        this.reviewMode = reviewMode;
        return this;
    }

    /**
     * **参数解释：** 审核模式。 **取值范围：** 不涉及。
     * @return reviewMode
     */
    public String getReviewMode() {
        return reviewMode;
    }

    public void setReviewMode(String reviewMode) {
        this.reviewMode = reviewMode;
    }

    public SimpleMergeRequestDetailDto withAuthor(UserBasicDto author) {
        this.author = author;
        return this;
    }

    public SimpleMergeRequestDetailDto withAuthor(Consumer<UserBasicDto> authorSetter) {
        if (this.author == null) {
            this.author = new UserBasicDto();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public UserBasicDto getAuthor() {
        return author;
    }

    public void setAuthor(UserBasicDto author) {
        this.author = author;
    }

    public SimpleMergeRequestDetailDto withMergeRequestType(String mergeRequestType) {
        this.mergeRequestType = mergeRequestType;
        return this;
    }

    /**
     * **参数解释：** 合并请求类型。 **取值范围：** 不涉及。
     * @return mergeRequestType
     */
    public String getMergeRequestType() {
        return mergeRequestType;
    }

    public void setMergeRequestType(String mergeRequestType) {
        this.mergeRequestType = mergeRequestType;
    }

    public SimpleMergeRequestDetailDto withModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }

    /**
     * **参数解释：** 送审结果。 **取值范围：** - true，成功。 - false，失败
     * @return moderationResult
     */
    public Boolean getModerationResult() {
        return moderationResult;
    }

    public void setModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
    }

    public SimpleMergeRequestDetailDto withModerationTime(Long moderationTime) {
        this.moderationTime = moderationTime;
        return this;
    }

    /**
     * **参数解释：** 送审时间时间戳。 **取值范围：** 不涉及。
     * @return moderationTime
     */
    public Long getModerationTime() {
        return moderationTime;
    }

    public void setModerationTime(Long moderationTime) {
        this.moderationTime = moderationTime;
    }

    public SimpleMergeRequestDetailDto withModerationStatus(Integer moderationStatus) {
        this.moderationStatus = moderationStatus;
        return this;
    }

    /**
     * **参数解释：** 送审状态码。 **取值范围：** 不涉及。
     * @return moderationStatus
     */
    public Integer getModerationStatus() {
        return moderationStatus;
    }

    public void setModerationStatus(Integer moderationStatus) {
        this.moderationStatus = moderationStatus;
    }

    public SimpleMergeRequestDetailDto withIsUseTempBranch(Boolean isUseTempBranch) {
        this.isUseTempBranch = isUseTempBranch;
        return this;
    }

    /**
     * **参数解释：** 是否使用临时分支。 **取值范围：** - true，使用。 - false，不使用
     * @return isUseTempBranch
     */
    public Boolean getIsUseTempBranch() {
        return isUseTempBranch;
    }

    public void setIsUseTempBranch(Boolean isUseTempBranch) {
        this.isUseTempBranch = isUseTempBranch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleMergeRequestDetailDto that = (SimpleMergeRequestDetailDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.iid, that.iid)
            && Objects.equals(this.title, that.title) && Objects.equals(this.description, that.description)
            && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch) && Objects.equals(this.state, that.state)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.reviewMode, that.reviewMode)
            && Objects.equals(this.author, that.author) && Objects.equals(this.mergeRequestType, that.mergeRequestType)
            && Objects.equals(this.moderationResult, that.moderationResult)
            && Objects.equals(this.moderationTime, that.moderationTime)
            && Objects.equals(this.moderationStatus, that.moderationStatus)
            && Objects.equals(this.isUseTempBranch, that.isUseTempBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            iid,
            title,
            description,
            sourceBranch,
            targetBranch,
            state,
            createdAt,
            reviewMode,
            author,
            mergeRequestType,
            moderationResult,
            moderationTime,
            moderationStatus,
            isUseTempBranch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleMergeRequestDetailDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    reviewMode: ").append(toIndentedString(reviewMode)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    mergeRequestType: ").append(toIndentedString(mergeRequestType)).append("\n");
        sb.append("    moderationResult: ").append(toIndentedString(moderationResult)).append("\n");
        sb.append("    moderationTime: ").append(toIndentedString(moderationTime)).append("\n");
        sb.append("    moderationStatus: ").append(toIndentedString(moderationStatus)).append("\n");
        sb.append("    isUseTempBranch: ").append(toIndentedString(isUseTempBranch)).append("\n");
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
