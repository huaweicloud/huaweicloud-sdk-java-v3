package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ChangeVpcRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic")

    private ChangeVpcNicBody nic;

    public ChangeVpcRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟机私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ChangeVpcRequestBody withNic(ChangeVpcNicBody nic) {
        this.nic = nic;
        return this;
    }

    public ChangeVpcRequestBody withNic(Consumer<ChangeVpcNicBody> nicSetter) {
        if (this.nic == null) {
            this.nic = new ChangeVpcNicBody();
            nicSetter.accept(this.nic);
        }

        return this;
    }

    /**
     * Get nic
     * @return nic
     */
    public ChangeVpcNicBody getNic() {
        return nic;
    }

    public void setNic(ChangeVpcNicBody nic) {
        this.nic = nic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeVpcRequestBody that = (ChangeVpcRequestBody) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.nic, that.nic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, nic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeVpcRequestBody {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
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
