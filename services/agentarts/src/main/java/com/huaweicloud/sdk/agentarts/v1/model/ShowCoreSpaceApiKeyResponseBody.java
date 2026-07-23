package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** Space 关联的 API Key 脱敏信息。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class ShowCoreSpaceApiKeyResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masked_key")

    private String maskedKey;

    public ShowCoreSpaceApiKeyResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** API Key ID。 **取值范围：** 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowCoreSpaceApiKeyResponseBody withMaskedKey(String maskedKey) {
        this.maskedKey = maskedKey;
        return this;
    }

    /**
     * **参数解释：** 脱敏后的 API Key。 **取值范围：** 不涉及。 
     * @return maskedKey
     */
    public String getMaskedKey() {
        return maskedKey;
    }

    public void setMaskedKey(String maskedKey) {
        this.maskedKey = maskedKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCoreSpaceApiKeyResponseBody that = (ShowCoreSpaceApiKeyResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.maskedKey, that.maskedKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maskedKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCoreSpaceApiKeyResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    maskedKey: ").append(toIndentedString(maskedKey)).append("\n");
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
