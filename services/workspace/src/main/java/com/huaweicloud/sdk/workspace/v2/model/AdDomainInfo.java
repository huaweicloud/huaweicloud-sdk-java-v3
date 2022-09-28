package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 域信息。
 */
public class AdDomainInfo {

    /**
     * 域类型。 - LITE_AS：LiteAS。 - LOCAL_AD：本地AD。  说明：域类型为“LOCAL_AD”时，请确保所选VPC网络与“LOCAL_AD”所属网络可连通。
     */
    public static final class DomainTypeEnum {

        /**
         * Enum LITE_AS for value: "LITE_AS"
         */
        public static final DomainTypeEnum LITE_AS = new DomainTypeEnum("LITE_AS");

        /**
         * Enum LOCAL_AD for value: "LOCAL_AD"
         */
        public static final DomainTypeEnum LOCAL_AD = new DomainTypeEnum("LOCAL_AD");

        private static final Map<String, DomainTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainTypeEnum> createStaticFields() {
            Map<String, DomainTypeEnum> map = new HashMap<>();
            map.put("LITE_AS", LITE_AS);
            map.put("LOCAL_AD", LOCAL_AD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainTypeEnum(String value) {
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
        public static DomainTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DomainTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DomainTypeEnum(value);
            }
            return result;
        }

        public static DomainTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DomainTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainTypeEnum) {
                return this.value.equals(((DomainTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private DomainTypeEnum domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_admin_account")

    private String domainAdminAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_password")

    private String domainPassword;

    public AdDomainInfo withDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * 域类型。 - LITE_AS：LiteAS。 - LOCAL_AD：本地AD。  说明：域类型为“LOCAL_AD”时，请确保所选VPC网络与“LOCAL_AD”所属网络可连通。
     * @return domainType
     */
    public DomainTypeEnum getDomainType() {
        return domainType;
    }

    public void setDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
    }

    public AdDomainInfo withDomainAdminAccount(String domainAdminAccount) {
        this.domainAdminAccount = domainAdminAccount;
        return this;
    }

    /**
     * 域管理员帐号。
     * @return domainAdminAccount
     */
    public String getDomainAdminAccount() {
        return domainAdminAccount;
    }

    public void setDomainAdminAccount(String domainAdminAccount) {
        this.domainAdminAccount = domainAdminAccount;
    }

    public AdDomainInfo withDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }

    /**
     * 域管理员账号密码。
     * @return domainPassword
     */
    public String getDomainPassword() {
        return domainPassword;
    }

    public void setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdDomainInfo adDomainInfo = (AdDomainInfo) o;
        return Objects.equals(this.domainType, adDomainInfo.domainType)
            && Objects.equals(this.domainAdminAccount, adDomainInfo.domainAdminAccount)
            && Objects.equals(this.domainPassword, adDomainInfo.domainPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainType, domainAdminAccount, domainPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdDomainInfo {\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    domainAdminAccount: ").append(toIndentedString(domainAdminAccount)).append("\n");
        sb.append("    domainPassword: ").append(toIndentedString(domainPassword)).append("\n");
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
