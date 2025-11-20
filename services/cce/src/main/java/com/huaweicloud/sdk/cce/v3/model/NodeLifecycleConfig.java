package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点自定义生命周期配置
 */
public class NodeLifecycleConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preInstall")

    private String preInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postInstall")

    private String postInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waitPostInstallFinish")

    private Boolean waitPostInstallFinish;

    public NodeLifecycleConfig withPreInstall(String preInstall) {
        this.preInstall = preInstall;
        return this;
    }

    /**
     * **参数解释**： 安装前执行脚本。 **约束限制**： 安装前/后执行脚本统一计算字符，转码后的字符总数不能超过10240。 输入的值需要经过Base64编码，方法如下：   ```   echo -n \"待编码内容\" | base64   ``` **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return preInstall
     */
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

    /**
     * **参数解释**： 安装前执行脚本。 **约束限制**： 安装前/后执行脚本统一计算字符，转码后的字符总数不能超过10240。 输入的值需要经过Base64编码，方法如下：   ```   echo -n \"待编码内容\" | base64   ``` **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return postInstall
     */
    public String getPostInstall() {
        return postInstall;
    }

    public void setPostInstall(String postInstall) {
        this.postInstall = postInstall;
    }

    public NodeLifecycleConfig withWaitPostInstallFinish(Boolean waitPostInstallFinish) {
        this.waitPostInstallFinish = waitPostInstallFinish;
        return this;
    }

    /**
     * **参数解释：** 该参数用于控制重置/纳管/批量重置节点时， **post-install脚本执行完成前允许节点调度** 的行为。当操作的节点属于节点池时，以节点池相关配置为准。当该参数未设置或者为false时，在kubernetes节点就绪时，容器即可被调度到可用节点。当该参数为true时，在kubernetes节点就绪时且post-install脚本执行完成时，容器才可被调度到可用节点。  **约束限制：** 不涉及  **取值范围：** - false：在kubernetes节点就绪时，容器即可被调度到可用节点。           - true：在kubernetes节点就绪时且post-install脚本执行完成时，容器才可被调度到可用节点。  **默认取值：** false
     * @return waitPostInstallFinish
     */
    public Boolean getWaitPostInstallFinish() {
        return waitPostInstallFinish;
    }

    public void setWaitPostInstallFinish(Boolean waitPostInstallFinish) {
        this.waitPostInstallFinish = waitPostInstallFinish;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeLifecycleConfig that = (NodeLifecycleConfig) obj;
        return Objects.equals(this.preInstall, that.preInstall) && Objects.equals(this.postInstall, that.postInstall)
            && Objects.equals(this.waitPostInstallFinish, that.waitPostInstallFinish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preInstall, postInstall, waitPostInstallFinish);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeLifecycleConfig {\n");
        sb.append("    preInstall: ").append(toIndentedString(preInstall)).append("\n");
        sb.append("    postInstall: ").append(toIndentedString(postInstall)).append("\n");
        sb.append("    waitPostInstallFinish: ").append(toIndentedString(waitPostInstallFinish)).append("\n");
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
