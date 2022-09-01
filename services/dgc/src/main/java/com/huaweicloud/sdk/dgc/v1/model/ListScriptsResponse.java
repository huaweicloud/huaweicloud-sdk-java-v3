package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListScriptsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scripts")

    @JacksonXmlProperty(localName = "scripts")

    private List<ScriptInfo> scripts = null;

    public ListScriptsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListScriptsResponse withScripts(List<ScriptInfo> scripts) {
        this.scripts = scripts;
        return this;
    }

    public ListScriptsResponse addScriptsItem(ScriptInfo scriptsItem) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        this.scripts.add(scriptsItem);
        return this;
    }

    public ListScriptsResponse withScripts(Consumer<List<ScriptInfo>> scriptsSetter) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        scriptsSetter.accept(this.scripts);
        return this;
    }

    /**
     * Get scripts
     * @return scripts
     */
    public List<ScriptInfo> getScripts() {
        return scripts;
    }

    public void setScripts(List<ScriptInfo> scripts) {
        this.scripts = scripts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScriptsResponse listScriptsResponse = (ListScriptsResponse) o;
        return Objects.equals(this.total, listScriptsResponse.total)
            && Objects.equals(this.scripts, listScriptsResponse.scripts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, scripts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScriptsResponse {\n");
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
