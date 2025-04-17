package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListFactoryScriptsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scripts")

    private List<ScriptInfo> scripts = null;

    public ListFactoryScriptsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总的脚本个数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListFactoryScriptsResponse withScripts(List<ScriptInfo> scripts) {
        this.scripts = scripts;
        return this;
    }

    public ListFactoryScriptsResponse addScriptsItem(ScriptInfo scriptsItem) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        this.scripts.add(scriptsItem);
        return this;
    }

    public ListFactoryScriptsResponse withScripts(Consumer<List<ScriptInfo>> scriptsSetter) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        scriptsSetter.accept(this.scripts);
        return this;
    }

    /**
     * 脚本列表
     * @return scripts
     */
    public List<ScriptInfo> getScripts() {
        return scripts;
    }

    public void setScripts(List<ScriptInfo> scripts) {
        this.scripts = scripts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryScriptsResponse that = (ListFactoryScriptsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.scripts, that.scripts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, scripts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryScriptsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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
