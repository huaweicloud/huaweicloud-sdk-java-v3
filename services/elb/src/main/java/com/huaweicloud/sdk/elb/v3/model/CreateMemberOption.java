package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateMemberOption
 */
public class CreateMemberOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_port")
    
    private Integer protocolPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_cidr_id")
    
    private String subnetCidrId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weight")
    
    private Integer weight = 1;

    public CreateMemberOption withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 后端云服务器的对应的IP地址，这个IP必须在subnet_cidr_id字段的子网网段中。例如：192.168.3.11。只能指定为主网卡的IP。 subnet_cidr_id为空代表添加跨VPC后端，此时address必须为ipv4地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CreateMemberOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 后端云服务器的管理状态；该字段虽然支持创建、更新，但实际取值决定于后端云服务器对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateMemberOption withName(String name) {
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

    public CreateMemberOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 后端云服务器所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateMemberOption withProtocolPort(Integer protocolPort) {
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

    public CreateMemberOption withSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    


    /**
     * 后端云服务器所在的子网ID。该子网和后端云服务器关联的负载均衡器的子网必须在同一VPC下。只支持指定IPv4的子网ID。暂不支持IPv6。 可以不填，表示添加跨VPC后端，此时address必须为ipv4地址，pool的协议必须为TCP/HTTP/HTTPS，pool所属的LB的跨VPC后端转发能力必须打开
     * @return subnetCidrId
     */
    public String getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public CreateMemberOption withWeight(Integer weight) {
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
        CreateMemberOption createMemberOption = (CreateMemberOption) o;
        return Objects.equals(this.address, createMemberOption.address) &&
            Objects.equals(this.adminStateUp, createMemberOption.adminStateUp) &&
            Objects.equals(this.name, createMemberOption.name) &&
            Objects.equals(this.projectId, createMemberOption.projectId) &&
            Objects.equals(this.protocolPort, createMemberOption.protocolPort) &&
            Objects.equals(this.subnetCidrId, createMemberOption.subnetCidrId) &&
            Objects.equals(this.weight, createMemberOption.weight);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, adminStateUp, name, projectId, protocolPort, subnetCidrId, weight);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMemberOption {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

