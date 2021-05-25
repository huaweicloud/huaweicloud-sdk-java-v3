package com.huaweicloud.sdk.roma.v2.model;




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
 * CreateSourceRequestBody
 */
public class CreateSourceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private Integer productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private Integer deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;
    /**
     * 是否payload使用base64，0-是 1-否
     */
    public static final class IsBase64Enum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsBase64Enum NUMBER_0 = new IsBase64Enum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsBase64Enum NUMBER_1 = new IsBase64Enum(1);
        

        private static final Map<Integer, IsBase64Enum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsBase64Enum> createStaticFields() {
            Map<Integer, IsBase64Enum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsBase64Enum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsBase64Enum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            IsBase64Enum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsBase64Enum(value);
            }
            return result;
        }

        public static IsBase64Enum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            IsBase64Enum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IsBase64Enum) {
                return this.value.equals(((IsBase64Enum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_base64")
    
    private IsBase64Enum isBase64;
    /**
     * 是否包含设备信息是否包含设备信息，0-是 1-否
     */
    public static final class ContainDeviceInfoEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ContainDeviceInfoEnum NUMBER_0 = new ContainDeviceInfoEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ContainDeviceInfoEnum NUMBER_1 = new ContainDeviceInfoEnum(1);
        

        private static final Map<Integer, ContainDeviceInfoEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ContainDeviceInfoEnum> createStaticFields() {
            Map<Integer, ContainDeviceInfoEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ContainDeviceInfoEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ContainDeviceInfoEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ContainDeviceInfoEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ContainDeviceInfoEnum(value);
            }
            return result;
        }

        public static ContainDeviceInfoEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ContainDeviceInfoEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ContainDeviceInfoEnum) {
                return this.value.equals(((ContainDeviceInfoEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contain_device_info")
    
    private ContainDeviceInfoEnum containDeviceInfo;

    public CreateSourceRequestBody withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品ID，自动向下取整
     * @return productId
     */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    

    public CreateSourceRequestBody withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 设备ID，自动向下取整，不填为全部设备
     * @return deviceId
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    

    public CreateSourceRequestBody withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * 主题，当设备ID为空时为产品级主题，设备ID不为空时为设备级主题
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    

    public CreateSourceRequestBody withIsBase64(IsBase64Enum isBase64) {
        this.isBase64 = isBase64;
        return this;
    }

    


    /**
     * 是否payload使用base64，0-是 1-否
     * @return isBase64
     */
    public IsBase64Enum getIsBase64() {
        return isBase64;
    }

    public void setIsBase64(IsBase64Enum isBase64) {
        this.isBase64 = isBase64;
    }

    

    public CreateSourceRequestBody withContainDeviceInfo(ContainDeviceInfoEnum containDeviceInfo) {
        this.containDeviceInfo = containDeviceInfo;
        return this;
    }

    


    /**
     * 是否包含设备信息是否包含设备信息，0-是 1-否
     * @return containDeviceInfo
     */
    public ContainDeviceInfoEnum getContainDeviceInfo() {
        return containDeviceInfo;
    }

    public void setContainDeviceInfo(ContainDeviceInfoEnum containDeviceInfo) {
        this.containDeviceInfo = containDeviceInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSourceRequestBody createSourceRequestBody = (CreateSourceRequestBody) o;
        return Objects.equals(this.productId, createSourceRequestBody.productId) &&
            Objects.equals(this.deviceId, createSourceRequestBody.deviceId) &&
            Objects.equals(this.topic, createSourceRequestBody.topic) &&
            Objects.equals(this.isBase64, createSourceRequestBody.isBase64) &&
            Objects.equals(this.containDeviceInfo, createSourceRequestBody.containDeviceInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productId, deviceId, topic, isBase64, containDeviceInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSourceRequestBody {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    isBase64: ").append(toIndentedString(isBase64)).append("\n");
        sb.append("    containDeviceInfo: ").append(toIndentedString(containDeviceInfo)).append("\n");
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

