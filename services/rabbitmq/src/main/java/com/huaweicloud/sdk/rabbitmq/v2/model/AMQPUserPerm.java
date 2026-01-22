package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AMQPUserPerm
 */
public class AMQPUserPerm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf")

    private String conf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write")

    private String write;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read")

    private String read;

    public AMQPUserPerm withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * **参数解释**： 需要配置权限的Vhost名称，一个用户可以配置多个Vhost下的资源权限。 **取值范围**： 不涉及。
     * @return vhost
     */
    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public AMQPUserPerm withConf(String conf) {
        this.conf = conf;
        return this;
    }

    /**
     * **参数解释**： 使用正则表达式匹配资源配置权限。例如，在输入框内输入“^janeway-.*”，则表示授权给该用户当前Vhost下，所有名称以“janeway-”开头的资源的配置权限。 **取值范围**： 不涉及。
     * @return conf
     */
    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public AMQPUserPerm withWrite(String write) {
        this.write = write;
        return this;
    }

    /**
     * **参数解释**： 使用正则表达式匹配资源写权限。例如，在输入框内输入“.*”，则表示授权给该用户当前Vhost下，所有资源的写权限。 **取值范围**： 不涉及。
     * @return write
     */
    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public AMQPUserPerm withRead(String read) {
        this.read = read;
        return this;
    }

    /**
     * **参数解释**： 使用正则表达式匹配资源读权限。例如，在输入框内输入“.*”，则表示授权给该用户当前Vhost下，所有资源的读权限。 **取值范围**： 不涉及。
     * @return read
     */
    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AMQPUserPerm that = (AMQPUserPerm) obj;
        return Objects.equals(this.vhost, that.vhost) && Objects.equals(this.conf, that.conf)
            && Objects.equals(this.write, that.write) && Objects.equals(this.read, that.read);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vhost, conf, write, read);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AMQPUserPerm {\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
        sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
        sb.append("    write: ").append(toIndentedString(write)).append("\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
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
