package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListVendorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendors")

    private List<VendorDto> vendors = null;

    public ListVendorResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 供应商个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListVendorResponse withVendors(List<VendorDto> vendors) {
        this.vendors = vendors;
        return this;
    }

    public ListVendorResponse addVendorsItem(VendorDto vendorsItem) {
        if (this.vendors == null) {
            this.vendors = new ArrayList<>();
        }
        this.vendors.add(vendorsItem);
        return this;
    }

    public ListVendorResponse withVendors(Consumer<List<VendorDto>> vendorsSetter) {
        if (this.vendors == null) {
            this.vendors = new ArrayList<>();
        }
        vendorsSetter.accept(this.vendors);
        return this;
    }

    /**
     * 供应商列表
     * @return vendors
     */
    public List<VendorDto> getVendors() {
        return vendors;
    }

    public void setVendors(List<VendorDto> vendors) {
        this.vendors = vendors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVendorResponse that = (ListVendorResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.vendors, that.vendors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, vendors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVendorResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
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
