package com.huaweicloud.sdk.mrs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListHostsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pageSize")
    
    
    private String pageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currentPage")
    
    
    private String currentPage;

    public ListHostsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID。获取方法，请参见[获取集群ID](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public ListHostsRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 分页查询每页返回的最大集群数量。 取值范围：[1～2147483646] 默认值为10。
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    

    public ListHostsRequest withCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    


    /**
     * 当前查询页码。默认值为1。
     * @return currentPage
     */
    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHostsRequest listHostsRequest = (ListHostsRequest) o;
        return Objects.equals(this.clusterId, listHostsRequest.clusterId) &&
            Objects.equals(this.pageSize, listHostsRequest.pageSize) &&
            Objects.equals(this.currentPage, listHostsRequest.currentPage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, pageSize, currentPage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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

