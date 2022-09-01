package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新云日志请求体
 */
public class UpdateLogtankRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank")

    @JacksonXmlProperty(localName = "logtank")

    private UpdateLogtankOption logtank;

    public UpdateLogtankRequestBody withLogtank(UpdateLogtankOption logtank) {
        this.logtank = logtank;
        return this;
    }

    public UpdateLogtankRequestBody withLogtank(Consumer<UpdateLogtankOption> logtankSetter) {
        if (this.logtank == null) {
            this.logtank = new UpdateLogtankOption();
            logtankSetter.accept(this.logtank);
        }

        return this;
    }

    /**
     * Get logtank
     * @return logtank
     */
    public UpdateLogtankOption getLogtank() {
        return logtank;
    }

    public void setLogtank(UpdateLogtankOption logtank) {
        this.logtank = logtank;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLogtankRequestBody updateLogtankRequestBody = (UpdateLogtankRequestBody) o;
        return Objects.equals(this.logtank, updateLogtankRequestBody.logtank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logtank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogtankRequestBody {\n");
        sb.append("    logtank: ").append(toIndentedString(logtank)).append("\n");
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
