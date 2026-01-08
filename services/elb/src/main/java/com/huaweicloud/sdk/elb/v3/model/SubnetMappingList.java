package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 源子网信息和目标子网的对应关系
 */
public class SubnetMappingList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_id")

    private String subnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_subnet_cidr_id")

    private String dstSubnetCidrId;

    public SubnetMappingList withSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    /**
     * **参数解释**：源监听器下后端服务器所在VPC的子网ID。  **约束限制**：不涉及  **取值范围**：标准的UUID格式，长度为36个字符。  **默认取值**：不涉及
     * @return subnetCidrId
     */
    public String getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public SubnetMappingList withDstSubnetCidrId(String dstSubnetCidrId) {
        this.dstSubnetCidrId = dstSubnetCidrId;
        return this;
    }

    /**
     * **参数解释**：新监听器下后端服务器需要绑定的VPC子网ID。  **约束限制**：该VPC子网ID需要存在，且与源子网网段相同。  **取值范围**：标准的UUID格式，长度为36个字符。  **默认取值**：不涉及
     * @return dstSubnetCidrId
     */
    public String getDstSubnetCidrId() {
        return dstSubnetCidrId;
    }

    public void setDstSubnetCidrId(String dstSubnetCidrId) {
        this.dstSubnetCidrId = dstSubnetCidrId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubnetMappingList that = (SubnetMappingList) obj;
        return Objects.equals(this.subnetCidrId, that.subnetCidrId)
            && Objects.equals(this.dstSubnetCidrId, that.dstSubnetCidrId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetCidrId, dstSubnetCidrId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubnetMappingList {\n");
        sb.append("    subnetCidrId: ").append(toIndentedString(subnetCidrId)).append("\n");
        sb.append("    dstSubnetCidrId: ").append(toIndentedString(dstSubnetCidrId)).append("\n");
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
