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
 * Request Object
 */
public class ListExternalVaultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_project_id")

    private String externalProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * [保护类型。取值为backup，replication和hybrid。](tag:hws,hws_hk) [保护类型。取值为backup和replication。](tag:ocb) [保护类型。取值为backup。](tag:g42,hk-g42,sbc,dt,fcs_vm,ctc,tm,tlf,cmcc,hcso_dt)
     */
    public static final class ProtectTypeEnum {

        /**
         * Enum BACKUP_REPLICATION_HYBRID for value: "backup;replication;hybrid"
         */
        public static final ProtectTypeEnum BACKUP_REPLICATION_HYBRID =
            new ProtectTypeEnum("backup;replication;hybrid");

        private static final Map<String, ProtectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectTypeEnum> createStaticFields() {
            Map<String, ProtectTypeEnum> map = new HashMap<>();
            map.put("backup;replication;hybrid", BACKUP_REPLICATION_HYBRID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectTypeEnum(String value) {
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
        public static ProtectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectTypeEnum(value));
        }

        public static ProtectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectTypeEnum) {
                return this.value.equals(((ProtectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private ProtectTypeEnum protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objcet_type")

    private String objcetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public ListExternalVaultRequest withExternalProjectId(String externalProjectId) {
        this.externalProjectId = externalProjectId;
        return this;
    }

    /**
     * 其他区域的项目ID
     * @return externalProjectId
     */
    public String getExternalProjectId() {
        return externalProjectId;
    }

    public void setExternalProjectId(String externalProjectId) {
        this.externalProjectId = externalProjectId;
    }

    public ListExternalVaultRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示条目数
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListExternalVaultRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移值
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListExternalVaultRequest withProtectType(ProtectTypeEnum protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * [保护类型。取值为backup，replication和hybrid。](tag:hws,hws_hk) [保护类型。取值为backup和replication。](tag:ocb) [保护类型。取值为backup。](tag:g42,hk-g42,sbc,dt,fcs_vm,ctc,tm,tlf,cmcc,hcso_dt)
     * @return protectType
     */
    public ProtectTypeEnum getProtectType() {
        return protectType;
    }

    public void setProtectType(ProtectTypeEnum protectType) {
        this.protectType = protectType;
    }

    public ListExternalVaultRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListExternalVaultRequest withObjcetType(String objcetType) {
        this.objcetType = objcetType;
        return this;
    }

    /**
     * 资源类型
     * @return objcetType
     */
    public String getObjcetType() {
        return objcetType;
    }

    public void setObjcetType(String objcetType) {
        this.objcetType = objcetType;
    }

    public ListExternalVaultRequest withCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * [云类型。取值为public和hybrid。](tag:hws,hws_hk) [云类型。取值为public。](tag:g42,hk-g42,sbc,dt,fcs_vm,ctc,ocb,tm,tlf,cmcc,hcso_dt)
     * @return cloudType
     */
    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public ListExternalVaultRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 存储库ID，指定存储ID时其他过滤条件不生效。
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExternalVaultRequest that = (ListExternalVaultRequest) obj;
        return Objects.equals(this.externalProjectId, that.externalProjectId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.protectType, that.protectType)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.objcetType, that.objcetType)
            && Objects.equals(this.cloudType, that.cloudType) && Objects.equals(this.vaultId, that.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalProjectId, limit, offset, protectType, regionId, objcetType, cloudType, vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExternalVaultRequest {\n");
        sb.append("    externalProjectId: ").append(toIndentedString(externalProjectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    objcetType: ").append(toIndentedString(objcetType)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
