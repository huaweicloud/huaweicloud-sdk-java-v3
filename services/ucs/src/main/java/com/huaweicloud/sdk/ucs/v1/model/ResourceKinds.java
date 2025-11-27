package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceKinds
 */
public class ResourceKinds {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiGroups")

    private List<String> apiGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kinds")

    private List<String> kinds = null;

    public ResourceKinds withApiGroups(List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public ResourceKinds addApiGroupsItem(String apiGroupsItem) {
        if (this.apiGroups == null) {
            this.apiGroups = new ArrayList<>();
        }
        this.apiGroups.add(apiGroupsItem);
        return this;
    }

    public ResourceKinds withApiGroups(Consumer<List<String>> apiGroupsSetter) {
        if (this.apiGroups == null) {
            this.apiGroups = new ArrayList<>();
        }
        apiGroupsSetter.accept(this.apiGroups);
        return this;
    }

    /**
     * 资源所属的API组
     * @return apiGroups
     */
    public List<String> getApiGroups() {
        return apiGroups;
    }

    public void setApiGroups(List<String> apiGroups) {
        this.apiGroups = apiGroups;
    }

    public ResourceKinds withKinds(List<String> kinds) {
        this.kinds = kinds;
        return this;
    }

    public ResourceKinds addKindsItem(String kindsItem) {
        if (this.kinds == null) {
            this.kinds = new ArrayList<>();
        }
        this.kinds.add(kindsItem);
        return this;
    }

    public ResourceKinds withKinds(Consumer<List<String>> kindsSetter) {
        if (this.kinds == null) {
            this.kinds = new ArrayList<>();
        }
        kindsSetter.accept(this.kinds);
        return this;
    }

    /**
     * 资源类型
     * @return kinds
     */
    public List<String> getKinds() {
        return kinds;
    }

    public void setKinds(List<String> kinds) {
        this.kinds = kinds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceKinds that = (ResourceKinds) obj;
        return Objects.equals(this.apiGroups, that.apiGroups) && Objects.equals(this.kinds, that.kinds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiGroups, kinds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceKinds {\n");
        sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
        sb.append("    kinds: ").append(toIndentedString(kinds)).append("\n");
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
