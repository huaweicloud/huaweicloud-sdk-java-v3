package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * put_kv或delete_kv或get_kv操作。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperItem that = (OperItem) obj;
        return Objects.equals(this.putKv, that.putKv) && Objects.equals(this.deleteKv, that.deleteKv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(putKv, deleteKv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperItem {\n");
        sb.append("    putKv: ").append(toIndentedString(putKv)).append("\n");
        sb.append("    deleteKv: ").append(toIndentedString(deleteKv)).append("\n");
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
