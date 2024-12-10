package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
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
public class UpdateCertificateV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 证书类型  - global：全局证书 - instance：实例证书
     */
    public static final class TypeEnum {

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final TypeEnum GLOBAL = new TypeEnum("global");

        /**
         * Enum INSTANCE for value: "instance"
         */
        public static final TypeEnum INSTANCE = new TypeEnum("instance");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("global", GLOBAL);
            map.put("instance", INSTANCE);
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
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_name")

    private String commonName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "san")

    private List<String> san = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    private OffsetDateTime notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_has_trusted_root_ca")

    private Boolean isHasTrustedRootCa;

    /**
     * 证书算法类型： - RSA - ECC - SM2
     */
    public static final class AlgorithmTypeEnum {

        /**
         * Enum RSA for value: "RSA"
         */
        public static final AlgorithmTypeEnum RSA = new AlgorithmTypeEnum("RSA");

        /**
         * Enum ECC for value: "ECC"
         */
        public static final AlgorithmTypeEnum ECC = new AlgorithmTypeEnum("ECC");

        /**
         * Enum SM2 for value: "SM2"
         */
        public static final AlgorithmTypeEnum SM2 = new AlgorithmTypeEnum("SM2");

        private static final Map<String, AlgorithmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlgorithmTypeEnum> createStaticFields() {
            Map<String, AlgorithmTypeEnum> map = new HashMap<>();
            map.put("RSA", RSA);
            map.put("ECC", ECC);
            map.put("SM2", SM2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlgorithmTypeEnum(String value) {
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
        public static AlgorithmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlgorithmTypeEnum(value));
        }

        public static AlgorithmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlgorithmTypeEnum) {
                return this.value.equals(((AlgorithmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private AlgorithmTypeEnum algorithmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private List<String> organization = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit")

    private List<String> organizationalUnit = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locality")

    private List<String> locality = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<String> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private List<String> country = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private OffsetDateTime notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private List<String> issuer = null;

    public UpdateCertificateV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateCertificateV2Response withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCertificateV2Response withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 证书类型  - global：全局证书 - instance：实例证书
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateCertificateV2Response withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例编码  - `type`为`global`时，缺省为common - `type`为`instance`时，为实例编码
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateCertificateV2Response withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户项目编号
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateCertificateV2Response withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * 域名
     * @return commonName
     */
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public UpdateCertificateV2Response withSan(List<String> san) {
        this.san = san;
        return this;
    }

    public UpdateCertificateV2Response addSanItem(String sanItem) {
        if (this.san == null) {
            this.san = new ArrayList<>();
        }
        this.san.add(sanItem);
        return this;
    }

    public UpdateCertificateV2Response withSan(Consumer<List<String>> sanSetter) {
        if (this.san == null) {
            this.san = new ArrayList<>();
        }
        sanSetter.accept(this.san);
        return this;
    }

    /**
     * san扩展域名
     * @return san
     */
    public List<String> getSan() {
        return san;
    }

    public void setSan(List<String> san) {
        this.san = san;
    }

    public UpdateCertificateV2Response withNotAfter(OffsetDateTime notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * 有效期到
     * @return notAfter
     */
    public OffsetDateTime getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(OffsetDateTime notAfter) {
        this.notAfter = notAfter;
    }

    public UpdateCertificateV2Response withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 签名算法
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public UpdateCertificateV2Response withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public UpdateCertificateV2Response withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateCertificateV2Response withIsHasTrustedRootCa(Boolean isHasTrustedRootCa) {
        this.isHasTrustedRootCa = isHasTrustedRootCa;
        return this;
    }

    /**
     * 是否存在信任的根证书CA。当绑定证书存在trusted_root_ca时为true。
     * @return isHasTrustedRootCa
     */
    public Boolean getIsHasTrustedRootCa() {
        return isHasTrustedRootCa;
    }

    public void setIsHasTrustedRootCa(Boolean isHasTrustedRootCa) {
        this.isHasTrustedRootCa = isHasTrustedRootCa;
    }

    public UpdateCertificateV2Response withAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 证书算法类型： - RSA - ECC - SM2
     * @return algorithmType
     */
    public AlgorithmTypeEnum getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
    }

    public UpdateCertificateV2Response withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UpdateCertificateV2Response withOrganization(List<String> organization) {
        this.organization = organization;
        return this;
    }

    public UpdateCertificateV2Response addOrganizationItem(String organizationItem) {
        if (this.organization == null) {
            this.organization = new ArrayList<>();
        }
        this.organization.add(organizationItem);
        return this;
    }

    public UpdateCertificateV2Response withOrganization(Consumer<List<String>> organizationSetter) {
        if (this.organization == null) {
            this.organization = new ArrayList<>();
        }
        organizationSetter.accept(this.organization);
        return this;
    }

    /**
     * 公司、组织
     * @return organization
     */
    public List<String> getOrganization() {
        return organization;
    }

    public void setOrganization(List<String> organization) {
        this.organization = organization;
    }

    public UpdateCertificateV2Response withOrganizationalUnit(List<String> organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

    public UpdateCertificateV2Response addOrganizationalUnitItem(String organizationalUnitItem) {
        if (this.organizationalUnit == null) {
            this.organizationalUnit = new ArrayList<>();
        }
        this.organizationalUnit.add(organizationalUnitItem);
        return this;
    }

    public UpdateCertificateV2Response withOrganizationalUnit(Consumer<List<String>> organizationalUnitSetter) {
        if (this.organizationalUnit == null) {
            this.organizationalUnit = new ArrayList<>();
        }
        organizationalUnitSetter.accept(this.organizationalUnit);
        return this;
    }

    /**
     * 部门
     * @return organizationalUnit
     */
    public List<String> getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(List<String> organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    public UpdateCertificateV2Response withLocality(List<String> locality) {
        this.locality = locality;
        return this;
    }

    public UpdateCertificateV2Response addLocalityItem(String localityItem) {
        if (this.locality == null) {
            this.locality = new ArrayList<>();
        }
        this.locality.add(localityItem);
        return this;
    }

    public UpdateCertificateV2Response withLocality(Consumer<List<String>> localitySetter) {
        if (this.locality == null) {
            this.locality = new ArrayList<>();
        }
        localitySetter.accept(this.locality);
        return this;
    }

    /**
     * 城市
     * @return locality
     */
    public List<String> getLocality() {
        return locality;
    }

    public void setLocality(List<String> locality) {
        this.locality = locality;
    }

    public UpdateCertificateV2Response withState(List<String> state) {
        this.state = state;
        return this;
    }

    public UpdateCertificateV2Response addStateItem(String stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public UpdateCertificateV2Response withState(Consumer<List<String>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    /**
     * 省份
     * @return state
     */
    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    public UpdateCertificateV2Response withCountry(List<String> country) {
        this.country = country;
        return this;
    }

    public UpdateCertificateV2Response addCountryItem(String countryItem) {
        if (this.country == null) {
            this.country = new ArrayList<>();
        }
        this.country.add(countryItem);
        return this;
    }

    public UpdateCertificateV2Response withCountry(Consumer<List<String>> countrySetter) {
        if (this.country == null) {
            this.country = new ArrayList<>();
        }
        countrySetter.accept(this.country);
        return this;
    }

    /**
     * 国家
     * @return country
     */
    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    public UpdateCertificateV2Response withNotBefore(OffsetDateTime notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 有效期从
     * @return notBefore
     */
    public OffsetDateTime getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(OffsetDateTime notBefore) {
        this.notBefore = notBefore;
    }

    public UpdateCertificateV2Response withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 序列号
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public UpdateCertificateV2Response withIssuer(List<String> issuer) {
        this.issuer = issuer;
        return this;
    }

    public UpdateCertificateV2Response addIssuerItem(String issuerItem) {
        if (this.issuer == null) {
            this.issuer = new ArrayList<>();
        }
        this.issuer.add(issuerItem);
        return this;
    }

    public UpdateCertificateV2Response withIssuer(Consumer<List<String>> issuerSetter) {
        if (this.issuer == null) {
            this.issuer = new ArrayList<>();
        }
        issuerSetter.accept(this.issuer);
        return this;
    }

    /**
     * 颁发者
     * @return issuer
     */
    public List<String> getIssuer() {
        return issuer;
    }

    public void setIssuer(List<String> issuer) {
        this.issuer = issuer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCertificateV2Response that = (UpdateCertificateV2Response) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.commonName, that.commonName)
            && Objects.equals(this.san, that.san) && Objects.equals(this.notAfter, that.notAfter)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.isHasTrustedRootCa, that.isHasTrustedRootCa)
            && Objects.equals(this.algorithmType, that.algorithmType) && Objects.equals(this.version, that.version)
            && Objects.equals(this.organization, that.organization)
            && Objects.equals(this.organizationalUnit, that.organizationalUnit)
            && Objects.equals(this.locality, that.locality) && Objects.equals(this.state, that.state)
            && Objects.equals(this.country, that.country) && Objects.equals(this.notBefore, that.notBefore)
            && Objects.equals(this.serialNumber, that.serialNumber) && Objects.equals(this.issuer, that.issuer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            instanceId,
            projectId,
            commonName,
            san,
            notAfter,
            signatureAlgorithm,
            createTime,
            updateTime,
            isHasTrustedRootCa,
            algorithmType,
            version,
            organization,
            organizationalUnit,
            locality,
            state,
            country,
            notBefore,
            serialNumber,
            issuer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCertificateV2Response {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
        sb.append("    san: ").append(toIndentedString(san)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    isHasTrustedRootCa: ").append(toIndentedString(isHasTrustedRootCa)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    organizationalUnit: ").append(toIndentedString(organizationalUnit)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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
