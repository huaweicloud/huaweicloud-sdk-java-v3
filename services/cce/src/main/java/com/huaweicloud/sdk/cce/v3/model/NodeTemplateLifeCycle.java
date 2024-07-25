package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeTemplateLifeCycle
 */
public class NodeTemplateLifeCycle {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preInstall")

    private String preInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postInstall")

    private String postInstall;

    public NodeTemplateLifeCycle withPreInstall(String preInstall) {
        this.preInstall = preInstall;
        return this;
    }

    /**
     * Get preInstall
     * @return preInstall
     */
    public String getPreInstall() {
        return preInstall;
    }

    public void setPreInstall(String preInstall) {
        this.preInstall = preInstall;
    }

    public NodeTemplateLifeCycle withPostInstall(String postInstall) {
        this.postInstall = postInstall;
        return this;
    }

    /**
     * Get postInstall
     * @return postInstall
     */
    public String getPostInstall() {
        return postInstall;
    }

    public void setPostInstall(String postInstall) {
        this.postInstall = postInstall;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTemplateLifeCycle that = (NodeTemplateLifeCycle) obj;
        return Objects.equals(this.preInstall, that.preInstall) && Objects.equals(this.postInstall, that.postInstall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preInstall, postInstall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTemplateLifeCycle {\n");
        sb.append("    preInstall: ").append(toIndentedString(preInstall)).append("\n");
        sb.append("    postInstall: ").append(toIndentedString(postInstall)).append("\n");
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
