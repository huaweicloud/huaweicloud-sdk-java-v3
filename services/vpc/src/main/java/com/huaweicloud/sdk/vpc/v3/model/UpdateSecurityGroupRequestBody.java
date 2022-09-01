package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateSecurityGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    @JacksonXmlProperty(localName = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    @JacksonXmlProperty(localName = "security_group")

    private UpdateSecurityGroupOption securityGroup;

    public UpdateSecurityGroupRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 功能说明：是否只预检此次请求 取值范围： -true：发送检查请求，不会更新安全组。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 -false（默认值）：发送正常请求，并直接更新安全组。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UpdateSecurityGroupRequestBody withSecurityGroup(UpdateSecurityGroupOption securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public UpdateSecurityGroupRequestBody withSecurityGroup(Consumer<UpdateSecurityGroupOption> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new UpdateSecurityGroupOption();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    /**
     * Get securityGroup
     * @return securityGroup
     */
    public UpdateSecurityGroupOption getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(UpdateSecurityGroupOption securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSecurityGroupRequestBody updateSecurityGroupRequestBody = (UpdateSecurityGroupRequestBody) o;
        return Objects.equals(this.dryRun, updateSecurityGroupRequestBody.dryRun)
            && Objects.equals(this.securityGroup, updateSecurityGroupRequestBody.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityGroupRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
