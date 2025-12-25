package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PipeResource
 */
public class PipeResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_resource_type")

    private Object pipeResourceType;

    public PipeResource withPipeResourceType(Object pipeResourceType) {
        this.pipeResourceType = pipeResourceType;
        return this;
    }

    /**
     * 管道资源
     * @return pipeResourceType
     */
    public Object getPipeResourceType() {
        return pipeResourceType;
    }

    public void setPipeResourceType(Object pipeResourceType) {
        this.pipeResourceType = pipeResourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipeResource that = (PipeResource) obj;
        return Objects.equals(this.pipeResourceType, that.pipeResourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipeResourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipeResource {\n");
        sb.append("    pipeResourceType: ").append(toIndentedString(pipeResourceType)).append("\n");
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
