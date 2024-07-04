package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AMQPUser
 */
public class AMQPUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhosts")

    private List<AMQPUserPerm> vhosts = null;

    public AMQPUser withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 用户名，只能英文字母开头，且由英文字母、数字、中划线、下划线组成，长度为7~64个字符。
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public AMQPUser withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * 密钥。 8-32个字符。 至少包含以下字符中的3种：   - 大写字母   - 小写字母   - 数字   - 特殊字符`~!@#$%^&*()-_=+\\\\|[{}];:\\'\\\",<.>/?。 不能与名称或倒序的名称相同。
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public AMQPUser withVhosts(List<AMQPUserPerm> vhosts) {
        this.vhosts = vhosts;
        return this;
    }

    public AMQPUser addVhostsItem(AMQPUserPerm vhostsItem) {
        if (this.vhosts == null) {
            this.vhosts = new ArrayList<>();
        }
        this.vhosts.add(vhostsItem);
        return this;
    }

    public AMQPUser withVhosts(Consumer<List<AMQPUserPerm>> vhostsSetter) {
        if (this.vhosts == null) {
            this.vhosts = new ArrayList<>();
        }
        vhostsSetter.accept(this.vhosts);
        return this;
    }

    /**
     * 需要配置权限的 Vhost，一个用户可以配置多个Vhost下的资源权限。
     * @return vhosts
     */
    public List<AMQPUserPerm> getVhosts() {
        return vhosts;
    }

    public void setVhosts(List<AMQPUserPerm> vhosts) {
        this.vhosts = vhosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AMQPUser that = (AMQPUser) obj;
        return Objects.equals(this.accessKey, that.accessKey) && Objects.equals(this.secretKey, that.secretKey)
            && Objects.equals(this.vhosts, that.vhosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, secretKey, vhosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AMQPUser {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    vhosts: ").append(toIndentedString(vhosts)).append("\n");
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
