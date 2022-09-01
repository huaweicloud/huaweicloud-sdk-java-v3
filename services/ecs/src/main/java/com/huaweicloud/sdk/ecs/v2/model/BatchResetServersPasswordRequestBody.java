package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchResetServersPasswordRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    @JacksonXmlProperty(localName = "new_password")

    private String newPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    @JacksonXmlProperty(localName = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    @JacksonXmlProperty(localName = "servers")

    private List<ServerId> servers = null;

    public BatchResetServersPasswordRequestBody withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * 新密码。  当dry_run字段为true时，该字段为非必填字段，否则为必填字段。  新密码的校验规则：  - 允许输入的字符包括：!@%-_=+[]:./? - 禁止输入的字符包括：汉字及【】：；“”‘’、，。《》？￥…（）—— ·！~`#&^,{}*();\"'<>|\\ $ - 复杂度上必须包含大写字母（A-Z）、小写字母（a-z）、数字（0-9）、以及允许的特殊字符中的3种以上搭配 - 不能包含用户名 \"Administrator\" 和“root”及逆序字符 - 不能包含用户名 \"Administrator\" 中连续3个字符
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public BatchResetServersPasswordRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 是否只预检此次请求。  - true：发送检查请求，不会重置密码。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应结果。 - false：发送正常请求，通过检查后并且进行重置密码请求。  默认值：false
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public BatchResetServersPasswordRequestBody withServers(List<ServerId> servers) {
        this.servers = servers;
        return this;
    }

    public BatchResetServersPasswordRequestBody addServersItem(ServerId serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public BatchResetServersPasswordRequestBody withServers(Consumer<List<ServerId>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 待批量重置密码的弹性云服务器ID信息。
     * @return servers
     */
    public List<ServerId> getServers() {
        return servers;
    }

    public void setServers(List<ServerId> servers) {
        this.servers = servers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchResetServersPasswordRequestBody batchResetServersPasswordRequestBody =
            (BatchResetServersPasswordRequestBody) o;
        return Objects.equals(this.newPassword, batchResetServersPasswordRequestBody.newPassword)
            && Objects.equals(this.dryRun, batchResetServersPasswordRequestBody.dryRun)
            && Objects.equals(this.servers, batchResetServersPasswordRequestBody.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPassword, dryRun, servers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResetServersPasswordRequestBody {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
