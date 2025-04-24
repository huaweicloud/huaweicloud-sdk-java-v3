package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Extension
 */
public class Extension {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_service_id")

    private String epServiceId;

    public Extension withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * ep id
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public Extension withEpServiceId(String epServiceId) {
        this.epServiceId = epServiceId;
        return this;
    }

    /**
     * ep service id
     * @return epServiceId
     */
    public String getEpServiceId() {
        return epServiceId;
    }

    public void setEpServiceId(String epServiceId) {
        this.epServiceId = epServiceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Extension that = (Extension) obj;
        return Objects.equals(this.epId, that.epId) && Objects.equals(this.epServiceId, that.epServiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epId, epServiceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Extension {\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    epServiceId: ").append(toIndentedString(epServiceId)).append("\n");
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
