package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePostPaidInstanceRequestBody
 */
public class CreatePostPaidInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private CreatePostpaidInstanceOption instance;

    public CreatePostPaidInstanceRequestBody withInstance(CreatePostpaidInstanceOption instance) {
        this.instance = instance;
        return this;
    }

    public CreatePostPaidInstanceRequestBody withInstance(Consumer<CreatePostpaidInstanceOption> instanceSetter) {
        if (this.instance == null) {
            this.instance = new CreatePostpaidInstanceOption();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public CreatePostpaidInstanceOption getInstance() {
        return instance;
    }

    public void setInstance(CreatePostpaidInstanceOption instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePostPaidInstanceRequestBody that = (CreatePostPaidInstanceRequestBody) obj;
        return Objects.equals(this.instance, that.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostPaidInstanceRequestBody {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
