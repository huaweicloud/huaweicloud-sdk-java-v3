package com.huaweicloud.sdk.geip.v3.model;

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
public class ListGeipResourceQuotasRequest {

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
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum GEIP for value: "geip"
         */
        public static final TypeEnum GEIP = new TypeEnum("geip");

        /**
         * Enum GEIP_SEGMENT for value: "geip_segment"
         */
        public static final TypeEnum GEIP_SEGMENT = new TypeEnum("geip_segment");

        /**
         * Enum INTERNETBANDWIDTHIP for value: "internetBandwidthIP"
         */
        public static final TypeEnum INTERNETBANDWIDTHIP = new TypeEnum("internetBandwidthIP");

        /**
         * Enum INTERNETBANDWIDTH for value: "internetBandwidth"
         */
        public static final TypeEnum INTERNETBANDWIDTH = new TypeEnum("internetBandwidth");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("geip", GEIP);
            map.put("geip_segment", GEIP_SEGMENT);
            map.put("internetBandwidthIP", INTERNETBANDWIDTHIP);
            map.put("internetBandwidth", INTERNETBANDWIDTH);
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

    private List<TypeEnum> type = null;

    public ListGeipResourceQuotasRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页条数
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListGeipResourceQuotasRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页起始点
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListGeipResourceQuotasRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页起始点
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListGeipResourceQuotasRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 翻页方向
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListGeipResourceQuotasRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ListGeipResourceQuotasRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListGeipResourceQuotasRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 只显示指定的字段
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public ListGeipResourceQuotasRequest withType(List<TypeEnum> type) {
        this.type = type;
        return this;
    }

    public ListGeipResourceQuotasRequest addTypeItem(TypeEnum typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListGeipResourceQuotasRequest withType(Consumer<List<TypeEnum>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 根据类型过滤
     * @return type
     */
    public List<TypeEnum> getType() {
        return type;
    }

    public void setType(List<TypeEnum> type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGeipResourceQuotasRequest that = (ListGeipResourceQuotasRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, marker, pageReverse, fields, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGeipResourceQuotasRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
