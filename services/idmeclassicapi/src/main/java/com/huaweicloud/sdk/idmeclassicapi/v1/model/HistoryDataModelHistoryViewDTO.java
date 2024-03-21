package com.huaweicloud.sdk.idmeclassicapi.v1.model;

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
 * HistoryDataModelHistoryViewDTO
 */
public class HistoryDataModelHistoryViewDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmVersion")

    private Integer rdmVersion;

    /**
     * 操作类型，用于存储MONGO。
     */
    public static final class RdmOperationTypeEnum {

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final RdmOperationTypeEnum CREATE = new RdmOperationTypeEnum("CREATE");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final RdmOperationTypeEnum UPDATE = new RdmOperationTypeEnum("UPDATE");

        /**
         * Enum LOGICALDELETE for value: "LOGICALDELETE"
         */
        public static final RdmOperationTypeEnum LOGICALDELETE = new RdmOperationTypeEnum("LOGICALDELETE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final RdmOperationTypeEnum DELETE = new RdmOperationTypeEnum("DELETE");

        /**
         * Enum CASCADE for value: "CASCADE"
         */
        public static final RdmOperationTypeEnum CASCADE = new RdmOperationTypeEnum("CASCADE");

        private static final Map<String, RdmOperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RdmOperationTypeEnum> createStaticFields() {
            Map<String, RdmOperationTypeEnum> map = new HashMap<>();
            map.put("CREATE", CREATE);
            map.put("UPDATE", UPDATE);
            map.put("LOGICALDELETE", LOGICALDELETE);
            map.put("DELETE", DELETE);
            map.put("CASCADE", CASCADE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RdmOperationTypeEnum(String value) {
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
        public static RdmOperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RdmOperationTypeEnum(value));
        }

        public static RdmOperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RdmOperationTypeEnum) {
                return this.value.equals(((RdmOperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmOperationType")

    private RdmOperationTypeEnum rdmOperationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmDeleteFlag")

    private Integer rdmDeleteFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private TenantHistoryViewDTO tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "className")

    private String className;

    public HistoryDataModelHistoryViewDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HistoryDataModelHistoryViewDTO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public HistoryDataModelHistoryViewDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public HistoryDataModelHistoryViewDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 修改人。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public HistoryDataModelHistoryViewDTO withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 修改时间。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public HistoryDataModelHistoryViewDTO withRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
        return this;
    }

    /**
     * 系统版本，用于存储MONGO。
     * @return rdmVersion
     */
    public Integer getRdmVersion() {
        return rdmVersion;
    }

    public void setRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
    }

    public HistoryDataModelHistoryViewDTO withRdmOperationType(RdmOperationTypeEnum rdmOperationType) {
        this.rdmOperationType = rdmOperationType;
        return this;
    }

    /**
     * 操作类型，用于存储MONGO。
     * @return rdmOperationType
     */
    public RdmOperationTypeEnum getRdmOperationType() {
        return rdmOperationType;
    }

    public void setRdmOperationType(RdmOperationTypeEnum rdmOperationType) {
        this.rdmOperationType = rdmOperationType;
    }

    public HistoryDataModelHistoryViewDTO withRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
        return this;
    }

    /**
     * 扩展类型。
     * @return rdmExtensionType
     */
    public String getRdmExtensionType() {
        return rdmExtensionType;
    }

    public void setRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
    }

    public HistoryDataModelHistoryViewDTO withRdmDeleteFlag(Integer rdmDeleteFlag) {
        this.rdmDeleteFlag = rdmDeleteFlag;
        return this;
    }

    /**
     * 删除标志。
     * @return rdmDeleteFlag
     */
    public Integer getRdmDeleteFlag() {
        return rdmDeleteFlag;
    }

    public void setRdmDeleteFlag(Integer rdmDeleteFlag) {
        this.rdmDeleteFlag = rdmDeleteFlag;
    }

    public HistoryDataModelHistoryViewDTO withTenant(TenantHistoryViewDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public HistoryDataModelHistoryViewDTO withTenant(Consumer<TenantHistoryViewDTO> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new TenantHistoryViewDTO();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public TenantHistoryViewDTO getTenant() {
        return tenant;
    }

    public void setTenant(TenantHistoryViewDTO tenant) {
        this.tenant = tenant;
    }

    public HistoryDataModelHistoryViewDTO withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * 类名称。
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistoryDataModelHistoryViewDTO that = (HistoryDataModelHistoryViewDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.rdmVersion, that.rdmVersion)
            && Objects.equals(this.rdmOperationType, that.rdmOperationType)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType)
            && Objects.equals(this.rdmDeleteFlag, that.rdmDeleteFlag) && Objects.equals(this.tenant, that.tenant)
            && Objects.equals(this.className, that.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            creator,
            createTime,
            modifier,
            lastUpdateTime,
            rdmVersion,
            rdmOperationType,
            rdmExtensionType,
            rdmDeleteFlag,
            tenant,
            className);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryDataModelHistoryViewDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    rdmVersion: ").append(toIndentedString(rdmVersion)).append("\n");
        sb.append("    rdmOperationType: ").append(toIndentedString(rdmOperationType)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
        sb.append("    rdmDeleteFlag: ").append(toIndentedString(rdmDeleteFlag)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
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
