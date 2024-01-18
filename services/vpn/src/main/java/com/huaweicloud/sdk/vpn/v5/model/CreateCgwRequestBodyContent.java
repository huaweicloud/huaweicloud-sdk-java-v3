package com.huaweicloud.sdk.vpn.v5.model;

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
 * CreateCgwRequestBodyContent
 */
public class CreateCgwRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 对端网关标识类型
     */
    public static final class IdTypeEnum {

        /**
         * Enum IP for value: "ip"
         */
        public static final IdTypeEnum IP = new IdTypeEnum("ip");

        /**
         * Enum FQDN for value: "fqdn"
         */
        public static final IdTypeEnum FQDN = new IdTypeEnum("fqdn");

        private static final Map<String, IdTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IdTypeEnum> createStaticFields() {
            Map<String, IdTypeEnum> map = new HashMap<>();
            map.put("ip", IP);
            map.put("fqdn", FQDN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IdTypeEnum(String value) {
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
        public static IdTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IdTypeEnum(value));
        }

        public static IdTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IdTypeEnum) {
                return this.value.equals(((IdTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_type")

    private IdTypeEnum idType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_value")

    private String idValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Long bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_certificate")

    private CaCertificateRequest caCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<VpnResourceTag> tags = null;

    public CreateCgwRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网关名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCgwRequestBodyContent withIdType(IdTypeEnum idType) {
        this.idType = idType;
        return this;
    }

    /**
     * 对端网关标识类型
     * @return idType
     */
    public IdTypeEnum getIdType() {
        return idType;
    }

    public void setIdType(IdTypeEnum idType) {
        this.idType = idType;
    }

    public CreateCgwRequestBodyContent withIdValue(String idValue) {
        this.idValue = idValue;
        return this;
    }

    /**
     * 对端网关标识值
     * @return idValue
     */
    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public CreateCgwRequestBodyContent withBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * 网关的bgp asn号，默认值为65000
     * minimum: 1
     * maximum: 4294967295
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CreateCgwRequestBodyContent withCaCertificate(CaCertificateRequest caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    public CreateCgwRequestBodyContent withCaCertificate(Consumer<CaCertificateRequest> caCertificateSetter) {
        if (this.caCertificate == null) {
            this.caCertificate = new CaCertificateRequest();
            caCertificateSetter.accept(this.caCertificate);
        }

        return this;
    }

    /**
     * Get caCertificate
     * @return caCertificate
     */
    public CaCertificateRequest getCaCertificate() {
        return caCertificate;
    }

    public void setCaCertificate(CaCertificateRequest caCertificate) {
        this.caCertificate = caCertificate;
    }

    public CreateCgwRequestBodyContent withTags(List<VpnResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCgwRequestBodyContent addTagsItem(VpnResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCgwRequestBodyContent withTags(Consumer<List<VpnResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<VpnResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<VpnResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCgwRequestBodyContent that = (CreateCgwRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.idType, that.idType)
            && Objects.equals(this.idValue, that.idValue) && Objects.equals(this.bgpAsn, that.bgpAsn)
            && Objects.equals(this.caCertificate, that.caCertificate) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idType, idValue, bgpAsn, caCertificate, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCgwRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
        sb.append("    idValue: ").append(toIndentedString(idValue)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
