package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DetachInternetBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_id")

    private String globalEipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_unbind")

    private Boolean forceUnbind;

    public DetachInternetBandwidthRequest withGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
        return this;
    }

    /**
     * Get globalEipId
     * @return globalEipId
     */
    public String getGlobalEipId() {
        return globalEipId;
    }

    public void setGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
    }

    public DetachInternetBandwidthRequest withForceUnbind(Boolean forceUnbind) {
        this.forceUnbind = forceUnbind;
        return this;
    }

    /**
     * Get forceUnbind
     * @return forceUnbind
     */
    public Boolean getForceUnbind() {
        return forceUnbind;
    }

    public void setForceUnbind(Boolean forceUnbind) {
        this.forceUnbind = forceUnbind;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachInternetBandwidthRequest that = (DetachInternetBandwidthRequest) obj;
        return Objects.equals(this.globalEipId, that.globalEipId) && Objects.equals(this.forceUnbind, that.forceUnbind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipId, forceUnbind);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachInternetBandwidthRequest {\n");
        sb.append("    globalEipId: ").append(toIndentedString(globalEipId)).append("\n");
        sb.append("    forceUnbind: ").append(toIndentedString(forceUnbind)).append("\n");
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
