package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchCreateMembersOption
 */
public class BatchCreateMembersOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_id")

    private String subnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public BatchCreateMembersOption withName(String name) {
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

    public BatchCreateMembersOption withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**：后端服务器的可用区。  **约束限制**：仅支持IP类型后端服务器设置该字段。且后端服务器组开启可用区亲和时，IP类型后端服务器必须配置该字段为有效非空值。  **取值范围**：本region中ECS可选择的可用区。  **默认取值**：不涉及
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public BatchCreateMembersOption withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释**：后端服务器的对应的IP地址，这个IP必须在subnet_cidr_id字段的子网网段中。例如：192.168.3.11。  **约束限制**：subnet_cidr_id为空代表添加IP类型后端，此时address必须为**私网IPv4**地址。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BatchCreateMembersOption withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * **参数解释**：后端服务器业务端口。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及  [网关型LB，即pool协议为IP时，protocol_port必须设置为0。](tag:hws_eu) >在开启端口透传的pool下创建member传该字段不生效，可不传该字段。
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

    public BatchCreateMembersOption withSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    /**
     * **参数解释**：后端服务器所在的子网，可以是IPv4或IPv6子网。若是IPv4子网，使用对应子网的子网ID（neutron_subnet_id）；若是IPv6子网，使用对应子网的网络ID（neutron_network_id）。 ipv4子网的子网ID可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的neutron_subnet_id得到 ipv6子网的网络ID可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的neutron_network_id得到  **约束限制**： - 该子网和关联的负载均衡器的子网必须在同一VPC下。 - 若所属LB的IP类型后端转发已开启（ip_target_enable=true），则该字段可以不传，表示添加跨VPC的后端服务器。此时address必须为**私网IPv4**地址，所在的pool的协议必须为UDP/TCP/TLS/HTTP/HTTPS/QUIC/GRPC。 - 若所属LB未开启IP类型后端转发，该参数必填。 [- 网关型LB，即pool协议为IP时，必须指定该子网，且必须和负载均衡器的子网在同一个VPC下，但不能相同。](tag:hws_eu)  **取值范围**：不涉及  **默认取值**：不涉及  [不支持IPv6，请勿设置为IPv6子网ID。](tag:dt)
     * @return subnetCidrId
     */
    public String getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public BatchCreateMembersOption withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释**：后端服务器的权重，请求将根据pool配置的负载均衡算法和后端服务器的权重进行负载分发。权重值越大，分发的请求越多。权重为0的后端不再接受新的请求。  **约束限制**：若所在pool的lb_algorithm取值为SOURCE_IP或QUIC_CID，该字段无效。  **取值范围**：0-100  **默认取值**：1
     * minimum: 0
     * maximum: 100
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateMembersOption that = (BatchCreateMembersOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.address, that.address) && Objects.equals(this.protocolPort, that.protocolPort)
            && Objects.equals(this.subnetCidrId, that.subnetCidrId) && Objects.equals(this.weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, availabilityZone, address, protocolPort, subnetCidrId, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateMembersOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    subnetCidrId: ").append(toIndentedString(subnetCidrId)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
