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
public class ListSupportMasksRequest {

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

    /**
     * Gets or Sets fields
     */
    public static final class FieldsEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final FieldsEnum ID = new FieldsEnum("id");

        /**
         * Enum IP_VERSION for value: "ip_version"
         */
        public static final FieldsEnum IP_VERSION = new FieldsEnum("ip_version");

        /**
         * Enum MASK for value: "mask"
         */
        public static final FieldsEnum MASK = new FieldsEnum("mask");

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final FieldsEnum CREATED_AT = new FieldsEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final FieldsEnum UPDATED_AT = new FieldsEnum("updated_at");

        private static final Map<String, FieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldsEnum> createStaticFields() {
            Map<String, FieldsEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("ip_version", IP_VERSION);
            map.put("mask", MASK);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FieldsEnum(String value) {
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
        public static FieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FieldsEnum(value));
        }

        public static FieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FieldsEnum) {
                return this.value.equals(((FieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<FieldsEnum> fields = null;

    /**
     * Gets or Sets sortKey
     */
    public static final class SortKeyEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final SortKeyEnum ID = new SortKeyEnum("id");

        /**
         * Enum IP_VERSION for value: "ip_version"
         */
        public static final SortKeyEnum IP_VERSION = new SortKeyEnum("ip_version");

        /**
         * Enum MASK for value: "mask"
         */
        public static final SortKeyEnum MASK = new SortKeyEnum("mask");

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortKeyEnum CREATED_AT = new SortKeyEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final SortKeyEnum UPDATED_AT = new SortKeyEnum("updated_at");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("ip_version", IP_VERSION);
            map.put("mask", MASK);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
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

    private List<SortKeyEnum> sortKey = null;

    /**
     * Gets or Sets sortDir
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

    private List<SortDirEnum> sortDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    /**
     * Gets or Sets ipVersion
     */
    public static final class IpVersionEnum {

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final IpVersionEnum NUMBER_4 = new IpVersionEnum(4);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final IpVersionEnum NUMBER_6 = new IpVersionEnum(6);

        private static final Map<Integer, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IpVersionEnum> createStaticFields() {
            Map<Integer, IpVersionEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IpVersionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpVersionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpVersionEnum(value));
        }

        public static IpVersionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private List<IpVersionEnum> ipVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask")

    private List<Integer> mask = null;

    public ListSupportMasksRequest withLimit(Integer limit) {
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

    public ListSupportMasksRequest withOffset(Integer offset) {
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

    public ListSupportMasksRequest withMarker(String marker) {
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

    public ListSupportMasksRequest withPageReverse(Boolean pageReverse) {
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

    public ListSupportMasksRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public ListSupportMasksRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListSupportMasksRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
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
    public List<FieldsEnum> getFields() {
        return fields;
    }

    public void setFields(List<FieldsEnum> fields) {
        this.fields = fields;
    }

    public ListSupportMasksRequest withSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListSupportMasksRequest addSortKeyItem(SortKeyEnum sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListSupportMasksRequest withSortKey(Consumer<List<SortKeyEnum>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 按照sort_key指定的字段排序
     * @return sortKey
     */
    public List<SortKeyEnum> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<SortKeyEnum> sortKey) {
        this.sortKey = sortKey;
    }

    public ListSupportMasksRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListSupportMasksRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListSupportMasksRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 排序的方向，倒序或者正序
     * @return sortDir
     */
    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    public ListSupportMasksRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListSupportMasksRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListSupportMasksRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID过滤
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListSupportMasksRequest withIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListSupportMasksRequest addIpVersionItem(IpVersionEnum ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListSupportMasksRequest withIpVersion(Consumer<List<IpVersionEnum>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * 根据IP版本过滤
     * @return ipVersion
     */
    public List<IpVersionEnum> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListSupportMasksRequest withMask(List<Integer> mask) {
        this.mask = mask;
        return this;
    }

    public ListSupportMasksRequest addMaskItem(Integer maskItem) {
        if (this.mask == null) {
            this.mask = new ArrayList<>();
        }
        this.mask.add(maskItem);
        return this;
    }

    public ListSupportMasksRequest withMask(Consumer<List<Integer>> maskSetter) {
        if (this.mask == null) {
            this.mask = new ArrayList<>();
        }
        maskSetter.accept(this.mask);
        return this;
    }

    /**
     * 根据掩码过滤
     * @return mask
     */
    public List<Integer> getMask() {
        return mask;
    }

    public void setMask(List<Integer> mask) {
        this.mask = mask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSupportMasksRequest that = (ListSupportMasksRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.id, that.id)
            && Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.mask, that.mask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, marker, pageReverse, fields, sortKey, sortDir, id, ipVersion, mask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSupportMasksRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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
