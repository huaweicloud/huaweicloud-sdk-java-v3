package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 目标
 */
public class ListCollectConfigResponseBodyTarget {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe")

    private String pipe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards")

    private BigDecimal shards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mode")

    private String storageMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private BigDecimal ttl;

    public ListCollectConfigResponseBodyTarget withPipe(String pipe) {
        this.pipe = pipe;
        return this;
    }

    /**
     * 管道
     * @return pipe
     */
    public String getPipe() {
        return pipe;
    }

    public void setPipe(String pipe) {
        this.pipe = pipe;
    }

    public ListCollectConfigResponseBodyTarget withShards(BigDecimal shards) {
        this.shards = shards;
        return this;
    }

    /**
     * 分片
     * minimum: 0
     * maximum: 1E+4
     * @return shards
     */
    public BigDecimal getShards() {
        return shards;
    }

    public void setShards(BigDecimal shards) {
        this.shards = shards;
    }

    public ListCollectConfigResponseBodyTarget withStorageMode(String storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    /**
     * 存储模式
     * @return storageMode
     */
    public String getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    public ListCollectConfigResponseBodyTarget withTtl(BigDecimal ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * ttl时间
     * minimum: 0
     * maximum: 3.6E+2
     * @return ttl
     */
    public BigDecimal getTtl() {
        return ttl;
    }

    public void setTtl(BigDecimal ttl) {
        this.ttl = ttl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponseBodyTarget that = (ListCollectConfigResponseBodyTarget) obj;
        return Objects.equals(this.pipe, that.pipe) && Objects.equals(this.shards, that.shards)
            && Objects.equals(this.storageMode, that.storageMode) && Objects.equals(this.ttl, that.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipe, shards, storageMode, ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponseBodyTarget {\n");
        sb.append("    pipe: ").append(toIndentedString(pipe)).append("\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
        sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
