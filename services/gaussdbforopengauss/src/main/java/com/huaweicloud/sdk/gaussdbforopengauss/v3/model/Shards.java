package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Shards
 */
public class Shards  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_id")
    
    
    private String componentId;

    public Shards withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 节点Id。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public Shards withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    


    /**
     * 组件Id。最大长度7个字符，不能为null或者空字符串，不能为空格，校验和使用之前会自动过滤掉前后空格。至少包含大写字母（A-Z），小写字母（a-z），数字（0-9），非字母数字字符（限定为_）四类字符中的三类字符。组件id通过查询实例的组件列表接口（ListComponentInfos）获取
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shards shards = (Shards) o;
        return Objects.equals(this.nodeId, shards.nodeId) &&
            Objects.equals(this.componentId, shards.componentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, componentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shards {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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

