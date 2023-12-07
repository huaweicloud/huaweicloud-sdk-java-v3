package com.huaweicloud.sdk.rgc.v1.model;

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
public class ListManagedOrganizationalUnitsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_organization_units")

    private List<ManagedOrganizationUnit> managedOrganizationUnits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListManagedOrganizationalUnitsResponse withManagedOrganizationUnits(
        List<ManagedOrganizationUnit> managedOrganizationUnits) {
        this.managedOrganizationUnits = managedOrganizationUnits;
        return this;
    }

    public ListManagedOrganizationalUnitsResponse addManagedOrganizationUnitsItem(
        ManagedOrganizationUnit managedOrganizationUnitsItem) {
        if (this.managedOrganizationUnits == null) {
            this.managedOrganizationUnits = new ArrayList<>();
        }
        this.managedOrganizationUnits.add(managedOrganizationUnitsItem);
        return this;
    }

    public ListManagedOrganizationalUnitsResponse withManagedOrganizationUnits(
        Consumer<List<ManagedOrganizationUnit>> managedOrganizationUnitsSetter) {
        if (this.managedOrganizationUnits == null) {
            this.managedOrganizationUnits = new ArrayList<>();
        }
        managedOrganizationUnitsSetter.accept(this.managedOrganizationUnits);
        return this;
    }

    /**
     * 纳管的OU。
     * @return managedOrganizationUnits
     */
    public List<ManagedOrganizationUnit> getManagedOrganizationUnits() {
        return managedOrganizationUnits;
    }

    public void setManagedOrganizationUnits(List<ManagedOrganizationUnit> managedOrganizationUnits) {
        this.managedOrganizationUnits = managedOrganizationUnits;
    }

    public ListManagedOrganizationalUnitsResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListManagedOrganizationalUnitsResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListManagedOrganizationalUnitsResponse that = (ListManagedOrganizationalUnitsResponse) obj;
        return Objects.equals(this.managedOrganizationUnits, that.managedOrganizationUnits)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOrganizationUnits, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListManagedOrganizationalUnitsResponse {\n");
        sb.append("    managedOrganizationUnits: ").append(toIndentedString(managedOrganizationUnits)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
