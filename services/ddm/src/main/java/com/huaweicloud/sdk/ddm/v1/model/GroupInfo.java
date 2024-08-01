package com.huaweicloud.sdk.ddm.v1.model;

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
 * GroupInfo
 */
public class GroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 组角色类型。
     */
    public static final class RoleEnum {

        /**
         * Enum RW for value: "rw"
         */
        public static final RoleEnum RW = new RoleEnum("rw");

        /**
         * Enum R for value: "r"
         */
        public static final RoleEnum R = new RoleEnum("r");

        private static final Map<String, RoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleEnum> createStaticFields() {
            Map<String, RoleEnum> map = new HashMap<>();
            map.put("rw", RW);
            map.put("r", R);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoleEnum(value));
        }

        public static RoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleEnum) {
                return this.value.equals(((RoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private RoleEnum role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_endpoint")

    private String ipv6Endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_load_balance")

    private Boolean isLoadBalance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default_group")

    private Boolean isDefaultGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_num_per_node")

    private Integer cpuNumPerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_num_per_node")

    private Integer memNumPerNode;

    /**
     * CPU架构。
     */
    public static final class ArchitectureEnum {

        /**
         * Enum X86 for value: "X86"
         */
        public static final ArchitectureEnum X86 = new ArchitectureEnum("X86");

        /**
         * Enum ARM for value: "ARM"
         */
        public static final ArchitectureEnum ARM = new ArchitectureEnum("ARM");

        private static final Map<String, ArchitectureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchitectureEnum> createStaticFields() {
            Map<String, ArchitectureEnum> map = new HashMap<>();
            map.put("X86", X86);
            map.put("ARM", ARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchitectureEnum(String value) {
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
        public static ArchitectureEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchitectureEnum(value));
        }

        public static ArchitectureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchitectureEnum) {
                return this.value.equals(((ArchitectureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private ArchitectureEnum architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<GroupNodeInfo> nodeList = null;

    public GroupInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupInfo withRole(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * 组角色类型。
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public GroupInfo withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 组连接地址，如未开启负载均衡，则返回的是组内节点连接地址串。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public GroupInfo withIpv6Endpoint(String ipv6Endpoint) {
        this.ipv6Endpoint = ipv6Endpoint;
        return this;
    }

    /**
     * 组ipv6连接地址。
     * @return ipv6Endpoint
     */
    public String getIpv6Endpoint() {
        return ipv6Endpoint;
    }

    public void setIpv6Endpoint(String ipv6Endpoint) {
        this.ipv6Endpoint = ipv6Endpoint;
    }

    public GroupInfo withIsLoadBalance(Boolean isLoadBalance) {
        this.isLoadBalance = isLoadBalance;
        return this;
    }

    /**
     * 是否开启负载均衡。
     * @return isLoadBalance
     */
    public Boolean getIsLoadBalance() {
        return isLoadBalance;
    }

    public void setIsLoadBalance(Boolean isLoadBalance) {
        this.isLoadBalance = isLoadBalance;
    }

    public GroupInfo withIsDefaultGroup(Boolean isDefaultGroup) {
        this.isDefaultGroup = isDefaultGroup;
        return this;
    }

    /**
     * 是否默认组。
     * @return isDefaultGroup
     */
    public Boolean getIsDefaultGroup() {
        return isDefaultGroup;
    }

    public void setIsDefaultGroup(Boolean isDefaultGroup) {
        this.isDefaultGroup = isDefaultGroup;
    }

    public GroupInfo withCpuNumPerNode(Integer cpuNumPerNode) {
        this.cpuNumPerNode = cpuNumPerNode;
        return this;
    }

    /**
     * 单节点CPU核数。
     * @return cpuNumPerNode
     */
    public Integer getCpuNumPerNode() {
        return cpuNumPerNode;
    }

    public void setCpuNumPerNode(Integer cpuNumPerNode) {
        this.cpuNumPerNode = cpuNumPerNode;
    }

    public GroupInfo withMemNumPerNode(Integer memNumPerNode) {
        this.memNumPerNode = memNumPerNode;
        return this;
    }

    /**
     * 单节点内存大小,单位G。
     * @return memNumPerNode
     */
    public Integer getMemNumPerNode() {
        return memNumPerNode;
    }

    public void setMemNumPerNode(Integer memNumPerNode) {
        this.memNumPerNode = memNumPerNode;
    }

    public GroupInfo withArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * CPU架构。
     * @return architecture
     */
    public ArchitectureEnum getArchitecture() {
        return architecture;
    }

    public void setArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
    }

    public GroupInfo withNodeList(List<GroupNodeInfo> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public GroupInfo addNodeListItem(GroupNodeInfo nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public GroupInfo withNodeList(Consumer<List<GroupNodeInfo>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * 节点信息列表。
     * @return nodeList
     */
    public List<GroupNodeInfo> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<GroupNodeInfo> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupInfo that = (GroupInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.role, that.role) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.ipv6Endpoint, that.ipv6Endpoint)
            && Objects.equals(this.isLoadBalance, that.isLoadBalance)
            && Objects.equals(this.isDefaultGroup, that.isDefaultGroup)
            && Objects.equals(this.cpuNumPerNode, that.cpuNumPerNode)
            && Objects.equals(this.memNumPerNode, that.memNumPerNode)
            && Objects.equals(this.architecture, that.architecture) && Objects.equals(this.nodeList, that.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            role,
            endpoint,
            ipv6Endpoint,
            isLoadBalance,
            isDefaultGroup,
            cpuNumPerNode,
            memNumPerNode,
            architecture,
            nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    ipv6Endpoint: ").append(toIndentedString(ipv6Endpoint)).append("\n");
        sb.append("    isLoadBalance: ").append(toIndentedString(isLoadBalance)).append("\n");
        sb.append("    isDefaultGroup: ").append(toIndentedString(isDefaultGroup)).append("\n");
        sb.append("    cpuNumPerNode: ").append(toIndentedString(cpuNumPerNode)).append("\n");
        sb.append("    memNumPerNode: ").append(toIndentedString(memNumPerNode)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
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
