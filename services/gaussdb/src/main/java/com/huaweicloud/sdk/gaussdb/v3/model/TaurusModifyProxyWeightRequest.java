package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusModifyProxyWeightReadonlyNode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * proxy实例修改权重请求体
 */
public class TaurusModifyProxyWeightRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="master_weight")
    
    
    private Integer masterWeight;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readonly_nodes")
    
    
    private List<TaurusModifyProxyWeightReadonlyNode> readonlyNodes = null;
    
    public TaurusModifyProxyWeightRequest withMasterWeight(Integer masterWeight) {
        this.masterWeight = masterWeight;
        return this;
    }

    


    /**
     * 主节点权重
     * @return masterWeight
     */
    public Integer getMasterWeight() {
        return masterWeight;
    }

    public void setMasterWeight(Integer masterWeight) {
        this.masterWeight = masterWeight;
    }

    

    public TaurusModifyProxyWeightRequest withReadonlyNodes(List<TaurusModifyProxyWeightReadonlyNode> readonlyNodes) {
        this.readonlyNodes = readonlyNodes;
        return this;
    }

    
    public TaurusModifyProxyWeightRequest addReadonlyNodesItem(TaurusModifyProxyWeightReadonlyNode readonlyNodesItem) {
        if(this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        this.readonlyNodes.add(readonlyNodesItem);
        return this;
    }

    public TaurusModifyProxyWeightRequest withReadonlyNodes(Consumer<List<TaurusModifyProxyWeightReadonlyNode>> readonlyNodesSetter) {
        if(this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        readonlyNodesSetter.accept(this.readonlyNodes);
        return this;
    }

    /**
     * 只读节点权重配置信息
     * @return readonlyNodes
     */
    public List<TaurusModifyProxyWeightReadonlyNode> getReadonlyNodes() {
        return readonlyNodes;
    }

    public void setReadonlyNodes(List<TaurusModifyProxyWeightReadonlyNode> readonlyNodes) {
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
        TaurusModifyProxyWeightRequest taurusModifyProxyWeightRequest = (TaurusModifyProxyWeightRequest) o;
        return Objects.equals(this.masterWeight, taurusModifyProxyWeightRequest.masterWeight) &&
            Objects.equals(this.readonlyNodes, taurusModifyProxyWeightRequest.readonlyNodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(masterWeight, readonlyNodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaurusModifyProxyWeightRequest {\n");
        sb.append("    masterWeight: ").append(toIndentedString(masterWeight)).append("\n");
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

