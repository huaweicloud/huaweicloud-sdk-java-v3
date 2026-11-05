package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeconfigSpecConfigsImageWarmUp
 */
public class NodeconfigSpecConfigsImageWarmUp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    public NodeconfigSpecConfigsImageWarmUp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：镜像预热任务ID。 **约束限制**：系统自动生成。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeconfigSpecConfigsImageWarmUp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：镜像预热任务名称。 **约束限制**：由4~32位小写字母、数字或\"-\"组成。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeconfigSpecConfigsImageWarmUp withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**：镜像预热任务的创建时间。 **约束限制**：系统自动填充。 **取值范围**：RFC3339格式时间。 **默认取值**：不涉及。
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public NodeconfigSpecConfigsImageWarmUp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：镜像类型。 **约束限制**：不涉及。 **取值范围**：SWR。 **默认取值**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NodeconfigSpecConfigsImageWarmUp withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * **参数解释**：需要预热的镜像地址。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigSpecConfigsImageWarmUp that = (NodeconfigSpecConfigsImageWarmUp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp) && Objects.equals(this.type, that.type)
            && Objects.equals(this.image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creationTimestamp, type, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigSpecConfigsImageWarmUp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
