package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新的输入请求
 */
public class UpdateJobInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version_id")

    private String currentVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_endpoint_id")

    private String currentEndpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private JobVersionInput version;

    public UpdateJobInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Job名称,只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateJobInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateJobInput withCurrentVersionId(String currentVersionId) {
        this.currentVersionId = currentVersionId;
        return this;
    }

    /**
     * 作业版本Id
     * @return currentVersionId
     */
    public String getCurrentVersionId() {
        return currentVersionId;
    }

    public void setCurrentVersionId(String currentVersionId) {
        this.currentVersionId = currentVersionId;
    }

    public UpdateJobInput withCurrentEndpointId(String currentEndpointId) {
        this.currentEndpointId = currentEndpointId;
        return this;
    }

    /**
     * Endpoint Id，32~36位的英文、数字、短横组合。
     * @return currentEndpointId
     */
    public String getCurrentEndpointId() {
        return currentEndpointId;
    }

    public void setCurrentEndpointId(String currentEndpointId) {
        this.currentEndpointId = currentEndpointId;
    }

    public UpdateJobInput withVersion(JobVersionInput version) {
        this.version = version;
        return this;
    }

    public UpdateJobInput withVersion(Consumer<JobVersionInput> versionSetter) {
        if (this.version == null) {
            this.version = new JobVersionInput();
            versionSetter.accept(this.version);
        }

        return this;
    }

    /**
     * Get version
     * @return version
     */
    public JobVersionInput getVersion() {
        return version;
    }

    public void setVersion(JobVersionInput version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateJobInput that = (UpdateJobInput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.currentVersionId, that.currentVersionId)
            && Objects.equals(this.currentEndpointId, that.currentEndpointId)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, currentVersionId, currentEndpointId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateJobInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    currentVersionId: ").append(toIndentedString(currentVersionId)).append("\n");
        sb.append("    currentEndpointId: ").append(toIndentedString(currentEndpointId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
