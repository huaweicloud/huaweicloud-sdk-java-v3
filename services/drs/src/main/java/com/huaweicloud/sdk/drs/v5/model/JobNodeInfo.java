package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务实例信息体。
 */
public class JobNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private JobNodeSpecInfo spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private JobNodeVpcInfo vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private JobNodeBaseInfo baseInfo;

    public JobNodeInfo withSpec(JobNodeSpecInfo spec) {
        this.spec = spec;
        return this;
    }

    public JobNodeInfo withSpec(Consumer<JobNodeSpecInfo> specSetter) {
        if (this.spec == null) {
            this.spec = new JobNodeSpecInfo();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public JobNodeSpecInfo getSpec() {
        return spec;
    }

    public void setSpec(JobNodeSpecInfo spec) {
        this.spec = spec;
    }

    public JobNodeInfo withVpc(JobNodeVpcInfo vpc) {
        this.vpc = vpc;
        return this;
    }

    public JobNodeInfo withVpc(Consumer<JobNodeVpcInfo> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new JobNodeVpcInfo();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public JobNodeVpcInfo getVpc() {
        return vpc;
    }

    public void setVpc(JobNodeVpcInfo vpc) {
        this.vpc = vpc;
    }

    public JobNodeInfo withBaseInfo(JobNodeBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public JobNodeInfo withBaseInfo(Consumer<JobNodeBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new JobNodeBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public JobNodeBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(JobNodeBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobNodeInfo that = (JobNodeInfo) obj;
        return Objects.equals(this.spec, that.spec) && Objects.equals(this.vpc, that.vpc)
            && Objects.equals(this.baseInfo, that.baseInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec, vpc, baseInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobNodeInfo {\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
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
