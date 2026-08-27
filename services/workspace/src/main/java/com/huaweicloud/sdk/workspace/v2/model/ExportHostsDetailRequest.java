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
public class ExportHostsDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type_name")

    private String hostTypeName;

    /**
     * 云办公主机状态，available-可用的，fault-错误的，released-释放的。
     */
    public static final class StateEnum {

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StateEnum AVAILABLE = new StateEnum("available");

        /**
         * Enum FAULT for value: "fault"
         */
        public static final StateEnum FAULT = new StateEnum("fault");

        /**
         * Enum RELEASED for value: "released"
         */
        public static final StateEnum RELEASED = new StateEnum("released");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("fault", FAULT);
            map.put("released", RELEASED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

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
    @JsonProperty(value = "changes_since")

    private String changesSince;

    /**
     * 排序字段名称，需要结合sort_type字段一起使用。 - instance_total 云办公主机上的实例总数 - available_vcpus 云办公主机可用的vCPU核数 - available_memory 云办公主机可用的内存大小
     */
    public static final class SortFieldEnum {

        /**
         * Enum INSTANCE_TOTAL for value: "instance_total"
         */
        public static final SortFieldEnum INSTANCE_TOTAL = new SortFieldEnum("instance_total");

        /**
         * Enum AVAILABLE_VCPUS for value: "available_vcpus"
         */
        public static final SortFieldEnum AVAILABLE_VCPUS = new SortFieldEnum("available_vcpus");

        /**
         * Enum AVAILABLE_MEMORY for value: "available_memory"
         */
        public static final SortFieldEnum AVAILABLE_MEMORY = new SortFieldEnum("available_memory");

        private static final Map<String, SortFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortFieldEnum> createStaticFields() {
            Map<String, SortFieldEnum> map = new HashMap<>();
            map.put("instance_total", INSTANCE_TOTAL);
            map.put("available_vcpus", AVAILABLE_VCPUS);
            map.put("available_memory", AVAILABLE_MEMORY);
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

    /**
     * 语言。  - zh_CN：中文 - en_US：英文
     */
    public static final class LanguageEnum {

        /**
         * Enum ZH_CN for value: "zh_CN"
         */
        public static final LanguageEnum ZH_CN = new LanguageEnum("zh_CN");

        /**
         * Enum EN_US for value: "en_US"
         */
        public static final LanguageEnum EN_US = new LanguageEnum("en_US");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("zh_CN", ZH_CN);
            map.put("en_US", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LanguageEnum(value));
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public ExportHostsDetailRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云办公主机名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExportHostsDetailRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 云办公主机所属区域。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ExportHostsDetailRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 云办公主机的id。
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ExportHostsDetailRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ExportHostsDetailRequest withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 类型。
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public ExportHostsDetailRequest withHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
        return this;
    }

    /**
     * 云办公主机类型名称。
     * @return hostTypeName
     */
    public String getHostTypeName() {
        return hostTypeName;
    }

    public void setHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
    }

    public ExportHostsDetailRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 云办公主机状态，available-可用的，fault-错误的，released-释放的。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ExportHostsDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的数量。
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

    public ExportHostsDetailRequest withOffset(Integer offset) {
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

    public ExportHostsDetailRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页显示的最后记录的id，与offset同时使用时不生效。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ExportHostsDetailRequest withChangesSince(String changesSince) {
        this.changesSince = changesSince;
        return this;
    }

    /**
     * 过滤指定时间起状态变更的专属主机。 日期和时间戳的格式为ISO 8601：CCYY-MM-DDThh:mm:ss±hh:mm 如果包含“hh:mm”值，则将时区作为UTC的偏移量返回。例如，“2015-08-27T09:49:58-05:00”。如果您省略时区，则假定为UTC时区。
     * @return changesSince
     */
    public String getChangesSince() {
        return changesSince;
    }

    public void setChangesSince(String changesSince) {
        this.changesSince = changesSince;
    }

    public ExportHostsDetailRequest withSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段名称，需要结合sort_type字段一起使用。 - instance_total 云办公主机上的实例总数 - available_vcpus 云办公主机可用的vCPU核数 - available_memory 云办公主机可用的内存大小
     * @return sortField
     */
    public SortFieldEnum getSortField() {
        return sortField;
    }

    public void setSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
    }

    public ExportHostsDetailRequest withSortType(SortTypeEnum sortType) {
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

    public ExportHostsDetailRequest withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 语言。  - zh_CN：中文 - en_US：英文
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportHostsDetailRequest that = (ExportHostsDetailRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.hostType, that.hostType) && Objects.equals(this.hostTypeName, that.hostTypeName)
            && Objects.equals(this.state, that.state) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.changesSince, that.changesSince) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortType, that.sortType) && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            availabilityZone,
            hostId,
            enterpriseProjectId,
            hostType,
            hostTypeName,
            state,
            limit,
            offset,
            marker,
            changesSince,
            sortField,
            sortType,
            language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportHostsDetailRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    hostTypeName: ").append(toIndentedString(hostTypeName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    changesSince: ").append(toIndentedString(changesSince)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
