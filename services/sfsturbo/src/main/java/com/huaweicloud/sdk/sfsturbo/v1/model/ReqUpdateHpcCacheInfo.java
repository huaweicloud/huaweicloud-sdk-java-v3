package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 后端挂载信息
 */
public class ReqUpdateHpcCacheInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ReqUpdateHpcCacheData data;

    public ReqUpdateHpcCacheInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 配置hpc缓存型的动作，如initialize_overlay
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ReqUpdateHpcCacheInfo withData(ReqUpdateHpcCacheData data) {
        this.data = data;
        return this;
    }

    public ReqUpdateHpcCacheInfo withData(Consumer<ReqUpdateHpcCacheData> dataSetter) {
        if (this.data == null) {
            this.data = new ReqUpdateHpcCacheData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ReqUpdateHpcCacheData getData() {
        return data;
    }

    public void setData(ReqUpdateHpcCacheData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqUpdateHpcCacheInfo that = (ReqUpdateHpcCacheInfo) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqUpdateHpcCacheInfo {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
