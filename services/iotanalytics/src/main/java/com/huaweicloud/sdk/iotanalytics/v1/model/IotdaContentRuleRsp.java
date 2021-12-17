package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 在IoTDA实例中要配置转发规则推送数据的资源空间和产品列表 */
public class IotdaContentRuleRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products")

    private List<String> products = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_actions")

    private List<IotdaRuleAction> ruleActions = null;

    public IotdaContentRuleRsp withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** IoTDA中的资源空间Id
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public IotdaContentRuleRsp withProducts(List<String> products) {
        this.products = products;
        return this;
    }

    public IotdaContentRuleRsp addProductsItem(String productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public IotdaContentRuleRsp withProducts(Consumer<List<String>> productsSetter) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        productsSetter.accept(this.products);
        return this;
    }

    /** IoTDA中某资源空间Id下的产品列表
     * 
     * @return products */
    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public IotdaContentRuleRsp withRuleActions(List<IotdaRuleAction> ruleActions) {
        this.ruleActions = ruleActions;
        return this;
    }

    public IotdaContentRuleRsp addRuleActionsItem(IotdaRuleAction ruleActionsItem) {
        if (this.ruleActions == null) {
            this.ruleActions = new ArrayList<>();
        }
        this.ruleActions.add(ruleActionsItem);
        return this;
    }

    public IotdaContentRuleRsp withRuleActions(Consumer<List<IotdaRuleAction>> ruleActionsSetter) {
        if (this.ruleActions == null) {
            this.ruleActions = new ArrayList<>();
        }
        ruleActionsSetter.accept(this.ruleActions);
        return this;
    }

    /** IoTDA中rule_id和action_id列表
     * 
     * @return ruleActions */
    public List<IotdaRuleAction> getRuleActions() {
        return ruleActions;
    }

    public void setRuleActions(List<IotdaRuleAction> ruleActions) {
        this.ruleActions = ruleActions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IotdaContentRuleRsp iotdaContentRuleRsp = (IotdaContentRuleRsp) o;
        return Objects.equals(this.appId, iotdaContentRuleRsp.appId)
            && Objects.equals(this.products, iotdaContentRuleRsp.products)
            && Objects.equals(this.ruleActions, iotdaContentRuleRsp.ruleActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, products, ruleActions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IotdaContentRuleRsp {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
        sb.append("    ruleActions: ").append(toIndentedString(ruleActions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
