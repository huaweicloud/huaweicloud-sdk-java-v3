package com.huaweicloud.sdk.ecs.v2.model;

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
public class ListResizeFlavorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_uuid")

    private String instanceUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    /**
     * 升序/降序排序，默认值为：asc。  取值范围：  - asc：表示升序。 - desc：表示降序
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDirEnum(value));
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private SortDirEnum sortDir;

    /**
     * 排序字段。  key的取值范围：  - flavorid：表示规格ID。 - sort_key的默认值为“flavorid”。 - name：表示规格名称。 - memory_mb：表示内存大小。 - vcpus：表示CPU大小。 - root_gb：表示系统盘大小。
     */
    public static final class SortKeyEnum {

        /**
         * Enum FLAVORID for value: "flavorid"
         */
        public static final SortKeyEnum FLAVORID = new SortKeyEnum("flavorid");

        /**
         * Enum SORT_KEY for value: "sort_key"
         */
        public static final SortKeyEnum SORT_KEY = new SortKeyEnum("sort_key");

        /**
         * Enum NAME for value: "name"
         */
        public static final SortKeyEnum NAME = new SortKeyEnum("name");

        /**
         * Enum MEMORY_MB for value: "memory_mb"
         */
        public static final SortKeyEnum MEMORY_MB = new SortKeyEnum("memory_mb");

        /**
         * Enum VCPUS for value: "vcpus"
         */
        public static final SortKeyEnum VCPUS = new SortKeyEnum("vcpus");

        /**
         * Enum ROOT_GB for value: "root_gb"
         */
        public static final SortKeyEnum ROOT_GB = new SortKeyEnum("root_gb");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("flavorid", FLAVORID);
            map.put("sort_key", SORT_KEY);
            map.put("name", NAME);
            map.put("memory_mb", MEMORY_MB);
            map.put("vcpus", VCPUS);
            map.put("root_gb", ROOT_GB);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortKeyEnum(value));
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private SortKeyEnum sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_flavor_id")

    private String sourceFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_flavor_name")

    private String sourceFlavorName;

    public ListResizeFlavorsRequest withInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }

    /**
     * 进行规格切换的云服务器ID，UUID格式。(instance_uuid,source_flavor_id and source_flavor_name 不能都为空)
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public ListResizeFlavorsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单页面可显示的flavor条数最大值，默认是1000。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListResizeFlavorsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 以单页最后一条flavor的ID作为分页标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListResizeFlavorsRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 升序/降序排序，默认值为：asc。  取值范围：  - asc：表示升序。 - desc：表示降序
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListResizeFlavorsRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段。  key的取值范围：  - flavorid：表示规格ID。 - sort_key的默认值为“flavorid”。 - name：表示规格名称。 - memory_mb：表示内存大小。 - vcpus：表示CPU大小。 - root_gb：表示系统盘大小。
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListResizeFlavorsRequest withSourceFlavorId(String sourceFlavorId) {
        this.sourceFlavorId = sourceFlavorId;
        return this;
    }

    /**
     * 进行规格切换的云服务器源规格ID。(instance_uuid,source_flavor_id and source_flavor_name 不能都为空)
     * @return sourceFlavorId
     */
    public String getSourceFlavorId() {
        return sourceFlavorId;
    }

    public void setSourceFlavorId(String sourceFlavorId) {
        this.sourceFlavorId = sourceFlavorId;
    }

    public ListResizeFlavorsRequest withSourceFlavorName(String sourceFlavorName) {
        this.sourceFlavorName = sourceFlavorName;
        return this;
    }

    /**
     * 进行规格切换的云服务器源规格名称。(instance_uuid,source_flavor_id and source_flavor_name 不能都为空)
     * @return sourceFlavorName
     */
    public String getSourceFlavorName() {
        return sourceFlavorName;
    }

    public void setSourceFlavorName(String sourceFlavorName) {
        this.sourceFlavorName = sourceFlavorName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResizeFlavorsRequest that = (ListResizeFlavorsRequest) obj;
        return Objects.equals(this.instanceUuid, that.instanceUuid) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sourceFlavorId, that.sourceFlavorId)
            && Objects.equals(this.sourceFlavorName, that.sourceFlavorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceUuid, limit, marker, sortDir, sortKey, sourceFlavorId, sourceFlavorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResizeFlavorsRequest {\n");
        sb.append("    instanceUuid: ").append(toIndentedString(instanceUuid)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sourceFlavorId: ").append(toIndentedString(sourceFlavorId)).append("\n");
        sb.append("    sourceFlavorName: ").append(toIndentedString(sourceFlavorName)).append("\n");
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
