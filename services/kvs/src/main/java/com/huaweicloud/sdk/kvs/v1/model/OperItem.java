package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * put_kv或delete_kv或update_kv操作。
 */
public class OperItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "put_kv")
    @BsonProperty(value = "put_kv")

    private PutKv putKv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_kv")
    @BsonProperty(value = "delete_kv")

    private DeleteKv deleteKv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_kv")
    @BsonProperty(value = "update_kv")

    private UpdateKv updateKv;

    public OperItem withPutKv(PutKv putKv) {
        this.putKv = putKv;
        return this;
    }

    public OperItem withPutKv(Consumer<PutKv> putKvSetter) {
        if (this.putKv == null) {
            this.putKv = new PutKv();
            putKvSetter.accept(this.putKv);
        }

        return this;
    }

    /**
     * Get putKv
     * @return putKv
     */
    public PutKv getPutKv() {
        return putKv;
    }

    public void setPutKv(PutKv putKv) {
        this.putKv = putKv;
    }

    public OperItem withDeleteKv(DeleteKv deleteKv) {
        this.deleteKv = deleteKv;
        return this;
    }

    public OperItem withDeleteKv(Consumer<DeleteKv> deleteKvSetter) {
        if (this.deleteKv == null) {
            this.deleteKv = new DeleteKv();
            deleteKvSetter.accept(this.deleteKv);
        }

        return this;
    }

    /**
     * Get deleteKv
     * @return deleteKv
     */
    public DeleteKv getDeleteKv() {
        return deleteKv;
    }

    public void setDeleteKv(DeleteKv deleteKv) {
        this.deleteKv = deleteKv;
    }

    public OperItem withUpdateKv(UpdateKv updateKv) {
        this.updateKv = updateKv;
        return this;
    }

    public OperItem withUpdateKv(Consumer<UpdateKv> updateKvSetter) {
        if (this.updateKv == null) {
            this.updateKv = new UpdateKv();
            updateKvSetter.accept(this.updateKv);
        }

        return this;
    }

    /**
     * Get updateKv
     * @return updateKv
     */
    public UpdateKv getUpdateKv() {
        return updateKv;
    }

    public void setUpdateKv(UpdateKv updateKv) {
        this.updateKv = updateKv;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperItem that = (OperItem) obj;
        return Objects.equals(this.putKv, that.putKv) && Objects.equals(this.deleteKv, that.deleteKv)
            && Objects.equals(this.updateKv, that.updateKv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(putKv, deleteKv, updateKv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperItem {\n");
        sb.append("    putKv: ").append(toIndentedString(putKv)).append("\n");
        sb.append("    deleteKv: ").append(toIndentedString(deleteKv)).append("\n");
        sb.append("    updateKv: ").append(toIndentedString(updateKv)).append("\n");
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
