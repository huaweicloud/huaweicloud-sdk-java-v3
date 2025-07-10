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
    @JsonProperty(value = "managed_organizational_units")

    private List<ManagedOrganizationalUnit> managedOrganizationalUnits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListManagedOrganizationalUnitsResponse withManagedOrganizationalUnits(
        List<ManagedOrganizationalUnit> managedOrganizationalUnits) {
        this.managedOrganizationalUnits = managedOrganizationalUnits;
        return this;
    }

    public ListManagedOrganizationalUnitsResponse addManagedOrganizationalUnitsItem(
        ManagedOrganizationalUnit managedOrganizationalUnitsItem) {
        if (this.managedOrganizationalUnits == null) {
            this.managedOrganizationalUnits = new ArrayList<>();
        }
        this.managedOrganizationalUnits.add(managedOrganizationalUnitsItem);
        return this;
    }

    public ListManagedOrganizationalUnitsResponse withManagedOrganizationalUnits(
        Consumer<List<ManagedOrganizationalUnit>> managedOrganizationalUnitsSetter) {
        if (this.managedOrganizationalUnits == null) {
            this.managedOrganizationalUnits = new ArrayList<>();
        }
        managedOrganizationalUnitsSetter.accept(this.managedOrganizationalUnits);
        return this;
    }

    /**
     * 注册OU信息。
     * @return managedOrganizationalUnits
     */
    public List<ManagedOrganizationalUnit> getManagedOrganizationalUnits() {
        return managedOrganizationalUnits;
    }

    public void setManagedOrganizationalUnits(List<ManagedOrganizationalUnit> managedOrganizationalUnits) {
        this.managedOrganizationalUnits = managedOrganizationalUnits;
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
        return Objects.equals(this.managedOrganizationalUnits, that.managedOrganizationalUnits)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOrganizationalUnits, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListManagedOrganizationalUnitsResponse {\n");
        sb.append("    managedOrganizationalUnits: ").append(toIndentedString(managedOrganizationalUnits)).append("\n");
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
