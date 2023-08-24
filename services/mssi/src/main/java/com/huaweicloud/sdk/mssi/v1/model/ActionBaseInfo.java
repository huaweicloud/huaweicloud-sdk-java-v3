package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Connector执行动作基本数据
 */
public class ActionBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private Object actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_action_html")

    private String connectorActionHtml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_created_type")

    private String connectorCreatedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_version")

    private String connectorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private Object definition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swagger")

    private Object swagger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_result")

    private String testResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    public ActionBaseInfo withActionType(Object actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 执行动作的类型
     * @return actionType
     */
    public Object getActionType() {
        return actionType;
    }

    public void setActionType(Object actionType) {
        this.actionType = actionType;
    }

    public ActionBaseInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 分类
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ActionBaseInfo withConnectorActionHtml(String connectorActionHtml) {
        this.connectorActionHtml = connectorActionHtml;
        return this;
    }

    /**
     * Get connectorActionHtml
     * @return connectorActionHtml
     */
    public String getConnectorActionHtml() {
        return connectorActionHtml;
    }

    public void setConnectorActionHtml(String connectorActionHtml) {
        this.connectorActionHtml = connectorActionHtml;
    }

    public ActionBaseInfo withConnectorCreatedType(String connectorCreatedType) {
        this.connectorCreatedType = connectorCreatedType;
        return this;
    }

    /**
     * Get connectorCreatedType
     * @return connectorCreatedType
     */
    public String getConnectorCreatedType() {
        return connectorCreatedType;
    }

    public void setConnectorCreatedType(String connectorCreatedType) {
        this.connectorCreatedType = connectorCreatedType;
    }

    public ActionBaseInfo withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 自定义连接器ID
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public ActionBaseInfo withConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }

    /**
     * 连接器版本
     * @return connectorVersion
     */
    public String getConnectorVersion() {
        return connectorVersion;
    }

    public void setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
    }

    public ActionBaseInfo withCreatedTime(OffsetDateTime createdTime) {
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

    public ActionBaseInfo withDefinition(Object definition) {
        this.definition = definition;
        return this;
    }

    /**
     * 操作or触发器的详细定义
     * @return definition
     */
    public Object getDefinition() {
        return definition;
    }

    public void setDefinition(Object definition) {
        this.definition = definition;
    }

    public ActionBaseInfo withDescription(String description) {
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

    public ActionBaseInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 执行动作ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActionBaseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 执行动作名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionBaseInfo withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 执行动作ID
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public ActionBaseInfo withSwagger(Object swagger) {
        this.swagger = swagger;
        return this;
    }

    /**
     * swagger文档
     * @return swagger
     */
    public Object getSwagger() {
        return swagger;
    }

    public void setSwagger(Object swagger) {
        this.swagger = swagger;
    }

    public ActionBaseInfo withTestResult(String testResult) {
        this.testResult = testResult;
        return this;
    }

    /**
     * 最近一次测试结果
     * @return testResult
     */
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public ActionBaseInfo withUpdatedTime(OffsetDateTime updatedTime) {
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

    public ActionBaseInfo withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 标记动作在流编排是否可见
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionBaseInfo that = (ActionBaseInfo) obj;
        return Objects.equals(this.actionType, that.actionType) && Objects.equals(this.category, that.category)
            && Objects.equals(this.connectorActionHtml, that.connectorActionHtml)
            && Objects.equals(this.connectorCreatedType, that.connectorCreatedType)
            && Objects.equals(this.connectorId, that.connectorId)
            && Objects.equals(this.connectorVersion, that.connectorVersion)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.definition, that.definition)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.operationId, that.operationId)
            && Objects.equals(this.swagger, that.swagger) && Objects.equals(this.testResult, that.testResult)
            && Objects.equals(this.updatedTime, that.updatedTime) && Objects.equals(this.visibility, that.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionType,
            category,
            connectorActionHtml,
            connectorCreatedType,
            connectorId,
            connectorVersion,
            createdTime,
            definition,
            description,
            id,
            name,
            operationId,
            swagger,
            testResult,
            updatedTime,
            visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionBaseInfo {\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    connectorActionHtml: ").append(toIndentedString(connectorActionHtml)).append("\n");
        sb.append("    connectorCreatedType: ").append(toIndentedString(connectorCreatedType)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    connectorVersion: ").append(toIndentedString(connectorVersion)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    swagger: ").append(toIndentedString(swagger)).append("\n");
        sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
