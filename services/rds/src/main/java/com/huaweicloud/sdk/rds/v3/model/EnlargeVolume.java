package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EnlargeVolume
 */
public class EnlargeVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enlarge_volume")

    @JacksonXmlProperty(localName = "enlarge_volume")

    private EnlargeVolumeObject enlargeVolume;

    public EnlargeVolume withEnlargeVolume(EnlargeVolumeObject enlargeVolume) {
        this.enlargeVolume = enlargeVolume;
        return this;
    }

    public EnlargeVolume withEnlargeVolume(Consumer<EnlargeVolumeObject> enlargeVolumeSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnlargeVolume enlargeVolume = (EnlargeVolume) o;
        return Objects.equals(this.enlargeVolume, enlargeVolume.enlargeVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enlargeVolume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnlargeVolume {\n");
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
