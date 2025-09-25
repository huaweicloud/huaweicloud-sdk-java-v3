package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 独享引擎操作
 */
public class UpdatePremiumInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<String> params = null;

    public UpdatePremiumInstanceRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 独享引擎操作名称，目前支持 upgrade（升级） ，rollback（升级后回滚），security_groups（切换安全组） **取值范围：** 不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UpdatePremiumInstanceRequestBody withParams(List<String> params) {
        this.params = params;
        return this;
    }

    public UpdatePremiumInstanceRequestBody addParamsItem(String paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public UpdatePremiumInstanceRequestBody withParams(Consumer<List<String>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：**  具体的请求参数，操作为upgrade（升级） ，rollback（升级后回滚）时无需填写，操作位 security_groups（切换安全组）时，参数为安全组的ip数组 **取值范围：** 不涉及
     * @return params
     */
    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePremiumInstanceRequestBody that = (UpdatePremiumInstanceRequestBody) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePremiumInstanceRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
