package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class RestoreDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_path")

    private String destinationPath;

    public RestoreDetails withDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }

    /**
     * 目的路径
     * @return destinationPath
     */
    public String getDestinationPath() {
        return destinationPath;
    }

    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreDetails that = (RestoreDetails) obj;
        return Objects.equals(this.destinationPath, that.destinationPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreDetails {\n");
        sb.append("    destinationPath: ").append(toIndentedString(destinationPath)).append("\n");
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
