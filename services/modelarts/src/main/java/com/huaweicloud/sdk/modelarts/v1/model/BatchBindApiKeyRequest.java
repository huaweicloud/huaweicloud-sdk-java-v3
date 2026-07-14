package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchBindApiKeyRequest
 */
public class BatchBindApiKeyRequest implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_ids")

    private List<BatchBindApiKeyRequestKeyIds> keyIds = null;

    public BatchBindApiKeyRequest withKeyIds(List<BatchBindApiKeyRequestKeyIds> keyIds) {
        this.keyIds = keyIds;
        return this;
    }

    public BatchBindApiKeyRequest addKeyIdsItem(BatchBindApiKeyRequestKeyIds keyIdsItem) {
        if (this.keyIds == null) {
            this.keyIds = new ArrayList<>();
        }
        this.keyIds.add(keyIdsItem);
        return this;
    }

    public BatchBindApiKeyRequest withKeyIds(Consumer<List<BatchBindApiKeyRequestKeyIds>> keyIdsSetter) {
        if (this.keyIds == null) {
            this.keyIds = new ArrayList<>();
        }
        keyIdsSetter.accept(this.keyIds);
        return this;
    }

    /**
     * **参数解释：** 请求批量绑定的api-key的id数组。 **约束限制：** 请求批量绑定api-key的id个数不超过10个。
     * @return keyIds
     */
    public List<BatchBindApiKeyRequestKeyIds> getKeyIds() {
        return keyIds;
    }

    public void setKeyIds(List<BatchBindApiKeyRequestKeyIds> keyIds) {
        this.keyIds = keyIds;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("key_ids", new FormDataPart<>(keyIds));
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchBindApiKeyRequest that = (BatchBindApiKeyRequest) obj;
        return Objects.equals(this.keyIds, that.keyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBindApiKeyRequest {\n");
        sb.append("    keyIds: ").append(toIndentedString(keyIds)).append("\n");
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
