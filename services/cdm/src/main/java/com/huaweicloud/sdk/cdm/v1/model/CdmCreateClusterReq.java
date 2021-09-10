package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CdmCreateClusterReq */
public class CdmCreateClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private CdmCreateClusterReqCluster cluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_remind")

    private Boolean autoRemind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_num")

    private String phoneNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    public CdmCreateClusterReq withCluster(CdmCreateClusterReqCluster cluster) {
        this.cluster = cluster;
        return this;
    }

    public CdmCreateClusterReq withCluster(Consumer<CdmCreateClusterReqCluster> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new CdmCreateClusterReqCluster();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /** Get cluster
     * 
     * @return cluster */
    public CdmCreateClusterReqCluster getCluster() {
        return cluster;
    }

    public void setCluster(CdmCreateClusterReqCluster cluster) {
        this.cluster = cluster;
    }

    public CdmCreateClusterReq withAutoRemind(Boolean autoRemind) {
        this.autoRemind = autoRemind;
        return this;
    }

    /** 选择是否开启消息通知。开启后，支持配置5个手机号码或邮箱，作业（目前仅支持表/文件迁移的作业）失败时、EIP异常时会发送短信或邮件通知用户
     * 
     * @return autoRemind */
    public Boolean getAutoRemind() {
        return autoRemind;
    }

    public void setAutoRemind(Boolean autoRemind) {
        this.autoRemind = autoRemind;
    }

    public CdmCreateClusterReq withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    /** 接收消息通知的手机号码
     * 
     * @return phoneNum */
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public CdmCreateClusterReq withEmail(String email) {
        this.email = email;
        return this;
    }

    /** 接收消息通知的邮箱
     * 
     * @return email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CdmCreateClusterReq cdmCreateClusterReq = (CdmCreateClusterReq) o;
        return Objects.equals(this.cluster, cdmCreateClusterReq.cluster)
            && Objects.equals(this.autoRemind, cdmCreateClusterReq.autoRemind)
            && Objects.equals(this.phoneNum, cdmCreateClusterReq.phoneNum)
            && Objects.equals(this.email, cdmCreateClusterReq.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster, autoRemind, phoneNum, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmCreateClusterReq {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    autoRemind: ").append(toIndentedString(autoRemind)).append("\n");
        sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
