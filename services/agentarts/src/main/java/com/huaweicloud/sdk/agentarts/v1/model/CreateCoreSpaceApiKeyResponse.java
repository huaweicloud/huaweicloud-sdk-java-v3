package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateCoreSpaceApiKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key")

    private String apiKey;

    public CreateCoreSpaceApiKeyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** API Key ID，唯一标识一个 API Key，可通过\"创建 API Key\"接口获取。用于创建space时，指定入参api_key_id。 **取值范围：** 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateCoreSpaceApiKeyResponse withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * **参数解释：** API Key 明文（仅创建时返回一次，请妥善保存）。用于调用数据面API时的接口认证，请求头如下：Authorization: Bearer ${api_key}。 **取值范围：** 不涉及。 
     * @return apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreSpaceApiKeyResponse that = (CreateCoreSpaceApiKeyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.apiKey, that.apiKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apiKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreSpaceApiKeyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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
