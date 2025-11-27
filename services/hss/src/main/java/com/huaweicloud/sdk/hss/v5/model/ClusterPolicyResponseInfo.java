package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群防护策略信息
 */
public class ClusterPolicyResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private Object content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_content")

    private String deployContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private String parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resources> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Integer updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_num")

    private Integer imageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels_num")

    private Integer labelsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_images")

    private List<WhiteImageInfo> whiteImages = null;

    public ClusterPolicyResponseInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID **取值范围**： 不涉及 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ClusterPolicyResponseInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称 **取值范围**： 不涉及 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ClusterPolicyResponseInfo withContent(Object content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 策略内容 **取值范围**： 不涉及 
     * @return content
     */
    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public ClusterPolicyResponseInfo withDeployContent(String deployContent) {
        this.deployContent = deployContent;
        return this;
    }

    /**
     * **参数解释**： 部署内容 **取值范围**： 不涉及 
     * @return deployContent
     */
    public String getDeployContent() {
        return deployContent;
    }

    public void setDeployContent(String deployContent) {
        this.deployContent = deployContent;
    }

    public ClusterPolicyResponseInfo withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * **参数解释**： 参数 **取值范围**： 不涉及 
     * @return parameters
     */
    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public ClusterPolicyResponseInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**： 策略名称 **取值范围**： 不涉及 
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ClusterPolicyResponseInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**： 策略ID **取值范围**： 不涉及 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ClusterPolicyResponseInfo withResources(List<Resources> resources) {
        this.resources = resources;
        return this;
    }

    public ClusterPolicyResponseInfo addResourcesItem(Resources resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ClusterPolicyResponseInfo withResources(Consumer<List<Resources>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释**： 资源 **取值范围**： 不涉及 
     * @return resources
     */
    public List<Resources> getResources() {
        return resources;
    }

    public void setResources(List<Resources> resources) {
        this.resources = resources;
    }

    public ClusterPolicyResponseInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释**： 模板ID **取值范围**： 不涉及 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ClusterPolicyResponseInfo withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * **参数解释**： 模板名称 **取值范围**： 不涉及 
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ClusterPolicyResponseInfo withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * **参数解释**： 模板类型 **取值范围**： 不涉及 
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public ClusterPolicyResponseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 策略描述 **取值范围**： 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClusterPolicyResponseInfo withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 更新时间 **取值范围**： 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public ClusterPolicyResponseInfo withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间 **取值范围**： 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public ClusterPolicyResponseInfo withImageNum(Integer imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    /**
     * **参数解释**： 防护镜像数量 **取值范围**： 不涉及 
     * minimum: 0
     * maximum: 10000
     * @return imageNum
     */
    public Integer getImageNum() {
        return imageNum;
    }

    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    public ClusterPolicyResponseInfo withLabelsNum(Integer labelsNum) {
        this.labelsNum = labelsNum;
        return this;
    }

    /**
     * **参数解释**： 防护标签数量 **取值范围**： 不涉及 
     * minimum: 0
     * maximum: 10000
     * @return labelsNum
     */
    public Integer getLabelsNum() {
        return labelsNum;
    }

    public void setLabelsNum(Integer labelsNum) {
        this.labelsNum = labelsNum;
    }

    public ClusterPolicyResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态 **取值范围**： 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterPolicyResponseInfo withWhiteImages(List<WhiteImageInfo> whiteImages) {
        this.whiteImages = whiteImages;
        return this;
    }

    public ClusterPolicyResponseInfo addWhiteImagesItem(WhiteImageInfo whiteImagesItem) {
        if (this.whiteImages == null) {
            this.whiteImages = new ArrayList<>();
        }
        this.whiteImages.add(whiteImagesItem);
        return this;
    }

    public ClusterPolicyResponseInfo withWhiteImages(Consumer<List<WhiteImageInfo>> whiteImagesSetter) {
        if (this.whiteImages == null) {
            this.whiteImages = new ArrayList<>();
        }
        whiteImagesSetter.accept(this.whiteImages);
        return this;
    }

    /**
     * **参数解释**： 白名单镜像 **取值范围**： 不涉及 
     * @return whiteImages
     */
    public List<WhiteImageInfo> getWhiteImages() {
        return whiteImages;
    }

    public void setWhiteImages(List<WhiteImageInfo> whiteImages) {
        this.whiteImages = whiteImages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterPolicyResponseInfo that = (ClusterPolicyResponseInfo) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.content, that.content) && Objects.equals(this.deployContent, that.deployContent)
            && Objects.equals(this.parameters, that.parameters) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.imageNum, that.imageNum)
            && Objects.equals(this.labelsNum, that.labelsNum) && Objects.equals(this.status, that.status)
            && Objects.equals(this.whiteImages, that.whiteImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            clusterName,
            content,
            deployContent,
            parameters,
            policyName,
            policyId,
            resources,
            templateId,
            templateName,
            templateType,
            description,
            updateTime,
            createTime,
            imageNum,
            labelsNum,
            status,
            whiteImages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterPolicyResponseInfo {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    deployContent: ").append(toIndentedString(deployContent)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    imageNum: ").append(toIndentedString(imageNum)).append("\n");
        sb.append("    labelsNum: ").append(toIndentedString(labelsNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    whiteImages: ").append(toIndentedString(whiteImages)).append("\n");
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
