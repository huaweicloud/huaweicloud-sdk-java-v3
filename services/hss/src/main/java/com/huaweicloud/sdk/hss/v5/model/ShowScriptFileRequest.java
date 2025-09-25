package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowScriptFileRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 类型
     */
    public static final class TypeEnum {

        /**
         * Enum AGENT_BATCH_INSTALL_WINDOWS for value: "agent_batch_install_windows"
         */
        public static final TypeEnum AGENT_BATCH_INSTALL_WINDOWS = new TypeEnum("agent_batch_install_windows");

        /**
         * Enum AGENT_SINGLE_INSTALL_WINDOWS for value: "agent_single_install_windows"
         */
        public static final TypeEnum AGENT_SINGLE_INSTALL_WINDOWS = new TypeEnum("agent_single_install_windows");

        /**
         * Enum AGENT_THIRD_PARTY_CLOUD_BATCH_INSTALL_WINDOWS for value: "agent_third_party_cloud_batch_install_windows"
         */
        public static final TypeEnum AGENT_THIRD_PARTY_CLOUD_BATCH_INSTALL_WINDOWS =
            new TypeEnum("agent_third_party_cloud_batch_install_windows");

        /**
         * Enum AGENT_THIRD_PARTY_CLOUD_SINGLE_INSTALL_WINDOWS for value: "agent_third_party_cloud_single_install_windows"
         */
        public static final TypeEnum AGENT_THIRD_PARTY_CLOUD_SINGLE_INSTALL_WINDOWS =
            new TypeEnum("agent_third_party_cloud_single_install_windows");

        /**
         * Enum AGENT_OTHER_ACCOUNTS_BATCH_INSTALL_WINDOWS for value: "agent_other_accounts_batch_install_windows"
         */
        public static final TypeEnum AGENT_OTHER_ACCOUNTS_BATCH_INSTALL_WINDOWS =
            new TypeEnum("agent_other_accounts_batch_install_windows");

        /**
         * Enum AGENT_OTHER_ACCOUNTS_SINGLE_INSTALL_WINDOWS for value: "agent_other_accounts_single_install_windows"
         */
        public static final TypeEnum AGENT_OTHER_ACCOUNTS_SINGLE_INSTALL_WINDOWS =
            new TypeEnum("agent_other_accounts_single_install_windows");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("agent_batch_install_windows", AGENT_BATCH_INSTALL_WINDOWS);
            map.put("agent_single_install_windows", AGENT_SINGLE_INSTALL_WINDOWS);
            map.put("agent_third_party_cloud_batch_install_windows", AGENT_THIRD_PARTY_CLOUD_BATCH_INSTALL_WINDOWS);
            map.put("agent_third_party_cloud_single_install_windows", AGENT_THIRD_PARTY_CLOUD_SINGLE_INSTALL_WINDOWS);
            map.put("agent_other_accounts_batch_install_windows", AGENT_OTHER_ACCOUNTS_BATCH_INSTALL_WINDOWS);
            map.put("agent_other_accounts_single_install_windows", AGENT_OTHER_ACCOUNTS_SINGLE_INSTALL_WINDOWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public ShowScriptFileRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowScriptFileRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowScriptFileRequest that = (ShowScriptFileRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScriptFileRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
