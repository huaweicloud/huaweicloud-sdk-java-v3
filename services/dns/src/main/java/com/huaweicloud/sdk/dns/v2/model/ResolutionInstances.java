package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** DNS批量查询接口支持响应的维度。 **取值范围：** - dns_public_zone_id：公网域名ID - dns_public_recordset_id：公网记录集ID，需与dns_public_zone_id组合使用 - dns_private_zone_id：内网域名ID - vpc_id：VPC ID，需与dns_private_zone_id组合使用
 */
public class ResolutionInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_public_zone_id")

    private ZoneResolutionInstances dnsPublicZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_public_recordset_id")

    private RsetResolutionInstances dnsPublicRecordsetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_private_zone_id")

    private ZoneResolutionInstances dnsPrivateZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private VpcResolutionInstances vpcId;

    public ResolutionInstances withDnsPublicZoneId(ZoneResolutionInstances dnsPublicZoneId) {
        this.dnsPublicZoneId = dnsPublicZoneId;
        return this;
    }

    public ResolutionInstances withDnsPublicZoneId(Consumer<ZoneResolutionInstances> dnsPublicZoneIdSetter) {
        if (this.dnsPublicZoneId == null) {
            this.dnsPublicZoneId = new ZoneResolutionInstances();
            dnsPublicZoneIdSetter.accept(this.dnsPublicZoneId);
        }

        return this;
    }

    /**
     * Get dnsPublicZoneId
     * @return dnsPublicZoneId
     */
    public ZoneResolutionInstances getDnsPublicZoneId() {
        return dnsPublicZoneId;
    }

    public void setDnsPublicZoneId(ZoneResolutionInstances dnsPublicZoneId) {
        this.dnsPublicZoneId = dnsPublicZoneId;
    }

    public ResolutionInstances withDnsPublicRecordsetId(RsetResolutionInstances dnsPublicRecordsetId) {
        this.dnsPublicRecordsetId = dnsPublicRecordsetId;
        return this;
    }

    public ResolutionInstances withDnsPublicRecordsetId(Consumer<RsetResolutionInstances> dnsPublicRecordsetIdSetter) {
        if (this.dnsPublicRecordsetId == null) {
            this.dnsPublicRecordsetId = new RsetResolutionInstances();
            dnsPublicRecordsetIdSetter.accept(this.dnsPublicRecordsetId);
        }

        return this;
    }

    /**
     * Get dnsPublicRecordsetId
     * @return dnsPublicRecordsetId
     */
    public RsetResolutionInstances getDnsPublicRecordsetId() {
        return dnsPublicRecordsetId;
    }

    public void setDnsPublicRecordsetId(RsetResolutionInstances dnsPublicRecordsetId) {
        this.dnsPublicRecordsetId = dnsPublicRecordsetId;
    }

    public ResolutionInstances withDnsPrivateZoneId(ZoneResolutionInstances dnsPrivateZoneId) {
        this.dnsPrivateZoneId = dnsPrivateZoneId;
        return this;
    }

    public ResolutionInstances withDnsPrivateZoneId(Consumer<ZoneResolutionInstances> dnsPrivateZoneIdSetter) {
        if (this.dnsPrivateZoneId == null) {
            this.dnsPrivateZoneId = new ZoneResolutionInstances();
            dnsPrivateZoneIdSetter.accept(this.dnsPrivateZoneId);
        }

        return this;
    }

    /**
     * Get dnsPrivateZoneId
     * @return dnsPrivateZoneId
     */
    public ZoneResolutionInstances getDnsPrivateZoneId() {
        return dnsPrivateZoneId;
    }

    public void setDnsPrivateZoneId(ZoneResolutionInstances dnsPrivateZoneId) {
        this.dnsPrivateZoneId = dnsPrivateZoneId;
    }

    public ResolutionInstances withVpcId(VpcResolutionInstances vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ResolutionInstances withVpcId(Consumer<VpcResolutionInstances> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new VpcResolutionInstances();
            vpcIdSetter.accept(this.vpcId);
        }

        return this;
    }

    /**
     * Get vpcId
     * @return vpcId
     */
    public VpcResolutionInstances getVpcId() {
        return vpcId;
    }

    public void setVpcId(VpcResolutionInstances vpcId) {
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
        ResolutionInstances that = (ResolutionInstances) obj;
        return Objects.equals(this.dnsPublicZoneId, that.dnsPublicZoneId)
            && Objects.equals(this.dnsPublicRecordsetId, that.dnsPublicRecordsetId)
            && Objects.equals(this.dnsPrivateZoneId, that.dnsPrivateZoneId) && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsPublicZoneId, dnsPublicRecordsetId, dnsPrivateZoneId, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolutionInstances {\n");
        sb.append("    dnsPublicZoneId: ").append(toIndentedString(dnsPublicZoneId)).append("\n");
        sb.append("    dnsPublicRecordsetId: ").append(toIndentedString(dnsPublicRecordsetId)).append("\n");
        sb.append("    dnsPrivateZoneId: ").append(toIndentedString(dnsPrivateZoneId)).append("\n");
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
