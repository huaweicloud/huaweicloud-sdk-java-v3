package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置实例均衡负载IP的访问黑白名单请求体。
 */
public class SwitchIpGroupRequestBody {

    /**
     * 类型选项，取值： - whiteList：白名单，只允许指定ip或网段访问。 - blackList：黑名单，不允许指定ip或网段访问。
     */
    public static final class TypeEnum {

        /**
         * Enum WHITELIST for value: "whiteList"
         */
        public static final TypeEnum WHITELIST = new TypeEnum("whiteList");

        /**
         * Enum BLACKLIST for value: "blackList"
         */
        public static final TypeEnum BLACKLIST = new TypeEnum("blackList");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("whiteList", WHITELIST);
            map.put("blackList", BLACKLIST);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_groups")

    private List<SwitchIpGroupRequestBodyIpGroups> ipGroups = null;

    public SwitchIpGroupRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型选项，取值： - whiteList：白名单，只允许指定ip或网段访问。 - blackList：黑名单，不允许指定ip或网段访问。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SwitchIpGroupRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * true 开启，false 关闭。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public SwitchIpGroupRequestBody withIpGroups(List<SwitchIpGroupRequestBodyIpGroups> ipGroups) {
        this.ipGroups = ipGroups;
        return this;
    }

    public SwitchIpGroupRequestBody addIpGroupsItem(SwitchIpGroupRequestBodyIpGroups ipGroupsItem) {
        if (this.ipGroups == null) {
            this.ipGroups = new ArrayList<>();
        }
        this.ipGroups.add(ipGroupsItem);
        return this;
    }

    public SwitchIpGroupRequestBody withIpGroups(Consumer<List<SwitchIpGroupRequestBodyIpGroups>> ipGroupsSetter) {
        if (this.ipGroups == null) {
            this.ipGroups = new ArrayList<>();
        }
        ipGroupsSetter.accept(this.ipGroups);
        return this;
    }

    /**
     * IP地址组中包含的IP或网段列表。
     * @return ipGroups
     */
    public List<SwitchIpGroupRequestBodyIpGroups> getIpGroups() {
        return ipGroups;
    }

    public void setIpGroups(List<SwitchIpGroupRequestBodyIpGroups> ipGroups) {
        this.ipGroups = ipGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchIpGroupRequestBody that = (SwitchIpGroupRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.ipGroups, that.ipGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, enabled, ipGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchIpGroupRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    ipGroups: ").append(toIndentedString(ipGroups)).append("\n");
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
