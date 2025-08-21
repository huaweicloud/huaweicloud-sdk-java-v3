package com.huaweicloud.sdk.codehub.v4.model;

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
 * PutMergeRequestParamsDto
 */
public class PutMergeRequestParamsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    /**
     * 合并请求状态
     */
    public static final class StateEventEnum {

        /**
         * Enum REOPEN for value: "reopen"
         */
        public static final StateEventEnum REOPEN = new StateEventEnum("reopen");

        /**
         * Enum CLOSE for value: "close"
         */
        public static final StateEventEnum CLOSE = new StateEventEnum("close");

        private static final Map<String, StateEventEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEventEnum> createStaticFields() {
            Map<String, StateEventEnum> map = new HashMap<>();
            map.put("reopen", REOPEN);
            map.put("close", CLOSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEventEnum(String value) {
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
        public static StateEventEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEventEnum(value));
        }

        public static StateEventEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEventEnum) {
                return this.value.equals(((StateEventEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_event")

    private StateEventEnum stateEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_ids")

    private String assigneeIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_ids")

    private String reviewerIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "milestone_id")

    private Integer milestoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Object labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_remove_source_branch")

    private Boolean forceRemoveSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash")

    private Boolean squash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash_commit_message")

    private String squashCommitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_ids")

    private List<String> workItemIds = null;

    public PutMergeRequestParamsDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 合并请求标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PutMergeRequestParamsDto withStateEvent(StateEventEnum stateEvent) {
        this.stateEvent = stateEvent;
        return this;
    }

    /**
     * 合并请求状态
     * @return stateEvent
     */
    public StateEventEnum getStateEvent() {
        return stateEvent;
    }

    public void setStateEvent(StateEventEnum stateEvent) {
        this.stateEvent = stateEvent;
    }

    public PutMergeRequestParamsDto withAssigneeIds(String assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }

    /**
     * 合并人id列表
     * @return assigneeIds
     */
    public String getAssigneeIds() {
        return assigneeIds;
    }

    public void setAssigneeIds(String assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public PutMergeRequestParamsDto withReviewerIds(String reviewerIds) {
        this.reviewerIds = reviewerIds;
        return this;
    }

    /**
     * 评审人id列表
     * @return reviewerIds
     */
    public String getReviewerIds() {
        return reviewerIds;
    }

    public void setReviewerIds(String reviewerIds) {
        this.reviewerIds = reviewerIds;
    }

    public PutMergeRequestParamsDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 合并请求描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PutMergeRequestParamsDto withMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
        return this;
    }

    /**
     * 里程碑id
     * @return milestoneId
     */
    public Integer getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    public PutMergeRequestParamsDto withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public PutMergeRequestParamsDto withForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
        return this;
    }

    /**
     * 合入后删除源分支
     * @return forceRemoveSourceBranch
     */
    public Boolean getForceRemoveSourceBranch() {
        return forceRemoveSourceBranch;
    }

    public void setForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
    }

    public PutMergeRequestParamsDto withSquash(Boolean squash) {
        this.squash = squash;
        return this;
    }

    /**
     * squash合入
     * @return squash
     */
    public Boolean getSquash() {
        return squash;
    }

    public void setSquash(Boolean squash) {
        this.squash = squash;
    }

    public PutMergeRequestParamsDto withSquashCommitMessage(String squashCommitMessage) {
        this.squashCommitMessage = squashCommitMessage;
        return this;
    }

    /**
     * squash提交信息
     * @return squashCommitMessage
     */
    public String getSquashCommitMessage() {
        return squashCommitMessage;
    }

    public void setSquashCommitMessage(String squashCommitMessage) {
        this.squashCommitMessage = squashCommitMessage;
    }

    public PutMergeRequestParamsDto withWorkItemIds(List<String> workItemIds) {
        this.workItemIds = workItemIds;
        return this;
    }

    public PutMergeRequestParamsDto addWorkItemIdsItem(String workItemIdsItem) {
        if (this.workItemIds == null) {
            this.workItemIds = new ArrayList<>();
        }
        this.workItemIds.add(workItemIdsItem);
        return this;
    }

    public PutMergeRequestParamsDto withWorkItemIds(Consumer<List<String>> workItemIdsSetter) {
        if (this.workItemIds == null) {
            this.workItemIds = new ArrayList<>();
        }
        workItemIdsSetter.accept(this.workItemIds);
        return this;
    }

    /**
     * e2e单号
     * @return workItemIds
     */
    public List<String> getWorkItemIds() {
        return workItemIds;
    }

    public void setWorkItemIds(List<String> workItemIds) {
        this.workItemIds = workItemIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutMergeRequestParamsDto that = (PutMergeRequestParamsDto) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.stateEvent, that.stateEvent)
            && Objects.equals(this.assigneeIds, that.assigneeIds) && Objects.equals(this.reviewerIds, that.reviewerIds)
            && Objects.equals(this.description, that.description) && Objects.equals(this.milestoneId, that.milestoneId)
            && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.forceRemoveSourceBranch, that.forceRemoveSourceBranch)
            && Objects.equals(this.squash, that.squash)
            && Objects.equals(this.squashCommitMessage, that.squashCommitMessage)
            && Objects.equals(this.workItemIds, that.workItemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            stateEvent,
            assigneeIds,
            reviewerIds,
            description,
            milestoneId,
            labels,
            forceRemoveSourceBranch,
            squash,
            squashCommitMessage,
            workItemIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutMergeRequestParamsDto {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    stateEvent: ").append(toIndentedString(stateEvent)).append("\n");
        sb.append("    assigneeIds: ").append(toIndentedString(assigneeIds)).append("\n");
        sb.append("    reviewerIds: ").append(toIndentedString(reviewerIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    forceRemoveSourceBranch: ").append(toIndentedString(forceRemoveSourceBranch)).append("\n");
        sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
        sb.append("    squashCommitMessage: ").append(toIndentedString(squashCommitMessage)).append("\n");
        sb.append("    workItemIds: ").append(toIndentedString(workItemIds)).append("\n");
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
