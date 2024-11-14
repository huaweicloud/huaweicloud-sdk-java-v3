package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新文件系统请求体
 */
public class UpdateHpcShareRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gc_time")

    private Integer gcTime;

    public UpdateHpcShareRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 更新文件系统的操作类型。当前仅支持取值 config_gc_time
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UpdateHpcShareRequestBody withGcTime(Integer gcTime) {
        this.gcTime = gcTime;
        return this;
    }

    /**
     * 文件系统冷数据淘汰时间，单位为小时，取值范围 [1, 100000000]。系统默认为 60 小时
     * @return gcTime
     */
    public Integer getGcTime() {
        return gcTime;
    }

    public void setGcTime(Integer gcTime) {
        this.gcTime = gcTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHpcShareRequestBody that = (UpdateHpcShareRequestBody) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.gcTime, that.gcTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, gcTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHpcShareRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    gcTime: ").append(toIndentedString(gcTime)).append("\n");
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
