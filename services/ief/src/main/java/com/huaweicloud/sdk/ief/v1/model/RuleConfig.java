package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则配置
 */
public class RuleConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_instance_id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_using")

    private Boolean inUsing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_resource")

    private Map<String, String> sourceResource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_resource")

    private Map<String, String> targetResource = null;

    public RuleConfig withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述，最大长度255，不允许^~#$%&*<>()[]{}'\"\\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RuleConfig withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，如果为空则表示是专业版实例。
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public RuleConfig withInUsing(Boolean inUsing) {
        this.inUsing = inUsing;
        return this;
    }

    /**
     * 是否启用规则，默认为true（启用）
     * @return inUsing
     */
    public Boolean getInUsing() {
        return inUsing;
    }

    public void setInUsing(Boolean inUsing) {
        this.inUsing = inUsing;
    }

    public RuleConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称，只允许中文字符、英文字符、数字、下划线、中划线，最大长度64 同一个帐号中创建的规则名唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleConfig withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 源端点ID
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public RuleConfig withSourceResource(Map<String, String> sourceResource) {
        this.sourceResource = sourceResource;
        return this;
    }

    public RuleConfig putSourceResourceItem(String key, String sourceResourceItem) {
        if (this.sourceResource == null) {
            this.sourceResource = new HashMap<>();
        }
        this.sourceResource.put(key, sourceResourceItem);
        return this;
    }

    public RuleConfig withSourceResource(Consumer<Map<String, String>> sourceResourceSetter) {
        if (this.sourceResource == null) {
            this.sourceResource = new HashMap<>();
        }
        sourceResourceSetter.accept(this.sourceResource);
        return this;
    }

    /**
     * 源端点资源。示例： - rest: {\"path\":\"<standard uri format>\"} - eventbus: {\"topic\":\"<project id>/nodes/<node id>/user/<租户自定义且满足eventbus topic要求的字符串>\",\"node_id\":\"<node id>\"}
     * @return sourceResource
     */
    public Map<String, String> getSourceResource() {
        return sourceResource;
    }

    public void setSourceResource(Map<String, String> sourceResource) {
        this.sourceResource = sourceResource;
    }

    public RuleConfig withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 目的端点ID
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public RuleConfig withTargetResource(Map<String, String> targetResource) {
        this.targetResource = targetResource;
        return this;
    }

    public RuleConfig putTargetResourceItem(String key, String targetResourceItem) {
        if (this.targetResource == null) {
            this.targetResource = new HashMap<>();
        }
        this.targetResource.put(key, targetResourceItem);
        return this;
    }

    public RuleConfig withTargetResource(Consumer<Map<String, String>> targetResourceSetter) {
        if (this.targetResource == null) {
            this.targetResource = new HashMap<>();
        }
        targetResourceSetter.accept(this.targetResource);
        return this;
    }

    /**
     * 目的端点资源。示例： - dis: {\"channel\": \"dis channel name\"} - servicebus: {\"path\": \"/request path\"} - apigw: {\"resource\": \"http://ssss.com\"} - eventbus: {\"topic\": \"/xxxx\"}
     * @return targetResource
     */
    public Map<String, String> getTargetResource() {
        return targetResource;
    }

    public void setTargetResource(Map<String, String> targetResource) {
        this.targetResource = targetResource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleConfig ruleConfig = (RuleConfig) o;
        return Objects.equals(this.description, ruleConfig.description)
            && Objects.equals(this.iefInstanceId, ruleConfig.iefInstanceId)
            && Objects.equals(this.inUsing, ruleConfig.inUsing) && Objects.equals(this.name, ruleConfig.name)
            && Objects.equals(this.source, ruleConfig.source)
            && Objects.equals(this.sourceResource, ruleConfig.sourceResource)
            && Objects.equals(this.target, ruleConfig.target)
            && Objects.equals(this.targetResource, ruleConfig.targetResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, iefInstanceId, inUsing, name, source, sourceResource, target, targetResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleConfig {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    inUsing: ").append(toIndentedString(inUsing)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceResource: ").append(toIndentedString(sourceResource)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetResource: ").append(toIndentedString(targetResource)).append("\n");
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
