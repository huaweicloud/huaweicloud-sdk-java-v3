package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 代码导航符号节点信息
 */
public class SymbolNodeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "def")

    private DefEntryDto def;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<SymbolNodeDto> children = null;

    public SymbolNodeDto withDef(DefEntryDto def) {
        this.def = def;
        return this;
    }

    public SymbolNodeDto withDef(Consumer<DefEntryDto> defSetter) {
        if (this.def == null) {
            this.def = new DefEntryDto();
            defSetter.accept(this.def);
        }

        return this;
    }

    /**
     * Get def
     * @return def
     */
    public DefEntryDto getDef() {
        return def;
    }

    public void setDef(DefEntryDto def) {
        this.def = def;
    }

    public SymbolNodeDto withChildren(List<SymbolNodeDto> children) {
        this.children = children;
        return this;
    }

    public SymbolNodeDto addChildrenItem(SymbolNodeDto childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public SymbolNodeDto withChildren(Consumer<List<SymbolNodeDto>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * **参数解释：** 子节点信息
     * @return children
     */
    public List<SymbolNodeDto> getChildren() {
        return children;
    }

    public void setChildren(List<SymbolNodeDto> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SymbolNodeDto that = (SymbolNodeDto) obj;
        return Objects.equals(this.def, that.def) && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(def, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SymbolNodeDto {\n");
        sb.append("    def: ").append(toIndentedString(def)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
