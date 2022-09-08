package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点网卡的描述信息。 
 */
public class NodeNicSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primaryNic")

    private NicSpec primaryNic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extNics")

    private List<NicSpec> extNics = null;

    public NodeNicSpec withPrimaryNic(NicSpec primaryNic) {
        this.primaryNic = primaryNic;
        return this;
    }

    public NodeNicSpec withPrimaryNic(Consumer<NicSpec> primaryNicSetter) {
        if (this.primaryNic == null) {
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

    public NodeNicSpec withExtNics(List<NicSpec> extNics) {
        this.extNics = extNics;
        return this;
    }

    public NodeNicSpec addExtNicsItem(NicSpec extNicsItem) {
        if (this.extNics == null) {
            this.extNics = new ArrayList<>();
        }
        this.extNics.add(extNicsItem);
        return this;
    }

    public NodeNicSpec withExtNics(Consumer<List<NicSpec>> extNicsSetter) {
        if (this.extNics == null) {
            this.extNics = new ArrayList<>();
        }
        extNicsSetter.accept(this.extNics);
        return this;
    }

    /**
     * 扩展网卡 >创建节点池添加节点时不支持该参数。
     * @return extNics
     */
    public List<NicSpec> getExtNics() {
        return extNics;
    }

    public void setExtNics(List<NicSpec> extNics) {
        this.extNics = extNics;
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
        return Objects.equals(this.primaryNic, nodeNicSpec.primaryNic)
            && Objects.equals(this.extNics, nodeNicSpec.extNics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryNic, extNics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeNicSpec {\n");
        sb.append("    primaryNic: ").append(toIndentedString(primaryNic)).append("\n");
        sb.append("    extNics: ").append(toIndentedString(extNics)).append("\n");
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
