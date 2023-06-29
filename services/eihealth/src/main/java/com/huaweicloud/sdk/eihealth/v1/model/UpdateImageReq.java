package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新镜像请求体
 */
public class UpdateImageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private ImageType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chip_type")

    private ImageChipType chipType;

    public UpdateImageReq withType(ImageType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public ImageType getType() {
        return type;
    }

    public void setType(ImageType type) {
        this.type = type;
    }

    public UpdateImageReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateImageReq withChipType(ImageChipType chipType) {
        this.chipType = chipType;
        return this;
    }

    /**
     * Get chipType
     * @return chipType
     */
    public ImageChipType getChipType() {
        return chipType;
    }

    public void setChipType(ImageChipType chipType) {
        this.chipType = chipType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateImageReq that = (UpdateImageReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.chipType, that.chipType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, description, chipType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateImageReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    chipType: ").append(toIndentedString(chipType)).append("\n");
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
