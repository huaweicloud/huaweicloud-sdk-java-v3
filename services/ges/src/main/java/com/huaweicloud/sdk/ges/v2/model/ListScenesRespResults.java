package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ListScenesRespParams;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListScenesRespResults
 */
public class ListScenesRespResults  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scene")
    
    
    private String scene;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="params")
    
    
    private List<ListScenesRespParams> params = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;

    public ListScenesRespResults withScene(String scene) {
        this.scene = scene;
        return this;
    }

    


    /**
     * 场景名。
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    

    public ListScenesRespResults withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * application名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListScenesRespResults withParams(List<ListScenesRespParams> params) {
        this.params = params;
        return this;
    }

    
    public ListScenesRespResults addParamsItem(ListScenesRespParams paramsItem) {
        if(this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ListScenesRespResults withParams(Consumer<List<ListScenesRespParams>> paramsSetter) {
        if(this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 参数列表。
     * @return params
     */
    public List<ListScenesRespParams> getParams() {
        return params;
    }

    public void setParams(List<ListScenesRespParams> params) {
        this.params = params;
    }

    

    public ListScenesRespResults withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 场景下应用的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScenesRespResults listScenesRespResults = (ListScenesRespResults) o;
        return Objects.equals(this.scene, listScenesRespResults.scene) &&
            Objects.equals(this.name, listScenesRespResults.name) &&
            Objects.equals(this.params, listScenesRespResults.params) &&
            Objects.equals(this.description, listScenesRespResults.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scene, name, params, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScenesRespResults {\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

