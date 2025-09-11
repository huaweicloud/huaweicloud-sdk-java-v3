package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BareMetalModifyPortRequest
 */
public class BareMetalModifyPortRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_owner")

    private String deviceOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_addresses")

    private List<String> ipAddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_binding")

    private List<Boolean> reverseBinding = null;

    public BareMetalModifyPortRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get subnetId
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public BareMetalModifyPortRequest withDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    /**
     * Get deviceOwner
     * @return deviceOwner
     */
    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public BareMetalModifyPortRequest withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    public BareMetalModifyPortRequest addIpAddressesItem(String ipAddressesItem) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        this.ipAddresses.add(ipAddressesItem);
        return this;
    }

    public BareMetalModifyPortRequest withIpAddresses(Consumer<List<String>> ipAddressesSetter) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        ipAddressesSetter.accept(this.ipAddresses);
        return this;
    }

    /**
     * Get ipAddresses
     * @return ipAddresses
     */
    public List<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public BareMetalModifyPortRequest withReverseBinding(List<Boolean> reverseBinding) {
        this.reverseBinding = reverseBinding;
        return this;
    }

    public BareMetalModifyPortRequest addReverseBindingItem(Boolean reverseBindingItem) {
        if (this.reverseBinding == null) {
            this.reverseBinding = new ArrayList<>();
        }
        this.reverseBinding.add(reverseBindingItem);
        return this;
    }

    public BareMetalModifyPortRequest withReverseBinding(Consumer<List<Boolean>> reverseBindingSetter) {
        if (this.reverseBinding == null) {
            this.reverseBinding = new ArrayList<>();
        }
        reverseBindingSetter.accept(this.reverseBinding);
        return this;
    }

    /**
     * Get reverseBinding
     * @return reverseBinding
     */
    public List<Boolean> getReverseBinding() {
        return reverseBinding;
    }

    public void setReverseBinding(List<Boolean> reverseBinding) {
        this.reverseBinding = reverseBinding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BareMetalModifyPortRequest that = (BareMetalModifyPortRequest) obj;
        return Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.deviceOwner, that.deviceOwner)
            && Objects.equals(this.ipAddresses, that.ipAddresses)
            && Objects.equals(this.reverseBinding, that.reverseBinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, deviceOwner, ipAddresses, reverseBinding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BareMetalModifyPortRequest {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
        sb.append("    reverseBinding: ").append(toIndentedString(reverseBinding)).append("\n");
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
