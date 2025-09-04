package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateProxyPrivateDnsName
 */
public class UpdateProxyPrivateDnsName {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_dns_name")

    private String newDnsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public UpdateProxyPrivateDnsName withNewDnsName(String newDnsName) {
        this.newDnsName = newDnsName;
        return this;
    }

    /**
     * **参数解释**：  新的dns名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return newDnsName
     */
    public String getNewDnsName() {
        return newDnsName;
    }

    public void setNewDnsName(String newDnsName) {
        this.newDnsName = newDnsName;
    }

    public UpdateProxyPrivateDnsName withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：            虚拟私有云ID，获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询VPC列表](https://support.huaweicloud.com/api-vpc/vpc_api01_0003.html)。  **约束限制**：   不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
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
        UpdateProxyPrivateDnsName that = (UpdateProxyPrivateDnsName) obj;
        return Objects.equals(this.newDnsName, that.newDnsName) && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newDnsName, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProxyPrivateDnsName {\n");
        sb.append("    newDnsName: ").append(toIndentedString(newDnsName)).append("\n");
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
