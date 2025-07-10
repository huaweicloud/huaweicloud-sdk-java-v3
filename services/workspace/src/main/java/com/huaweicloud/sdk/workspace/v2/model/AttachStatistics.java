package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分配情况统计。
 */
public class AttachStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_num")

    private Integer attachedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unattached_num")

    private Integer unattachedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attaching_num")

    private Integer attachingNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_error_num")

    private Integer attachErrorNum;

    public AttachStatistics withAttachedNum(Integer attachedNum) {
        this.attachedNum = attachedNum;
        return this;
    }

    /**
     * 已分配个数。
     * @return attachedNum
     */
    public Integer getAttachedNum() {
        return attachedNum;
    }

    public void setAttachedNum(Integer attachedNum) {
        this.attachedNum = attachedNum;
    }

    public AttachStatistics withUnattachedNum(Integer unattachedNum) {
        this.unattachedNum = unattachedNum;
        return this;
    }

    /**
     * 未分配个数。
     * @return unattachedNum
     */
    public Integer getUnattachedNum() {
        return unattachedNum;
    }

    public void setUnattachedNum(Integer unattachedNum) {
        this.unattachedNum = unattachedNum;
    }

    public AttachStatistics withAttachingNum(Integer attachingNum) {
        this.attachingNum = attachingNum;
        return this;
    }

    /**
     * 分配中个数。
     * @return attachingNum
     */
    public Integer getAttachingNum() {
        return attachingNum;
    }

    public void setAttachingNum(Integer attachingNum) {
        this.attachingNum = attachingNum;
    }

    public AttachStatistics withAttachErrorNum(Integer attachErrorNum) {
        this.attachErrorNum = attachErrorNum;
        return this;
    }

    /**
     * 分配失败的个数。
     * @return attachErrorNum
     */
    public Integer getAttachErrorNum() {
        return attachErrorNum;
    }

    public void setAttachErrorNum(Integer attachErrorNum) {
        this.attachErrorNum = attachErrorNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachStatistics that = (AttachStatistics) obj;
        return Objects.equals(this.attachedNum, that.attachedNum)
            && Objects.equals(this.unattachedNum, that.unattachedNum)
            && Objects.equals(this.attachingNum, that.attachingNum)
            && Objects.equals(this.attachErrorNum, that.attachErrorNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedNum, unattachedNum, attachingNum, attachErrorNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachStatistics {\n");
        sb.append("    attachedNum: ").append(toIndentedString(attachedNum)).append("\n");
        sb.append("    unattachedNum: ").append(toIndentedString(unattachedNum)).append("\n");
        sb.append("    attachingNum: ").append(toIndentedString(attachingNum)).append("\n");
        sb.append("    attachErrorNum: ").append(toIndentedString(attachErrorNum)).append("\n");
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
