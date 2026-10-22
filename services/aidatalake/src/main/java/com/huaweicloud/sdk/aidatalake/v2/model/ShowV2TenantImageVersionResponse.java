package com.huaweicloud.sdk.aidatalake.v2.model;

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
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowV2TenantImageVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_registry")

    private String imageRegistry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_namespace")

    private String imageNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    /**
     * Gets or Sets architectures
     */
    public static final class ArchitecturesEnum {

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final ArchitecturesEnum X86_64 = new ArchitecturesEnum("x86_64");

        /**
         * Enum AARCH64 for value: "aarch64"
         */
        public static final ArchitecturesEnum AARCH64 = new ArchitecturesEnum("aarch64");

        private static final Map<String, ArchitecturesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchitecturesEnum> createStaticFields() {
            Map<String, ArchitecturesEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("aarch64", AARCH64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchitecturesEnum(String value) {
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
        public static ArchitecturesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchitecturesEnum(value));
        }

        public static ArchitecturesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchitecturesEnum) {
                return this.value.equals(((ArchitecturesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architectures")

    private List<ArchitecturesEnum> architectures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_softwares")

    private List<ContainerSoftware> containerSoftwares = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private V2ImageVersionStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private V2ImageVersionType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_image_id")

    private String baseImageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_image_version_id")

    private String baseImageVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_snapshot")

    private V2ImageSnapshotInfo imageSnapshot;

    public ShowV2TenantImageVersionResponse withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * **参数解释**：镜像版本ID。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public ShowV2TenantImageVersionResponse withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**：镜像版本。 **取值范围**：支持英文字母、数字、小数点、斜杠、冒号、下划线和连字符，长度2~32个字符。 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ShowV2TenantImageVersionResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：镜像分类。 **取值范围**：   - RAY_BASIC：基于Ray构建的自定义镜像。   - SPARK_JOB：基于SparkJob构建的自定义镜像。   - SPARK_SQL：基于SparkSql构建的自定义镜像。   - FLINK_JOB：基于FlinkJob构建的自定义镜像。   - AURA_JOB：基于AuraJobV2构建的自定义镜像。 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowV2TenantImageVersionResponse withImageRegistry(String imageRegistry) {
        this.imageRegistry = imageRegistry;
        return this;
    }

    /**
     * **参数解释**：镜像域名。 **取值范围**：支持英文字母、数字、小数点及连字符，长度0~255个字符。 
     * @return imageRegistry
     */
    public String getImageRegistry() {
        return imageRegistry;
    }

    public void setImageRegistry(String imageRegistry) {
        this.imageRegistry = imageRegistry;
    }

    public ShowV2TenantImageVersionResponse withImageNamespace(String imageNamespace) {
        this.imageNamespace = imageNamespace;
        return this;
    }

    /**
     * **参数解释**：镜像命名空间。 **取值范围**：由英文字母、数字、中划线和下划线组成，长度0~64个字符。 
     * @return imageNamespace
     */
    public String getImageNamespace() {
        return imageNamespace;
    }

    public void setImageNamespace(String imageNamespace) {
        this.imageNamespace = imageNamespace;
    }

    public ShowV2TenantImageVersionResponse withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**：镜像名。 **取值范围**：由中文字符、英文字母、数字、中划线和下划线组成，长度0~128个字符。 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ShowV2TenantImageVersionResponse withArchitectures(List<ArchitecturesEnum> architectures) {
        this.architectures = architectures;
        return this;
    }

    public ShowV2TenantImageVersionResponse addArchitecturesItem(ArchitecturesEnum architecturesItem) {
        if (this.architectures == null) {
            this.architectures = new ArrayList<>();
        }
        this.architectures.add(architecturesItem);
        return this;
    }

    public ShowV2TenantImageVersionResponse withArchitectures(Consumer<List<ArchitecturesEnum>> architecturesSetter) {
        if (this.architectures == null) {
            this.architectures = new ArrayList<>();
        }
        architecturesSetter.accept(this.architectures);
        return this;
    }

    /**
     * **参数解释**：镜像支持的架构列表，取值包括：x86_64（x86架构）、aarch64（ARM架构）。
     * @return architectures
     */
    public List<ArchitecturesEnum> getArchitectures() {
        return architectures;
    }

    public void setArchitectures(List<ArchitecturesEnum> architectures) {
        this.architectures = architectures;
    }

    public ShowV2TenantImageVersionResponse withContainerSoftwares(List<ContainerSoftware> containerSoftwares) {
        this.containerSoftwares = containerSoftwares;
        return this;
    }

    public ShowV2TenantImageVersionResponse addContainerSoftwaresItem(ContainerSoftware containerSoftwaresItem) {
        if (this.containerSoftwares == null) {
            this.containerSoftwares = new ArrayList<>();
        }
        this.containerSoftwares.add(containerSoftwaresItem);
        return this;
    }

    public ShowV2TenantImageVersionResponse withContainerSoftwares(
        Consumer<List<ContainerSoftware>> containerSoftwaresSetter) {
        if (this.containerSoftwares == null) {
            this.containerSoftwares = new ArrayList<>();
        }
        containerSoftwaresSetter.accept(this.containerSoftwares);
        return this;
    }

    /**
     * **参数解释**：镜像软件列表，每个元素为一个ContainerSoftware对象，包含软件名称和版本信息。 **约束限制**：最小个数为0，最大个数为100。 
     * @return containerSoftwares
     */
    public List<ContainerSoftware> getContainerSoftwares() {
        return containerSoftwares;
    }

    public void setContainerSoftwares(List<ContainerSoftware> containerSoftwares) {
        this.containerSoftwares = containerSoftwares;
    }

    public ShowV2TenantImageVersionResponse withStatus(V2ImageVersionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public V2ImageVersionStatus getStatus() {
        return status;
    }

    public void setStatus(V2ImageVersionStatus status) {
        this.status = status;
    }

    public ShowV2TenantImageVersionResponse withType(V2ImageVersionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public V2ImageVersionType getType() {
        return type;
    }

    public void setType(V2ImageVersionType type) {
        this.type = type;
    }

    public ShowV2TenantImageVersionResponse withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释**：镜像版本可见性。 **取值范围**：   - PRIVATE：私有，仅工作空间内可见。   - PUBLIC：公共，所有工作空间可见。 
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public ShowV2TenantImageVersionResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowV2TenantImageVersionResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：资源更新时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowV2TenantImageVersionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：镜像版本描述。 **取值范围**：支持中文字符、英文字母、数字及常用符号（不允许输入感叹号、小于号、大于号、等号、与号、双引号、单引号），长度0~2000个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowV2TenantImageVersionResponse withBaseImageId(String baseImageId) {
        this.baseImageId = baseImageId;
        return this;
    }

    /**
     * **参数解释**：关联的预置基础镜像ID。 **约束限制**：Spark类型自定义镜像时必填。 **取值范围**：支持英文字母、数字及中划线，长度0~64个字符。 **默认取值**：不涉及。 
     * @return baseImageId
     */
    public String getBaseImageId() {
        return baseImageId;
    }

    public void setBaseImageId(String baseImageId) {
        this.baseImageId = baseImageId;
    }

    public ShowV2TenantImageVersionResponse withBaseImageVersionId(String baseImageVersionId) {
        this.baseImageVersionId = baseImageVersionId;
        return this;
    }

    /**
     * **参数解释**：关联的预置基础镜像版本ID。 **约束限制**：Spark类型自定义镜像时必填。 **取值范围**：支持英文字母、数字及中划线，长度0~64个字符。 **默认取值**：不涉及。 
     * @return baseImageVersionId
     */
    public String getBaseImageVersionId() {
        return baseImageVersionId;
    }

    public void setBaseImageVersionId(String baseImageVersionId) {
        this.baseImageVersionId = baseImageVersionId;
    }

    public ShowV2TenantImageVersionResponse withImageSnapshot(V2ImageSnapshotInfo imageSnapshot) {
        this.imageSnapshot = imageSnapshot;
        return this;
    }

    public ShowV2TenantImageVersionResponse withImageSnapshot(Consumer<V2ImageSnapshotInfo> imageSnapshotSetter) {
        if (this.imageSnapshot == null) {
            this.imageSnapshot = new V2ImageSnapshotInfo();
            imageSnapshotSetter.accept(this.imageSnapshot);
        }

        return this;
    }

    /**
     * Get imageSnapshot
     * @return imageSnapshot
     */
    public V2ImageSnapshotInfo getImageSnapshot() {
        return imageSnapshot;
    }

    public void setImageSnapshot(V2ImageSnapshotInfo imageSnapshot) {
        this.imageSnapshot = imageSnapshot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowV2TenantImageVersionResponse that = (ShowV2TenantImageVersionResponse) obj;
        return Objects.equals(this.versionId, that.versionId) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.category, that.category) && Objects.equals(this.imageRegistry, that.imageRegistry)
            && Objects.equals(this.imageNamespace, that.imageNamespace)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.architectures, that.architectures)
            && Objects.equals(this.containerSoftwares, that.containerSoftwares)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.visibility, that.visibility) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.baseImageId, that.baseImageId)
            && Objects.equals(this.baseImageVersionId, that.baseImageVersionId)
            && Objects.equals(this.imageSnapshot, that.imageSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId,
            imageVersion,
            category,
            imageRegistry,
            imageNamespace,
            imageName,
            architectures,
            containerSoftwares,
            status,
            type,
            visibility,
            createTime,
            updateTime,
            description,
            baseImageId,
            baseImageVersionId,
            imageSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowV2TenantImageVersionResponse {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    imageRegistry: ").append(toIndentedString(imageRegistry)).append("\n");
        sb.append("    imageNamespace: ").append(toIndentedString(imageNamespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
        sb.append("    containerSoftwares: ").append(toIndentedString(containerSoftwares)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    baseImageId: ").append(toIndentedString(baseImageId)).append("\n");
        sb.append("    baseImageVersionId: ").append(toIndentedString(baseImageVersionId)).append("\n");
        sb.append("    imageSnapshot: ").append(toIndentedString(imageSnapshot)).append("\n");
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
