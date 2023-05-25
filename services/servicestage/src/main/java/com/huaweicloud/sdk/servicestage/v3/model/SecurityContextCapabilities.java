package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityContextCapabilities
 */
public class SecurityContextCapabilities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add")

    private List<String> add = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drop")

    private List<String> drop = null;

    public SecurityContextCapabilities withAdd(List<String> add) {
        this.add = add;
        return this;
    }

    public SecurityContextCapabilities addAddItem(String addItem) {
        if (this.add == null) {
            this.add = new ArrayList<>();
        }
        this.add.add(addItem);
        return this;
    }

    public SecurityContextCapabilities withAdd(Consumer<List<String>> addSetter) {
        if (this.add == null) {
            this.add = new ArrayList<>();
        }
        addSetter.accept(this.add);
        return this;
    }

    /**
     * Get add
     * @return add
     */
    public List<String> getAdd() {
        return add;
    }

    public void setAdd(List<String> add) {
        this.add = add;
    }

    public SecurityContextCapabilities withDrop(List<String> drop) {
        this.drop = drop;
        return this;
    }

    public SecurityContextCapabilities addDropItem(String dropItem) {
        if (this.drop == null) {
            this.drop = new ArrayList<>();
        }
        this.drop.add(dropItem);
        return this;
    }

    public SecurityContextCapabilities withDrop(Consumer<List<String>> dropSetter) {
        if (this.drop == null) {
            this.drop = new ArrayList<>();
        }
        dropSetter.accept(this.drop);
        return this;
    }

    /**
     * Get drop
     * @return drop
     */
    public List<String> getDrop() {
        return drop;
    }

    public void setDrop(List<String> drop) {
        this.drop = drop;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityContextCapabilities securityContextCapabilities = (SecurityContextCapabilities) o;
        return Objects.equals(this.add, securityContextCapabilities.add)
            && Objects.equals(this.drop, securityContextCapabilities.drop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(add, drop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityContextCapabilities {\n");
        sb.append("    add: ").append(toIndentedString(add)).append("\n");
        sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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
