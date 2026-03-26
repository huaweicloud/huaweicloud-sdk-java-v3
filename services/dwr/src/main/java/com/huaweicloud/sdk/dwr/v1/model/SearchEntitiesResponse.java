package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SearchEntitiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private EntitiesData data;

    public SearchEntitiesResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** 返回码。参见错误码章节。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SearchEntitiesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 描述信息 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SearchEntitiesResponse withData(EntitiesData data) {
        this.data = data;
        return this;
    }

    public SearchEntitiesResponse withData(Consumer<EntitiesData> dataSetter) {
        if (this.data == null) {
            this.data = new EntitiesData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public EntitiesData getData() {
        return data;
    }

    public void setData(EntitiesData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchEntitiesResponse that = (SearchEntitiesResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.message, that.message)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchEntitiesResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
