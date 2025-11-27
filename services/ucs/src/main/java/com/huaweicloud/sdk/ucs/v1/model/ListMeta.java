package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListMeta
 */
public class ListMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceVersion")

    private String resourceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue")

    private String _continue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remainingItemCount")

    private String remainingItemCount;

    public ListMeta withResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * 服务器内部版本标识符
     * @return resourceVersion
     */
    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public ListMeta withContinue(String _continue) {
        this._continue = _continue;
        return this;
    }

    /**
     * 表示当前请求返回的结果是否还有下一页数据
     * @return _continue
     */
    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    public ListMeta withRemainingItemCount(String remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
        return this;
    }

    /**
     * 表示在当前响应之后，列表中还有多少项未被包含进来
     * @return remainingItemCount
     */
    public String getRemainingItemCount() {
        return remainingItemCount;
    }

    public void setRemainingItemCount(String remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMeta that = (ListMeta) obj;
        return Objects.equals(this.resourceVersion, that.resourceVersion)
            && Objects.equals(this._continue, that._continue)
            && Objects.equals(this.remainingItemCount, that.remainingItemCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceVersion, _continue, remainingItemCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMeta {\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
        sb.append("    remainingItemCount: ").append(toIndentedString(remainingItemCount)).append("\n");
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
