package com.huaweicloud.sdk.gaussdb.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.NodesWeight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_name")
    
    
    private String proxyName;
    /**
     * 代理实例类型。默认类型为readwrite。
     */
    public static final class ProxyModeEnum {

        
        /**
         * Enum READWRITE for value: "readwrite"
         */
        public static final ProxyModeEnum READWRITE = new ProxyModeEnum("readwrite");
        
        /**
         * Enum READONLY for value: "readonly"
         */
        public static final ProxyModeEnum READONLY = new ProxyModeEnum("readonly");
        

        private static final Map<String, ProxyModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProxyModeEnum> createStaticFields() {
            Map<String, ProxyModeEnum> map = new HashMap<>();
            map.put("readwrite", READWRITE);
            map.put("readonly", READONLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProxyModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProxyModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProxyModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProxyModeEnum(value);
            }
            return result;
        }

        public static ProxyModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProxyModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProxyModeEnum) {
                return this.value.equals(((ProxyModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_mode")
    
    
    private ProxyModeEnum proxyMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes_read_weight")
    
    
    private List<NodesWeight> nodesReadWeight = null;
    
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

    

    public OpenMysqlProxyRequestBody withProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }

    


    /**
     * 代理实例名称。用于表示实例的名称，同一租户下，同类型的实例名可重名。  取值范围：4~64个字符之间，必须以字母开头，区分大小写，可以包含字母、数字、中划线或者下划线，不能包含其他的特殊字符。
     * @return proxyName
     */
    public String getProxyName() {
        return proxyName;
    }

    public void setProxyName(String proxyName) {
        this.proxyName = proxyName;
    }

    

    public OpenMysqlProxyRequestBody withProxyMode(ProxyModeEnum proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }

    


    /**
     * 代理实例类型。默认类型为readwrite。
     * @return proxyMode
     */
    public ProxyModeEnum getProxyMode() {
        return proxyMode;
    }

    public void setProxyMode(ProxyModeEnum proxyMode) {
        this.proxyMode = proxyMode;
    }

    

    public OpenMysqlProxyRequestBody withNodesReadWeight(List<NodesWeight> nodesReadWeight) {
        this.nodesReadWeight = nodesReadWeight;
        return this;
    }

    
    public OpenMysqlProxyRequestBody addNodesReadWeightItem(NodesWeight nodesReadWeightItem) {
        if(this.nodesReadWeight == null) {
            this.nodesReadWeight = new ArrayList<>();
        }
        this.nodesReadWeight.add(nodesReadWeightItem);
        return this;
    }

    public OpenMysqlProxyRequestBody withNodesReadWeight(Consumer<List<NodesWeight>> nodesReadWeightSetter) {
        if(this.nodesReadWeight == null) {
            this.nodesReadWeight = new ArrayList<>();
        }
        nodesReadWeightSetter.accept(this.nodesReadWeight);
        return this;
    }

    /**
     * 数据库节点的读权重设置。
     * @return nodesReadWeight
     */
    public List<NodesWeight> getNodesReadWeight() {
        return nodesReadWeight;
    }

    public void setNodesReadWeight(List<NodesWeight> nodesReadWeight) {
        this.nodesReadWeight = nodesReadWeight;
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
            Objects.equals(this.nodeNum, openMysqlProxyRequestBody.nodeNum) &&
            Objects.equals(this.proxyName, openMysqlProxyRequestBody.proxyName) &&
            Objects.equals(this.proxyMode, openMysqlProxyRequestBody.proxyMode) &&
            Objects.equals(this.nodesReadWeight, openMysqlProxyRequestBody.nodesReadWeight);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, nodeNum, proxyName, proxyMode, nodesReadWeight);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenMysqlProxyRequestBody {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
        sb.append("    proxyMode: ").append(toIndentedString(proxyMode)).append("\n");
        sb.append("    nodesReadWeight: ").append(toIndentedString(nodesReadWeight)).append("\n");
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

