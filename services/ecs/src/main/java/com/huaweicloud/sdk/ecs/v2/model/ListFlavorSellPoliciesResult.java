package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListFlavorSellPoliciesResult
 */
public class ListFlavorSellPoliciesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sell_status")

    private String sellStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sell_mode")

    private String sellMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_options")

    private FlavorSpotOptions spotOptions;

    public ListFlavorSellPoliciesResult withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 云服务器规格的索引。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ListFlavorSellPoliciesResult withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 云服务器规格的ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ListFlavorSellPoliciesResult withSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
        return this;
    }

    /**
     * 云服务器规格的售卖状态。  sellout：售罄。 available：可用。
     * @return sellStatus
     */
    public String getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
    }

    public ListFlavorSellPoliciesResult withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 云服务器规格的可用区。
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public ListFlavorSellPoliciesResult withSellMode(String sellMode) {
        this.sellMode = sellMode;
        return this;
    }

    /**
     * 云服务器规格的付费模式。  - postPaid：按需计费实例。 - prePaid：包年/包月计费实例。 - spot：竞价实例。 - ri：预留实例。
     * @return sellMode
     */
    public String getSellMode() {
        return sellMode;
    }

    public void setSellMode(String sellMode) {
        this.sellMode = sellMode;
    }

    public ListFlavorSellPoliciesResult withSpotOptions(FlavorSpotOptions spotOptions) {
        this.spotOptions = spotOptions;
        return this;
    }

    public ListFlavorSellPoliciesResult withSpotOptions(Consumer<FlavorSpotOptions> spotOptionsSetter) {
        if (this.spotOptions == null) {
            this.spotOptions = new FlavorSpotOptions();
            spotOptionsSetter.accept(this.spotOptions);
        }

        return this;
    }

    /**
     * Get spotOptions
     * @return spotOptions
     */
    public FlavorSpotOptions getSpotOptions() {
        return spotOptions;
    }

    public void setSpotOptions(FlavorSpotOptions spotOptions) {
        this.spotOptions = spotOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlavorSellPoliciesResult that = (ListFlavorSellPoliciesResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.sellStatus, that.sellStatus)
            && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.sellMode, that.sellMode) && Objects.equals(this.spotOptions, that.spotOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flavorId, sellStatus, availabilityZoneId, sellMode, spotOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorSellPoliciesResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    sellStatus: ").append(toIndentedString(sellStatus)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    sellMode: ").append(toIndentedString(sellMode)).append("\n");
        sb.append("    spotOptions: ").append(toIndentedString(spotOptions)).append("\n");
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
