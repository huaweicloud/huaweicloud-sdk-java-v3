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

    public EnlargeProxyRequest withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * proxy节点扩容操作需要扩容的节点数。本次扩容的节点数的取值范围：1~30之间的整数。 限制条件：该实例的proxy节点的总数量小于等于32。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
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
        return Objects.equals(this.nodeNum, enlargeProxyRequest.nodeNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnlargeProxyRequest {\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
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

