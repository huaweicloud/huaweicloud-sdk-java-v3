package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.NicSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 节点网卡的描述信息。 
 */
public class NodeNicSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extNics")
    
    private List<NicSpec> extNics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="primaryNic")
    
    private NicSpec primaryNic;

    public NodeNicSpec withExtNics(List<NicSpec> extNics) {
        this.extNics = extNics;
        return this;
    }

    
    public NodeNicSpec addExtNicsItem(NicSpec extNicsItem) {
        this.extNics.add(extNicsItem);
        return this;
    }

    public NodeNicSpec withExtNics(Consumer<List<NicSpec>> extNicsSetter) {
        if(this.extNics == null ){
            this.extNics = new ArrayList<>();
        }
        extNicsSetter.accept(this.extNics);
        return this;
    }

    /**
     * 扩展网卡
     * @return extNics
     */
    public List<NicSpec> getExtNics() {
        return extNics;
    }

    public void setExtNics(List<NicSpec> extNics) {
        this.extNics = extNics;
    }

    

    public NodeNicSpec withPrimaryNic(NicSpec primaryNic) {
        this.primaryNic = primaryNic;
        return this;
    }

    public NodeNicSpec withPrimaryNic(Consumer<NicSpec> primaryNicSetter) {
        if(this.primaryNic == null ){
            this.primaryNic = new NicSpec();
            primaryNicSetter.accept(this.primaryNic);
        }
        
        return this;
    }


    /**
     * Get primaryNic
     * @return primaryNic
     */
    public NicSpec getPrimaryNic() {
        return primaryNic;
    }

    public void setPrimaryNic(NicSpec primaryNic) {
        this.primaryNic = primaryNic;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeNicSpec nodeNicSpec = (NodeNicSpec) o;
        return Objects.equals(this.extNics, nodeNicSpec.extNics) &&
            Objects.equals(this.primaryNic, nodeNicSpec.primaryNic);
    }
    @Override
    public int hashCode() {
        return Objects.hash(extNics, primaryNic);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeNicSpec {\n");
        sb.append("    extNics: ").append(toIndentedString(extNics)).append("\n");
        sb.append("    primaryNic: ").append(toIndentedString(primaryNic)).append("\n");
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

