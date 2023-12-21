package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NetConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic_num")

    private Integer nicNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_address_pairs")

    private List<AllowedAddressPair> allowedAddressPairs = null;

    public NetConfig withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 边缘网络ID。  约束： - 创建边缘业务仅支持使用系统规划的虚拟私有云。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public NetConfig withNicNum(Integer nicNum) {
        this.nicNum = nicNum;
        return this;
    }

    /**
     * 边缘实例绑定的网卡数量。  约束：一台边缘实例最少绑定一张网卡，最多绑定8张网卡。
     * minimum: 1
     * maximum: 8
     * @return nicNum
     */
    public Integer getNicNum() {
        return nicNum;
    }

    public void setNicNum(Integer nicNum) {
        this.nicNum = nicNum;
    }

    public NetConfig withAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    public NetConfig addAllowedAddressPairsItem(AllowedAddressPair allowedAddressPairsItem) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public NetConfig withAllowedAddressPairs(Consumer<List<AllowedAddressPair>> allowedAddressPairsSetter) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * - 功能说明：IP/Mac对列表 - 约束：     IP地址不允许为 “0.0.0.0/0”     如果allowed_address_pairs配置地址池较大的CIDR（掩码小于24位），建议为该port配置一个单独的安全组。     如果allowed_address_pairs为“1.1.1.1/0”，表示关闭源目地址检查开关
     * @return allowedAddressPairs
     */
    public List<AllowedAddressPair> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetConfig that = (NetConfig) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.nicNum, that.nicNum)
            && Objects.equals(this.allowedAddressPairs, that.allowedAddressPairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, nicNum, allowedAddressPairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetConfig {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    nicNum: ").append(toIndentedString(nicNum)).append("\n");
        sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
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
