package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产详细属性。
 */
public class Properties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hwc_ecs")

    private HwcEcs hwcEcs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hwc_eip")

    private HwcEip hwcEip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hwc_vpc")

    private HwcVpc hwcVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hwc_subnet")

    private HwcSubnet hwcSubnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hwc_rds")

    private HwcRds hwcRds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hwc_domain")

    private HwcDomain hwcDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "website")

    private Website website;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oca_ip")

    private OcaIp ocaIp;

    public Properties withHwcEcs(HwcEcs hwcEcs) {
        this.hwcEcs = hwcEcs;
        return this;
    }

    public Properties withHwcEcs(Consumer<HwcEcs> hwcEcsSetter) {
        if (this.hwcEcs == null) {
            this.hwcEcs = new HwcEcs();
            hwcEcsSetter.accept(this.hwcEcs);
        }

        return this;
    }

    /**
     * Get hwcEcs
     * @return hwcEcs
     */
    public HwcEcs getHwcEcs() {
        return hwcEcs;
    }

    public void setHwcEcs(HwcEcs hwcEcs) {
        this.hwcEcs = hwcEcs;
    }

    public Properties withHwcEip(HwcEip hwcEip) {
        this.hwcEip = hwcEip;
        return this;
    }

    public Properties withHwcEip(Consumer<HwcEip> hwcEipSetter) {
        if (this.hwcEip == null) {
            this.hwcEip = new HwcEip();
            hwcEipSetter.accept(this.hwcEip);
        }

        return this;
    }

    /**
     * Get hwcEip
     * @return hwcEip
     */
    public HwcEip getHwcEip() {
        return hwcEip;
    }

    public void setHwcEip(HwcEip hwcEip) {
        this.hwcEip = hwcEip;
    }

    public Properties withHwcVpc(HwcVpc hwcVpc) {
        this.hwcVpc = hwcVpc;
        return this;
    }

    public Properties withHwcVpc(Consumer<HwcVpc> hwcVpcSetter) {
        if (this.hwcVpc == null) {
            this.hwcVpc = new HwcVpc();
            hwcVpcSetter.accept(this.hwcVpc);
        }

        return this;
    }

    /**
     * Get hwcVpc
     * @return hwcVpc
     */
    public HwcVpc getHwcVpc() {
        return hwcVpc;
    }

    public void setHwcVpc(HwcVpc hwcVpc) {
        this.hwcVpc = hwcVpc;
    }

    public Properties withHwcSubnet(HwcSubnet hwcSubnet) {
        this.hwcSubnet = hwcSubnet;
        return this;
    }

    public Properties withHwcSubnet(Consumer<HwcSubnet> hwcSubnetSetter) {
        if (this.hwcSubnet == null) {
            this.hwcSubnet = new HwcSubnet();
            hwcSubnetSetter.accept(this.hwcSubnet);
        }

        return this;
    }

    /**
     * Get hwcSubnet
     * @return hwcSubnet
     */
    public HwcSubnet getHwcSubnet() {
        return hwcSubnet;
    }

    public void setHwcSubnet(HwcSubnet hwcSubnet) {
        this.hwcSubnet = hwcSubnet;
    }

    public Properties withHwcRds(HwcRds hwcRds) {
        this.hwcRds = hwcRds;
        return this;
    }

    public Properties withHwcRds(Consumer<HwcRds> hwcRdsSetter) {
        if (this.hwcRds == null) {
            this.hwcRds = new HwcRds();
            hwcRdsSetter.accept(this.hwcRds);
        }

        return this;
    }

    /**
     * Get hwcRds
     * @return hwcRds
     */
    public HwcRds getHwcRds() {
        return hwcRds;
    }

    public void setHwcRds(HwcRds hwcRds) {
        this.hwcRds = hwcRds;
    }

    public Properties withHwcDomain(HwcDomain hwcDomain) {
        this.hwcDomain = hwcDomain;
        return this;
    }

    public Properties withHwcDomain(Consumer<HwcDomain> hwcDomainSetter) {
        if (this.hwcDomain == null) {
            this.hwcDomain = new HwcDomain();
            hwcDomainSetter.accept(this.hwcDomain);
        }

        return this;
    }

    /**
     * Get hwcDomain
     * @return hwcDomain
     */
    public HwcDomain getHwcDomain() {
        return hwcDomain;
    }

    public void setHwcDomain(HwcDomain hwcDomain) {
        this.hwcDomain = hwcDomain;
    }

    public Properties withWebsite(Website website) {
        this.website = website;
        return this;
    }

    public Properties withWebsite(Consumer<Website> websiteSetter) {
        if (this.website == null) {
            this.website = new Website();
            websiteSetter.accept(this.website);
        }

        return this;
    }

    /**
     * Get website
     * @return website
     */
    public Website getWebsite() {
        return website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }

    public Properties withOcaIp(OcaIp ocaIp) {
        this.ocaIp = ocaIp;
        return this;
    }

    public Properties withOcaIp(Consumer<OcaIp> ocaIpSetter) {
        if (this.ocaIp == null) {
            this.ocaIp = new OcaIp();
            ocaIpSetter.accept(this.ocaIp);
        }

        return this;
    }

    /**
     * Get ocaIp
     * @return ocaIp
     */
    public OcaIp getOcaIp() {
        return ocaIp;
    }

    public void setOcaIp(OcaIp ocaIp) {
        this.ocaIp = ocaIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Properties that = (Properties) obj;
        return Objects.equals(this.hwcEcs, that.hwcEcs) && Objects.equals(this.hwcEip, that.hwcEip)
            && Objects.equals(this.hwcVpc, that.hwcVpc) && Objects.equals(this.hwcSubnet, that.hwcSubnet)
            && Objects.equals(this.hwcRds, that.hwcRds) && Objects.equals(this.hwcDomain, that.hwcDomain)
            && Objects.equals(this.website, that.website) && Objects.equals(this.ocaIp, that.ocaIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hwcEcs, hwcEip, hwcVpc, hwcSubnet, hwcRds, hwcDomain, website, ocaIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Properties {\n");
        sb.append("    hwcEcs: ").append(toIndentedString(hwcEcs)).append("\n");
        sb.append("    hwcEip: ").append(toIndentedString(hwcEip)).append("\n");
        sb.append("    hwcVpc: ").append(toIndentedString(hwcVpc)).append("\n");
        sb.append("    hwcSubnet: ").append(toIndentedString(hwcSubnet)).append("\n");
        sb.append("    hwcRds: ").append(toIndentedString(hwcRds)).append("\n");
        sb.append("    hwcDomain: ").append(toIndentedString(hwcDomain)).append("\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
        sb.append("    ocaIp: ").append(toIndentedString(ocaIp)).append("\n");
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
