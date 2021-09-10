package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ExceedCutNetReq */
public class ExceedCutNetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private Integer action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private String quota;

    public ExceedCutNetReq withAction(Integer action) {
        this.action = action;
        return this;
    }

    /** 操作类型(1:设置达量断网域值，2：取消达量断网域值) minimum: 1 maximum: 2
     * 
     * @return action */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public ExceedCutNetReq withQuota(String quota) {
        this.quota = quota;
        return this;
    }

    /** 阈值,只能是0,-1,正整数，-1表示无限制，0表示有上网流量产生就会立即断网，取消达量断网功能时可不传，单位MB
     * 
     * @return quota */
    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExceedCutNetReq exceedCutNetReq = (ExceedCutNetReq) o;
        return Objects.equals(this.action, exceedCutNetReq.action) && Objects.equals(this.quota, exceedCutNetReq.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceedCutNetReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
