package com.huaweicloud.sdk.codehub.v4.model;

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
public class ListPersonalMergeRequestsRequest {

    /**
     * **参数解释：** 合并请求状态 **约束限制：** - all，返回所有状态的合并请求。 - opened，返回开启中的合并请求。 - closed，返回关闭的合并请求。 - locked，返回锁定的合并请求。 - merged，返回已合并的合并请求。
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
         * Enum LOCKED for value: "locked"
         */
        public static final StateEnum LOCKED = new StateEnum("locked");

        /**
         * Enum MERGED for value: "merged"
         */
        public static final StateEnum MERGED = new StateEnum("merged");

        /**
         * Enum ALL for value: "all"
         */
        public static final StateEnum ALL = new StateEnum("all");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("opened", OPENED);
            map.put("closed", CLOSED);
            map.put("locked", LOCKED);
            map.put("merged", MERGED);
            map.put("all", ALL);
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

    /**
     * **参数解释：** 排序方式 **约束限制：** - created_at，根据创建时间排序。 - updated_at，根据更新时间排序。 - merged_at，根据合并时间排序。
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

        /**
         * Enum MERGED_AT for value: "merged_at"
         */
        public static final OrderByEnum MERGED_AT = new OrderByEnum("merged_at");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            map.put("merged_at", MERGED_AT);
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

    /**
     * **参数解释：** 排序顺序 **约束限制：**   - asc，正序排序。   - desc，倒序排序。
     */
    public static final class SortEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortEnum ASC = new SortEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortEnum DESC = new SortEnum("desc");

        private static final Map<String, SortEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortEnum> createStaticFields() {
            Map<String, SortEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortEnum(String value) {
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
        public static SortEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortEnum(value));
        }

