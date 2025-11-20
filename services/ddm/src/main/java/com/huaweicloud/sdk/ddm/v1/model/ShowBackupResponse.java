package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBackupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_data_nodes")

    private List<RelatedDn> relatedDataNodes = null;

    public ShowBackupResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 备份id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowBackupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowBackupResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowBackupResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ShowBackupResponse withRelatedDataNodes(List<RelatedDn> relatedDataNodes) {
        this.relatedDataNodes = relatedDataNodes;
        return this;
    }

    public ShowBackupResponse addRelatedDataNodesItem(RelatedDn relatedDataNodesItem) {
        if (this.relatedDataNodes == null) {
            this.relatedDataNodes = new ArrayList<>();
        }
        this.relatedDataNodes.add(relatedDataNodesItem);
        return this;
    }

    public ShowBackupResponse withRelatedDataNodes(Consumer<List<RelatedDn>> relatedDataNodesSetter) {
        if (this.relatedDataNodes == null) {
            this.relatedDataNodes = new ArrayList<>();
        }
        relatedDataNodesSetter.accept(this.relatedDataNodes);
        return this;
    }

    /**
     * 关联DN。
     * @return relatedDataNodes
     */
    public List<RelatedDn> getRelatedDataNodes() {
        return relatedDataNodes;
    }

    public void setRelatedDataNodes(List<RelatedDn> relatedDataNodes) {
        this.relatedDataNodes = relatedDataNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupResponse that = (ShowBackupResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.relatedDataNodes, that.relatedDataNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, instanceId, instanceName, relatedDataNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    relatedDataNodes: ").append(toIndentedString(relatedDataNodes)).append("\n");
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
