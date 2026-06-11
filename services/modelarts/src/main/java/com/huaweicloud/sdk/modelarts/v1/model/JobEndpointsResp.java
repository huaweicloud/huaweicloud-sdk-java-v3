package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 远程接入训练作业时需要的相关配置。
 */
public class JobEndpointsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh")

    private SSHResp ssh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jupyter_lab")

    private JupyterLab jupyterLab;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tensorboard")

    private Tensorboard tensorboard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindstudio_insight")

    private MindStudioInsight mindstudioInsight;

    public JobEndpointsResp withSsh(SSHResp ssh) {
        this.ssh = ssh;
        return this;
    }

    public JobEndpointsResp withSsh(Consumer<SSHResp> sshSetter) {
        if (this.ssh == null) {
            this.ssh = new SSHResp();
            sshSetter.accept(this.ssh);
        }

        return this;
    }

    /**
     * Get ssh
     * @return ssh
     */
    public SSHResp getSsh() {
        return ssh;
    }

    public void setSsh(SSHResp ssh) {
        this.ssh = ssh;
    }

    public JobEndpointsResp withJupyterLab(JupyterLab jupyterLab) {
        this.jupyterLab = jupyterLab;
        return this;
    }

    public JobEndpointsResp withJupyterLab(Consumer<JupyterLab> jupyterLabSetter) {
        if (this.jupyterLab == null) {
            this.jupyterLab = new JupyterLab();
            jupyterLabSetter.accept(this.jupyterLab);
        }

        return this;
    }

    /**
     * Get jupyterLab
     * @return jupyterLab
     */
    public JupyterLab getJupyterLab() {
        return jupyterLab;
    }

    public void setJupyterLab(JupyterLab jupyterLab) {
        this.jupyterLab = jupyterLab;
    }

    public JobEndpointsResp withTensorboard(Tensorboard tensorboard) {
        this.tensorboard = tensorboard;
        return this;
    }

    public JobEndpointsResp withTensorboard(Consumer<Tensorboard> tensorboardSetter) {
        if (this.tensorboard == null) {
            this.tensorboard = new Tensorboard();
            tensorboardSetter.accept(this.tensorboard);
        }

        return this;
    }

    /**
     * Get tensorboard
     * @return tensorboard
     */
    public Tensorboard getTensorboard() {
        return tensorboard;
    }

    public void setTensorboard(Tensorboard tensorboard) {
        this.tensorboard = tensorboard;
    }

    public JobEndpointsResp withMindstudioInsight(MindStudioInsight mindstudioInsight) {
        this.mindstudioInsight = mindstudioInsight;
        return this;
    }

    public JobEndpointsResp withMindstudioInsight(Consumer<MindStudioInsight> mindstudioInsightSetter) {
        if (this.mindstudioInsight == null) {
            this.mindstudioInsight = new MindStudioInsight();
            mindstudioInsightSetter.accept(this.mindstudioInsight);
        }

        return this;
    }

    /**
     * Get mindstudioInsight
     * @return mindstudioInsight
     */
    public MindStudioInsight getMindstudioInsight() {
        return mindstudioInsight;
    }

    public void setMindstudioInsight(MindStudioInsight mindstudioInsight) {
        this.mindstudioInsight = mindstudioInsight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobEndpointsResp that = (JobEndpointsResp) obj;
        return Objects.equals(this.ssh, that.ssh) && Objects.equals(this.jupyterLab, that.jupyterLab)
            && Objects.equals(this.tensorboard, that.tensorboard)
            && Objects.equals(this.mindstudioInsight, that.mindstudioInsight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssh, jupyterLab, tensorboard, mindstudioInsight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEndpointsResp {\n");
        sb.append("    ssh: ").append(toIndentedString(ssh)).append("\n");
        sb.append("    jupyterLab: ").append(toIndentedString(jupyterLab)).append("\n");
        sb.append("    tensorboard: ").append(toIndentedString(tensorboard)).append("\n");
        sb.append("    mindstudioInsight: ").append(toIndentedString(mindstudioInsight)).append("\n");
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
