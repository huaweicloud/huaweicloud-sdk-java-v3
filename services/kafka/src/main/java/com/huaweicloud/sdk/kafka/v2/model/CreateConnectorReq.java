package com.huaweicloud.sdk.kafka.v2.model;




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
 * CreateConnectorReq
 */
public class CreateConnectorReq  {

    /**
     * 部署connector的规格，基准带宽，表示单位时间内传送的最大数据量，单位Byte/秒。  取值范围：   - 100MB   - 300MB   - 600MB   - 1200MB  可以不填，则默认跟当前实例的规格是一致。  第一阶段实现先不填，保持和当前实例规格一致，后面再扩展可以选择不同的规格。
     */
    public static final class SpecificationEnum {

        
        /**
         * Enum _100MB for value: "100MB"
         */
        public static final SpecificationEnum _100MB = new SpecificationEnum("100MB");
        
        /**
         * Enum _300MB for value: "300MB"
         */
        public static final SpecificationEnum _300MB = new SpecificationEnum("300MB");
        
        /**
         * Enum _600MB for value: "600MB"
         */
        public static final SpecificationEnum _600MB = new SpecificationEnum("600MB");
        
        /**
         * Enum _1200MB for value: "1200MB"
         */
        public static final SpecificationEnum _1200MB = new SpecificationEnum("1200MB");
        

        private static final Map<String, SpecificationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecificationEnum> createStaticFields() {
            Map<String, SpecificationEnum> map = new HashMap<>();
            map.put("100MB", _100MB);
            map.put("300MB", _300MB);
            map.put("600MB", _600MB);
            map.put("1200MB", _1200MB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecificationEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SpecificationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SpecificationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SpecificationEnum(value);
            }
            return result;
        }

        public static SpecificationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SpecificationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SpecificationEnum) {
                return this.value.equals(((SpecificationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specification")
    
    private SpecificationEnum specification;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_cnt")
    
    private String nodeCnt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    private String specCode;

    public CreateConnectorReq withSpecification(SpecificationEnum specification) {
        this.specification = specification;
        return this;
    }

    


    /**
     * 部署connector的规格，基准带宽，表示单位时间内传送的最大数据量，单位Byte/秒。  取值范围：   - 100MB   - 300MB   - 600MB   - 1200MB  可以不填，则默认跟当前实例的规格是一致。  第一阶段实现先不填，保持和当前实例规格一致，后面再扩展可以选择不同的规格。
     * @return specification
     */
    public SpecificationEnum getSpecification() {
        return specification;
    }

    public void setSpecification(SpecificationEnum specification) {
        this.specification = specification;
    }

    public CreateConnectorReq withNodeCnt(String nodeCnt) {
        this.nodeCnt = nodeCnt;
        return this;
    }

    


    /**
     * 转储节点数量。不能小于2个。 默认是2个。 
     * @return nodeCnt
     */
    public String getNodeCnt() {
        return nodeCnt;
    }

    public void setNodeCnt(String nodeCnt) {
        this.nodeCnt = nodeCnt;
    }

    public CreateConnectorReq withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 转储节点规格编码。 
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConnectorReq createConnectorReq = (CreateConnectorReq) o;
        return Objects.equals(this.specification, createConnectorReq.specification) &&
            Objects.equals(this.nodeCnt, createConnectorReq.nodeCnt) &&
            Objects.equals(this.specCode, createConnectorReq.specCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(specification, nodeCnt, specCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConnectorReq {\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    nodeCnt: ").append(toIndentedString(nodeCnt)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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

