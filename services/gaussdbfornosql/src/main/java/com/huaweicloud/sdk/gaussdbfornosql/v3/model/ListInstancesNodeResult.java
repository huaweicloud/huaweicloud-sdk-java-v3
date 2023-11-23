package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例节点信息。
 */
public class ListInstancesNodeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_reduce")

    private Boolean supportReduce;

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
     * 节点角色。 该参数仅对GeminiDB Mongo引擎的副本集实例有效。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ListInstancesNodeResult withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 节点所在的子网的ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ListInstancesNodeResult withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 节点内网IP。在弹性云服务器创建成功后参数值存在，否则，值为\"\"。
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
     * 绑定的公网IP。该参数仅针对绑定了公网IP的节点有效。
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
     * 资源规格编码。关于实例的规格信息，请参见查询所有实例规格信息中响应参数“flavors.spec_code”的值。
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

    public ListInstancesNodeResult withSupportReduce(Boolean supportReduce) {
        this.supportReduce = supportReduce;
        return this;
    }

    /**
     * 是否支持节点缩容。 - true，表示该节点支持节点缩容。 - false，表示该节点不支持节点缩容。
     * @return supportReduce
     */
    public Boolean getSupportReduce() {
        return supportReduce;
    }

    public void setSupportReduce(Boolean supportReduce) {
        this.supportReduce = supportReduce;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesNodeResult that = (ListInstancesNodeResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.role, that.role)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.supportReduce, that.supportReduce);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, status, role, subnetId, privateIp, publicIp, specCode, availabilityZone, supportReduce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesNodeResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    supportReduce: ").append(toIndentedString(supportReduce)).append("\n");
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
