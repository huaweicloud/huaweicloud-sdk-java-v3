package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分支网络。
 */
public class SiteNetworkEntry {

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

    private SiteNetworkStateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_policy_id")

    private String applyPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topology")

    private SiteNetworkTopologyEnum topology;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    private List<SiteConnection> connections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sites")

    private List<SiteInformation> sites = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hub_site")

    private SiteInformation hubSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spoke_sites")

    private List<SiteInformation> spokeSites = null;

    public SiteNetworkEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SiteNetworkEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SiteNetworkEntry withDescription(String description) {
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

    public SiteNetworkEntry withCreatedAt(OffsetDateTime createdAt) {
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

    public SiteNetworkEntry withUpdatedAt(OffsetDateTime updatedAt) {
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

    public SiteNetworkEntry withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public SiteNetworkEntry withState(SiteNetworkStateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public SiteNetworkStateEnum getState() {
        return state;
    }

    public void setState(SiteNetworkStateEnum state) {
        this.state = state;
    }

    public SiteNetworkEntry withEnterpriseProjectId(String enterpriseProjectId) {
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

    public SiteNetworkEntry withApplyPolicyId(String applyPolicyId) {
        this.applyPolicyId = applyPolicyId;
        return this;
    }

    /**
     * 应用策略ID。
     * @return applyPolicyId
     */
    public String getApplyPolicyId() {
        return applyPolicyId;
    }

    public void setApplyPolicyId(String applyPolicyId) {
        this.applyPolicyId = applyPolicyId;
    }

    public SiteNetworkEntry withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public SiteNetworkEntry addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SiteNetworkEntry withTags(Consumer<List<Tag>> tagsSetter) {
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

    public SiteNetworkEntry withTopology(SiteNetworkTopologyEnum topology) {
        this.topology = topology;
        return this;
    }

    /**
     * Get topology
     * @return topology
     */
    public SiteNetworkTopologyEnum getTopology() {
        return topology;
    }

    public void setTopology(SiteNetworkTopologyEnum topology) {
        this.topology = topology;
    }

    public SiteNetworkEntry withConnections(List<SiteConnection> connections) {
        this.connections = connections;
        return this;
    }

    public SiteNetworkEntry addConnectionsItem(SiteConnection connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public SiteNetworkEntry withConnections(Consumer<List<SiteConnection>> connectionsSetter) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        connectionsSetter.accept(this.connections);
        return this;
    }

    /**
     * 分支连接列表。
     * @return connections
     */
    public List<SiteConnection> getConnections() {
        return connections;
    }

    public void setConnections(List<SiteConnection> connections) {
        this.connections = connections;
    }

    public SiteNetworkEntry withSites(List<SiteInformation> sites) {
        this.sites = sites;
        return this;
    }

    public SiteNetworkEntry addSitesItem(SiteInformation sitesItem) {
        if (this.sites == null) {
            this.sites = new ArrayList<>();
        }
        this.sites.add(sitesItem);
        return this;
    }

    public SiteNetworkEntry withSites(Consumer<List<SiteInformation>> sitesSetter) {
        if (this.sites == null) {
            this.sites = new ArrayList<>();
        }
        sitesSetter.accept(this.sites);
        return this;
    }

    /**
     * 点对点拓扑或者网状拓扑中的节点。
     * @return sites
     */
    public List<SiteInformation> getSites() {
        return sites;
    }

    public void setSites(List<SiteInformation> sites) {
        this.sites = sites;
    }

    public SiteNetworkEntry withHubSite(SiteInformation hubSite) {
        this.hubSite = hubSite;
        return this;
    }

    public SiteNetworkEntry withHubSite(Consumer<SiteInformation> hubSiteSetter) {
        if (this.hubSite == null) {
            this.hubSite = new SiteInformation();
            hubSiteSetter.accept(this.hubSite);
        }

        return this;
    }

    /**
     * Get hubSite
     * @return hubSite
     */
    public SiteInformation getHubSite() {
        return hubSite;
    }

    public void setHubSite(SiteInformation hubSite) {
        this.hubSite = hubSite;
    }

    public SiteNetworkEntry withSpokeSites(List<SiteInformation> spokeSites) {
        this.spokeSites = spokeSites;
        return this;
    }

    public SiteNetworkEntry addSpokeSitesItem(SiteInformation spokeSitesItem) {
        if (this.spokeSites == null) {
            this.spokeSites = new ArrayList<>();
        }
        this.spokeSites.add(spokeSitesItem);
        return this;
    }

    public SiteNetworkEntry withSpokeSites(Consumer<List<SiteInformation>> spokeSitesSetter) {
        if (this.spokeSites == null) {
            this.spokeSites = new ArrayList<>();
        }
        spokeSitesSetter.accept(this.spokeSites);
        return this;
    }

    /**
     * 分支列表。
     * @return spokeSites
     */
    public List<SiteInformation> getSpokeSites() {
        return spokeSites;
    }

    public void setSpokeSites(List<SiteInformation> spokeSites) {
        this.spokeSites = spokeSites;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteNetworkEntry that = (SiteNetworkEntry) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.state, that.state)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.applyPolicyId, that.applyPolicyId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.topology, that.topology) && Objects.equals(this.connections, that.connections)
            && Objects.equals(this.sites, that.sites) && Objects.equals(this.hubSite, that.hubSite)
            && Objects.equals(this.spokeSites, that.spokeSites);
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
            applyPolicyId,
            tags,
            topology,
            connections,
            sites,
            hubSite,
            spokeSites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteNetworkEntry {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    applyPolicyId: ").append(toIndentedString(applyPolicyId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
        sb.append("    hubSite: ").append(toIndentedString(hubSite)).append("\n");
        sb.append("    spokeSites: ").append(toIndentedString(spokeSites)).append("\n");
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
