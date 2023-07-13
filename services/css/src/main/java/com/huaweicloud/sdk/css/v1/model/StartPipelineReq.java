package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StartPipelineReq
 */
public class StartPipelineReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepAlive")

    private Boolean keepAlive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "names")

    private List<String> names = null;

    public StartPipelineReq withKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }

    /**
     * 是否保持常驻。   - true: 开启保持常驻。  - false: 关闭保持常驻。  开启“保持常驻”适用于需要长期运行的业务。开启“保持常驻”以后，将会在每个节点上面配置一个守护进程，当logstash服务出现故障的时候，会主动拉起并修复。“保持常驻”不适用于短期运行的业务，因为多次主动拉起logstash服务会导致数据迁移重复。
     * @return keepAlive
     */
    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public StartPipelineReq withNames(List<String> names) {
        this.names = names;
        return this;
    }

    public StartPipelineReq addNamesItem(String namesItem) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        this.names.add(namesItem);
        return this;
    }

    public StartPipelineReq withNames(Consumer<List<String>> namesSetter) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        namesSetter.accept(this.names);
        return this;
    }

    /**
     * 配置文件名称。
     * @return names
     */
    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartPipelineReq that = (StartPipelineReq) obj;
        return Objects.equals(this.keepAlive, that.keepAlive) && Objects.equals(this.names, that.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepAlive, names);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartPipelineReq {\n");
        sb.append("    keepAlive: ").append(toIndentedString(keepAlive)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
