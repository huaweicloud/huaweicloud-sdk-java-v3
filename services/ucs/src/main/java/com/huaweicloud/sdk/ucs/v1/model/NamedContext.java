package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 上下文
 */
public class NamedContext {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context")

    private Context context;

    public NamedContext withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 上下文的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamedContext withContext(Context context) {
        this.context = context;
        return this;
    }

    public NamedContext withContext(Consumer<Context> contextSetter) {
        if (this.context == null) {
            this.context = new Context();
            contextSetter.accept(this.context);
        }

        return this;
    }

    /**
     * Get context
     * @return context
     */
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamedContext that = (NamedContext) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.context, that.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, context);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NamedContext {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
