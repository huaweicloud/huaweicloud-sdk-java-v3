package com.huaweicloud.sdk.dgc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.ScriptInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ModifyScriptRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_name")
    
    private String scriptName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ScriptInfo body = null;

    public ModifyScriptRequest withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    


    /**
     * Get scriptName
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public ModifyScriptRequest withBody(ScriptInfo body) {
        this.body = body;
        return this;
    }

    public ModifyScriptRequest withBody(Consumer<ScriptInfo> bodySetter) {
        if(this.body == null ){
            this.body = new ScriptInfo();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
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
        ModifyScriptRequest modifyScriptRequest = (ModifyScriptRequest) o;
        return Objects.equals(this.scriptName, modifyScriptRequest.scriptName) &&
            Objects.equals(this.body, modifyScriptRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scriptName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyScriptRequest {\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

