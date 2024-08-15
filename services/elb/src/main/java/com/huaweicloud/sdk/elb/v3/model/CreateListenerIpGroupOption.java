package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 监听器对象中的控制组（ipgroup）信息，可以不传或传null或{}，表示监听器不绑定访问控制组。 若需要绑定访问控制组，则ipgroup_id是必须的。  [不支持该字段，请勿使用。](tag:hcso_dt)
 */
public class CreateListenerIpGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_id")

    private String ipgroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ipgroup")

    private Boolean enableIpgroup;

    /**
     * 参数解释：访问控制组的类型。  取值范围： - white：白名单，只允许指定ip访问。 - black：黑名单，不允许指定ip访问。  默认取值：white
     */
    public static final class TypeEnum {

        /**
         * Enum WHITE for value: "white"
         */
        public static final TypeEnum WHITE = new TypeEnum("white");

        /**
         * Enum BLACK for value: "black"
         */
        public static final TypeEnum BLACK = new TypeEnum("black");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("white", WHITE);
            map.put("black", BLACK);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public CreateListenerIpGroupOption withIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
        return this;
    }

    /**
     * 参数解释：监听器关联的访问控制组的id。  约束限制： - 当关联的ipgroup中的ip_list为[]，且类型为白名单时，表示禁止所有ip的访问。 - 当关联的ipgroup中的ip_list为[]，且类型为黑名单时，表示允许所有ip的访问。
     * @return ipgroupId
     */
    public String getIpgroupId() {
        return ipgroupId;
    }

    public void setIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
    }

    public CreateListenerIpGroupOption withEnableIpgroup(Boolean enableIpgroup) {
        this.enableIpgroup = enableIpgroup;
        return this;
    }

    /**
     * 参数解释：访问控制组的状态。  取值范围： - true：开启访问控制，默认值。 - flase：关闭访问控制。
     * @return enableIpgroup
     */
    public Boolean getEnableIpgroup() {
        return enableIpgroup;
    }

    public void setEnableIpgroup(Boolean enableIpgroup) {
        this.enableIpgroup = enableIpgroup;
    }

    public CreateListenerIpGroupOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 参数解释：访问控制组的类型。  取值范围： - white：白名单，只允许指定ip访问。 - black：黑名单，不允许指定ip访问。  默认取值：white
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateListenerIpGroupOption that = (CreateListenerIpGroupOption) obj;
        return Objects.equals(this.ipgroupId, that.ipgroupId) && Objects.equals(this.enableIpgroup, that.enableIpgroup)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroupId, enableIpgroup, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateListenerIpGroupOption {\n");
        sb.append("    ipgroupId: ").append(toIndentedString(ipgroupId)).append("\n");
        sb.append("    enableIpgroup: ").append(toIndentedString(enableIpgroup)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
