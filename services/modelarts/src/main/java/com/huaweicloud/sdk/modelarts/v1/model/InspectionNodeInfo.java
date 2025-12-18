package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：巡检节点信息。 **取值范围**：不涉及。
 */
public class InspectionNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status")

    private ExecuteStatus executeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_category")

    private InspectionItemCategory itemCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_category_name")

    private String itemCategoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type")

    private InspectionItemType itemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type_name")

    private String itemTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip")

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "render_data")

    private String renderData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "render_format")

    private RenderFormat renderFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private ResultStatus resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_message")

    private String statusMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public InspectionNodeInfo withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * **参数解释**：巡检详情。 **取值范围**：[0,5000]。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public InspectionNodeInfo withExecuteStatus(ExecuteStatus executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /**
     * Get executeStatus
     * @return executeStatus
     */
    public ExecuteStatus getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(ExecuteStatus executeStatus) {
        this.executeStatus = executeStatus;
    }

    public InspectionNodeInfo withItemCategory(InspectionItemCategory itemCategory) {
        this.itemCategory = itemCategory;
        return this;
    }

    /**
     * Get itemCategory
     * @return itemCategory
     */
    public InspectionItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(InspectionItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public InspectionNodeInfo withItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
        return this;
    }

    /**
     * **参数解释**：巡检类目名称。 **取值范围**：[0,50]。
     * @return itemCategoryName
     */
    public String getItemCategoryName() {
        return itemCategoryName;
    }

    public void setItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
    }

    public InspectionNodeInfo withItemType(InspectionItemType itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * Get itemType
     * @return itemType
     */
    public InspectionItemType getItemType() {
        return itemType;
    }

    public void setItemType(InspectionItemType itemType) {
        this.itemType = itemType;
    }

    public InspectionNodeInfo withItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
        return this;
    }

    /**
     * **参数解释**：巡检项名称。 **取值范围**：[0,50]。
     * @return itemTypeName
     */
    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public InspectionNodeInfo withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * **参数解释**：节点IP。 **取值范围**：[0,50]。
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public InspectionNodeInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**：节点名称。 **取值范围**：[0,50]。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public InspectionNodeInfo withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：AI专属资源池/弹性集群名称。 **取值范围**：[0,50]。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public InspectionNodeInfo withRenderData(String renderData) {
        this.renderData = renderData;
        return this;
    }

    /**
     * 渲染的数据
     * @return renderData
     */
    public String getRenderData() {
        return renderData;
    }

    public void setRenderData(String renderData) {
        this.renderData = renderData;
    }

    public InspectionNodeInfo withRenderFormat(RenderFormat renderFormat) {
        this.renderFormat = renderFormat;
        return this;
    }

    /**
     * Get renderFormat
     * @return renderFormat
     */
    public RenderFormat getRenderFormat() {
        return renderFormat;
    }

    public void setRenderFormat(RenderFormat renderFormat) {
        this.renderFormat = renderFormat;
    }

    public InspectionNodeInfo withResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * Get resultStatus
     * @return resultStatus
     */
    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    public InspectionNodeInfo withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * **参数解释**：服务器ID。 **取值范围**：[0,50]。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public InspectionNodeInfo withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * **参数解释**：状态信息，如执行失败的失败信息。 **取值范围**：[0,500]。
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public InspectionNodeInfo withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * **参数解释**：处理建议。 **取值范围**：[0,500]。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public InspectionNodeInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**：节点id。 **约束限制**：不涉及。 **取值范围**：长度为[1,64]的英文字符、数字、下划线(_)和中划线(-)的组合。 **默认取值**：不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectionNodeInfo that = (InspectionNodeInfo) obj;
        return Objects.equals(this.detail, that.detail) && Objects.equals(this.executeStatus, that.executeStatus)
            && Objects.equals(this.itemCategory, that.itemCategory)
            && Objects.equals(this.itemCategoryName, that.itemCategoryName)
            && Objects.equals(this.itemType, that.itemType) && Objects.equals(this.itemTypeName, that.itemTypeName)
            && Objects.equals(this.nodeIp, that.nodeIp) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.poolName, that.poolName) && Objects.equals(this.renderData, that.renderData)
            && Objects.equals(this.renderFormat, that.renderFormat)
            && Objects.equals(this.resultStatus, that.resultStatus) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.statusMessage, that.statusMessage)
            && Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail,
            executeStatus,
            itemCategory,
            itemCategoryName,
            itemType,
            itemTypeName,
            nodeIp,
            nodeName,
            poolName,
            renderData,
            renderFormat,
            resultStatus,
            serverId,
            statusMessage,
            suggestion,
            nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InspectionNodeInfo {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
        sb.append("    itemCategoryName: ").append(toIndentedString(itemCategoryName)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    itemTypeName: ").append(toIndentedString(itemTypeName)).append("\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    renderData: ").append(toIndentedString(renderData)).append("\n");
        sb.append("    renderFormat: ").append(toIndentedString(renderFormat)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
