package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNatGatewaySpecsResponse extends SdkResponse {

    /**
     * Gets or Sets specs
     */
    public static final class SpecsEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final SpecsEnum _1 = new SpecsEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final SpecsEnum _2 = new SpecsEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final SpecsEnum _3 = new SpecsEnum("3");

        /**
         * Enum _4 for value: "4"
         */
        public static final SpecsEnum _4 = new SpecsEnum("4");

        /**
         * Enum _5 for value: "5"
         */
        public static final SpecsEnum _5 = new SpecsEnum("5");

        private static final Map<String, SpecsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecsEnum> createStaticFields() {
            Map<String, SpecsEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            map.put("4", _4);
            map.put("5", _5);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecsEnum(String value) {
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
        public static SpecsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecsEnum(value));
        }

        public static SpecsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecsEnum) {
                return this.value.equals(((SpecsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs")

    private List<SpecsEnum> specs = null;

    public ListNatGatewaySpecsResponse withSpecs(List<SpecsEnum> specs) {
        this.specs = specs;
        return this;
    }

    public ListNatGatewaySpecsResponse addSpecsItem(SpecsEnum specsItem) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        this.specs.add(specsItem);
        return this;
    }

    public ListNatGatewaySpecsResponse withSpecs(Consumer<List<SpecsEnum>> specsSetter) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        specsSetter.accept(this.specs);
        return this;
    }

    /**
     * 可创建的NAT网关实例列表 取值范围： - 1：小型，SNAT最大连接数10000 - 2：中型，SNAT最大连接数50000 - 3：大型，SNAT最大连接数200000 - 4：超大型，SNAT最大连接数1000000 - 5：企业型，SNAT最大连接数10000000 
     * @return specs
     */
    public List<SpecsEnum> getSpecs() {
        return specs;
    }

    public void setSpecs(List<SpecsEnum> specs) {
        this.specs = specs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNatGatewaySpecsResponse that = (ListNatGatewaySpecsResponse) obj;
        return Objects.equals(this.specs, that.specs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatGatewaySpecsResponse {\n");
        sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
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
