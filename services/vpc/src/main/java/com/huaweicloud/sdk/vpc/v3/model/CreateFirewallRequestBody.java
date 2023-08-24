package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateFirewallRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall")

    private CreateFirewallOption firewall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public CreateFirewallRequestBody withFirewall(CreateFirewallOption firewall) {
        this.firewall = firewall;
        return this;
    }

    public CreateFirewallRequestBody withFirewall(Consumer<CreateFirewallOption> firewallSetter) {
        if (this.firewall == null) {
            this.firewall = new CreateFirewallOption();
            firewallSetter.accept(this.firewall);
        }

        return this;
    }

    /**
     * Get firewall
     * @return firewall
     */
    public CreateFirewallOption getFirewall() {
        return firewall;
    }

    public void setFirewall(CreateFirewallOption firewall) {
        this.firewall = firewall;
    }

    public CreateFirewallRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 功能说明：是否只预检此次请求 取值范围： -true：发送检查请求，不会创建ACL。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 -false（默认值）：发送正常请求，并直接创建ACL。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFirewallRequestBody that = (CreateFirewallRequestBody) obj;
        return Objects.equals(this.firewall, that.firewall) && Objects.equals(this.dryRun, that.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewall, dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFirewallRequestBody {\n");
        sb.append("    firewall: ").append(toIndentedString(firewall)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
