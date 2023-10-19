package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EventParam
 */
public class EventParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_name")

    private String propertyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_value")

    private String propertyValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private DataMapFilterCriteria filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid_list")

    private List<String> guidList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_trace_id")

    private String sourceTraceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_type_name")

    private String metadataTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "super_type_names")

    private String superTypeNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_ids")

    private List<String> workspaceIds = null;

    public EventParam withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public EventParam withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 资产类型
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public EventParam withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get modelId
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public EventParam withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * Get propertyName
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public EventParam withPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }

    /**
     * Get propertyValue
     * @return propertyValue
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public EventParam withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 搜索框输入
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public EventParam withFilter(DataMapFilterCriteria filter) {
        this.filter = filter;
        return this;
    }

    public EventParam withFilter(Consumer<DataMapFilterCriteria> filterSetter) {
        if (this.filter == null) {
            this.filter = new DataMapFilterCriteria();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public DataMapFilterCriteria getFilter() {
        return filter;
    }

    public void setFilter(DataMapFilterCriteria filter) {
        this.filter = filter;
    }

    public EventParam withGuidList(List<String> guidList) {
        this.guidList = guidList;
        return this;
    }

    public EventParam addGuidListItem(String guidListItem) {
        if (this.guidList == null) {
            this.guidList = new ArrayList<>();
        }
        this.guidList.add(guidListItem);
        return this;
    }

    public EventParam withGuidList(Consumer<List<String>> guidListSetter) {
        if (this.guidList == null) {
            this.guidList = new ArrayList<>();
        }
        guidListSetter.accept(this.guidList);
        return this;
    }

    /**
     * Get guidList
     * @return guidList
     */
    public List<String> getGuidList() {
        return guidList;
    }

    public void setGuidList(List<String> guidList) {
        this.guidList = guidList;
    }

    public EventParam withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * Get traceId
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public EventParam withSourceTraceId(String sourceTraceId) {
        this.sourceTraceId = sourceTraceId;
        return this;
    }

    /**
     * Get sourceTraceId
     * @return sourceTraceId
     */
    public String getSourceTraceId() {
        return sourceTraceId;
    }

    public void setSourceTraceId(String sourceTraceId) {
        this.sourceTraceId = sourceTraceId;
    }

    public EventParam withMetadataTypeName(String metadataTypeName) {
        this.metadataTypeName = metadataTypeName;
        return this;
    }

    /**
     * Get metadataTypeName
     * @return metadataTypeName
     */
    public String getMetadataTypeName() {
        return metadataTypeName;
    }

    public void setMetadataTypeName(String metadataTypeName) {
        this.metadataTypeName = metadataTypeName;
    }

    public EventParam withSuperTypeNames(String superTypeNames) {
        this.superTypeNames = superTypeNames;
        return this;
    }

    /**
     * Get superTypeNames
     * @return superTypeNames
     */
    public String getSuperTypeNames() {
        return superTypeNames;
    }

    public void setSuperTypeNames(String superTypeNames) {
        this.superTypeNames = superTypeNames;
    }

    public EventParam withWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }

    public EventParam addWorkspaceIdsItem(String workspaceIdsItem) {
        if (this.workspaceIds == null) {
            this.workspaceIds = new ArrayList<>();
        }
        this.workspaceIds.add(workspaceIdsItem);
        return this;
    }

    public EventParam withWorkspaceIds(Consumer<List<String>> workspaceIdsSetter) {
        if (this.workspaceIds == null) {
            this.workspaceIds = new ArrayList<>();
        }
        workspaceIdsSetter.accept(this.workspaceIds);
        return this;
    }

    /**
     * Get workspaceIds
     * @return workspaceIds
     */
    public List<String> getWorkspaceIds() {
        return workspaceIds;
    }

    public void setWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventParam that = (EventParam) obj;
        return Objects.equals(this.guid, that.guid) && Objects.equals(this.typeName, that.typeName)
            && Objects.equals(this.modelId, that.modelId) && Objects.equals(this.propertyName, that.propertyName)
            && Objects.equals(this.propertyValue, that.propertyValue) && Objects.equals(this.query, that.query)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.guidList, that.guidList)
            && Objects.equals(this.traceId, that.traceId) && Objects.equals(this.sourceTraceId, that.sourceTraceId)
            && Objects.equals(this.metadataTypeName, that.metadataTypeName)
            && Objects.equals(this.superTypeNames, that.superTypeNames)
            && Objects.equals(this.workspaceIds, that.workspaceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid,
            typeName,
            modelId,
            propertyName,
            propertyValue,
            query,
            filter,
            guidList,
            traceId,
            sourceTraceId,
            metadataTypeName,
            superTypeNames,
            workspaceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventParam {\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    guidList: ").append(toIndentedString(guidList)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    sourceTraceId: ").append(toIndentedString(sourceTraceId)).append("\n");
        sb.append("    metadataTypeName: ").append(toIndentedString(metadataTypeName)).append("\n");
        sb.append("    superTypeNames: ").append(toIndentedString(superTypeNames)).append("\n");
        sb.append("    workspaceIds: ").append(toIndentedString(workspaceIds)).append("\n");
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
