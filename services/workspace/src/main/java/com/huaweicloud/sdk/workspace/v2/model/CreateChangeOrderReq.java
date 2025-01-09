package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建变更订单请求体
 */
public class CreateChangeOrderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_subscribe")

    private Boolean isSubscribe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_product_id")

    private String resizeProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_volume_id")

    private String expandVolumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_new_size")

    private Integer expandNewSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_quantity")

    private Integer newQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_lites_product_id")

    private String exclusiveLitesProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_console_url")

    private String cloudServiceConsoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private OrderExtendParam extendParam;

    public CreateChangeOrderReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型 resizeDesktops(变更规格)、expandVolumes(扩容磁盘)[、meteredToPeriod(按需转保周期)](tag:inner)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateChangeOrderReq withIsSubscribe(Boolean isSubscribe) {
        this.isSubscribe = isSubscribe;
        return this;
    }

    /**
     * 是否订购 *  仅type 为 meteredToPeriod 按需转包时生效； *  默认值为false，不下单，只生成订单号，跳转cbc页面选择时长进行下单； *  若为true 则需要传period_type和period_num参数确定包周期类型和时长；
     * @return isSubscribe
     */
    public Boolean getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(Boolean isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public CreateChangeOrderReq withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 周期类型，2：包月；3：包年[ type为 meteredToPeriod 并且 is_subscribe == true 时不能为空](tag:inner)
     * minimum: 0
     * maximum: 255
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public CreateChangeOrderReq withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 周期数[ type为 meteredToPeriod 并且 is_subscribe == true 时不能为空](tag:inner)
     * minimum: 0
     * maximum: 2147483647
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public CreateChangeOrderReq withResizeProductId(String resizeProductId) {
        this.resizeProductId = resizeProductId;
        return this;
    }

    /**
     * 变更后规格产品ID，当是resizeDesktops，必传
     * @return resizeProductId
     */
    public String getResizeProductId() {
        return resizeProductId;
    }

    public void setResizeProductId(String resizeProductId) {
        this.resizeProductId = resizeProductId;
    }

    public CreateChangeOrderReq withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 变更后规格产品flavorID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public CreateChangeOrderReq withExpandVolumeId(String expandVolumeId) {
        this.expandVolumeId = expandVolumeId;
        return this;
    }

    /**
     * 扩容的云硬盘的ID，当是expandVolumes，必传
     * @return expandVolumeId
     */
    public String getExpandVolumeId() {
        return expandVolumeId;
    }

    public void setExpandVolumeId(String expandVolumeId) {
        this.expandVolumeId = expandVolumeId;
    }

    public CreateChangeOrderReq withExpandNewSize(Integer expandNewSize) {
        this.expandNewSize = expandNewSize;
        return this;
    }

    /**
     * 扩容后云硬盘的总大小，当是expandVolumes，必传。范围10-32760，大小为10的倍数。
     * minimum: 10
     * maximum: 32760
     * @return expandNewSize
     */
    public Integer getExpandNewSize() {
        return expandNewSize;
    }

    public void setExpandNewSize(Integer expandNewSize) {
        this.expandNewSize = expandNewSize;
    }

    public CreateChangeOrderReq withNewQuantity(Integer newQuantity) {
        this.newQuantity = newQuantity;
        return this;
    }

    /**
     * 专享主机变更桌面数后桌面路数的总大小，当是jobType是resizeExclusiveLites，必传。
     * minimum: 0
     * maximum: 300
     * @return newQuantity
     */
    public Integer getNewQuantity() {
        return newQuantity;
    }

    public void setNewQuantity(Integer newQuantity) {
        this.newQuantity = newQuantity;
    }

    public CreateChangeOrderReq withExclusiveLitesProductId(String exclusiveLitesProductId) {
        this.exclusiveLitesProductId = exclusiveLitesProductId;
        return this;
    }

    /**
     * 专享主机桌面数的productId，当是resizeExclusiveLites，必传。
     * @return exclusiveLitesProductId
     */
    public String getExclusiveLitesProductId() {
        return exclusiveLitesProductId;
    }

    public void setExclusiveLitesProductId(String exclusiveLitesProductId) {
        this.exclusiveLitesProductId = exclusiveLitesProductId;
    }

    public CreateChangeOrderReq withCloudServiceConsoleUrl(String cloudServiceConsoleUrl) {
        this.cloudServiceConsoleUrl = cloudServiceConsoleUrl;
        return this;
    }

    /**
     * 支付后跳转url
     * @return cloudServiceConsoleUrl
     */
    public String getCloudServiceConsoleUrl() {
        return cloudServiceConsoleUrl;
    }

    public void setCloudServiceConsoleUrl(String cloudServiceConsoleUrl) {
        this.cloudServiceConsoleUrl = cloudServiceConsoleUrl;
    }

    public CreateChangeOrderReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateChangeOrderReq withExtendParam(OrderExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreateChangeOrderReq withExtendParam(Consumer<OrderExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new OrderExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public OrderExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(OrderExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateChangeOrderReq that = (CreateChangeOrderReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.isSubscribe, that.isSubscribe)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.resizeProductId, that.resizeProductId)
            && Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.expandVolumeId, that.expandVolumeId)
            && Objects.equals(this.expandNewSize, that.expandNewSize)
            && Objects.equals(this.newQuantity, that.newQuantity)
            && Objects.equals(this.exclusiveLitesProductId, that.exclusiveLitesProductId)
            && Objects.equals(this.cloudServiceConsoleUrl, that.cloudServiceConsoleUrl)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            isSubscribe,
            periodType,
            periodNum,
            resizeProductId,
            flavorId,
            expandVolumeId,
            expandNewSize,
            newQuantity,
            exclusiveLitesProductId,
            cloudServiceConsoleUrl,
            enterpriseProjectId,
            extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChangeOrderReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isSubscribe: ").append(toIndentedString(isSubscribe)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    resizeProductId: ").append(toIndentedString(resizeProductId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    expandVolumeId: ").append(toIndentedString(expandVolumeId)).append("\n");
        sb.append("    expandNewSize: ").append(toIndentedString(expandNewSize)).append("\n");
        sb.append("    newQuantity: ").append(toIndentedString(newQuantity)).append("\n");
        sb.append("    exclusiveLitesProductId: ").append(toIndentedString(exclusiveLitesProductId)).append("\n");
        sb.append("    cloudServiceConsoleUrl: ").append(toIndentedString(cloudServiceConsoleUrl)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
