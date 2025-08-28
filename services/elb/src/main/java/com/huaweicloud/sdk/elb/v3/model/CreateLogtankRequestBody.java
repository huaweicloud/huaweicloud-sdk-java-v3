package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：创建云日志请求参数。  **约束限制**：不涉及
 */
public class CreateLogtankRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank")

    private CreateLogtankOption logtank;

    public CreateLogtankRequestBody withLogtank(CreateLogtankOption logtank) {
        this.logtank = logtank;
        return this;
    }

    public CreateLogtankRequestBody withLogtank(Consumer<CreateLogtankOption> logtankSetter) {
        if (this.logtank == null) {
            this.logtank = new CreateLogtankOption();
            logtankSetter.accept(this.logtank);
        }

        return this;
    }

    /**
     * Get logtank
     * @return logtank
     */
    public CreateLogtankOption getLogtank() {
        return logtank;
    }

    public void setLogtank(CreateLogtankOption logtank) {
        this.logtank = logtank;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLogtankRequestBody that = (CreateLogtankRequestBody) obj;
        return Objects.equals(this.logtank, that.logtank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logtank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogtankRequestBody {\n");
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
