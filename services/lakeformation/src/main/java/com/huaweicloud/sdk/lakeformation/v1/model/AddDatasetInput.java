package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * 用户输入的数据集
 */
public class AddDatasetInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_name")

    private String datasetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 数据集存储类型：EXTERNAL-外置存储,MANAGED-系统托管存储 EXTERNAL类型的数据集不支持创建文件分组和文件元数据。
     */
    public static final class StorageTypeEnum {

        /**
         * Enum EXTERNAL for value: "EXTERNAL"
         */
        public static final StorageTypeEnum EXTERNAL = new StorageTypeEnum("EXTERNAL");

        /**
         * Enum MANAGED for value: "MANAGED"
         */
        public static final StorageTypeEnum MANAGED = new StorageTypeEnum("MANAGED");

        private static final Map<String, StorageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageTypeEnum> createStaticFields() {
            Map<String, StorageTypeEnum> map = new HashMap<>();
            map.put("EXTERNAL", EXTERNAL);
            map.put("MANAGED", MANAGED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageTypeEnum(String value) {
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
        public static StorageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageTypeEnum(value));
        }

        public static StorageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageTypeEnum) {
                return this.value.equals(((StorageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private StorageTypeEnum storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_format")

    private DatasetFileFormat datasetFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    /**
     * 所有者类型,USER-用户,GROUP-组,ROLE-角色。LakeFormation服务一期实例响应Body无该参数。
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
     * 所有者来源,IAM-云用户,SAML-联邦,LDAP-ld用户,LOCAL-本地用户,AGENTTENANT-委托,OTHER-其它。LakeFormation服务一期实例响应Body无该参数。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, String> properties = null;

    public AddDatasetInput withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * 数据集名称
     * @return datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public AddDatasetInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据集的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddDatasetInput withStorageType(StorageTypeEnum storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 数据集存储类型：EXTERNAL-外置存储,MANAGED-系统托管存储 EXTERNAL类型的数据集不支持创建文件分组和文件元数据。
     * @return storageType
     */
    public StorageTypeEnum getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageTypeEnum storageType) {
        this.storageType = storageType;
    }

    public AddDatasetInput withDatasetFormat(DatasetFileFormat datasetFormat) {
        this.datasetFormat = datasetFormat;
        return this;
    }

    public AddDatasetInput withDatasetFormat(Consumer<DatasetFileFormat> datasetFormatSetter) {
        if (this.datasetFormat == null) {
            this.datasetFormat = new DatasetFileFormat();
            datasetFormatSetter.accept(this.datasetFormat);
        }

        return this;
    }

    /**
     * Get datasetFormat
     * @return datasetFormat
     */
    public DatasetFileFormat getDatasetFormat() {
        return datasetFormat;
    }

    public void setDatasetFormat(DatasetFileFormat datasetFormat) {
        this.datasetFormat = datasetFormat;
    }

    public AddDatasetInput withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Dataset所有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public AddDatasetInput withOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * 所有者类型,USER-用户,GROUP-组,ROLE-角色。LakeFormation服务一期实例响应Body无该参数。
     * @return ownerType
     */
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    public AddDatasetInput withOwnerSource(OwnerSourceEnum ownerSource) {
        this.ownerSource = ownerSource;
        return this;
    }

    /**
     * 所有者来源,IAM-云用户,SAML-联邦,LDAP-ld用户,LOCAL-本地用户,AGENTTENANT-委托,OTHER-其它。LakeFormation服务一期实例响应Body无该参数。
     * @return ownerSource
     */
    public OwnerSourceEnum getOwnerSource() {
        return ownerSource;
    }

    public void setOwnerSource(OwnerSourceEnum ownerSource) {
        this.ownerSource = ownerSource;
    }

    public AddDatasetInput withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 外置存储类型的元数据存储位置
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public AddDatasetInput withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public AddDatasetInput putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public AddDatasetInput withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 数据集其他属性
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDatasetInput that = (AddDatasetInput) obj;
        return Objects.equals(this.datasetName, that.datasetName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.datasetFormat, that.datasetFormat) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.ownerType, that.ownerType) && Objects.equals(this.ownerSource, that.ownerSource)
            && Objects.equals(this.location, that.location) && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasetName,
            description,
            storageType,
            datasetFormat,
            owner,
            ownerType,
            ownerSource,
            location,
            properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDatasetInput {\n");
        sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    datasetFormat: ").append(toIndentedString(datasetFormat)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    ownerSource: ").append(toIndentedString(ownerSource)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
