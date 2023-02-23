package com.huaweicloud.sdk.mrs.v1.model;





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
public class CreateClusterResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    

    private Boolean result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="msg")
    

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    

    private String clusterId;

    public CreateClusterResponse withResult(Boolean result) {
        this.result = result;
        return this;
    }

    


    /**
     * 操作结果。 - true：操作成功 - false：操作失败
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    

    public CreateClusterResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    


    /**
     * 系统提示信息，可为空。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    

    public CreateClusterResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群创建成功后系统返回的集群ID值。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterResponse createClusterResponse = (CreateClusterResponse) o;
        return Objects.equals(this.result, createClusterResponse.result) &&
            Objects.equals(this.msg, createClusterResponse.msg) &&
            Objects.equals(this.clusterId, createClusterResponse.clusterId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result, msg, clusterId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

