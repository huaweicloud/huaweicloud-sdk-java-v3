package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 升级包的位置
 */
public class FileLocation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_location")

    private ObsLocation obsLocation;

    public FileLocation withObsLocation(ObsLocation obsLocation) {
        this.obsLocation = obsLocation;
        return this;
    }

    public FileLocation withObsLocation(Consumer<ObsLocation> obsLocationSetter) {
        if (this.obsLocation == null) {
            this.obsLocation = new ObsLocation();
            obsLocationSetter.accept(this.obsLocation);
        }

        return this;
    }

    /**
     * Get obsLocation
     * @return obsLocation
     */
    public ObsLocation getObsLocation() {
        return obsLocation;
    }

    public void setObsLocation(ObsLocation obsLocation) {
        this.obsLocation = obsLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileLocation that = (FileLocation) obj;
        return Objects.equals(this.obsLocation, that.obsLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileLocation {\n");
        sb.append("    obsLocation: ").append(toIndentedString(obsLocation)).append("\n");
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
