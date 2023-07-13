package com.huaweicloud.sdk.eds.v1.model;

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
public class ShowOfferResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_id")

    private String offerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_name")

    private String offerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_resources")

    private List<OfferResponseBodyOfferResources> offerResources = null;

    public ShowOfferResponse withOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * 合约id
     * @return offerId
     */
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public ShowOfferResponse withOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    /**
     * 合约名称
     * @return offerName
     */
    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public ShowOfferResponse withOfferResources(List<OfferResponseBodyOfferResources> offerResources) {
        this.offerResources = offerResources;
        return this;
    }

    public ShowOfferResponse addOfferResourcesItem(OfferResponseBodyOfferResources offerResourcesItem) {
        if (this.offerResources == null) {
            this.offerResources = new ArrayList<>();
        }
        this.offerResources.add(offerResourcesItem);
        return this;
    }

    public ShowOfferResponse withOfferResources(Consumer<List<OfferResponseBodyOfferResources>> offerResourcesSetter) {
        if (this.offerResources == null) {
            this.offerResources = new ArrayList<>();
        }
        offerResourcesSetter.accept(this.offerResources);
        return this;
    }

    /**
     * 合约关联的资源信息
     * @return offerResources
     */
    public List<OfferResponseBodyOfferResources> getOfferResources() {
        return offerResources;
    }

    public void setOfferResources(List<OfferResponseBodyOfferResources> offerResources) {
        this.offerResources = offerResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOfferResponse that = (ShowOfferResponse) obj;
        return Objects.equals(this.offerId, that.offerId) && Objects.equals(this.offerName, that.offerName)
            && Objects.equals(this.offerResources, that.offerResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, offerName, offerResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOfferResponse {\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
        sb.append("    offerResources: ").append(toIndentedString(offerResources)).append("\n");
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
