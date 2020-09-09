package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ResourceType;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 部署资源。
 */
public class ReferResources  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private ResourceType type = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="refer_alias")
    
    private String referAlias;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private Object parameters = null;

    public ReferResources withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 资源ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReferResources withType(ResourceType type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public ReferResources withReferAlias(String referAlias) {
        this.referAlias = referAlias;
        return this;
    }

    


    /**
     * 应用别名，dcs时才提供，支持“distributed_session”、“distributed_cache”、“distributed_session, distributed_cache”，  默认值是“distributed_session, distributed_cache”。 
     * @return referAlias
     */
    public String getReferAlias() {
        return referAlias;
    }

    public void setReferAlias(String referAlias) {
        this.referAlias = referAlias;
    }

    public ReferResources withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    


    /**
     * 引用资源参数。
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferResources referResources = (ReferResources) o;
        return Objects.equals(this.id, referResources.id) &&
            Objects.equals(this.type, referResources.type) &&
            Objects.equals(this.referAlias, referResources.referAlias) &&
            Objects.equals(this.parameters, referResources.parameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, type, referAlias, parameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferResources {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    referAlias: ").append(toIndentedString(referAlias)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

