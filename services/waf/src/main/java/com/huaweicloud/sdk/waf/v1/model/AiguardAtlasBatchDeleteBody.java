package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AiguardAtlasBatchDeleteBody
 */
public class AiguardAtlasBatchDeleteBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atlas_ids")

    private List<String> atlasIds = null;

    public AiguardAtlasBatchDeleteBody withAtlasIds(List<String> atlasIds) {
        this.atlasIds = atlasIds;
        return this;
    }

    public AiguardAtlasBatchDeleteBody addAtlasIdsItem(String atlasIdsItem) {
        if (this.atlasIds == null) {
            this.atlasIds = new ArrayList<>();
        }
        this.atlasIds.add(atlasIdsItem);
        return this;
    }

    public AiguardAtlasBatchDeleteBody withAtlasIds(Consumer<List<String>> atlasIdsSetter) {
        if (this.atlasIds == null) {
            this.atlasIds = new ArrayList<>();
        }
        atlasIdsSetter.accept(this.atlasIds);
        return this;
    }

    /**
     * 图库ID列表
     * @return atlasIds
     */
    public List<String> getAtlasIds() {
        return atlasIds;
    }

    public void setAtlasIds(List<String> atlasIds) {
        this.atlasIds = atlasIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiguardAtlasBatchDeleteBody that = (AiguardAtlasBatchDeleteBody) obj;
        return Objects.equals(this.atlasIds, that.atlasIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atlasIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiguardAtlasBatchDeleteBody {\n");
        sb.append("    atlasIds: ").append(toIndentedString(atlasIds)).append("\n");
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
