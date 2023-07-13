package com.huaweicloud.sdk.organizations.v1.model;

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
public class ListOrganizationalUnitsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_units")

    private List<OrganizationalUnitDto> organizationalUnits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListOrganizationalUnitsResponse withOrganizationalUnits(List<OrganizationalUnitDto> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }

    public ListOrganizationalUnitsResponse addOrganizationalUnitsItem(OrganizationalUnitDto organizationalUnitsItem) {
        if (this.organizationalUnits == null) {
            this.organizationalUnits = new ArrayList<>();
        }
        this.organizationalUnits.add(organizationalUnitsItem);
        return this;
    }

    public ListOrganizationalUnitsResponse withOrganizationalUnits(
        Consumer<List<OrganizationalUnitDto>> organizationalUnitsSetter) {
        if (this.organizationalUnits == null) {
            this.organizationalUnits = new ArrayList<>();
        }
        organizationalUnitsSetter.accept(this.organizationalUnits);
        return this;
    }

    /**
     * 组织单元列表。
     * @return organizationalUnits
     */
    public List<OrganizationalUnitDto> getOrganizationalUnits() {
        return organizationalUnits;
    }

    public void setOrganizationalUnits(List<OrganizationalUnitDto> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
    }

    public ListOrganizationalUnitsResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListOrganizationalUnitsResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListOrganizationalUnitsResponse that = (ListOrganizationalUnitsResponse) obj;
        return Objects.equals(this.organizationalUnits, that.organizationalUnits)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationalUnits, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrganizationalUnitsResponse {\n");
        sb.append("    organizationalUnits: ").append(toIndentedString(organizationalUnits)).append("\n");
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
