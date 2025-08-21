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
 * ImportMrParamsDto
 */
public class ImportMrParamsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iid")

    private Integer iid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_uniq_key")

    private String sourceUniqKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private Integer authorId;

    /**
     * 状态
     */
    public static final class StateEnum {

        /**
         * Enum OPENED for value: "opened"
         */
        public static final StateEnum OPENED = new StateEnum("opened");

        /**
         * Enum CLOSED for value: "closed"
         */
        public static final StateEnum CLOSED = new StateEnum("closed");

        /**
         * Enum MERGED for value: "merged"
         */
        public static final StateEnum MERGED = new StateEnum("merged");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("opened", OPENED);
            map.put("closed", CLOSED);
            map.put("merged", MERGED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

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
    @JsonProperty(value = "target_repository_id")

    private String targetRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Object labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_at")

    private String mergedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_at")

    private String closedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers")

    private List<ApproverParamDto> approvers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_refs")

    private List<DiffRefsParamDto> diffRefs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash")

    private Boolean squash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_source_branch")

    private Boolean removeSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_is_deleted")

    private Boolean branchIsDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fork")

    private Boolean fork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_source_from")

    private String importSourceFrom;

    public ImportMrParamsDto withIid(Integer iid) {
        this.iid = iid;
        return this;
    }

    /**
     * 合并请求iid
     * minimum: 1
     * maximum: 9223372036854775807
     * @return iid
     */
    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public ImportMrParamsDto withSourceUniqKey(String sourceUniqKey) {
        this.sourceUniqKey = sourceUniqKey;
        return this;
    }

    /**
     * 导入唯一标识
     * @return sourceUniqKey
     */
    public String getSourceUniqKey() {
        return sourceUniqKey;
    }

    public void setSourceUniqKey(String sourceUniqKey) {
        this.sourceUniqKey = sourceUniqKey;
    }

    public ImportMrParamsDto withAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * 作者id
     * minimum: 1
     * maximum: 9223372036854775807
     * @return authorId
     */
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public ImportMrParamsDto withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ImportMrParamsDto withTitle(String title) {
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

    public ImportMrParamsDto withDescription(String description) {
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

    public ImportMrParamsDto withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * 源分支
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public ImportMrParamsDto withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * 目标分支
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public ImportMrParamsDto withTargetRepositoryId(String targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
        return this;
    }

    /**
     * 目标仓库
     * @return targetRepositoryId
     */
    public String getTargetRepositoryId() {
        return targetRepositoryId;
    }

    public void setTargetRepositoryId(String targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
    }

    public ImportMrParamsDto withLabels(Object labels) {
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

    public ImportMrParamsDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ImportMrParamsDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ImportMrParamsDto withMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    /**
     * 合并时间
     * @return mergedAt
     */
    public String getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
    }

    public ImportMrParamsDto withClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * 关闭时间
     * @return closedAt
     */
    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public ImportMrParamsDto withApprovers(List<ApproverParamDto> approvers) {
        this.approvers = approvers;
        return this;
    }

    public ImportMrParamsDto addApproversItem(ApproverParamDto approversItem) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        this.approvers.add(approversItem);
        return this;
    }

    public ImportMrParamsDto withApprovers(Consumer<List<ApproverParamDto>> approversSetter) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        approversSetter.accept(this.approvers);
        return this;
    }

    /**
     * 审核人列表
     * @return approvers
     */
    public List<ApproverParamDto> getApprovers() {
        return approvers;
    }

    public void setApprovers(List<ApproverParamDto> approvers) {
        this.approvers = approvers;
    }

    public ImportMrParamsDto withDiffRefs(List<DiffRefsParamDto> diffRefs) {
        this.diffRefs = diffRefs;
        return this;
    }

    public ImportMrParamsDto addDiffRefsItem(DiffRefsParamDto diffRefsItem) {
        if (this.diffRefs == null) {
            this.diffRefs = new ArrayList<>();
        }
        this.diffRefs.add(diffRefsItem);
        return this;
    }

    public ImportMrParamsDto withDiffRefs(Consumer<List<DiffRefsParamDto>> diffRefsSetter) {
        if (this.diffRefs == null) {
            this.diffRefs = new ArrayList<>();
        }
        diffRefsSetter.accept(this.diffRefs);
        return this;
    }

    /**
     * 合并请求变更commit列表
     * @return diffRefs
     */
    public List<DiffRefsParamDto> getDiffRefs() {
        return diffRefs;
    }

    public void setDiffRefs(List<DiffRefsParamDto> diffRefs) {
        this.diffRefs = diffRefs;
    }

    public ImportMrParamsDto withSquash(Boolean squash) {
        this.squash = squash;
        return this;
    }

    /**
     * squash合并
     * @return squash
     */
    public Boolean getSquash() {
        return squash;
    }

    public void setSquash(Boolean squash) {
        this.squash = squash;
    }

    public ImportMrParamsDto withRemoveSourceBranch(Boolean removeSourceBranch) {
        this.removeSourceBranch = removeSourceBranch;
        return this;
    }

    /**
     * 合并mr后删除源分支
     * @return removeSourceBranch
     */
    public Boolean getRemoveSourceBranch() {
        return removeSourceBranch;
    }

    public void setRemoveSourceBranch(Boolean removeSourceBranch) {
        this.removeSourceBranch = removeSourceBranch;
    }

    public ImportMrParamsDto withBranchIsDeleted(Boolean branchIsDeleted) {
        this.branchIsDeleted = branchIsDeleted;
        return this;
    }

    /**
     * 源分支是否被删除
     * @return branchIsDeleted
     */
    public Boolean getBranchIsDeleted() {
        return branchIsDeleted;
    }

    public void setBranchIsDeleted(Boolean branchIsDeleted) {
        this.branchIsDeleted = branchIsDeleted;
    }

    public ImportMrParamsDto withFork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    /**
     * 源合并请求是否是fork合并请求
     * @return fork
     */
    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public ImportMrParamsDto withImportSourceFrom(String importSourceFrom) {
        this.importSourceFrom = importSourceFrom;
        return this;
    }

    /**
     * 导入来源
     * @return importSourceFrom
     */
    public String getImportSourceFrom() {
        return importSourceFrom;
    }

    public void setImportSourceFrom(String importSourceFrom) {
        this.importSourceFrom = importSourceFrom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportMrParamsDto that = (ImportMrParamsDto) obj;
        return Objects.equals(this.iid, that.iid) && Objects.equals(this.sourceUniqKey, that.sourceUniqKey)
            && Objects.equals(this.authorId, that.authorId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.title, that.title) && Objects.equals(this.description, that.description)
            && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.targetRepositoryId, that.targetRepositoryId)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.mergedAt, that.mergedAt)
            && Objects.equals(this.closedAt, that.closedAt) && Objects.equals(this.approvers, that.approvers)
            && Objects.equals(this.diffRefs, that.diffRefs) && Objects.equals(this.squash, that.squash)
            && Objects.equals(this.removeSourceBranch, that.removeSourceBranch)
            && Objects.equals(this.branchIsDeleted, that.branchIsDeleted) && Objects.equals(this.fork, that.fork)
            && Objects.equals(this.importSourceFrom, that.importSourceFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iid,
            sourceUniqKey,
            authorId,
            state,
            title,
            description,
            sourceBranch,
            targetBranch,
            targetRepositoryId,
            labels,
            createdAt,
            updatedAt,
            mergedAt,
            closedAt,
            approvers,
            diffRefs,
            squash,
            removeSourceBranch,
            branchIsDeleted,
            fork,
            importSourceFrom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportMrParamsDto {\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    sourceUniqKey: ").append(toIndentedString(sourceUniqKey)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    targetRepositoryId: ").append(toIndentedString(targetRepositoryId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
        sb.append("    diffRefs: ").append(toIndentedString(diffRefs)).append("\n");
        sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
        sb.append("    removeSourceBranch: ").append(toIndentedString(removeSourceBranch)).append("\n");
        sb.append("    branchIsDeleted: ").append(toIndentedString(branchIsDeleted)).append("\n");
        sb.append("    fork: ").append(toIndentedString(fork)).append("\n");
        sb.append("    importSourceFrom: ").append(toIndentedString(importSourceFrom)).append("\n");
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
