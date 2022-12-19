package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据源信息
 */
public class IncidentDatasource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private Integer sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public IncidentDatasource withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * current page count
     * minimum: 0
     * maximum: 9999
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public IncidentDatasource withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Id value
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public IncidentDatasource withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Id value
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public IncidentDatasource withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Id value
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentDatasource incidentDatasource = (IncidentDatasource) o;
        return Objects.equals(this.sourceType, incidentDatasource.sourceType)
            && Objects.equals(this.domainId, incidentDatasource.domainId)
            && Objects.equals(this.projectId, incidentDatasource.projectId)
            && Objects.equals(this.regionId, incidentDatasource.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceType, domainId, projectId, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentDatasource {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
