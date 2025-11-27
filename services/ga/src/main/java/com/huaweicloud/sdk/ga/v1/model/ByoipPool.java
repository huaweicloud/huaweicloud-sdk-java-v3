package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 自带IP地址池。
 */
public class ByoipPool {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    /**
     * IP地址类型。 取值范围：IPV4、IPV6
     */
    public static final class IpTypeEnum {

        /**
         * Enum IPV4 for value: "IPV4"
         */
        public static final IpTypeEnum IPV4 = new IpTypeEnum("IPV4");

        /**
         * Enum IPV6 for value: "IPV6"
         */
        public static final IpTypeEnum IPV6 = new IpTypeEnum("IPV6");

        private static final Map<String, IpTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpTypeEnum> createStaticFields() {
            Map<String, IpTypeEnum> map = new HashMap<>();
            map.put("IPV4", IPV4);
            map.put("IPV6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpTypeEnum(String value) {
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
        public static IpTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpTypeEnum(value));
        }

        public static IpTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpTypeEnum) {
                return this.value.equals(((IpTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private IpTypeEnum ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private Area area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    public ByoipPool withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自带IP地址池ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ByoipPool withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 自带IP地址池的IP网段。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public ByoipPool withIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * IP地址类型。 取值范围：IPV4、IPV6
     * @return ipType
     */
    public IpTypeEnum getIpType() {
        return ipType;
    }

    public void setIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
    }

    public ByoipPool withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ByoipPool withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ByoipPool withArea(Area area) {
        this.area = area;
        return this;
    }

    /**
     * Get area
     * @return area
     */
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public ByoipPool withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByoipPool that = (ByoipPool) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.ipType, that.ipType) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.area, that.area)
            && Objects.equals(this.domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cidr, ipType, createdAt, updatedAt, area, domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ByoipPool {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
