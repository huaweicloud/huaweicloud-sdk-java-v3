package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainItemDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_item_details")

    private DomainItemDetail domainItemDetails;

    public ShowDomainItemDetailsResponse withDomainItemDetails(DomainItemDetail domainItemDetails) {
        this.domainItemDetails = domainItemDetails;
        return this;
    }

    public ShowDomainItemDetailsResponse withDomainItemDetails(Consumer<DomainItemDetail> domainItemDetailsSetter) {
        if (this.domainItemDetails == null) {
            this.domainItemDetails = new DomainItemDetail();
            domainItemDetailsSetter.accept(this.domainItemDetails);
        }

        return this;
    }

    /**
     * Get domainItemDetails
     * @return domainItemDetails
     */
    public DomainItemDetail getDomainItemDetails() {
        return domainItemDetails;
    }

    public void setDomainItemDetails(DomainItemDetail domainItemDetails) {
        this.domainItemDetails = domainItemDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainItemDetailsResponse showDomainItemDetailsResponse = (ShowDomainItemDetailsResponse) o;
        return Objects.equals(this.domainItemDetails, showDomainItemDetailsResponse.domainItemDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainItemDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainItemDetailsResponse {\n");
        sb.append("    domainItemDetails: ").append(toIndentedString(domainItemDetails)).append("\n");
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
