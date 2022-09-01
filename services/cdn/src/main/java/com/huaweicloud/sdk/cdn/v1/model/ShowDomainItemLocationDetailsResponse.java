package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainItemLocationDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_item_location_details")

    @JacksonXmlProperty(localName = "domain_item_location_details")

    private DomainItemLocationDetails domainItemLocationDetails;

    public ShowDomainItemLocationDetailsResponse withDomainItemLocationDetails(
        DomainItemLocationDetails domainItemLocationDetails) {
        this.domainItemLocationDetails = domainItemLocationDetails;
        return this;
    }

    public ShowDomainItemLocationDetailsResponse withDomainItemLocationDetails(
        Consumer<DomainItemLocationDetails> domainItemLocationDetailsSetter) {
        if (this.domainItemLocationDetails == null) {
            this.domainItemLocationDetails = new DomainItemLocationDetails();
            domainItemLocationDetailsSetter.accept(this.domainItemLocationDetails);
        }

        return this;
    }

    /**
     * Get domainItemLocationDetails
     * @return domainItemLocationDetails
     */
    public DomainItemLocationDetails getDomainItemLocationDetails() {
        return domainItemLocationDetails;
    }

    public void setDomainItemLocationDetails(DomainItemLocationDetails domainItemLocationDetails) {
        this.domainItemLocationDetails = domainItemLocationDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainItemLocationDetailsResponse showDomainItemLocationDetailsResponse =
            (ShowDomainItemLocationDetailsResponse) o;
        return Objects.equals(this.domainItemLocationDetails,
            showDomainItemLocationDetailsResponse.domainItemLocationDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainItemLocationDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainItemLocationDetailsResponse {\n");
        sb.append("    domainItemLocationDetails: ").append(toIndentedString(domainItemLocationDetails)).append("\n");
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
