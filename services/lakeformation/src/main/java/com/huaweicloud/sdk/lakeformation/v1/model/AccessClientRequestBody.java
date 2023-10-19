package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * 创建接入客户端的请求信息
 */
public class AccessClientRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 接入模式， SYSTEM：系统默认模式，由系统自动创建vpcep连接，也是推荐方式。该模式下vpc_id、subnet_id必填。 CUSTOM：定制模式，由外部服务自行创建vpcep连接，适用于跨租户场景等。该模式下access_connection必填。
     */
    public static final class AccessModeEnum {

        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final AccessModeEnum SYSTEM = new AccessModeEnum("SYSTEM");

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final AccessModeEnum CUSTOM = new AccessModeEnum("CUSTOM");

        private static final Map<String, AccessModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessModeEnum> createStaticFields() {
            Map<String, AccessModeEnum> map = new HashMap<>();
            map.put("SYSTEM", SYSTEM);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessModeEnum(String value) {
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
        public static AccessModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessModeEnum(value));
        }

        public static AccessModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessModeEnum) {
                return this.value.equals(((AccessModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private AccessModeEnum accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_connections")

    private List<AccessConnectionRequestBody> accessConnections = null;

    public AccessClientRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 客户端名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessClientRequestBody withAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 接入模式， SYSTEM：系统默认模式，由系统自动创建vpcep连接，也是推荐方式。该模式下vpc_id、subnet_id必填。 CUSTOM：定制模式，由外部服务自行创建vpcep连接，适用于跨租户场景等。该模式下access_connection必填。
     * @return accessMode
     */
    public AccessModeEnum getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
    }

    public AccessClientRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public AccessClientRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public AccessClientRequestBody withAccessConnections(List<AccessConnectionRequestBody> accessConnections) {
        this.accessConnections = accessConnections;
        return this;
    }

    public AccessClientRequestBody addAccessConnectionsItem(AccessConnectionRequestBody accessConnectionsItem) {
        if (this.accessConnections == null) {
            this.accessConnections = new ArrayList<>();
        }
        this.accessConnections.add(accessConnectionsItem);
        return this;
    }

    public AccessClientRequestBody withAccessConnections(
        Consumer<List<AccessConnectionRequestBody>> accessConnectionsSetter) {
        if (this.accessConnections == null) {
            this.accessConnections = new ArrayList<>();
        }
        accessConnectionsSetter.accept(this.accessConnections);
        return this;
    }

    /**
     * 接入连接列表
     * @return accessConnections
     */
    public List<AccessConnectionRequestBody> getAccessConnections() {
        return accessConnections;
    }

    public void setAccessConnections(List<AccessConnectionRequestBody> accessConnections) {
        this.accessConnections = accessConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessClientRequestBody that = (AccessClientRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.accessMode, that.accessMode)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.accessConnections, that.accessConnections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accessMode, vpcId, subnetId, accessConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessClientRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    accessConnections: ").append(toIndentedString(accessConnections)).append("\n");
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
