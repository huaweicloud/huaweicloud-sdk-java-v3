package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContainerHooks
 */
public class ContainerHooks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_start")

    private Config postStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_start")

    private Config preStart;

    public ContainerHooks withPostStart(Config postStart) {
        this.postStart = postStart;
        return this;
    }

    public ContainerHooks withPostStart(Consumer<Config> postStartSetter) {
        if (this.postStart == null) {
            this.postStart = new Config();
            postStartSetter.accept(this.postStart);
        }

        return this;
    }

    /**
     * Get postStart
     * @return postStart
     */
    public Config getPostStart() {
        return postStart;
    }

    public void setPostStart(Config postStart) {
        this.postStart = postStart;
    }

    public ContainerHooks withPreStart(Config preStart) {
        this.preStart = preStart;
        return this;
    }

    public ContainerHooks withPreStart(Consumer<Config> preStartSetter) {
        if (this.preStart == null) {
            this.preStart = new Config();
            preStartSetter.accept(this.preStart);
        }

        return this;
    }

    /**
     * Get preStart
     * @return preStart
     */
    public Config getPreStart() {
        return preStart;
    }

    public void setPreStart(Config preStart) {
        this.preStart = preStart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerHooks that = (ContainerHooks) obj;
        return Objects.equals(this.postStart, that.postStart) && Objects.equals(this.preStart, that.preStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postStart, preStart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerHooks {\n");
        sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
        sb.append("    preStart: ").append(toIndentedString(preStart)).append("\n");
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
