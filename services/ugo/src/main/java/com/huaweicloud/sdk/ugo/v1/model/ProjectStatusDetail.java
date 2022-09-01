package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 评估任务状态详情。
 */
public class ProjectStatusDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_collection_status")

    @JacksonXmlProperty(localName = "object_collection_status")

    private String objectCollectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_collection_progress")

    @JacksonXmlProperty(localName = "object_collection_progress")

    private String objectCollectionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_migration_status")

    @JacksonXmlProperty(localName = "pre_migration_status")

    private String preMigrationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_migration_progress")

    @JacksonXmlProperty(localName = "pre_migration_progress")

    private String preMigrationProgress;

    public ProjectStatusDetail withObjectCollectionStatus(String objectCollectionStatus) {
        this.objectCollectionStatus = objectCollectionStatus;
        return this;
    }

    /**
     * 采集的状态。
     * @return objectCollectionStatus
     */
    public String getObjectCollectionStatus() {
        return objectCollectionStatus;
    }

    public void setObjectCollectionStatus(String objectCollectionStatus) {
        this.objectCollectionStatus = objectCollectionStatus;
    }

    public ProjectStatusDetail withObjectCollectionProgress(String objectCollectionProgress) {
        this.objectCollectionProgress = objectCollectionProgress;
        return this;
    }

    /**
     * 采集的进度。
     * @return objectCollectionProgress
     */
    public String getObjectCollectionProgress() {
        return objectCollectionProgress;
    }

    public void setObjectCollectionProgress(String objectCollectionProgress) {
        this.objectCollectionProgress = objectCollectionProgress;
    }

    public ProjectStatusDetail withPreMigrationStatus(String preMigrationStatus) {
        this.preMigrationStatus = preMigrationStatus;
        return this;
    }

    /**
     * 评估的状态。
     * @return preMigrationStatus
     */
    public String getPreMigrationStatus() {
        return preMigrationStatus;
    }

    public void setPreMigrationStatus(String preMigrationStatus) {
        this.preMigrationStatus = preMigrationStatus;
    }

    public ProjectStatusDetail withPreMigrationProgress(String preMigrationProgress) {
        this.preMigrationProgress = preMigrationProgress;
        return this;
    }

    /**
     * 评估的进度。
     * @return preMigrationProgress
     */
    public String getPreMigrationProgress() {
        return preMigrationProgress;
    }

    public void setPreMigrationProgress(String preMigrationProgress) {
        this.preMigrationProgress = preMigrationProgress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectStatusDetail projectStatusDetail = (ProjectStatusDetail) o;
        return Objects.equals(this.objectCollectionStatus, projectStatusDetail.objectCollectionStatus)
            && Objects.equals(this.objectCollectionProgress, projectStatusDetail.objectCollectionProgress)
            && Objects.equals(this.preMigrationStatus, projectStatusDetail.preMigrationStatus)
            && Objects.equals(this.preMigrationProgress, projectStatusDetail.preMigrationProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectCollectionStatus, objectCollectionProgress, preMigrationStatus, preMigrationProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectStatusDetail {\n");
        sb.append("    objectCollectionStatus: ").append(toIndentedString(objectCollectionStatus)).append("\n");
        sb.append("    objectCollectionProgress: ").append(toIndentedString(objectCollectionProgress)).append("\n");
        sb.append("    preMigrationStatus: ").append(toIndentedString(preMigrationStatus)).append("\n");
        sb.append("    preMigrationProgress: ").append(toIndentedString(preMigrationProgress)).append("\n");
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
