package com.huaweicloud.sdk.cloudpond.v1.model;

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
public class ListEdgeSiteMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    /**
     * 指定维度查询 - site_id: 按站点维度，查询站点下计算、存储资源容量信息 - flavor: 按规格维度，查询站点下各flavor的计算资源使用情况 - storage: 按存储维度，查询站点下各存储资源类型的使用情况 - flavor_capacity: 按规格容量维度，查询站点下各规格可发放数量预测
     */
    public static final class DimEnum {

        /**
         * Enum SITE_ID for value: "site_id"
         */
        public static final DimEnum SITE_ID = new DimEnum("site_id");

        /**
         * Enum FLAVOR for value: "flavor"
         */
        public static final DimEnum FLAVOR = new DimEnum("flavor");

        /**
         * Enum STORAGE for value: "storage"
         */
        public static final DimEnum STORAGE = new DimEnum("storage");

        /**
         * Enum FLAVOR_CAPACITY for value: "flavor_capacity"
         */
        public static final DimEnum FLAVOR_CAPACITY = new DimEnum("flavor_capacity");

        private static final Map<String, DimEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimEnum> createStaticFields() {
            Map<String, DimEnum> map = new HashMap<>();
            map.put("site_id", SITE_ID);
            map.put("flavor", FLAVOR);
            map.put("storage", STORAGE);
            map.put("flavor_capacity", FLAVOR_CAPACITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimEnum(String value) {
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
        public static DimEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DimEnum(value));
        }

        public static DimEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimEnum) {
                return this.value.equals(((DimEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim")

    private DimEnum dim;

    public ListEdgeSiteMetricsRequest withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 边缘小站ID
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public ListEdgeSiteMetricsRequest withDim(DimEnum dim) {
        this.dim = dim;
        return this;
    }

    /**
     * 指定维度查询 - site_id: 按站点维度，查询站点下计算、存储资源容量信息 - flavor: 按规格维度，查询站点下各flavor的计算资源使用情况 - storage: 按存储维度，查询站点下各存储资源类型的使用情况 - flavor_capacity: 按规格容量维度，查询站点下各规格可发放数量预测
     * @return dim
     */
    public DimEnum getDim() {
        return dim;
    }

    public void setDim(DimEnum dim) {
        this.dim = dim;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEdgeSiteMetricsRequest that = (ListEdgeSiteMetricsRequest) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.dim, that.dim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, dim);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeSiteMetricsRequest {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    dim: ").append(toIndentedString(dim)).append("\n");
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
