package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFlavorByTypeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    @JacksonXmlProperty(localName = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    @JacksonXmlProperty(localName = "types")

    private String types;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateFlavorByTypeReq body;

    public UpdateFlavorByTypeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定待更改规格的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateFlavorByTypeRequest withTypes(String types) {
        this.types = types;
        return this;
    }

    /**
     * 指定待更改的集群节点类型。 - ess：数据节点。 - ess-cold：冷数据节点。 - ess-client：Client节点。 - ess-master：Master节点。
     * @return types
     */
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public UpdateFlavorByTypeRequest withBody(UpdateFlavorByTypeReq body) {
        this.body = body;
        return this;
    }

    public UpdateFlavorByTypeRequest withBody(Consumer<UpdateFlavorByTypeReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFlavorByTypeReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFlavorByTypeReq getBody() {
        return body;
    }

    public void setBody(UpdateFlavorByTypeReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFlavorByTypeRequest updateFlavorByTypeRequest = (UpdateFlavorByTypeRequest) o;
        return Objects.equals(this.clusterId, updateFlavorByTypeRequest.clusterId)
            && Objects.equals(this.types, updateFlavorByTypeRequest.types)
            && Objects.equals(this.body, updateFlavorByTypeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, types, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlavorByTypeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
