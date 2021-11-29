package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 创建后端服务器请求参数 */
public class CreateMemberOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 后端云服务器所在的项目ID。 */
    public static final class ProjectIdEnum {

        /** Enum _0_9A_FA_F_32_ for value: "[0-9a-fA-F]{32}" */
        public static final ProjectIdEnum _0_9A_FA_F_32_ = new ProjectIdEnum("[0-9a-fA-F]{32}");

        private static final Map<String, ProjectIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProjectIdEnum> createStaticFields() {
            Map<String, ProjectIdEnum> map = new HashMap<>();
            map.put("[0-9a-fA-F]{32}", _0_9A_FA_F_32_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProjectIdEnum(String value) {
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
        public static ProjectIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProjectIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProjectIdEnum(value);
            }
            return result;
        }

        public static ProjectIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProjectIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProjectIdEnum) {
                return this.value.equals(((ProjectIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private ProjectIdEnum projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_id")

    private String subnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public CreateMemberOption withAddress(String address) {
        this.address = address;
        return this;
    }

    /** 后端服务器对应的IP地址。 使用说明： - 若subnet_cidr_id为空，表示添加跨VPC后端，此时address必须为IPv4地址。 -
     * 若subnet_cidr_id不为空，表示是一个关联到ECS的后端服务器。该IP地址可以是IPv4或IPv6。但必须在subnet_cidr_id对应的子网网段中。且只能指定为关联ECS的主网卡IP。
     * [不支持IPv6，请勿设置为IPv6地址。](tag:otc,otc_test,dt,dt_test)
     * 
     * @return address */
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

    /** 后端云服务器的管理状态。取值：true、false。 虽然创建、更新请求支持该字段，但实际取值决定于后端云服务器对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。
     * 
     * @return adminStateUp */
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

    /** 后端云服务器名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateMemberOption withProjectId(ProjectIdEnum projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 后端云服务器所在的项目ID。
     * 
     * @return projectId */
    public ProjectIdEnum getProjectId() {
        return projectId;
    }

    public void setProjectId(ProjectIdEnum projectId) {
        this.projectId = projectId;
    }

    public CreateMemberOption withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /** 后端服务器业务端口号。 minimum: 1 maximum: 65535
     * 
     * @return protocolPort */
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

    /** 后端云服务器所在的子网ID，可以是子网的IPv4子网ID或IPv6子网ID。 使用说明： - 该子网和关联的负载均衡器的子网必须在同一VPC下。 -
     * 若所属LB的跨VPC后端转发特性已开启，则该字段可以不传，表示添加跨VPC的后端服务器。此时address必须为IPv4地址，所在的pool的协议必须为TCP/HTTP/HTTPS。
     * [不支持IPv6，请勿设置为IPv6子网ID。](tag:otc,otc_test,dt,dt_test)
     * 
     * @return subnetCidrId */
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

    /** 后端云服务器的权重，请求将根据pool配置的负载均衡算法和后端云服务器的权重进行负载分发。权重值越大，分发的请求越多。权重为0的后端不再接受新的请求。 取值：0-100，默认1。 使用说明： -
     * 若所在pool的lb_algorithm取值为SOURCE_IP，该字段无效。
     * 
     * @return weight */
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
        return Objects.equals(this.address, createMemberOption.address)
            && Objects.equals(this.adminStateUp, createMemberOption.adminStateUp)
            && Objects.equals(this.name, createMemberOption.name)
            && Objects.equals(this.projectId, createMemberOption.projectId)
            && Objects.equals(this.protocolPort, createMemberOption.protocolPort)
            && Objects.equals(this.subnetCidrId, createMemberOption.subnetCidrId)
            && Objects.equals(this.weight, createMemberOption.weight);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
