package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlFlavorsInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGaussMySqlFlavorsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavors")
    
    @JacksonXmlProperty(localName = "flavors")
    
    private List<MysqlFlavorsInfo> flavors = null;
    
    public ShowGaussMySqlFlavorsResponse withFlavors(List<MysqlFlavorsInfo> flavors) {
        this.flavors = flavors;
        return this;
    }

    
    public ShowGaussMySqlFlavorsResponse addFlavorsItem(MysqlFlavorsInfo flavorsItem) {
        if(this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ShowGaussMySqlFlavorsResponse withFlavors(Consumer<List<MysqlFlavorsInfo>> flavorsSetter) {
        if(this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 实例规格信息列表
     * @return flavors
     */
    public List<MysqlFlavorsInfo> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<MysqlFlavorsInfo> flavors) {
        this.flavors = flavors;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlFlavorsResponse showGaussMySqlFlavorsResponse = (ShowGaussMySqlFlavorsResponse) o;
        return Objects.equals(this.flavors, showGaussMySqlFlavorsResponse.flavors);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavors);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlFlavorsResponse {\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
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

