package com.huaweicloud.sdk.rds.v3.model;

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
 * 创建Supabase应用请求体。
 */
public class CreateSupabaseApplicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_config")

    private SupabaseAppBasicConfig basicConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * 部署模式。
     */
    public static final class ModeEnum {

        /**
         * Enum SINGLE for value: "Single"
         */
        public static final ModeEnum SINGLE = new ModeEnum("Single");

        /**
         * Enum HA for value: "Ha"
         */
        public static final ModeEnum HA = new ModeEnum("Ha");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Single", SINGLE);
            map.put("Ha", HA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_component")

    private SupabaseStorageComponentConfig storageComponent;

    /**
     * 实例纳管方式。默认newly_instance。
     */
    public static final class ManageTypeEnum {

        /**
         * Enum NEWLY_INSTANCE for value: "newly_instance"
         */
        public static final ManageTypeEnum NEWLY_INSTANCE = new ManageTypeEnum("newly_instance");

        /**
         * Enum EXISTED_INSTANCE for value: "existed_instance"
         */
        public static final ManageTypeEnum EXISTED_INSTANCE = new ManageTypeEnum("existed_instance");

        private static final Map<String, ManageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ManageTypeEnum> createStaticFields() {
            Map<String, ManageTypeEnum> map = new HashMap<>();
            map.put("newly_instance", NEWLY_INSTANCE);
            map.put("existed_instance", EXISTED_INSTANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ManageTypeEnum(String value) {
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
        public static ManageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ManageTypeEnum(value));
        }

        public static ManageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ManageTypeEnum) {
                return this.value.equals(((ManageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_type")

    private ManageTypeEnum manageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_instance")

    private SupabaseInstanceCreateRequest managedInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existing_instance")

    private SupabaseExistingInstanceRequest existingInstance;

    public CreateSupabaseApplicationRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Supabase应用名称，4~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSupabaseApplicationRequestBody withBasicConfig(SupabaseAppBasicConfig basicConfig) {
        this.basicConfig = basicConfig;
        return this;
    }

    public CreateSupabaseApplicationRequestBody withBasicConfig(Consumer<SupabaseAppBasicConfig> basicConfigSetter) {
        if (this.basicConfig == null) {
            this.basicConfig = new SupabaseAppBasicConfig();
            basicConfigSetter.accept(this.basicConfig);
        }

        return this;
    }

    /**
     * Get basicConfig
     * @return basicConfig
     */
    public SupabaseAppBasicConfig getBasicConfig() {
        return basicConfig;
    }

    public void setBasicConfig(SupabaseAppBasicConfig basicConfig) {
        this.basicConfig = basicConfig;
    }

    public CreateSupabaseApplicationRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Supabase版本号，格式 x.y.z。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateSupabaseApplicationRequestBody withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 部署模式。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public CreateSupabaseApplicationRequestBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格码，格式 rds.supabase.{...}。Ha模式必须以.ha结尾，Single不得以.ha结尾。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateSupabaseApplicationRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区ID。Single=1个，Ha=2个逗号分隔。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateSupabaseApplicationRequestBody withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    /**
     * 指定实例内网IP（可选）。IPv4格式。
     * @return dataVip
     */
    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public CreateSupabaseApplicationRequestBody withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 指定实例所属安全组（可选）。UUID格式。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateSupabaseApplicationRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 默认用户supabase的密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateSupabaseApplicationRequestBody withStorageComponent(SupabaseStorageComponentConfig storageComponent) {
        this.storageComponent = storageComponent;
        return this;
    }

    public CreateSupabaseApplicationRequestBody withStorageComponent(
        Consumer<SupabaseStorageComponentConfig> storageComponentSetter) {
        if (this.storageComponent == null) {
            this.storageComponent = new SupabaseStorageComponentConfig();
            storageComponentSetter.accept(this.storageComponent);
        }

        return this;
    }

    /**
     * Get storageComponent
     * @return storageComponent
     */
    public SupabaseStorageComponentConfig getStorageComponent() {
        return storageComponent;
    }

    public void setStorageComponent(SupabaseStorageComponentConfig storageComponent) {
        this.storageComponent = storageComponent;
    }

    public CreateSupabaseApplicationRequestBody withManageType(ManageTypeEnum manageType) {
        this.manageType = manageType;
        return this;
    }

    /**
     * 实例纳管方式。默认newly_instance。
     * @return manageType
     */
    public ManageTypeEnum getManageType() {
        return manageType;
    }

    public void setManageType(ManageTypeEnum manageType) {
        this.manageType = manageType;
    }

    public CreateSupabaseApplicationRequestBody withManagedInstance(SupabaseInstanceCreateRequest managedInstance) {
        this.managedInstance = managedInstance;
        return this;
    }

    public CreateSupabaseApplicationRequestBody withManagedInstance(
        Consumer<SupabaseInstanceCreateRequest> managedInstanceSetter) {
        if (this.managedInstance == null) {
            this.managedInstance = new SupabaseInstanceCreateRequest();
            managedInstanceSetter.accept(this.managedInstance);
        }

        return this;
    }

    /**
     * Get managedInstance
     * @return managedInstance
     */
    public SupabaseInstanceCreateRequest getManagedInstance() {
        return managedInstance;
    }

    public void setManagedInstance(SupabaseInstanceCreateRequest managedInstance) {
        this.managedInstance = managedInstance;
    }

    public CreateSupabaseApplicationRequestBody withExistingInstance(SupabaseExistingInstanceRequest existingInstance) {
        this.existingInstance = existingInstance;
        return this;
    }

    public CreateSupabaseApplicationRequestBody withExistingInstance(
        Consumer<SupabaseExistingInstanceRequest> existingInstanceSetter) {
        if (this.existingInstance == null) {
            this.existingInstance = new SupabaseExistingInstanceRequest();
            existingInstanceSetter.accept(this.existingInstance);
        }

        return this;
    }

    /**
     * Get existingInstance
     * @return existingInstance
     */
    public SupabaseExistingInstanceRequest getExistingInstance() {
        return existingInstance;
    }

    public void setExistingInstance(SupabaseExistingInstanceRequest existingInstance) {
        this.existingInstance = existingInstance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSupabaseApplicationRequestBody that = (CreateSupabaseApplicationRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.basicConfig, that.basicConfig)
            && Objects.equals(this.version, that.version) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.dataVip, that.dataVip) && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.password, that.password)
            && Objects.equals(this.storageComponent, that.storageComponent)
            && Objects.equals(this.manageType, that.manageType)
            && Objects.equals(this.managedInstance, that.managedInstance)
            && Objects.equals(this.existingInstance, that.existingInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            basicConfig,
            version,
            mode,
            flavorRef,
            availabilityZone,
            dataVip,
            securityGroupId,
            password,
            storageComponent,
            manageType,
            managedInstance,
            existingInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSupabaseApplicationRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    basicConfig: ").append(toIndentedString(basicConfig)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    storageComponent: ").append(toIndentedString(storageComponent)).append("\n");
        sb.append("    manageType: ").append(toIndentedString(manageType)).append("\n");
        sb.append("    managedInstance: ").append(toIndentedString(managedInstance)).append("\n");
        sb.append("    existingInstance: ").append(toIndentedString(existingInstance)).append("\n");
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
