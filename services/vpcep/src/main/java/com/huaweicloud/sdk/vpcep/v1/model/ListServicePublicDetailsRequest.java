package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListServicePublicDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service_name")

    @JacksonXmlProperty(localName = "endpoint_service_name")

    private String endpointServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    /**
     * 查询结果中终端节点服务列表的排序字段，取值为： ● create_at：终端节点服务的创建时间 ● update_at：终端节点服务的更新时间 默认值为create_at。
     */
    public static final class SortKeyEnum {

        /**
         * Enum CREATE_AT for value: "create_at"
         */
        public static final SortKeyEnum CREATE_AT = new SortKeyEnum("create_at");

        /**
         * Enum UPDATE_AT for value: "update_at"
         */
        public static final SortKeyEnum UPDATE_AT = new SortKeyEnum("update_at");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("create_at", CREATE_AT);
            map.put("update_at", UPDATE_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortKeyEnum(value);
            }
            return result;
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    @JacksonXmlProperty(localName = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * 查询结果中终端节点服务列表的排序方式，取值为： ● desc：降序排序 ● asc：升序排序 默认值为desc。
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    @JacksonXmlProperty(localName = "sort_dir")

    private SortDirEnum sortDir;

    public ListServicePublicDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回公共的终端节点服务数量限制，即每页返回的个数。 取值范围：0~1000，取值一般为10，20或者50，默认为10。
     * minimum: 1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListServicePublicDetailsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。 偏移量为一个大于0小于终端节点服务总个数的整数，表示从偏移量后面的终端节点服务开始查询。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListServicePublicDetailsRequest withEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
        return this;
    }

    /**
     * 公共终端节点服务的名称，支持大小写以及模糊匹配。
     * @return endpointServiceName
     */
    public String getEndpointServiceName() {
        return endpointServiceName;
    }

    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    public ListServicePublicDetailsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 公共终端节点服务的ID，唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListServicePublicDetailsRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 查询结果中终端节点服务列表的排序字段，取值为： ● create_at：终端节点服务的创建时间 ● update_at：终端节点服务的更新时间 默认值为create_at。
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListServicePublicDetailsRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 查询结果中终端节点服务列表的排序方式，取值为： ● desc：降序排序 ● asc：升序排序 默认值为desc。
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServicePublicDetailsRequest listServicePublicDetailsRequest = (ListServicePublicDetailsRequest) o;
        return Objects.equals(this.limit, listServicePublicDetailsRequest.limit)
            && Objects.equals(this.offset, listServicePublicDetailsRequest.offset)
            && Objects.equals(this.endpointServiceName, listServicePublicDetailsRequest.endpointServiceName)
            && Objects.equals(this.id, listServicePublicDetailsRequest.id)
            && Objects.equals(this.sortKey, listServicePublicDetailsRequest.sortKey)
            && Objects.equals(this.sortDir, listServicePublicDetailsRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, endpointServiceName, id, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServicePublicDetailsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    endpointServiceName: ").append(toIndentedString(endpointServiceName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
