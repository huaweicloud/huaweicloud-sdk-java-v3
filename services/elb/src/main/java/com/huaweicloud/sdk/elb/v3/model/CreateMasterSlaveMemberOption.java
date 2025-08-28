package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：创建主备后端服务器请求参数。  **约束限制**：不涉及
 */
public class CreateMasterSlaveMemberOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_id")

    private String subnetCidrId;

    /**
     * **参数解释**：后端服务器的主备状态。  **约束限制**：不涉及  **取值范围**： - master：主后端服务器。 - slave：备后端服务器。  **默认取值**：不涉及
     */
    public static final class RoleEnum {

        /**
         * Enum MASTER for value: "master"
         */
        public static final RoleEnum MASTER = new RoleEnum("master");

        /**
         * Enum SLAVE for value: "slave"
         */
        public static final RoleEnum SLAVE = new RoleEnum("slave");

        private static final Map<String, RoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleEnum> createStaticFields() {
            Map<String, RoleEnum> map = new HashMap<>();
            map.put("master", MASTER);
            map.put("slave", SLAVE);
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

    public CreateMasterSlaveMemberOption withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释**：后端服务器对应的IP地址。  **约束限制**： - 若subnet_cidr_id为空，表示添加IP类型后端，此时address必须为**私网IPv4**地址。 - 若subnet_cidr_id不为空，表示是一个关联到ECS的后端服务器。该IP地址必须在subnet_cidr_id对应的子网网段中，可以是**私网IPv4**或IPv6。  **取值范围**：不涉及  **默认取值**：不涉及  [不支持IPv6，请勿设置为IPv6地址。](tag:dt)
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CreateMasterSlaveMemberOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * **参数解释**：后端服务器的管理状态。  **约束限制**：虽然创建、更新请求支持该字段，但实际取值决定于后端服务器对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。  **取值范围**：true 弹性云服务器存在，false 弹性云服务器不存在。  **默认取值**：不涉及
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateMasterSlaveMemberOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：后端服务器名称。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateMasterSlaveMemberOption withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * **参数解释**：后端服务器业务端口  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及  >在开启端口透传的pool下创建member传该字段不生效，可不传该字段。
     * minimum: 1
     * maximum: 65535
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public CreateMasterSlaveMemberOption withSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    /**
     * **参数解释**：后端服务器所在的子网ID，可以是子网的IPv4子网ID或IPv6子网ID。  **约束限制**： - 该子网和关联的负载均衡器的子网必须在同一VPC下。 - 若所属LB的IP类型后端转发特性已开启，则该字段可以不传，表示添加跨VPC的后端服务器。此时address必须为**私网IPv4**地址，所在的pool的协议必须为UDP/TCP/TLS/HTTP/HTTPS/QUIC/GRPC。  **取值范围**：不涉及  **默认取值**：不涉及  [不支持IPv6，请勿设置为IPv6子网ID。](tag:dt)
     * @return subnetCidrId
     */
    public String getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public CreateMasterSlaveMemberOption withRole(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释**：后端服务器的主备状态。  **约束限制**：不涉及  **取值范围**： - master：主后端服务器。 - slave：备后端服务器。  **默认取值**：不涉及
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMasterSlaveMemberOption that = (CreateMasterSlaveMemberOption) obj;
        return Objects.equals(this.address, that.address) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.name, that.name) && Objects.equals(this.protocolPort, that.protocolPort)
            && Objects.equals(this.subnetCidrId, that.subnetCidrId) && Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, adminStateUp, name, protocolPort, subnetCidrId, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMasterSlaveMemberOption {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    subnetCidrId: ").append(toIndentedString(subnetCidrId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
