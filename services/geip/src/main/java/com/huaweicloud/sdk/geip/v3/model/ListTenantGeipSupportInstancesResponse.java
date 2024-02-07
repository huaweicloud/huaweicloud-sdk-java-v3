package com.huaweicloud.sdk.geip.v3.model;

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
public class ListTenantGeipSupportInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_regions")

    private List<ListSupportInstancesSupportRegions> supportRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListTenantGeipSupportInstancesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListTenantGeipSupportInstancesResponse withSupportRegions(
        List<ListSupportInstancesSupportRegions> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }

    public ListTenantGeipSupportInstancesResponse addSupportRegionsItem(
        ListSupportInstancesSupportRegions supportRegionsItem) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        this.supportRegions.add(supportRegionsItem);
        return this;
    }

    public ListTenantGeipSupportInstancesResponse withSupportRegions(
        Consumer<List<ListSupportInstancesSupportRegions>> supportRegionsSetter) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        supportRegionsSetter.accept(this.supportRegions);
        return this;
    }

    /**
     * 支持的Region对象
     * @return supportRegions
     */
    public List<ListSupportInstancesSupportRegions> getSupportRegions() {
        return supportRegions;
    }

    public void setSupportRegions(List<ListSupportInstancesSupportRegions> supportRegions) {
        this.supportRegions = supportRegions;
    }

    public ListTenantGeipSupportInstancesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantGeipSupportInstancesResponse that = (ListTenantGeipSupportInstancesResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.supportRegions, that.supportRegions)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, supportRegions, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantGeipSupportInstancesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    supportRegions: ").append(toIndentedString(supportRegions)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
