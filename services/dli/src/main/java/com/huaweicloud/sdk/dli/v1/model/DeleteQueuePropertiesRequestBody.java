package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 待删除属性
 */
public class DeleteQueuePropertiesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private List<String> keys = null;

    public DeleteQueuePropertiesRequestBody withKeys(List<String> keys) {
        this.keys = keys;
        return this;
    }

    public DeleteQueuePropertiesRequestBody addKeysItem(String keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    public DeleteQueuePropertiesRequestBody withKeys(Consumer<List<String>> keysSetter) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        keysSetter.accept(this.keys);
        return this;
    }

    /**
     * 待删除队列属性key值。 范围如下： computeEngine.maxInstance computeEngine.maxPrefetchInstance job.maxConcurrent
     * @return keys
     */
    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteQueuePropertiesRequestBody that = (DeleteQueuePropertiesRequestBody) obj;
        return Objects.equals(this.keys, that.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteQueuePropertiesRequestBody {\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
