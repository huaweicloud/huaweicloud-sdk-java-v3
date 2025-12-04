package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Aom
 */
public class Aom {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceID")

    private String instanceID;

    public Aom withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * AOM实例ID。
     * @return instanceID
     */
    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aom that = (Aom) obj;
        return Objects.equals(this.instanceID, that.instanceID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Aom {\n");
        sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
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
