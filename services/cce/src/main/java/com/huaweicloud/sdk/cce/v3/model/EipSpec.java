package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EipSpec
 */
public class EipSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    @JacksonXmlProperty(localName = "bandwidth")

    private EipSpecBandwidth bandwidth;

    public EipSpec withBandwidth(EipSpecBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public EipSpec withBandwidth(Consumer<EipSpecBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new EipSpecBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public EipSpecBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(EipSpecBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EipSpec eipSpec = (EipSpec) o;
        return Objects.equals(this.bandwidth, eipSpec.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipSpec {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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
