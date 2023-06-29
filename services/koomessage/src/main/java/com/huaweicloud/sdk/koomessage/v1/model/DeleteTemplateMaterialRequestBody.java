package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteTemplateMaterialRequestBody
 */
public class DeleteTemplateMaterialRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "material_ids")

    private List<String> materialIds = null;

    public DeleteTemplateMaterialRequestBody withMaterialIds(List<String> materialIds) {
        this.materialIds = materialIds;
        return this;
    }

    public DeleteTemplateMaterialRequestBody addMaterialIdsItem(String materialIdsItem) {
        if (this.materialIds == null) {
            this.materialIds = new ArrayList<>();
        }
        this.materialIds.add(materialIdsItem);
        return this;
    }

    public DeleteTemplateMaterialRequestBody withMaterialIds(Consumer<List<String>> materialIdsSetter) {
        if (this.materialIds == null) {
            this.materialIds = new ArrayList<>();
        }
        materialIdsSetter.accept(this.materialIds);
        return this;
    }

    /**
     * 模板素材ID数组。
     * @return materialIds
     */
    public List<String> getMaterialIds() {
        return materialIds;
    }

    public void setMaterialIds(List<String> materialIds) {
        this.materialIds = materialIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTemplateMaterialRequestBody that = (DeleteTemplateMaterialRequestBody) obj;
        return Objects.equals(this.materialIds, that.materialIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTemplateMaterialRequestBody {\n");
        sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
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
