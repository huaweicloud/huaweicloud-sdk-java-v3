package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可用区情况
 */
public class AvailabilityZones {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic")

    private VpnGatewayAvailabilityZones basic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "professional1")

    private VpnGatewayAvailabilityZones professional1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "professional2")

    private VpnGatewayAvailabilityZones professional2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Professional1-NonFixedIP")

    private VpnGatewayAvailabilityZones professional1NonFixedIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Professional2-NonFixedIP")

    private VpnGatewayAvailabilityZones professional2NonFixedIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gm")

    private VpnGatewayAvailabilityZones gm;

    public AvailabilityZones withBasic(VpnGatewayAvailabilityZones basic) {
        this.basic = basic;
        return this;
    }

    public AvailabilityZones withBasic(Consumer<VpnGatewayAvailabilityZones> basicSetter) {
        if (this.basic == null) {
            this.basic = new VpnGatewayAvailabilityZones();
            basicSetter.accept(this.basic);
        }

        return this;
    }

    /**
     * Get basic
     * @return basic
     */
    public VpnGatewayAvailabilityZones getBasic() {
        return basic;
    }

    public void setBasic(VpnGatewayAvailabilityZones basic) {
        this.basic = basic;
    }

    public AvailabilityZones withProfessional1(VpnGatewayAvailabilityZones professional1) {
        this.professional1 = professional1;
        return this;
    }

    public AvailabilityZones withProfessional1(Consumer<VpnGatewayAvailabilityZones> professional1Setter) {
        if (this.professional1 == null) {
            this.professional1 = new VpnGatewayAvailabilityZones();
            professional1Setter.accept(this.professional1);
        }

        return this;
    }

    /**
     * Get professional1
     * @return professional1
     */
    public VpnGatewayAvailabilityZones getProfessional1() {
        return professional1;
    }

    public void setProfessional1(VpnGatewayAvailabilityZones professional1) {
        this.professional1 = professional1;
    }

    public AvailabilityZones withProfessional2(VpnGatewayAvailabilityZones professional2) {
        this.professional2 = professional2;
        return this;
    }

    public AvailabilityZones withProfessional2(Consumer<VpnGatewayAvailabilityZones> professional2Setter) {
        if (this.professional2 == null) {
            this.professional2 = new VpnGatewayAvailabilityZones();
            professional2Setter.accept(this.professional2);
        }

        return this;
    }

    /**
     * Get professional2
     * @return professional2
     */
    public VpnGatewayAvailabilityZones getProfessional2() {
        return professional2;
    }

    public void setProfessional2(VpnGatewayAvailabilityZones professional2) {
        this.professional2 = professional2;
    }

    public AvailabilityZones withProfessional1NonFixedIP(VpnGatewayAvailabilityZones professional1NonFixedIP) {
        this.professional1NonFixedIP = professional1NonFixedIP;
        return this;
    }

    public AvailabilityZones withProfessional1NonFixedIP(
        Consumer<VpnGatewayAvailabilityZones> professional1NonFixedIPSetter) {
        if (this.professional1NonFixedIP == null) {
            this.professional1NonFixedIP = new VpnGatewayAvailabilityZones();
            professional1NonFixedIPSetter.accept(this.professional1NonFixedIP);
        }

        return this;
    }

    /**
     * Get professional1NonFixedIP
     * @return professional1NonFixedIP
     */
    public VpnGatewayAvailabilityZones getProfessional1NonFixedIP() {
        return professional1NonFixedIP;
    }

    public void setProfessional1NonFixedIP(VpnGatewayAvailabilityZones professional1NonFixedIP) {
        this.professional1NonFixedIP = professional1NonFixedIP;
    }

    public AvailabilityZones withProfessional2NonFixedIP(VpnGatewayAvailabilityZones professional2NonFixedIP) {
        this.professional2NonFixedIP = professional2NonFixedIP;
        return this;
    }

    public AvailabilityZones withProfessional2NonFixedIP(
        Consumer<VpnGatewayAvailabilityZones> professional2NonFixedIPSetter) {
        if (this.professional2NonFixedIP == null) {
            this.professional2NonFixedIP = new VpnGatewayAvailabilityZones();
            professional2NonFixedIPSetter.accept(this.professional2NonFixedIP);
        }

        return this;
    }

    /**
     * Get professional2NonFixedIP
     * @return professional2NonFixedIP
     */
    public VpnGatewayAvailabilityZones getProfessional2NonFixedIP() {
        return professional2NonFixedIP;
    }

    public void setProfessional2NonFixedIP(VpnGatewayAvailabilityZones professional2NonFixedIP) {
        this.professional2NonFixedIP = professional2NonFixedIP;
    }

    public AvailabilityZones withGm(VpnGatewayAvailabilityZones gm) {
        this.gm = gm;
        return this;
    }

    public AvailabilityZones withGm(Consumer<VpnGatewayAvailabilityZones> gmSetter) {
        if (this.gm == null) {
            this.gm = new VpnGatewayAvailabilityZones();
            gmSetter.accept(this.gm);
        }

        return this;
    }

    /**
     * Get gm
     * @return gm
     */
    public VpnGatewayAvailabilityZones getGm() {
        return gm;
    }

    public void setGm(VpnGatewayAvailabilityZones gm) {
        this.gm = gm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailabilityZones that = (AvailabilityZones) obj;
        return Objects.equals(this.basic, that.basic) && Objects.equals(this.professional1, that.professional1)
            && Objects.equals(this.professional2, that.professional2)
            && Objects.equals(this.professional1NonFixedIP, that.professional1NonFixedIP)
            && Objects.equals(this.professional2NonFixedIP, that.professional2NonFixedIP)
            && Objects.equals(this.gm, that.gm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basic, professional1, professional2, professional1NonFixedIP, professional2NonFixedIP, gm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZones {\n");
        sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
        sb.append("    professional1: ").append(toIndentedString(professional1)).append("\n");
        sb.append("    professional2: ").append(toIndentedString(professional2)).append("\n");
        sb.append("    professional1NonFixedIP: ").append(toIndentedString(professional1NonFixedIP)).append("\n");
        sb.append("    professional2NonFixedIP: ").append(toIndentedString(professional2NonFixedIP)).append("\n");
        sb.append("    gm: ").append(toIndentedString(gm)).append("\n");
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
