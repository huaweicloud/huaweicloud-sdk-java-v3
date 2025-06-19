package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入IP黑名单的消息body体，包括了导入的方式、生效范围和IP黑名单信息。
 */
public class IpBlacklistImportDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_type")

    private Integer addType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_blacklist")

    private String ipBlacklist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_scope")

    private List<Integer> effectScope = null;

    public IpBlacklistImportDto withAddType(Integer addType) {
        this.addType = addType;
        return this;
    }

    /**
     * IP黑名单导入的方式，0表示增量导入，在原来的基础上追加；1表示全量导入，新导入的IP黑名单会覆盖已有的IP黑名单
     * @return addType
     */
    public Integer getAddType() {
        return addType;
    }

    public void setAddType(Integer addType) {
        this.addType = addType;
    }

    public IpBlacklistImportDto withIpBlacklist(String ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }

    /**
     * IP列表，当前支持不同的IP地址之间使用“,” 、“ ”、“;”、“\\r\\n”、“\\n”、“\\t”等分割符进行分割。
     * @return ipBlacklist
     */
    public String getIpBlacklist() {
        return ipBlacklist;
    }

    public void setIpBlacklist(String ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
    }

    public IpBlacklistImportDto withEffectScope(List<Integer> effectScope) {
        this.effectScope = effectScope;
        return this;
    }

    public IpBlacklistImportDto addEffectScopeItem(Integer effectScopeItem) {
        if (this.effectScope == null) {
            this.effectScope = new ArrayList<>();
        }
        this.effectScope.add(effectScopeItem);
        return this;
    }

    public IpBlacklistImportDto withEffectScope(Consumer<List<Integer>> effectScopeSetter) {
        if (this.effectScope == null) {
            this.effectScope = new ArrayList<>();
        }
        effectScopeSetter.accept(this.effectScope);
        return this;
    }

    /**
     * 生效范围，1表示生效范围为eip, 2表示生效范围为nat, [1 2]表示 生效范围为eip和nat
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
        IpBlacklistImportDto that = (IpBlacklistImportDto) obj;
        return Objects.equals(this.addType, that.addType) && Objects.equals(this.ipBlacklist, that.ipBlacklist)
            && Objects.equals(this.effectScope, that.effectScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addType, ipBlacklist, effectScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpBlacklistImportDto {\n");
        sb.append("    addType: ").append(toIndentedString(addType)).append("\n");
        sb.append("    ipBlacklist: ").append(toIndentedString(ipBlacklist)).append("\n");
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
