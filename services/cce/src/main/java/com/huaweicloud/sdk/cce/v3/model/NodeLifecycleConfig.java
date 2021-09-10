package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 节点自定义生命周期配置 */
public class NodeLifecycleConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preInstall")

    private String preInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postInstall")

    private String postInstall;

    public NodeLifecycleConfig withPreInstall(String preInstall) {
        this.preInstall = preInstall;
        return this;
    }

    /** 安装前执行脚本 > 输入的值需要经过Base64编码，方法为echo -n \"待编码内容\" | base64。
     * 
     * @return preInstall */
    public String getPreInstall() {
        return preInstall;
    }

    public void setPreInstall(String preInstall) {
        this.preInstall = preInstall;
    }

    public NodeLifecycleConfig withPostInstall(String postInstall) {
        this.postInstall = postInstall;
        return this;
    }

    /** 安装后执行脚本 > 输入的值需要经过Base64编码，方法为echo -n \"待编码内容\" | base64。
     * 
     * @return postInstall */
    public String getPostInstall() {
        return postInstall;
    }

    public void setPostInstall(String postInstall) {
        this.postInstall = postInstall;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeLifecycleConfig nodeLifecycleConfig = (NodeLifecycleConfig) o;
        return Objects.equals(this.preInstall, nodeLifecycleConfig.preInstall)
            && Objects.equals(this.postInstall, nodeLifecycleConfig.postInstall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preInstall, postInstall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeLifecycleConfig {\n");
        sb.append("    preInstall: ").append(toIndentedString(preInstall)).append("\n");
        sb.append("    postInstall: ").append(toIndentedString(postInstall)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
