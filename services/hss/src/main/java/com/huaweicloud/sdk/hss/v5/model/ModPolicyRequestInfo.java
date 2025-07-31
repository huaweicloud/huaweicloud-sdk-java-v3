package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改策略请求
 */
public class ModPolicyRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_description")

    private String policyDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private PolicyContent content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_image_list")

    private List<WhiteImageInfo> whiteImageList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<PolicyProtectScope> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private String parameters;

    public ModPolicyRequestInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ModPolicyRequestInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ModPolicyRequestInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ModPolicyRequestInfo withPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
        return this;
    }

    /**
     * 策略描述
     * @return policyDescription
     */
    public String getPolicyDescription() {
        return policyDescription;
    }

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }

    public ModPolicyRequestInfo withContent(PolicyContent content) {
        this.content = content;
        return this;
    }

    public ModPolicyRequestInfo withContent(Consumer<PolicyContent> contentSetter) {
        if (this.content == null) {
            this.content = new PolicyContent();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /**
     * Get content
     * @return content
     */
    public PolicyContent getContent() {
        return content;
    }

    public void setContent(PolicyContent content) {
        this.content = content;
    }

    public ModPolicyRequestInfo withWhiteImageList(List<WhiteImageInfo> whiteImageList) {
        this.whiteImageList = whiteImageList;
        return this;
    }

    public ModPolicyRequestInfo addWhiteImageListItem(WhiteImageInfo whiteImageListItem) {
        if (this.whiteImageList == null) {
            this.whiteImageList = new ArrayList<>();
        }
        this.whiteImageList.add(whiteImageListItem);
        return this;
    }

    public ModPolicyRequestInfo withWhiteImageList(Consumer<List<WhiteImageInfo>> whiteImageListSetter) {
        if (this.whiteImageList == null) {
            this.whiteImageList = new ArrayList<>();
        }
        whiteImageListSetter.accept(this.whiteImageList);
        return this;
    }

    /**
     * 白名单镜像
     * @return whiteImageList
     */
    public List<WhiteImageInfo> getWhiteImageList() {
        return whiteImageList;
    }

    public void setWhiteImageList(List<WhiteImageInfo> whiteImageList) {
        this.whiteImageList = whiteImageList;
    }

    public ModPolicyRequestInfo withResources(List<PolicyProtectScope> resources) {
        this.resources = resources;
        return this;
    }

    public ModPolicyRequestInfo addResourcesItem(PolicyProtectScope resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ModPolicyRequestInfo withResources(Consumer<List<PolicyProtectScope>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 防护的资源信息
     * @return resources
     */
    public List<PolicyProtectScope> getResources() {
        return resources;
    }

    public void setResources(List<PolicyProtectScope> resources) {
        this.resources = resources;
    }

    public ModPolicyRequestInfo withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 策略参数值
     * @return parameters
     */
    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModPolicyRequestInfo that = (ModPolicyRequestInfo) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.policyDescription, that.policyDescription)
            && Objects.equals(this.content, that.content) && Objects.equals(this.whiteImageList, that.whiteImageList)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(policyName, policyId, templateId, policyDescription, content, whiteImageList, resources, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModPolicyRequestInfo {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    whiteImageList: ").append(toIndentedString(whiteImageList)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
