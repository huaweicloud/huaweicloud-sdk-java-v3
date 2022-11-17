package com.huaweicloud.sdk.dc.v3.model;

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
public class ShowHostedDirectConnectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_connect_id")

    private String hostedConnectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

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

    private List<SortDirEnum> sortDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting_id")

    private List<String> hostingId = null;

    public ShowHostedDirectConnectRequest withHostedConnectId(String hostedConnectId) {
        this.hostedConnectId = hostedConnectId;
        return this;
    }

    /**
     * 托管专线连接ID。
     * @return hostedConnectId
     */
    public String getHostedConnectId() {
        return hostedConnectId;
    }

    public void setHostedConnectId(String hostedConnectId) {
        this.hostedConnectId = hostedConnectId;
    }

    public ShowHostedDirectConnectRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowHostedDirectConnectRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条资源记录的ID，为空时为查询第一页。 使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ShowHostedDirectConnectRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ShowHostedDirectConnectRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowHostedDirectConnectRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 显示字段列表
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public ShowHostedDirectConnectRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ShowHostedDirectConnectRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ShowHostedDirectConnectRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 返回结果按照升序(asc)或降序(desc)排列，默认为asc
     * @return sortDir
     */
    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    public ShowHostedDirectConnectRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ShowHostedDirectConnectRequest withHostingId(List<String> hostingId) {
        this.hostingId = hostingId;
        return this;
    }

    public ShowHostedDirectConnectRequest addHostingIdItem(String hostingIdItem) {
        if (this.hostingId == null) {
            this.hostingId = new ArrayList<>();
        }
        this.hostingId.add(hostingIdItem);
        return this;
    }

    public ShowHostedDirectConnectRequest withHostingId(Consumer<List<String>> hostingIdSetter) {
        if (this.hostingId == null) {
            this.hostingId = new ArrayList<>();
        }
        hostingIdSetter.accept(this.hostingId);
        return this;
    }

    /**
     * 根椐运营专线ID过滤托管专线列表
     * @return hostingId
     */
    public List<String> getHostingId() {
        return hostingId;
    }

    public void setHostingId(List<String> hostingId) {
        this.hostingId = hostingId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHostedDirectConnectRequest showHostedDirectConnectRequest = (ShowHostedDirectConnectRequest) o;
        return Objects.equals(this.hostedConnectId, showHostedDirectConnectRequest.hostedConnectId)
            && Objects.equals(this.limit, showHostedDirectConnectRequest.limit)
            && Objects.equals(this.marker, showHostedDirectConnectRequest.marker)
            && Objects.equals(this.fields, showHostedDirectConnectRequest.fields)
            && Objects.equals(this.sortDir, showHostedDirectConnectRequest.sortDir)
            && Objects.equals(this.sortKey, showHostedDirectConnectRequest.sortKey)
            && Objects.equals(this.hostingId, showHostedDirectConnectRequest.hostingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostedConnectId, limit, marker, fields, sortDir, sortKey, hostingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHostedDirectConnectRequest {\n");
        sb.append("    hostedConnectId: ").append(toIndentedString(hostedConnectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    hostingId: ").append(toIndentedString(hostingId)).append("\n");
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
