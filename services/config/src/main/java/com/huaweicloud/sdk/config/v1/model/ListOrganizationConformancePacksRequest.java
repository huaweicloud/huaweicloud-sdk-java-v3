package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListOrganizationConformancePacksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_conformance_pack_id")

    private String organizationConformancePackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conformance_pack_name")

    private String conformancePackName;

    public ListOrganizationConformancePacksRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public ListOrganizationConformancePacksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListOrganizationConformancePacksRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListOrganizationConformancePacksRequest withOrganizationConformancePackId(
        String organizationConformancePackId) {
        this.organizationConformancePackId = organizationConformancePackId;
        return this;
    }

    /**
     * 组织合规规则包ID。
     * @return organizationConformancePackId
     */
    public String getOrganizationConformancePackId() {
        return organizationConformancePackId;
    }

    public void setOrganizationConformancePackId(String organizationConformancePackId) {
        this.organizationConformancePackId = organizationConformancePackId;
    }

    public ListOrganizationConformancePacksRequest withConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
        return this;
    }

    /**
     * 合规规则包名称。
     * @return conformancePackName
     */
    public String getConformancePackName() {
        return conformancePackName;
    }

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOrganizationConformancePacksRequest that = (ListOrganizationConformancePacksRequest) obj;
        return Objects.equals(this.organizationId, that.organizationId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.organizationConformancePackId, that.organizationConformancePackId)
            && Objects.equals(this.conformancePackName, that.conformancePackName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, limit, marker, organizationConformancePackId, conformancePackName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrganizationConformancePacksRequest {\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    organizationConformancePackId: ")
            .append(toIndentedString(organizationConformancePackId))
            .append("\n");
        sb.append("    conformancePackName: ").append(toIndentedString(conformancePackName)).append("\n");
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
