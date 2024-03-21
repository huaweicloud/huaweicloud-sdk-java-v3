package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 业务资产目录树
 */
public class BusinessCatalogTreeNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_catalog_guid")

    private String businessCatalogGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_catalog_name")

    private String businessCatalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_catalog_name_eng")

    private String businessCatalogNameEng;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_name")

    private String qualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_nodes")

    private List<BusinessCatalogTreeNode> childNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_entity_nodes")

    private List<LogicEntityNodes> logicEntityNodes = null;

    public BusinessCatalogTreeNode withBusinessCatalogGuid(String businessCatalogGuid) {
        this.businessCatalogGuid = businessCatalogGuid;
        return this;
    }

    /**
     * 业务资产guid
     * @return businessCatalogGuid
     */
    public String getBusinessCatalogGuid() {
        return businessCatalogGuid;
    }

    public void setBusinessCatalogGuid(String businessCatalogGuid) {
        this.businessCatalogGuid = businessCatalogGuid;
    }

    public BusinessCatalogTreeNode withBusinessCatalogName(String businessCatalogName) {
        this.businessCatalogName = businessCatalogName;
        return this;
    }

    /**
     * 业务资产名称
     * @return businessCatalogName
     */
    public String getBusinessCatalogName() {
        return businessCatalogName;
    }

    public void setBusinessCatalogName(String businessCatalogName) {
        this.businessCatalogName = businessCatalogName;
    }

    public BusinessCatalogTreeNode withBusinessCatalogNameEng(String businessCatalogNameEng) {
        this.businessCatalogNameEng = businessCatalogNameEng;
        return this;
    }

    /**
     * 业务资产英文名称
     * @return businessCatalogNameEng
     */
    public String getBusinessCatalogNameEng() {
        return businessCatalogNameEng;
    }

    public void setBusinessCatalogNameEng(String businessCatalogNameEng) {
        this.businessCatalogNameEng = businessCatalogNameEng;
    }

    public BusinessCatalogTreeNode withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 业务资产级别
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public BusinessCatalogTreeNode withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * 业务资产级唯一限定名称
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public BusinessCatalogTreeNode withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 序数
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public BusinessCatalogTreeNode withChildNodes(List<BusinessCatalogTreeNode> childNodes) {
        this.childNodes = childNodes;
        return this;
    }

    public BusinessCatalogTreeNode addChildNodesItem(BusinessCatalogTreeNode childNodesItem) {
        if (this.childNodes == null) {
            this.childNodes = new ArrayList<>();
        }
        this.childNodes.add(childNodesItem);
        return this;
    }

    public BusinessCatalogTreeNode withChildNodes(Consumer<List<BusinessCatalogTreeNode>> childNodesSetter) {
        if (this.childNodes == null) {
            this.childNodes = new ArrayList<>();
        }
        childNodesSetter.accept(this.childNodes);
        return this;
    }

    /**
     * 子级业务资产列表
     * @return childNodes
     */
    public List<BusinessCatalogTreeNode> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<BusinessCatalogTreeNode> childNodes) {
        this.childNodes = childNodes;
    }

    public BusinessCatalogTreeNode withLogicEntityNodes(List<LogicEntityNodes> logicEntityNodes) {
        this.logicEntityNodes = logicEntityNodes;
        return this;
    }

    public BusinessCatalogTreeNode addLogicEntityNodesItem(LogicEntityNodes logicEntityNodesItem) {
        if (this.logicEntityNodes == null) {
            this.logicEntityNodes = new ArrayList<>();
        }
        this.logicEntityNodes.add(logicEntityNodesItem);
        return this;
    }

    public BusinessCatalogTreeNode withLogicEntityNodes(Consumer<List<LogicEntityNodes>> logicEntityNodesSetter) {
        if (this.logicEntityNodes == null) {
            this.logicEntityNodes = new ArrayList<>();
        }
        logicEntityNodesSetter.accept(this.logicEntityNodes);
        return this;
    }

    /**
     * 逻辑实体列表
     * @return logicEntityNodes
     */
    public List<LogicEntityNodes> getLogicEntityNodes() {
        return logicEntityNodes;
    }

    public void setLogicEntityNodes(List<LogicEntityNodes> logicEntityNodes) {
        this.logicEntityNodes = logicEntityNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessCatalogTreeNode that = (BusinessCatalogTreeNode) obj;
        return Objects.equals(this.businessCatalogGuid, that.businessCatalogGuid)
            && Objects.equals(this.businessCatalogName, that.businessCatalogName)
            && Objects.equals(this.businessCatalogNameEng, that.businessCatalogNameEng)
            && Objects.equals(this.level, that.level) && Objects.equals(this.qualifiedName, that.qualifiedName)
            && Objects.equals(this.ordinal, that.ordinal) && Objects.equals(this.childNodes, that.childNodes)
            && Objects.equals(this.logicEntityNodes, that.logicEntityNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessCatalogGuid,
            businessCatalogName,
            businessCatalogNameEng,
            level,
            qualifiedName,
            ordinal,
            childNodes,
            logicEntityNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessCatalogTreeNode {\n");
        sb.append("    businessCatalogGuid: ").append(toIndentedString(businessCatalogGuid)).append("\n");
        sb.append("    businessCatalogName: ").append(toIndentedString(businessCatalogName)).append("\n");
        sb.append("    businessCatalogNameEng: ").append(toIndentedString(businessCatalogNameEng)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
        sb.append("    logicEntityNodes: ").append(toIndentedString(logicEntityNodes)).append("\n");
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
