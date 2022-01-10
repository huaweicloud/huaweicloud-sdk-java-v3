package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class JobSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterUID")

    private String clusterUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceID")

    private String resourceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceName")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private Map<String, String> extendParam = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subJobs")

    private List<Job> subJobs = null;

    public JobSpec withType(String type) {
        this.type = type;
        return this;
    }

    /** 任务的类型，例：“CreateCluster”- 创建集群。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JobSpec withClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }

    /** 任务所在的集群的ID。
     * 
     * @return clusterUID */
    public String getClusterUID() {
        return clusterUID;
    }

    public void setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
    }

    public JobSpec withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /** 任务操作的资源ID。
     * 
     * @return resourceID */
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

    /** 任务操作的资源名称。
     * 
     * @return resourceName */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public JobSpec withExtendParam(Map<String, String> extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public JobSpec putExtendParamItem(String key, String extendParamItem) {
        if (this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        this.extendParam.put(key, extendParamItem);
        return this;
    }

    public JobSpec withExtendParam(Consumer<Map<String, String>> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        extendParamSetter.accept(this.extendParam);
        return this;
    }

    /** 扩展参数。
     * 
     * @return extendParam */
    public Map<String, String> getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(Map<String, String> extendParam) {
        this.extendParam = extendParam;
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

    /** 子任务的列表。 - 包含了所有子任务的详细信息 - 在创建集群、节点等场景下，通常会由多个子任务共同组成创建任务，在子任务都完成后，任务才会完成
     * 
     * @return subJobs */
    public List<Job> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<Job> subJobs) {
        this.subJobs = subJobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobSpec jobSpec = (JobSpec) o;
        return Objects.equals(this.type, jobSpec.type) && Objects.equals(this.clusterUID, jobSpec.clusterUID)
            && Objects.equals(this.resourceID, jobSpec.resourceID)
            && Objects.equals(this.resourceName, jobSpec.resourceName)
            && Objects.equals(this.extendParam, jobSpec.extendParam) && Objects.equals(this.subJobs, jobSpec.subJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, clusterUID, resourceID, resourceName, extendParam, subJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clusterUID: ").append(toIndentedString(clusterUID)).append("\n");
        sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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
