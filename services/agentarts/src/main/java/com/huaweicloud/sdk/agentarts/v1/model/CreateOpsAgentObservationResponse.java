package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateOpsAgentObservationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    /**
     * 资源类型 agent单智能体 workflow工作流 multiagents多智能体
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum AGENT for value: "agent"
         */
        public static final ResourceTypeEnum AGENT = new ResourceTypeEnum("agent");

        /**
         * Enum WORKFLOW for value: "workflow"
         */
        public static final ResourceTypeEnum WORKFLOW = new ResourceTypeEnum("workflow");

        /**
         * Enum MULTIAGENTS for value: "multiagents"
         */
        public static final ResourceTypeEnum MULTIAGENTS = new ResourceTypeEnum("multiagents");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("agent", AGENT);
            map.put("workflow", WORKFLOW);
            map.put("multiagents", MULTIAGENTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    /**
     * 状态 published发布态 draft草稿态
     */
    public static final class StatusEnum {

        /**
         * Enum PUBLISHED for value: "published"
         */
        public static final StatusEnum PUBLISHED = new StatusEnum("published");

        /**
         * Enum DRAFT for value: "draft"
         */
        public static final StatusEnum DRAFT = new StatusEnum("draft");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("published", PUBLISHED);
            map.put("draft", DRAFT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * studio, agentrun, api 三种类型，默认为studio
     */
    public static final class SourceEnum {

        /**
         * Enum STUDIO for value: "studio"
         */
        public static final SourceEnum STUDIO = new SourceEnum("studio");

        /**
         * Enum AGENTRUN for value: "agentrun"
         */
        public static final SourceEnum AGENTRUN = new SourceEnum("agentrun");

        /**
         * Enum API for value: "api"
         */
        public static final SourceEnum API = new SourceEnum("api");

        private static final Map<String, SourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceEnum> createStaticFields() {
            Map<String, SourceEnum> map = new HashMap<>();
            map.put("studio", STUDIO);
            map.put("agentrun", AGENTRUN);
            map.put("api", API);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceEnum(value));
        }

        public static SourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceEnum) {
                return this.value.equals(((SourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceEnum source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apm_app_id")

    private String apmAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_prom_id")

    private String aomPromId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apm_app_token")

    private String apmAppToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_access_code")

    private String aomAccessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_stream_id")

    private String ltsStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_label_name")

    private String ltsLabelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apm_exporter_endpoint")

    private String apmExporterEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_exporter_endpoint")

    private String aomExporterEndpoint;

    public CreateOpsAgentObservationResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CreateOpsAgentObservationResponse withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public CreateOpsAgentObservationResponse withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型 agent单智能体 workflow工作流 multiagents多智能体
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public CreateOpsAgentObservationResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态 published发布态 draft草稿态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateOpsAgentObservationResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 该合成条目生成的精确时间戳。 **约束限制：** 符合ISO8601标准。 **取值范围：** 日期时间字符串。 **默认取值：** 不涉及。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateOpsAgentObservationResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 该合成条目生成的精确时间戳。 **约束限制：** 符合ISO8601标准。 **取值范围：** 日期时间字符串。 **默认取值：** 不涉及。 
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateOpsAgentObservationResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateOpsAgentObservationResponse withSource(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * studio, agentrun, api 三种类型，默认为studio
     * @return source
     */
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public CreateOpsAgentObservationResponse withApmAppId(String apmAppId) {
        this.apmAppId = apmAppId;
        return this;
    }

    /**
     * apm的app_id，非必填
     * @return apmAppId
     */
    public String getApmAppId() {
        return apmAppId;
    }

    public void setApmAppId(String apmAppId) {
        this.apmAppId = apmAppId;
    }

    public CreateOpsAgentObservationResponse withAomPromId(String aomPromId) {
        this.aomPromId = aomPromId;
        return this;
    }

    /**
     * aom的app_id，非必填
     * @return aomPromId
     */
    public String getAomPromId() {
        return aomPromId;
    }

    public void setAomPromId(String aomPromId) {
        this.aomPromId = aomPromId;
    }

    public CreateOpsAgentObservationResponse withApmAppToken(String apmAppToken) {
        this.apmAppToken = apmAppToken;
        return this;
    }

    /**
     * apm token，加密存储，非必填
     * @return apmAppToken
     */
    public String getApmAppToken() {
        return apmAppToken;
    }

    public void setApmAppToken(String apmAppToken) {
        this.apmAppToken = apmAppToken;
    }

    public CreateOpsAgentObservationResponse withAomAccessCode(String aomAccessCode) {
        this.aomAccessCode = aomAccessCode;
        return this;
    }

    /**
     * aom access_code，加密存储，非必填
     * @return aomAccessCode
     */
    public String getAomAccessCode() {
        return aomAccessCode;
    }

    public void setAomAccessCode(String aomAccessCode) {
        this.aomAccessCode = aomAccessCode;
    }

    public CreateOpsAgentObservationResponse withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * lts_group_id，非必填
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public CreateOpsAgentObservationResponse withLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
        return this;
    }

    /**
     * lts_stream_id，非必填
     * @return ltsStreamId
     */
    public String getLtsStreamId() {
        return ltsStreamId;
    }

    public void setLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
    }

    public CreateOpsAgentObservationResponse withLtsLabelName(String ltsLabelName) {
        this.ltsLabelName = ltsLabelName;
        return this;
    }

    /**
     * 用于过滤lts日志标签的，key是 __labels__.task_name，对于需要查询日志上报的应用，必填，studio发布的应用必填，否则无法查询到应用日志
     * @return ltsLabelName
     */
    public String getLtsLabelName() {
        return ltsLabelName;
    }

    public void setLtsLabelName(String ltsLabelName) {
        this.ltsLabelName = ltsLabelName;
    }

    public CreateOpsAgentObservationResponse withApmExporterEndpoint(String apmExporterEndpoint) {
        this.apmExporterEndpoint = apmExporterEndpoint;
        return this;
    }

    /**
     * apm上报地址
     * @return apmExporterEndpoint
     */
    public String getApmExporterEndpoint() {
        return apmExporterEndpoint;
    }

    public void setApmExporterEndpoint(String apmExporterEndpoint) {
        this.apmExporterEndpoint = apmExporterEndpoint;
    }

    public CreateOpsAgentObservationResponse withAomExporterEndpoint(String aomExporterEndpoint) {
        this.aomExporterEndpoint = aomExporterEndpoint;
        return this;
    }

    /**
     * aom上报地址
     * @return aomExporterEndpoint
     */
    public String getAomExporterEndpoint() {
        return aomExporterEndpoint;
    }

    public void setAomExporterEndpoint(String aomExporterEndpoint) {
        this.aomExporterEndpoint = aomExporterEndpoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsAgentObservationResponse that = (CreateOpsAgentObservationResponse) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.version, that.version) && Objects.equals(this.source, that.source)
            && Objects.equals(this.apmAppId, that.apmAppId) && Objects.equals(this.aomPromId, that.aomPromId)
            && Objects.equals(this.apmAppToken, that.apmAppToken)
            && Objects.equals(this.aomAccessCode, that.aomAccessCode)
            && Objects.equals(this.ltsGroupId, that.ltsGroupId) && Objects.equals(this.ltsStreamId, that.ltsStreamId)
            && Objects.equals(this.ltsLabelName, that.ltsLabelName)
            && Objects.equals(this.apmExporterEndpoint, that.apmExporterEndpoint)
            && Objects.equals(this.aomExporterEndpoint, that.aomExporterEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            resourceName,
            resourceType,
            status,
            createdAt,
            updatedAt,
            version,
            source,
            apmAppId,
            aomPromId,
            apmAppToken,
            aomAccessCode,
            ltsGroupId,
            ltsStreamId,
            ltsLabelName,
            apmExporterEndpoint,
            aomExporterEndpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsAgentObservationResponse {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    apmAppId: ").append(toIndentedString(apmAppId)).append("\n");
        sb.append("    aomPromId: ").append(toIndentedString(aomPromId)).append("\n");
        sb.append("    apmAppToken: ").append(toIndentedString(apmAppToken)).append("\n");
        sb.append("    aomAccessCode: ").append(toIndentedString(aomAccessCode)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsStreamId: ").append(toIndentedString(ltsStreamId)).append("\n");
        sb.append("    ltsLabelName: ").append(toIndentedString(ltsLabelName)).append("\n");
        sb.append("    apmExporterEndpoint: ").append(toIndentedString(apmExporterEndpoint)).append("\n");
        sb.append("    aomExporterEndpoint: ").append(toIndentedString(aomExporterEndpoint)).append("\n");
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
