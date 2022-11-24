package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
public class CreateAgencyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_id")

    private String trustDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_name")

    private String trustDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 委托的期限。取值为“FOREVER\"表示委托的期限为永久，取值为\"ONEDAY\"表示委托的期限为一天。不填写该参数则默认为\"null\"也表示委托的期限为永久。
     */
    public static final class DurationEnum {

        /**
         * Enum FOREVER for value: "FOREVER"
         */
        public static final DurationEnum FOREVER = new DurationEnum("FOREVER");

        /**
         * Enum ONEDAY for value: "ONEDAY"
         */
        public static final DurationEnum ONEDAY = new DurationEnum("ONEDAY");

        private static final Map<String, DurationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DurationEnum> createStaticFields() {
            Map<String, DurationEnum> map = new HashMap<>();
            map.put("FOREVER", FOREVER);
            map.put("ONEDAY", ONEDAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DurationEnum(String value) {
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
        public static DurationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DurationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DurationEnum(value);
            }
            return result;
        }

        public static DurationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DurationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DurationEnum) {
                return this.value.equals(((DurationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private DurationEnum duration;

    public CreateAgencyOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 委托名，长度不大于64位。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAgencyOption withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 委托方账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateAgencyOption withTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
        return this;
    }

    /**
     * 被委托方账号ID。trust_domain_id和trust_domain_name至少填写一个，若都填写优先校验trust_domain_name。
     * @return trustDomainId
     */
    public String getTrustDomainId() {
        return trustDomainId;
    }

    public void setTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
    }

    public CreateAgencyOption withTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
        return this;
    }

    /**
     * 被委托方账号名。trust_domain_id和trust_domain_name至少填写一个，若都填写优先校验trust_domain_name。
     * @return trustDomainName
     */
    public String getTrustDomainName() {
        return trustDomainName;
    }

    public void setTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
    }

    public CreateAgencyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 委托描述信息，长度不大于255位。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAgencyOption withDuration(DurationEnum duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 委托的期限。取值为“FOREVER\"表示委托的期限为永久，取值为\"ONEDAY\"表示委托的期限为一天。不填写该参数则默认为\"null\"也表示委托的期限为永久。
     * @return duration
     */
    public DurationEnum getDuration() {
        return duration;
    }

    public void setDuration(DurationEnum duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAgencyOption createAgencyOption = (CreateAgencyOption) o;
        return Objects.equals(this.name, createAgencyOption.name)
            && Objects.equals(this.domainId, createAgencyOption.domainId)
            && Objects.equals(this.trustDomainId, createAgencyOption.trustDomainId)
            && Objects.equals(this.trustDomainName, createAgencyOption.trustDomainName)
            && Objects.equals(this.description, createAgencyOption.description)
            && Objects.equals(this.duration, createAgencyOption.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, domainId, trustDomainId, trustDomainName, description, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    trustDomainId: ").append(toIndentedString(trustDomainId)).append("\n");
        sb.append("    trustDomainName: ").append(toIndentedString(trustDomainName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
