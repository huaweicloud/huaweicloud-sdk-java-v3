package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FlavorRespVersionBody
 */
public class FlavorRespVersionBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<Flavor> flavors = null;

    public FlavorRespVersionBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 版本id。 **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlavorRespVersionBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 版本名称。 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlavorRespVersionBody withFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    public FlavorRespVersionBody addFlavorsItem(Flavor flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public FlavorRespVersionBody withFlavors(Consumer<List<Flavor>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * **参数解释**： 规格信息。 **取值范围**： 不涉及
     * @return flavors
     */
    public List<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorRespVersionBody that = (FlavorRespVersionBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.flavors, that.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, flavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorRespVersionBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
