package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCssClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_cluster_id")

    private String cssClusterId;

    public DeleteCssClusterRequest withCssClusterId(String cssClusterId) {
        this.cssClusterId = cssClusterId;
        return this;
    }

    /**
     * css集群id
     * @return cssClusterId
     */
    public String getCssClusterId() {
        return cssClusterId;
    }

    public void setCssClusterId(String cssClusterId) {
        this.cssClusterId = cssClusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCssClusterRequest that = (DeleteCssClusterRequest) obj;
        return Objects.equals(this.cssClusterId, that.cssClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cssClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCssClusterRequest {\n");
        sb.append("    cssClusterId: ").append(toIndentedString(cssClusterId)).append("\n");
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
