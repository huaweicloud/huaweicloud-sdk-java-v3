package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 客户自定义DNS服务。
 */
public class CustomizedDns {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_set_dns")

    private Boolean isSetDns;

    /**
     * 设置客户自定义DNS的行为。 - add：新增客户自定义DNS IP。 - keep：保持客户自定义DNS IP。 - update：更新客户自定义DNS IP（当DNS IP变化时更新生效）。 - recover：还原系统默认DNS IP（还原时可能会导致域名解析失败，请谨慎操作）。
     */
    public static final class SetDnsActionEnum {

        /**
         * Enum ADD for value: "add"
         */
        public static final SetDnsActionEnum ADD = new SetDnsActionEnum("add");

        /**
         * Enum KEEP for value: "keep"
         */
        public static final SetDnsActionEnum KEEP = new SetDnsActionEnum("keep");

        /**
         * Enum UPDATE for value: "update"
         */
        public static final SetDnsActionEnum UPDATE = new SetDnsActionEnum("update");

        /**
         * Enum RECOVER for value: "recover"
         */
        public static final SetDnsActionEnum RECOVER = new SetDnsActionEnum("recover");

        private static final Map<String, SetDnsActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SetDnsActionEnum> createStaticFields() {
            Map<String, SetDnsActionEnum> map = new HashMap<>();
            map.put("add", ADD);
            map.put("keep", KEEP);
            map.put("update", UPDATE);
            map.put("recover", RECOVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SetDnsActionEnum(String value) {
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
        public static SetDnsActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SetDnsActionEnum(value));
        }

        public static SetDnsActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SetDnsActionEnum) {
                return this.value.equals(((SetDnsActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_dns_action")

    private SetDnsActionEnum setDnsAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_ip")

    private String dnsIp;

    public CustomizedDns withIsSetDns(Boolean isSetDns) {
        this.isSetDns = isSetDns;
        return this;
    }

    /**
     * 是否设置客户自定义DNS。
     * @return isSetDns
     */
    public Boolean getIsSetDns() {
        return isSetDns;
    }

    public void setIsSetDns(Boolean isSetDns) {
        this.isSetDns = isSetDns;
    }

    public CustomizedDns withSetDnsAction(SetDnsActionEnum setDnsAction) {
        this.setDnsAction = setDnsAction;
        return this;
    }

    /**
     * 设置客户自定义DNS的行为。 - add：新增客户自定义DNS IP。 - keep：保持客户自定义DNS IP。 - update：更新客户自定义DNS IP（当DNS IP变化时更新生效）。 - recover：还原系统默认DNS IP（还原时可能会导致域名解析失败，请谨慎操作）。
     * @return setDnsAction
     */
    public SetDnsActionEnum getSetDnsAction() {
        return setDnsAction;
    }

    public void setSetDnsAction(SetDnsActionEnum setDnsAction) {
        this.setDnsAction = setDnsAction;
    }

    public CustomizedDns withDnsIp(String dnsIp) {
        this.dnsIp = dnsIp;
        return this;
    }

    /**
     * 设置客户自定义DNS IP。
     * @return dnsIp
     */
    public String getDnsIp() {
        return dnsIp;
    }

    public void setDnsIp(String dnsIp) {
        this.dnsIp = dnsIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomizedDns that = (CustomizedDns) obj;
        return Objects.equals(this.isSetDns, that.isSetDns) && Objects.equals(this.setDnsAction, that.setDnsAction)
            && Objects.equals(this.dnsIp, that.dnsIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSetDns, setDnsAction, dnsIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizedDns {\n");
        sb.append("    isSetDns: ").append(toIndentedString(isSetDns)).append("\n");
        sb.append("    setDnsAction: ").append(toIndentedString(setDnsAction)).append("\n");
        sb.append("    dnsIp: ").append(toIndentedString(dnsIp)).append("\n");
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
