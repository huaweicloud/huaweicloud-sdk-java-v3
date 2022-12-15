package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * proxy节点扩容信息
 */
public class EnlargeProxyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_num")
    
    
    private Integer nodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_id")
    
    
    private String proxyId;

    public EnlargeProxyRequest withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * proxy节点扩容操作需要扩容的节点数。  扩容的节点数的取值范围：1~30之间的整数。  限制条件：该实例的proxy节点的总数量小于等于32。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    

    public EnlargeProxyRequest withProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }

    


    /**
     * 数据库代理id。  如果实例只开启了一个代理，可不传该参数；如果实例开启了多个代理，则必须指定一个数据库代理，扩容新的代理节点。
     * @return proxyId
     */
    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnlargeProxyRequest enlargeProxyRequest = (EnlargeProxyRequest) o;
        return Objects.equals(this.nodeNum, enlargeProxyRequest.nodeNum) &&
            Objects.equals(this.proxyId, enlargeProxyRequest.proxyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeNum, proxyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnlargeProxyRequest {\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
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

