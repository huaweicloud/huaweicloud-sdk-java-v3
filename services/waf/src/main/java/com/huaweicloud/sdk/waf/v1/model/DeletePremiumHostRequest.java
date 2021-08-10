package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeletePremiumHostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepPolicy")

    private Boolean keepPolicy;

    public DeletePremiumHostRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /** 独享模式域名ID
     * 
     * @return hostId */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public DeletePremiumHostRequest withKeepPolicy(Boolean keepPolicy) {
        this.keepPolicy = keepPolicy;
        return this;
    }

    /** 是否保留规则
     * 
     * @return keepPolicy */
    public Boolean getKeepPolicy() {
        return keepPolicy;
    }

    public void setKeepPolicy(Boolean keepPolicy) {
        this.keepPolicy = keepPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletePremiumHostRequest deletePremiumHostRequest = (DeletePremiumHostRequest) o;
        return Objects.equals(this.hostId, deletePremiumHostRequest.hostId)
            && Objects.equals(this.keepPolicy, deletePremiumHostRequest.keepPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, keepPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePremiumHostRequest {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
