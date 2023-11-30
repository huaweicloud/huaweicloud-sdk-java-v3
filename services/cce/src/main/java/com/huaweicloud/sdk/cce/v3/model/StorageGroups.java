package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StorageGroups
 */
public class StorageGroups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cceManaged")

    private Boolean cceManaged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selectorNames")

    private List<String> selectorNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtualSpaces")

    private List<VirtualSpace> virtualSpaces = null;

    public StorageGroups withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * storageGroups的名字，作为虚拟存储组的名字，因此各个group名字不能重复。 > - 当cceManaged=ture时，name必须为：vgpass。 > - 当数据盘作为临时存储卷时：name必须为：vg-everest-localvolume-ephemeral。 > - 当数据盘作为持久存储卷时：name必须为：vg-everest-localvolume-persistent。 
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
        if (this.selectorNames == null) {
            this.selectorNames = new ArrayList<>();
        }
        this.selectorNames.add(selectorNamesItem);
        return this;
    }

    public StorageGroups withSelectorNames(Consumer<List<String>> selectorNamesSetter) {
        if (this.selectorNames == null) {
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

    public StorageGroups withVirtualSpaces(List<VirtualSpace> virtualSpaces) {
        this.virtualSpaces = virtualSpaces;
        return this;
    }

    public StorageGroups addVirtualSpacesItem(VirtualSpace virtualSpacesItem) {
        if (this.virtualSpaces == null) {
            this.virtualSpaces = new ArrayList<>();
        }
        this.virtualSpaces.add(virtualSpacesItem);
        return this;
    }

    public StorageGroups withVirtualSpaces(Consumer<List<VirtualSpace>> virtualSpacesSetter) {
        if (this.virtualSpaces == null) {
            this.virtualSpaces = new ArrayList<>();
        }
        virtualSpacesSetter.accept(this.virtualSpaces);
        return this;
    }

    /**
     * group中空间配置的详细管理。
     * @return virtualSpaces
     */
    public List<VirtualSpace> getVirtualSpaces() {
        return virtualSpaces;
    }

    public void setVirtualSpaces(List<VirtualSpace> virtualSpaces) {
        this.virtualSpaces = virtualSpaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageGroups that = (StorageGroups) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.cceManaged, that.cceManaged)
            && Objects.equals(this.selectorNames, that.selectorNames)
            && Objects.equals(this.virtualSpaces, that.virtualSpaces);
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
