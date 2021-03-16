package com.huaweicloud.sdk.cbr.v1.model;




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
public class ListPoliciesRequest  {

    /**
     * Gets or Sets operationType
     */
    public static final class OperationTypeEnum {

        
        /**
         * Enum BACKUP for value: "backup"
         */
        public static final OperationTypeEnum BACKUP = new OperationTypeEnum("backup");
        
        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final OperationTypeEnum REPLICATION = new OperationTypeEnum("replication");
        

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("replication", REPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypeEnum(value);
            }
            return result;
        }

        public static OperationTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_type")
    
    private OperationTypeEnum operationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault_id")
    
    private String vaultId;

    public ListPoliciesRequest withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    


    /**
     * Get operationType
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    

    public ListPoliciesRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    


    /**
     * Get vaultId
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPoliciesRequest listPoliciesRequest = (ListPoliciesRequest) o;
        return Objects.equals(this.operationType, listPoliciesRequest.operationType) &&
            Objects.equals(this.vaultId, listPoliciesRequest.vaultId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(operationType, vaultId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoliciesRequest {\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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

