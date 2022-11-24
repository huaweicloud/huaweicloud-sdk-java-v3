package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 域名复制请求体
 */
public class BatchCopyDRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private BatchCopyConfigs configs;

    public BatchCopyDRequestBody withConfigs(BatchCopyConfigs configs) {
        this.configs = configs;
        return this;
    }

    public BatchCopyDRequestBody withConfigs(Consumer<BatchCopyConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new BatchCopyConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public BatchCopyConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(BatchCopyConfigs configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCopyDRequestBody batchCopyDRequestBody = (BatchCopyDRequestBody) o;
        return Objects.equals(this.configs, batchCopyDRequestBody.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCopyDRequestBody {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
