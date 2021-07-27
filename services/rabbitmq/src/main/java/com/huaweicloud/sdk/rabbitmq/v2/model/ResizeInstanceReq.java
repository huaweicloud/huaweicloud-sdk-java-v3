package com.huaweicloud.sdk.rabbitmq.v2.model;




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
 * ResizeInstanceReq
 */
public class ResizeInstanceReq  {

    /**
     * 规格变更后的规格ID。 请参考[查询可扩容规格列表](https://support.huaweicloud.com/api-rabbitmq/ResizeInstance.html)接口返回的数据。
     */
    public static final class NewSpecCodeEnum {

        
        /**
         * Enum DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_3 for value: "dms.instance.rabbitmq.cluster.c3.4u8g.3"
         */
        public static final NewSpecCodeEnum DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_3 = new NewSpecCodeEnum("dms.instance.rabbitmq.cluster.c3.4u8g.3");
        
        /**
         * Enum DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_5 for value: "dms.instance.rabbitmq.cluster.c3.4u8g.5"
         */
        public static final NewSpecCodeEnum DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_5 = new NewSpecCodeEnum("dms.instance.rabbitmq.cluster.c3.4u8g.5");
        
        /**
         * Enum DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_7 for value: "dms.instance.rabbitmq.cluster.c3.4u8g.7"
         */
        public static final NewSpecCodeEnum DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_7 = new NewSpecCodeEnum("dms.instance.rabbitmq.cluster.c3.4u8g.7");
        

        private static final Map<String, NewSpecCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NewSpecCodeEnum> createStaticFields() {
            Map<String, NewSpecCodeEnum> map = new HashMap<>();
            map.put("dms.instance.rabbitmq.cluster.c3.4u8g.3", DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_3);
            map.put("dms.instance.rabbitmq.cluster.c3.4u8g.5", DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_5);
            map.put("dms.instance.rabbitmq.cluster.c3.4u8g.7", DMS_INSTANCE_RABBITMQ_CLUSTER_C3_4U8G_7);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NewSpecCodeEnum(String value) {
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
        public static NewSpecCodeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NewSpecCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NewSpecCodeEnum(value);
            }
            return result;
        }

        public static NewSpecCodeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NewSpecCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NewSpecCodeEnum) {
                return this.value.equals(((NewSpecCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_spec_code")
    
    private NewSpecCodeEnum newSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_storage_space")
    
    private Integer newStorageSpace;

    public ResizeInstanceReq withNewSpecCode(NewSpecCodeEnum newSpecCode) {
        this.newSpecCode = newSpecCode;
        return this;
    }

    


    /**
     * 规格变更后的规格ID。 请参考[查询可扩容规格列表](https://support.huaweicloud.com/api-rabbitmq/ResizeInstance.html)接口返回的数据。
     * @return newSpecCode
     */
    public NewSpecCodeEnum getNewSpecCode() {
        return newSpecCode;
    }

    public void setNewSpecCode(NewSpecCodeEnum newSpecCode) {
        this.newSpecCode = newSpecCode;
    }

    

    public ResizeInstanceReq withNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
        return this;
    }

    


    /**
     * 规格变更后的消息存储空间，单位：GB。 请参考[查询可扩容规格列表](https://support.huaweicloud.com/api-rabbitmq/ResizeInstance.html)接口返回的数据。
     * @return newStorageSpace
     */
    public Integer getNewStorageSpace() {
        return newStorageSpace;
    }

    public void setNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInstanceReq resizeInstanceReq = (ResizeInstanceReq) o;
        return Objects.equals(this.newSpecCode, resizeInstanceReq.newSpecCode) &&
            Objects.equals(this.newStorageSpace, resizeInstanceReq.newStorageSpace);
    }
    @Override
    public int hashCode() {
        return Objects.hash(newSpecCode, newStorageSpace);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceReq {\n");
        sb.append("    newSpecCode: ").append(toIndentedString(newSpecCode)).append("\n");
        sb.append("    newStorageSpace: ").append(toIndentedString(newStorageSpace)).append("\n");
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

