package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TransAcceptResponse
 */
public class TransAcceptResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_billing")

    private Boolean isNeedBilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_resources")

    private List<BillResources> requiredResources = null;

    public TransAcceptResponse withIsNeedBilling(Boolean isNeedBilling) {
        this.isNeedBilling = isNeedBilling;
        return this;
    }

    /**
     * 资产转移时，是否需要从接收方扣减资源（产生计费话单)
     * @return isNeedBilling
     */
    public Boolean getIsNeedBilling() {
        return isNeedBilling;
    }

    public void setIsNeedBilling(Boolean isNeedBilling) {
        this.isNeedBilling = isNeedBilling;
    }

    public TransAcceptResponse withRequiredResources(List<BillResources> requiredResources) {
        this.requiredResources = requiredResources;
        return this;
    }

    public TransAcceptResponse addRequiredResourcesItem(BillResources requiredResourcesItem) {
        if (this.requiredResources == null) {
            this.requiredResources = new ArrayList<>();
        }
        this.requiredResources.add(requiredResourcesItem);
        return this;
    }

    public TransAcceptResponse withRequiredResources(Consumer<List<BillResources>> requiredResourcesSetter) {
        if (this.requiredResources == null) {
            this.requiredResources = new ArrayList<>();
        }
        requiredResourcesSetter.accept(this.requiredResources);
        return this;
    }

    /**
     * 需要扣减的资源列表。
     * @return requiredResources
     */
    public List<BillResources> getRequiredResources() {
        return requiredResources;
    }

    public void setRequiredResources(List<BillResources> requiredResources) {
        this.requiredResources = requiredResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransAcceptResponse that = (TransAcceptResponse) obj;
        return Objects.equals(this.isNeedBilling, that.isNeedBilling)
            && Objects.equals(this.requiredResources, that.requiredResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isNeedBilling, requiredResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransAcceptResponse {\n");
        sb.append("    isNeedBilling: ").append(toIndentedString(isNeedBilling)).append("\n");
        sb.append("    requiredResources: ").append(toIndentedString(requiredResources)).append("\n");
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
