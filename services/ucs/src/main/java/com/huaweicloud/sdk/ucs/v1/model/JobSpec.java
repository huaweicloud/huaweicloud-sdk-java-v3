package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobSpec
 */
public class JobSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "federationUID")

    private String federationUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceID")

    private String resourceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceName")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private String extendparam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subJobs")

    private List<Job> subJobs = null;

    public JobSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Job类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JobSpec withFederationUID(String federationUID) {
        this.federationUID = federationUID;
        return this;
    }

    /**
     * 联邦uid
     * @return federationUID
     */
    public String getFederationUID() {
        return federationUID;
    }

    public void setFederationUID(String federationUID) {
        this.federationUID = federationUID;
    }

    public JobSpec withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * 资源id
     * @return resourceID
     */
    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public JobSpec withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名字
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public JobSpec withExtendparam(String extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    /**
     * 扩展参数
     * @return extendparam
     */
    public String getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(String extendparam) {
        this.extendparam = extendparam;
    }

    public JobSpec withSubJobs(List<Job> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    public JobSpec addSubJobsItem(Job subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public JobSpec withSubJobs(Consumer<List<Job>> subJobsSetter) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 子Job
     * @return subJobs
     */
    public List<Job> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<Job> subJobs) {
        this.subJobs = subJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobSpec that = (JobSpec) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.federationUID, that.federationUID)
            && Objects.equals(this.resourceID, that.resourceID) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.extendparam, that.extendparam) && Objects.equals(this.subJobs, that.subJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, federationUID, resourceID, resourceName, extendparam, subJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    federationUID: ").append(toIndentedString(federationUID)).append("\n");
        sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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
