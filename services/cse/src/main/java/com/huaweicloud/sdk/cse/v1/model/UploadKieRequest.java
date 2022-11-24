package com.huaweicloud.sdk.cse.v1.model;

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
 * Request Object
 */
public class UploadKieRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")

    private String xEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-engine-id")

    private String xEngineId;

    /**
     * 覆盖策略，force 强制覆盖、abort 遇到第一个重复时终止导入后续的kv、skip 跳过重复的key
     */
    public static final class OverrideEnum {

        /**
         * Enum FORCE for value: "force"
         */
        public static final OverrideEnum FORCE = new OverrideEnum("force");

        /**
         * Enum ABORT for value: "abort"
         */
        public static final OverrideEnum ABORT = new OverrideEnum("abort");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final OverrideEnum SKIP = new OverrideEnum("skip");

        private static final Map<String, OverrideEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OverrideEnum> createStaticFields() {
            Map<String, OverrideEnum> map = new HashMap<>();
            map.put("force", FORCE);
            map.put("abort", ABORT);
            map.put("skip", SKIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OverrideEnum(String value) {
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
        public static OverrideEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OverrideEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OverrideEnum(value);
            }
            return result;
        }

        public static OverrideEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OverrideEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OverrideEnum) {
                return this.value.equals(((OverrideEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private OverrideEnum override;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadKieRequestBody body;

    public UploadKieRequest withXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
        return this;
    }

    /**
     * 如果不带则默认企业项目为\"default\"，ID为\"0\"
     * @return xEnterpriseProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")
    public String getXEnterpriseProjectID() {
        return xEnterpriseProjectID;
    }

    public void setXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
    }

    public UploadKieRequest withXEngineId(String xEngineId) {
        this.xEngineId = xEngineId;
        return this;
    }

    /**
     * 微服务引擎专享版ID。
     * @return xEngineId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-engine-id")
    public String getXEngineId() {
        return xEngineId;
    }

    public void setXEngineId(String xEngineId) {
        this.xEngineId = xEngineId;
    }

    public UploadKieRequest withOverride(OverrideEnum override) {
        this.override = override;
        return this;
    }

    /**
     * 覆盖策略，force 强制覆盖、abort 遇到第一个重复时终止导入后续的kv、skip 跳过重复的key
     * @return override
     */
    public OverrideEnum getOverride() {
        return override;
    }

    public void setOverride(OverrideEnum override) {
        this.override = override;
    }

    public UploadKieRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 指定label导入，格式为：{标签key}:{标签value}，如果不填则按body的label导入
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public UploadKieRequest withBody(UploadKieRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadKieRequest withBody(Consumer<UploadKieRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadKieRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadKieRequestBody getBody() {
        return body;
    }

    public void setBody(UploadKieRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadKieRequest uploadKieRequest = (UploadKieRequest) o;
        return Objects.equals(this.xEnterpriseProjectID, uploadKieRequest.xEnterpriseProjectID)
            && Objects.equals(this.xEngineId, uploadKieRequest.xEngineId)
            && Objects.equals(this.override, uploadKieRequest.override)
            && Objects.equals(this.label, uploadKieRequest.label) && Objects.equals(this.body, uploadKieRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xEnterpriseProjectID, xEngineId, override, label, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadKieRequest {\n");
        sb.append("    xEnterpriseProjectID: ").append(toIndentedString(xEnterpriseProjectID)).append("\n");
        sb.append("    xEngineId: ").append(toIndentedString(xEngineId)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
