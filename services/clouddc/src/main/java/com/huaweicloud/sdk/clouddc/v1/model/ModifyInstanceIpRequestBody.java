package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改服务器ip请求体。
 */
public class ModifyInstanceIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<ModifyInstanceIpRequestBodyNics> nics = null;

    public ModifyInstanceIpRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 创建网卡所属的 VPC ID，可通过 VPC API 查询：https://support.huaweicloud.com/api-vpc/vpc_api01_0003.html。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ModifyInstanceIpRequestBody withNics(List<ModifyInstanceIpRequestBodyNics> nics) {
        this.nics = nics;
        return this;
    }

    public ModifyInstanceIpRequestBody addNicsItem(ModifyInstanceIpRequestBodyNics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public ModifyInstanceIpRequestBody withNics(Consumer<List<ModifyInstanceIpRequestBodyNics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 网卡信息
     * @return nics
     */
    public List<ModifyInstanceIpRequestBodyNics> getNics() {
        return nics;
    }

    public void setNics(List<ModifyInstanceIpRequestBodyNics> nics) {
        this.nics = nics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyInstanceIpRequestBody that = (ModifyInstanceIpRequestBody) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.nics, that.nics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, nics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyInstanceIpRequestBody {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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
