package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StartConnectivityTestReq
 */
public class StartConnectivityTestReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addressAndPorts")

    private List<AddressAndPorts> addressAndPorts = null;

    public StartConnectivityTestReq withAddressAndPorts(List<AddressAndPorts> addressAndPorts) {
        this.addressAndPorts = addressAndPorts;
        return this;
    }

    public StartConnectivityTestReq addAddressAndPortsItem(AddressAndPorts addressAndPortsItem) {
        if (this.addressAndPorts == null) {
            this.addressAndPorts = new ArrayList<>();
        }
        this.addressAndPorts.add(addressAndPortsItem);
        return this;
    }

    public StartConnectivityTestReq withAddressAndPorts(Consumer<List<AddressAndPorts>> addressAndPortsSetter) {
        if (this.addressAndPorts == null) {
            this.addressAndPorts = new ArrayList<>();
        }
        addressAndPortsSetter.accept(this.addressAndPorts);
        return this;
    }

    /**
     * 地址和端口列表。
     * @return addressAndPorts
     */
    public List<AddressAndPorts> getAddressAndPorts() {
        return addressAndPorts;
    }

    public void setAddressAndPorts(List<AddressAndPorts> addressAndPorts) {
        this.addressAndPorts = addressAndPorts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartConnectivityTestReq that = (StartConnectivityTestReq) obj;
        return Objects.equals(this.addressAndPorts, that.addressAndPorts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressAndPorts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartConnectivityTestReq {\n");
        sb.append("    addressAndPorts: ").append(toIndentedString(addressAndPorts)).append("\n");
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
