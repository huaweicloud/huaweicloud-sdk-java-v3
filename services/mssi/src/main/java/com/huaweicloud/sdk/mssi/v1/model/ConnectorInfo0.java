package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Connector元数据
 */
public class ConnectorInfo0 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authContent")

    private AuthConfigA authContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authId")

    private String authId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definitionRef")

    private String definitionRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needAuth")

    private Boolean needAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private List<Object> operations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swagger")

    private String swagger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<Object> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    public ConnectorInfo0 withAuthContent(AuthConfigA authContent) {
        this.authContent = authContent;
        return this;
    }

    public ConnectorInfo0 withAuthContent(Consumer<AuthConfigA> authContentSetter) {
        if (this.authContent == null) {
            this.authContent = new AuthConfigA();
            authContentSetter.accept(this.authContent);
        }

        return this;
    }

    /**
     * Get authContent
     * @return authContent
     */
    public AuthConfigA getAuthContent() {
        return authContent;
    }

    public void setAuthContent(AuthConfigA authContent) {
        this.authContent = authContent;
    }

    public ConnectorInfo0 withAuthId(String authId) {
        this.authId = authId;
        return this;
    }

    /**
     * 认证id
     * @return authId
     */
    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public ConnectorInfo0 withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 判断方式
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ConnectorInfo0 withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 内置连接器查询
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ConnectorInfo0 withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public ConnectorInfo0 withDefinitionRef(String definitionRef) {
        this.definitionRef = definitionRef;
        return this;
    }

    /**
     * 连接器
     * @return definitionRef
     */
    public String getDefinitionRef() {
        return definitionRef;
    }

    public void setDefinitionRef(String definitionRef) {
        this.definitionRef = definitionRef;
    }

    public ConnectorInfo0 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 连接器描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConnectorInfo0 withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * logo base64编码
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ConnectorInfo0 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 连接器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConnectorInfo0 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectorInfo0 withNeedAuth(Boolean needAuth) {
        this.needAuth = needAuth;
        return this;
    }

    /**
     * 是否需要验证
     * @return needAuth
     */
    public Boolean getNeedAuth() {
        return needAuth;
    }

    public void setNeedAuth(Boolean needAuth) {
        this.needAuth = needAuth;
    }

    public ConnectorInfo0 withOperations(List<Object> operations) {
        this.operations = operations;
        return this;
    }

    public ConnectorInfo0 addOperationsItem(Object operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public ConnectorInfo0 withOperations(Consumer<List<Object>> operationsSetter) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    /**
     * 视图数据
     * @return operations
     */
    public List<Object> getOperations() {
        return operations;
    }

    public void setOperations(List<Object> operations) {
        this.operations = operations;
    }

    public ConnectorInfo0 withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 供应商
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ConnectorInfo0 withSwagger(String swagger) {
        this.swagger = swagger;
        return this;
    }

    /**
     * swagger文档，大文本
     * @return swagger
     */
    public String getSwagger() {
        return swagger;
    }

    public void setSwagger(String swagger) {
        this.swagger = swagger;
    }

    public ConnectorInfo0 withTriggers(List<Object> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ConnectorInfo0 addTriggersItem(Object triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public ConnectorInfo0 withTriggers(Consumer<List<Object>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 操作json
     * @return triggers
     */
    public List<Object> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Object> triggers) {
        this.triggers = triggers;
    }

    public ConnectorInfo0 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 连接器类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConnectorInfo0 withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 修改时间
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectorInfo0 that = (ConnectorInfo0) obj;
        return Objects.equals(this.authContent, that.authContent) && Objects.equals(this.authId, that.authId)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.category, that.category)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.definitionRef, that.definitionRef)
            && Objects.equals(this.description, that.description) && Objects.equals(this.icon, that.icon)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.needAuth, that.needAuth) && Objects.equals(this.operations, that.operations)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.swagger, that.swagger)
            && Objects.equals(this.triggers, that.triggers) && Objects.equals(this.type, that.type)
            && Objects.equals(this.updatedTime, that.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authContent,
            authId,
            authType,
            category,
            createdTime,
            definitionRef,
            description,
            icon,
            id,
            name,
            needAuth,
            operations,
            provider,
            swagger,
            triggers,
            type,
            updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectorInfo0 {\n");
        sb.append("    authContent: ").append(toIndentedString(authContent)).append("\n");
        sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    definitionRef: ").append(toIndentedString(definitionRef)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    needAuth: ").append(toIndentedString(needAuth)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    swagger: ").append(toIndentedString(swagger)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
