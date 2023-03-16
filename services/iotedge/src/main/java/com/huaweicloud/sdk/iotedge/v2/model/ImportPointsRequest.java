package com.huaweicloud.sdk.iotedge.v2.model;





import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ImportPointsRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ImportPointsRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ds_id")
    

    private String dsId;
    /**
     * 该字段PARTIAL则增量覆盖，已有点位更新，新增点位插入;该字段为COMPLETE则全量覆盖，则删除数据源下所有点位，插入当前导入所有点位
     */
    public static final class UpdateTypeEnum {

        
        /**
         * Enum PARTIAL for value: "PARTIAL"
         */
        public static final UpdateTypeEnum PARTIAL = new UpdateTypeEnum("PARTIAL");
        
        /**
         * Enum COMPLETE for value: "COMPLETE"
         */
        public static final UpdateTypeEnum COMPLETE = new UpdateTypeEnum("COMPLETE");
        

        private static final Map<String, UpdateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpdateTypeEnum> createStaticFields() {
            Map<String, UpdateTypeEnum> map = new HashMap<>();
            map.put("PARTIAL", PARTIAL);
            map.put("COMPLETE", COMPLETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpdateTypeEnum(String value) {
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
        public static UpdateTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            UpdateTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new UpdateTypeEnum(value);
            }
            return result;
        }

        public static UpdateTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            UpdateTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpdateTypeEnum) {
                return this.value.equals(((UpdateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_type")
    

    private UpdateTypeEnum updateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private ImportPointsRequestBody body;

    public ImportPointsRequest withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    


    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    

    public ImportPointsRequest withDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }

    


    /**
     * 采集数据源id，创建数据源配置时设置，节点下唯一。
     * @return dsId
     */
    public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId;
    }

    

    public ImportPointsRequest withUpdateType(UpdateTypeEnum updateType) {
        this.updateType = updateType;
        return this;
    }

    


    /**
     * 该字段PARTIAL则增量覆盖，已有点位更新，新增点位插入;该字段为COMPLETE则全量覆盖，则删除数据源下所有点位，插入当前导入所有点位
     * @return updateType
     */
    public UpdateTypeEnum getUpdateType() {
        return updateType;
    }

    public void setUpdateType(UpdateTypeEnum updateType) {
        this.updateType = updateType;
    }

    

    public ImportPointsRequest withBody(ImportPointsRequestBody body) {
        this.body = body;
        return this;
    }

    public ImportPointsRequest withBody(Consumer<ImportPointsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ImportPointsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ImportPointsRequestBody getBody() {
        return body;
    }

    public void setBody(ImportPointsRequestBody body) {
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
        ImportPointsRequest importPointsRequest = (ImportPointsRequest) o;
        return Objects.equals(this.edgeNodeId, importPointsRequest.edgeNodeId) &&
            Objects.equals(this.dsId, importPointsRequest.dsId) &&
            Objects.equals(this.updateType, importPointsRequest.updateType) &&
            Objects.equals(this.body, importPointsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, dsId, updateType, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportPointsRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
        sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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

