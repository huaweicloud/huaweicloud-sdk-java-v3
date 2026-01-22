package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EipInfo
 */
public class EipInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ipv6")

    private String publicIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    public EipInfo withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * **参数解释**： 弹性公网ID，可通过调用弹性IP列表查询获取，通过返回值中的data.records.id（.表示各对象之间层级的区分）获得 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public EipInfo withFwInstanceId(String fwInstanceId) {
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

    public EipInfo withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象ID，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志ID，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，注意type为0的为互联网边界防护对象ID，type为1的为VPC边界防护对象ID。 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public EipInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： IPV4地址  **约束限制**： 不涉及 **取值范围**： 不涉及   **默认取值**： 不涉及
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public EipInfo withPublicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
        return this;
    }

    /**
     * **参数解释**： IPV6地址  **约束限制**： 不涉及 **取值范围**： 不涉及   **默认取值**： 不涉及
     * @return publicIpv6
     */
    public String getPublicIpv6() {
        return publicIpv6;
    }

    public void setPublicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
    }

    public EipInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： EIP白名单标志 **约束限制**： 不涉及 **取值范围**： 0表示是EIP白名单，1表示不是EIP白名单 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipInfo that = (EipInfo) obj;
        return Objects.equals(this.eipId, that.eipId) && Objects.equals(this.fwInstanceId, that.fwInstanceId)
            && Objects.equals(this.objectId, that.objectId) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.publicIpv6, that.publicIpv6) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipId, fwInstanceId, objectId, publicIp, publicIpv6, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipInfo {\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicIpv6: ").append(toIndentedString(publicIpv6)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
