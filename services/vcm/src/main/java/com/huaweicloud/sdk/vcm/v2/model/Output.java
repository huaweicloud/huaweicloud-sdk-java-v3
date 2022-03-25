package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 结果数据的输出列表 */
public class Output {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private OutputObs obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting")

    private OutputHosting hosting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis")

    private OutputDis dis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webhook")

    private OutputWebhook webhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localpath")

    private OutputLocalpath localpath;

    public Output withObs(OutputObs obs) {
        this.obs = obs;
        return this;
    }

    public Output withObs(Consumer<OutputObs> obsSetter) {
        if (this.obs == null) {
            this.obs = new OutputObs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /** Get obs
     * 
     * @return obs */
    public OutputObs getObs() {
        return obs;
    }

    public void setObs(OutputObs obs) {
        this.obs = obs;
    }

    public Output withHosting(OutputHosting hosting) {
        this.hosting = hosting;
        return this;
    }

    public Output withHosting(Consumer<OutputHosting> hostingSetter) {
        if (this.hosting == null) {
            this.hosting = new OutputHosting();
            hostingSetter.accept(this.hosting);
        }

        return this;
    }

    /** Get hosting
     * 
     * @return hosting */
    public OutputHosting getHosting() {
        return hosting;
    }

    public void setHosting(OutputHosting hosting) {
        this.hosting = hosting;
    }

    public Output withDis(OutputDis dis) {
        this.dis = dis;
        return this;
    }

    public Output withDis(Consumer<OutputDis> disSetter) {
        if (this.dis == null) {
            this.dis = new OutputDis();
            disSetter.accept(this.dis);
        }

        return this;
    }

    /** Get dis
     * 
     * @return dis */
    public OutputDis getDis() {
        return dis;
    }

    public void setDis(OutputDis dis) {
        this.dis = dis;
    }

    public Output withWebhook(OutputWebhook webhook) {
        this.webhook = webhook;
        return this;
    }

    public Output withWebhook(Consumer<OutputWebhook> webhookSetter) {
        if (this.webhook == null) {
            this.webhook = new OutputWebhook();
            webhookSetter.accept(this.webhook);
        }

        return this;
    }

    /** Get webhook
     * 
     * @return webhook */
    public OutputWebhook getWebhook() {
        return webhook;
    }

    public void setWebhook(OutputWebhook webhook) {
        this.webhook = webhook;
    }

    public Output withLocalpath(OutputLocalpath localpath) {
        this.localpath = localpath;
        return this;
    }

    public Output withLocalpath(Consumer<OutputLocalpath> localpathSetter) {
        if (this.localpath == null) {
            this.localpath = new OutputLocalpath();
            localpathSetter.accept(this.localpath);
        }

        return this;
    }

    /** Get localpath
     * 
     * @return localpath */
    public OutputLocalpath getLocalpath() {
        return localpath;
    }

    public void setLocalpath(OutputLocalpath localpath) {
        this.localpath = localpath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Output output = (Output) o;
        return Objects.equals(this.obs, output.obs) && Objects.equals(this.hosting, output.hosting)
            && Objects.equals(this.dis, output.dis) && Objects.equals(this.webhook, output.webhook)
            && Objects.equals(this.localpath, output.localpath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, hosting, dis, webhook, localpath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Output {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    hosting: ").append(toIndentedString(hosting)).append("\n");
        sb.append("    dis: ").append(toIndentedString(dis)).append("\n");
        sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
        sb.append("    localpath: ").append(toIndentedString(localpath)).append("\n");
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
