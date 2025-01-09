package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包周期资源对象。
 */
public class Resource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_volumes")

    private AddVolumes addVolumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_console_url")

    private String cloudServiceConsoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_services")

    private CreateServices createServices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    public Resource withAddVolumes(AddVolumes addVolumes) {
        this.addVolumes = addVolumes;
        return this;
    }

    public Resource withAddVolumes(Consumer<AddVolumes> addVolumesSetter) {
        if (this.addVolumes == null) {
            this.addVolumes = new AddVolumes();
            addVolumesSetter.accept(this.addVolumes);
        }

        return this;
    }

    /**
     * Get addVolumes
     * @return addVolumes
     */
    public AddVolumes getAddVolumes() {
        return addVolumes;
    }

    public void setAddVolumes(AddVolumes addVolumes) {
        this.addVolumes = addVolumes;
    }

    public Resource withCloudServiceConsoleUrl(String cloudServiceConsoleUrl) {
        this.cloudServiceConsoleUrl = cloudServiceConsoleUrl;
        return this;
    }

    /**
     * 支付后跳转的地址。
     * @return cloudServiceConsoleUrl
     */
    public String getCloudServiceConsoleUrl() {
        return cloudServiceConsoleUrl;
    }

    public void setCloudServiceConsoleUrl(String cloudServiceConsoleUrl) {
        this.cloudServiceConsoleUrl = cloudServiceConsoleUrl;
    }

    public Resource withCreateServices(CreateServices createServices) {
        this.createServices = createServices;
        return this;
    }

    public Resource withCreateServices(Consumer<CreateServices> createServicesSetter) {
        if (this.createServices == null) {
            this.createServices = new CreateServices();
            createServicesSetter.accept(this.createServices);
        }

        return this;
    }

    /**
     * Get createServices
     * @return createServices
     */
    public CreateServices getCreateServices() {
        return createServices;
    }

    public void setCreateServices(CreateServices createServices) {
        this.createServices = createServices;
    }

    public Resource withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 订购关系当前是否是自动续费：0 否 1 是。
     * minimum: 0
     * maximum: 1
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public Resource withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数取值大于0
     * minimum: 1
     * maximum: 2147483647
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public Resource withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 包周期订单订购周期类型：2：月；3：年；4：包小时（仅限带宽加油包购买场景使用）5：绝对时间；（追加附属资源场景使用，比如主机上追加云硬盘）6：一次性（chargingMode=1 一次性计费场景使用），必填。
     * minimum: 0
     * maximum: 6
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public Resource withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    /**
     * 订购数量。
     * minimum: 1
     * maximum: 100
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resource that = (Resource) obj;
        return Objects.equals(this.addVolumes, that.addVolumes)
            && Objects.equals(this.cloudServiceConsoleUrl, that.cloudServiceConsoleUrl)
            && Objects.equals(this.createServices, that.createServices)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.subscriptionNum, that.subscriptionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addVolumes,
            cloudServiceConsoleUrl,
            createServices,
            isAutoRenew,
            periodNum,
            periodType,
            subscriptionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
        sb.append("    addVolumes: ").append(toIndentedString(addVolumes)).append("\n");
        sb.append("    cloudServiceConsoleUrl: ").append(toIndentedString(cloudServiceConsoleUrl)).append("\n");
        sb.append("    createServices: ").append(toIndentedString(createServices)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
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
