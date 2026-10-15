package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLinkFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_flavor")

    private FlavorInfo vmFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_flavor")

    private FlavorInfo volumeFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_flavor")

    private FlavorInfo flowFlavor;

    public ShowLinkFlavorsResponse withVmFlavor(FlavorInfo vmFlavor) {
        this.vmFlavor = vmFlavor;
        return this;
    }

    public ShowLinkFlavorsResponse withVmFlavor(Consumer<FlavorInfo> vmFlavorSetter) {
        if (this.vmFlavor == null) {
            this.vmFlavor = new FlavorInfo();
            vmFlavorSetter.accept(this.vmFlavor);
        }

        return this;
    }

    /**
     * Get vmFlavor
     * @return vmFlavor
     */
    public FlavorInfo getVmFlavor() {
        return vmFlavor;
    }

    public void setVmFlavor(FlavorInfo vmFlavor) {
        this.vmFlavor = vmFlavor;
    }

    public ShowLinkFlavorsResponse withVolumeFlavor(FlavorInfo volumeFlavor) {
        this.volumeFlavor = volumeFlavor;
        return this;
    }

    public ShowLinkFlavorsResponse withVolumeFlavor(Consumer<FlavorInfo> volumeFlavorSetter) {
        if (this.volumeFlavor == null) {
            this.volumeFlavor = new FlavorInfo();
            volumeFlavorSetter.accept(this.volumeFlavor);
        }

        return this;
    }

    /**
     * Get volumeFlavor
     * @return volumeFlavor
     */
    public FlavorInfo getVolumeFlavor() {
        return volumeFlavor;
    }

    public void setVolumeFlavor(FlavorInfo volumeFlavor) {
        this.volumeFlavor = volumeFlavor;
    }

    public ShowLinkFlavorsResponse withFlowFlavor(FlavorInfo flowFlavor) {
        this.flowFlavor = flowFlavor;
        return this;
    }

    public ShowLinkFlavorsResponse withFlowFlavor(Consumer<FlavorInfo> flowFlavorSetter) {
        if (this.flowFlavor == null) {
            this.flowFlavor = new FlavorInfo();
            flowFlavorSetter.accept(this.flowFlavor);
        }

        return this;
    }

    /**
     * Get flowFlavor
     * @return flowFlavor
     */
    public FlavorInfo getFlowFlavor() {
        return flowFlavor;
    }

    public void setFlowFlavor(FlavorInfo flowFlavor) {
        this.flowFlavor = flowFlavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLinkFlavorsResponse that = (ShowLinkFlavorsResponse) obj;
        return Objects.equals(this.vmFlavor, that.vmFlavor) && Objects.equals(this.volumeFlavor, that.volumeFlavor)
            && Objects.equals(this.flowFlavor, that.flowFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmFlavor, volumeFlavor, flowFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLinkFlavorsResponse {\n");
        sb.append("    vmFlavor: ").append(toIndentedString(vmFlavor)).append("\n");
        sb.append("    volumeFlavor: ").append(toIndentedString(volumeFlavor)).append("\n");
        sb.append("    flowFlavor: ").append(toIndentedString(flowFlavor)).append("\n");
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
