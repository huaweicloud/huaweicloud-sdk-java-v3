package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAvailableFlavorInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_flavor")

    private ComputeFlavor currentFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_flavors")

    private OptionalFlavorsInfo optionalFlavors;

    public ListAvailableFlavorInfosResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListAvailableFlavorInfosResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListAvailableFlavorInfosResponse withCurrentFlavor(ComputeFlavor currentFlavor) {
        this.currentFlavor = currentFlavor;
        return this;
    }

    public ListAvailableFlavorInfosResponse withCurrentFlavor(Consumer<ComputeFlavor> currentFlavorSetter) {
        if (this.currentFlavor == null) {
            this.currentFlavor = new ComputeFlavor();
            currentFlavorSetter.accept(this.currentFlavor);
        }

        return this;
    }

    /**
     * Get currentFlavor
     * @return currentFlavor
     */
    public ComputeFlavor getCurrentFlavor() {
        return currentFlavor;
    }

    public void setCurrentFlavor(ComputeFlavor currentFlavor) {
        this.currentFlavor = currentFlavor;
    }

    public ListAvailableFlavorInfosResponse withOptionalFlavors(OptionalFlavorsInfo optionalFlavors) {
        this.optionalFlavors = optionalFlavors;
        return this;
    }

    public ListAvailableFlavorInfosResponse withOptionalFlavors(Consumer<OptionalFlavorsInfo> optionalFlavorsSetter) {
        if (this.optionalFlavors == null) {
            this.optionalFlavors = new OptionalFlavorsInfo();
            optionalFlavorsSetter.accept(this.optionalFlavors);
        }

        return this;
    }

    /**
     * Get optionalFlavors
     * @return optionalFlavors
     */
    public OptionalFlavorsInfo getOptionalFlavors() {
        return optionalFlavors;
    }

    public void setOptionalFlavors(OptionalFlavorsInfo optionalFlavors) {
        this.optionalFlavors = optionalFlavors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableFlavorInfosResponse listAvailableFlavorInfosResponse = (ListAvailableFlavorInfosResponse) o;
        return Objects.equals(this.instanceId, listAvailableFlavorInfosResponse.instanceId)
            && Objects.equals(this.instanceName, listAvailableFlavorInfosResponse.instanceName)
            && Objects.equals(this.currentFlavor, listAvailableFlavorInfosResponse.currentFlavor)
            && Objects.equals(this.optionalFlavors, listAvailableFlavorInfosResponse.optionalFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, currentFlavor, optionalFlavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableFlavorInfosResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    currentFlavor: ").append(toIndentedString(currentFlavor)).append("\n");
        sb.append("    optionalFlavors: ").append(toIndentedString(optionalFlavors)).append("\n");
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
