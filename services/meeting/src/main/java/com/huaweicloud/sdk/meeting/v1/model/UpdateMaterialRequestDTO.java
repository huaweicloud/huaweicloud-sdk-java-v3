package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 信息窗素材信息。
 */
public class UpdateMaterialRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "materialName")

    private String materialName;

    public UpdateMaterialRequestDTO withMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }

    /**
     * 素材名称。
     * @return materialName
     */
    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMaterialRequestDTO updateMaterialRequestDTO = (UpdateMaterialRequestDTO) o;
        return Objects.equals(this.materialName, updateMaterialRequestDTO.materialName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMaterialRequestDTO {\n");
        sb.append("    materialName: ").append(toIndentedString(materialName)).append("\n");
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
