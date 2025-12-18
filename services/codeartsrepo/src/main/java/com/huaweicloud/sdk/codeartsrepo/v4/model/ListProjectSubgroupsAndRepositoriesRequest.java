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
public class ListProjectSubgroupsAndRepositoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private Integer filter;

    /**
     * **参数解释：** 排序字段 id 唯一标识 name 名称 created_at 创建时间 updated_at 更新时间
     */
    public static final class OrderByEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final OrderByEnum ID = new OrderByEnum("id");

        /**
         * Enum NAME for value: "name"
         */
        public static final OrderByEnum NAME = new OrderByEnum("name");

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
            map.put("id", ID);
            map.put("name", NAME);
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
     * **参数解释：** 排序顺序 asc顺序 desc逆序
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
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListProjectSubgroupsAndRepositoriesRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位uuid，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/en-us/api-projectman/ListProjectsV4.html)](tag:hws_hk)[[查询项目列表](https://support.huaweicloud.com/eu/api-projectman/ListProjectsV4.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **取值范围：** 字符串长度32。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListProjectSubgroupsAndRepositoriesRequest withFilter(Integer filter) {
        this.filter = filter;
        return this;
    }

    /**
     * **参数解释：** 检索条件，名称。
     * minimum: 1
     * maximum: 2147483647
     * @return filter
     */
    public Integer getFilter() {
        return filter;
    }

    public void setFilter(Integer filter) {
        this.filter = filter;
    }

    public ListProjectSubgroupsAndRepositoriesRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释：** 排序字段 id 唯一标识 name 名称 created_at 创建时间 updated_at 更新时间
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListProjectSubgroupsAndRepositoriesRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 排序顺序 asc顺序 desc逆序
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListProjectSubgroupsAndRepositoriesRequest withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * **参数解释：** 是否归档
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public ListProjectSubgroupsAndRepositoriesRequest withOffset(Integer offset) {
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

    public ListProjectSubgroupsAndRepositoriesRequest withLimit(Integer limit) {
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
        ListProjectSubgroupsAndRepositoriesRequest that = (ListProjectSubgroupsAndRepositoriesRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.archived, that.archived) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, filter, orderBy, sort, archived, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectSubgroupsAndRepositoriesRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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
