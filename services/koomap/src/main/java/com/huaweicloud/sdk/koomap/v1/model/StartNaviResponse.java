package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartNaviResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private List<NAVIServiceRespPath> path = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")

    private String xTraceId;

    public StartNaviResponse withResult(Integer result) {
        this.result = result;
        return this;
    }

    /**
     * 接口返回状态码。 -  0：导航成功 -  1：起始地点无效 -  2：目标地点无效 -  3：未连接 -  6：栅格数据 -  8：途径地点无效
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public StartNaviResponse withPath(List<NAVIServiceRespPath> path) {
        this.path = path;
        return this;
    }

    public StartNaviResponse addPathItem(NAVIServiceRespPath pathItem) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        this.path.add(pathItem);
        return this;
    }

    public StartNaviResponse withPath(Consumer<List<NAVIServiceRespPath>> pathSetter) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        pathSetter.accept(this.path);
        return this;
    }

    /**
     * 返回的路径信息。
     * @return path
     */
    public List<NAVIServiceRespPath> getPath() {
        return path;
    }

    public void setPath(List<NAVIServiceRespPath> path) {
        this.path = path;
    }

    public StartNaviResponse withXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
        return this;
    }

    /**
     * Get xTraceId
     * @return xTraceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")
    public String getXTraceId() {
        return xTraceId;
    }

    public void setXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartNaviResponse that = (StartNaviResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.path, that.path)
            && Objects.equals(this.xTraceId, that.xTraceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, path, xTraceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartNaviResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    xTraceId: ").append(toIndentedString(xTraceId)).append("\n");
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
