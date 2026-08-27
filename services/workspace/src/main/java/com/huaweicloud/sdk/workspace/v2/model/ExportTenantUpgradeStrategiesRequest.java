package com.huaweicloud.sdk.workspace.v2.model;

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
public class ExportTenantUpgradeStrategiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_name")

    private String strategyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_type")

    private Integer strategyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force_upgrade")

    private Integer isForceUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_priority")

    private Integer strategyPriority;

    /**
     * 语言。   - zh_CN：中文 - en_US：英文
     */
    public static final class LanguageEnum {

        /**
         * Enum ZH_CN for value: "zh_CN"
         */
        public static final LanguageEnum ZH_CN = new LanguageEnum("zh_CN");

        /**
         * Enum EN_US for value: "en_US"
         */
        public static final LanguageEnum EN_US = new LanguageEnum("en_US");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("zh_CN", ZH_CN);
            map.put("en_US", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LanguageEnum(value));
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public ExportTenantUpgradeStrategiesRequest withStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }

    /**
     * 策略名称（支持模糊查询）
     * @return strategyName
     */
    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public ExportTenantUpgradeStrategiesRequest withStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * 策略类型：0-服务端 1-客户端
     * minimum: 0
     * maximum: 1
     * @return strategyType
     */
    public Integer getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
    }

    public ExportTenantUpgradeStrategiesRequest withIsForceUpgrade(Integer isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
        return this;
    }

    /**
     * 是否强制升级：0-否 1-是
     * minimum: 0
     * maximum: 1
     * @return isForceUpgrade
     */
    public Integer getIsForceUpgrade() {
        return isForceUpgrade;
    }

    public void setIsForceUpgrade(Integer isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
    }

    public ExportTenantUpgradeStrategiesRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 启用状态：0-禁用 1-启用
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ExportTenantUpgradeStrategiesRequest withStrategyPriority(Integer strategyPriority) {
        this.strategyPriority = strategyPriority;
        return this;
    }

    /**
     * 协议策略优先级
     * minimum: 1
     * maximum: 200
     * @return strategyPriority
     */
    public Integer getStrategyPriority() {
        return strategyPriority;
    }

    public void setStrategyPriority(Integer strategyPriority) {
        this.strategyPriority = strategyPriority;
    }

    public ExportTenantUpgradeStrategiesRequest withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 语言。   - zh_CN：中文 - en_US：英文
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTenantUpgradeStrategiesRequest that = (ExportTenantUpgradeStrategiesRequest) obj;
        return Objects.equals(this.strategyName, that.strategyName)
            && Objects.equals(this.strategyType, that.strategyType)
            && Objects.equals(this.isForceUpgrade, that.isForceUpgrade) && Objects.equals(this.status, that.status)
            && Objects.equals(this.strategyPriority, that.strategyPriority)
            && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategyName, strategyType, isForceUpgrade, status, strategyPriority, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTenantUpgradeStrategiesRequest {\n");
        sb.append("    strategyName: ").append(toIndentedString(strategyName)).append("\n");
        sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
        sb.append("    isForceUpgrade: ").append(toIndentedString(isForceUpgrade)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    strategyPriority: ").append(toIndentedString(strategyPriority)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
