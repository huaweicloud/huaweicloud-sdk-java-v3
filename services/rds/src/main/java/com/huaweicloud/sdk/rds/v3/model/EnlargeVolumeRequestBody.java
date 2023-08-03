package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EnlargeVolumeRequestBody
 */
public class EnlargeVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enlarge_volume")

    private EnlargeVolumeObject enlargeVolume;

    public EnlargeVolumeRequestBody withEnlargeVolume(EnlargeVolumeObject enlargeVolume) {
        this.enlargeVolume = enlargeVolume;
        return this;
    }

    public EnlargeVolumeRequestBody withEnlargeVolume(Consumer<EnlargeVolumeObject> enlargeVolumeSetter) {
        if (this.enlargeVolume == null) {
            this.enlargeVolume = new EnlargeVolumeObject();
            enlargeVolumeSetter.accept(this.enlargeVolume);
        }

        return this;
    }

    /**
     * Get enlargeVolume
     * @return enlargeVolume
     */
    public EnlargeVolumeObject getEnlargeVolume() {
        return enlargeVolume;
    }

    public void setEnlargeVolume(EnlargeVolumeObject enlargeVolume) {
        this.enlargeVolume = enlargeVolume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnlargeVolumeRequestBody that = (EnlargeVolumeRequestBody) obj;
        return Objects.equals(this.enlargeVolume, that.enlargeVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enlargeVolume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnlargeVolumeRequestBody {\n");
        sb.append("    enlargeVolume: ").append(toIndentedString(enlargeVolume)).append("\n");
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
