package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateEdgePoolRequestDto
 */
public class CreateEdgePoolRequestDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_service_instance_id")

    private String iefServiceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<String> nodes = null;

    public CreateEdgePoolRequestDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘池名称。只能由小写字母（a～z）、数字（0～9）、中划线（-）组成，长度范围为[4，32]。需以小写字母开头，以小写字母或数字结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEdgePoolRequestDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateEdgePoolRequestDto withIefServiceInstanceId(String iefServiceInstanceId) {
        this.iefServiceInstanceId = iefServiceInstanceId;
        return this;
    }

    /**
     * IEF的铂金版实例ID
     * @return iefServiceInstanceId
     */
    public String getIefServiceInstanceId() {
        return iefServiceInstanceId;
    }

    public void setIefServiceInstanceId(String iefServiceInstanceId) {
        this.iefServiceInstanceId = iefServiceInstanceId;
    }

    public CreateEdgePoolRequestDto withNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

    public CreateEdgePoolRequestDto addNodesItem(String nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public CreateEdgePoolRequestDto withNodes(Consumer<List<String>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * ief边缘节点数组
     * @return nodes
     */
    public List<String> getNodes() {
        return nodes;
    }

    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEdgePoolRequestDto that = (CreateEdgePoolRequestDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.iefServiceInstanceId, that.iefServiceInstanceId)
            && Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, iefServiceInstanceId, nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgePoolRequestDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iefServiceInstanceId: ").append(toIndentedString(iefServiceInstanceId)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
