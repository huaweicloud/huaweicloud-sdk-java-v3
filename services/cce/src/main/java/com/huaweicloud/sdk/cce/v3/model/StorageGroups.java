package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.VirtualSpace;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StorageGroups
 */
public class StorageGroups  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cceManaged")
    
    private Boolean cceManaged;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="selectorNames")
    
    private List<String> selectorNames = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtualSpaces")
    
    private VirtualSpace virtualSpaces;

    public StorageGroups withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * storageGroups的名字，作为虚拟存储组的名字，因此各个group个名字不能重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public StorageGroups withCceManaged(Boolean cceManaged) {
        this.cceManaged = cceManaged;
        return this;
    }

    


    /**
     * k8s及runtime所属存储空间。有且仅有一个group被设置为true，不填默认false。
     * @return cceManaged
     */
    public Boolean getCceManaged() {
        return cceManaged;
    }

    public void setCceManaged(Boolean cceManaged) {
        this.cceManaged = cceManaged;
    }

    

    public StorageGroups withSelectorNames(List<String> selectorNames) {
        this.selectorNames = selectorNames;
        return this;
    }

    
    public StorageGroups addSelectorNamesItem(String selectorNamesItem) {
        if(this.selectorNames == null) {
            this.selectorNames = new ArrayList<>();
        }
        this.selectorNames.add(selectorNamesItem);
        return this;
    }

    public StorageGroups withSelectorNames(Consumer<List<String>> selectorNamesSetter) {
        if(this.selectorNames == null) {
            this.selectorNames = new ArrayList<>();
        }
        selectorNamesSetter.accept(this.selectorNames);
        return this;
    }

    /**
     * 对应storageSelectors中的name，一个group可选择多个selector；但一个selector只能被一个group选择。
     * @return selectorNames
     */
    public List<String> getSelectorNames() {
        return selectorNames;
    }

    public void setSelectorNames(List<String> selectorNames) {
        this.selectorNames = selectorNames;
    }

    

    public StorageGroups withVirtualSpaces(VirtualSpace virtualSpaces) {
        this.virtualSpaces = virtualSpaces;
        return this;
    }

    public StorageGroups withVirtualSpaces(Consumer<VirtualSpace> virtualSpacesSetter) {
        if(this.virtualSpaces == null ){
            this.virtualSpaces = new VirtualSpace();
            virtualSpacesSetter.accept(this.virtualSpaces);
        }
        
        return this;
    }


    /**
     * Get virtualSpaces
     * @return virtualSpaces
     */
    public VirtualSpace getVirtualSpaces() {
        return virtualSpaces;
    }

    public void setVirtualSpaces(VirtualSpace virtualSpaces) {
        this.virtualSpaces = virtualSpaces;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageGroups storageGroups = (StorageGroups) o;
        return Objects.equals(this.name, storageGroups.name) &&
            Objects.equals(this.cceManaged, storageGroups.cceManaged) &&
            Objects.equals(this.selectorNames, storageGroups.selectorNames) &&
            Objects.equals(this.virtualSpaces, storageGroups.virtualSpaces);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, cceManaged, selectorNames, virtualSpaces);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageGroups {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cceManaged: ").append(toIndentedString(cceManaged)).append("\n");
        sb.append("    selectorNames: ").append(toIndentedString(selectorNames)).append("\n");
        sb.append("    virtualSpaces: ").append(toIndentedString(virtualSpaces)).append("\n");
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

