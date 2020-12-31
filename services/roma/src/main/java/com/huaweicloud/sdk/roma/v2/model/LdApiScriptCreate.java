package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LdApiScript;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LdApiScriptCreate
 */
public class LdApiScriptCreate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_type")
    
    private String apiType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scripts")
    
    private List<LdApiScript> scripts = null;
    
    public LdApiScriptCreate withApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }

    


    /**
     * API类型 - data：数据API - function：函数API 
     * @return apiType
     */
    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    public LdApiScriptCreate withScripts(List<LdApiScript> scripts) {
        this.scripts = scripts;
        return this;
    }

    
    public LdApiScriptCreate addScriptsItem(LdApiScript scriptsItem) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        this.scripts.add(scriptsItem);
        return this;
    }

    public LdApiScriptCreate withScripts(Consumer<List<LdApiScript>> scriptsSetter) {
        if(this.scripts == null ){
            this.scripts = new ArrayList<>();
        }
        scriptsSetter.accept(this.scripts);
        return this;
    }

    /**
     * API脚本信息列表
     * @return scripts
     */
    public List<LdApiScript> getScripts() {
        return scripts;
    }

    public void setScripts(List<LdApiScript> scripts) {
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
        LdApiScriptCreate ldApiScriptCreate = (LdApiScriptCreate) o;
        return Objects.equals(this.apiType, ldApiScriptCreate.apiType) &&
            Objects.equals(this.scripts, ldApiScriptCreate.scripts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiType, scripts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiScriptCreate {\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
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

