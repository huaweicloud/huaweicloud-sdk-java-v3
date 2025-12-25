package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePipeRequestBody
 */
public class UpdatePipeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards")

    private Integer shards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_period")

    private Integer storagePeriod;

    public UpdatePipeRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePipeRequestBody withShards(Integer shards) {
        this.shards = shards;
        return this;
    }

    /**
     * 分区个数；默认创建1个，最大支持创建10个分区
     * minimum: 1
     * maximum: 64
     * @return shards
     */
    public Integer getShards() {
        return shards;
    }

    public void setShards(Integer shards) {
        this.shards = shards;
    }

    public UpdatePipeRequestBody withStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }

    /**
     * 数据的保存时间，单位为天；默认30天，取值范围为1~3600
     * minimum: 1
     * maximum: 3600
     * @return storagePeriod
     */
    public Integer getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePipeRequestBody that = (UpdatePipeRequestBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.shards, that.shards)
            && Objects.equals(this.storagePeriod, that.storagePeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, shards, storagePeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePipeRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
        sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
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
