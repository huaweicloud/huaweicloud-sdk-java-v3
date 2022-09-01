package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.PageInfoDTO;
import com.huaweicloud.sdk.iotedge.v2.model.QueryAuthorizedNodeDTO;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListNaAuthorizedNodesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    @JacksonXmlProperty(localName = "count")
    
    private Long count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    @JacksonXmlProperty(localName = "page_info")
    
    private PageInfoDTO pageInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    @JacksonXmlProperty(localName = "nodes")
    
    private List<QueryAuthorizedNodeDTO> nodes = null;
    
    public ListNaAuthorizedNodesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总记录数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    

    public ListNaAuthorizedNodesResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListNaAuthorizedNodesResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
        if(this.pageInfo == null ){
            this.pageInfo = new PageInfoDTO();
            pageInfoSetter.accept(this.pageInfo);
        }
        
        return this;
    }


    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDTO getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    

    public ListNaAuthorizedNodesResponse withNodes(List<QueryAuthorizedNodeDTO> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public ListNaAuthorizedNodesResponse addNodesItem(QueryAuthorizedNodeDTO nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListNaAuthorizedNodesResponse withNodes(Consumer<List<QueryAuthorizedNodeDTO>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 查询授权北向NA信息到边缘节点列表的返回结构体
     * @return nodes
     */
    public List<QueryAuthorizedNodeDTO> getNodes() {
        return nodes;
    }

    public void setNodes(List<QueryAuthorizedNodeDTO> nodes) {
        this.nodes = nodes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNaAuthorizedNodesResponse listNaAuthorizedNodesResponse = (ListNaAuthorizedNodesResponse) o;
        return Objects.equals(this.count, listNaAuthorizedNodesResponse.count) &&
            Objects.equals(this.pageInfo, listNaAuthorizedNodesResponse.pageInfo) &&
            Objects.equals(this.nodes, listNaAuthorizedNodesResponse.nodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, nodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNaAuthorizedNodesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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

