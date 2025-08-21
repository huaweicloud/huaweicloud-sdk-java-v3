package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSecuritySensitiveDataDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_start_time")

    private Long findStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_end_time")

    private Long findEndTime;

    /**
     * 排序字段，FIND_TIME（仅使用limit、offset分页时有效）。
     */
    public static final class OrderByEnum {

        /**
         * Enum FIND_TIME for value: "FIND_TIME"
         */
        public static final OrderByEnum FIND_TIME = new OrderByEnum("FIND_TIME");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("FIND_TIME", FIND_TIME);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_asc")

    private Boolean orderByAsc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    public ListSecuritySensitiveDataDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecuritySensitiveDataDetailsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * offset
     * minimum: 0
     * maximum: 99999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSecuritySensitiveDataDetailsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 用于游标分页，表示查询ID大于该值的记录（不包含该ID），仅支持向前翻页，且不可与offset参数同时使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSecuritySensitiveDataDetailsRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListSecuritySensitiveDataDetailsRequest withFindStartTime(Long findStartTime) {
        this.findStartTime = findStartTime;
        return this;
    }

    /**
     * 敏感数据发现开始时间。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return findStartTime
     */
    public Long getFindStartTime() {
        return findStartTime;
    }

    public void setFindStartTime(Long findStartTime) {
        this.findStartTime = findStartTime;
    }

    public ListSecuritySensitiveDataDetailsRequest withFindEndTime(Long findEndTime) {
        this.findEndTime = findEndTime;
        return this;
    }

    /**
     * 敏感数据发现结束时间。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return findEndTime
     */
    public Long getFindEndTime() {
        return findEndTime;
    }

    public void setFindEndTime(Long findEndTime) {
        this.findEndTime = findEndTime;
    }

    public ListSecuritySensitiveDataDetailsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序字段，FIND_TIME（仅使用limit、offset分页时有效）。
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListSecuritySensitiveDataDetailsRequest withOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
        return this;
    }

    /**
     * 是否升序（仅指定排序参数，且使用limit、offset分页时有效）。
     * @return orderByAsc
     */
    public Boolean getOrderByAsc() {
        return orderByAsc;
    }

    public void setOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
    }

    public ListSecuritySensitiveDataDetailsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecuritySensitiveDataDetailsRequest that = (ListSecuritySensitiveDataDetailsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.findStartTime, that.findStartTime)
            && Objects.equals(this.findEndTime, that.findEndTime) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.orderByAsc, that.orderByAsc) && Objects.equals(this.workspace, that.workspace);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(limit, offset, marker, databaseName, findStartTime, findEndTime, orderBy, orderByAsc, workspace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecuritySensitiveDataDetailsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    findStartTime: ").append(toIndentedString(findStartTime)).append("\n");
        sb.append("    findEndTime: ").append(toIndentedString(findEndTime)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    orderByAsc: ").append(toIndentedString(orderByAsc)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
