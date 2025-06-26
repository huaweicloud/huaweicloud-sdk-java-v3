package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群ELB的相关信息。 **取值范围**： 不涉及。
 */
public class ElbResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_endpoint")

    private String privateEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public ElbResp withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 公网ip。 **取值范围**： 有效的公网ipv4地址。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ElbResp withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 内网ip。 **取值范围**： 有效的内网ipv4地址。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ElbResp withPrivateEndpoint(String privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * **参数解释**： Elb终端地址。 **取值范围**： 不涉及。
     * @return privateEndpoint
     */
    public String getPrivateEndpoint() {
        return privateEndpoint;
    }

    public void setPrivateEndpoint(String privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
    }

    public ElbResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： Elb名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ElbResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： Elb的ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ElbResp withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： Elb所属VPC的ID。 **取值范围**： 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElbResp that = (ElbResp) obj;
        return Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.privateEndpoint, that.privateEndpoint) && Objects.equals(this.name, that.name)
            && Objects.equals(this.id, that.id) && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicIp, privateIp, privateEndpoint, name, id, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElbResp {\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    privateEndpoint: ").append(toIndentedString(privateEndpoint)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
