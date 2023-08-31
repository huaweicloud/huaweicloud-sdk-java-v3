package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ListAllAppRequestBody
 */
public class ListAllAppRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 排序字段的名称，当前仅支持name和startTime
     */
    public static final class SortNameEnum {

        /**
         * Enum NAME for value: "name"
         */
        public static final SortNameEnum NAME = new SortNameEnum("name");

        /**
         * Enum STARTTIME for value: "startTime"
         */
        public static final SortNameEnum STARTTIME = new SortNameEnum("startTime");

        private static final Map<String, SortNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortNameEnum> createStaticFields() {
            Map<String, SortNameEnum> map = new HashMap<>();
            map.put("name", NAME);
            map.put("startTime", STARTTIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortNameEnum(String value) {
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
        public static SortNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortNameEnum(value));
        }

        public static SortNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortNameEnum) {
                return this.value.equals(((SortNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_name")

    private SortNameEnum sortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    public ListAllAppRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListAllAppRequestBody withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页页码， 表示从此页开始查询， page大于等于1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListAllAppRequestBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页显示的条目数量，size小于等于100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListAllAppRequestBody withSortName(SortNameEnum sortName) {
        this.sortName = sortName;
        return this;
    }

    /**
     * 排序字段的名称，当前仅支持name和startTime
     * @return sortName
     */
    public SortNameEnum getSortName() {
        return sortName;
    }

    public void setSortName(SortNameEnum sortName) {
        this.sortName = sortName;
    }

    public ListAllAppRequestBody withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 排序顺序，正序（ASC）或者逆序（DESC)
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllAppRequestBody that = (ListAllAppRequestBody) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.page, that.page)
            && Objects.equals(this.size, that.size) && Objects.equals(this.sortName, that.sortName)
            && Objects.equals(this.sortBy, that.sortBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, page, size, sortName, sortBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllAppRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
