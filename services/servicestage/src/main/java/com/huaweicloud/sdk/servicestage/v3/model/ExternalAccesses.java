package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExternalAccesses
 */
public class ExternalAccesses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prorocol")

    private String prorocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_port")

    private Integer forwardPort;

    public ExternalAccesses withProrocol(String prorocol) {
        this.prorocol = prorocol;
        return this;
    }

    /**
     * Get prorocol
     * @return prorocol
     */
    public String getProrocol() {
        return prorocol;
    }

    public void setProrocol(String prorocol) {
        this.prorocol = prorocol;
    }

    public ExternalAccesses withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ExternalAccesses withForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
        return this;
    }

    /**
     * Get forwardPort
     * @return forwardPort
     */
    public Integer getForwardPort() {
        return forwardPort;
    }

    public void setForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalAccesses that = (ExternalAccesses) obj;
        return Objects.equals(this.prorocol, that.prorocol) && Objects.equals(this.address, that.address)
            && Objects.equals(this.forwardPort, that.forwardPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prorocol, address, forwardPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalAccesses {\n");
        sb.append("    prorocol: ").append(toIndentedString(prorocol)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    forwardPort: ").append(toIndentedString(forwardPort)).append("\n");
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