        public static SortEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortEnum) {
                return this.value.equals(((SortEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private SortEnum sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_before")

    private OffsetDateTime createdBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_after")

    private OffsetDateTime createdAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_after")

    private OffsetDateTime updatedAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_before")

    private OffsetDateTime updatedBefore;

    /**
     * **参数解释：** 结果集属性，根据给定的参数返回不同的结果， simple，返回简单数据，basic返回基本数据。
     */
    public static final class ViewEnum {

        /**
         * Enum SIMPLE for value: "simple"
         */
        public static final ViewEnum SIMPLE = new ViewEnum("simple");

        /**
         * Enum BASIC for value: "basic"
         */
        public static final ViewEnum BASIC = new ViewEnum("basic");

        private static final Map<String, ViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewEnum> createStaticFields() {
            Map<String, ViewEnum> map = new HashMap<>();
            map.put("simple", SIMPLE);
            map.put("basic", BASIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ViewEnum(String value) {
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
        public static ViewEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ViewEnum(value));
        }

        public static ViewEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ViewEnum) {
                return this.value.equals(((ViewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view")

    private ViewEnum view;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private String authorId;

    /**
     * **参数解释：**   - created_by_me 我创建的合并请求   - assigned_to_me 待我合并的合并请求   - need_my_review 待我检视的合并请求   - need_my_approve 待我审核的合并请求   - all 所有有权限访问的合并请求
     */
    public static final class ScopeEnum {

        /**
         * Enum CREATED_BY_ME for value: "created_by_me"
         */
        public static final ScopeEnum CREATED_BY_ME = new ScopeEnum("created_by_me");

        /**
         * Enum ASSIGNED_TO_ME for value: "assigned_to_me"
         */
        public static final ScopeEnum ASSIGNED_TO_ME = new ScopeEnum("assigned_to_me");

        /**
         * Enum NEED_MY_REVIEW for value: "need_my_review"
         */
        public static final ScopeEnum NEED_MY_REVIEW = new ScopeEnum("need_my_review");

        /**
         * Enum NEED_MY_APPROVE for value: "need_my_approve"
         */
        public static final ScopeEnum NEED_MY_APPROVE = new ScopeEnum("need_my_approve");

        /**
         * Enum ALL for value: "all"
         */
        public static final ScopeEnum ALL = new ScopeEnum("all");

        private static final Map<String, ScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScopeEnum> createStaticFields() {
            Map<String, ScopeEnum> map = new HashMap<>();
            map.put("created_by_me", CREATED_BY_ME);
            map.put("assigned_to_me", ASSIGNED_TO_ME);
            map.put("need_my_review", NEED_MY_REVIEW);
            map.put("need_my_approve", NEED_MY_APPROVE);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScopeEnum(value));
        }

        public static ScopeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScopeEnum) {
                return this.value.equals(((ScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private ScopeEnum scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    /**
     * **参数解释：** 合并请求标题是否有WIP关键字
     */
    public static final class WipEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final WipEnum TRUE = new WipEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final WipEnum FALSE = new WipEnum("false");

        private static final Map<String, WipEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WipEnum> createStaticFields() {
            Map<String, WipEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WipEnum(String value) {
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
        public static WipEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WipEnum(value));
        }

        public static WipEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WipEnum) {
                return this.value.equals(((WipEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wip")

    private WipEnum wip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_by")

    private String mergedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_after")

    private OffsetDateTime mergedAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_before")

    private OffsetDateTime mergedBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_count")

    private Boolean onlyCount;

    public ListPersonalMergeRequestsRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 合并请求状态 **约束限制：** - all，返回所有状态的合并请求。 - opened，返回开启中的合并请求。 - closed，返回关闭的合并请求。 - locked，返回锁定的合并请求。 - merged，返回已合并的合并请求。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ListPersonalMergeRequestsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释：** 排序方式 **约束限制：** - created_at，根据创建时间排序。 - updated_at，根据更新时间排序。 - merged_at，根据合并时间排序。
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListPersonalMergeRequestsRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 排序顺序 **约束限制：**   - asc，正序排序。   - desc，倒序排序。
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListPersonalMergeRequestsRequest withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * **参数解释：** 合并请求关联标签
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public ListPersonalMergeRequestsRequest withCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * **参数解释：** 指定时间前创建
     * @return createdBefore
     */
    public OffsetDateTime getCreatedBefore() {
        return createdBefore;
    }

    public void setCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
    }

    public ListPersonalMergeRequestsRequest withCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * **参数解释：** 指定时间后创建
     * @return createdAfter
     */
    public OffsetDateTime getCreatedAfter() {
        return createdAfter;
    }

    public void setCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
    }

    public ListPersonalMergeRequestsRequest withUpdatedAfter(OffsetDateTime updatedAfter) {
        this.updatedAfter = updatedAfter;
        return this;
    }

    /**
     * **参数解释：** 指定时间后更新
     * @return updatedAfter
     */
    public OffsetDateTime getUpdatedAfter() {
        return updatedAfter;
    }

    public void setUpdatedAfter(OffsetDateTime updatedAfter) {
        this.updatedAfter = updatedAfter;
    }

    public ListPersonalMergeRequestsRequest withUpdatedBefore(OffsetDateTime updatedBefore) {
        this.updatedBefore = updatedBefore;
        return this;
    }

    /**
     * **参数解释：** 指定时间前更新
     * @return updatedBefore
     */
    public OffsetDateTime getUpdatedBefore() {
        return updatedBefore;
    }

    public void setUpdatedBefore(OffsetDateTime updatedBefore) {
        this.updatedBefore = updatedBefore;
    }

    public ListPersonalMergeRequestsRequest withView(ViewEnum view) {
        this.view = view;
        return this;
    }

    /**
     * **参数解释：** 结果集属性，根据给定的参数返回不同的结果， simple，返回简单数据，basic返回基本数据。
     * @return view
     */
    public ViewEnum getView() {
        return view;
    }

    public void setView(ViewEnum view) {
        this.view = view;
    }

    public ListPersonalMergeRequestsRequest withAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * **参数解释：** 合并请求创建人
     * @return authorId
     */
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public ListPersonalMergeRequestsRequest withScope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释：**   - created_by_me 我创建的合并请求   - assigned_to_me 待我合并的合并请求   - need_my_review 待我检视的合并请求   - need_my_approve 待我审核的合并请求   - all 所有有权限访问的合并请求
     * @return scope
     */
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public ListPersonalMergeRequestsRequest withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * **参数解释：** 合并请求原分支
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public ListPersonalMergeRequestsRequest withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 合并请求目标分支
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public ListPersonalMergeRequestsRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 根据合并请求标题、描述信息过滤关键字
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListPersonalMergeRequestsRequest withWip(WipEnum wip) {
        this.wip = wip;
        return this;
    }

    /**
     * **参数解释：** 合并请求标题是否有WIP关键字
     * @return wip
     */
    public WipEnum getWip() {
        return wip;
    }

    public void setWip(WipEnum wip) {
        this.wip = wip;
    }

    public ListPersonalMergeRequestsRequest withMergedBy(String mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }

    /**
     * **参数解释：** 合并请求合并人
     * @return mergedBy
     */
    public String getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(String mergedBy) {
        this.mergedBy = mergedBy;
    }

    public ListPersonalMergeRequestsRequest withMergedAfter(OffsetDateTime mergedAfter) {
        this.mergedAfter = mergedAfter;
        return this;
    }

    /**
     * **参数解释：** 指定时间后合入
     * @return mergedAfter
     */
    public OffsetDateTime getMergedAfter() {
        return mergedAfter;
    }

    public void setMergedAfter(OffsetDateTime mergedAfter) {
        this.mergedAfter = mergedAfter;
    }

    public ListPersonalMergeRequestsRequest withMergedBefore(OffsetDateTime mergedBefore) {
        this.mergedBefore = mergedBefore;
        return this;
    }

    /**
     * **参数解释：** 指定时间前合入
     * @return mergedBefore
     */
    public OffsetDateTime getMergedBefore() {
        return mergedBefore;
    }

    public void setMergedBefore(OffsetDateTime mergedBefore) {
        this.mergedBefore = mergedBefore;
    }

    public ListPersonalMergeRequestsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 分页参数偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPersonalMergeRequestsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 分页参数结果数量限制
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPersonalMergeRequestsRequest withOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
        return this;
    }

    /**
     * **参数解释：** 是否只返回合并请求总数
     * @return onlyCount
     */
    public Boolean getOnlyCount() {
        return onlyCount;
    }

    public void setOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPersonalMergeRequestsRequest that = (ListPersonalMergeRequestsRequest) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.createdBefore, that.createdBefore)
            && Objects.equals(this.createdAfter, that.createdAfter)
            && Objects.equals(this.updatedAfter, that.updatedAfter)
            && Objects.equals(this.updatedBefore, that.updatedBefore) && Objects.equals(this.view, that.view)
            && Objects.equals(this.authorId, that.authorId) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch) && Objects.equals(this.search, that.search)
            && Objects.equals(this.wip, that.wip) && Objects.equals(this.mergedBy, that.mergedBy)
            && Objects.equals(this.mergedAfter, that.mergedAfter)
            && Objects.equals(this.mergedBefore, that.mergedBefore) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.onlyCount, that.onlyCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state,
            orderBy,
            sort,
            labels,
            createdBefore,
            createdAfter,
            updatedAfter,
            updatedBefore,
            view,
            authorId,
            scope,
            sourceBranch,
            targetBranch,
            search,
            wip,
            mergedBy,
            mergedAfter,
            mergedBefore,
            offset,
            limit,
            onlyCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPersonalMergeRequestsRequest {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
        sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
        sb.append("    updatedAfter: ").append(toIndentedString(updatedAfter)).append("\n");
        sb.append("    updatedBefore: ").append(toIndentedString(updatedBefore)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    wip: ").append(toIndentedString(wip)).append("\n");
        sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
        sb.append("    mergedAfter: ").append(toIndentedString(mergedAfter)).append("\n");
        sb.append("    mergedBefore: ").append(toIndentedString(mergedBefore)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    onlyCount: ").append(toIndentedString(onlyCount)).append("\n");
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
