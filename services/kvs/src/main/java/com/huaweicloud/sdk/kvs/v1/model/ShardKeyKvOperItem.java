package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShardKeyKvOperItem
 */
public class ShardKeyKvOperItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_shard_key_kv")
    @BsonProperty(value = "check_shard_key_kv")

    private CheckShardKeyKv checkShardKeyKv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "put_shard_key_kv")
    @BsonProperty(value = "put_shard_key_kv")

    private PutShardKeyKv putShardKeyKv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_shard_key_kv")
    @BsonProperty(value = "delete_shard_key_kv")

    private DeleteShardKeyKv deleteShardKeyKv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_shard_key_kv")
    @BsonProperty(value = "update_shard_key_kv")

    private UpdateShardKeyKv updateShardKeyKv;

    public ShardKeyKvOperItem withCheckShardKeyKv(CheckShardKeyKv checkShardKeyKv) {
        this.checkShardKeyKv = checkShardKeyKv;
        return this;
    }

    public ShardKeyKvOperItem withCheckShardKeyKv(Consumer<CheckShardKeyKv> checkShardKeyKvSetter) {
        if (this.checkShardKeyKv == null) {
            this.checkShardKeyKv = new CheckShardKeyKv();
            checkShardKeyKvSetter.accept(this.checkShardKeyKv);
        }

        return this;
    }

    /**
     * Get checkShardKeyKv
     * @return checkShardKeyKv
     */
    public CheckShardKeyKv getCheckShardKeyKv() {
        return checkShardKeyKv;
    }

    public void setCheckShardKeyKv(CheckShardKeyKv checkShardKeyKv) {
        this.checkShardKeyKv = checkShardKeyKv;
    }

    public ShardKeyKvOperItem withPutShardKeyKv(PutShardKeyKv putShardKeyKv) {
        this.putShardKeyKv = putShardKeyKv;
        return this;
    }

    public ShardKeyKvOperItem withPutShardKeyKv(Consumer<PutShardKeyKv> putShardKeyKvSetter) {
        if (this.putShardKeyKv == null) {
            this.putShardKeyKv = new PutShardKeyKv();
            putShardKeyKvSetter.accept(this.putShardKeyKv);
        }

        return this;
    }

    /**
     * Get putShardKeyKv
     * @return putShardKeyKv
     */
    public PutShardKeyKv getPutShardKeyKv() {
        return putShardKeyKv;
    }

    public void setPutShardKeyKv(PutShardKeyKv putShardKeyKv) {
        this.putShardKeyKv = putShardKeyKv;
    }

    public ShardKeyKvOperItem withDeleteShardKeyKv(DeleteShardKeyKv deleteShardKeyKv) {
        this.deleteShardKeyKv = deleteShardKeyKv;
        return this;
    }

    public ShardKeyKvOperItem withDeleteShardKeyKv(Consumer<DeleteShardKeyKv> deleteShardKeyKvSetter) {
        if (this.deleteShardKeyKv == null) {
            this.deleteShardKeyKv = new DeleteShardKeyKv();
            deleteShardKeyKvSetter.accept(this.deleteShardKeyKv);
        }

        return this;
    }

    /**
     * Get deleteShardKeyKv
     * @return deleteShardKeyKv
     */
    public DeleteShardKeyKv getDeleteShardKeyKv() {
        return deleteShardKeyKv;
    }

    public void setDeleteShardKeyKv(DeleteShardKeyKv deleteShardKeyKv) {
        this.deleteShardKeyKv = deleteShardKeyKv;
    }

    public ShardKeyKvOperItem withUpdateShardKeyKv(UpdateShardKeyKv updateShardKeyKv) {
        this.updateShardKeyKv = updateShardKeyKv;
        return this;
    }

    public ShardKeyKvOperItem withUpdateShardKeyKv(Consumer<UpdateShardKeyKv> updateShardKeyKvSetter) {
        if (this.updateShardKeyKv == null) {
            this.updateShardKeyKv = new UpdateShardKeyKv();
            updateShardKeyKvSetter.accept(this.updateShardKeyKv);
        }

        return this;
    }

    /**
     * Get updateShardKeyKv
     * @return updateShardKeyKv
     */
    public UpdateShardKeyKv getUpdateShardKeyKv() {
        return updateShardKeyKv;
    }

    public void setUpdateShardKeyKv(UpdateShardKeyKv updateShardKeyKv) {
        this.updateShardKeyKv = updateShardKeyKv;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShardKeyKvOperItem that = (ShardKeyKvOperItem) obj;
        return Objects.equals(this.checkShardKeyKv, that.checkShardKeyKv)
            && Objects.equals(this.putShardKeyKv, that.putShardKeyKv)
            && Objects.equals(this.deleteShardKeyKv, that.deleteShardKeyKv)
            && Objects.equals(this.updateShardKeyKv, that.updateShardKeyKv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkShardKeyKv, putShardKeyKv, deleteShardKeyKv, updateShardKeyKv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShardKeyKvOperItem {\n");
        sb.append("    checkShardKeyKv: ").append(toIndentedString(checkShardKeyKv)).append("\n");
        sb.append("    putShardKeyKv: ").append(toIndentedString(putShardKeyKv)).append("\n");
        sb.append("    deleteShardKeyKv: ").append(toIndentedString(deleteShardKeyKv)).append("\n");
        sb.append("    updateShardKeyKv: ").append(toIndentedString(updateShardKeyKv)).append("\n");
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
