package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OpenMysqlProxyRequestBody
 */
public class OpenMysqlProxyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_num")
    
    
    private Integer nodeNum;

    public OpenMysqlProxyRequestBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 代理规格码。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    

    public OpenMysqlProxyRequestBody withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * 代理实例节点数，取值整数2-32。
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
        OpenMysqlProxyRequestBody openMysqlProxyRequestBody = (OpenMysqlProxyRequestBody) o;
        return Objects.equals(this.flavorRef, openMysqlProxyRequestBody.flavorRef) &&
            Objects.equals(this.nodeNum, openMysqlProxyRequestBody.nodeNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, nodeNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenMysqlProxyRequestBody {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
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

