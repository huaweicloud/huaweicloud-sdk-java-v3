package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCustomerIpsInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_cfw_id")

    private String ipsCfwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    public ShowCustomerIpsInfoRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID，用户创建防火墙实例后产生的唯一ID，配置后可区分不同防火墙，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ShowCustomerIpsInfoRequest withIpsCfwId(String ipsCfwId) {
        this.ipsCfwId = ipsCfwId;
        return this;
    }

    /**
     * **参数解释**： cfw侧自定义IPS规则id **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return ipsCfwId
     */
    public String getIpsCfwId() {
        return ipsCfwId;
    }

    public void setIpsCfwId(String ipsCfwId) {
        this.ipsCfwId = ipsCfwId;
    }

    public ShowCustomerIpsInfoRequest withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象ID，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志ID，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得 **约束限制**： type为0时，object_id为互联网边界防护对象ID，type为1时，object_id为VPC边界防护对象ID，type可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCustomerIpsInfoRequest that = (ShowCustomerIpsInfoRequest) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.ipsCfwId, that.ipsCfwId)
            && Objects.equals(this.objectId, that.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId, ipsCfwId, objectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomerIpsInfoRequest {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    ipsCfwId: ").append(toIndentedString(ipsCfwId)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
