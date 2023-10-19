package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * 数据库信息
 */
public class DatabaseInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

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
    public static final class OwnerAuthSourceTypeEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final OwnerAuthSourceTypeEnum IAM = new OwnerAuthSourceTypeEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final OwnerAuthSourceTypeEnum SAML = new OwnerAuthSourceTypeEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final OwnerAuthSourceTypeEnum LDAP = new OwnerAuthSourceTypeEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final OwnerAuthSourceTypeEnum LOCAL = new OwnerAuthSourceTypeEnum("LOCAL");

        /**
         * Enum AGENTTENANT for value: "AGENTTENANT"
         */
        public static final OwnerAuthSourceTypeEnum AGENTTENANT = new OwnerAuthSourceTypeEnum("AGENTTENANT");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final OwnerAuthSourceTypeEnum OTHER = new OwnerAuthSourceTypeEnum("OTHER");

        private static final Map<String, OwnerAuthSourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnerAuthSourceTypeEnum> createStaticFields() {
            Map<String, OwnerAuthSourceTypeEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            map.put("AGENTTENANT", AGENTTENANT);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnerAuthSourceTypeEnum(String value) {
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
        public static OwnerAuthSourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OwnerAuthSourceTypeEnum(value));
        }

        public static OwnerAuthSourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnerAuthSourceTypeEnum) {
                return this.value.equals(((OwnerAuthSourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_auth_source_type")

    private OwnerAuthSourceTypeEnum ownerAuthSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_location_list")

    private List<String> tableLocationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_location_list")

    private List<String> functionLocationList = null;

    public DatabaseInput withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称。只能包含中文、字母、数字和下划线，且长度为1~128个字符。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DatabaseInput withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 数据库所有者。长度为0~128个字符。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public DatabaseInput withOwnerType(OwnerTypeEnum ownerType) {
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

    public DatabaseInput withOwnerAuthSourceType(OwnerAuthSourceTypeEnum ownerAuthSourceType) {
        this.ownerAuthSourceType = ownerAuthSourceType;
        return this;
    }

    /**
     * 所有者来源,IAM-云用户,SAML-联邦,LDAP-ld用户,LOCAL-本地用户,AGENTTENANT-委托,OTHER-其它。LakeFormation服务分为一期和二期，一期响应Body无该参数。
     * @return ownerAuthSourceType
     */
    public OwnerAuthSourceTypeEnum getOwnerAuthSourceType() {
        return ownerAuthSourceType;
    }

    public void setOwnerAuthSourceType(OwnerAuthSourceTypeEnum ownerAuthSourceType) {
        this.ownerAuthSourceType = ownerAuthSourceType;
    }

    public DatabaseInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据库描述信息。由用户创建数据库时输入，最大长度为4000个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DatabaseInput withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 数据库路径地址。例如obs://location/uri/
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DatabaseInput withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public DatabaseInput putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public DatabaseInput withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 标签信息
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public DatabaseInput withTableLocationList(List<String> tableLocationList) {
        this.tableLocationList = tableLocationList;
        return this;
    }

    public DatabaseInput addTableLocationListItem(String tableLocationListItem) {
        if (this.tableLocationList == null) {
            this.tableLocationList = new ArrayList<>();
        }
        this.tableLocationList.add(tableLocationListItem);
        return this;
    }

    public DatabaseInput withTableLocationList(Consumer<List<String>> tableLocationListSetter) {
        if (this.tableLocationList == null) {
            this.tableLocationList = new ArrayList<>();
        }
        tableLocationListSetter.accept(this.tableLocationList);
        return this;
    }

    /**
     * 表路径列表
     * @return tableLocationList
     */
    public List<String> getTableLocationList() {
        return tableLocationList;
    }

    public void setTableLocationList(List<String> tableLocationList) {
        this.tableLocationList = tableLocationList;
    }

    public DatabaseInput withFunctionLocationList(List<String> functionLocationList) {
        this.functionLocationList = functionLocationList;
        return this;
    }

    public DatabaseInput addFunctionLocationListItem(String functionLocationListItem) {
        if (this.functionLocationList == null) {
            this.functionLocationList = new ArrayList<>();
        }
        this.functionLocationList.add(functionLocationListItem);
        return this;
    }

    public DatabaseInput withFunctionLocationList(Consumer<List<String>> functionLocationListSetter) {
        if (this.functionLocationList == null) {
            this.functionLocationList = new ArrayList<>();
        }
        functionLocationListSetter.accept(this.functionLocationList);
        return this;
    }

    /**
     * 函数路径列表
     * @return functionLocationList
     */
    public List<String> getFunctionLocationList() {
        return functionLocationList;
    }

    public void setFunctionLocationList(List<String> functionLocationList) {
        this.functionLocationList = functionLocationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseInput that = (DatabaseInput) obj;
        return Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.ownerType, that.ownerType)
            && Objects.equals(this.ownerAuthSourceType, that.ownerAuthSourceType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.location, that.location)
            && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.tableLocationList, that.tableLocationList)
            && Objects.equals(this.functionLocationList, that.functionLocationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName,
            owner,
            ownerType,
            ownerAuthSourceType,
            description,
            location,
            parameters,
            tableLocationList,
            functionLocationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseInput {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    ownerAuthSourceType: ").append(toIndentedString(ownerAuthSourceType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    tableLocationList: ").append(toIndentedString(tableLocationList)).append("\n");
        sb.append("    functionLocationList: ").append(toIndentedString(functionLocationList)).append("\n");
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
