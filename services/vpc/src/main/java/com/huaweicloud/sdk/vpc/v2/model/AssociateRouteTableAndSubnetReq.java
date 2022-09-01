package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AssociateRouteTableAndSubnetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate")

    @JacksonXmlProperty(localName = "associate")

    private List<String> associate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disassociate")

    @JacksonXmlProperty(localName = "disassociate")

    private List<String> disassociate = null;

    public AssociateRouteTableAndSubnetReq withAssociate(List<String> associate) {
        this.associate = associate;
        return this;
    }

    public AssociateRouteTableAndSubnetReq addAssociateItem(String associateItem) {
        if (this.associate == null) {
            this.associate = new ArrayList<>();
        }
        this.associate.add(associateItem);
        return this;
    }

    public AssociateRouteTableAndSubnetReq withAssociate(Consumer<List<String>> associateSetter) {
        if (this.associate == null) {
            this.associate = new ArrayList<>();
        }
        associateSetter.accept(this.associate);
        return this;
    }

    /**
     * 路由表关联子网ID列表 
     * @return associate
     */
    public List<String> getAssociate() {
        return associate;
    }

    public void setAssociate(List<String> associate) {
        this.associate = associate;
    }

    public AssociateRouteTableAndSubnetReq withDisassociate(List<String> disassociate) {
        this.disassociate = disassociate;
        return this;
    }

    public AssociateRouteTableAndSubnetReq addDisassociateItem(String disassociateItem) {
        if (this.disassociate == null) {
            this.disassociate = new ArrayList<>();
        }
        this.disassociate.add(disassociateItem);
        return this;
    }

    public AssociateRouteTableAndSubnetReq withDisassociate(Consumer<List<String>> disassociateSetter) {
        if (this.disassociate == null) {
            this.disassociate = new ArrayList<>();
        }
        disassociateSetter.accept(this.disassociate);
        return this;
    }

    /**
     * 路由表解除关联子网ID列表
     * @return disassociate
     */
    public List<String> getDisassociate() {
        return disassociate;
    }

    public void setDisassociate(List<String> disassociate) {
        this.disassociate = disassociate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateRouteTableAndSubnetReq associateRouteTableAndSubnetReq = (AssociateRouteTableAndSubnetReq) o;
        return Objects.equals(this.associate, associateRouteTableAndSubnetReq.associate)
            && Objects.equals(this.disassociate, associateRouteTableAndSubnetReq.disassociate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associate, disassociate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateRouteTableAndSubnetReq {\n");
        sb.append("    associate: ").append(toIndentedString(associate)).append("\n");
        sb.append("    disassociate: ").append(toIndentedString(disassociate)).append("\n");
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
