package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListManagedAccountsForParentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_organization_unit_id")

    private String managedOrganizationUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListManagedAccountsForParentRequest withManagedOrganizationUnitId(String managedOrganizationUnitId) {
        this.managedOrganizationUnitId = managedOrganizationUnitId;
        return this;
    }

    /**
     * 注册OU ID。
     * @return managedOrganizationUnitId
     */
    public String getManagedOrganizationUnitId() {
        return managedOrganizationUnitId;
    }

    public void setManagedOrganizationUnitId(String managedOrganizationUnitId) {
        this.managedOrganizationUnitId = managedOrganizationUnitId;
    }

    public ListManagedAccountsForParentRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页页面的最大值。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListManagedAccountsForParentRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 页面标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListManagedAccountsForParentRequest that = (ListManagedAccountsForParentRequest) obj;
        return Objects.equals(this.managedOrganizationUnitId, that.managedOrganizationUnitId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOrganizationUnitId, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListManagedAccountsForParentRequest {\n");
        sb.append("    managedOrganizationUnitId: ").append(toIndentedString(managedOrganizationUnitId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
