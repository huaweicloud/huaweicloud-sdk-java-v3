package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群缩容请求
 */
public class ClusterShrinkReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shrink_number")

    private Integer shrinkNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online")

    private Boolean online;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry")

    private Boolean retry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_backup")

    private Boolean forceBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_agency")

    private Boolean needAgency;

    public ClusterShrinkReq withShrinkNumber(Integer shrinkNumber) {
        this.shrinkNumber = shrinkNumber;
        return this;
    }

    /**
     * 缩容数
     * @return shrinkNumber
     */
    public Integer getShrinkNumber() {
        return shrinkNumber;
    }

    public void setShrinkNumber(Integer shrinkNumber) {
        this.shrinkNumber = shrinkNumber;
    }

    public ClusterShrinkReq withOnline(Boolean online) {
        this.online = online;
        return this;
    }

    /**
     * 在线
     * @return online
     */
    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public ClusterShrinkReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClusterShrinkReq withRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    /**
     * 重试
     * @return retry
     */
    public Boolean getRetry() {
        return retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public ClusterShrinkReq withForceBackup(Boolean forceBackup) {
        this.forceBackup = forceBackup;
        return this;
    }

    /**
     * 执行备份
     * @return forceBackup
     */
    public Boolean getForceBackup() {
        return forceBackup;
    }

    public void setForceBackup(Boolean forceBackup) {
        this.forceBackup = forceBackup;
    }

    public ClusterShrinkReq withNeedAgency(Boolean needAgency) {
        this.needAgency = needAgency;
        return this;
    }

    /**
     * 是否需要委托
     * @return needAgency
     */
    public Boolean getNeedAgency() {
        return needAgency;
    }

    public void setNeedAgency(Boolean needAgency) {
        this.needAgency = needAgency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterShrinkReq that = (ClusterShrinkReq) obj;
        return Objects.equals(this.shrinkNumber, that.shrinkNumber) && Objects.equals(this.online, that.online)
            && Objects.equals(this.type, that.type) && Objects.equals(this.retry, that.retry)
            && Objects.equals(this.forceBackup, that.forceBackup) && Objects.equals(this.needAgency, that.needAgency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shrinkNumber, online, type, retry, forceBackup, needAgency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterShrinkReq {\n");
        sb.append("    shrinkNumber: ").append(toIndentedString(shrinkNumber)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
        sb.append("    forceBackup: ").append(toIndentedString(forceBackup)).append("\n");
        sb.append("    needAgency: ").append(toIndentedString(needAgency)).append("\n");
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
