package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘节点组返回参数
 */
public class EdgeGroupResp {

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

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_role")

    private String iamRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_num")

    private Integer gpuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<EdgeNodeResp> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployments")

    private List<GroupDeployment> deployments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<Attributes> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Attributes> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_node_add")

    private List<String> successNodeAdd = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_node_del")

    private List<String> successNodeDel = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_node_add")

    private List<String> failedNodeAdd = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_node_del")

    private List<String> failedNodeDel = null;

    public EdgeGroupResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘节点组ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EdgeGroupResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘节点组名称，小写英文字母、数字、中划线，以小写字母或数字开头，最大长度为32个字符，不能为空
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeGroupResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeGroupResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EdgeGroupResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EdgeGroupResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 边缘节点组所属的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EdgeGroupResp withIamRole(String iamRole) {
        this.iamRole = iamRole;
        return this;
    }

    /**
     * 边缘节点组所属账号的IAM权限，没有铂金版权限的账号无法使用节点组功能
     * @return iamRole
     */
    public String getIamRole() {
        return iamRole;
    }

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    public EdgeGroupResp withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 边缘节点组CPU总数，为边缘节点组所绑定的边缘节点的CPU数目之和
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public EdgeGroupResp withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 边缘节点组内存总数，为边缘节点组所绑定的边缘节点的内存之和
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public EdgeGroupResp withGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
        return this;
    }

    /**
     * 边缘节点组GPU总数，为边缘节点组所绑定的边缘节点的GPU数目之和
     * @return gpuNum
     */
    public Integer getGpuNum() {
        return gpuNum;
    }

    public void setGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
    }

    public EdgeGroupResp withNodes(List<EdgeNodeResp> nodes) {
        this.nodes = nodes;
        return this;
    }

    public EdgeGroupResp addNodesItem(EdgeNodeResp nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public EdgeGroupResp withNodes(Consumer<List<EdgeNodeResp>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 绑定的边缘节点详情
     * @return nodes
     */
    public List<EdgeNodeResp> getNodes() {
        return nodes;
    }

    public void setNodes(List<EdgeNodeResp> nodes) {
        this.nodes = nodes;
    }

    public EdgeGroupResp withDeployments(List<GroupDeployment> deployments) {
        this.deployments = deployments;
        return this;
    }

    public EdgeGroupResp addDeploymentsItem(GroupDeployment deploymentsItem) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deploymentsItem);
        return this;
    }

    public EdgeGroupResp withDeployments(Consumer<List<GroupDeployment>> deploymentsSetter) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        deploymentsSetter.accept(this.deployments);
        return this;
    }

    /**
     * 绑定的边缘应用详情
     * @return deployments
     */
    public List<GroupDeployment> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<GroupDeployment> deployments) {
        this.deployments = deployments;
    }

    public EdgeGroupResp withAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public EdgeGroupResp addAttributesItem(Attributes attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public EdgeGroupResp withAttributes(Consumer<List<Attributes>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 属性
     * @return attributes
     */
    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public EdgeGroupResp withTags(List<Attributes> tags) {
        this.tags = tags;
        return this;
    }

    public EdgeGroupResp addTagsItem(Attributes tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public EdgeGroupResp withTags(Consumer<List<Attributes>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<Attributes> getTags() {
        return tags;
    }

    public void setTags(List<Attributes> tags) {
        this.tags = tags;
    }

    public EdgeGroupResp withSuccessNodeAdd(List<String> successNodeAdd) {
        this.successNodeAdd = successNodeAdd;
        return this;
    }

    public EdgeGroupResp addSuccessNodeAddItem(String successNodeAddItem) {
        if (this.successNodeAdd == null) {
            this.successNodeAdd = new ArrayList<>();
        }
        this.successNodeAdd.add(successNodeAddItem);
        return this;
    }

    public EdgeGroupResp withSuccessNodeAdd(Consumer<List<String>> successNodeAddSetter) {
        if (this.successNodeAdd == null) {
            this.successNodeAdd = new ArrayList<>();
        }
        successNodeAddSetter.accept(this.successNodeAdd);
        return this;
    }

    /**
     * 绑定操作成功的节点ID列表
     * @return successNodeAdd
     */
    public List<String> getSuccessNodeAdd() {
        return successNodeAdd;
    }

    public void setSuccessNodeAdd(List<String> successNodeAdd) {
        this.successNodeAdd = successNodeAdd;
    }

    public EdgeGroupResp withSuccessNodeDel(List<String> successNodeDel) {
        this.successNodeDel = successNodeDel;
        return this;
    }

    public EdgeGroupResp addSuccessNodeDelItem(String successNodeDelItem) {
        if (this.successNodeDel == null) {
            this.successNodeDel = new ArrayList<>();
        }
        this.successNodeDel.add(successNodeDelItem);
        return this;
    }

    public EdgeGroupResp withSuccessNodeDel(Consumer<List<String>> successNodeDelSetter) {
        if (this.successNodeDel == null) {
            this.successNodeDel = new ArrayList<>();
        }
        successNodeDelSetter.accept(this.successNodeDel);
        return this;
    }

    /**
     * 解绑操作成功的节点ID列表
     * @return successNodeDel
     */
    public List<String> getSuccessNodeDel() {
        return successNodeDel;
    }

    public void setSuccessNodeDel(List<String> successNodeDel) {
        this.successNodeDel = successNodeDel;
    }

    public EdgeGroupResp withFailedNodeAdd(List<String> failedNodeAdd) {
        this.failedNodeAdd = failedNodeAdd;
        return this;
    }

    public EdgeGroupResp addFailedNodeAddItem(String failedNodeAddItem) {
        if (this.failedNodeAdd == null) {
            this.failedNodeAdd = new ArrayList<>();
        }
        this.failedNodeAdd.add(failedNodeAddItem);
        return this;
    }

    public EdgeGroupResp withFailedNodeAdd(Consumer<List<String>> failedNodeAddSetter) {
        if (this.failedNodeAdd == null) {
            this.failedNodeAdd = new ArrayList<>();
        }
        failedNodeAddSetter.accept(this.failedNodeAdd);
        return this;
    }

    /**
     * 绑定操作失败的节点ID列表
     * @return failedNodeAdd
     */
    public List<String> getFailedNodeAdd() {
        return failedNodeAdd;
    }

    public void setFailedNodeAdd(List<String> failedNodeAdd) {
        this.failedNodeAdd = failedNodeAdd;
    }

    public EdgeGroupResp withFailedNodeDel(List<String> failedNodeDel) {
        this.failedNodeDel = failedNodeDel;
        return this;
    }

    public EdgeGroupResp addFailedNodeDelItem(String failedNodeDelItem) {
        if (this.failedNodeDel == null) {
            this.failedNodeDel = new ArrayList<>();
        }
        this.failedNodeDel.add(failedNodeDelItem);
        return this;
    }

    public EdgeGroupResp withFailedNodeDel(Consumer<List<String>> failedNodeDelSetter) {
        if (this.failedNodeDel == null) {
            this.failedNodeDel = new ArrayList<>();
        }
        failedNodeDelSetter.accept(this.failedNodeDel);
        return this;
    }

    /**
     * 解绑操作失败的节点ID列表
     * @return failedNodeDel
     */
    public List<String> getFailedNodeDel() {
        return failedNodeDel;
    }

    public void setFailedNodeDel(List<String> failedNodeDel) {
        this.failedNodeDel = failedNodeDel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdgeGroupResp that = (EdgeGroupResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.iamRole, that.iamRole) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.gpuNum, that.gpuNum)
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.deployments, that.deployments)
            && Objects.equals(this.attributes, that.attributes) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.successNodeAdd, that.successNodeAdd)
            && Objects.equals(this.successNodeDel, that.successNodeDel)
            && Objects.equals(this.failedNodeAdd, that.failedNodeAdd)
            && Objects.equals(this.failedNodeDel, that.failedNodeDel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdAt,
            updatedAt,
            projectId,
            iamRole,
            cpu,
            memory,
            gpuNum,
            nodes,
            deployments,
            attributes,
            tags,
            successNodeAdd,
            successNodeDel,
            failedNodeAdd,
            failedNodeDel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeGroupResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    iamRole: ").append(toIndentedString(iamRole)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpuNum: ").append(toIndentedString(gpuNum)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    successNodeAdd: ").append(toIndentedString(successNodeAdd)).append("\n");
        sb.append("    successNodeDel: ").append(toIndentedString(successNodeDel)).append("\n");
        sb.append("    failedNodeAdd: ").append(toIndentedString(failedNodeAdd)).append("\n");
        sb.append("    failedNodeDel: ").append(toIndentedString(failedNodeDel)).append("\n");
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
