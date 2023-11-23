package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ShowAppTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private String runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private String params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_count")

    private Long deployCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Long version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_guide")

    private String templateGuide;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<AppTemplateResourceDetail> resources = null;

    public ShowAppTemplateResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAppTemplateResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowAppTemplateResponse withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 模板执行运行时
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public ShowAppTemplateResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 模板使用场景
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowAppTemplateResponse withParams(String params) {
        this.params = params;
        return this;
    }

    /**
     * 模板参数
     * @return params
     */
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public ShowAppTemplateResponse withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 模板镜像文件（base64编码）
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ShowAppTemplateResponse withDeployCount(Long deployCount) {
        this.deployCount = deployCount;
        return this;
    }

    /**
     * 模板部署次数
     * @return deployCount
     */
    public Long getDeployCount() {
        return deployCount;
    }

    public void setDeployCount(Long deployCount) {
        this.deployCount = deployCount;
    }

    public ShowAppTemplateResponse withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * 模板版本
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public ShowAppTemplateResponse withTemplateGuide(String templateGuide) {
        this.templateGuide = templateGuide;
        return this;
    }

    /**
     * 模板指南
     * @return templateGuide
     */
    public String getTemplateGuide() {
        return templateGuide;
    }

    public void setTemplateGuide(String templateGuide) {
        this.templateGuide = templateGuide;
    }

    public ShowAppTemplateResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 模板创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowAppTemplateResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 模板更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowAppTemplateResponse withResources(List<AppTemplateResourceDetail> resources) {
        this.resources = resources;
        return this;
    }

    public ShowAppTemplateResponse addResourcesItem(AppTemplateResourceDetail resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowAppTemplateResponse withResources(Consumer<List<AppTemplateResourceDetail>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 模板资源
     * @return resources
     */
    public List<AppTemplateResourceDetail> getResources() {
        return resources;
    }

    public void setResources(List<AppTemplateResourceDetail> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAppTemplateResponse that = (ShowAppTemplateResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.runtime, that.runtime) && Objects.equals(this.category, that.category)
            && Objects.equals(this.params, that.params) && Objects.equals(this.image, that.image)
            && Objects.equals(this.deployCount, that.deployCount) && Objects.equals(this.version, that.version)
            && Objects.equals(this.templateGuide, that.templateGuide)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            runtime,
            category,
            params,
            image,
            deployCount,
            version,
            templateGuide,
            createTime,
            updateTime,
            resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppTemplateResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    deployCount: ").append(toIndentedString(deployCount)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    templateGuide: ").append(toIndentedString(templateGuide)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
