package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * DeleteKv
 */
public class DeleteKv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_id")
    @BsonProperty(value = "oper_id")

    private Integer operId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")
    @BsonProperty(value = "primary_key")

    private Document primaryKey;

    public DeleteKv withOperId(Integer operId) {
        this.operId = operId;
        return this;
    }

    /**
     * 请求内的操作编码，未成功的操作返回该标识。
     * @return operId
     */
    public Integer getOperId() {
        return operId;
    }

    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    public DeleteKv withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * 用户自定义的主键名及值。
     * @return primaryKey
     */
    public Document getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteKv that = (DeleteKv) obj;
        return Objects.equals(this.operId, that.operId) && Objects.equals(this.primaryKey, that.primaryKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operId, primaryKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteKv {\n");
        sb.append("    operId: ").append(toIndentedString(operId)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
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
