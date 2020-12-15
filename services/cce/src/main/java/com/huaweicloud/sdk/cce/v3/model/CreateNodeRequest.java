package com.huaweicloud.sdk.cce.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.V3NodeCreateRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateNodeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;
    /**
     * Gets or Sets nodepoolScaleUp
     */
    public static final class NodepoolScaleUpEnum {

        
        /**
         * Enum NODEPOOLSCALEUP for value: "NodepoolScaleUp"
         */
        public static final NodepoolScaleUpEnum NODEPOOLSCALEUP = new NodepoolScaleUpEnum("NodepoolScaleUp");
        

        private static final Map<String, NodepoolScaleUpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodepoolScaleUpEnum> createStaticFields() {
            Map<String, NodepoolScaleUpEnum> map = new HashMap<>();
            map.put("NodepoolScaleUp", NODEPOOLSCALEUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodepoolScaleUpEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NodepoolScaleUpEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NodepoolScaleUpEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NodepoolScaleUpEnum(value);
            }
            return result;
        }

        public static NodepoolScaleUpEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NodepoolScaleUpEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof NodepoolScaleUpEnum) {
                return this.value.equals(((NodepoolScaleUpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodepoolScaleUp")
    
    private NodepoolScaleUpEnum nodepoolScaleUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private V3NodeCreateRequest body = null;

    public CreateNodeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * Get clusterId
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateNodeRequest withNodepoolScaleUp(NodepoolScaleUpEnum nodepoolScaleUp) {
        this.nodepoolScaleUp = nodepoolScaleUp;
        return this;
    }

    


    /**
     * Get nodepoolScaleUp
     * @return nodepoolScaleUp
     */
    public NodepoolScaleUpEnum getNodepoolScaleUp() {
        return nodepoolScaleUp;
    }

    public void setNodepoolScaleUp(NodepoolScaleUpEnum nodepoolScaleUp) {
        this.nodepoolScaleUp = nodepoolScaleUp;
    }

    public CreateNodeRequest withBody(V3NodeCreateRequest body) {
        this.body = body;
        return this;
    }

    public CreateNodeRequest withBody(Consumer<V3NodeCreateRequest> bodySetter) {
        if(this.body == null ){
            this.body = new V3NodeCreateRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public V3NodeCreateRequest getBody() {
        return body;
    }

    public void setBody(V3NodeCreateRequest body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNodeRequest createNodeRequest = (CreateNodeRequest) o;
        return Objects.equals(this.clusterId, createNodeRequest.clusterId) &&
            Objects.equals(this.nodepoolScaleUp, createNodeRequest.nodepoolScaleUp) &&
            Objects.equals(this.body, createNodeRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodepoolScaleUp, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNodeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodepoolScaleUp: ").append(toIndentedString(nodepoolScaleUp)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

