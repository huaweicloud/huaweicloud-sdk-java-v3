package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProjectMergeRequestSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_merge_by_self")

    private Boolean disableMergeBySelf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_approve_by_self")

    private Boolean disableApproveBySelf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_review_by_self")

    private Boolean disableReviewBySelf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_force_merge")

    private Boolean canForceMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_squash_merge")

    private Boolean disableSquashMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "must_relate_issue")

    private Boolean mustRelateIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_relate_issue_branches")

    private String needRelateIssueBranches;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_all_issues_check_passed")

    private Boolean needAllIssuesCheckPassed;

    /**
     * **参数解释：** 合入模式
     */
    public static final class ReviewModeEnum {

        /**
         * Enum APPROVAL for value: "approval"
         */
        public static final ReviewModeEnum APPROVAL = new ReviewModeEnum("approval");

        /**
         * Enum VOTE for value: "vote"
         */
        public static final ReviewModeEnum VOTE = new ReviewModeEnum("vote");

        private static final Map<String, ReviewModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReviewModeEnum> createStaticFields() {
            Map<String, ReviewModeEnum> map = new HashMap<>();
            map.put("approval", APPROVAL);
            map.put("vote", VOTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReviewModeEnum(String value) {
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
        public static ReviewModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReviewModeEnum(value));
        }

        public static ReviewModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReviewModeEnum) {
                return this.value.equals(((ReviewModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_mode")

    private ReviewModeEnum reviewMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_notes_after_merged")

    private Boolean addNotesAfterMerged;

    /**
     * **参数解释：** merged_by：使用MR合入者生成Merge Commit created_by：使用MR创建者生成Merge Commit
     */
    public static final class MergedCommitAuthorEnum {

        /**
         * Enum MERGED_BY for value: "merged_by"
         */
        public static final MergedCommitAuthorEnum MERGED_BY = new MergedCommitAuthorEnum("merged_by");

        /**
         * Enum CREATED_BY for value: "created_by"
         */
        public static final MergedCommitAuthorEnum CREATED_BY = new MergedCommitAuthorEnum("created_by");

        private static final Map<String, MergedCommitAuthorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MergedCommitAuthorEnum> createStaticFields() {
            Map<String, MergedCommitAuthorEnum> map = new HashMap<>();
            map.put("merged_by", MERGED_BY);
            map.put("created_by", CREATED_BY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MergedCommitAuthorEnum(String value) {
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
        public static MergedCommitAuthorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MergedCommitAuthorEnum(value));
        }

        public static MergedCommitAuthorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MergedCommitAuthorEnum) {
                return this.value.equals(((MergedCommitAuthorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_commit_author")

    private MergedCommitAuthorEnum mergedCommitAuthor;

    /**
     * **参数解释：** 是否将星级评价作为合入门禁-参与星级评价角色。 29：勾选开发者 30：勾选开发者，Committer 35：勾选Committer 40：都不勾选
     */
    public static final class EvaluationRoleEnum {

        /**
         * Enum NUMBER_29 for value: 29
         */
        public static final EvaluationRoleEnum NUMBER_29 = new EvaluationRoleEnum(29);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final EvaluationRoleEnum NUMBER_30 = new EvaluationRoleEnum(30);

        /**
         * Enum NUMBER_35 for value: 35
         */
        public static final EvaluationRoleEnum NUMBER_35 = new EvaluationRoleEnum(35);

        /**
         * Enum NUMBER_40 for value: 40
         */
        public static final EvaluationRoleEnum NUMBER_40 = new EvaluationRoleEnum(40);

        private static final Map<Integer, EvaluationRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, EvaluationRoleEnum> createStaticFields() {
            Map<Integer, EvaluationRoleEnum> map = new HashMap<>();
            map.put(29, NUMBER_29);
            map.put(30, NUMBER_30);
            map.put(35, NUMBER_35);
            map.put(40, NUMBER_40);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        EvaluationRoleEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EvaluationRoleEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EvaluationRoleEnum(value));
        }

        public static EvaluationRoleEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EvaluationRoleEnum) {
                return this.value.equals(((EvaluationRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_role")

    private EvaluationRoleEnum evaluationRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_merge_gate")

    private Boolean evaluationMergeGate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mark_auto_merged_mr_as_closed")

    private Boolean markAutoMergedMrAsClosed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_source_branch_when_merged")

    private Boolean deleteSourceBranchWhenMerged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_squash_merge")

    private Boolean autoSquashMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash_merge_with_no_merge_commit")

    private Boolean squashMergeWithNoMergeCommit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_allow_one_issue_check_passed")

    private Boolean onlyAllowOneIssueCheckPassed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_custom_evaluation")

    private Boolean enableCustomEvaluation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_types")

    private List<EvaluationTypeDto> evaluationTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_reopen")

    private Boolean canReopen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_allow_merge_if_all_discussions_are_resolved")

    private Boolean onlyAllowMergeIfAllDiscussionsAreResolved;

    /**
     * **参数解释：** 合并模式。 merge：通过 Merge Commit 合并 rebase_merge：通过 Merge Commit 合并(记录半线性历史) ff：Fast-forward 合并
     */
    public static final class MergeMethodEnum {

        /**
         * Enum MERGE for value: "merge"
         */
        public static final MergeMethodEnum MERGE = new MergeMethodEnum("merge");

        /**
         * Enum REBASE_MERGE for value: "rebase_merge"
         */
        public static final MergeMethodEnum REBASE_MERGE = new MergeMethodEnum("rebase_merge");

        /**
         * Enum FF for value: "ff"
         */
        public static final MergeMethodEnum FF = new MergeMethodEnum("ff");

        private static final Map<String, MergeMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MergeMethodEnum> createStaticFields() {
            Map<String, MergeMethodEnum> map = new HashMap<>();
            map.put("merge", MERGE);
            map.put("rebase_merge", REBASE_MERGE);
            map.put("ff", FF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MergeMethodEnum(String value) {
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
        public static MergeMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MergeMethodEnum(value));
        }

        public static MergeMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MergeMethodEnum) {
                return this.value.equals(((MergeMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_method")

    private MergeMethodEnum mergeMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_allow_merge_if_vote_bigger_than")

    private Integer onlyAllowMergeIfVoteBiggerThan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_assignee_can_merge")

    private Boolean onlyAssigneeCanMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ShowProjectMergeRequestSettingResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 主键id
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowProjectMergeRequestSettingResponse withDisableMergeBySelf(Boolean disableMergeBySelf) {
        this.disableMergeBySelf = disableMergeBySelf;
        return this;
    }

    /**
     * **参数解释：** 禁止合入自己创建的合并请求
     * @return disableMergeBySelf
     */
    public Boolean getDisableMergeBySelf() {
        return disableMergeBySelf;
    }

    public void setDisableMergeBySelf(Boolean disableMergeBySelf) {
        this.disableMergeBySelf = disableMergeBySelf;
    }

    public ShowProjectMergeRequestSettingResponse withDisableApproveBySelf(Boolean disableApproveBySelf) {
        this.disableApproveBySelf = disableApproveBySelf;
        return this;
    }

    /**
     * **参数解释：** 禁止审核自己创建的合并请求
     * @return disableApproveBySelf
     */
    public Boolean getDisableApproveBySelf() {
        return disableApproveBySelf;
    }

    public void setDisableApproveBySelf(Boolean disableApproveBySelf) {
        this.disableApproveBySelf = disableApproveBySelf;
    }

    public ShowProjectMergeRequestSettingResponse withDisableReviewBySelf(Boolean disableReviewBySelf) {
        this.disableReviewBySelf = disableReviewBySelf;
        return this;
    }

    /**
     * **参数解释：** 禁止检视自己创建的合并请求
     * @return disableReviewBySelf
     */
    public Boolean getDisableReviewBySelf() {
        return disableReviewBySelf;
    }

    public void setDisableReviewBySelf(Boolean disableReviewBySelf) {
        this.disableReviewBySelf = disableReviewBySelf;
    }

    public ShowProjectMergeRequestSettingResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowProjectMergeRequestSettingResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowProjectMergeRequestSettingResponse withCanForceMerge(Boolean canForceMerge) {
        this.canForceMerge = canForceMerge;
        return this;
    }

    /**
     * **参数解释：** 允许仓库管理员及项目经理强制合入
     * @return canForceMerge
     */
    public Boolean getCanForceMerge() {
        return canForceMerge;
    }

    public void setCanForceMerge(Boolean canForceMerge) {
        this.canForceMerge = canForceMerge;
    }

    public ShowProjectMergeRequestSettingResponse withDisableSquashMerge(Boolean disableSquashMerge) {
        this.disableSquashMerge = disableSquashMerge;
        return this;
    }

    /**
     * **参数解释：** 禁止Squash合并（合入MR时禁止Squash合并）
     * @return disableSquashMerge
     */
    public Boolean getDisableSquashMerge() {
        return disableSquashMerge;
    }

    public void setDisableSquashMerge(Boolean disableSquashMerge) {
        this.disableSquashMerge = disableSquashMerge;
    }

    public ShowProjectMergeRequestSettingResponse withMustRelateIssue(Boolean mustRelateIssue) {
        this.mustRelateIssue = mustRelateIssue;
        return this;
    }

    /**
     * **参数解释：** 必须与CodeArts Req关联
     * @return mustRelateIssue
     */
    public Boolean getMustRelateIssue() {
        return mustRelateIssue;
    }

    public void setMustRelateIssue(Boolean mustRelateIssue) {
        this.mustRelateIssue = mustRelateIssue;
    }

    public ShowProjectMergeRequestSettingResponse withNeedRelateIssueBranches(String needRelateIssueBranches) {
        this.needRelateIssueBranches = needRelateIssueBranches;
        return this;
    }

    /**
     * **参数解释：** 必须与CodeArts Req关联-选择目标分支配置合并请求策略(分支以逗号分支的字符串)
     * @return needRelateIssueBranches
     */
    public String getNeedRelateIssueBranches() {
        return needRelateIssueBranches;
    }

    public void setNeedRelateIssueBranches(String needRelateIssueBranches) {
        this.needRelateIssueBranches = needRelateIssueBranches;
    }

    public ShowProjectMergeRequestSettingResponse withNeedAllIssuesCheckPassed(Boolean needAllIssuesCheckPassed) {
        this.needAllIssuesCheckPassed = needAllIssuesCheckPassed;
        return this;
    }

    /**
     * **参数解释：** 必须与CodeArts Req关联-所有E2E单号校验必须通过
     * @return needAllIssuesCheckPassed
     */
    public Boolean getNeedAllIssuesCheckPassed() {
        return needAllIssuesCheckPassed;
    }

    public void setNeedAllIssuesCheckPassed(Boolean needAllIssuesCheckPassed) {
        this.needAllIssuesCheckPassed = needAllIssuesCheckPassed;
    }

    public ShowProjectMergeRequestSettingResponse withReviewMode(ReviewModeEnum reviewMode) {
        this.reviewMode = reviewMode;
        return this;
    }

    /**
     * **参数解释：** 合入模式
     * @return reviewMode
     */
    public ReviewModeEnum getReviewMode() {
        return reviewMode;
    }

    public void setReviewMode(ReviewModeEnum reviewMode) {
        this.reviewMode = reviewMode;
    }

    public ShowProjectMergeRequestSettingResponse withAddNotesAfterMerged(Boolean addNotesAfterMerged) {
        this.addNotesAfterMerged = addNotesAfterMerged;
        return this;
    }

    /**
     * **参数解释：** 允许合并请求合并或关闭后继续做代码检视和评论
     * @return addNotesAfterMerged
     */
    public Boolean getAddNotesAfterMerged() {
        return addNotesAfterMerged;
    }

    public void setAddNotesAfterMerged(Boolean addNotesAfterMerged) {
        this.addNotesAfterMerged = addNotesAfterMerged;
    }

    public ShowProjectMergeRequestSettingResponse withMergedCommitAuthor(MergedCommitAuthorEnum mergedCommitAuthor) {
        this.mergedCommitAuthor = mergedCommitAuthor;
        return this;
    }

    /**
     * **参数解释：** merged_by：使用MR合入者生成Merge Commit created_by：使用MR创建者生成Merge Commit
     * @return mergedCommitAuthor
     */
    public MergedCommitAuthorEnum getMergedCommitAuthor() {
        return mergedCommitAuthor;
    }

    public void setMergedCommitAuthor(MergedCommitAuthorEnum mergedCommitAuthor) {
        this.mergedCommitAuthor = mergedCommitAuthor;
    }

    public ShowProjectMergeRequestSettingResponse withEvaluationRole(EvaluationRoleEnum evaluationRole) {
        this.evaluationRole = evaluationRole;
        return this;
    }

    /**
     * **参数解释：** 是否将星级评价作为合入门禁-参与星级评价角色。 29：勾选开发者 30：勾选开发者，Committer 35：勾选Committer 40：都不勾选
     * @return evaluationRole
     */
    public EvaluationRoleEnum getEvaluationRole() {
        return evaluationRole;
    }

    public void setEvaluationRole(EvaluationRoleEnum evaluationRole) {
        this.evaluationRole = evaluationRole;
    }

    public ShowProjectMergeRequestSettingResponse withEvaluationMergeGate(Boolean evaluationMergeGate) {
        this.evaluationMergeGate = evaluationMergeGate;
        return this;
    }

    /**
     * **参数解释：** 是否将星级评价作为合入门禁
     * @return evaluationMergeGate
     */
    public Boolean getEvaluationMergeGate() {
        return evaluationMergeGate;
    }

    public void setEvaluationMergeGate(Boolean evaluationMergeGate) {
        this.evaluationMergeGate = evaluationMergeGate;
    }

    public ShowProjectMergeRequestSettingResponse withMarkAutoMergedMrAsClosed(Boolean markAutoMergedMrAsClosed) {
        this.markAutoMergedMrAsClosed = markAutoMergedMrAsClosed;
        return this;
    }

    /**
     * **参数解释：** 是否将自动合并的MR状态标记为关闭状态
     * @return markAutoMergedMrAsClosed
     */
    public Boolean getMarkAutoMergedMrAsClosed() {
        return markAutoMergedMrAsClosed;
    }

    public void setMarkAutoMergedMrAsClosed(Boolean markAutoMergedMrAsClosed) {
        this.markAutoMergedMrAsClosed = markAutoMergedMrAsClosed;
    }

    public ShowProjectMergeRequestSettingResponse withDeleteSourceBranchWhenMerged(
        Boolean deleteSourceBranchWhenMerged) {
        this.deleteSourceBranchWhenMerged = deleteSourceBranchWhenMerged;
        return this;
    }

    /**
     * **参数解释：** 新建合并请求，默认开启合并后删除源分支
     * @return deleteSourceBranchWhenMerged
     */
    public Boolean getDeleteSourceBranchWhenMerged() {
        return deleteSourceBranchWhenMerged;
    }

    public void setDeleteSourceBranchWhenMerged(Boolean deleteSourceBranchWhenMerged) {
        this.deleteSourceBranchWhenMerged = deleteSourceBranchWhenMerged;
    }

    public ShowProjectMergeRequestSettingResponse withAutoSquashMerge(Boolean autoSquashMerge) {
        this.autoSquashMerge = autoSquashMerge;
        return this;
    }

    /**
     * **参数解释：** 新建合并请求，默认开启Squash合并
     * @return autoSquashMerge
     */
    public Boolean getAutoSquashMerge() {
        return autoSquashMerge;
    }

    public void setAutoSquashMerge(Boolean autoSquashMerge) {
        this.autoSquashMerge = autoSquashMerge;
    }

    public ShowProjectMergeRequestSettingResponse withSquashMergeWithNoMergeCommit(
        Boolean squashMergeWithNoMergeCommit) {
        this.squashMergeWithNoMergeCommit = squashMergeWithNoMergeCommit;
        return this;
    }

    /**
     * **参数解释：** Squash合并不产生Merge节点
     * @return squashMergeWithNoMergeCommit
     */
    public Boolean getSquashMergeWithNoMergeCommit() {
        return squashMergeWithNoMergeCommit;
    }

    public void setSquashMergeWithNoMergeCommit(Boolean squashMergeWithNoMergeCommit) {
        this.squashMergeWithNoMergeCommit = squashMergeWithNoMergeCommit;
    }

    public ShowProjectMergeRequestSettingResponse withOnlyAllowOneIssueCheckPassed(
        Boolean onlyAllowOneIssueCheckPassed) {
        this.onlyAllowOneIssueCheckPassed = onlyAllowOneIssueCheckPassed;
        return this;
    }

    /**
     * **参数解释：** 只能关联一个单号
     * @return onlyAllowOneIssueCheckPassed
     */
    public Boolean getOnlyAllowOneIssueCheckPassed() {
        return onlyAllowOneIssueCheckPassed;
    }

    public void setOnlyAllowOneIssueCheckPassed(Boolean onlyAllowOneIssueCheckPassed) {
        this.onlyAllowOneIssueCheckPassed = onlyAllowOneIssueCheckPassed;
    }

    public ShowProjectMergeRequestSettingResponse withEnableCustomEvaluation(Boolean enableCustomEvaluation) {
        this.enableCustomEvaluation = enableCustomEvaluation;
        return this;
    }

    /**
     * **参数解释：** 启用MR自定义评价维度分类（MR评价设置）
     * @return enableCustomEvaluation
     */
    public Boolean getEnableCustomEvaluation() {
        return enableCustomEvaluation;
    }

    public void setEnableCustomEvaluation(Boolean enableCustomEvaluation) {
        this.enableCustomEvaluation = enableCustomEvaluation;
    }

    public ShowProjectMergeRequestSettingResponse withEvaluationTypes(List<EvaluationTypeDto> evaluationTypes) {
        this.evaluationTypes = evaluationTypes;
        return this;
    }

    public ShowProjectMergeRequestSettingResponse addEvaluationTypesItem(EvaluationTypeDto evaluationTypesItem) {
        if (this.evaluationTypes == null) {
            this.evaluationTypes = new ArrayList<>();
        }
        this.evaluationTypes.add(evaluationTypesItem);
        return this;
    }

    public ShowProjectMergeRequestSettingResponse withEvaluationTypes(
        Consumer<List<EvaluationTypeDto>> evaluationTypesSetter) {
        if (this.evaluationTypes == null) {
            this.evaluationTypes = new ArrayList<>();
        }
        evaluationTypesSetter.accept(this.evaluationTypes);
        return this;
    }

    /**
     * **参数解释：** 评价维度（MR评价设置）
     * @return evaluationTypes
     */
    public List<EvaluationTypeDto> getEvaluationTypes() {
        return evaluationTypes;
    }

    public void setEvaluationTypes(List<EvaluationTypeDto> evaluationTypes) {
        this.evaluationTypes = evaluationTypes;
    }

    public ShowProjectMergeRequestSettingResponse withCanReopen(Boolean canReopen) {
        this.canReopen = canReopen;
        return this;
    }

    /**
     * **参数解释：** 不能重新打开一个已经关闭的合并请求
     * @return canReopen
     */
    public Boolean getCanReopen() {
        return canReopen;
    }

    public void setCanReopen(Boolean canReopen) {
        this.canReopen = canReopen;
    }

    public ShowProjectMergeRequestSettingResponse withOnlyAllowMergeIfAllDiscussionsAreResolved(
        Boolean onlyAllowMergeIfAllDiscussionsAreResolved) {
        this.onlyAllowMergeIfAllDiscussionsAreResolved = onlyAllowMergeIfAllDiscussionsAreResolved;
        return this;
    }

    /**
     * **参数解释：** 评审问题全部解决才能合入
     * @return onlyAllowMergeIfAllDiscussionsAreResolved
     */
    public Boolean getOnlyAllowMergeIfAllDiscussionsAreResolved() {
        return onlyAllowMergeIfAllDiscussionsAreResolved;
    }

    public void setOnlyAllowMergeIfAllDiscussionsAreResolved(Boolean onlyAllowMergeIfAllDiscussionsAreResolved) {
        this.onlyAllowMergeIfAllDiscussionsAreResolved = onlyAllowMergeIfAllDiscussionsAreResolved;
    }

    public ShowProjectMergeRequestSettingResponse withMergeMethod(MergeMethodEnum mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }

    /**
     * **参数解释：** 合并模式。 merge：通过 Merge Commit 合并 rebase_merge：通过 Merge Commit 合并(记录半线性历史) ff：Fast-forward 合并
     * @return mergeMethod
     */
    public MergeMethodEnum getMergeMethod() {
        return mergeMethod;
    }

    public void setMergeMethod(MergeMethodEnum mergeMethod) {
        this.mergeMethod = mergeMethod;
    }

    public ShowProjectMergeRequestSettingResponse withOnlyAllowMergeIfVoteBiggerThan(
        Integer onlyAllowMergeIfVoteBiggerThan) {
        this.onlyAllowMergeIfVoteBiggerThan = onlyAllowMergeIfVoteBiggerThan;
        return this;
    }

    /**
     * **参数解释：** 打分模式最低合入分数。
     * minimum: 0
     * maximum: 5
     * @return onlyAllowMergeIfVoteBiggerThan
     */
    public Integer getOnlyAllowMergeIfVoteBiggerThan() {
        return onlyAllowMergeIfVoteBiggerThan;
    }

    public void setOnlyAllowMergeIfVoteBiggerThan(Integer onlyAllowMergeIfVoteBiggerThan) {
        this.onlyAllowMergeIfVoteBiggerThan = onlyAllowMergeIfVoteBiggerThan;
    }

    public ShowProjectMergeRequestSettingResponse withOnlyAssigneeCanMerge(Boolean onlyAssigneeCanMerge) {
        this.onlyAssigneeCanMerge = onlyAssigneeCanMerge;
        return this;
    }

    /**
     * **参数解释：** 仅合并人和合并合并请求。
     * @return onlyAssigneeCanMerge
     */
    public Boolean getOnlyAssigneeCanMerge() {
        return onlyAssigneeCanMerge;
    }

    public void setOnlyAssigneeCanMerge(Boolean onlyAssigneeCanMerge) {
        this.onlyAssigneeCanMerge = onlyAssigneeCanMerge;
    }

    public ShowProjectMergeRequestSettingResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectMergeRequestSettingResponse that = (ShowProjectMergeRequestSettingResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.disableMergeBySelf, that.disableMergeBySelf)
            && Objects.equals(this.disableApproveBySelf, that.disableApproveBySelf)
            && Objects.equals(this.disableReviewBySelf, that.disableReviewBySelf)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.canForceMerge, that.canForceMerge)
            && Objects.equals(this.disableSquashMerge, that.disableSquashMerge)
            && Objects.equals(this.mustRelateIssue, that.mustRelateIssue)
            && Objects.equals(this.needRelateIssueBranches, that.needRelateIssueBranches)
            && Objects.equals(this.needAllIssuesCheckPassed, that.needAllIssuesCheckPassed)
            && Objects.equals(this.reviewMode, that.reviewMode)
            && Objects.equals(this.addNotesAfterMerged, that.addNotesAfterMerged)
            && Objects.equals(this.mergedCommitAuthor, that.mergedCommitAuthor)
            && Objects.equals(this.evaluationRole, that.evaluationRole)
            && Objects.equals(this.evaluationMergeGate, that.evaluationMergeGate)
            && Objects.equals(this.markAutoMergedMrAsClosed, that.markAutoMergedMrAsClosed)
            && Objects.equals(this.deleteSourceBranchWhenMerged, that.deleteSourceBranchWhenMerged)
            && Objects.equals(this.autoSquashMerge, that.autoSquashMerge)
            && Objects.equals(this.squashMergeWithNoMergeCommit, that.squashMergeWithNoMergeCommit)
            && Objects.equals(this.onlyAllowOneIssueCheckPassed, that.onlyAllowOneIssueCheckPassed)
            && Objects.equals(this.enableCustomEvaluation, that.enableCustomEvaluation)
            && Objects.equals(this.evaluationTypes, that.evaluationTypes)
            && Objects.equals(this.canReopen, that.canReopen)
            && Objects.equals(this.onlyAllowMergeIfAllDiscussionsAreResolved,
                that.onlyAllowMergeIfAllDiscussionsAreResolved)
            && Objects.equals(this.mergeMethod, that.mergeMethod)
            && Objects.equals(this.onlyAllowMergeIfVoteBiggerThan, that.onlyAllowMergeIfVoteBiggerThan)
            && Objects.equals(this.onlyAssigneeCanMerge, that.onlyAssigneeCanMerge)
            && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            disableMergeBySelf,
            disableApproveBySelf,
            disableReviewBySelf,
            createdAt,
            updatedAt,
            canForceMerge,
            disableSquashMerge,
            mustRelateIssue,
            needRelateIssueBranches,
            needAllIssuesCheckPassed,
            reviewMode,
            addNotesAfterMerged,
            mergedCommitAuthor,
            evaluationRole,
            evaluationMergeGate,
            markAutoMergedMrAsClosed,
            deleteSourceBranchWhenMerged,
            autoSquashMerge,
            squashMergeWithNoMergeCommit,
            onlyAllowOneIssueCheckPassed,
            enableCustomEvaluation,
            evaluationTypes,
            canReopen,
            onlyAllowMergeIfAllDiscussionsAreResolved,
            mergeMethod,
            onlyAllowMergeIfVoteBiggerThan,
            onlyAssigneeCanMerge,
            projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectMergeRequestSettingResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    disableMergeBySelf: ").append(toIndentedString(disableMergeBySelf)).append("\n");
        sb.append("    disableApproveBySelf: ").append(toIndentedString(disableApproveBySelf)).append("\n");
        sb.append("    disableReviewBySelf: ").append(toIndentedString(disableReviewBySelf)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    canForceMerge: ").append(toIndentedString(canForceMerge)).append("\n");
        sb.append("    disableSquashMerge: ").append(toIndentedString(disableSquashMerge)).append("\n");
        sb.append("    mustRelateIssue: ").append(toIndentedString(mustRelateIssue)).append("\n");
        sb.append("    needRelateIssueBranches: ").append(toIndentedString(needRelateIssueBranches)).append("\n");
        sb.append("    needAllIssuesCheckPassed: ").append(toIndentedString(needAllIssuesCheckPassed)).append("\n");
        sb.append("    reviewMode: ").append(toIndentedString(reviewMode)).append("\n");
        sb.append("    addNotesAfterMerged: ").append(toIndentedString(addNotesAfterMerged)).append("\n");
        sb.append("    mergedCommitAuthor: ").append(toIndentedString(mergedCommitAuthor)).append("\n");
        sb.append("    evaluationRole: ").append(toIndentedString(evaluationRole)).append("\n");
        sb.append("    evaluationMergeGate: ").append(toIndentedString(evaluationMergeGate)).append("\n");
        sb.append("    markAutoMergedMrAsClosed: ").append(toIndentedString(markAutoMergedMrAsClosed)).append("\n");
        sb.append("    deleteSourceBranchWhenMerged: ")
            .append(toIndentedString(deleteSourceBranchWhenMerged))
            .append("\n");
        sb.append("    autoSquashMerge: ").append(toIndentedString(autoSquashMerge)).append("\n");
        sb.append("    squashMergeWithNoMergeCommit: ")
            .append(toIndentedString(squashMergeWithNoMergeCommit))
            .append("\n");
        sb.append("    onlyAllowOneIssueCheckPassed: ")
            .append(toIndentedString(onlyAllowOneIssueCheckPassed))
            .append("\n");
        sb.append("    enableCustomEvaluation: ").append(toIndentedString(enableCustomEvaluation)).append("\n");
        sb.append("    evaluationTypes: ").append(toIndentedString(evaluationTypes)).append("\n");
        sb.append("    canReopen: ").append(toIndentedString(canReopen)).append("\n");
        sb.append("    onlyAllowMergeIfAllDiscussionsAreResolved: ")
            .append(toIndentedString(onlyAllowMergeIfAllDiscussionsAreResolved))
            .append("\n");
        sb.append("    mergeMethod: ").append(toIndentedString(mergeMethod)).append("\n");
        sb.append("    onlyAllowMergeIfVoteBiggerThan: ")
            .append(toIndentedString(onlyAllowMergeIfVoteBiggerThan))
            .append("\n");
        sb.append("    onlyAssigneeCanMerge: ").append(toIndentedString(onlyAssigneeCanMerge)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
