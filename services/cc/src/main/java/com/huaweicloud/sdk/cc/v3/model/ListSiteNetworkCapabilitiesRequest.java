package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListSiteNetworkCapabilitiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private List<SiteNetworkSpecificationEnum> specification = null;

    public ListSiteNetworkCapabilitiesRequest withSpecification(List<SiteNetworkSpecificationEnum> specification) {
        this.specification = specification;
        return this;
    }

    public ListSiteNetworkCapabilitiesRequest addSpecificationItem(SiteNetworkSpecificationEnum specificationItem) {
        if (this.specification == null) {
            this.specification = new ArrayList<>();
        }
        this.specification.add(specificationItem);
        return this;
    }

    public ListSiteNetworkCapabilitiesRequest withSpecification(
        Consumer<List<SiteNetworkSpecificationEnum>> specificationSetter) {
        if (this.specification == null) {
            this.specification = new ArrayList<>();
        }
        specificationSetter.accept(this.specification);
        return this;
    }

    /**
     * 根据分支网络租户能力名查询，可查询多个类型。
     * @return specification
     */
    public List<SiteNetworkSpecificationEnum> getSpecification() {
        return specification;
    }

    public void setSpecification(List<SiteNetworkSpecificationEnum> specification) {
        this.specification = specification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSiteNetworkCapabilitiesRequest that = (ListSiteNetworkCapabilitiesRequest) obj;
        return Objects.equals(this.specification, that.specification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSiteNetworkCapabilitiesRequest {\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
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
