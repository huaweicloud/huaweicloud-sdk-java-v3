package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateVpcRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    @JacksonXmlProperty(localName = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    @JacksonXmlProperty(localName = "vpc")

    private UpdateVpcOption vpc;

    public UpdateVpcRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 功能说明：是否只预检此次请求 取值范围： -true：发送检查请求，不会更新VPC。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 -false（默认值）：发送正常请求，并直接更新VPC。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UpdateVpcRequestBody withVpc(UpdateVpcOption vpc) {
        this.vpc = vpc;
        return this;
    }

    public UpdateVpcRequestBody withVpc(Consumer<UpdateVpcOption> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new UpdateVpcOption();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public UpdateVpcOption getVpc() {
        return vpc;
    }

    public void setVpc(UpdateVpcOption vpc) {
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
        UpdateVpcRequestBody updateVpcRequestBody = (UpdateVpcRequestBody) o;
        return Objects.equals(this.dryRun, updateVpcRequestBody.dryRun)
            && Objects.equals(this.vpc, updateVpcRequestBody.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcRequestBody {\n");
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
