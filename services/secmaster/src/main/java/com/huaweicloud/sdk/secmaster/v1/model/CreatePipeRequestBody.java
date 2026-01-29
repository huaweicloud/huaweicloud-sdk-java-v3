package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePipeRequestBody
 */
public class CreatePipeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_id")

    private String dataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping")

    private Map<String, KeyIndex> mapping = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_name")

    private String pipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards")

    private Integer shards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_period")

    private Integer storagePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_field")

    private String timestampField;

    public CreatePipeRequestBody withDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return dataspaceId
     */
    public String getDataspaceId() {
        return dataspaceId;
    }

    public void setDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
    }

    public CreatePipeRequestBody withDescription(String description) {
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

    public CreatePipeRequestBody withMapping(Map<String, KeyIndex> mapping) {
        this.mapping = mapping;
        return this;
    }

    public CreatePipeRequestBody putMappingItem(String key, KeyIndex mappingItem) {
        if (this.mapping == null) {
            this.mapping = new HashMap<>();
        }
        this.mapping.put(key, mappingItem);
        return this;
    }

    public CreatePipeRequestBody withMapping(Consumer<Map<String, KeyIndex>> mappingSetter) {
        if (this.mapping == null) {
            this.mapping = new HashMap<>();
        }
        mappingSetter.accept(this.mapping);
        return this;
    }

    /**
     * 索引字段映射；每个key对象承载一个字段的信息；存在多个key对象，key可变，表示字段名称；可嵌套
     * @return mapping
     */
    public Map<String, KeyIndex> getMapping() {
        return mapping;
    }

    public void setMapping(Map<String, KeyIndex> mapping) {
        this.mapping = mapping;
    }

    public CreatePipeRequestBody withPipeName(String pipeName) {
        this.pipeName = pipeName;
        return this;
    }

    /**
     * 数据管道名称；必须以英文字母开头，且只能包含小写英文字母、数字和'_'，且'_'不能在结尾，也不能连续出现。 不能以系统预留的前缀isap_、csb_、secmaster_、sec_、s_sec_、i_sec_、l_sec_、security_开头
     * @return pipeName
     */
    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public CreatePipeRequestBody withShards(Integer shards) {
        this.shards = shards;
        return this;
    }

    /**
     * 数据管道分区个数；默认创建1个，最大支持创建64个分区
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

    public CreatePipeRequestBody withStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }

    /**
     * 数据的保存时间，单位为天；默认30天，取值范围为7~180. 配置180天需提工单申请
     * minimum: 7
     * maximum: 180
     * @return storagePeriod
     */
    public Integer getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public CreatePipeRequestBody withTimestampField(String timestampField) {
        this.timestampField = timestampField;
        return this;
    }

    /**
     * 时间戳字段
     * @return timestampField
     */
    public String getTimestampField() {
        return timestampField;
    }

    public void setTimestampField(String timestampField) {
        this.timestampField = timestampField;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePipeRequestBody that = (CreatePipeRequestBody) obj;
        return Objects.equals(this.dataspaceId, that.dataspaceId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.mapping, that.mapping) && Objects.equals(this.pipeName, that.pipeName)
            && Objects.equals(this.shards, that.shards) && Objects.equals(this.storagePeriod, that.storagePeriod)
            && Objects.equals(this.timestampField, that.timestampField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataspaceId, description, mapping, pipeName, shards, storagePeriod, timestampField);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePipeRequestBody {\n");
        sb.append("    dataspaceId: ").append(toIndentedString(dataspaceId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
        sb.append("    pipeName: ").append(toIndentedString(pipeName)).append("\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
        sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
        sb.append("    timestampField: ").append(toIndentedString(timestampField)).append("\n");
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
