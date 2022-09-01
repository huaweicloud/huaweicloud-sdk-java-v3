package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxyComputeFlavor;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlProxyFlavorGroups
 */
public class MysqlProxyFlavorGroups  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_type")
    
    @JacksonXmlProperty(localName = "group_type")
    
    private String groupType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_flavors")
    
    @JacksonXmlProperty(localName = "proxy_flavors")
    
    private List<MysqlProxyComputeFlavor> proxyFlavors = null;
    
    public MysqlProxyFlavorGroups withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    


    /**
     * 规格组类型，如x86、arm。
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    

    public MysqlProxyFlavorGroups withProxyFlavors(List<MysqlProxyComputeFlavor> proxyFlavors) {
        this.proxyFlavors = proxyFlavors;
        return this;
    }

    
    public MysqlProxyFlavorGroups addProxyFlavorsItem(MysqlProxyComputeFlavor proxyFlavorsItem) {
        if(this.proxyFlavors == null) {
            this.proxyFlavors = new ArrayList<>();
        }
        this.proxyFlavors.add(proxyFlavorsItem);
        return this;
    }

    public MysqlProxyFlavorGroups withProxyFlavors(Consumer<List<MysqlProxyComputeFlavor>> proxyFlavorsSetter) {
        if(this.proxyFlavors == null) {
            this.proxyFlavors = new ArrayList<>();
        }
        proxyFlavorsSetter.accept(this.proxyFlavors);
        return this;
    }

    /**
     * 规格信息。
     * @return proxyFlavors
     */
    public List<MysqlProxyComputeFlavor> getProxyFlavors() {
        return proxyFlavors;
    }

    public void setProxyFlavors(List<MysqlProxyComputeFlavor> proxyFlavors) {
        this.proxyFlavors = proxyFlavors;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlProxyFlavorGroups mysqlProxyFlavorGroups = (MysqlProxyFlavorGroups) o;
        return Objects.equals(this.groupType, mysqlProxyFlavorGroups.groupType) &&
            Objects.equals(this.proxyFlavors, mysqlProxyFlavorGroups.proxyFlavors);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupType, proxyFlavors);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyFlavorGroups {\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    proxyFlavors: ").append(toIndentedString(proxyFlavors)).append("\n");
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

