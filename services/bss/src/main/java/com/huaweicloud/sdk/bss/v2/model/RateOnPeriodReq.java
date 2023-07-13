package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RateOnPeriodReq
 */
public class RateOnPeriodReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_infos")

    private List<PeriodProductInfo> productInfos = null;

    public RateOnPeriodReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。  说明： 获取方法： 步骤1：调用IAM获取委托Token接口，获取客户Token。步骤2：参见如何将合作伙伴Token置换为客户Token的步骤2，获取项目ID。IAM子用户调用此接口，需要IAM主账号授权，具体请参考创建用户组并授权。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RateOnPeriodReq withProductInfos(List<PeriodProductInfo> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    public RateOnPeriodReq addProductInfosItem(PeriodProductInfo productInfosItem) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        this.productInfos.add(productInfosItem);
        return this;
    }

    public RateOnPeriodReq withProductInfos(Consumer<List<PeriodProductInfo>> productInfosSetter) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * 产品信息列表，询价时要询价产品的信息的列表，具体参见表1。
     * @return productInfos
     */
    public List<PeriodProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<PeriodProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RateOnPeriodReq that = (RateOnPeriodReq) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.productInfos, that.productInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, productInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateOnPeriodReq {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
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
