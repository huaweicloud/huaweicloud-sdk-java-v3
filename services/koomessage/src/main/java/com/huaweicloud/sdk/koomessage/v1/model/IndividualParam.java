package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 个性化动态参数。
 */
public class IndividualParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobiles")

    private List<String> mobiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dync_params")

    private List<IndividualContentParam> dyncParams = null;

    public IndividualParam withMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
        return this;
    }

    public IndividualParam addMobilesItem(String mobilesItem) {
        if (this.mobiles == null) {
            this.mobiles = new ArrayList<>();
        }
        this.mobiles.add(mobilesItem);
        return this;
    }

    public IndividualParam withMobiles(Consumer<List<String>> mobilesSetter) {
        if (this.mobiles == null) {
            this.mobiles = new ArrayList<>();
        }
        mobilesSetter.accept(this.mobiles);
        return this;
    }

    /**
     * 个性化动态参数号码列表，最多支持5000个号码。  > 长度指的是单个号码的长度。 
     * @return mobiles
     */
    public List<String> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
    }

    public IndividualParam withDyncParams(List<IndividualContentParam> dyncParams) {
        this.dyncParams = dyncParams;
        return this;
    }

    public IndividualParam addDyncParamsItem(IndividualContentParam dyncParamsItem) {
        if (this.dyncParams == null) {
            this.dyncParams = new ArrayList<>();
        }
        this.dyncParams.add(dyncParamsItem);
        return this;
    }

    public IndividualParam withDyncParams(Consumer<List<IndividualContentParam>> dyncParamsSetter) {
        if (this.dyncParams == null) {
            this.dyncParams = new ArrayList<>();
        }
        dyncParamsSetter.accept(this.dyncParams);
        return this;
    }

    /**
     * 个性化动态参数数组。 参数顺序按照模板创建时参数占位符的顺序传入，例如创建模板时设置动参有#p_1#、#p_2#、#p_3#，则传入的参数数组顺序第一个元素为#p_1#，第二个元素是#p_2#，第三个元素为#p_3#。 
     * @return dyncParams
     */
    public List<IndividualContentParam> getDyncParams() {
        return dyncParams;
    }

    public void setDyncParams(List<IndividualContentParam> dyncParams) {
        this.dyncParams = dyncParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndividualParam individualParam = (IndividualParam) o;
        return Objects.equals(this.mobiles, individualParam.mobiles)
            && Objects.equals(this.dyncParams, individualParam.dyncParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobiles, dyncParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndividualParam {\n");
        sb.append("    mobiles: ").append(toIndentedString(mobiles)).append("\n");
        sb.append("    dyncParams: ").append(toIndentedString(dyncParams)).append("\n");
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
