package com.huaweicloud.sdk.waf.v1.model;

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
public class CreateCustomLlmResponse extends SdkResponse {

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
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referenced_policies")

    private List<ReferencedPolicy> referencedPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public CreateCustomLlmResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义大模型ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateCustomLlmResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义大模型名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCustomLlmResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自定义大模型描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCustomLlmResponse withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * 模型名称
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CreateCustomLlmResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreateCustomLlmResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * API地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateCustomLlmResponse withReferencedPolicies(List<ReferencedPolicy> referencedPolicies) {
        this.referencedPolicies = referencedPolicies;
        return this;
    }

    public CreateCustomLlmResponse addReferencedPoliciesItem(ReferencedPolicy referencedPoliciesItem) {
        if (this.referencedPolicies == null) {
            this.referencedPolicies = new ArrayList<>();
        }
        this.referencedPolicies.add(referencedPoliciesItem);
        return this;
    }

    public CreateCustomLlmResponse withReferencedPolicies(Consumer<List<ReferencedPolicy>> referencedPoliciesSetter) {
        if (this.referencedPolicies == null) {
            this.referencedPolicies = new ArrayList<>();
        }
        referencedPoliciesSetter.accept(this.referencedPolicies);
        return this;
    }

    /**
     * 引用的策略列表
     * @return referencedPolicies
     */
    public List<ReferencedPolicy> getReferencedPolicies() {
        return referencedPolicies;
    }

    public void setReferencedPolicies(List<ReferencedPolicy> referencedPolicies) {
        this.referencedPolicies = referencedPolicies;
    }

    public CreateCustomLlmResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateCustomLlmResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCustomLlmResponse that = (CreateCustomLlmResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.url, that.url)
            && Objects.equals(this.referencedPolicies, that.referencedPolicies)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, description, modelName, protocol, url, referencedPolicies, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomLlmResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    referencedPolicies: ").append(toIndentedString(referencedPolicies)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
