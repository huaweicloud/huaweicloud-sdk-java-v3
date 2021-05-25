package com.huaweicloud.sdk.bcs.v2.model;




import java.util.Collections;

import java.util.Collections;

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
public class ListOpRecordRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blockchain_id")
    
    private String blockchainId;
    /**
     * 操作状态
     */
    public static final class OperationStatusEnum {

        
        /**
         * Enum WAITING for value: "waiting"
         */
        public static final OperationStatusEnum WAITING = new OperationStatusEnum("waiting");
        
        /**
         * Enum PROCESSING for value: "processing"
         */
        public static final OperationStatusEnum PROCESSING = new OperationStatusEnum("processing");
        
        /**
         * Enum FINISHED for value: "finished"
         */
        public static final OperationStatusEnum FINISHED = new OperationStatusEnum("finished");
        
        /**
         * Enum FAILED for value: "failed"
         */
        public static final OperationStatusEnum FAILED = new OperationStatusEnum("failed");
        
        /**
         * Enum STOP for value: "stop"
         */
        public static final OperationStatusEnum STOP = new OperationStatusEnum("stop");
        

        private static final Map<String, OperationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationStatusEnum> createStaticFields() {
            Map<String, OperationStatusEnum> map = new HashMap<>();
            map.put("waiting", WAITING);
            map.put("processing", PROCESSING);
            map.put("finished", FINISHED);
            map.put("failed", FAILED);
            map.put("stop", STOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationStatusEnum(String value) {
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
        public static OperationStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperationStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationStatusEnum(value);
            }
            return result;
        }

        public static OperationStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperationStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OperationStatusEnum) {
                return this.value.equals(((OperationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_status")
    
    private OperationStatusEnum operationStatus;
    /**
     * 资源类型
     */
    public static final class ResourceTypeEnum {

        
        /**
         * Enum BCSSVC01 for value: "BCSSVC01"
         */
        public static final ResourceTypeEnum BCSSVC01 = new ResourceTypeEnum("BCSSVC01");
        
        /**
         * Enum BCSSVC02 for value: "BCSSVC02"
         */
        public static final ResourceTypeEnum BCSSVC02 = new ResourceTypeEnum("BCSSVC02");
        
        /**
         * Enum PLUGIN01 for value: "PLUGIN01"
         */
        public static final ResourceTypeEnum PLUGIN01 = new ResourceTypeEnum("PLUGIN01");
        
        /**
         * Enum PLUGIN02 for value: "PLUGIN02"
         */
        public static final ResourceTypeEnum PLUGIN02 = new ResourceTypeEnum("PLUGIN02");
        
        /**
         * Enum PLUGIN03 for value: "PLUGIN03"
         */
        public static final ResourceTypeEnum PLUGIN03 = new ResourceTypeEnum("PLUGIN03");
        

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("BCSSVC01", BCSSVC01);
            map.put("BCSSVC02", BCSSVC02);
            map.put("PLUGIN01", PLUGIN01);
            map.put("PLUGIN02", PLUGIN02);
            map.put("PLUGIN03", PLUGIN03);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private ResourceTypeEnum resourceType;
    /**
     * 操作类型,  可选数值如下（括号中为该数值对应的操作类型含义）：99（OpCreate）,00（OpDelete）,01（OpUpgrade）,91（OpUpgradeRb）,02（OpAddOrg）,03（OpScaleOrg）,04（OpJoinChannel）,05（OpJoinUnion）
     */
    public static final class OperationTypeEnum {

        
        /**
         * Enum _99 for value: "99"
         */
        public static final OperationTypeEnum _99 = new OperationTypeEnum("99");
        
        /**
         * Enum _00 for value: "00"
         */
        public static final OperationTypeEnum _00 = new OperationTypeEnum("00");
        
        /**
         * Enum _01 for value: "01"
         */
        public static final OperationTypeEnum _01 = new OperationTypeEnum("01");
        
        /**
         * Enum _91 for value: "91"
         */
        public static final OperationTypeEnum _91 = new OperationTypeEnum("91");
        
        /**
         * Enum _02 for value: "02"
         */
        public static final OperationTypeEnum _02 = new OperationTypeEnum("02");
        
        /**
         * Enum _03 for value: "03"
         */
        public static final OperationTypeEnum _03 = new OperationTypeEnum("03");
        
        /**
         * Enum _04 for value: "04"
         */
        public static final OperationTypeEnum _04 = new OperationTypeEnum("04");
        
        /**
         * Enum _05 for value: "05"
         */
        public static final OperationTypeEnum _05 = new OperationTypeEnum("05");
        

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("99", _99);
            map.put("00", _00);
            map.put("01", _01);
            map.put("91", _91);
            map.put("02", _02);
            map.put("03", _03);
            map.put("04", _04);
            map.put("05", _05);
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
    @JsonProperty(value="operation_id")
    
    private String operationId;

    public ListOpRecordRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    


    /**
     * 区块链ID
     * @return blockchainId
     */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    

    public ListOpRecordRequest withOperationStatus(OperationStatusEnum operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    


    /**
     * 操作状态
     * @return operationStatus
     */
    public OperationStatusEnum getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatusEnum operationStatus) {
        this.operationStatus = operationStatus;
    }

    

    public ListOpRecordRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    

    public ListOpRecordRequest withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    


    /**
     * 操作类型,  可选数值如下（括号中为该数值对应的操作类型含义）：99（OpCreate）,00（OpDelete）,01（OpUpgrade）,91（OpUpgradeRb）,02（OpAddOrg）,03（OpScaleOrg）,04（OpJoinChannel）,05（OpJoinUnion）
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    

    public ListOpRecordRequest withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    


    /**
     * 操作记录ID
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOpRecordRequest listOpRecordRequest = (ListOpRecordRequest) o;
        return Objects.equals(this.blockchainId, listOpRecordRequest.blockchainId) &&
            Objects.equals(this.operationStatus, listOpRecordRequest.operationStatus) &&
            Objects.equals(this.resourceType, listOpRecordRequest.resourceType) &&
            Objects.equals(this.operationType, listOpRecordRequest.operationType) &&
            Objects.equals(this.operationId, listOpRecordRequest.operationId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, operationStatus, resourceType, operationType, operationId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpRecordRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

