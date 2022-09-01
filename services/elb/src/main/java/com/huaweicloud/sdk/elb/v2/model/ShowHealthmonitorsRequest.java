package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowHealthmonitorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor_id")

    @JacksonXmlProperty(localName = "healthmonitor_id")

    private String healthmonitorId;

    public ShowHealthmonitorsRequest withHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    /**
     * 健康检查id
     * @return healthmonitorId
     */
    public String getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHealthmonitorsRequest showHealthmonitorsRequest = (ShowHealthmonitorsRequest) o;
        return Objects.equals(this.healthmonitorId, showHealthmonitorsRequest.healthmonitorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHealthmonitorsRequest {\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
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
