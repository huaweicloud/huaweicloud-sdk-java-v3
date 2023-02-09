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
 * database
 */
public class Database {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    /**
     * 所有者类型
     */
    public static final class OwnerTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final OwnerTypeEnum USER = new OwnerTypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final OwnerTypeEnum GROUP = new OwnerTypeEnum("GROUP");

        /**
         * Enum ROLE for value: "ROLE"
         */
        public static final OwnerTypeEnum ROLE = new OwnerTypeEnum("ROLE");

        private static final Map<String, OwnerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnerTypeEnum> createStaticFields() {
            Map<String, OwnerTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            map.put("ROLE", ROLE);
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
            OwnerTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OwnerTypeEnum(value);
            }
            return result;
        }

        public static OwnerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OwnerTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public Database withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public Database withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Database withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 数据库所有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Database withOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * 所有者类型
     * @return ownerType
     */
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    public Database withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据库描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Database withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 数据库路径地址
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Database withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Database putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public Database withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 参数信息
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public Database withTableLocationList(List<String> tableLocationList) {
        this.tableLocationList = tableLocationList;
        return this;
    }

    public Database addTableLocationListItem(String tableLocationListItem) {
        if (this.tableLocationList == null) {
            this.tableLocationList = new ArrayList<>();
        }
        this.tableLocationList.add(tableLocationListItem);
        return this;
    }

    public Database withTableLocationList(Consumer<List<String>> tableLocationListSetter) {
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

    public Database withFunctionLocationList(List<String> functionLocationList) {
        this.functionLocationList = functionLocationList;
        return this;
    }

    public Database addFunctionLocationListItem(String functionLocationListItem) {
        if (this.functionLocationList == null) {
            this.functionLocationList = new ArrayList<>();
        }
        this.functionLocationList.add(functionLocationListItem);
        return this;
    }

    public Database withFunctionLocationList(Consumer<List<String>> functionLocationListSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Database database = (Database) o;
        return Objects.equals(this.catalogName, database.catalogName)
            && Objects.equals(this.databaseName, database.databaseName) && Objects.equals(this.owner, database.owner)
            && Objects.equals(this.ownerType, database.ownerType)
            && Objects.equals(this.description, database.description)
            && Objects.equals(this.location, database.location) && Objects.equals(this.parameters, database.parameters)
            && Objects.equals(this.tableLocationList, database.tableLocationList)
            && Objects.equals(this.functionLocationList, database.functionLocationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName,
            databaseName,
            owner,
            ownerType,
            description,
            location,
            parameters,
            tableLocationList,
            functionLocationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Database {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
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
