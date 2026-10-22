package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateV2NetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_cidr")

    private String vpcCidr;

    public CreateV2NetworkResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：网络连接的ID。 **取值范围**：长度为1~64的英文、数字、中划线组合。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateV2NetworkResponse withVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    /**
     * **参数解释**：路由网段范围，标准的IPv4格式。 **取值范围**：允许网段为10.0.0.0~10.255.0.0/8~22,172.16.0.0~172.31.0.0/12~22,192.168.0.0~192.168.0.0/16~22。 
     * @return vpcCidr
     */
    public String getVpcCidr() {
        return vpcCidr;
    }

    public void setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateV2NetworkResponse that = (CreateV2NetworkResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vpcCidr, that.vpcCidr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vpcCidr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateV2NetworkResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vpcCidr: ").append(toIndentedString(vpcCidr)).append("\n");
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
