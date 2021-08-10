package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ScriptInfo body;

    public UpdateScriptRequest withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /** Get scriptName
     * 
     * @return scriptName */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public UpdateScriptRequest withBody(ScriptInfo body) {
        this.body = body;
        return this;
    }

    public UpdateScriptRequest withBody(Consumer<ScriptInfo> bodySetter) {
        if (this.body == null) {
            this.body = new ScriptInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ScriptInfo getBody() {
        return body;
    }

    public void setBody(ScriptInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateScriptRequest updateScriptRequest = (UpdateScriptRequest) o;
        return Objects.equals(this.scriptName, updateScriptRequest.scriptName)
            && Objects.equals(this.body, updateScriptRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScriptRequest {\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
