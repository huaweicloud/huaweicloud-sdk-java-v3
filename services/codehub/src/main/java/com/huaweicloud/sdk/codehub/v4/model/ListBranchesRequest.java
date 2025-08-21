package com.huaweicloud.sdk.codehub.v4.model;

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
public class ListBranchesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    /**
     * **参数解释：** 分支类型，默认返回全部分支，not_protect，返回非保护分支。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
     */
    public static final class BranchTypeEnum {

        /**
         * Enum NOT_PROTECT for value: "not_protect"
         */
        public static final BranchTypeEnum NOT_PROTECT = new BranchTypeEnum("not_protect");

        private static final Map<String, BranchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BranchTypeEnum> createStaticFields() {
            Map<String, BranchTypeEnum> map = new HashMap<>();
            map.put("not_protect", NOT_PROTECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BranchTypeEnum(String value) {
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
        public static BranchTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BranchTypeEnum(value));
        }

        public static BranchTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BranchTypeEnum) {
                return this.value.equals(((BranchTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_type")

    private BranchTypeEnum branchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    /**
     * **参数解释：** 排序方式 **约束限制：** - name，分支名倒序。 - updated_desc，更新时间倒序。 - updated_asc，更新时间正序。
     */
    public static final class SortEnum {

        /**
         * Enum NAME for value: "name"
         */
        public static final SortEnum NAME = new SortEnum("name");

        /**
         * Enum UPDATED_DESC for value: "updated_desc"
         */
        public static final SortEnum UPDATED_DESC = new SortEnum("updated_desc");

        /**
         * Enum UPDATED_ASC for value: "updated_asc"
         */
        public static final SortEnum UPDATED_ASC = new SortEnum("updated_asc");

        private static final Map<String, SortEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortEnum> createStaticFields() {
            Map<String, SortEnum> map = new HashMap<>();
            map.put("name", NAME);
            map.put("updated_desc", UPDATED_DESC);
            map.put("updated_asc", UPDATED_ASC);
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

    /**
     * **参数解释：** 分支类型 **约束限制：** - my_branches，个人分支。 - active，活跃分支。 - stale，过时分支。 - all_branches，所有分支。
     */
    public static final class QueryViewEnum {

        /**
         * Enum MY_BRANCHES for value: "my_branches"
         */
        public static final QueryViewEnum MY_BRANCHES = new QueryViewEnum("my_branches");

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final QueryViewEnum ACTIVE = new QueryViewEnum("active");

        /**
         * Enum STALE for value: "stale"
         */
        public static final QueryViewEnum STALE = new QueryViewEnum("stale");

        /**
         * Enum ALL_BRANCHES for value: "all_branches"
         */
        public static final QueryViewEnum ALL_BRANCHES = new QueryViewEnum("all_branches");

        private static final Map<String, QueryViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryViewEnum> createStaticFields() {
            Map<String, QueryViewEnum> map = new HashMap<>();
            map.put("my_branches", MY_BRANCHES);
            map.put("active", ACTIVE);
            map.put("stale", STALE);
            map.put("all_branches", ALL_BRANCHES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueryViewEnum(String value) {
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
        public static QueryViewEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryViewEnum(value));
        }

        public static QueryViewEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryViewEnum) {
                return this.value.equals(((QueryViewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_view")

    private QueryViewEnum queryView;

    /**
     * **参数解释：** 结果集属性，根据给定的参数返回不同的结果 **约束限制：** - all，返回分支的所有信息。 - basic，返回分支的基本信息。 - simple，返回分支的简单信息。
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

        /**
         * Enum ALL for value: "all"
         */
        public static final ViewEnum ALL = new ViewEnum("all");

        private static final Map<String, ViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewEnum> createStaticFields() {
            Map<String, ViewEnum> map = new HashMap<>();
            map.put("simple", SIMPLE);
            map.put("basic", BASIC);
            map.put("all", ALL);
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
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListBranchesRequest withRepositoryId(Integer repositoryId) {
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

    public ListBranchesRequest withBranchType(BranchTypeEnum branchType) {
        this.branchType = branchType;
        return this;
    }

    /**
     * **参数解释：** 分支类型，默认返回全部分支，not_protect，返回非保护分支。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
     * @return branchType
     */
    public BranchTypeEnum getBranchType() {
        return branchType;
    }

    public void setBranchType(BranchTypeEnum branchType) {
        this.branchType = branchType;
    }

    public ListBranchesRequest withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：** 创建者，用户ID或者IamId。 **取值范围：** 字符串长度不少于1，不超过100000。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListBranchesRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 排序方式 **约束限制：** - name，分支名倒序。 - updated_desc，更新时间倒序。 - updated_asc，更新时间正序。
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListBranchesRequest withQueryView(QueryViewEnum queryView) {
        this.queryView = queryView;
        return this;
    }

    /**
     * **参数解释：** 分支类型 **约束限制：** - my_branches，个人分支。 - active，活跃分支。 - stale，过时分支。 - all_branches，所有分支。
     * @return queryView
     */
    public QueryViewEnum getQueryView() {
        return queryView;
    }

    public void setQueryView(QueryViewEnum queryView) {
        this.queryView = queryView;
    }

    public ListBranchesRequest withView(ViewEnum view) {
        this.view = view;
        return this;
    }

    /**
     * **参数解释：** 结果集属性，根据给定的参数返回不同的结果 **约束限制：** - all，返回分支的所有信息。 - basic，返回分支的基本信息。 - simple，返回分支的简单信息。
     * @return view
     */
    public ViewEnum getView() {
        return view;
    }

    public void setView(ViewEnum view) {
        this.view = view;
    }

    public ListBranchesRequest withOffset(Integer offset) {
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

    public ListBranchesRequest withLimit(Integer limit) {
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
        ListBranchesRequest that = (ListBranchesRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.branchType, that.branchType)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.queryView, that.queryView) && Objects.equals(this.view, that.view)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, branchType, creator, sort, queryView, view, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBranchesRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    branchType: ").append(toIndentedString(branchType)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    queryView: ").append(toIndentedString(queryView)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
