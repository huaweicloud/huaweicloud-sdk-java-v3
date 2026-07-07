package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义启动脚本钩子配置。
 */
public class CustomHooks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_hooks")

    private ContainerHooks containerHooks;

    public CustomHooks withContainerHooks(ContainerHooks containerHooks) {
        this.containerHooks = containerHooks;
        return this;
    }

    public CustomHooks withContainerHooks(Consumer<ContainerHooks> containerHooksSetter) {
        if (this.containerHooks == null) {
            this.containerHooks = new ContainerHooks();
            containerHooksSetter.accept(this.containerHooks);
        }

        return this;
    }

    /**
     * Get containerHooks
     * @return containerHooks
     */
    public ContainerHooks getContainerHooks() {
        return containerHooks;
    }

    public void setContainerHooks(ContainerHooks containerHooks) {
        this.containerHooks = containerHooks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomHooks that = (CustomHooks) obj;
        return Objects.equals(this.containerHooks, that.containerHooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerHooks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomHooks {\n");
        sb.append("    containerHooks: ").append(toIndentedString(containerHooks)).append("\n");
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
