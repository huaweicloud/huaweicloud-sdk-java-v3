package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCoreRuntimeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity_urn")

    private UUID workloadIdentityUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreRunTagItemResp> tags = null;

    /**
     * **参数解释**: 运行时架构。 **取值范围**: arm64、x86_64
     */
    public static final class ArchEnum {

        /**
         * Enum ARM64 for value: "arm64"
         */
        public static final ArchEnum ARM64 = new ArchEnum("arm64");

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final ArchEnum X86_64 = new ArchEnum("x86_64");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("arm64", ARM64);
            map.put("x86_64", X86_64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchEnum(value));
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_detail")

    private CoreRunRuntimeVersion versionDetail;

    public CreateCoreRuntimeResponse withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: AgentRuntime唯一标识。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public CreateCoreRuntimeResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 描述信息。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCoreRuntimeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: Agent名称。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCoreRuntimeResponse withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释**: 最新版本名称。 
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public CreateCoreRuntimeResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**: 创建时间。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateCoreRuntimeResponse withAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
        return this;
    }

    /**
     * **参数解释**: Agent Gateway ID。 
     * @return agentGatewayId
     */
    public UUID getAgentGatewayId() {
        return agentGatewayId;
    }

    public void setAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
    }

    public CreateCoreRuntimeResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**: 最后更新时间。 
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateCoreRuntimeResponse withWorkloadIdentityUrn(UUID workloadIdentityUrn) {
        this.workloadIdentityUrn = workloadIdentityUrn;
        return this;
    }

    /**
     * **参数解释**: Identity URN。 
     * @return workloadIdentityUrn
     */
    public UUID getWorkloadIdentityUrn() {
        return workloadIdentityUrn;
    }

    public void setWorkloadIdentityUrn(UUID workloadIdentityUrn) {
        this.workloadIdentityUrn = workloadIdentityUrn;
    }

    public CreateCoreRuntimeResponse withTags(List<CoreRunTagItemResp> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCoreRuntimeResponse addTagsItem(CoreRunTagItemResp tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCoreRuntimeResponse withTags(Consumer<List<CoreRunTagItemResp>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**: 标签配置列表。 
     * @return tags
     */
    public List<CoreRunTagItemResp> getTags() {
        return tags;
    }

    public void setTags(List<CoreRunTagItemResp> tags) {
        this.tags = tags;
    }

    public CreateCoreRuntimeResponse withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**: 运行时架构。 **取值范围**: arm64、x86_64
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public CreateCoreRuntimeResponse withVersionDetail(CoreRunRuntimeVersion versionDetail) {
        this.versionDetail = versionDetail;
        return this;
    }

    public CreateCoreRuntimeResponse withVersionDetail(Consumer<CoreRunRuntimeVersion> versionDetailSetter) {
        if (this.versionDetail == null) {
            this.versionDetail = new CoreRunRuntimeVersion();
            versionDetailSetter.accept(this.versionDetail);
        }

        return this;
    }

    /**
     * Get versionDetail
     * @return versionDetail
     */
    public CoreRunRuntimeVersion getVersionDetail() {
        return versionDetail;
    }

    public void setVersionDetail(CoreRunRuntimeVersion versionDetail) {
        this.versionDetail = versionDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreRuntimeResponse that = (CreateCoreRuntimeResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.workloadIdentityUrn, that.workloadIdentityUrn)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.versionDetail, that.versionDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            name,
            latestVersion,
            createdAt,
            agentGatewayId,
            updatedAt,
            workloadIdentityUrn,
            tags,
            arch,
            versionDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreRuntimeResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    workloadIdentityUrn: ").append(toIndentedString(workloadIdentityUrn)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    versionDetail: ").append(toIndentedString(versionDetail)).append("\n");
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
