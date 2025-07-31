package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExportHandledVulnerabilitiesRequestBodySpecificVuls
 */
public class ExportHandledVulnerabilitiesRequestBodySpecificVuls {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    public ExportHandledVulnerabilitiesRequestBodySpecificVuls withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ExportHandledVulnerabilitiesRequestBodySpecificVuls withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * 漏洞id
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportHandledVulnerabilitiesRequestBodySpecificVuls that =
            (ExportHandledVulnerabilitiesRequestBodySpecificVuls) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.vulId, that.vulId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, vulId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportHandledVulnerabilitiesRequestBodySpecificVuls {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
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
