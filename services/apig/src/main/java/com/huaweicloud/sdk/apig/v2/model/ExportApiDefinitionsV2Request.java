package com.huaweicloud.sdk.apig.v2.model;

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
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExportApiDefinitionsV2Request implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * OpenAPI版本
     */
    public static final class OasVersionEnum {

        /**
         * Enum _2_0 for value: "2.0"
         */
        public static final OasVersionEnum _2_0 = new OasVersionEnum("2.0");

        /**
         * Enum _3_0 for value: "3.0"
         */
        public static final OasVersionEnum _3_0 = new OasVersionEnum("3.0");

        private static final Map<String, OasVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OasVersionEnum> createStaticFields() {
            Map<String, OasVersionEnum> map = new HashMap<>();
            map.put("2.0", _2_0);
            map.put("3.0", _3_0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OasVersionEnum(String value) {
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
        public static OasVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OasVersionEnum(value));
        }

        public static OasVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OasVersionEnum) {
                return this.value.equals(((OasVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oas_version")

    private OasVersionEnum oasVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExportOpenApiReq body;

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

    public ExportApiDefinitionsV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ExportApiDefinitionsV2Request withOasVersion(OasVersionEnum oasVersion) {
        this.oasVersion = oasVersion;
        return this;
    }

    /**
     * OpenAPI版本
     * @return oasVersion
     */
    public OasVersionEnum getOasVersion() {
        return oasVersion;
    }

    public void setOasVersion(OasVersionEnum oasVersion) {
        this.oasVersion = oasVersion;
    }

    public ExportApiDefinitionsV2Request withBody(ExportOpenApiReq body) {
        this.body = body;
        return this;
    }

    public ExportApiDefinitionsV2Request withBody(Consumer<ExportOpenApiReq> bodySetter) {
        if (this.body == null) {
            this.body = new ExportOpenApiReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExportOpenApiReq getBody() {
        return body;
    }

    public void setBody(ExportOpenApiReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportApiDefinitionsV2Request that = (ExportApiDefinitionsV2Request) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.oasVersion, that.oasVersion)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, oasVersion, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportApiDefinitionsV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    oasVersion: ").append(toIndentedString(oasVersion)).append("\n");
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
