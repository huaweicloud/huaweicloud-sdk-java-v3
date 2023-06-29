package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群扩展信息
 */
public class ExtendedProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workSpaceId")

    private String workSpaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trial")

    private String trial;

    public ExtendedProperties withWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
        return this;
    }

    /**
     * 工作空间ID。
     * @return workSpaceId
     */
    public String getWorkSpaceId() {
        return workSpaceId;
    }

    public void setWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
    }

    public ExtendedProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ExtendedProperties withTrial(String trial) {
        this.trial = trial;
        return this;
    }

    /**
     * 是否是试用集群。
     * @return trial
     */
    public String getTrial() {
        return trial;
    }

    public void setTrial(String trial) {
        this.trial = trial;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendedProperties that = (ExtendedProperties) obj;
        return Objects.equals(this.workSpaceId, that.workSpaceId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.trial, that.trial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workSpaceId, resourceId, trial);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendedProperties {\n");
        sb.append("    workSpaceId: ").append(toIndentedString(workSpaceId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    trial: ").append(toIndentedString(trial)).append("\n");
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
