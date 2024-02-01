package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReduceVolumeRequestBody
 */
public class ReduceVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reduce_volume")

    private ReduceVolumeObject reduceVolume;

    public ReduceVolumeRequestBody withReduceVolume(ReduceVolumeObject reduceVolume) {
        this.reduceVolume = reduceVolume;
        return this;
    }

    public ReduceVolumeRequestBody withReduceVolume(Consumer<ReduceVolumeObject> reduceVolumeSetter) {
        if (this.reduceVolume == null) {
            this.reduceVolume = new ReduceVolumeObject();
            reduceVolumeSetter.accept(this.reduceVolume);
        }

        return this;
    }

    /**
     * Get reduceVolume
     * @return reduceVolume
     */
    public ReduceVolumeObject getReduceVolume() {
        return reduceVolume;
    }

    public void setReduceVolume(ReduceVolumeObject reduceVolume) {
        this.reduceVolume = reduceVolume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReduceVolumeRequestBody that = (ReduceVolumeRequestBody) obj;
        return Objects.equals(this.reduceVolume, that.reduceVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reduceVolume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReduceVolumeRequestBody {\n");
        sb.append("    reduceVolume: ").append(toIndentedString(reduceVolume)).append("\n");
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
