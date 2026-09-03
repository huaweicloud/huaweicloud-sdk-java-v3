package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息
 */
public class DasCommonInstanceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<DasCommonInstanceNodeDto> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_instance")

    private List<RelatedInstance> relatedInstance = null;

    public DasCommonInstanceDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DasCommonInstanceDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DasCommonInstanceDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DasCommonInstanceDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DasCommonInstanceDto withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DasCommonInstanceDto withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public DasCommonInstanceDto withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 实例引擎版本
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public DasCommonInstanceDto withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 实例引擎端口
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public DasCommonInstanceDto withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DasCommonInstanceDto withNodes(List<DasCommonInstanceNodeDto> nodes) {
        this.nodes = nodes;
        return this;
    }

    public DasCommonInstanceDto addNodesItem(DasCommonInstanceNodeDto nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public DasCommonInstanceDto withNodes(Consumer<List<DasCommonInstanceNodeDto>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 实例节点列表
     * @return nodes
     */
    public List<DasCommonInstanceNodeDto> getNodes() {
        return nodes;
    }

    public void setNodes(List<DasCommonInstanceNodeDto> nodes) {
        this.nodes = nodes;
    }

    public DasCommonInstanceDto withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 数据库来源类型
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public DasCommonInstanceDto withRelatedInstance(List<RelatedInstance> relatedInstance) {
        this.relatedInstance = relatedInstance;
        return this;
    }

    public DasCommonInstanceDto addRelatedInstanceItem(RelatedInstance relatedInstanceItem) {
        if (this.relatedInstance == null) {
            this.relatedInstance = new ArrayList<>();
        }
        this.relatedInstance.add(relatedInstanceItem);
        return this;
    }

    public DasCommonInstanceDto withRelatedInstance(Consumer<List<RelatedInstance>> relatedInstanceSetter) {
        if (this.relatedInstance == null) {
            this.relatedInstance = new ArrayList<>();
        }
        relatedInstanceSetter.accept(this.relatedInstance);
        return this;
    }

    /**
     * 相关实例列表
     * @return relatedInstance
     */
    public List<RelatedInstance> getRelatedInstance() {
        return relatedInstance;
    }

    public void setRelatedInstance(List<RelatedInstance> relatedInstance) {
        this.relatedInstance = relatedInstance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DasCommonInstanceDto that = (DasCommonInstanceDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.port, that.port)
            && Objects.equals(this.region, that.region) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.relatedInstance, that.relatedInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            type,
            enterpriseProjectId,
            engineType,
            engineVersion,
            port,
            region,
            nodes,
            networkType,
            relatedInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DasCommonInstanceDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    relatedInstance: ").append(toIndentedString(relatedInstance)).append("\n");
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
