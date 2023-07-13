package com.huaweicloud.sdk.cbr.v1.model;

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
public class ListProtectableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * 对象类型
     */
    public static final class ProtectableTypeEnum {

        /**
         * Enum SERVER for value: "server"
         */
        public static final ProtectableTypeEnum SERVER = new ProtectableTypeEnum("server");

        /**
         * Enum DISK for value: "disk"
         */
        public static final ProtectableTypeEnum DISK = new ProtectableTypeEnum("disk");

        private static final Map<String, ProtectableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectableTypeEnum> createStaticFields() {
            Map<String, ProtectableTypeEnum> map = new HashMap<>();
            map.put("server", SERVER);
            map.put("disk", DISK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectableTypeEnum(String value) {
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
        public static ProtectableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectableTypeEnum(value));
        }

        public static ProtectableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectableTypeEnum) {
                return this.value.equals(((ProtectableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protectable_type")

    private ProtectableTypeEnum protectableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    public ListProtectableRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，每页最多支持50条
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProtectableRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一次查询最后一条的ID
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListProtectableRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按名称过滤
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListProtectableRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移值
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProtectableRequest withProtectableType(ProtectableTypeEnum protectableType) {
        this.protectableType = protectableType;
        return this;
    }

    /**
     * 对象类型
     * @return protectableType
     */
    public ProtectableTypeEnum getProtectableType() {
        return protectableType;
    }

    public void setProtectableType(ProtectableTypeEnum protectableType) {
        this.protectableType = protectableType;
    }

    public ListProtectableRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源的状态，如available，error 等
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListProtectableRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 根据资源id过滤
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListProtectableRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 根据该id过滤属于该服务器的所有磁盘，支持企业多项目的用户才能传入此参数
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProtectableRequest that = (ListProtectableRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.name, that.name) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.protectableType, that.protectableType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.id, that.id) && Objects.equals(this.serverId, that.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, name, offset, protectableType, status, id, serverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProtectableRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    protectableType: ").append(toIndentedString(protectableType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
