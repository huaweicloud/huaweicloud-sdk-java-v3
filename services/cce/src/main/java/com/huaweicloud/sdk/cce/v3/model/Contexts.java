package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.Context;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Contexts
 */
public class Contexts  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="context")
    
    private Context context = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public Contexts withContext(Context context) {
        this.context = context;
        return this;
    }

    public Contexts withContext(Consumer<Context> contextSetter) {
        if(this.context == null ){
            this.context = new Context();
            contextSetter.accept(this.context);
        }
        
        return this;
    }


    /**
     * Get context
     * @return context
     */
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Contexts withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 上下文的名称。 - 若不存在publicIp（虚拟机弹性IP），则集群列表的集群数量为1，该字段值为“internal”。 - 若存在publicIp，则集群列表的集群数量大于1，所有扩展的context的name的值为“external”。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contexts contexts = (Contexts) o;
        return Objects.equals(this.context, contexts.context) &&
            Objects.equals(this.name, contexts.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(context, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Contexts {\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

