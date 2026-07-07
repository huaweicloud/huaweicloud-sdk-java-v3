package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageGroup
 */
public class ImageGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_count")

    private Integer versionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_me")

    private String readMe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_name")

    private String iconName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_instance_name")

    private String swrInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_instance_id")

    private String swrInstanceId;

    public ImageGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：镜像名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageGroup withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：镜像创建的时间，单位：UTC毫秒。 **取值范围**：不涉及。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ImageGroup withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**：镜像所属的SWR组织。 **取值范围**：不涉及。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ImageGroup withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释**：镜像最后更新的时间，单位：UTC毫秒。 **取值范围**：不涉及。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public ImageGroup withVersionCount(Integer versionCount) {
        this.versionCount = versionCount;
        return this;
    }

    /**
     * **参数解释**：镜像版本个数。 **取值范围**：不涉及。
     * @return versionCount
     */
    public Integer getVersionCount() {
        return versionCount;
    }

    public void setVersionCount(Integer versionCount) {
        this.versionCount = versionCount;
    }

    public ImageGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：镜像描述信息。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageGroup withReadMe(String readMe) {
        this.readMe = readMe;
        return this;
    }

    /**
     * **参数解释**：镜像指导。 **取值范围**：不涉及。
     * @return readMe
     */
    public String getReadMe() {
        return readMe;
    }

    public void setReadMe(String readMe) {
        this.readMe = readMe;
    }

    public ImageGroup withIconName(String iconName) {
        this.iconName = iconName;
        return this;
    }

    /**
     * **参数解释**：镜像图标名称。 **取值范围**：不涉及。
     * @return iconName
     */
    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public ImageGroup withSwrInstanceName(String swrInstanceName) {
        this.swrInstanceName = swrInstanceName;
        return this;
    }

    /**
     * **参数解释**：SWR企业版镜像仓库名称。 **取值范围**：不涉及。
     * @return swrInstanceName
     */
    public String getSwrInstanceName() {
        return swrInstanceName;
    }

    public void setSwrInstanceName(String swrInstanceName) {
        this.swrInstanceName = swrInstanceName;
    }

    public ImageGroup withSwrInstanceId(String swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
        return this;
    }

    /**
     * **参数解释**：SWR企业版镜像仓库ID。 **取值范围**：不涉及。
     * @return swrInstanceId
     */
    public String getSwrInstanceId() {
        return swrInstanceId;
    }

    public void setSwrInstanceId(String swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageGroup that = (ImageGroup) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.versionCount, that.versionCount)
            && Objects.equals(this.description, that.description) && Objects.equals(this.readMe, that.readMe)
            && Objects.equals(this.iconName, that.iconName)
            && Objects.equals(this.swrInstanceName, that.swrInstanceName)
            && Objects.equals(this.swrInstanceId, that.swrInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            createAt,
            namespace,
            updateAt,
            versionCount,
            description,
            readMe,
            iconName,
            swrInstanceName,
            swrInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageGroup {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    readMe: ").append(toIndentedString(readMe)).append("\n");
        sb.append("    iconName: ").append(toIndentedString(iconName)).append("\n");
        sb.append("    swrInstanceName: ").append(toIndentedString(swrInstanceName)).append("\n");
        sb.append("    swrInstanceId: ").append(toIndentedString(swrInstanceId)).append("\n");
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
