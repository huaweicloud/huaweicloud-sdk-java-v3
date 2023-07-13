package com.huaweicloud.sdk.mas.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NamespaceVo
 */
public class NamespaceVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private OffsetDateTime createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sync_statistics")

    private DataSyncStatistics dataSyncStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_statistics")

    private DatasourceStatistics datasourceStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_used")

    private Boolean isUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_active_zone")

    private List<MultiActiveZoneVo> multiActiveZone = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_date")

    private OffsetDateTime updatedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public NamespaceVo withCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get createdDate
     * @return createdDate
     */
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public NamespaceVo withDataSyncStatistics(DataSyncStatistics dataSyncStatistics) {
        this.dataSyncStatistics = dataSyncStatistics;
        return this;
    }

    public NamespaceVo withDataSyncStatistics(Consumer<DataSyncStatistics> dataSyncStatisticsSetter) {
        if (this.dataSyncStatistics == null) {
            this.dataSyncStatistics = new DataSyncStatistics();
            dataSyncStatisticsSetter.accept(this.dataSyncStatistics);
        }

        return this;
    }

    /**
     * Get dataSyncStatistics
     * @return dataSyncStatistics
     */
    public DataSyncStatistics getDataSyncStatistics() {
        return dataSyncStatistics;
    }

    public void setDataSyncStatistics(DataSyncStatistics dataSyncStatistics) {
        this.dataSyncStatistics = dataSyncStatistics;
    }

    public NamespaceVo withDatasourceStatistics(DatasourceStatistics datasourceStatistics) {
        this.datasourceStatistics = datasourceStatistics;
        return this;
    }

    public NamespaceVo withDatasourceStatistics(Consumer<DatasourceStatistics> datasourceStatisticsSetter) {
        if (this.datasourceStatistics == null) {
            this.datasourceStatistics = new DatasourceStatistics();
            datasourceStatisticsSetter.accept(this.datasourceStatistics);
        }

        return this;
    }

    /**
     * Get datasourceStatistics
     * @return datasourceStatistics
     */
    public DatasourceStatistics getDatasourceStatistics() {
        return datasourceStatistics;
    }

    public void setDatasourceStatistics(DatasourceStatistics datasourceStatistics) {
        this.datasourceStatistics = datasourceStatistics;
    }

    public NamespaceVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NamespaceVo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public NamespaceVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NamespaceVo withIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
        return this;
    }

    /**
     * Get isUsed
     * @return isUsed
     */
    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public NamespaceVo withMultiActiveZone(List<MultiActiveZoneVo> multiActiveZone) {
        this.multiActiveZone = multiActiveZone;
        return this;
    }

    public NamespaceVo addMultiActiveZoneItem(MultiActiveZoneVo multiActiveZoneItem) {
        if (this.multiActiveZone == null) {
            this.multiActiveZone = new ArrayList<>();
        }
        this.multiActiveZone.add(multiActiveZoneItem);
        return this;
    }

    public NamespaceVo withMultiActiveZone(Consumer<List<MultiActiveZoneVo>> multiActiveZoneSetter) {
        if (this.multiActiveZone == null) {
            this.multiActiveZone = new ArrayList<>();
        }
        multiActiveZoneSetter.accept(this.multiActiveZone);
        return this;
    }

    /**
     * Get multiActiveZone
     * @return multiActiveZone
     */
    public List<MultiActiveZoneVo> getMultiActiveZone() {
        return multiActiveZone;
    }

    public void setMultiActiveZone(List<MultiActiveZoneVo> multiActiveZone) {
        this.multiActiveZone = multiActiveZone;
    }

    public NamespaceVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamespaceVo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public NamespaceVo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get tenantId
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NamespaceVo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public NamespaceVo withUpdatedDate(OffsetDateTime updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    /**
     * Get updatedDate
     * @return updatedDate
     */
    public OffsetDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(OffsetDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public NamespaceVo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamespaceVo that = (NamespaceVo) obj;
        return Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.dataSyncStatistics, that.dataSyncStatistics)
            && Objects.equals(this.datasourceStatistics, that.datasourceStatistics)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isUsed, that.isUsed) && Objects.equals(this.multiActiveZone, that.multiActiveZone)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.updatedDate, that.updatedDate) && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdDate,
            dataSyncStatistics,
            datasourceStatistics,
            description,
            enterpriseProjectId,
            id,
            isUsed,
            multiActiveZone,
            name,
            projectId,
            tenantId,
            type,
            updatedDate,
            userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NamespaceVo {\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    dataSyncStatistics: ").append(toIndentedString(dataSyncStatistics)).append("\n");
        sb.append("    datasourceStatistics: ").append(toIndentedString(datasourceStatistics)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isUsed: ").append(toIndentedString(isUsed)).append("\n");
        sb.append("    multiActiveZone: ").append(toIndentedString(multiActiveZone)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
