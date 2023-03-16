package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDelegatedAdministratorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_principal")

    private String servicePrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListDelegatedAdministratorsRequest withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * 服务主体的名称。
     * @return servicePrincipal
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    public ListDelegatedAdministratorsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 页面中最大结果数量。
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

    public ListDelegatedAdministratorsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDelegatedAdministratorsRequest listDelegatedAdministratorsRequest = (ListDelegatedAdministratorsRequest) o;
        return Objects.equals(this.servicePrincipal, listDelegatedAdministratorsRequest.servicePrincipal)
            && Objects.equals(this.limit, listDelegatedAdministratorsRequest.limit)
            && Objects.equals(this.marker, listDelegatedAdministratorsRequest.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePrincipal, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDelegatedAdministratorsRequest {\n");
        sb.append("    servicePrincipal: ").append(toIndentedString(servicePrincipal)).append("\n");
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
