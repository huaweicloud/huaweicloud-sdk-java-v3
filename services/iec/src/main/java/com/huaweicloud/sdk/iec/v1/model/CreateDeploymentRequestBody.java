package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建部署计划请求体
 */
public class CreateDeploymentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgecloud")

    private EdgeCloudOption edgecloud;

    public CreateDeploymentRequestBody withEdgecloud(EdgeCloudOption edgecloud) {
        this.edgecloud = edgecloud;
        return this;
    }

    public CreateDeploymentRequestBody withEdgecloud(Consumer<EdgeCloudOption> edgecloudSetter) {
        if (this.edgecloud == null) {
            this.edgecloud = new EdgeCloudOption();
            edgecloudSetter.accept(this.edgecloud);
        }

        return this;
    }

    /**
     * Get edgecloud
     * @return edgecloud
     */
    public EdgeCloudOption getEdgecloud() {
        return edgecloud;
    }

    public void setEdgecloud(EdgeCloudOption edgecloud) {
        this.edgecloud = edgecloud;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDeploymentRequestBody that = (CreateDeploymentRequestBody) obj;
        return Objects.equals(this.edgecloud, that.edgecloud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgecloud);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentRequestBody {\n");
        sb.append("    edgecloud: ").append(toIndentedString(edgecloud)).append("\n");
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
