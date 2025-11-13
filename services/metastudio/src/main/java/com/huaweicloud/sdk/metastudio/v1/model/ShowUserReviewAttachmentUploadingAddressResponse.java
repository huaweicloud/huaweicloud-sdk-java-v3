package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowUserReviewAttachmentUploadingAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private List<AttachmentUploadingAddress> addresses = null;

    public ShowUserReviewAttachmentUploadingAddressResponse withAddresses(List<AttachmentUploadingAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public ShowUserReviewAttachmentUploadingAddressResponse addAddressesItem(AttachmentUploadingAddress addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public ShowUserReviewAttachmentUploadingAddressResponse withAddresses(
        Consumer<List<AttachmentUploadingAddress>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 地址列表
     * @return addresses
     */
    public List<AttachmentUploadingAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AttachmentUploadingAddress> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserReviewAttachmentUploadingAddressResponse that = (ShowUserReviewAttachmentUploadingAddressResponse) obj;
        return Objects.equals(this.addresses, that.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserReviewAttachmentUploadingAddressResponse {\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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
