package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建保护组请求体结构
 */
public class CreateProtectionGroupRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_availability_zone")

    private String sourceAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_availability_zone")

    private String targetAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_vpc_id")

    private String sourceVpcId;

    /**
     * 部署模式。默认值为“migration”，migration表示VPC内迁移。
     */
    public static final class DrTypeEnum {

        /**
         * Enum MIGRATION for value: "migration"
         */
        public static final DrTypeEnum MIGRATION = new DrTypeEnum("migration");

        private static final Map<String, DrTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DrTypeEnum> createStaticFields() {
            Map<String, DrTypeEnum> map = new HashMap<>();
            map.put("migration", MIGRATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DrTypeEnum(String value) {
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
        public static DrTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DrTypeEnum(value));
        }

        public static DrTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DrTypeEnum) {
                return this.value.equals(((DrTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_type")

    private DrTypeEnum drType;

    public CreateProtectionGroupRequestParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指定保护组的名称，最大支持长度为64个字节。只包含中文字符、英文字母（a～ｚ、Ａ～Ｚ）、数字（０~９）、小数点（．）、下划线（_）、中划线（-）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateProtectionGroupRequestParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 指定保护组的描述，最大支持长度为64个字节。不能包含左尖括号（<）或右尖括号（>）。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateProtectionGroupRequestParams withSourceAvailabilityZone(String sourceAvailabilityZone) {
        this.sourceAvailabilityZone = sourceAvailabilityZone;
        return this;
    }

    /**
     * 指定保护组的生产站点可用区名称。
     * @return sourceAvailabilityZone
     */
    public String getSourceAvailabilityZone() {
        return sourceAvailabilityZone;
    }

    public void setSourceAvailabilityZone(String sourceAvailabilityZone) {
        this.sourceAvailabilityZone = sourceAvailabilityZone;
    }

    public CreateProtectionGroupRequestParams withTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
        return this;
    }

    /**
     * 指定保护组的容灾站点可用区名称。
     * @return targetAvailabilityZone
     */
    public String getTargetAvailabilityZone() {
        return targetAvailabilityZone;
    }

    public void setTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
    }

    public CreateProtectionGroupRequestParams withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 指定双活域的ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateProtectionGroupRequestParams withSourceVpcId(String sourceVpcId) {
        this.sourceVpcId = sourceVpcId;
        return this;
    }

    /**
     * 生产站点虚拟私有云ID。
     * @return sourceVpcId
     */
    public String getSourceVpcId() {
        return sourceVpcId;
    }

    public void setSourceVpcId(String sourceVpcId) {
        this.sourceVpcId = sourceVpcId;
    }

    public CreateProtectionGroupRequestParams withDrType(DrTypeEnum drType) {
        this.drType = drType;
        return this;
    }

    /**
     * 部署模式。默认值为“migration”，migration表示VPC内迁移。
     * @return drType
     */
    public DrTypeEnum getDrType() {
        return drType;
    }

    public void setDrType(DrTypeEnum drType) {
        this.drType = drType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProtectionGroupRequestParams that = (CreateProtectionGroupRequestParams) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.sourceAvailabilityZone, that.sourceAvailabilityZone)
            && Objects.equals(this.targetAvailabilityZone, that.targetAvailabilityZone)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.sourceVpcId, that.sourceVpcId)
            && Objects.equals(this.drType, that.drType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, sourceAvailabilityZone, targetAvailabilityZone, domainId, sourceVpcId, drType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProtectionGroupRequestParams {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceAvailabilityZone: ").append(toIndentedString(sourceAvailabilityZone)).append("\n");
        sb.append("    targetAvailabilityZone: ").append(toIndentedString(targetAvailabilityZone)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    sourceVpcId: ").append(toIndentedString(sourceVpcId)).append("\n");
        sb.append("    drType: ").append(toIndentedString(drType)).append("\n");
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
