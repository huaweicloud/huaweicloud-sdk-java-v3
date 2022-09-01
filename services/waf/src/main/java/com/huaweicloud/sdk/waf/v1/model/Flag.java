package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 特殊标识，用于前端使用
 */
public class Flag {

    /**
     * 是否开启pci_3ds合规认证   - true：开启   - false：不开启
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
            Pci3dsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new Pci3dsEnum(value);
            }
            return result;
        }

        public static Pci3dsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            Pci3dsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "pci_3ds")

    private Pci3dsEnum pci3ds;

    /**
     * 是否开启pci_dss合规认证   - true：开启   - false：不开启
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
            PciDssEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PciDssEnum(value);
            }
            return result;
        }

        public static PciDssEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PciDssEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "pci_dss")

    private PciDssEnum pciDss;

    /**
     * old：代表域名使用的老的cname，new：代表域名使用新的cname
     */
    public static final class CnameEnum {

        /**
         * Enum OLD for value: "old"
         */
        public static final CnameEnum OLD = new CnameEnum("old");

        /**
         * Enum NEW for value: "new"
         */
        public static final CnameEnum NEW = new CnameEnum("new");

        private static final Map<String, CnameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CnameEnum> createStaticFields() {
            Map<String, CnameEnum> map = new HashMap<>();
            map.put("old", OLD);
            map.put("new", NEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CnameEnum(String value) {
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
        public static CnameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CnameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CnameEnum(value);
            }
            return result;
        }

        public static CnameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CnameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CnameEnum) {
                return this.value.equals(((CnameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname")

    @JacksonXmlProperty(localName = "cname")

    private CnameEnum cname;

    /**
     * 域名是否开启ipv6   - true：支持   - false：不支持
     */
    public static final class IsDualAzEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsDualAzEnum TRUE = new IsDualAzEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsDualAzEnum FALSE = new IsDualAzEnum("false");

        private static final Map<String, IsDualAzEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsDualAzEnum> createStaticFields() {
            Map<String, IsDualAzEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsDualAzEnum(String value) {
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
        public static IsDualAzEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            IsDualAzEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsDualAzEnum(value);
            }
            return result;
        }

        public static IsDualAzEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            IsDualAzEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsDualAzEnum) {
                return this.value.equals(((IsDualAzEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dual_az")

    @JacksonXmlProperty(localName = "is_dual_az")

    private IsDualAzEnum isDualAz;

    /**
     * 域名是否开启ipv6   - true：支持   - false：不支持
     */
    public static final class Ipv6Enum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final Ipv6Enum TRUE = new Ipv6Enum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final Ipv6Enum FALSE = new Ipv6Enum("false");

        private static final Map<String, Ipv6Enum> STATIC_FIELDS = createStaticFields();

        private static Map<String, Ipv6Enum> createStaticFields() {
            Map<String, Ipv6Enum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        Ipv6Enum(String value) {
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
        public static Ipv6Enum fromValue(String value) {
            if (value == null) {
                return null;
            }
            Ipv6Enum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new Ipv6Enum(value);
            }
            return result;
        }

        public static Ipv6Enum valueOf(String value) {
            if (value == null) {
                return null;
            }
            Ipv6Enum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Ipv6Enum) {
                return this.value.equals(((Ipv6Enum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6")

    @JacksonXmlProperty(localName = "ipv6")

    private Ipv6Enum ipv6;

    public Flag withPci3ds(Pci3dsEnum pci3ds) {
        this.pci3ds = pci3ds;
        return this;
    }

    /**
     * 是否开启pci_3ds合规认证   - true：开启   - false：不开启
     * @return pci3ds
     */
    public Pci3dsEnum getPci3ds() {
        return pci3ds;
    }

    public void setPci3ds(Pci3dsEnum pci3ds) {
        this.pci3ds = pci3ds;
    }

    public Flag withPciDss(PciDssEnum pciDss) {
        this.pciDss = pciDss;
        return this;
    }

    /**
     * 是否开启pci_dss合规认证   - true：开启   - false：不开启
     * @return pciDss
     */
    public PciDssEnum getPciDss() {
        return pciDss;
    }

    public void setPciDss(PciDssEnum pciDss) {
        this.pciDss = pciDss;
    }

    public Flag withCname(CnameEnum cname) {
        this.cname = cname;
        return this;
    }

    /**
     * old：代表域名使用的老的cname，new：代表域名使用新的cname
     * @return cname
     */
    public CnameEnum getCname() {
        return cname;
    }

    public void setCname(CnameEnum cname) {
        this.cname = cname;
    }

    public Flag withIsDualAz(IsDualAzEnum isDualAz) {
        this.isDualAz = isDualAz;
        return this;
    }

    /**
     * 域名是否开启ipv6   - true：支持   - false：不支持
     * @return isDualAz
     */
    public IsDualAzEnum getIsDualAz() {
        return isDualAz;
    }

    public void setIsDualAz(IsDualAzEnum isDualAz) {
        this.isDualAz = isDualAz;
    }

    public Flag withIpv6(Ipv6Enum ipv6) {
        this.ipv6 = ipv6;
        return this;
    }

    /**
     * 域名是否开启ipv6   - true：支持   - false：不支持
     * @return ipv6
     */
    public Ipv6Enum getIpv6() {
        return ipv6;
    }

    public void setIpv6(Ipv6Enum ipv6) {
        this.ipv6 = ipv6;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Flag flag = (Flag) o;
        return Objects.equals(this.pci3ds, flag.pci3ds) && Objects.equals(this.pciDss, flag.pciDss)
            && Objects.equals(this.cname, flag.cname) && Objects.equals(this.isDualAz, flag.isDualAz)
            && Objects.equals(this.ipv6, flag.ipv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pci3ds, pciDss, cname, isDualAz, ipv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flag {\n");
        sb.append("    pci3ds: ").append(toIndentedString(pci3ds)).append("\n");
        sb.append("    pciDss: ").append(toIndentedString(pciDss)).append("\n");
        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
        sb.append("    isDualAz: ").append(toIndentedString(isDualAz)).append("\n");
        sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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
