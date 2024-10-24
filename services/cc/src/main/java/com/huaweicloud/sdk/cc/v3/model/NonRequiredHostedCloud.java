package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 归属云。
 */
public class NonRequiredHostedCloud {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_cloud")

    private HostedCloudEnum hostedCloud;

    public NonRequiredHostedCloud withHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
        return this;
    }

    /**
     * Get hostedCloud
     * @return hostedCloud
     */
    public HostedCloudEnum getHostedCloud() {
        return hostedCloud;
    }

    public void setHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NonRequiredHostedCloud that = (NonRequiredHostedCloud) obj;
        return Objects.equals(this.hostedCloud, that.hostedCloud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostedCloud);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonRequiredHostedCloud {\n");
        sb.append("    hostedCloud: ").append(toIndentedString(hostedCloud)).append("\n");
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
