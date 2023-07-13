package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 出方向路由策略
 */
public class ExportRoutePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_policy_id")

    private String exportPolicyId;

    public ExportRoutePolicy withExportPolicyId(String exportPolicyId) {
        this.exportPolicyId = exportPolicyId;
        return this;
    }

    /**
     * 出方向Ipv4协议路由策略id
     * @return exportPolicyId
     */
    public String getExportPolicyId() {
        return exportPolicyId;
    }

    public void setExportPolicyId(String exportPolicyId) {
        this.exportPolicyId = exportPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportRoutePolicy that = (ExportRoutePolicy) obj;
        return Objects.equals(this.exportPolicyId, that.exportPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportRoutePolicy {\n");
        sb.append("    exportPolicyId: ").append(toIndentedString(exportPolicyId)).append("\n");
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
