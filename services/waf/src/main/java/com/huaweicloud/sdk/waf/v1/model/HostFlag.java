package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HostFlag
 */
public class HostFlag {

    /**
     * 是否开启pci_3ds合规认证，该参数需要与tls和cipher参数同时使用，且tls参数值需要设置为TLS v1.2，cipher参数值设置为cipher_2。注：pci_3ds合规认证开启后不支持关闭，在开启pci_3ds合规认证前，请先阅读帮助中心Web应用防火墙WAF文档中关于pci_3ds合规认证的说明   - true：开启   - false：不开启
     */
    public static final class Pci3dsEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final Pci3dsEnum TRUE = new Pci3dsEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final Pci3dsEnum FALSE = new Pci3dsEnum("false");

        private static final Map<String, Pci3dsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, Pci3dsEnum> createStaticFields() {
            Map<String, Pci3dsEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        Pci3dsEnum(String value) {
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
        public static Pci3dsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Pci3dsEnum(value));
        }

        public static Pci3dsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Pci3dsEnum) {
                return this.value.equals(((Pci3dsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_3ds")

    private Pci3dsEnum pci3ds;

    /**
     * 是否开启pci_dss合规认证，该参数需要与tls和cipher参数同时使用，且tls参数值需要设置为TLS v1.2，cipher参数值设置为cipher_2。注：在开启pci_dss合规认证前，请先阅读帮助中心Web应用防火墙WAF文档中关于pci_dss合规认证的说明   - true：开启   - false：不开启
     */
    public static final class PciDssEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final PciDssEnum TRUE = new PciDssEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final PciDssEnum FALSE = new PciDssEnum("false");

        private static final Map<String, PciDssEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PciDssEnum> createStaticFields() {
            Map<String, PciDssEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PciDssEnum(String value) {
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
        public static PciDssEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PciDssEnum(value));
        }

        public static PciDssEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PciDssEnum) {
                return this.value.equals(((PciDssEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_dss")

    private PciDssEnum pciDss;

    public HostFlag withPci3ds(Pci3dsEnum pci3ds) {
        this.pci3ds = pci3ds;
        return this;
    }

    /**
     * 是否开启pci_3ds合规认证，该参数需要与tls和cipher参数同时使用，且tls参数值需要设置为TLS v1.2，cipher参数值设置为cipher_2。注：pci_3ds合规认证开启后不支持关闭，在开启pci_3ds合规认证前，请先阅读帮助中心Web应用防火墙WAF文档中关于pci_3ds合规认证的说明   - true：开启   - false：不开启
     * @return pci3ds
     */
    public Pci3dsEnum getPci3ds() {
        return pci3ds;
    }

    public void setPci3ds(Pci3dsEnum pci3ds) {
        this.pci3ds = pci3ds;
    }

    public HostFlag withPciDss(PciDssEnum pciDss) {
        this.pciDss = pciDss;
        return this;
    }

    /**
     * 是否开启pci_dss合规认证，该参数需要与tls和cipher参数同时使用，且tls参数值需要设置为TLS v1.2，cipher参数值设置为cipher_2。注：在开启pci_dss合规认证前，请先阅读帮助中心Web应用防火墙WAF文档中关于pci_dss合规认证的说明   - true：开启   - false：不开启
     * @return pciDss
     */
    public PciDssEnum getPciDss() {
        return pciDss;
    }

    public void setPciDss(PciDssEnum pciDss) {
        this.pciDss = pciDss;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostFlag that = (HostFlag) obj;
        return Objects.equals(this.pci3ds, that.pci3ds) && Objects.equals(this.pciDss, that.pciDss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pci3ds, pciDss);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostFlag {\n");
        sb.append("    pci3ds: ").append(toIndentedString(pci3ds)).append("\n");
        sb.append("    pciDss: ").append(toIndentedString(pciDss)).append("\n");
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
