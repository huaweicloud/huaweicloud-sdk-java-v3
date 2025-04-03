package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDataServiceInstanceAccesslogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_api")

    private Boolean isApi;

    public ListDataServiceInstanceAccesslogsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListDataServiceInstanceAccesslogsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 集群ID编号。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListDataServiceInstanceAccesslogsRequest withIsApi(Boolean isApi) {
        this.isApi = isApi;
        return this;
    }

    /**
     * 是否查询API的访问日志，true表示查询API的访问日志，false表示查询应用的访问日志。
     * @return isApi
     */
    public Boolean getIsApi() {
        return isApi;
    }

    public void setIsApi(Boolean isApi) {
        this.isApi = isApi;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataServiceInstanceAccesslogsRequest that = (ListDataServiceInstanceAccesslogsRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.isApi, that.isApi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, instanceId, isApi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataServiceInstanceAccesslogsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    isApi: ").append(toIndentedString(isApi)).append("\n");
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
