package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.CCEJob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CCEJobSpec
 */
public class CCEJobSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterUID")
    
    private String clusterUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendParam")
    
    private Map<String, String> extendParam = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceID")
    
    private String resourceID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceName")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subJobs")
    
    private List<CCEJob> subJobs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public CCEJobSpec withClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }

    


    /**
     * 作业所在的集群的ID。
     * @return clusterUID
     */
    public String getClusterUID() {
        return clusterUID;
    }

    public void setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
    }

    

    public CCEJobSpec withExtendParam(Map<String, String> extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    

    public CCEJobSpec putExtendParamItem(String key, String extendParamItem) {
        if(this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        this.extendParam.put(key, extendParamItem);
        return this;
    }

    public CCEJobSpec withExtendParam(Consumer<Map<String, String>> extendParamSetter) {
        if(this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        extendParamSetter.accept(this.extendParam);
        return this;
    }
    /**
     * 扩展参数。
     * @return extendParam
     */
    public Map<String, String> getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(Map<String, String> extendParam) {
        this.extendParam = extendParam;
    }

    

    public CCEJobSpec withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    


    /**
     * 作业操作的资源ID。
     * @return resourceID
     */
    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    

    public CCEJobSpec withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 作业操作的资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    

    public CCEJobSpec withSubJobs(List<CCEJob> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    
    public CCEJobSpec addSubJobsItem(CCEJob subJobsItem) {
        if(this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public CCEJobSpec withSubJobs(Consumer<List<CCEJob>> subJobsSetter) {
        if(this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 子作业的列表。  - 包含了所有子作业的详细信息 - 在创建集群、节点等场景下，通常会由多个子作业共同组成创建作业，在子作业都完成后，作业才会完成 
     * @return subJobs
     */
    public List<CCEJob> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<CCEJob> subJobs) {
        this.subJobs = subJobs;
    }

    

    public CCEJobSpec withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 作业的类型，例：“CreateCluster”- 创建集群。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CCEJobSpec ccEJobSpec = (CCEJobSpec) o;
        return Objects.equals(this.clusterUID, ccEJobSpec.clusterUID) &&
            Objects.equals(this.extendParam, ccEJobSpec.extendParam) &&
            Objects.equals(this.resourceID, ccEJobSpec.resourceID) &&
            Objects.equals(this.resourceName, ccEJobSpec.resourceName) &&
            Objects.equals(this.subJobs, ccEJobSpec.subJobs) &&
            Objects.equals(this.type, ccEJobSpec.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterUID, extendParam, resourceID, resourceName, subJobs, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CCEJobSpec {\n");
        sb.append("    clusterUID: ").append(toIndentedString(clusterUID)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

