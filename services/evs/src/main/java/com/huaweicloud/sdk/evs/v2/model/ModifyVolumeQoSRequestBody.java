package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ModifyVolumeQoSRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_modify")

    private ModifyVolumeQoSOption qosModify;

    public ModifyVolumeQoSRequestBody withQosModify(ModifyVolumeQoSOption qosModify) {
        this.qosModify = qosModify;
        return this;
    }

    public ModifyVolumeQoSRequestBody withQosModify(Consumer<ModifyVolumeQoSOption> qosModifySetter) {
        if (this.qosModify == null) {
            this.qosModify = new ModifyVolumeQoSOption();
            qosModifySetter.accept(this.qosModify);
        }

        return this;
    }

    /**
     * Get qosModify
     * @return qosModify
     */
    public ModifyVolumeQoSOption getQosModify() {
        return qosModify;
    }

    public void setQosModify(ModifyVolumeQoSOption qosModify) {
        this.qosModify = qosModify;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyVolumeQoSRequestBody that = (ModifyVolumeQoSRequestBody) obj;
        return Objects.equals(this.qosModify, that.qosModify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qosModify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyVolumeQoSRequestBody {\n");
        sb.append("    qosModify: ").append(toIndentedString(qosModify)).append("\n");
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
