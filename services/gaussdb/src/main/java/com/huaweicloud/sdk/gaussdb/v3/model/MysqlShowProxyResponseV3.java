package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxyNodeV3;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxyV3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlShowProxyResponseV3
 */
public class MysqlShowProxyResponseV3  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy")
    

    private MysqlProxyV3 proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="master_node")
    

    private MysqlProxyNodeV3 masterNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readonly_nodes")
    
    private List<MysqlProxyNodeV3> readonlyNodes = null;
    
    public MysqlShowProxyResponseV3 withProxy(MysqlProxyV3 proxy) {
        this.proxy = proxy;
        return this;
    }

    public MysqlShowProxyResponseV3 withProxy(Consumer<MysqlProxyV3> proxySetter) {
        if(this.proxy == null ){
            this.proxy = new MysqlProxyV3();
            proxySetter.accept(this.proxy);
        }
        
        return this;
    }


    /**
     * Get proxy
     * @return proxy
     */
    public MysqlProxyV3 getProxy() {
        return proxy;
    }

    public void setProxy(MysqlProxyV3 proxy) {
        this.proxy = proxy;
    }

    

    public MysqlShowProxyResponseV3 withMasterNode(MysqlProxyNodeV3 masterNode) {
        this.masterNode = masterNode;
        return this;
    }

    public MysqlShowProxyResponseV3 withMasterNode(Consumer<MysqlProxyNodeV3> masterNodeSetter) {
        if(this.masterNode == null ){
            this.masterNode = new MysqlProxyNodeV3();
            masterNodeSetter.accept(this.masterNode);
        }
        
        return this;
    }


    /**
     * Get masterNode
     * @return masterNode
     */
    public MysqlProxyNodeV3 getMasterNode() {
        return masterNode;
    }

    public void setMasterNode(MysqlProxyNodeV3 masterNode) {
        this.masterNode = masterNode;
    }

    

    public MysqlShowProxyResponseV3 withReadonlyNodes(List<MysqlProxyNodeV3> readonlyNodes) {
        this.readonlyNodes = readonlyNodes;
        return this;
    }

    
    public MysqlShowProxyResponseV3 addReadonlyNodesItem(MysqlProxyNodeV3 readonlyNodesItem) {
        if(this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        this.readonlyNodes.add(readonlyNodesItem);
        return this;
    }

    public MysqlShowProxyResponseV3 withReadonlyNodes(Consumer<List<MysqlProxyNodeV3>> readonlyNodesSetter) {
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
    public List<MysqlProxyNodeV3> getReadonlyNodes() {
        return readonlyNodes;
    }

    public void setReadonlyNodes(List<MysqlProxyNodeV3> readonlyNodes) {
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
        MysqlShowProxyResponseV3 mysqlShowProxyResponseV3 = (MysqlShowProxyResponseV3) o;
        return Objects.equals(this.proxy, mysqlShowProxyResponseV3.proxy) &&
            Objects.equals(this.masterNode, mysqlShowProxyResponseV3.masterNode) &&
            Objects.equals(this.readonlyNodes, mysqlShowProxyResponseV3.readonlyNodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(proxy, masterNode, readonlyNodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlShowProxyResponseV3 {\n");
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

