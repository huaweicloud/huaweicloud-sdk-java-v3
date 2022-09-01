package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 当北向接口报错时，按此格式返回到body体中
 */
public class ErrRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    @JacksonXmlProperty(localName = "error")

    private ErrMsg error;

    public ErrRsp withError(ErrMsg error) {
        this.error = error;
        return this;
    }

    public ErrRsp withError(Consumer<ErrMsg> errorSetter) {
        if (this.error == null) {
            this.error = new ErrMsg();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public ErrMsg getError() {
        return error;
    }

    public void setError(ErrMsg error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrRsp errRsp = (ErrRsp) o;
        return Objects.equals(this.error, errRsp.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrRsp {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
