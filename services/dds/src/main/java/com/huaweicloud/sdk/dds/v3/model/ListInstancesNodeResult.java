package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 实例节点信息。
 */
public class ListInstancesNodeResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private String role;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip")
    
    private String privateIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private String publicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    private String specCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;

    public ListInstancesNodeResult withId(String id) {
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

    public ListInstancesNodeResult withName(String name) {
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

    public ListInstancesNodeResult withStatus(String status) {
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

    public ListInstancesNodeResult withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * 节点角色。 社区版实例下节点角色的取值： - master，mongos节点返回该值。 - Primary，shard组主节点、config组主节点、副本集主节点、单节点返回该值。 - Secondary，shard组备节点、config组备节点、副本集备节点返回该值。 - Hidden，shard组隐藏节点、config组隐藏节点、副本集隐藏节点返回该值。 - unknown，节点异常时返回该值。 增强版实例下节点角色的取值： - master，mongos节点返回该值。 - Primary，shard节点返回该值。 - unknown，节点异常时返回该值。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ListInstancesNodeResult withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    


    /**
     * 节点内网IP。该参数仅针对集群实例的mongos节点、副本集实例、以及单节点实例有效，且在弹性云服务器创建成功后参数值存在，否则，值为\"\"。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ListInstancesNodeResult withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    


    /**
     * 绑定的外网IP。该参数值为\"\"。该参数仅针对集群实例的mongos节点、副本集实例的主节点和备节点、以及单节点实例有效。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ListInstancesNodeResult withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 资源规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ListInstancesNodeResult withAvailabilityZone(String availabilityZone) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesNodeResult listInstancesNodeResult = (ListInstancesNodeResult) o;
        return Objects.equals(this.id, listInstancesNodeResult.id) &&
            Objects.equals(this.name, listInstancesNodeResult.name) &&
            Objects.equals(this.status, listInstancesNodeResult.status) &&
            Objects.equals(this.role, listInstancesNodeResult.role) &&
            Objects.equals(this.privateIp, listInstancesNodeResult.privateIp) &&
            Objects.equals(this.publicIp, listInstancesNodeResult.publicIp) &&
            Objects.equals(this.specCode, listInstancesNodeResult.specCode) &&
            Objects.equals(this.availabilityZone, listInstancesNodeResult.availabilityZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, role, privateIp, publicIp, specCode, availabilityZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesNodeResult {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    role: ").append(toIndentedString(role)).append("\n");
            sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
            sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
            sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
            sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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

