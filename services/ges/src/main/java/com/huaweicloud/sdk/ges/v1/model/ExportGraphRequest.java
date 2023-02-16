package com.huaweicloud.sdk.ges.v1.model;





import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.ExportGraphReq;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExportGraphRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_id")
    
    
    private String graphId;
    /**
     * 图actionId
     */
    public static final class ActionIdEnum {

        
        /**
         * Enum EXPORT_GRAPH for value: "export-graph"
         */
        public static final ActionIdEnum EXPORT_GRAPH = new ActionIdEnum("export-graph");
        

        private static final Map<String, ActionIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionIdEnum> createStaticFields() {
            Map<String, ActionIdEnum> map = new HashMap<>();
            map.put("export-graph", EXPORT_GRAPH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionIdEnum(String value) {
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
        public static ActionIdEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionIdEnum(value);
            }
            return result;
        }

        public static ActionIdEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionIdEnum) {
                return this.value.equals(((ActionIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_id")
    
    
    private ActionIdEnum actionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private ExportGraphReq body;

    public ExportGraphRequest withGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }

    


    /**
     * 图ID。
     * @return graphId
     */
    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    

    public ExportGraphRequest withActionId(ActionIdEnum actionId) {
        this.actionId = actionId;
        return this;
    }

    


    /**
     * 图actionId
     * @return actionId
     */
    public ActionIdEnum getActionId() {
        return actionId;
    }

    public void setActionId(ActionIdEnum actionId) {
        this.actionId = actionId;
    }

    

    public ExportGraphRequest withBody(ExportGraphReq body) {
        this.body = body;
        return this;
    }

    public ExportGraphRequest withBody(Consumer<ExportGraphReq> bodySetter) {
        if(this.body == null ){
            this.body = new ExportGraphReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ExportGraphReq getBody() {
        return body;
    }

    public void setBody(ExportGraphReq body) {
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
        ExportGraphRequest exportGraphRequest = (ExportGraphRequest) o;
        return Objects.equals(this.graphId, exportGraphRequest.graphId) &&
            Objects.equals(this.actionId, exportGraphRequest.actionId) &&
            Objects.equals(this.body, exportGraphRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphId, actionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportGraphRequest {\n");
        sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
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

