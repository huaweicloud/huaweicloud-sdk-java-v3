package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListNodePoolsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="showDefaultNodePool")
    
    private String showDefaultNodePool;

    public ListNodePoolsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群 ID，获取方式请参见[[如何获取接口URI中参数](https://support.huaweicloud.com/api-cce/cce_02_0271.html)](tag:hws)[[如何获取接口URI中参数](https://support.huaweicloud.com/intl/zh-cn/api-cce/cce_02_0271.html)](tag:hws_hk)
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public ListNodePoolsRequest withShowDefaultNodePool(String showDefaultNodePool) {
        this.showDefaultNodePool = showDefaultNodePool;
        return this;
    }

    


    /**
     * 是否展示默认节点池。默认不展示，指定为“true”时展示默认节点池。
     * @return showDefaultNodePool
     */
    public String getShowDefaultNodePool() {
        return showDefaultNodePool;
    }

    public void setShowDefaultNodePool(String showDefaultNodePool) {
        this.showDefaultNodePool = showDefaultNodePool;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNodePoolsRequest listNodePoolsRequest = (ListNodePoolsRequest) o;
        return Objects.equals(this.clusterId, listNodePoolsRequest.clusterId) &&
            Objects.equals(this.showDefaultNodePool, listNodePoolsRequest.showDefaultNodePool);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, showDefaultNodePool);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodePoolsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    showDefaultNodePool: ").append(toIndentedString(showDefaultNodePool)).append("\n");
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

