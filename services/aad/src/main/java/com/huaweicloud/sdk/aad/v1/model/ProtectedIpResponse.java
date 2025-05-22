package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 防护ip列表
 */
public class ProtectedIpResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    /**
     * 类型。VPN：VPN；NAT：NAT；VIP：VIP；CCI：CCI；EIP：弹性公网IP；ELB：弹性负载均衡；REROUTING_IP：REROUTING_IP；SubEni：SubEni；NetInterFace：NetInterFace；
     */
    public static final class TypeEnum {

        /**
         * Enum VPN for value: "VPN"
         */
        public static final TypeEnum VPN = new TypeEnum("VPN");

        /**
         * Enum NAT for value: "NAT"
         */
        public static final TypeEnum NAT = new TypeEnum("NAT");

        /**
         * Enum VIP for value: "VIP"
         */
        public static final TypeEnum VIP = new TypeEnum("VIP");

        /**
         * Enum CCI for value: "CCI"
         */
        public static final TypeEnum CCI = new TypeEnum("CCI");

        /**
         * Enum EIP for value: "EIP"
         */
        public static final TypeEnum EIP = new TypeEnum("EIP");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final TypeEnum ELB = new TypeEnum("ELB");

        /**
         * Enum REROUTING_IP for value: "REROUTING_IP"
         */
        public static final TypeEnum REROUTING_IP = new TypeEnum("REROUTING_IP");

        /**
         * Enum SUBENI for value: "SubEni"
         */
        public static final TypeEnum SUBENI = new TypeEnum("SubEni");

        /**
         * Enum NETINTERFACE for value: "NetInterFace"
         */
        public static final TypeEnum NETINTERFACE = new TypeEnum("NetInterFace");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("VPN", VPN);
            map.put("NAT", NAT);
            map.put("VIP", VIP);
            map.put("CCI", CCI);
            map.put("EIP", EIP);
            map.put("ELB", ELB);
            map.put("REROUTING_IP", REROUTING_IP);
            map.put("SubEni", SUBENI);
            map.put("NetInterFace", NETINTERFACE);
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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_detail")

    private IpStatusDetail statusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_resale")

    private Boolean isResale;

    /**
     * package_version。cnad_pro：专业版；cnad_ip：标准版；cnad_ep：铂金版；cnad_full_high：全力防高级版；cnad_vic：按需版；cnad_intl_ep：国际站铂金版
     */
    public static final class PackageVersionEnum {

        /**
         * Enum CNAD_PRO for value: "cnad_pro"
         */
        public static final PackageVersionEnum CNAD_PRO = new PackageVersionEnum("cnad_pro");

        /**
         * Enum CNAD_IP for value: "cnad_ip"
         */
        public static final PackageVersionEnum CNAD_IP = new PackageVersionEnum("cnad_ip");

        /**
         * Enum CNAD_EP for value: "cnad_ep"
         */
        public static final PackageVersionEnum CNAD_EP = new PackageVersionEnum("cnad_ep");

        /**
         * Enum CNAD_FULL_HIGH for value: "cnad_full_high"
         */
        public static final PackageVersionEnum CNAD_FULL_HIGH = new PackageVersionEnum("cnad_full_high");

        /**
         * Enum CNAD_VIC for value: "cnad_vic"
         */
        public static final PackageVersionEnum CNAD_VIC = new PackageVersionEnum("cnad_vic");

        /**
         * Enum CNAD_INTL_EP for value: "cnad_intl_ep"
         */
        public static final PackageVersionEnum CNAD_INTL_EP = new PackageVersionEnum("cnad_intl_ep");

        private static final Map<String, PackageVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PackageVersionEnum> createStaticFields() {
            Map<String, PackageVersionEnum> map = new HashMap<>();
            map.put("cnad_pro", CNAD_PRO);
            map.put("cnad_ip", CNAD_IP);
            map.put("cnad_ep", CNAD_EP);
            map.put("cnad_full_high", CNAD_FULL_HIGH);
            map.put("cnad_vic", CNAD_VIC);
            map.put("cnad_intl_ep", CNAD_INTL_EP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PackageVersionEnum(String value) {
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
        public static PackageVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PackageVersionEnum(value));
        }

        public static PackageVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PackageVersionEnum) {
                return this.value.equals(((PackageVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_version")

    private PackageVersionEnum packageVersion;

    public ProtectedIpResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 防护IP的Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProtectedIpResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 防护IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ProtectedIpResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。VPN：VPN；NAT：NAT；VIP：VIP；CCI：CCI；EIP：弹性公网IP；ELB：弹性负载均衡；REROUTING_IP：REROUTING_IP；SubEni：SubEni；NetInterFace：NetInterFace；
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ProtectedIpResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProtectedIpResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态：0 - 正常， 1 - 清洗中， 2 - 黑洞中
     * minimum: 0
     * maximum: 2
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ProtectedIpResponse withStatusDetail(IpStatusDetail statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    public ProtectedIpResponse withStatusDetail(Consumer<IpStatusDetail> statusDetailSetter) {
        if (this.statusDetail == null) {
            this.statusDetail = new IpStatusDetail();
            statusDetailSetter.accept(this.statusDetail);
        }

        return this;
    }

    /**
     * Get statusDetail
     * @return statusDetail
     */
    public IpStatusDetail getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(IpStatusDetail statusDetail) {
        this.statusDetail = statusDetail;
    }

    public ProtectedIpResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ProtectedIpResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 所属region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ProtectedIpResponse withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 实例id
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public ProtectedIpResponse withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 实例名
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ProtectedIpResponse withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * TMS标签
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ProtectedIpResponse withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 本地标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ProtectedIpResponse withIsResale(Boolean isResale) {
        this.isResale = isResale;
        return this;
    }

    /**
     * 默认false，表示是否转售版的IP，不需要展示策略和报表
     * @return isResale
     */
    public Boolean getIsResale() {
        return isResale;
    }

    public void setIsResale(Boolean isResale) {
        this.isResale = isResale;
    }

    public ProtectedIpResponse withPackageVersion(PackageVersionEnum packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }

    /**
     * package_version。cnad_pro：专业版；cnad_ip：标准版；cnad_ep：铂金版；cnad_full_high：全力防高级版；cnad_vic：按需版；cnad_intl_ep：国际站铂金版
     * @return packageVersion
     */
    public PackageVersionEnum getPackageVersion() {
        return packageVersion;
    }

    public void setPackageVersion(PackageVersionEnum packageVersion) {
        this.packageVersion = packageVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectedIpResponse that = (ProtectedIpResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusDetail, that.statusDetail)
            && Objects.equals(this.policyName, that.policyName) && Objects.equals(this.region, that.region)
            && Objects.equals(this.packageId, that.packageId) && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.isResale, that.isResale) && Objects.equals(this.packageVersion, that.packageVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            ip,
            type,
            name,
            status,
            statusDetail,
            policyName,
            region,
            packageId,
            packageName,
            tags,
            tag,
            isResale,
            packageVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedIpResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    isResale: ").append(toIndentedString(isResale)).append("\n");
        sb.append("    packageVersion: ").append(toIndentedString(packageVersion)).append("\n");
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
