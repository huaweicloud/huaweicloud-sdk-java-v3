package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性云服务器的网络属性。
 */
public class RespAddresses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private List<RespAddr> vpcId = null;

    public RespAddresses withVpcId(List<RespAddr> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public RespAddresses addVpcIdItem(RespAddr vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public RespAddresses withVpcId(Consumer<List<RespAddr>> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * 云服务器的vpc信息。
     * @return vpcId
     */
    public List<RespAddr> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<RespAddr> vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespAddresses respAddresses = (RespAddresses) o;
        return Objects.equals(this.vpcId, respAddresses.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespAddresses {\n");
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
