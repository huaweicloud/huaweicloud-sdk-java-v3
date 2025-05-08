package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * KvOperIds
 */
public class KvOperIds {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "put_kv_ids")
    @BsonProperty(value = "put_kv_ids")

    private List<Integer> putKvIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_kv_ids")
    @BsonProperty(value = "delete_kv_ids")

    private List<Integer> deleteKvIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_kv_ids")
    @BsonProperty(value = "update_kv_ids")

    private List<Integer> updateKvIds = null;

    public KvOperIds withPutKvIds(List<Integer> putKvIds) {
        this.putKvIds = putKvIds;
        return this;
    }

    public KvOperIds addPutKvIdsItem(Integer putKvIdsItem) {
        if (this.putKvIds == null) {
            this.putKvIds = new ArrayList<>();
        }
        this.putKvIds.add(putKvIdsItem);
        return this;
    }

    public KvOperIds withPutKvIds(Consumer<List<Integer>> putKvIdsSetter) {
        if (this.putKvIds == null) {
            this.putKvIds = new ArrayList<>();
        }
        putKvIdsSetter.accept(this.putKvIds);
        return this;
    }

    /**
     * 上传kv操作, \"oper_id\"数组。 - 数组元素：请求内的操作编码，未成功的操作返回该标识。
     * @return putKvIds
     */
    public List<Integer> getPutKvIds() {
        return putKvIds;
    }

    public void setPutKvIds(List<Integer> putKvIds) {
        this.putKvIds = putKvIds;
    }

    public KvOperIds withDeleteKvIds(List<Integer> deleteKvIds) {
        this.deleteKvIds = deleteKvIds;
        return this;
    }

    public KvOperIds addDeleteKvIdsItem(Integer deleteKvIdsItem) {
        if (this.deleteKvIds == null) {
            this.deleteKvIds = new ArrayList<>();
        }
        this.deleteKvIds.add(deleteKvIdsItem);
        return this;
    }

    public KvOperIds withDeleteKvIds(Consumer<List<Integer>> deleteKvIdsSetter) {
        if (this.deleteKvIds == null) {
            this.deleteKvIds = new ArrayList<>();
        }
        deleteKvIdsSetter.accept(this.deleteKvIds);
        return this;
    }

    /**
     * 请求内的操作编码，未成功的操作返回该标识。 - 数组元素：请求内的操作编码，未成功的操作返回该标识。
     * @return deleteKvIds
     */
    public List<Integer> getDeleteKvIds() {
        return deleteKvIds;
    }

    public void setDeleteKvIds(List<Integer> deleteKvIds) {
        this.deleteKvIds = deleteKvIds;
    }

    public KvOperIds withUpdateKvIds(List<Integer> updateKvIds) {
        this.updateKvIds = updateKvIds;
        return this;
    }

    public KvOperIds addUpdateKvIdsItem(Integer updateKvIdsItem) {
        if (this.updateKvIds == null) {
            this.updateKvIds = new ArrayList<>();
        }
        this.updateKvIds.add(updateKvIdsItem);
        return this;
    }

    public KvOperIds withUpdateKvIds(Consumer<List<Integer>> updateKvIdsSetter) {
        if (this.updateKvIds == null) {
            this.updateKvIds = new ArrayList<>();
        }
        updateKvIdsSetter.accept(this.updateKvIds);
        return this;
    }

    /**
     * 请求内的操作编码，未成功的操作返回该标识。 - 数组元素：请求内的操作编码，未成功的操作返回该标识。
     * @return updateKvIds
     */
    public List<Integer> getUpdateKvIds() {
        return updateKvIds;
    }

    public void setUpdateKvIds(List<Integer> updateKvIds) {
        this.updateKvIds = updateKvIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KvOperIds that = (KvOperIds) obj;
        return Objects.equals(this.putKvIds, that.putKvIds) && Objects.equals(this.deleteKvIds, that.deleteKvIds)
            && Objects.equals(this.updateKvIds, that.updateKvIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(putKvIds, deleteKvIds, updateKvIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KvOperIds {\n");
        sb.append("    putKvIds: ").append(toIndentedString(putKvIds)).append("\n");
        sb.append("    deleteKvIds: ").append(toIndentedString(deleteKvIds)).append("\n");
        sb.append("    updateKvIds: ").append(toIndentedString(updateKvIds)).append("\n");
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
