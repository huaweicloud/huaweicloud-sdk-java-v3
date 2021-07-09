package com.huaweicloud.sdk.ddm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateInstanceParamResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodeList")
    
    private String nodeList;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="needRestart")
    
    private Boolean needRestart;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobId")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configId")
    
    private String configId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configName")
    
    private String configName;

    public UpdateInstanceParamResponse withNodeList(String nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    


    /**
     * 节点列表。
     * @return nodeList
     */
    public String getNodeList() {
        return nodeList;
    }

    public void setNodeList(String nodeList) {
        this.nodeList = nodeList;
    }

    

    public UpdateInstanceParamResponse withNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }

    


    /**
     * 是否需要重启实例。
     * @return needRestart
     */
    public Boolean getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
    }

    

    public UpdateInstanceParamResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public UpdateInstanceParamResponse withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    


    /**
     * 参数组id。
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    

    public UpdateInstanceParamResponse withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    


    /**
     * 参数组名称。
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceParamResponse updateInstanceParamResponse = (UpdateInstanceParamResponse) o;
        return Objects.equals(this.nodeList, updateInstanceParamResponse.nodeList) &&
            Objects.equals(this.needRestart, updateInstanceParamResponse.needRestart) &&
            Objects.equals(this.jobId, updateInstanceParamResponse.jobId) &&
            Objects.equals(this.configId, updateInstanceParamResponse.configId) &&
            Objects.equals(this.configName, updateInstanceParamResponse.configName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeList, needRestart, jobId, configId, configName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceParamResponse {\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
        sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
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

