package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.Recipe;
import com.huaweicloud.sdk.cloudide.v2.model.StacksAttribute;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StacksConfig
 */
public class StacksConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attributes")
    
    private StacksAttribute attributes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recipe")
    
    private Recipe recipe;

    public StacksConfig withAttributes(StacksAttribute attributes) {
        this.attributes = attributes;
        return this;
    }

    public StacksConfig withAttributes(Consumer<StacksAttribute> attributesSetter) {
        if(this.attributes == null ){
            this.attributes = new StacksAttribute();
            attributesSetter.accept(this.attributes);
        }
        
        return this;
    }


    /**
     * Get attributes
     * @return attributes
     */
    public StacksAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(StacksAttribute attributes) {
        this.attributes = attributes;
    }

    

    public StacksConfig withRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public StacksConfig withRecipe(Consumer<Recipe> recipeSetter) {
        if(this.recipe == null ){
            this.recipe = new Recipe();
            recipeSetter.accept(this.recipe);
        }
        
        return this;
    }


    /**
     * Get recipe
     * @return recipe
     */
    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StacksConfig stacksConfig = (StacksConfig) o;
        return Objects.equals(this.attributes, stacksConfig.attributes) &&
            Objects.equals(this.recipe, stacksConfig.recipe);
    }
    @Override
    public int hashCode() {
        return Objects.hash(attributes, recipe);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StacksConfig {\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    recipe: ").append(toIndentedString(recipe)).append("\n");
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

