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
public class ListSecurityDataClassificationRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level")

    private String secrecyLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    /**
     * 排序字段, createdAt, createdBy, updatedAt, updatedBy, name, description
     */
    public static final class OrderByEnum {

        /**
         * Enum CREATEDAT for value: "createdAt"
         */
        public static final OrderByEnum CREATEDAT = new OrderByEnum("createdAt");

        /**
         * Enum CREATEDBY for value: "createdBy"
         */
        public static final OrderByEnum CREATEDBY = new OrderByEnum("createdBy");

        /**
         * Enum UPDATEDAT for value: "updatedAt"
         */
        public static final OrderByEnum UPDATEDAT = new OrderByEnum("updatedAt");

        /**
         * Enum UPDATEDBY for value: "updatedBy"
         */
        public static final OrderByEnum UPDATEDBY = new OrderByEnum("updatedBy");

        /**
         * Enum NAME for value: "name"
         */
        public static final OrderByEnum NAME = new OrderByEnum("name");

        /**
         * Enum DESCRIPTION for value: "description"
         */
        public static final OrderByEnum DESCRIPTION = new OrderByEnum("description");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("createdAt", CREATEDAT);
            map.put("createdBy", CREATEDBY);
            map.put("updatedAt", UPDATEDAT);
            map.put("updatedBy", UPDATEDBY);
            map.put("name", NAME);
            map.put("description", DESCRIPTION);
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
    @JsonProperty(value = "desc")

    private Boolean desc;

    public ListSecurityDataClassificationRulesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * workspace 信息
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListSecurityDataClassificationRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移
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

    public ListSecurityDataClassificationRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询一页限制
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

    public ListSecurityDataClassificationRulesRequest withSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
        return this;
    }

    /**
     * 密级
     * @return secrecyLevel
     */
    public String getSecrecyLevel() {
        return secrecyLevel;
    }

    public void setSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
    }

    public ListSecurityDataClassificationRulesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSecurityDataClassificationRulesRequest withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 规则创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListSecurityDataClassificationRulesRequest withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 规则是否开启
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ListSecurityDataClassificationRulesRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始日期
     * minimum: 0
     * maximum: 2147483647
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListSecurityDataClassificationRulesRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束日期
     * minimum: 0
     * maximum: 2147483647
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListSecurityDataClassificationRulesRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序字段, createdAt, createdBy, updatedAt, updatedBy, name, description
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListSecurityDataClassificationRulesRequest withDesc(Boolean desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 排序规则
     * @return desc
     */
    public Boolean getDesc() {
        return desc;
    }

    public void setDesc(Boolean desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityDataClassificationRulesRequest that = (ListSecurityDataClassificationRulesRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.secrecyLevel, that.secrecyLevel)
            && Objects.equals(this.name, that.name) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(workspace, offset, limit, secrecyLevel, name, creator, enable, startTime, endTime, orderBy, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityDataClassificationRulesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    secrecyLevel: ").append(toIndentedString(secrecyLevel)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
