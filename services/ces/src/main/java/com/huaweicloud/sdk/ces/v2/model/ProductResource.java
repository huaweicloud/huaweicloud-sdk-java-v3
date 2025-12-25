package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProductResource
 */
public class ProductResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_instances")

    private List<ProductInstance> productInstances = null;

    public ProductResource withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * **参数解释** 资源所属的云产品名称，一般由\"服务命名空间,服务首层维度名称\"组成，如\"SYS.ECS,instance_id\" **约束限制** 不涉及 **取值范围** 长度[0,128]个字符 **默认取值** 不涉及 
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductResource withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释** 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)” **约束限制** 不涉及 **取值范围** 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间。 **默认取值** 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ProductResource withProductInstances(List<ProductInstance> productInstances) {
        this.productInstances = productInstances;
        return this;
    }

    public ProductResource addProductInstancesItem(ProductInstance productInstancesItem) {
        if (this.productInstances == null) {
            this.productInstances = new ArrayList<>();
        }
        this.productInstances.add(productInstancesItem);
        return this;
    }

    public ProductResource withProductInstances(Consumer<List<ProductInstance>> productInstancesSetter) {
        if (this.productInstances == null) {
            this.productInstances = new ArrayList<>();
        }
        productInstancesSetter.accept(this.productInstances);
        return this;
    }

    /**
     * **参数解释** 产品实例详情 **约束限制** 不涉及 **取值范围** 不超过1000个实例 
     * @return productInstances
     */
    public List<ProductInstance> getProductInstances() {
        return productInstances;
    }

    public void setProductInstances(List<ProductInstance> productInstances) {
        this.productInstances = productInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductResource that = (ProductResource) obj;
        return Objects.equals(this.productName, that.productName) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.productInstances, that.productInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, namespace, productInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductResource {\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    productInstances: ").append(toIndentedString(productInstances)).append("\n");
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
