package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 域名配置
 */
public class HostFlag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_dss")

    private String pciDss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_3ds")

    private String pci3ds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname")

    private String cname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dual_az")

    private String isDualAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6")

    private String ipv6;

    public HostFlag withPciDss(String pciDss) {
        this.pciDss = pciDss;
        return this;
    }

    /**
     * true/false
     * @return pciDss
     */
    public String getPciDss() {
        return pciDss;
    }

    public void setPciDss(String pciDss) {
        this.pciDss = pciDss;
    }

    public HostFlag withPci3ds(String pci3ds) {
        this.pci3ds = pci3ds;
        return this;
    }

    /**
     * true/false
     * @return pci3ds
     */
    public String getPci3ds() {
        return pci3ds;
    }

    public void setPci3ds(String pci3ds) {
        this.pci3ds = pci3ds;
    }

    public HostFlag withCname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * old/new
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public HostFlag withIsDualAz(String isDualAz) {
        this.isDualAz = isDualAz;
        return this;
    }

    /**
     * true/false
     * @return isDualAz
     */
    public String getIsDualAz() {
        return isDualAz;
    }

    public void setIsDualAz(String isDualAz) {
        this.isDualAz = isDualAz;
    }

    public HostFlag withIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }

    /**
     * true/false
     * @return ipv6
     */
    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostFlag hostFlag = (HostFlag) o;
        return Objects.equals(this.pciDss, hostFlag.pciDss) && Objects.equals(this.pci3ds, hostFlag.pci3ds)
            && Objects.equals(this.cname, hostFlag.cname) && Objects.equals(this.isDualAz, hostFlag.isDualAz)
            && Objects.equals(this.ipv6, hostFlag.ipv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pciDss, pci3ds, cname, isDualAz, ipv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostFlag {\n");
        sb.append("    pciDss: ").append(toIndentedString(pciDss)).append("\n");
        sb.append("    pci3ds: ").append(toIndentedString(pci3ds)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    isDualAz: ").append(toIndentedString(isDualAz)).append("\n");
        sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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
