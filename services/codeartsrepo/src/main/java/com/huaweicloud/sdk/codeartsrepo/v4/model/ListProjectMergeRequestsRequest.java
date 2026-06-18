package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectMergeRequestsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释：** 返回指定状态的合并请求。 **约束限制：** - all，表示所有状态。 - opened，表示开启中状态 - closed，表示已关闭状态 - merged，表示已合并状态
     */
    public static final class StateEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final StateEnum ALL = new StateEnum("all");

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
            map.put("all", ALL);
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

    /**
     * **参数解释：** 排序方式。 **取值范围：** - created_at，创建时间。 - updated_at，更新时间。
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

    /**
     * **参数解释：** 排序方式。 **约束限制：** - asc，升序。 - desc，降序。
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
    @JsonProperty(value = "author_id")

    private String authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_repository_id")

    private Integer sourceRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_count")

    private Boolean onlyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    public ListProjectMergeRequestsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位uuid，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/en-us/api-projectman/ListProjectsV4.html)](tag:hws_hk)[[查询项目列表](https://support.huaweicloud.com/intl/zh-cn/api-projectman/ListProjectsV4.html)](tag:hws_hk_ch)[[查询项目列表](https://support.huaweicloud.com/eu/api-projectman/ListProjectsV4.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **取值范围：** 字符串长度32。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListProjectMergeRequestsRequest withOffset(Integer offset) {
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

    public ListProjectMergeRequestsRequest withLimit(Integer limit) {
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

    public ListProjectMergeRequestsRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 返回指定状态的合并请求。 **约束限制：** - all，表示所有状态。 - opened，表示开启中状态 - closed，表示已关闭状态 - merged，表示已合并状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ListProjectMergeRequestsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释：** 排序方式。 **取值范围：** - created_at，创建时间。 - updated_at，更新时间。
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListProjectMergeRequestsRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 排序方式。 **约束限制：** - asc，升序。 - desc，降序。
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListProjectMergeRequestsRequest withAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * **参数解释：** 返回由指定ID用户创建的合并请求。 多个ID以逗号','分隔，返回满足条件的合并请求并集。
     * @return authorId
     */
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public ListProjectMergeRequestsRequest withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * **参数解释：** 返回指定源分支的合并请求。
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public ListProjectMergeRequestsRequest withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 返回指定目标分支的合并请求。
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public ListProjectMergeRequestsRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 合并请求关键字搜索。 返回标题或者描述包含对应关键字的合并请求。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListProjectMergeRequestsRequest withSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
        return this;
    }

    /**
     * **参数解释：** 查询指定源仓库的数据。
     * @return sourceRepositoryId
     */
    public Integer getSourceRepositoryId() {
        return sourceRepositoryId;
    }

    public void setSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
    }

    public ListProjectMergeRequestsRequest withOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
        return this;
    }

    /**
     * **参数解释：** 是否仅返回合并请求计数。 **取值范围：** - true，仅返回合并请求计数。 - false，返回合并请求详细信息。
     * @return onlyCount
     */
    public Boolean getOnlyCount() {
        return onlyCount;
    }

    public void setOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
    }

    public ListProjectMergeRequestsRequest withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * **参数解释：** 查询包含指定labels的合并请求。
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public ListProjectMergeRequestsRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释：** 合并请求主题
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectMergeRequestsRequest that = (ListProjectMergeRequestsRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.state, that.state)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.authorId, that.authorId) && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch) && Objects.equals(this.search, that.search)
            && Objects.equals(this.sourceRepositoryId, that.sourceRepositoryId)
            && Objects.equals(this.onlyCount, that.onlyCount) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.topic, that.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            offset,
            limit,
            state,
            orderBy,
            sort,
            authorId,
            sourceBranch,
            targetBranch,
            search,
            sourceRepositoryId,
            onlyCount,
            labels,
            topic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectMergeRequestsRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    sourceRepositoryId: ").append(toIndentedString(sourceRepositoryId)).append("\n");
        sb.append("    onlyCount: ").append(toIndentedString(onlyCount)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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
