package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class RestoreClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore")

    @JacksonXmlProperty(localName = "restore")

    private Restore restore;

    public RestoreClusterRequestBody withRestore(Restore restore) {
        this.restore = restore;
        return this;
    }

    public RestoreClusterRequestBody withRestore(Consumer<Restore> restoreSetter) {
        if (this.restore == null) {
            this.restore = new Restore();
            restoreSetter.accept(this.restore);
        }

        return this;
    }

    /**
     * Get restore
     * @return restore
     */
    public Restore getRestore() {
        return restore;
    }

    public void setRestore(Restore restore) {
        this.restore = restore;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreClusterRequestBody restoreClusterRequestBody = (RestoreClusterRequestBody) o;
        return Objects.equals(this.restore, restoreClusterRequestBody.restore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreClusterRequestBody {\n");
        sb.append("    restore: ").append(toIndentedString(restore)).append("\n");
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
