package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 上传模板素材响应体。
 */
public class UploadAimTemplateMaterialResponseMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "material_id")

    private String materialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_resource_id")

    private String aimResourceId;

    public UploadAimTemplateMaterialResponseMode withMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }

    /**
     * 模板素材ID。
     * @return materialId
     */
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public UploadAimTemplateMaterialResponseMode withAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return aimResourceId
     */
    public String getAimResourceId() {
        return aimResourceId;
    }

    public void setAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadAimTemplateMaterialResponseMode uploadAimTemplateMaterialResponseMode =
            (UploadAimTemplateMaterialResponseMode) o;
        return Objects.equals(this.materialId, uploadAimTemplateMaterialResponseMode.materialId)
            && Objects.equals(this.aimResourceId, uploadAimTemplateMaterialResponseMode.aimResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialId, aimResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAimTemplateMaterialResponseMode {\n");
        sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
        sb.append("    aimResourceId: ").append(toIndentedString(aimResourceId)).append("\n");
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
