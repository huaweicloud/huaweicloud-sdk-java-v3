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
public class ListClustersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pageSize")
    
    
    private String pageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currentPage")
    
    
    private String currentPage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterName")
    
    
    private String clusterName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterState")
    
    
    private String clusterState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterpriseProjectId")
    
    
    private String enterpriseProjectId;

    public ListClustersRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 可以通过集群的标签来搜索指定标签的集群，当指定多个tag进行查询时，标签之间是与的关系。  - tags参数的格式为tags=k1*v1,k2*v2,k3*v3 - 当标签的value为空时，格式为tags=k1,k2,k3*v3
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    public ListClustersRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 分页查询每页返回的最大集群数量。  取值范围：[1～2147483646]
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    

    public ListClustersRequest withCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    


    /**
     * 当前查询页码。
     * @return currentPage
     */
    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    

    public ListClustersRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    


    /**
     * 集群名称。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    

    public ListClustersRequest withClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }

    


    /**
     * 根据集群状态查询集群列表。 - existing：查询现有集群列表，包括除“已删除”、包周期集群的“订单处理中”和“准备中”状态外的所有集群。 - history：查询历史集群列表，包括所有“已删除”、删除集群失败、集群删除虚拟机失败、删除集群更新数据库失败等状态的集群。 - starting：查询启动中的集群列表。 - running：查询运行中的集群列表。 - terminated：查询已删除的集群列表。 - failed：查询失败的集群列表。 - abnormal：查询异常的集群列表。 - terminating：查询删除中的集群列表。 - frozen：查询已冻结的集群列表。 - scaling-out：查询扩容中的集群列表。 - scaling-in：查询缩容中的集群列表。
     * @return clusterState
     */
    public String getClusterState() {
        return clusterState;
    }

    public void setClusterState(String clusterState) {
        this.clusterState = clusterState;
    }

    

    public ListClustersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 通过企业项目ID来搜索指定项目的集群。  该参数默认设置为0，表示为default企业项目。  获取方式请参见《企业管理API参考》的“查询企业项目列表”响应消息表“enterprise_project字段数据结构说明”的“id”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClustersRequest listClustersRequest = (ListClustersRequest) o;
        return Objects.equals(this.tags, listClustersRequest.tags) &&
            Objects.equals(this.pageSize, listClustersRequest.pageSize) &&
            Objects.equals(this.currentPage, listClustersRequest.currentPage) &&
            Objects.equals(this.clusterName, listClustersRequest.clusterName) &&
            Objects.equals(this.clusterState, listClustersRequest.clusterState) &&
            Objects.equals(this.enterpriseProjectId, listClustersRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, pageSize, currentPage, clusterName, clusterState, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClustersRequest {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterState: ").append(toIndentedString(clusterState)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

