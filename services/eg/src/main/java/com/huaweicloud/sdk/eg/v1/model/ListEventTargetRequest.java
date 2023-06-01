package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListEventTargetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuzzy_label")

    private String fuzzyLabel;

    /**
     * Gets or Sets supportTypes
     */
    public static final class SupportTypesEnum {

        /**
         * Enum SUBSCRIPTION for value: "SUBSCRIPTION"
         */
        public static final SupportTypesEnum SUBSCRIPTION = new SupportTypesEnum("SUBSCRIPTION");

        /**
         * Enum FLOW for value: "FLOW"
         */
        public static final SupportTypesEnum FLOW = new SupportTypesEnum("FLOW");

        private static final Map<String, SupportTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportTypesEnum> createStaticFields() {
            Map<String, SupportTypesEnum> map = new HashMap<>();
            map.put("SUBSCRIPTION", SUBSCRIPTION);
            map.put("FLOW", FLOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportTypesEnum(String value) {
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
        public static SupportTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SupportTypesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SupportTypesEnum(value);
            }
            return result;
        }

        public static SupportTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SupportTypesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportTypesEnum) {
                return this.value.equals(((SupportTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_types")

    private List<SupportTypesEnum> supportTypes = null;

    public ListEventTargetRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，偏移量不能小于0
     * minimum: 0
     * maximum: 100
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEventTargetRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，不能小于1或大于1000
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEventTargetRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 指定查询排序
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListEventTargetRequest withFuzzyLabel(String fuzzyLabel) {
        this.fuzzyLabel = fuzzyLabel;
        return this;
    }

    /**
     * 指定查询的事件目标标签，模糊匹配
     * @return fuzzyLabel
     */
    public String getFuzzyLabel() {
        return fuzzyLabel;
    }

    public void setFuzzyLabel(String fuzzyLabel) {
        this.fuzzyLabel = fuzzyLabel;
    }

    public ListEventTargetRequest withSupportTypes(List<SupportTypesEnum> supportTypes) {
        this.supportTypes = supportTypes;
        return this;
    }

    public ListEventTargetRequest addSupportTypesItem(SupportTypesEnum supportTypesItem) {
        if (this.supportTypes == null) {
            this.supportTypes = new ArrayList<>();
        }
        this.supportTypes.add(supportTypesItem);
        return this;
    }

    public ListEventTargetRequest withSupportTypes(Consumer<List<SupportTypesEnum>> supportTypesSetter) {
        if (this.supportTypes == null) {
            this.supportTypes = new ArrayList<>();
        }
        supportTypesSetter.accept(this.supportTypes);
        return this;
    }

    /**
     * 事件目标支持方式：事件订阅：SUBSCRIPTION、事件流：FLOW
     * @return supportTypes
     */
    public List<SupportTypesEnum> getSupportTypes() {
        return supportTypes;
    }

    public void setSupportTypes(List<SupportTypesEnum> supportTypes) {
        this.supportTypes = supportTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventTargetRequest listEventTargetRequest = (ListEventTargetRequest) o;
        return Objects.equals(this.offset, listEventTargetRequest.offset)
            && Objects.equals(this.limit, listEventTargetRequest.limit)
            && Objects.equals(this.sort, listEventTargetRequest.sort)
            && Objects.equals(this.fuzzyLabel, listEventTargetRequest.fuzzyLabel)
            && Objects.equals(this.supportTypes, listEventTargetRequest.supportTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, sort, fuzzyLabel, supportTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventTargetRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    fuzzyLabel: ").append(toIndentedString(fuzzyLabel)).append("\n");
        sb.append("    supportTypes: ").append(toIndentedString(supportTypes)).append("\n");
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
