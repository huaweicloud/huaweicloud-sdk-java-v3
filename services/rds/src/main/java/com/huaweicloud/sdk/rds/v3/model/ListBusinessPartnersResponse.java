package com.huaweicloud.sdk.rds.v3.model;

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
public class ListBusinessPartnersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_partners")

    private List<BusinessPartner> businessPartners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListBusinessPartnersResponse withBusinessPartners(List<BusinessPartner> businessPartners) {
        this.businessPartners = businessPartners;
        return this;
    }

    public ListBusinessPartnersResponse addBusinessPartnersItem(BusinessPartner businessPartnersItem) {
        if (this.businessPartners == null) {
            this.businessPartners = new ArrayList<>();
        }
        this.businessPartners.add(businessPartnersItem);
        return this;
    }

    public ListBusinessPartnersResponse withBusinessPartners(Consumer<List<BusinessPartner>> businessPartnersSetter) {
        if (this.businessPartners == null) {
            this.businessPartners = new ArrayList<>();
        }
        businessPartnersSetter.accept(this.businessPartners);
        return this;
    }

    /**
     * 服务商列表。
     * @return businessPartners
     */
    public List<BusinessPartner> getBusinessPartners() {
        return businessPartners;
    }

    public void setBusinessPartners(List<BusinessPartner> businessPartners) {
        this.businessPartners = businessPartners;
    }

    public ListBusinessPartnersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总服务商数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBusinessPartnersResponse that = (ListBusinessPartnersResponse) obj;
        return Objects.equals(this.businessPartners, that.businessPartners)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessPartners, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBusinessPartnersResponse {\n");
        sb.append("    businessPartners: ").append(toIndentedString(businessPartners)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
