package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 靶点口袋分子设计的靶点文件
 */
public class PocketMolDesignReceptorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private ReceptorDrugFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bounding_box")

    private BoundingBoxDto boundingBox;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_water")

    private Boolean removeWater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ion")

    private Boolean removeIon;

    public PocketMolDesignReceptorDto withFile(ReceptorDrugFile file) {
        this.file = file;
        return this;
    }

    public PocketMolDesignReceptorDto withFile(Consumer<ReceptorDrugFile> fileSetter) {
        if (this.file == null) {
            this.file = new ReceptorDrugFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public ReceptorDrugFile getFile() {
        return file;
    }

    public void setFile(ReceptorDrugFile file) {
        this.file = file;
    }

    public PocketMolDesignReceptorDto withBoundingBox(BoundingBoxDto boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public PocketMolDesignReceptorDto withBoundingBox(Consumer<BoundingBoxDto> boundingBoxSetter) {
        if (this.boundingBox == null) {
            this.boundingBox = new BoundingBoxDto();
            boundingBoxSetter.accept(this.boundingBox);
        }

        return this;
    }

    /**
     * Get boundingBox
     * @return boundingBox
     */
    public BoundingBoxDto getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBoxDto boundingBox) {
        this.boundingBox = boundingBox;
    }

    public PocketMolDesignReceptorDto withRemoveWater(Boolean removeWater) {
        this.removeWater = removeWater;
        return this;
    }

    /**
     * 去水
     * @return removeWater
     */
    public Boolean getRemoveWater() {
        return removeWater;
    }

    public void setRemoveWater(Boolean removeWater) {
        this.removeWater = removeWater;
    }

    public PocketMolDesignReceptorDto withRemoveIon(Boolean removeIon) {
        this.removeIon = removeIon;
        return this;
    }

    /**
     * 去离子
     * @return removeIon
     */
    public Boolean getRemoveIon() {
        return removeIon;
    }

    public void setRemoveIon(Boolean removeIon) {
        this.removeIon = removeIon;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PocketMolDesignReceptorDto that = (PocketMolDesignReceptorDto) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.boundingBox, that.boundingBox)
            && Objects.equals(this.removeWater, that.removeWater) && Objects.equals(this.removeIon, that.removeIon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, boundingBox, removeWater, removeIon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PocketMolDesignReceptorDto {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
        sb.append("    removeWater: ").append(toIndentedString(removeWater)).append("\n");
        sb.append("    removeIon: ").append(toIndentedString(removeIon)).append("\n");
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
