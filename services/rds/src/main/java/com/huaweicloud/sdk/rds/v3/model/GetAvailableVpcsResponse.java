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
public class GetAvailableVpcsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcs")

    private List<Vpc> vpcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-TRACE-ID")

    private String xTraceId;

    public GetAvailableVpcsResponse withVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
        return this;
    }

    public GetAvailableVpcsResponse addVpcsItem(Vpc vpcsItem) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        this.vpcs.add(vpcsItem);
        return this;
    }

    public GetAvailableVpcsResponse withVpcs(Consumer<List<Vpc>> vpcsSetter) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        vpcsSetter.accept(this.vpcs);
        return this;
    }

    /**
     * 可用的VPC列表
     * @return vpcs
     */
    public List<Vpc> getVpcs() {
        return vpcs;
    }

    public void setVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
    }

    public GetAvailableVpcsResponse withXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
        return this;
    }

    /**
     * Get xTraceId
     * @return xTraceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-TRACE-ID")
    public String getXTraceId() {
        return xTraceId;
    }

    public void setXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetAvailableVpcsResponse that = (GetAvailableVpcsResponse) obj;
        return Objects.equals(this.vpcs, that.vpcs) && Objects.equals(this.xTraceId, that.xTraceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcs, xTraceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAvailableVpcsResponse {\n");
        sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
        sb.append("    xTraceId: ").append(toIndentedString(xTraceId)).append("\n");
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
