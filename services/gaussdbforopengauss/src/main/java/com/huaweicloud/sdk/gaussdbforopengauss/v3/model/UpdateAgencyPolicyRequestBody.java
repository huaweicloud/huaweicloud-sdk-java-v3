package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAgencyPolicyRequestBody
 */
public class UpdateAgencyPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unbind_role_names")

    private List<String> unbindRoleNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_role_names")

    private List<String> bindRoleNames = null;

    public UpdateAgencyPolicyRequestBody withUnbindRoleNames(List<String> unbindRoleNames) {
        this.unbindRoleNames = unbindRoleNames;
        return this;
    }

    public UpdateAgencyPolicyRequestBody addUnbindRoleNamesItem(String unbindRoleNamesItem) {
        if (this.unbindRoleNames == null) {
            this.unbindRoleNames = new ArrayList<>();
        }
        this.unbindRoleNames.add(unbindRoleNamesItem);
        return this;
    }

    public UpdateAgencyPolicyRequestBody withUnbindRoleNames(Consumer<List<String>> unbindRoleNamesSetter) {
        if (this.unbindRoleNames == null) {
            this.unbindRoleNames = new ArrayList<>();
        }
        unbindRoleNamesSetter.accept(this.unbindRoleNames);
        return this;
    }

    /**
     * **参数解释**: 委托解绑的权限策略集合。 **约束限制**: 不涉及。
     * @return unbindRoleNames
     */
    public List<String> getUnbindRoleNames() {
        return unbindRoleNames;
    }

    public void setUnbindRoleNames(List<String> unbindRoleNames) {
        this.unbindRoleNames = unbindRoleNames;
    }

    public UpdateAgencyPolicyRequestBody withBindRoleNames(List<String> bindRoleNames) {
        this.bindRoleNames = bindRoleNames;
        return this;
    }

    public UpdateAgencyPolicyRequestBody addBindRoleNamesItem(String bindRoleNamesItem) {
        if (this.bindRoleNames == null) {
            this.bindRoleNames = new ArrayList<>();
        }
        this.bindRoleNames.add(bindRoleNamesItem);
        return this;
    }

    public UpdateAgencyPolicyRequestBody withBindRoleNames(Consumer<List<String>> bindRoleNamesSetter) {
        if (this.bindRoleNames == null) {
            this.bindRoleNames = new ArrayList<>();
        }
        bindRoleNamesSetter.accept(this.bindRoleNames);
        return this;
    }

    /**
     * **参数解释**: 委托绑定的权限策略集合。 **约束限制**: 不涉及。
     * @return bindRoleNames
     */
    public List<String> getBindRoleNames() {
        return bindRoleNames;
    }

    public void setBindRoleNames(List<String> bindRoleNames) {
        this.bindRoleNames = bindRoleNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAgencyPolicyRequestBody that = (UpdateAgencyPolicyRequestBody) obj;
        return Objects.equals(this.unbindRoleNames, that.unbindRoleNames)
            && Objects.equals(this.bindRoleNames, that.bindRoleNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unbindRoleNames, bindRoleNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAgencyPolicyRequestBody {\n");
        sb.append("    unbindRoleNames: ").append(toIndentedString(unbindRoleNames)).append("\n");
        sb.append("    bindRoleNames: ").append(toIndentedString(bindRoleNames)).append("\n");
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
