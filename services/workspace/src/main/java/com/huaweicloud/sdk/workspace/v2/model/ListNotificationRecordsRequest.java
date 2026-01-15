package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListNotificationRecordsRequest {

    /**
     * 通过该类型查询桌面或桌面池相关的通知拦截记录 - DESKTOP: 查找当前projectId下与桌面相关的通知拦截记录 - DESKTOP_POOL: 查找当前projectId下与桌面池相关的通知拦截记录
     */
    public static final class QueryTypeEnum {

        /**
         * Enum DESKTOP for value: "DESKTOP"
         */
        public static final QueryTypeEnum DESKTOP = new QueryTypeEnum("DESKTOP");

        /**
         * Enum DESKTOP_POOL for value: "DESKTOP_POOL"
         */
        public static final QueryTypeEnum DESKTOP_POOL = new QueryTypeEnum("DESKTOP_POOL");

        private static final Map<String, QueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryTypeEnum> createStaticFields() {
            Map<String, QueryTypeEnum> map = new HashMap<>();
            map.put("DESKTOP", DESKTOP);
            map.put("DESKTOP_POOL", DESKTOP_POOL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueryTypeEnum(String value) {
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
        public static QueryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryTypeEnum(value));
        }

        public static QueryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryTypeEnum) {
                return this.value.equals(((QueryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private QueryTypeEnum queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_name")

    private String desktopPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    /**
     * 过滤出与SMN通知类型一致的通知拦截记录 - EMAIL: 通过邮件查找通知拦截记录 - SMS: 通过短信查找通知拦截记录
     */
    public static final class TypeEnum {

        /**
         * Enum EMAIL for value: "EMAIL"
         */
        public static final TypeEnum EMAIL = new TypeEnum("EMAIL");

        /**
         * Enum SMS for value: "SMS"
         */
        public static final TypeEnum SMS = new TypeEnum("SMS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EMAIL", EMAIL);
            map.put("SMS", SMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 排序字段名称，需要结合sort_type字段一起使用。 - operate_time 发送时间
     */
    public static final class SortFieldEnum {

        /**
         * Enum OPERATE_TIME for value: "operate_time"
         */
        public static final SortFieldEnum OPERATE_TIME = new SortFieldEnum("operate_time");

        private static final Map<String, SortFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortFieldEnum> createStaticFields() {
            Map<String, SortFieldEnum> map = new HashMap<>();
            map.put("operate_time", OPERATE_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortFieldEnum(String value) {
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
        public static SortFieldEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortFieldEnum(value));
        }

        public static SortFieldEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortFieldEnum) {
                return this.value.equals(((SortFieldEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private SortFieldEnum sortField;

    /**
     * 排序类型，默认升序，需要结合sort_field字段一起使用。 - ASC 升序。 - DESC 降序。
     */
    public static final class SortTypeEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final SortTypeEnum ASC = new SortTypeEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final SortTypeEnum DESC = new SortTypeEnum("DESC");

        private static final Map<String, SortTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortTypeEnum> createStaticFields() {
            Map<String, SortTypeEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortTypeEnum(String value) {
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
        public static SortTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortTypeEnum(value));
        }

        public static SortTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortTypeEnum) {
                return this.value.equals(((SortTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private SortTypeEnum sortType;

    public ListNotificationRecordsRequest withQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 通过该类型查询桌面或桌面池相关的通知拦截记录 - DESKTOP: 查找当前projectId下与桌面相关的通知拦截记录 - DESKTOP_POOL: 查找当前projectId下与桌面池相关的通知拦截记录
     * @return queryType
     */
    public QueryTypeEnum getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
    }

    public ListNotificationRecordsRequest withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面名
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public ListNotificationRecordsRequest withDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
        return this;
    }

    /**
     * 桌面池名称，桌面池名称必须保证唯一。桌面名称只允许输入中文、大写字母、小写字母、数字、中划线，长度范围为1~255。
     * @return desktopPoolName
     */
    public String getDesktopPoolName() {
        return desktopPoolName;
    }

    public void setDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
    }

    public ListNotificationRecordsRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListNotificationRecordsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 过滤出与SMN通知类型一致的通知拦截记录 - EMAIL: 通过邮件查找通知拦截记录 - SMS: 通过短信查找通知拦截记录
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListNotificationRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
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

    public ListNotificationRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，取值范围0-1000，默认值1000。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListNotificationRecordsRequest withSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段名称，需要结合sort_type字段一起使用。 - operate_time 发送时间
     * @return sortField
     */
    public SortFieldEnum getSortField() {
        return sortField;
    }

    public void setSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
    }

    public ListNotificationRecordsRequest withSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 排序类型，默认升序，需要结合sort_field字段一起使用。 - ASC 升序。 - DESC 降序。
     * @return sortType
     */
    public SortTypeEnum getSortType() {
        return sortType;
    }

    public void setSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotificationRecordsRequest that = (ListNotificationRecordsRequest) obj;
        return Objects.equals(this.queryType, that.queryType) && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.desktopPoolName, that.desktopPoolName)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.sortType, that.sortType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(queryType, desktopName, desktopPoolName, userName, type, offset, limit, sortField, sortType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationRecordsRequest {\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    desktopPoolName: ").append(toIndentedString(desktopPoolName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
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
