package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartHotPipelineRequestBody
 */
public class StartHotPipelineRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_alive")

    private Boolean keepAlive;

    public StartHotPipelineRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配置文件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StartHotPipelineRequestBody withKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }

    /**
     * 热启动操作时，需要与集群已存在管道的 “是否保持常驻”值保持一致。 - true: 开启保持常驻。 - false: 关闭保持常驻。 开启“保持常驻”适用于需要长期运行的业务。开启“保持常驻”以后，将会在每个节点上面配置一个守护进程，当logstash服务出现故障的时候，会主动拉起并修复。“保持常驻”不适用于短期运行的业务，因为多次主动拉起logstash服务会导致数据迁移重复。
     * @return keepAlive
     */
    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartHotPipelineRequestBody that = (StartHotPipelineRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.keepAlive, that.keepAlive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, keepAlive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartHotPipelineRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    keepAlive: ").append(toIndentedString(keepAlive)).append("\n");
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
