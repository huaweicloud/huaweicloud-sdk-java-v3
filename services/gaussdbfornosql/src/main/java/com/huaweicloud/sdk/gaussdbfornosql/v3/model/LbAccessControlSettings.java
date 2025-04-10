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
 * 负载均衡访问控制配置。
 */
public class LbAccessControlSettings {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    /**
     * 黑白名单类型，blackList黑名单，whiteList白名单，仅支持设置黑名单或白名单中的一种，当配置切换时，原配置会失效。
     */
    public static final class TypeEnum {

        /**
         * Enum BLACKLIST for value: "blackList"
         */
        public static final TypeEnum BLACKLIST = new TypeEnum("blackList");

        /**
         * Enum WHITELIST for value: "whiteList"
         */
        public static final TypeEnum WHITELIST = new TypeEnum("whiteList");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("blackList", BLACKLIST);
            map.put("whiteList", WHITELIST);
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
    @JsonProperty(value = "ip_groups")

    private List<IpGroupsDetail> ipGroups = null;

    public LbAccessControlSettings withEnabled(Boolean enabled) {
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

    public LbAccessControlSettings withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 黑白名单类型，blackList黑名单，whiteList白名单，仅支持设置黑名单或白名单中的一种，当配置切换时，原配置会失效。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public LbAccessControlSettings withIpGroups(List<IpGroupsDetail> ipGroups) {
        this.ipGroups = ipGroups;
        return this;
    }

    public LbAccessControlSettings addIpGroupsItem(IpGroupsDetail ipGroupsItem) {
        if (this.ipGroups == null) {
            this.ipGroups = new ArrayList<>();
        }
        this.ipGroups.add(ipGroupsItem);
        return this;
    }

    public LbAccessControlSettings withIpGroups(Consumer<List<IpGroupsDetail>> ipGroupsSetter) {
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
    public List<IpGroupsDetail> getIpGroups() {
        return ipGroups;
    }

    public void setIpGroups(List<IpGroupsDetail> ipGroups) {
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
        LbAccessControlSettings that = (LbAccessControlSettings) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.type, that.type)
            && Objects.equals(this.ipGroups, that.ipGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, type, ipGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LbAccessControlSettings {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
