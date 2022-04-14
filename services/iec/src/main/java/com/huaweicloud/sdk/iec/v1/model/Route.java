package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 路由对象 */
public class Route {

    /** 路由的类型 取值范围： 1）ecs：弹性云服务器 2）vip：虚拟IP 3）local：系统路由，不可修改和删除 */
    public static final class TypeEnum {

        /** Enum ECS for value: "ecs" */
        public static final TypeEnum ECS = new TypeEnum("ecs");

        /** Enum VIP for value: "vip" */
        public static final TypeEnum VIP = new TypeEnum("vip");

        /** Enum LOCAL for value: "local" */
        public static final TypeEnum LOCAL = new TypeEnum("local");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ecs", ECS);
            map.put("vip", VIP);
            map.put("local", LOCAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthop")

    private String nexthop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public Route withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 路由的类型 取值范围： 1）ecs：弹性云服务器 2）vip：虚拟IP 3）local：系统路由，不可修改和删除
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Route withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /** 路由的目的网段 约束：合法的CIDR格式
     * 
     * @return destination */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Route withNexthop(String nexthop) {
        this.nexthop = nexthop;
        return this;
    }

    /** 路由下一跳对象的ID 取值范围： 1）当type为ecs时，传入ecs实例ID； 2）当type为vip时，取值为vip对应的IP地址；
     * 
     * @return nexthop */
    public String getNexthop() {
        return nexthop;
    }

    public void setNexthop(String nexthop) {
        this.nexthop = nexthop;
    }

    public Route withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 路由的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Route route = (Route) o;
        return Objects.equals(this.type, route.type) && Objects.equals(this.destination, route.destination)
            && Objects.equals(this.nexthop, route.nexthop) && Objects.equals(this.description, route.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, destination, nexthop, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Route {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
