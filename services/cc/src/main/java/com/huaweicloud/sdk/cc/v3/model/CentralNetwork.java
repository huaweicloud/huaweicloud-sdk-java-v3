package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 中心网络。
 */
public class CentralNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private CentralNetworkStateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planes")

    private List<CentralNetworkPlane> planes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_instances")

    private List<CentralNetworkErInstance> erInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    private List<CentralNetworkConnectionInfo> connections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_plane_id")

    private String defaultPlaneId;

    public CentralNetwork withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CentralNetwork withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CentralNetwork withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CentralNetwork withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CentralNetwork withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 实例更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CentralNetwork withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CentralNetwork withState(CentralNetworkStateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public CentralNetworkStateEnum getState() {
        return state;
    }

    public void setState(CentralNetworkStateEnum state) {
        this.state = state;
    }

    public CentralNetwork withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CentralNetwork withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CentralNetwork addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CentralNetwork withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 实例标签。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CentralNetwork withPlanes(List<CentralNetworkPlane> planes) {
        this.planes = planes;
        return this;
    }

    public CentralNetwork addPlanesItem(CentralNetworkPlane planesItem) {
        if (this.planes == null) {
            this.planes = new ArrayList<>();
        }
        this.planes.add(planesItem);
        return this;
    }

    public CentralNetwork withPlanes(Consumer<List<CentralNetworkPlane>> planesSetter) {
        if (this.planes == null) {
            this.planes = new ArrayList<>();
        }
        planesSetter.accept(this.planes);
        return this;
    }

    /**
     * 中心网平面列表。
     * @return planes
     */
    public List<CentralNetworkPlane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<CentralNetworkPlane> planes) {
        this.planes = planes;
    }

    public CentralNetwork withErInstances(List<CentralNetworkErInstance> erInstances) {
        this.erInstances = erInstances;
        return this;
    }

    public CentralNetwork addErInstancesItem(CentralNetworkErInstance erInstancesItem) {
        if (this.erInstances == null) {
            this.erInstances = new ArrayList<>();
        }
        this.erInstances.add(erInstancesItem);
        return this;
    }

    public CentralNetwork withErInstances(Consumer<List<CentralNetworkErInstance>> erInstancesSetter) {
        if (this.erInstances == null) {
            this.erInstances = new ArrayList<>();
        }
        erInstancesSetter.accept(this.erInstances);
        return this;
    }

    /**
     * 中心网ER实例列表。
     * @return erInstances
     */
    public List<CentralNetworkErInstance> getErInstances() {
        return erInstances;
    }

    public void setErInstances(List<CentralNetworkErInstance> erInstances) {
        this.erInstances = erInstances;
    }

    public CentralNetwork withConnections(List<CentralNetworkConnectionInfo> connections) {
        this.connections = connections;
        return this;
    }

    public CentralNetwork addConnectionsItem(CentralNetworkConnectionInfo connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public CentralNetwork withConnections(Consumer<List<CentralNetworkConnectionInfo>> connectionsSetter) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        connectionsSetter.accept(this.connections);
        return this;
    }

    /**
     * 中心网ER连接列表。
     * @return connections
     */
    public List<CentralNetworkConnectionInfo> getConnections() {
        return connections;
    }

    public void setConnections(List<CentralNetworkConnectionInfo> connections) {
        this.connections = connections;
    }

    public CentralNetwork withDefaultPlaneId(String defaultPlaneId) {
        this.defaultPlaneId = defaultPlaneId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return defaultPlaneId
     */
    public String getDefaultPlaneId() {
        return defaultPlaneId;
    }

    public void setDefaultPlaneId(String defaultPlaneId) {
        this.defaultPlaneId = defaultPlaneId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetwork that = (CentralNetwork) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.state, that.state)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.planes, that.planes)
            && Objects.equals(this.erInstances, that.erInstances) && Objects.equals(this.connections, that.connections)
            && Objects.equals(this.defaultPlaneId, that.defaultPlaneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdAt,
            updatedAt,
            domainId,
            state,
            enterpriseProjectId,
            tags,
            planes,
            erInstances,
            connections,
            defaultPlaneId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetwork {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    planes: ").append(toIndentedString(planes)).append("\n");
        sb.append("    erInstances: ").append(toIndentedString(erInstances)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    defaultPlaneId: ").append(toIndentedString(defaultPlaneId)).append("\n");
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
