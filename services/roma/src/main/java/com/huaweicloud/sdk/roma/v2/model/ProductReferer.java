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
 * 产品
 */
public class ProductReferer  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private Integer productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private Object productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="manufacturer_id")
    
    private String manufacturerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="model")
    
    private String model;
    /**
     * 产品的协议类型：0-mqtt，1-coap，2-modbus，3-http, 4-opcua
     */
    public static final class ProtocolTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProtocolTypeEnum NUMBER_0 = new ProtocolTypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProtocolTypeEnum NUMBER_1 = new ProtocolTypeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ProtocolTypeEnum NUMBER_2 = new ProtocolTypeEnum(2);
        
        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final ProtocolTypeEnum NUMBER_3 = new ProtocolTypeEnum(3);
        
        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final ProtocolTypeEnum NUMBER_4 = new ProtocolTypeEnum(4);
        

        private static final Map<Integer, ProtocolTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProtocolTypeEnum> createStaticFields() {
            Map<Integer, ProtocolTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProtocolTypeEnum(Integer value) {
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
        public static ProtocolTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ProtocolTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolTypeEnum(value);
            }
            return result;
        }

        public static ProtocolTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ProtocolTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtocolTypeEnum) {
                return this.value.equals(((ProtocolTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_type")
    
    private ProtocolTypeEnum protocolType;
    /**
     * 产品类型：0-普通产品 1-网关产品
     */
    public static final class ProductTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProductTypeEnum NUMBER_0 = new ProductTypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProductTypeEnum NUMBER_1 = new ProductTypeEnum(1);
        

        private static final Map<Integer, ProductTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProductTypeEnum> createStaticFields() {
            Map<Integer, ProductTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProductTypeEnum(Integer value) {
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
        public static ProductTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ProductTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProductTypeEnum(value);
            }
            return result;
        }

        public static ProductTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ProductTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProductTypeEnum) {
                return this.value.equals(((ProductTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_type")
    
    private ProductTypeEnum productType;

    public ProductReferer withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品ID，未填写厂商ID+型号时产品ID必填
     * @return productId
     */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    

    public ProductReferer withProductName(Object productName) {
        this.productName = productName;
        return this;
    }

    


    /**
     * 产品名称
     * @return productName
     */
    public Object getProductName() {
        return productName;
    }

    public void setProductName(Object productName) {
        this.productName = productName;
    }

    

    public ProductReferer withManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
        return this;
    }

    


    /**
     * 厂商ID，未填写产品ID时厂商ID和型号必填
     * @return manufacturerId
     */
    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    

    public ProductReferer withModel(String model) {
        this.model = model;
        return this;
    }

    


    /**
     * 型号，未填写产品ID时厂商ID和型号必填
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    public ProductReferer withProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    


    /**
     * 产品的协议类型：0-mqtt，1-coap，2-modbus，3-http, 4-opcua
     * @return protocolType
     */
    public ProtocolTypeEnum getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
    }

    

    public ProductReferer withProductType(ProductTypeEnum productType) {
        this.productType = productType;
        return this;
    }

    


    /**
     * 产品类型：0-普通产品 1-网关产品
     * @return productType
     */
    public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductReferer productReferer = (ProductReferer) o;
        return Objects.equals(this.productId, productReferer.productId) &&
            Objects.equals(this.productName, productReferer.productName) &&
            Objects.equals(this.manufacturerId, productReferer.manufacturerId) &&
            Objects.equals(this.model, productReferer.model) &&
            Objects.equals(this.protocolType, productReferer.protocolType) &&
            Objects.equals(this.productType, productReferer.productType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, manufacturerId, model, protocolType, productType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductReferer {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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

