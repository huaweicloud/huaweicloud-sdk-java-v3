package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CbcProductInfoOrderChange
 */
public class CbcProductInfoOrderChange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size_measure_id")

    private Integer resourceSizeMeasureId;

    /**
     * 用户购买云服务产品的资源规格 Enum: [vault.backup.server.normal，vault.backup.turbo.normal, vault.backup.database.normal，vault.backup.volume.normal，vault.backup.rds.normal，vault.replication.server.normal，vault.hybrid.server.normal]
     */
    public static final class ResourceSpecCodeEnum {

        /**
         * Enum VAULT_BACKUP_SERVER_NORMAL for value: "vault.backup.server.normal"
         */
        public static final ResourceSpecCodeEnum VAULT_BACKUP_SERVER_NORMAL =
            new ResourceSpecCodeEnum("vault.backup.server.normal");

        /**
         * Enum VAULT_BACKUP_TURBO_NORMAL for value: "vault.backup.turbo.normal"
         */
        public static final ResourceSpecCodeEnum VAULT_BACKUP_TURBO_NORMAL =
            new ResourceSpecCodeEnum("vault.backup.turbo.normal");

        /**
         * Enum VAULT_BACKUP_DATABASE_NORMAL for value: "vault.backup.database.normal"
         */
        public static final ResourceSpecCodeEnum VAULT_BACKUP_DATABASE_NORMAL =
            new ResourceSpecCodeEnum("vault.backup.database.normal");

        /**
         * Enum VAULT_BACKUP_VOLUME_NORMAL for value: "vault.backup.volume.normal"
         */
        public static final ResourceSpecCodeEnum VAULT_BACKUP_VOLUME_NORMAL =
            new ResourceSpecCodeEnum("vault.backup.volume.normal");

        /**
         * Enum VAULT_BACKUP_RDS_NORMAL for value: "vault.backup.rds.normal"
         */
        public static final ResourceSpecCodeEnum VAULT_BACKUP_RDS_NORMAL =
            new ResourceSpecCodeEnum("vault.backup.rds.normal");

        /**
         * Enum VAULT_REPLICATION_SERVER_NORMAL for value: "vault.replication.server.normal"
         */
        public static final ResourceSpecCodeEnum VAULT_REPLICATION_SERVER_NORMAL =
            new ResourceSpecCodeEnum("vault.replication.server.normal");

        /**
         * Enum VAULT_HYBRID_SERVER_NORMAL for value: "vault.hybrid.server.normal"
         */
        public static final ResourceSpecCodeEnum VAULT_HYBRID_SERVER_NORMAL =
            new ResourceSpecCodeEnum("vault.hybrid.server.normal");

        private static final Map<String, ResourceSpecCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceSpecCodeEnum> createStaticFields() {
            Map<String, ResourceSpecCodeEnum> map = new HashMap<>();
            map.put("vault.backup.server.normal", VAULT_BACKUP_SERVER_NORMAL);
            map.put("vault.backup.turbo.normal", VAULT_BACKUP_TURBO_NORMAL);
            map.put("vault.backup.database.normal", VAULT_BACKUP_DATABASE_NORMAL);
            map.put("vault.backup.volume.normal", VAULT_BACKUP_VOLUME_NORMAL);
            map.put("vault.backup.rds.normal", VAULT_BACKUP_RDS_NORMAL);
            map.put("vault.replication.server.normal", VAULT_REPLICATION_SERVER_NORMAL);
            map.put("vault.hybrid.server.normal", VAULT_HYBRID_SERVER_NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceSpecCodeEnum(String value) {
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
        public static ResourceSpecCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceSpecCodeEnum(value));
        }

        public static ResourceSpecCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceSpecCodeEnum) {
                return this.value.equals(((ResourceSpecCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private ResourceSpecCodeEnum resourceSpecCode;

    public CbcProductInfoOrderChange withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品标识，通过订购询价接口获得，长度限制：1-64，只能由字母、数字、“_”、“-”组成。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CbcProductInfoOrderChange withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 资源容量大小，取值范围：10-10485760
     * minimum: 10
     * maximum: 10485760
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public CbcProductInfoOrderChange withResourceSizeMeasureId(Integer resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
        return this;
    }

    /**
     * 资源容量度量标识，枚举值17：GB
     * @return resourceSizeMeasureId
     */
    public Integer getResourceSizeMeasureId() {
        return resourceSizeMeasureId;
    }

    public void setResourceSizeMeasureId(Integer resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
    }

    public CbcProductInfoOrderChange withResourceSpecCode(ResourceSpecCodeEnum resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 用户购买云服务产品的资源规格 Enum: [vault.backup.server.normal，vault.backup.turbo.normal, vault.backup.database.normal，vault.backup.volume.normal，vault.backup.rds.normal，vault.replication.server.normal，vault.hybrid.server.normal]
     * @return resourceSpecCode
     */
    public ResourceSpecCodeEnum getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(ResourceSpecCodeEnum resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CbcProductInfoOrderChange that = (CbcProductInfoOrderChange) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.resourceSize, that.resourceSize)
            && Objects.equals(this.resourceSizeMeasureId, that.resourceSizeMeasureId)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, resourceSize, resourceSizeMeasureId, resourceSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbcProductInfoOrderChange {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    resourceSizeMeasureId: ").append(toIndentedString(resourceSizeMeasureId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
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
