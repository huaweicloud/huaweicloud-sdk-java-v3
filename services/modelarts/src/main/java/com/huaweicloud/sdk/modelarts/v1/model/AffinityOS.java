package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Modelarts内置操作系统。
 */
public class AffinityOS {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageId")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferred")

    private Boolean preferred;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eos")

    private Boolean eos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline")

    private Boolean offline;

    public AffinityOS withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：操作系统名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AffinityOS withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：操作系统镜像id, 裸金属规格该字段不为空。 **取值范围**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public AffinityOS withPreferred(Boolean preferred) {
        this.preferred = preferred;
        return this;
    }

    /**
     * **参数解释**：是否优选。 **取值范围**：不涉及。
     * @return preferred
     */
    public Boolean getPreferred() {
        return preferred;
    }

    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    public AffinityOS withEos(Boolean eos) {
        this.eos = eos;
        return this;
    }

    /**
     * **参数解释**：操作系统是否即将停止服务, end of service。 **取值范围**：不涉及。
     * @return eos
     */
    public Boolean getEos() {
        return eos;
    }

    public void setEos(Boolean eos) {
        this.eos = eos;
    }

    public AffinityOS withOffline(Boolean offline) {
        this.offline = offline;
        return this;
    }

    /**
     * **参数解释**：操作系统是否下线。 **取值范围**：不涉及
     * @return offline
     */
    public Boolean getOffline() {
        return offline;
    }

    public void setOffline(Boolean offline) {
        this.offline = offline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AffinityOS that = (AffinityOS) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.preferred, that.preferred) && Objects.equals(this.eos, that.eos)
            && Objects.equals(this.offline, that.offline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageId, preferred, eos, offline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AffinityOS {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
        sb.append("    eos: ").append(toIndentedString(eos)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
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
