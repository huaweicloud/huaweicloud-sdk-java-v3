package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class CreatePostPaidServersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private PostPaidServer server;

    public CreatePostPaidServersRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /** 是否只预检此次请求。 true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数、请求格式等。 如果检查不通过，则返回对应错误。 如果检查通过，则返回202状态码。
     * false：发送正常请求，通过检查后并且执行创建云服务器请求。
     * 
     * @return dryRun */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CreatePostPaidServersRequestBody withServer(PostPaidServer server) {
        this.server = server;
        return this;
    }

    public CreatePostPaidServersRequestBody withServer(Consumer<PostPaidServer> serverSetter) {
        if (this.server == null) {
            this.server = new PostPaidServer();
            serverSetter.accept(this.server);
        }

        return this;
    }

    /** Get server
     * 
     * @return server */
    public PostPaidServer getServer() {
        return server;
    }

    public void setServer(PostPaidServer server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePostPaidServersRequestBody createPostPaidServersRequestBody = (CreatePostPaidServersRequestBody) o;
        return Objects.equals(this.dryRun, createPostPaidServersRequestBody.dryRun)
            && Objects.equals(this.server, createPostPaidServersRequestBody.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostPaidServersRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
