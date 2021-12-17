package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** ResourcePrice */
public class ResourcePrice {

    /** cpu架构 x86|arm */
    public static final class ArchEnum {

        /** Enum X86 for value: "x86" */
        public static final ArchEnum X86 = new ArchEnum("x86");

        /** Enum ARM for value: "arm" */
        public static final ArchEnum ARM = new ArchEnum("arm");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("x86", X86);
            map.put("arm", ARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ArchEnum(value);
            }
            return result;
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price")

    private Float price;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ResourcePrice withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /** cpu架构 x86|arm
     * 
     * @return arch */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public ResourcePrice withPrice(Float price) {
        this.price = price;
        return this;
    }

    /** 价格 minimum: 0 maximum: 1E+8
     * 
     * @return price */
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public ResourcePrice withSize(String size) {
        this.size = size;
        return this;
    }

    /** 规格。 类型为'storage'时，size值可以为5GB，10GB，20GB。
     * 类型为'cpuMemory'时，arch为'x86'，size值可以为1U1G，2U4G，4U8G；arch为'arm'，size值可以为4U8G。
     * 
     * @return size */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ResourcePrice withType(String type) {
        this.type = type;
        return this;
    }

    /** 类型。目前可以取值storage，cpuMemory
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcePrice resourcePrice = (ResourcePrice) o;
        return Objects.equals(this.arch, resourcePrice.arch) && Objects.equals(this.price, resourcePrice.price)
            && Objects.equals(this.size, resourcePrice.size) && Objects.equals(this.type, resourcePrice.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch, price, size, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcePrice {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
