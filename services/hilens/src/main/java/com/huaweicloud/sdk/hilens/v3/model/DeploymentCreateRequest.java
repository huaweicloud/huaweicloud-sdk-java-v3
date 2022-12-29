package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeploymentCreateRequest
 */
public class DeploymentCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment")

    private DeploymentRequest deployment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license_quota")

    private Integer licenseQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svc_order_id")

    private String svcOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<DeploymentTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_tags")

    private List<TagRequest> nodeTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    public DeploymentCreateRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 应用部署到指定集群，与node_ids二选一
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeploymentCreateRequest withDeployment(DeploymentRequest deployment) {
        this.deployment = deployment;
        return this;
    }

    public DeploymentCreateRequest withDeployment(Consumer<DeploymentRequest> deploymentSetter) {
        if (this.deployment == null) {
            this.deployment = new DeploymentRequest();
            deploymentSetter.accept(this.deployment);
        }

        return this;
    }

    /**
     * Get deployment
     * @return deployment
     */
    public DeploymentRequest getDeployment() {
        return deployment;
    }

    public void setDeployment(DeploymentRequest deployment) {
        this.deployment = deployment;
    }

    public DeploymentCreateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用部署描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeploymentCreateRequest withLicenseQuota(Integer licenseQuota) {
        this.licenseQuota = licenseQuota;
        return this;
    }

    /**
     * 本次部署所使用的license额度，配合订单中的计费量纲的实际计费类型，如：视频路数/实例数/QPS。
     * @return licenseQuota
     */
    public Integer getLicenseQuota() {
        return licenseQuota;
    }

    public void setLicenseQuota(Integer licenseQuota) {
        this.licenseQuota = licenseQuota;
    }

    public DeploymentCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用部署名称，只允许英文小写字母、数字、中划线，最大长度32, 英文小写字母或数字开头和结尾
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeploymentCreateRequest withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public DeploymentCreateRequest addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public DeploymentCreateRequest withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 应用部署到指定节点，与cluster_id二选一
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public DeploymentCreateRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 应用部署来源: HiLens市场(hlm) or aigallery(aig) or 自定义(userdefined)
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public DeploymentCreateRequest withSvcOrderId(String svcOrderId) {
        this.svcOrderId = svcOrderId;
        return this;
    }

    /**
     * 购买应用管理服务的订单ID。
     * @return svcOrderId
     */
    public String getSvcOrderId() {
        return svcOrderId;
    }

    public void setSvcOrderId(String svcOrderId) {
        this.svcOrderId = svcOrderId;
    }

    public DeploymentCreateRequest withTags(List<DeploymentTag> tags) {
        this.tags = tags;
        return this;
    }

    public DeploymentCreateRequest addTagsItem(DeploymentTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public DeploymentCreateRequest withTags(Consumer<List<DeploymentTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 部署标签
     * @return tags
     */
    public List<DeploymentTag> getTags() {
        return tags;
    }

    public void setTags(List<DeploymentTag> tags) {
        this.tags = tags;
    }

    public DeploymentCreateRequest withNodeTags(List<TagRequest> nodeTags) {
        this.nodeTags = nodeTags;
        return this;
    }

    public DeploymentCreateRequest addNodeTagsItem(TagRequest nodeTagsItem) {
        if (this.nodeTags == null) {
            this.nodeTags = new ArrayList<>();
        }
        this.nodeTags.add(nodeTagsItem);
        return this;
    }

    public DeploymentCreateRequest withNodeTags(Consumer<List<TagRequest>> nodeTagsSetter) {
        if (this.nodeTags == null) {
            this.nodeTags = new ArrayList<>();
        }
        nodeTagsSetter.accept(this.nodeTags);
        return this;
    }

    /**
     * 部署节点标签列表，当通过节点标签进行部署的时候，需要下发该字段。
     * @return nodeTags
     */
    public List<TagRequest> getNodeTags() {
        return nodeTags;
    }

    public void setNodeTags(List<TagRequest> nodeTags) {
        this.nodeTags = nodeTags;
    }

    public DeploymentCreateRequest withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 标签部署的设备数量
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentCreateRequest deploymentCreateRequest = (DeploymentCreateRequest) o;
        return Objects.equals(this.clusterId, deploymentCreateRequest.clusterId)
            && Objects.equals(this.deployment, deploymentCreateRequest.deployment)
            && Objects.equals(this.description, deploymentCreateRequest.description)
            && Objects.equals(this.licenseQuota, deploymentCreateRequest.licenseQuota)
            && Objects.equals(this.name, deploymentCreateRequest.name)
            && Objects.equals(this.nodeIds, deploymentCreateRequest.nodeIds)
            && Objects.equals(this.source, deploymentCreateRequest.source)
            && Objects.equals(this.svcOrderId, deploymentCreateRequest.svcOrderId)
            && Objects.equals(this.tags, deploymentCreateRequest.tags)
            && Objects.equals(this.nodeTags, deploymentCreateRequest.nodeTags)
            && Objects.equals(this.nodeNum, deploymentCreateRequest.nodeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            deployment,
            description,
            licenseQuota,
            name,
            nodeIds,
            source,
            svcOrderId,
            tags,
            nodeTags,
            nodeNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentCreateRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    licenseQuota: ").append(toIndentedString(licenseQuota)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    svcOrderId: ").append(toIndentedString(svcOrderId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    nodeTags: ").append(toIndentedString(nodeTags)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
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
