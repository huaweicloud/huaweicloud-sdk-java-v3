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
public class ListPersonalRepositoryImportRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释：** 状态 **取值范围：** - finished, 导入成功 - fail, 导入失败 - importing, 导入中
     */
    public static final class StateEnum {

        /**
         * Enum FINISHED for value: "finished"
         */
        public static final StateEnum FINISHED = new StateEnum("finished");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StateEnum FAIL = new StateEnum("fail");

        /**
         * Enum IMPORTING for value: "importing"
         */
        public static final StateEnum IMPORTING = new StateEnum("importing");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("finished", FINISHED);
            map.put("fail", FAIL);
            map.put("importing", IMPORTING);
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
     * **参数解释：** 导入来源 **取值范围：** - gitee - self_managed_gitlab - gitlab - github - git - svn - coding - bitbucket - gerrit - codeup
     */
    public static final class SourceTypeEnum {

        /**
         * Enum GITEE for value: "gitee"
         */
        public static final SourceTypeEnum GITEE = new SourceTypeEnum("gitee");

        /**
         * Enum SELF_MANAGED_GITLAB for value: "self_managed_gitlab"
         */
        public static final SourceTypeEnum SELF_MANAGED_GITLAB = new SourceTypeEnum("self_managed_gitlab");

        /**
         * Enum GITLAB for value: "gitlab"
         */
        public static final SourceTypeEnum GITLAB = new SourceTypeEnum("gitlab");

        /**
         * Enum GITHUB for value: "github"
         */
        public static final SourceTypeEnum GITHUB = new SourceTypeEnum("github");

        /**
         * Enum GIT for value: "git"
         */
        public static final SourceTypeEnum GIT = new SourceTypeEnum("git");

        /**
         * Enum SVN for value: "svn"
         */
        public static final SourceTypeEnum SVN = new SourceTypeEnum("svn");

        /**
         * Enum CODING for value: "coding"
         */
        public static final SourceTypeEnum CODING = new SourceTypeEnum("coding");

        /**
         * Enum BITBUCKET for value: "bitbucket"
         */
        public static final SourceTypeEnum BITBUCKET = new SourceTypeEnum("bitbucket");

        /**
         * Enum GERRIT for value: "gerrit"
         */
        public static final SourceTypeEnum GERRIT = new SourceTypeEnum("gerrit");

        /**
         * Enum CODEUP for value: "codeup"
         */
        public static final SourceTypeEnum CODEUP = new SourceTypeEnum("codeup");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("gitee", GITEE);
            map.put("self_managed_gitlab", SELF_MANAGED_GITLAB);
            map.put("gitlab", GITLAB);
            map.put("github", GITHUB);
            map.put("git", GIT);
            map.put("svn", SVN);
            map.put("coding", CODING);
            map.put("bitbucket", BITBUCKET);
            map.put("gerrit", GERRIT);
            map.put("codeup", CODEUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_after")

    private OffsetDateTime createdAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_before")

    private OffsetDateTime createdBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_after")

    private OffsetDateTime finishedAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_before")

    private OffsetDateTime finishedBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    /**
     * **参数解释：** 排序方式。 **取值范围：** - created_at, 导入时间 - source_repo_name, 源仓库路径 - size, 源仓库容量
     */
    public static final class OrderByEnum {

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final OrderByEnum CREATED_AT = new OrderByEnum("created_at");

        /**
         * Enum SOURCE_REPO_NAME for value: "source_repo_name"
         */
        public static final OrderByEnum SOURCE_REPO_NAME = new OrderByEnum("source_repo_name");

        /**
         * Enum SIZE for value: "size"
         */
        public static final OrderByEnum SIZE = new OrderByEnum("size");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("source_repo_name", SOURCE_REPO_NAME);
            map.put("size", SIZE);
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
     * **参数解释：** 返回排序 - asc 正序返回 - desc 倒序返回
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

    public ListPersonalRepositoryImportRecordsRequest withOffset(Integer offset) {
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

    public ListPersonalRepositoryImportRecordsRequest withLimit(Integer limit) {
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

    public ListPersonalRepositoryImportRecordsRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 状态 **取值范围：** - finished, 导入成功 - fail, 导入失败 - importing, 导入中
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ListPersonalRepositoryImportRecordsRequest withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释：** 导入来源 **取值范围：** - gitee - self_managed_gitlab - gitlab - github - git - svn - coding - bitbucket - gerrit - codeup
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public ListPersonalRepositoryImportRecordsRequest withCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * **参数解释：** 筛选在该时间之后导入的
     * @return createdAfter
     */
    public OffsetDateTime getCreatedAfter() {
        return createdAfter;
    }

    public void setCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
    }

    public ListPersonalRepositoryImportRecordsRequest withCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * **参数解释：** 筛选在该时间之前导入的
     * @return createdBefore
     */
    public OffsetDateTime getCreatedBefore() {
        return createdBefore;
    }

    public void setCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
    }

    public ListPersonalRepositoryImportRecordsRequest withFinishedAfter(OffsetDateTime finishedAfter) {
        this.finishedAfter = finishedAfter;
        return this;
    }

    /**
     * **参数解释：** 筛选在该时间之后导入完成的
     * @return finishedAfter
     */
    public OffsetDateTime getFinishedAfter() {
        return finishedAfter;
    }

    public void setFinishedAfter(OffsetDateTime finishedAfter) {
        this.finishedAfter = finishedAfter;
    }

    public ListPersonalRepositoryImportRecordsRequest withFinishedBefore(OffsetDateTime finishedBefore) {
        this.finishedBefore = finishedBefore;
        return this;
    }

    /**
     * **参数解释：** 筛选在该时间之前导入完成的
     * @return finishedBefore
     */
    public OffsetDateTime getFinishedBefore() {
        return finishedBefore;
    }

    public void setFinishedBefore(OffsetDateTime finishedBefore) {
        this.finishedBefore = finishedBefore;
    }

    public ListPersonalRepositoryImportRecordsRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 搜索仓库
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListPersonalRepositoryImportRecordsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释：** 排序方式。 **取值范围：** - created_at, 导入时间 - source_repo_name, 源仓库路径 - size, 源仓库容量
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListPersonalRepositoryImportRecordsRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 返回排序 - asc 正序返回 - desc 倒序返回
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPersonalRepositoryImportRecordsRequest that = (ListPersonalRepositoryImportRecordsRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.state, that.state) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.createdAfter, that.createdAfter)
            && Objects.equals(this.createdBefore, that.createdBefore)
            && Objects.equals(this.finishedAfter, that.finishedAfter)
            && Objects.equals(this.finishedBefore, that.finishedBefore) && Objects.equals(this.search, that.search)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            state,
            sourceType,
            createdAfter,
            createdBefore,
            finishedAfter,
            finishedBefore,
            search,
            orderBy,
            sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPersonalRepositoryImportRecordsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
        sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
        sb.append("    finishedAfter: ").append(toIndentedString(finishedAfter)).append("\n");
        sb.append("    finishedBefore: ").append(toIndentedString(finishedBefore)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
