package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VolumeType
 */
public class VolumeType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_specs")

    private VolumeTypeExtraSpecs extraSpecs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_specs_id")

    private String qosSpecsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    public VolumeType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云硬盘类型的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumeType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云硬盘类型名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VolumeType withExtraSpecs(VolumeTypeExtraSpecs extraSpecs) {
        this.extraSpecs = extraSpecs;
        return this;
    }

    public VolumeType withExtraSpecs(Consumer<VolumeTypeExtraSpecs> extraSpecsSetter) {
        if (this.extraSpecs == null) {
            this.extraSpecs = new VolumeTypeExtraSpecs();
            extraSpecsSetter.accept(this.extraSpecs);
        }

        return this;
    }

    /**
     * Get extraSpecs
     * @return extraSpecs
     */
    public VolumeTypeExtraSpecs getExtraSpecs() {
        return extraSpecs;
    }

    public void setExtraSpecs(VolumeTypeExtraSpecs extraSpecs) {
        this.extraSpecs = extraSpecs;
    }

    public VolumeType withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 云硬盘类型的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VolumeType withQosSpecsId(String qosSpecsId) {
        this.qosSpecsId = qosSpecsId;
        return this;
    }

    /**
     * 预留属性。
     * @return qosSpecsId
     */
    public String getQosSpecsId() {
        return qosSpecsId;
    }

    public void setQosSpecsId(String qosSpecsId) {
        this.qosSpecsId = qosSpecsId;
    }

    public VolumeType withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * 预留属性。
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeType that = (VolumeType) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.extraSpecs, that.extraSpecs) && Objects.equals(this.description, that.description)
            && Objects.equals(this.qosSpecsId, that.qosSpecsId) && Objects.equals(this.isPublic, that.isPublic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, extraSpecs, description, qosSpecsId, isPublic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeType {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    extraSpecs: ").append(toIndentedString(extraSpecs)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    qosSpecsId: ").append(toIndentedString(qosSpecsId)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
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
