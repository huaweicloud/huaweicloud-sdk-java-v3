package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpgradingTheKernelBody
 */
public class UpgradingTheKernelBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_image_id")

    private String targetImageId;

    /**
     * 升级类型。 - same：同版本。 - cross：跨版本。
     */
    public static final class UpgradeTypeEnum {

        /**
         * Enum SAME for value: "same"
         */
        public static final UpgradeTypeEnum SAME = new UpgradeTypeEnum("same");

        /**
         * Enum CROSS for value: "cross"
         */
        public static final UpgradeTypeEnum CROSS = new UpgradeTypeEnum("cross");

        private static final Map<String, UpgradeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpgradeTypeEnum> createStaticFields() {
            Map<String, UpgradeTypeEnum> map = new HashMap<>();
            map.put("same", SAME);
            map.put("cross", CROSS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpgradeTypeEnum(String value) {
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
        public static UpgradeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpgradeTypeEnum(value));
        }

        public static UpgradeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpgradeTypeEnum) {
                return this.value.equals(((UpgradeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_type")

    private UpgradeTypeEnum upgradeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices_backup_check")

    private Boolean indicesBackupCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_load")

    private Boolean checkLoad;

    public UpgradingTheKernelBody withTargetImageId(String targetImageId) {
        this.targetImageId = targetImageId;
        return this;
    }

    /**
     * 目标镜像版本ID。
     * @return targetImageId
     */
    public String getTargetImageId() {
        return targetImageId;
    }

    public void setTargetImageId(String targetImageId) {
        this.targetImageId = targetImageId;
    }

    public UpgradingTheKernelBody withUpgradeType(UpgradeTypeEnum upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * 升级类型。 - same：同版本。 - cross：跨版本。
     * @return upgradeType
     */
    public UpgradeTypeEnum getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(UpgradeTypeEnum upgradeType) {
        this.upgradeType = upgradeType;
    }

    public UpgradingTheKernelBody withIndicesBackupCheck(Boolean indicesBackupCheck) {
        this.indicesBackupCheck = indicesBackupCheck;
        return this;
    }

    /**
     * 是否进行备份校验。 - true：进行校验。 - false：不进行校验。
     * @return indicesBackupCheck
     */
    public Boolean getIndicesBackupCheck() {
        return indicesBackupCheck;
    }

    public void setIndicesBackupCheck(Boolean indicesBackupCheck) {
        this.indicesBackupCheck = indicesBackupCheck;
    }

    public UpgradingTheKernelBody withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托名称，委托给CSS，允许CSS调用您的其他云服务。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public UpgradingTheKernelBody withCheckLoad(Boolean checkLoad) {
        this.checkLoad = checkLoad;
        return this;
    }

    /**
     * 是否校验负载。默认为true。 - true：进行校验。 - false：不进行校验。
     * @return checkLoad
     */
    public Boolean getCheckLoad() {
        return checkLoad;
    }

    public void setCheckLoad(Boolean checkLoad) {
        this.checkLoad = checkLoad;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradingTheKernelBody that = (UpgradingTheKernelBody) obj;
        return Objects.equals(this.targetImageId, that.targetImageId)
            && Objects.equals(this.upgradeType, that.upgradeType)
            && Objects.equals(this.indicesBackupCheck, that.indicesBackupCheck)
            && Objects.equals(this.agency, that.agency) && Objects.equals(this.checkLoad, that.checkLoad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetImageId, upgradeType, indicesBackupCheck, agency, checkLoad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradingTheKernelBody {\n");
        sb.append("    targetImageId: ").append(toIndentedString(targetImageId)).append("\n");
        sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
        sb.append("    indicesBackupCheck: ").append(toIndentedString(indicesBackupCheck)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    checkLoad: ").append(toIndentedString(checkLoad)).append("\n");
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
