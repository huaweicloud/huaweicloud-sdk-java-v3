package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDownloadAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private List<DownloadAddressForList> address = null;

    public ListDownloadAddressResponse withAddress(List<DownloadAddressForList> address) {
        this.address = address;
        return this;
    }

    public ListDownloadAddressResponse addAddressItem(DownloadAddressForList addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        this.address.add(addressItem);
        return this;
    }

    public ListDownloadAddressResponse withAddress(Consumer<List<DownloadAddressForList>> addressSetter) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        addressSetter.accept(this.address);
        return this;
    }

    /**
     * 下载地址列表。
     * @return address
     */
    public List<DownloadAddressForList> getAddress() {
        return address;
    }

    public void setAddress(List<DownloadAddressForList> address) {
        this.address = address;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDownloadAddressResponse that = (ListDownloadAddressResponse) obj;
        return Objects.equals(this.address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDownloadAddressResponse {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
