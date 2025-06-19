package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包含删除IP黑名单的参数，目前只会指定生效范围进行删除。
 */
public class IpBlacklistDeleteDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_scope")

    private List<Integer> effectScope = null;

    public IpBlacklistDeleteDto withEffectScope(List<Integer> effectScope) {
        this.effectScope = effectScope;
        return this;
    }

    public IpBlacklistDeleteDto addEffectScopeItem(Integer effectScopeItem) {
        if (this.effectScope == null) {
            this.effectScope = new ArrayList<>();
        }
        this.effectScope.add(effectScopeItem);
        return this;
    }

    public IpBlacklistDeleteDto withEffectScope(Consumer<List<Integer>> effectScopeSetter) {
        if (this.effectScope == null) {
            this.effectScope = new ArrayList<>();
        }
        effectScopeSetter.accept(this.effectScope);
        return this;
    }

    /**
     * 指定生效范围，1指定生效范围为EIP进行删除,2指定生效范围为NAT进行删除，1,2生效范围为EIP和NAT进行删除
     * @return effectScope
     */
    public List<Integer> getEffectScope() {
        return effectScope;
    }

    public void setEffectScope(List<Integer> effectScope) {
        this.effectScope = effectScope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpBlacklistDeleteDto that = (IpBlacklistDeleteDto) obj;
        return Objects.equals(this.effectScope, that.effectScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effectScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpBlacklistDeleteDto {\n");
        sb.append("    effectScope: ").append(toIndentedString(effectScope)).append("\n");
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
