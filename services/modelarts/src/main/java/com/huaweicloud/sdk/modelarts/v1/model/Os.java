package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：操作系统镜像信息。
 */
public class Os {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageId")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageType")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoMatch")

    private String autoMatch;

    public Os withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：操作系统名称和版本，如EulorOS 2.5。指定私有镜像时可不指定。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Os withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：操作系统镜像id。 **取值范围**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Os withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**：操作系统镜像类型。设置私有镜像时必须指定。默认为预置镜像，无需指定该字段。 **取值范围**：可选值如下： - private：私有镜像 - \"\"：不指定类型即预置镜像。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Os withAutoMatch(String autoMatch) {
        this.autoMatch = autoMatch;
        return this;
    }

    /**
     * **参数解释**：操作系统镜像自动匹配配置。当配置该参数时将会自动选择最优镜像，同时该参数会自动清空。 **取值范围**：操作系统名称和版本，如EulorOS 2.5。
     * @return autoMatch
     */
    public String getAutoMatch() {
        return autoMatch;
    }

    public void setAutoMatch(String autoMatch) {
        this.autoMatch = autoMatch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Os that = (Os) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.autoMatch, that.autoMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageId, imageType, autoMatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Os {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    autoMatch: ").append(toIndentedString(autoMatch)).append("\n");
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
