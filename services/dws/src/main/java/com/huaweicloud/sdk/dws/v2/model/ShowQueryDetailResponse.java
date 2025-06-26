package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowQueryDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ListQueriesDto data;

    public ShowQueryDetailResponse withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 响应码。 **取值范围**： 不涉及。
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ShowQueryDetailResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * **参数解释**： 响应信息。 **取值范围**： 不涉及。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ShowQueryDetailResponse withData(ListQueriesDto data) {
        this.data = data;
        return this;
    }

    public ShowQueryDetailResponse withData(Consumer<ListQueriesDto> dataSetter) {
        if (this.data == null) {
            this.data = new ListQueriesDto();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ListQueriesDto getData() {
        return data;
    }

    public void setData(ListQueriesDto data) {
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
        ShowQueryDetailResponse that = (ShowQueryDetailResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.msg, that.msg)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQueryDetailResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
