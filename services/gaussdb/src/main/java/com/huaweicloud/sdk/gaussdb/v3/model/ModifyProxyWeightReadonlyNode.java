package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 只读节点权重信息
 */
public class ModifyProxyWeightReadonlyNode  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weight")
    
    
    private Integer weight;

    public ModifyProxyWeightReadonlyNode withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 只读节点id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ModifyProxyWeightReadonlyNode withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    


    /**
     * 只读节点权重
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyProxyWeightReadonlyNode modifyProxyWeightReadonlyNode = (ModifyProxyWeightReadonlyNode) o;
        return Objects.equals(this.id, modifyProxyWeightReadonlyNode.id) &&
            Objects.equals(this.weight, modifyProxyWeightReadonlyNode.weight);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, weight);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyProxyWeightReadonlyNode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

