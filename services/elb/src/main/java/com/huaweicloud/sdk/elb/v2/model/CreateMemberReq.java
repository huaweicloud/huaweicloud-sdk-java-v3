package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 创建后端云服务器的请求体
 */
public class CreateMemberReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    @JacksonXmlProperty(localName = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    @JacksonXmlProperty(localName = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    @JacksonXmlProperty(localName = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    @JacksonXmlProperty(localName = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    @JacksonXmlProperty(localName = "weight")

    private Integer weight;

    public CreateMemberReq withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 后端云服务器所在的项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateMemberReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 后端云服务器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateMemberReq withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 后端云服务器的管理状态；该字段虽然支持创建、更新，但实际取值决定于后端云服务器对应的弹性云服务器是否存在。该字段虽然支持创建、更新，但实际取值决定于member对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateMemberReq withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 后端端口和协议号
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

    public CreateMemberReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 后端云服务器所在的子网ID。该子网和后端云服务器关联的负载均衡器的子网必须在同一VPC下。只支持指定IPv4的子网ID。暂不支持IPv6。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateMemberReq withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 后端云服务器的对应的IP地址，这个IP必须在subnet_id字段的子网网段中。例如：192.168.3.11。只能指定为主网卡的IP。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CreateMemberReq withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 后端云服务器的权重，请求按权重在同一后端云服务器组下的后端云服务器间分发。权重为0的后端不再接受新的请求。当后端云服务器所在的后端云服务器组的lb_algorithm的取值为SOURCE_IP时，该字段无效。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMemberReq createMemberReq = (CreateMemberReq) o;
        return Objects.equals(this.tenantId, createMemberReq.tenantId)
            && Objects.equals(this.name, createMemberReq.name)
            && Objects.equals(this.adminStateUp, createMemberReq.adminStateUp)
            && Objects.equals(this.protocolPort, createMemberReq.protocolPort)
            && Objects.equals(this.subnetId, createMemberReq.subnetId)
            && Objects.equals(this.address, createMemberReq.address)
            && Objects.equals(this.weight, createMemberReq.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, name, adminStateUp, protocolPort, subnetId, address, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMemberReq {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
