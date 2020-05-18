package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 版本别名结构
 */
public class CreateVersionAliasRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="additional_version_weights")
    
    private Map<String, Integer> additionalVersionWeights = null;
    
    public CreateVersionAliasRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 要获取的别名名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVersionAliasRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 别名对应的版本名称。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateVersionAliasRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 别名描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVersionAliasRequestBody withAdditionalVersionWeights(Map<String, Integer> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
        return this;
    }

    

    public CreateVersionAliasRequestBody putAdditionalVersionWeightsItem(String key, Integer additionalVersionWeightsItem) {
         if (this.additionalVersionWeights == null) {
            this.additionalVersionWeights = new HashMap<>();
         }
        this.additionalVersionWeights.put(key, additionalVersionWeightsItem);
        return this;
    }

    public CreateVersionAliasRequestBody withAdditionalVersionWeights(Consumer<Map<String, Integer>> additionalVersionWeightsSetter) {
        if(this.additionalVersionWeights == null ){
            this.additionalVersionWeights = new HashMap<>();
        }
        additionalVersionWeightsSetter.accept(this.additionalVersionWeights);
        return this;
    }
    /**
     * 灰度版本信息
     * @return additionalVersionWeights
     */
    public Map<String, Integer> getAdditionalVersionWeights() {
        return additionalVersionWeights;
    }

    public void setAdditionalVersionWeights(Map<String, Integer> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVersionAliasRequestBody createVersionAliasRequestBody = (CreateVersionAliasRequestBody) o;
        return Objects.equals(this.name, createVersionAliasRequestBody.name) &&
            Objects.equals(this.version, createVersionAliasRequestBody.version) &&
            Objects.equals(this.description, createVersionAliasRequestBody.description) &&
            Objects.equals(this.additionalVersionWeights, createVersionAliasRequestBody.additionalVersionWeights);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, version, description, additionalVersionWeights);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVersionAliasRequestBody {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    additionalVersionWeights: ").append(toIndentedString(additionalVersionWeights)).append("\n");
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

