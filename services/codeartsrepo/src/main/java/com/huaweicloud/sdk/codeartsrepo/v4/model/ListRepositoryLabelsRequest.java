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
public class ListRepositoryLabelsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    /**
     * **参数解释：**  排序。 **约束限制：** 不涉及。 **取值范围：** - name_asc，按标签名升序。 - name_desc，按标签名降序。 - created_asc，按标签创建时间升序。 - created_desc，按标签创建时间降序。 - updated_asc，按标签更新时间升序。 - updated_desc，按标签更新时间降序。 **默认取值：** name_asc
     */
    public static final class SortEnum {

        /**
         * Enum NAME_ASC for value: "name_asc"
         */
        public static final SortEnum NAME_ASC = new SortEnum("name_asc");

        /**
         * Enum NAME_DESC for value: "name_desc"
         */
        public static final SortEnum NAME_DESC = new SortEnum("name_desc");

        /**
         * Enum CREATED_ASC for value: "created_asc"
         */
        public static final SortEnum CREATED_ASC = new SortEnum("created_asc");

        /**
         * Enum CREATED_DESC for value: "created_desc"
         */
        public static final SortEnum CREATED_DESC = new SortEnum("created_desc");

        /**
         * Enum UPDATED_ASC for value: "updated_asc"
         */
        public static final SortEnum UPDATED_ASC = new SortEnum("updated_asc");

        /**
         * Enum UPDATED_DESC for value: "updated_desc"
         */
        public static final SortEnum UPDATED_DESC = new SortEnum("updated_desc");

        private static final Map<String, SortEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortEnum> createStaticFields() {
            Map<String, SortEnum> map = new HashMap<>();
            map.put("name_asc", NAME_ASC);
            map.put("name_desc", NAME_DESC);
            map.put("created_asc", CREATED_ASC);
            map.put("created_desc", CREATED_DESC);
            map.put("updated_asc", UPDATED_ASC);
            map.put("updated_desc", UPDATED_DESC);
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
    @JsonProperty(value = "include_expired")

    private Boolean includeExpired;

    /**
     * **参数解释：** 结果集属性，根据给定的参数返回不同的结果。 **约束限制：** 不涉及。 **取值范围：** - simple，返回简略信息。 - basic，返回基本信息。 - detail，返回详细信息。 **默认取值：** basic
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
         * Enum DETAIL for value: "detail"
         */
        public static final ViewEnum DETAIL = new ViewEnum("detail");

        private static final Map<String, ViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewEnum> createStaticFields() {
            Map<String, ViewEnum> map = new HashMap<>();
            map.put("simple", SIMPLE);
            map.put("basic", BASIC);
            map.put("detail", DETAIL);
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

    public ListRepositoryLabelsRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[[查询用户所有仓库](https://support.huaweicloud.com/eu/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
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

    public ListRepositoryLabelsRequest withOffset(Integer offset) {
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

    public ListRepositoryLabelsRequest withLimit(Integer limit) {
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

    public ListRepositoryLabelsRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 查询关键字，可模糊匹配标签名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListRepositoryLabelsRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：**  排序。 **约束限制：** 不涉及。 **取值范围：** - name_asc，按标签名升序。 - name_desc，按标签名降序。 - created_asc，按标签创建时间升序。 - created_desc，按标签创建时间降序。 - updated_asc，按标签更新时间升序。 - updated_desc，按标签更新时间降序。 **默认取值：** name_asc
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListRepositoryLabelsRequest withIncludeExpired(Boolean includeExpired) {
        this.includeExpired = includeExpired;
        return this;
    }

    /**
     * **参数解释：** 是否包含失效的标签。 **约束限制：** 不涉及。 **取值范围：** - true，包含。 - false，不包含。 **默认取值：** true
     * @return includeExpired
     */
    public Boolean getIncludeExpired() {
        return includeExpired;
    }

    public void setIncludeExpired(Boolean includeExpired) {
        this.includeExpired = includeExpired;
    }

    public ListRepositoryLabelsRequest withView(ViewEnum view) {
        this.view = view;
        return this;
    }

    /**
     * **参数解释：** 结果集属性，根据给定的参数返回不同的结果。 **约束限制：** 不涉及。 **取值范围：** - simple，返回简略信息。 - basic，返回基本信息。 - detail，返回详细信息。 **默认取值：** basic
     * @return view
     */
    public ViewEnum getView() {
        return view;
    }

    public void setView(ViewEnum view) {
        this.view = view;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepositoryLabelsRequest that = (ListRepositoryLabelsRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.search, that.search)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.includeExpired, that.includeExpired)
            && Objects.equals(this.view, that.view);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, offset, limit, search, sort, includeExpired, view);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryLabelsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    includeExpired: ").append(toIndentedString(includeExpired)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
