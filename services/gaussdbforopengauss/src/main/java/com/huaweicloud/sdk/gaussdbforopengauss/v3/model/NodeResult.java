package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例节点信息。
 */
public class NodeResult  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip")
    

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_names")
    

    private String componentNames;

    public NodeResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public NodeResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NodeResult withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * 节点类型，取值为“master”、“slave”，分别对应于主节点、备节点。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

    public NodeResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public NodeResult withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    public NodeResult withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    


    /**
     * 节点内网IP。分布式实例类型下该参数仅针对CN节点有效，主备版实例类型下该参数对所有节点有效，且在弹性云服务器创建成功后参数值存在。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    

    public NodeResult withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    


    /**
     * 绑定的外网IP。分布式实例类型下该参数仅针对CN节点有效，主备版实例类型下该参数对所有节点有效，且在弹性云服务器创建成功并绑定弹性公网IP后参数值存在。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    

    public NodeResult withComponentNames(String componentNames) {
        this.componentNames = componentNames;
        return this;
    }

    


    /**
     * 节点上组件信息（例组件ID:分布式ID），多个组件信息用;隔开。
     * @return componentNames
     */
    public String getComponentNames() {
        return componentNames;
    }

    public void setComponentNames(String componentNames) {
        this.componentNames = componentNames;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeResult nodeResult = (NodeResult) o;
        return Objects.equals(this.id, nodeResult.id) &&
            Objects.equals(this.name, nodeResult.name) &&
            Objects.equals(this.role, nodeResult.role) &&
            Objects.equals(this.status, nodeResult.status) &&
            Objects.equals(this.availabilityZone, nodeResult.availabilityZone) &&
            Objects.equals(this.privateIp, nodeResult.privateIp) &&
            Objects.equals(this.publicIp, nodeResult.publicIp) &&
            Objects.equals(this.componentNames, nodeResult.componentNames);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, status, availabilityZone, privateIp, publicIp, componentNames);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    componentNames: ").append(toIndentedString(componentNames)).append("\n");
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

