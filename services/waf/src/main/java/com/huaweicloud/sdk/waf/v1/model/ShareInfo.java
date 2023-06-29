package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 共享信息
 */
public class ShareInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_count")

    private Integer shareCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accept_count")

    private Integer acceptCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private Integer processStatus;

    public ShareInfo withShareCount(Integer shareCount) {
        this.shareCount = shareCount;
        return this;
    }

    /**
     * 共享用户数
     * @return shareCount
     */
    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public ShareInfo withAcceptCount(Integer acceptCount) {
        this.acceptCount = acceptCount;
        return this;
    }

    /**
     * 接受用户数
     * @return acceptCount
     */
    public Integer getAcceptCount() {
        return acceptCount;
    }

    public void setAcceptCount(Integer acceptCount) {
        this.acceptCount = acceptCount;
    }

    public ShareInfo withProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * 处理状态
     * @return processStatus
     */
    public Integer getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareInfo that = (ShareInfo) obj;
        return Objects.equals(this.shareCount, that.shareCount) && Objects.equals(this.acceptCount, that.acceptCount)
            && Objects.equals(this.processStatus, that.processStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareCount, acceptCount, processStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareInfo {\n");
        sb.append("    shareCount: ").append(toIndentedString(shareCount)).append("\n");
        sb.append("    acceptCount: ").append(toIndentedString(acceptCount)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
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
