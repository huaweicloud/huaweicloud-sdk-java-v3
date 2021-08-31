package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxy;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxyNode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMysqlProxyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy")
    
    
    private MysqlProxy proxy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="master_node")
    
    
    private MysqlProxyNode masterNode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readonly_nodes")
    
    
    private List<MysqlProxyNode> readonlyNodes = null;
    
    public ShowMysqlProxyResponse withProxy(MysqlProxy proxy) {
        this.proxy = proxy;
        return this;
    }

    public ShowMysqlProxyResponse withProxy(Consumer<MysqlProxy> proxySetter) {
        if(this.proxy == null ){
            this.proxy = new MysqlProxy();
            proxySetter.accept(this.proxy);
        }
        
        return this;
    }


    /**
     * Get proxy
     * @return proxy
     */
    public MysqlProxy getProxy() {
        return proxy;
    }

    public void setProxy(MysqlProxy proxy) {
        this.proxy = proxy;
    }

    

    public ShowMysqlProxyResponse withMasterNode(MysqlProxyNode masterNode) {
        this.masterNode = masterNode;
        return this;
    }

    public ShowMysqlProxyResponse withMasterNode(Consumer<MysqlProxyNode> masterNodeSetter) {
        if(this.masterNode == null ){
            this.masterNode = new MysqlProxyNode();
            masterNodeSetter.accept(this.masterNode);
        }
        
        return this;
    }


    /**
     * Get masterNode
     * @return masterNode
     */
    public MysqlProxyNode getMasterNode() {
        return masterNode;
    }

    public void setMasterNode(MysqlProxyNode masterNode) {
        this.masterNode = masterNode;
    }

    

    public ShowMysqlProxyResponse withReadonlyNodes(List<MysqlProxyNode> readonlyNodes) {
        this.readonlyNodes = readonlyNodes;
        return this;
    }

    
    public ShowMysqlProxyResponse addReadonlyNodesItem(MysqlProxyNode readonlyNodesItem) {
        if(this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        this.readonlyNodes.add(readonlyNodesItem);
        return this;
    }

    public ShowMysqlProxyResponse withReadonlyNodes(Consumer<List<MysqlProxyNode>> readonlyNodesSetter) {
        if(this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        readonlyNodesSetter.accept(this.readonlyNodes);
        return this;
    }

    /**
     * 只读节点信息。
     * @return readonlyNodes
     */
    public List<MysqlProxyNode> getReadonlyNodes() {
        return readonlyNodes;
    }

    public void setReadonlyNodes(List<MysqlProxyNode> readonlyNodes) {
        this.readonlyNodes = readonlyNodes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMysqlProxyResponse showMysqlProxyResponse = (ShowMysqlProxyResponse) o;
        return Objects.equals(this.proxy, showMysqlProxyResponse.proxy) &&
            Objects.equals(this.masterNode, showMysqlProxyResponse.masterNode) &&
            Objects.equals(this.readonlyNodes, showMysqlProxyResponse.readonlyNodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(proxy, masterNode, readonlyNodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMysqlProxyResponse {\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    masterNode: ").append(toIndentedString(masterNode)).append("\n");
        sb.append("    readonlyNodes: ").append(toIndentedString(readonlyNodes)).append("\n");
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

