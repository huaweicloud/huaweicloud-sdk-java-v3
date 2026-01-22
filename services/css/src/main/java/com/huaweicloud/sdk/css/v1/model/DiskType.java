package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 磁盘类型。 **取值范围**： 不涉及
 */
public class DiskType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availabilityZone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeNames")

    private List<String> volumeNames = null;

    public DiskType withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**： 可用区。 **取值范围**： 不涉及
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public DiskType withVolumeNames(List<String> volumeNames) {
        this.volumeNames = volumeNames;
        return this;
    }

    public DiskType addVolumeNamesItem(String volumeNamesItem) {
        if (this.volumeNames == null) {
            this.volumeNames = new ArrayList<>();
        }
        this.volumeNames.add(volumeNamesItem);
        return this;
    }

    public DiskType withVolumeNames(Consumer<List<String>> volumeNamesSetter) {
        if (this.volumeNames == null) {
            this.volumeNames = new ArrayList<>();
        }
        volumeNamesSetter.accept(this.volumeNames);
        return this;
    }

    /**
     * **参数解释**： 磁盘类型。 **取值范围**： - SATA：普通IO - SAS：高IO - SSD：超高IO - ESSD：极速型SSD
     * @return volumeNames
     */
    public List<String> getVolumeNames() {
        return volumeNames;
    }

    public void setVolumeNames(List<String> volumeNames) {
        this.volumeNames = volumeNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskType that = (DiskType) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.volumeNames, that.volumeNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, volumeNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskType {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    volumeNames: ").append(toIndentedString(volumeNames)).append("\n");
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
