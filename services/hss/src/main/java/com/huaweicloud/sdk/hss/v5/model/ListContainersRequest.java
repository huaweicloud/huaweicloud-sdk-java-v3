package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListContainersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_container")

    private Boolean clusterContainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListContainersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListContainersRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**: 容器名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListContainersRequest withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释**: 所属Pod名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ListContainersRequest withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListContainersRequest withClusterContainer(Boolean clusterContainer) {
        this.clusterContainer = clusterContainer;
        return this;
    }

    /**
     * **参数解释**: 是否是集群纳管的容器 **约束限制**: 不涉及 **取值范围**:   - true：是集群纳管的容器。   - false：不是集群纳管的容器。 **默认取值**: false 
     * @return clusterContainer
     */
    public Boolean getClusterContainer() {
        return clusterContainer;
    }

    public void setClusterContainer(Boolean clusterContainer) {
        this.clusterContainer = clusterContainer;
    }

    public ListContainersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListContainersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 取值0-2000000 **默认取值**: 0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListContainersRequest that = (ListContainersRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.clusterContainer, that.clusterContainer) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, containerName, podName, imageName, clusterContainer, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListContainersRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    clusterContainer: ").append(toIndentedString(clusterContainer)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
