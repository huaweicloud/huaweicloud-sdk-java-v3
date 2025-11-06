package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListRepositoryReviewsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    /**
     * **参数解释：** 意见类型。 **取值范围：** - Commit，提交。 - MergeRequest，合并请求。  
     */
    public static final class NoteableTypeEnum {

        /**
         * Enum COMMIT for value: "Commit"
         */
        public static final NoteableTypeEnum COMMIT = new NoteableTypeEnum("Commit");

        /**
         * Enum MERGEREQUEST for value: "MergeRequest"
         */
        public static final NoteableTypeEnum MERGEREQUEST = new NoteableTypeEnum("MergeRequest");

        private static final Map<String, NoteableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NoteableTypeEnum> createStaticFields() {
            Map<String, NoteableTypeEnum> map = new HashMap<>();
            map.put("Commit", COMMIT);
            map.put("MergeRequest", MERGEREQUEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NoteableTypeEnum(String value) {
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
        public static NoteableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NoteableTypeEnum(value));
        }

        public static NoteableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NoteableTypeEnum) {
                return this.value.equals(((NoteableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "noteable_type")

    private NoteableTypeEnum noteableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private OffsetDateTime startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private OffsetDateTime endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_count")

    private Boolean onlyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_categories")

    private String reviewCategories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_modules")

    private String reviewModules;

    /**
     * **参数解释：** 检视意见严重程度
     */
    public static final class SeverityEnum {

        /**
         * Enum SUGGESTION for value: "suggestion"
         */
        public static final SeverityEnum SUGGESTION = new SeverityEnum("suggestion");

        /**
         * Enum MINOR for value: "minor"
         */
        public static final SeverityEnum MINOR = new SeverityEnum("minor");

        /**
         * Enum MAJOR for value: "major"
         */
        public static final SeverityEnum MAJOR = new SeverityEnum("major");

        /**
         * Enum FATAL for value: "fatal"
         */
        public static final SeverityEnum FATAL = new SeverityEnum("fatal");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("suggestion", SUGGESTION);
            map.put("minor", MINOR);
            map.put("major", MAJOR);
            map.put("fatal", FATAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_id")

    private Integer assigneeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer_id")

    private Integer proposerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_reply")

    private Boolean includeReply;

    /**
     * **参数解释：** 排序方式。 **取值范围：** - created，创建时间。 - updated，更新时间。
     */
    public static final class OrderByEnum {

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final OrderByEnum CREATED_AT = new OrderByEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final OrderByEnum UPDATED_AT = new OrderByEnum("updated_at");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderByEnum(String value) {
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
        public static OrderByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderByEnum(value));
        }

        public static OrderByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderByEnum) {
                return this.value.equals(((OrderByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private OrderByEnum orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRepositoryReviewsRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ListRepositoryReviewsRequest withNoteableType(NoteableTypeEnum noteableType) {
        this.noteableType = noteableType;
        return this;
    }

    /**
     * **参数解释：** 意见类型。 **取值范围：** - Commit，提交。 - MergeRequest，合并请求。  
     * @return noteableType
     */
    public NoteableTypeEnum getNoteableType() {
        return noteableType;
    }

    public void setNoteableType(NoteableTypeEnum noteableType) {
        this.noteableType = noteableType;
    }

    public ListRepositoryReviewsRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 查询评论内容。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListRepositoryReviewsRequest withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * **参数解释：** 开始日期。
     * @return startDate
     */
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public ListRepositoryReviewsRequest withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * **参数解释：** 结束日期。
     * @return endDate
     */
    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }

    public ListRepositoryReviewsRequest withOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
        return this;
    }

    /**
     * **参数解释：** 是否仅返回带有提交计数和diffs计数的结果。 **取值范围：** - true，仅返回带有提交计数和diffs计数的结果。 - false，按照compare_view参数返回结果信息。
     * @return onlyCount
     */
    public Boolean getOnlyCount() {
        return onlyCount;
    }

    public void setOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
    }

    public ListRepositoryReviewsRequest withReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
        return this;
    }

    /**
     * **参数解释：** 搜索的检视意见分类。 **取值范围：** 字符串长度不少于1，不超过200。
     * @return reviewCategories
     */
    public String getReviewCategories() {
        return reviewCategories;
    }

    public void setReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
    }

    public ListRepositoryReviewsRequest withReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    /**
     * **参数解释：** 搜索的检视意见模块。 **取值范围：** 字符串长度不少于1，不超过200。
     * @return reviewModules
     */
    public String getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
    }

    public ListRepositoryReviewsRequest withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释：** 检视意见严重程度
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public ListRepositoryReviewsRequest withAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    /**
     * **参数解释：** 检视意见指派人id。
     * minimum: 1
     * maximum: 2147483647
     * @return assigneeId
     */
    public Integer getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
    }

    public ListRepositoryReviewsRequest withProposerId(Integer proposerId) {
        this.proposerId = proposerId;
        return this;
    }

    /**
     * **参数解释：** 检视意见检视人id。
     * minimum: 1
     * maximum: 2147483647
     * @return proposerId
     */
    public Integer getProposerId() {
        return proposerId;
    }

    public void setProposerId(Integer proposerId) {
        this.proposerId = proposerId;
    }

    public ListRepositoryReviewsRequest withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 目标分支名称。 **取值范围：** 字符串长度不少于1，不超过2000。
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public ListRepositoryReviewsRequest withIncludeReply(Boolean includeReply) {
        this.includeReply = includeReply;
        return this;
    }

    /**
     * **参数解释：** 是否包含回复。 **取值范围：** - true，包含。 - false，不包含。
     * @return includeReply
     */
    public Boolean getIncludeReply() {
        return includeReply;
    }

    public void setIncludeReply(Boolean includeReply) {
        this.includeReply = includeReply;
    }

    public ListRepositoryReviewsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释：** 排序方式。 **取值范围：** - created，创建时间。 - updated，更新时间。
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListRepositoryReviewsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 检视意见返回排序 - asc 按创建时间正序返回 - desc 按创建时间倒序返回
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListRepositoryReviewsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRepositoryReviewsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepositoryReviewsRequest that = (ListRepositoryReviewsRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.noteableType, that.noteableType) && Objects.equals(this.search, that.search)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.onlyCount, that.onlyCount)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewModules, that.reviewModules) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.assigneeId, that.assigneeId) && Objects.equals(this.proposerId, that.proposerId)
            && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.includeReply, that.includeReply) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId,
            noteableType,
            search,
            startDate,
            endDate,
            onlyCount,
            reviewCategories,
            reviewModules,
            severity,
            assigneeId,
            proposerId,
            targetBranch,
            includeReply,
            orderBy,
            sort,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryReviewsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    noteableType: ").append(toIndentedString(noteableType)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    onlyCount: ").append(toIndentedString(onlyCount)).append("\n");
        sb.append("    reviewCategories: ").append(toIndentedString(reviewCategories)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    proposerId: ").append(toIndentedString(proposerId)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    includeReply: ").append(toIndentedString(includeReply)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
