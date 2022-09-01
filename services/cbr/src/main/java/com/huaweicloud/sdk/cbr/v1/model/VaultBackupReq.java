package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VaultBackupReq
 */
public class VaultBackupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint")

    @JacksonXmlProperty(localName = "checkpoint")

    private VaultBackup checkpoint;

    public VaultBackupReq withCheckpoint(VaultBackup checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }

    public VaultBackupReq withCheckpoint(Consumer<VaultBackup> checkpointSetter) {
        if (this.checkpoint == null) {
            this.checkpoint = new VaultBackup();
            checkpointSetter.accept(this.checkpoint);
        }

        return this;
    }

    /**
     * Get checkpoint
     * @return checkpoint
     */
    public VaultBackup getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(VaultBackup checkpoint) {
        this.checkpoint = checkpoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultBackupReq vaultBackupReq = (VaultBackupReq) o;
        return Objects.equals(this.checkpoint, vaultBackupReq.checkpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultBackupReq {\n");
        sb.append("    checkpoint: ").append(toIndentedString(checkpoint)).append("\n");
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
