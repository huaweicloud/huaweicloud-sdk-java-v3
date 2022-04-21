package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class RemoveVpcExtendCidrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private RemoveExtendCidrOption vpc;

    public RemoveVpcExtendCidrRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 功能说明：是否只预检此次请求 取值范围： -true：发送检查请求，不会移除VPC扩展网段。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 -false（默认值）：发送正常请求，并直接移除VPC扩展网段。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public RemoveVpcExtendCidrRequestBody withVpc(RemoveExtendCidrOption vpc) {
        this.vpc = vpc;
        return this;
    }

    public RemoveVpcExtendCidrRequestBody withVpc(Consumer<RemoveExtendCidrOption> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new RemoveExtendCidrOption();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public RemoveExtendCidrOption getVpc() {
        return vpc;
    }

    public void setVpc(RemoveExtendCidrOption vpc) {
        this.vpc = vpc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveVpcExtendCidrRequestBody removeVpcExtendCidrRequestBody = (RemoveVpcExtendCidrRequestBody) o;
        return Objects.equals(this.dryRun, removeVpcExtendCidrRequestBody.dryRun)
            && Objects.equals(this.vpc, removeVpcExtendCidrRequestBody.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveVpcExtendCidrRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
