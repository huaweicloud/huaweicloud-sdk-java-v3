package com.huaweicloud.sdk.ddm.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteInstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;
    /**
     * 是否同时删除关联RDS上存储的数据。  - 取值为空或“true”：删除。 - 取值为“false”：不删除。 默认值为空。
     */
    public static final class DeleteRdsDataEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final DeleteRdsDataEnum TRUE = new DeleteRdsDataEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final DeleteRdsDataEnum FALSE = new DeleteRdsDataEnum("false");
        

        private static final Map<String, DeleteRdsDataEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteRdsDataEnum> createStaticFields() {
            Map<String, DeleteRdsDataEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteRdsDataEnum(String value) {
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
        public static DeleteRdsDataEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DeleteRdsDataEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteRdsDataEnum(value);
            }
            return result;
        }

        public static DeleteRdsDataEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DeleteRdsDataEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DeleteRdsDataEnum) {
                return this.value.equals(((DeleteRdsDataEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_rds_data")
    
    private DeleteRdsDataEnum deleteRdsData;

    public DeleteInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * DDM实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public DeleteInstanceRequest withDeleteRdsData(DeleteRdsDataEnum deleteRdsData) {
        this.deleteRdsData = deleteRdsData;
        return this;
    }

    


    /**
     * 是否同时删除关联RDS上存储的数据。  - 取值为空或“true”：删除。 - 取值为“false”：不删除。 默认值为空。
     * @return deleteRdsData
     */
    public DeleteRdsDataEnum getDeleteRdsData() {
        return deleteRdsData;
    }

    public void setDeleteRdsData(DeleteRdsDataEnum deleteRdsData) {
        this.deleteRdsData = deleteRdsData;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteInstanceRequest deleteInstanceRequest = (DeleteInstanceRequest) o;
        return Objects.equals(this.instanceId, deleteInstanceRequest.instanceId) &&
            Objects.equals(this.deleteRdsData, deleteInstanceRequest.deleteRdsData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, deleteRdsData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstanceRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    deleteRdsData: ").append(toIndentedString(deleteRdsData)).append("\n");
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

