package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 服务详情 */
public class ServiceRespDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private SvcMetadata metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SvcSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ServiceRespDetail withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ServiceRespDetail withId(String id) {
        this.id = id;
        return this;
    }

    /** 服务ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServiceRespDetail withMetaData(SvcMetadata metaData) {
        this.metaData = metaData;
        return this;
    }

    public ServiceRespDetail withMetaData(Consumer<SvcMetadata> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new SvcMetadata();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /** Get metaData
     * 
     * @return metaData */
    public SvcMetadata getMetaData() {
        return metaData;
    }

    public void setMetaData(SvcMetadata metaData) {
        this.metaData = metaData;
    }

    public ServiceRespDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 租户ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ServiceRespDetail withSpec(SvcSpec spec) {
        this.spec = spec;
        return this;
    }

    public ServiceRespDetail withSpec(Consumer<SvcSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new SvcSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /** Get spec
     * 
     * @return spec */
    public SvcSpec getSpec() {
        return spec;
    }

    public void setSpec(SvcSpec spec) {
        this.spec = spec;
    }

    public ServiceRespDetail withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 更新时间
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceRespDetail serviceRespDetail = (ServiceRespDetail) o;
        return Objects.equals(this.createdAt, serviceRespDetail.createdAt)
            && Objects.equals(this.id, serviceRespDetail.id)
            && Objects.equals(this.metaData, serviceRespDetail.metaData)
            && Objects.equals(this.projectId, serviceRespDetail.projectId)
            && Objects.equals(this.spec, serviceRespDetail.spec)
            && Objects.equals(this.updatedAt, serviceRespDetail.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, id, metaData, projectId, spec, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceRespDetail {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
