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
public class ListCurrentUserRepositoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释：** 排序字段。 **取值范围：** - created_at，创建时间。 - updated_at，更新时间。 **约束限制：** 不涉及。 **默认取值：** created_at。
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
     * **参数解释：** 排序字段。 **取值范围：** - asc，升序。 - desc，逆序。 **约束限制：** 不涉及。 **默认取值：** desc。
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
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starred")

    private Boolean starred;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "membership")

    private Boolean membership;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_created")

    private Boolean userCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_abnormal")

    private Boolean includeAbnormal;

    public ListCurrentUserRepositoriesRequest withOffset(Integer offset) {
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

    public ListCurrentUserRepositoriesRequest withLimit(Integer limit) {
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

    public ListCurrentUserRepositoriesRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释：** 排序字段。 **取值范围：** - created_at，创建时间。 - updated_at，更新时间。 **约束限制：** 不涉及。 **默认取值：** created_at。
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListCurrentUserRepositoriesRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 排序字段。 **取值范围：** - asc，升序。 - desc，逆序。 **约束限制：** 不涉及。 **默认取值：** desc。
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListCurrentUserRepositoriesRequest withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * **参数解释：** 是否归档。 **取值范围：** - true，归档。 - false，未归档。 **约束限制：** 不涉及。 **默认取值：** false。
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public ListCurrentUserRepositoriesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 仓库搜索。 **取值范围：** 1-512。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListCurrentUserRepositoriesRequest withStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }

    /**
     * **参数解释：** 关注的仓库。 **取值范围：** - true，关注。 - false，未关注。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return starred
     */
    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public ListCurrentUserRepositoriesRequest withMembership(Boolean membership) {
        this.membership = membership;
        return this;
    }

    /**
     * **参数解释：** 参与的仓库（有仓库成员身份）。 **取值范围：** - true，筛选我参与的仓库。 - false，不筛选。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return membership
     */
    public Boolean getMembership() {
        return membership;
    }

    public void setMembership(Boolean membership) {
        this.membership = membership;
    }

    public ListCurrentUserRepositoriesRequest withUserCreated(Boolean userCreated) {
        this.userCreated = userCreated;
        return this;
    }

    /**
     * **参数解释：** 创建的仓库。 **取值范围：** - true，筛选我创建的仓库。 - false，不筛选。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return userCreated
     */
    public Boolean getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Boolean userCreated) {
        this.userCreated = userCreated;
    }

    public ListCurrentUserRepositoriesRequest withIncludeAbnormal(Boolean includeAbnormal) {
        this.includeAbnormal = includeAbnormal;
        return this;
    }

    /**
     * **参数解释：** 包含异常状态的仓库。 **取值范围：** - true，筛选包含异常状态的仓库。 - false，不筛选。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return includeAbnormal
     */
    public Boolean getIncludeAbnormal() {
        return includeAbnormal;
    }

    public void setIncludeAbnormal(Boolean includeAbnormal) {
        this.includeAbnormal = includeAbnormal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCurrentUserRepositoriesRequest that = (ListCurrentUserRepositoriesRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.archived, that.archived) && Objects.equals(this.search, that.search)
            && Objects.equals(this.starred, that.starred) && Objects.equals(this.membership, that.membership)
            && Objects.equals(this.userCreated, that.userCreated)
            && Objects.equals(this.includeAbnormal, that.includeAbnormal);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(offset, limit, orderBy, sort, archived, search, starred, membership, userCreated, includeAbnormal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCurrentUserRepositoriesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
        sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
        sb.append("    userCreated: ").append(toIndentedString(userCreated)).append("\n");
        sb.append("    includeAbnormal: ").append(toIndentedString(includeAbnormal)).append("\n");
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
