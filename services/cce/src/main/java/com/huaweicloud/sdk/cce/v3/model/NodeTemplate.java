package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeTemplate
 */
public class NodeTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageID")

    private String imageID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private NodeTemplateLogin login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifeCycle")

    private NodeTemplateLifeCycle lifeCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtimeConfig")

    private NodeTemplateRuntimeConfig runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private NodeTemplateExtendParam extendParam;

    public NodeTemplate withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * Get os
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public NodeTemplate withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * Get imageID
     * @return imageID
     */
    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public NodeTemplate withLogin(NodeTemplateLogin login) {
        this.login = login;
        return this;
    }

    public NodeTemplate withLogin(Consumer<NodeTemplateLogin> loginSetter) {
        if (this.login == null) {
            this.login = new NodeTemplateLogin();
            loginSetter.accept(this.login);
        }

        return this;
    }

    /**
     * Get login
     * @return login
     */
    public NodeTemplateLogin getLogin() {
        return login;
    }

    public void setLogin(NodeTemplateLogin login) {
        this.login = login;
    }

    public NodeTemplate withLifeCycle(NodeTemplateLifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    public NodeTemplate withLifeCycle(Consumer<NodeTemplateLifeCycle> lifeCycleSetter) {
        if (this.lifeCycle == null) {
            this.lifeCycle = new NodeTemplateLifeCycle();
            lifeCycleSetter.accept(this.lifeCycle);
        }

        return this;
    }

    /**
     * Get lifeCycle
     * @return lifeCycle
     */
    public NodeTemplateLifeCycle getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(NodeTemplateLifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public NodeTemplate withRuntimeConfig(NodeTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public NodeTemplate withRuntimeConfig(Consumer<NodeTemplateRuntimeConfig> runtimeConfigSetter) {
        if (this.runtimeConfig == null) {
            this.runtimeConfig = new NodeTemplateRuntimeConfig();
            runtimeConfigSetter.accept(this.runtimeConfig);
        }

        return this;
    }

    /**
     * Get runtimeConfig
     * @return runtimeConfig
     */
    public NodeTemplateRuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(NodeTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public NodeTemplate withExtendParam(NodeTemplateExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public NodeTemplate withExtendParam(Consumer<NodeTemplateExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new NodeTemplateExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public NodeTemplateExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(NodeTemplateExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTemplate that = (NodeTemplate) obj;
        return Objects.equals(this.os, that.os) && Objects.equals(this.imageID, that.imageID)
            && Objects.equals(this.login, that.login) && Objects.equals(this.lifeCycle, that.lifeCycle)
            && Objects.equals(this.runtimeConfig, that.runtimeConfig)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os, imageID, login, lifeCycle, runtimeConfig, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTemplate {\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
