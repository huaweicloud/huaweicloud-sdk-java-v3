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
public class ListRepositoryEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private Integer authorId;

    /**
     * **参数解释：** 动态类型。 **约束限制：** - all，表示全部。 - push，表示推送。
     */
    public static final class FilterEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final FilterEnum ALL = new FilterEnum("all");

        /**
         * Enum PUSH for value: "push"
         */
        public static final FilterEnum PUSH = new FilterEnum("push");

        private static final Map<String, FilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterEnum> createStaticFields() {
            Map<String, FilterEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("push", PUSH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterEnum(String value) {
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
        public static FilterEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterEnum(value));
        }

        public static FilterEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterEnum) {
                return this.value.equals(((FilterEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private FilterEnum filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before")

    private OffsetDateTime before;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after")

    private OffsetDateTime after;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRepositoryEventsRequest withRepositoryId(Integer repositoryId) {
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

    public ListRepositoryEventsRequest withAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * **参数解释：** 操作者id。
     * minimum: 1
     * maximum: 2147483647
     * @return authorId
     */
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public ListRepositoryEventsRequest withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    /**
     * **参数解释：** 动态类型。 **约束限制：** - all，表示全部。 - push，表示推送。
     * @return filter
     */
    public FilterEnum getFilter() {
        return filter;
    }

    public void setFilter(FilterEnum filter) {
        this.filter = filter;
    }

    public ListRepositoryEventsRequest withBefore(OffsetDateTime before) {
        this.before = before;
        return this;
    }

    /**
     * **参数解释：** 开始日期。
     * @return before
     */
    public OffsetDateTime getBefore() {
        return before;
    }

    public void setBefore(OffsetDateTime before) {
        this.before = before;
    }

    public ListRepositoryEventsRequest withAfter(OffsetDateTime after) {
        this.after = after;
        return this;
    }

    /**
     * **参数解释：** 结束日期。
     * @return after
     */
    public OffsetDateTime getAfter() {
        return after;
    }

    public void setAfter(OffsetDateTime after) {
        this.after = after;
    }

    public ListRepositoryEventsRequest withOffset(Integer offset) {
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

    public ListRepositoryEventsRequest withLimit(Integer limit) {
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
        ListRepositoryEventsRequest that = (ListRepositoryEventsRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.authorId, that.authorId)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.before, that.before)
            && Objects.equals(this.after, that.after) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, authorId, filter, before, after, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryEventsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
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
