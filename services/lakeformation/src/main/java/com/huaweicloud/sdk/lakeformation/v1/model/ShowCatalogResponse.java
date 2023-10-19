package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

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
public class ShowCatalogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_location_list")

    private List<String> databaseLocationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    /**
     * 所有者类型,USER-用户,GROUP-组,ROLE-角色。LakeFormation服务分为一期和二期，一期响应Body无该参数。
     */
    public static final class OwnerTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final OwnerTypeEnum USER = new OwnerTypeEnum("USER");

        /**
         * Enum ROLE for value: "ROLE"
         */
        public static final OwnerTypeEnum ROLE = new OwnerTypeEnum("ROLE");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final OwnerTypeEnum GROUP = new OwnerTypeEnum("GROUP");

        private static final Map<String, OwnerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnerTypeEnum> createStaticFields() {
            Map<String, OwnerTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("ROLE", ROLE);
            map.put("GROUP", GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnerTypeEnum(String value) {
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
        public static OwnerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OwnerTypeEnum(value));
        }

        public static OwnerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnerTypeEnum) {
                return this.value.equals(((OwnerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private OwnerTypeEnum ownerType;

    /**
     * 所有者来源,IAM-云用户,SAML-联邦,LDAP-ld用户,LOCAL-本地用户,AGENTTENANT-委托,OTHER-其它。LakeFormation服务分为一期和二期，一期响应Body无该参数。
     */
    public static final class OwnerSourceEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final OwnerSourceEnum IAM = new OwnerSourceEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final OwnerSourceEnum SAML = new OwnerSourceEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final OwnerSourceEnum LDAP = new OwnerSourceEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final OwnerSourceEnum LOCAL = new OwnerSourceEnum("LOCAL");

        /**
         * Enum AGENTTENANT for value: "AGENTTENANT"
         */
        public static final OwnerSourceEnum AGENTTENANT = new OwnerSourceEnum("AGENTTENANT");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final OwnerSourceEnum OTHER = new OwnerSourceEnum("OTHER");

        private static final Map<String, OwnerSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnerSourceEnum> createStaticFields() {
            Map<String, OwnerSourceEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            map.put("AGENTTENANT", AGENTTENANT);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnerSourceEnum(String value) {
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
        public static OwnerSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OwnerSourceEnum(value));
        }

        public static OwnerSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnerSourceEnum) {
                return this.value.equals(((OwnerSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_source")

    private OwnerSourceEnum ownerSource;

    public ShowCatalogResponse withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名称
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public ShowCatalogResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCatalogResponse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 路径地址。例如obs://location/uri/
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ShowCatalogResponse withDatabaseLocationList(List<String> databaseLocationList) {
        this.databaseLocationList = databaseLocationList;
        return this;
    }

    public ShowCatalogResponse addDatabaseLocationListItem(String databaseLocationListItem) {
        if (this.databaseLocationList == null) {
            this.databaseLocationList = new ArrayList<>();
        }
        this.databaseLocationList.add(databaseLocationListItem);
        return this;
    }

    public ShowCatalogResponse withDatabaseLocationList(Consumer<List<String>> databaseLocationListSetter) {
        if (this.databaseLocationList == null) {
            this.databaseLocationList = new ArrayList<>();
        }
        databaseLocationListSetter.accept(this.databaseLocationList);
        return this;
    }

    /**
     * 数据库路径列表。当值为null时，响应Body无该参数。
     * @return databaseLocationList
     */
    public List<String> getDatabaseLocationList() {
        return databaseLocationList;
    }

    public void setDatabaseLocationList(List<String> databaseLocationList) {
        this.databaseLocationList = databaseLocationList;
    }

    public ShowCatalogResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * catalog所有者。LakeFormation服务分为一期和二期，一期响应Body无该参数。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowCatalogResponse withOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * 所有者类型,USER-用户,GROUP-组,ROLE-角色。LakeFormation服务分为一期和二期，一期响应Body无该参数。
     * @return ownerType
     */
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    public ShowCatalogResponse withOwnerSource(OwnerSourceEnum ownerSource) {
        this.ownerSource = ownerSource;
        return this;
    }

    /**
     * 所有者来源,IAM-云用户,SAML-联邦,LDAP-ld用户,LOCAL-本地用户,AGENTTENANT-委托,OTHER-其它。LakeFormation服务分为一期和二期，一期响应Body无该参数。
     * @return ownerSource
     */
    public OwnerSourceEnum getOwnerSource() {
        return ownerSource;
    }

    public void setOwnerSource(OwnerSourceEnum ownerSource) {
        this.ownerSource = ownerSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCatalogResponse that = (ShowCatalogResponse) obj;
        return Objects.equals(this.catalogName, that.catalogName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.location, that.location)
            && Objects.equals(this.databaseLocationList, that.databaseLocationList)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.ownerType, that.ownerType)
            && Objects.equals(this.ownerSource, that.ownerSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName, description, location, databaseLocationList, owner, ownerType, ownerSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCatalogResponse {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    databaseLocationList: ").append(toIndentedString(databaseLocationList)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    ownerSource: ").append(toIndentedString(ownerSource)).append("\n");
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
