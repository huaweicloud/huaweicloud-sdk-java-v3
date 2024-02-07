package com.huaweicloud.sdk.eip.v3.model;

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
 * GEIP实例的vn信息
 */
public class InstancevirtualListResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    /**
     * 功能说明：nexthops的转发模式  取值范围：'ACTIVE-ACTIVE'多活模式、'ACTIVE-STANDBY'主备模式
     */
    public static final class ForwardModeEnum {

        /**
         * Enum ACTIVE_ACTIVE for value: "ACTIVE-ACTIVE"
         */
        public static final ForwardModeEnum ACTIVE_ACTIVE = new ForwardModeEnum("ACTIVE-ACTIVE");

        /**
         * Enum ACTIVE_STANDBY for value: "ACTIVE-STANDBY"
         */
        public static final ForwardModeEnum ACTIVE_STANDBY = new ForwardModeEnum("ACTIVE-STANDBY");

        private static final Map<String, ForwardModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ForwardModeEnum> createStaticFields() {
            Map<String, ForwardModeEnum> map = new HashMap<>();
            map.put("ACTIVE-ACTIVE", ACTIVE_ACTIVE);
            map.put("ACTIVE-STANDBY", ACTIVE_STANDBY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ForwardModeEnum(String value) {
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
        public static ForwardModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ForwardModeEnum(value));
        }

        public static ForwardModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ForwardModeEnum) {
                return this.value.equals(((ForwardModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_mode")

    private ForwardModeEnum forwardMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    /**
     * 功能说明：nexthops在底层的负载均衡策略  取值范围：'2_TUPLE'二元组、'3_TUPLE'三元组、'5_TUPLE'五元组
     */
    public static final class HashModeEnum {

        /**
         * Enum _2_TUPLE for value: "2_TUPLE"
         */
        public static final HashModeEnum _2_TUPLE = new HashModeEnum("2_TUPLE");

        /**
         * Enum _3_TUPLE for value: "3_TUPLE"
         */
        public static final HashModeEnum _3_TUPLE = new HashModeEnum("3_TUPLE");

        /**
         * Enum _5_TUPLE for value: "5_TUPLE"
         */
        public static final HashModeEnum _5_TUPLE = new HashModeEnum("5_TUPLE");

        private static final Map<String, HashModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HashModeEnum> createStaticFields() {
            Map<String, HashModeEnum> map = new HashMap<>();
            map.put("2_TUPLE", _2_TUPLE);
            map.put("3_TUPLE", _3_TUPLE);
            map.put("5_TUPLE", _5_TUPLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HashModeEnum(String value) {
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
        public static HashModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HashModeEnum(value));
        }

        public static HashModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HashModeEnum) {
                return this.value.equals(((HashModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_mode")

    private HashModeEnum hashMode;

    /**
     * 功能说明：下一跳所属网络类型  取值范围：'VXLAN'、'VLAN'
     */
    public static final class TypeEnum {

        /**
         * Enum VLAN for value: "VLAN"
         */
        public static final TypeEnum VLAN = new TypeEnum("VLAN");

        /**
         * Enum VXLAN for value: "VXLAN"
         */
        public static final TypeEnum VXLAN = new TypeEnum("VXLAN");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("VLAN", VLAN);
            map.put("VXLAN", VXLAN);
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

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vni")

    private Integer vni;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthops")

    private List<NexthopDict> nexthops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public InstancevirtualListResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * virtualnexthop的uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstancevirtualListResp withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * virtualnexthop的所有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public InstancevirtualListResp withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 标识网关所在位置POD、AZ、REGION、GLOBAL
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public InstancevirtualListResp withForwardMode(ForwardModeEnum forwardMode) {
        this.forwardMode = forwardMode;
        return this;
    }

    /**
     * 功能说明：nexthops的转发模式  取值范围：'ACTIVE-ACTIVE'多活模式、'ACTIVE-STANDBY'主备模式
     * @return forwardMode
     */
    public ForwardModeEnum getForwardMode() {
        return forwardMode;
    }

    public void setForwardMode(ForwardModeEnum forwardMode) {
        this.forwardMode = forwardMode;
    }

    public InstancevirtualListResp withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 功能说明：网关所在集群信息，可为空  取值范围：0-36长度的字符串
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public InstancevirtualListResp withHashMode(HashModeEnum hashMode) {
        this.hashMode = hashMode;
        return this;
    }

    /**
     * 功能说明：nexthops在底层的负载均衡策略  取值范围：'2_TUPLE'二元组、'3_TUPLE'三元组、'5_TUPLE'五元组
     * @return hashMode
     */
    public HashModeEnum getHashMode() {
        return hashMode;
    }

    public void setHashMode(HashModeEnum hashMode) {
        this.hashMode = hashMode;
    }

    public InstancevirtualListResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 功能说明：下一跳所属网络类型  取值范围：'VXLAN'、'VLAN'
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public InstancevirtualListResp withVni(Integer vni) {
        this.vni = vni;
        return this;
    }

    /**
     * 功能说明：网络id标识，与type组合使用  取值范围：type=VXLAN时取值0-16777215,type=VLAN时取值0-4095
     * minimum: 0
     * maximum: 999999
     * @return vni
     */
    public Integer getVni() {
        return vni;
    }

    public void setVni(Integer vni) {
        this.vni = vni;
    }

    public InstancevirtualListResp withNexthops(List<NexthopDict> nexthops) {
        this.nexthops = nexthops;
        return this;
    }

    public InstancevirtualListResp addNexthopsItem(NexthopDict nexthopsItem) {
        if (this.nexthops == null) {
            this.nexthops = new ArrayList<>();
        }
        this.nexthops.add(nexthopsItem);
        return this;
    }

    public InstancevirtualListResp withNexthops(Consumer<List<NexthopDict>> nexthopsSetter) {
        if (this.nexthops == null) {
            this.nexthops = new ArrayList<>();
        }
        nexthopsSetter.accept(this.nexthops);
        return this;
    }

    /**
     * 下一跳信息列表
     * @return nexthops
     */
    public List<NexthopDict> getNexthops() {
        return nexthops;
    }

    public void setNexthops(List<NexthopDict> nexthops) {
        this.nexthops = nexthops;
    }

    public InstancevirtualListResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 功能说明：VirtualNexthop对象创建时间，UTC格式
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public InstancevirtualListResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 功能说明：VirtualNexthop对象更新时间，UTC格式
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstancevirtualListResp that = (InstancevirtualListResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.location, that.location) && Objects.equals(this.forwardMode, that.forwardMode)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.hashMode, that.hashMode)
            && Objects.equals(this.type, that.type) && Objects.equals(this.vni, that.vni)
            && Objects.equals(this.nexthops, that.nexthops) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, owner, location, forwardMode, clusterId, hashMode, type, vni, nexthops, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancevirtualListResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    forwardMode: ").append(toIndentedString(forwardMode)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    hashMode: ").append(toIndentedString(hashMode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vni: ").append(toIndentedString(vni)).append("\n");
        sb.append("    nexthops: ").append(toIndentedString(nexthops)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
