package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMindmapRecycleByPageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private BasePageInfoMindmapRecycle data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ShowMindmapRecycleByPageResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 错误码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowMindmapRecycleByPageResponse withData(BasePageInfoMindmapRecycle data) {
        this.data = data;
        return this;
    }

    public ShowMindmapRecycleByPageResponse withData(Consumer<BasePageInfoMindmapRecycle> dataSetter) {
        if (this.data == null) {
            this.data = new BasePageInfoMindmapRecycle();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public BasePageInfoMindmapRecycle getData() {
        return data;
    }

    public void setData(BasePageInfoMindmapRecycle data) {
        this.data = data;
    }

    public ShowMindmapRecycleByPageResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 错误信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMindmapRecycleByPageResponse that = (ShowMindmapRecycleByPageResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.data, that.data)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMindmapRecycleByPageResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
